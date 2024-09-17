package Observer;


import java.util.ArrayList;
import java.util.List;

// Subject interface
public  interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}


// Concrete Observer

