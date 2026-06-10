package core.model.game.news;

import java.util.ArrayList;

public class NewsRepository
{
    final ArrayList<News> news = new ArrayList<>();

    public ArrayList<News> getNews()
    {
        return news;
    }
}
