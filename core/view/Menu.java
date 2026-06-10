package core.view;

import core.App;

import java.util.*;

public abstract class Menu
{
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Menu> menus = new HashMap<>();

    private final List<Menu> allowedTransitions;

    public Menu(Menu... allowedMenus)
    {
        this.allowedTransitions = Arrays.asList(allowedMenus);
    }

    public void check()
    {
        String input = scanner.nextLine().trim();

        if (input.startsWith("menu enter "))
        {
            String menuName = input.substring(11).trim();
            Menu nextMenu = menus.get(menuName);
            if (nextMenu == null)
                System.out.println("Menu not found!");
            else if (!nextMenu.allowedTransitions.contains(this))
                System.out.println("You can't translate to this menu right now!");
            else
                App.setCurrentMenu(nextMenu);
        }
        else
        {
            checkExclusiveCommands(input);
        }
    }

    public static void registerMenu(String name, Menu menu)
    {
        menus.put(name, menu);
    }

    protected abstract void checkExclusiveCommands(String command);
}
