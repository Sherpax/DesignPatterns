package Observer.test;

import Observer.GetTheStock;
import Observer.StockGrabber;
import Observer.StockObserver;

public class TestGrabStocks {
    
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplPrice(677.60);
        stockGrabber.setGoogPrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(57.00);
        stockGrabber.setApplPrice(89.60);
        stockGrabber.setGoogPrice(421.40);

        stockGrabber.unRegister(observer1);

        stockGrabber.setIbmPrice(9999.00);
        stockGrabber.setApplPrice(888.60);
        stockGrabber.setGoogPrice(6776.40);

        Thread getIBM = new Thread(new GetTheStock(stockGrabber, 2, "IBM", 197.00));
        // Thread getAPPL = new Thread(new GetTheStock(stockGrabber, 2, "AAPL", 25.00));
        // Thread getGOOG = new Thread(new GetTheStock(stockGrabber, 2, "GOOG", 32.00));

        getIBM.start();
        // getAPPL.start();
        // getGOOG.start();
    }
}
