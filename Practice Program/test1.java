class test1thread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("i am new>>>");
            Thread.currentThread();
            // Thread.currentThread();
            Thread.yield();
        }
    }
}
public class test1 {
    public static void main(String[] args) {
        test1thread test12=new test1thread();
        test12.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("i am main>>>");
            Thread.currentThread();
            Thread.yield();
        }
    }
}
