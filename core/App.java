package core;

import core.view.Menu;

public class App
{
    private static Menu currentMenu;

    public static void setCurrentMenu(Menu currentMenu)
    {
        App.currentMenu = currentMenu;
    }

    public static Menu getCurrentMenu()
    {
        return currentMenu;
    }
}
