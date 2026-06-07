package core.model.game.entity.zombie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZombieDatabase
{

    private final Map<String, ZombieStats> storage;

    public ZombieDatabase()
    {
        this.storage = new HashMap<>();
    }

    public void initialize(String filePath) throws IOException
    {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        loadFromFile(content);
    }

    private void loadFromFile(String content)
    {
        Pattern objectPattern = Pattern.compile("\\{([^}]+)\\}");
        Matcher objMatcher = objectPattern.matcher(content);

        while (objMatcher.find())
        {
            String objStr = objMatcher.group(1);

            String alias = extractString(objStr, "\"alias\":\"([^\"]+)\"");
            int health = extractInt(objStr, "\"health\":(\\d+)");
            double speed = extractDouble(objStr, "\"speed\":([\\d.]+)");
            int damage = extractInt(objStr, "\"damage\":(\\d+)");
            int cost = extractInt(objStr, "\"cost\":(-?\\d+)");
            int wavePointCost = extractInt(objStr, "\"wavePointCost\":(-?\\d+)");

            ZombieStats stats = new ZombieStats(alias, health, speed, damage);

            storage.put(alias, stats);
        }
    }

    private String extractString(String text, String regex)
    {
        Matcher matcher = Pattern.compile(regex).matcher(text);
        return matcher.find() ? matcher.group(1) : "";
    }

    private int extractInt(String text, String regex)
    {
        Matcher matcher = Pattern.compile(regex).matcher(text);
        return matcher.find() ? Integer.parseInt(matcher.group(1)) : -1;
    }

    private double extractDouble(String text, String regex)
    {
        Matcher matcher = Pattern.compile(regex).matcher(text);
        return matcher.find() ? Double.parseDouble(matcher.group(1)) : 0.0;
    }

    public ZombieStats getStats(String alias)
    {
        return storage.get(alias);
    }
}
