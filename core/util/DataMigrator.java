package core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataMigrator //read datas from file (zombie.md)
{
    public static void runMigration(String inputMdPath, String outputJsonPath)
    {

    }

    private static int extractInt(Pattern pattern, String text)
    {
        Matcher matcher = pattern.matcher(text);
        return Integer.parseInt(matcher.group(1));
    }

    private static double extractDouble(Pattern pattern, String text)
    {
        Matcher matcher = pattern.matcher(text);
        return Double.parseDouble(matcher.group(1));
    }
}
