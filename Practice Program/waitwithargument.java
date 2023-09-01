class testwaitargument extends Thread{
    // testwaitargument(){}

    int total=0;
    public void run(){
synchronized(this){
        System.out.println("loop started...");
        for (int i = 1; i <=100; i++) {
            total=total+i;
        }
        System.out.println(total);
    }
    try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        
        e.printStackTrace();
    }
        System.out.println("loop is complated...");

    }
}

public class waitwithargument {
    public static void main(String[] args) throws InterruptedException  {
        System.out.println("main thread started...");
        
        testwaitargument twa1=new testwaitargument();
        
        System.out.println("Starting new thread...");
        twa1.start();
        synchronized(twa1){
        
        System.out.println("starting wait method");
        twa1.wait(5000);            }
        System.out.println("total is = "+twa1.total);
        
        System.out.println("main thread is completed...");

    }
}
