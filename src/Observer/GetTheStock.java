package Observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int startTime, String stock, double price) {
        this.stockGrabber = stockGrabber;
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(this.startTime * 2000);
            } catch (InterruptedException e) {}

            double randNum = (Math.random() * .06) - .03;
            DecimalFormat df = new DecimalFormat("#.##");

            this.price = Double.parseDouble(df.format(this.price + randNum));

            if(stock.equalsIgnoreCase("IBM")){
                ((StockGrabber) this.stockGrabber).setIbmPrice(this.price); 
            }else if(stock.equalsIgnoreCase("IBM")) {
                ((StockGrabber) this.stockGrabber).setApplPrice(this.price); 
            }else if(stock.equalsIgnoreCase("GOOG")){
                ((StockGrabber) this.stockGrabber).setGoogPrice(this.price);
            }

            System.out.println(stock + ": " + df.format(price+randNum) +
                               " " + df.format(randNum));
        }
        
    }

}
