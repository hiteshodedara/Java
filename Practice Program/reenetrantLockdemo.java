import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class reenetrantLockthread extends Thread{
    static ReentrantLock l=new ReentrantLock();
    
        reenetrantLockthread(String name){
            super(name);
        }
    public void run(){
        do{
            try{
                if(l.tryLock(5000,TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+" get lock");
                    Thread.sleep(30000);
                    System.out.println(Thread.currentThread().getName()+" Relese the lock");
                    l.unlock();
                    break;
                }
                else{
                    System.out.println(Thread.currentThread().getName()+" not get lock try again");
                }
            }   
            catch(Exception e){
                System.out.println(e);
            }
        }while(true);
    }
}


public class reenetrantLockdemo {
    public static void main(String[] args) {
        reenetrantLockthread t1lock=new reenetrantLockthread("hitesh");
        reenetrantLockthread t2lock=new reenetrantLockthread("raju");
        reenetrantLockthread t3lock=new reenetrantLockthread("vipul");
        t1lock.start();
        t2lock.start();
        t3lock.start();
    }
}
