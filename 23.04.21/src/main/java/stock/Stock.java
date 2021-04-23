package stock;

import java.util.concurrent.atomic.AtomicInteger;

public class Stock {

    private static final Object monitor = new Object();
    private AtomicInteger dollarCount = new AtomicInteger(1000);
    private AtomicInteger euroCount = new AtomicInteger(1000);
    private AtomicInteger roubleCount = new AtomicInteger(1000);

    public AtomicInteger getDollarCount() {
        return dollarCount;
    }

    public void setDollarCount(AtomicInteger dollarCount) {
        synchronized (monitor) {
            this.dollarCount = dollarCount;
        }
    }

    public AtomicInteger getEuroCount() {
        return euroCount;
    }

    public void setEuroCount(AtomicInteger euroCount) {
        synchronized (monitor) {
            this.euroCount = euroCount;
        }
    }

    public AtomicInteger getRoubleCount() {
        return roubleCount;
    }

    public void setRoubleCount(AtomicInteger roubleCount) {
        synchronized (monitor) {
            this.roubleCount = roubleCount;
        }
    }

    public void exchangeED(int amount) {
        euroCount.addAndGet(amount);
        while (true) {
            int currentDollarCount = dollarCount.get();
            int newDollarCount = currentDollarCount - amount;
            if(dollarCount.compareAndSet(currentDollarCount, newDollarCount)) {
                break;
            }
        }
    }

    public void exchangeRD(int amount) {
        roubleCount.addAndGet(amount);
        while (true) {
            int currentDollarCount = dollarCount.get();
            int newDollarCount = currentDollarCount - amount;
            if(dollarCount.compareAndSet(currentDollarCount, newDollarCount)) {
                break;
            }
        }
    }

    public void exchangeRE(int amount) {
        roubleCount.addAndGet(amount);
        while (true) {
            int currentEuroCount = euroCount.get();
            int newEuroCount = currentEuroCount - amount;
            if(euroCount.compareAndSet(currentEuroCount, newEuroCount)) {
                break;
            }
        }
    }
}
