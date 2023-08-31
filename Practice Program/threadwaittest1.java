
class mytestwait extends Thread {
    int total = 0;

    public void run() throws IllegalMonitorStateException {
        synchronized(this){
        for (int j = 1; j <= 100; j++) {
            total = total + j;
        }
        this.notify();}
        // System.out.println(total);
    }
}

public class threadwaittest1 {
    public static void main(String[] args) throws InterruptedException {
        mytestwait testwait = new mytestwait();
        // Thread.currentThread().notify();
        testwait.start();
        synchronized (testwait) {
            testwait.wait();
        }
        System.out.println(testwait.total);

    }
}
