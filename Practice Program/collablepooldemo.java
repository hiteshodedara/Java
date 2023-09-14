import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class collabledemot implements Callable{
    int val1;
    collabledemot(int i){
        this.val1=i;
    }
    public Object call() throws Exception{
        System.out.println();
        int sum=0;
        for(int i=1;i<=val1;i++){
            sum=sum+i;
        }
        return sum;
    }

}

public class collablepooldemo {
    public static void main(String[] args) throws Exception{
        collabledemot[] jobs={
            new collabledemot(10),
            new collabledemot(20),
            new collabledemot(30),
            new collabledemot(40),
            new collabledemot(50),
            new collabledemot(60),
        };
        ExecutorService service2=Executors.newFixedThreadPool(3);
        for(collabledemot job:jobs){
            Future f=service2.submit(job);
            System.out.println(f.get());
        }
        service2.shutdown();
    }
}
