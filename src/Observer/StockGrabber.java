package Observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    

    public StockGrabber() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        
        this.observers.add(newObserver);
        
    }

    @Override
    public void unRegister(Observer deleteObserver) {
        
        int observerIndex = this.observers.indexOf(deleteObserver);

        System.out.println("Obsever "+ (observerIndex+1) + " deleted");
        
        this.observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        
        for (Observer observer : observers) {
            observer.update(ibmPrice, applPrice, googPrice);
        }
        
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }

   
    
}
