
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class printjob implements Runnable{
    String name;
    printjob(String name){
        this.name=name;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(name+" is working...");
            try {
                System.out.println(100/0);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }
    
}


public class threadpooldemo {
    public static void main(String[] args) {
        
        printjob[] jobs={
            new printjob("Raju"),
            new printjob("Vipul"),
            new printjob("Sagar"),
            new printjob("Hitesh"),
            new printjob("Manisha"),

        };
        

        ExecutorService service=Executors.newFixedThreadPool(3);   
        for(printjob job:jobs){
            service.submit(job);
        }
        
        service.shutdown();
    }
}
