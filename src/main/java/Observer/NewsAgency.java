package Observer;

import java.util.ArrayList;
import java.util.List;


// Concrete Subject

// Concrete Subject
class NewsAgency implements Subject {
    private ArrayList<Observer> observerlist;
    private String news;

    public NewsAgency() {
        observerlist = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer)
    {
        observerlist.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        observerlist.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
            for (Observer observer :  observerlist)
            {
                observer.update(news);
            }
    }
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}







