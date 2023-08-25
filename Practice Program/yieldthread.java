class myyieldthread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("main Thread..");
            Thread.yield();
        }
    }
}

public class yieldthread {
    public static void main(String[] args) {
        myyieldthread te=new myyieldthread();
        te.setPriority(10);
        te.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("new Thread..");
        }
    }
}
