class myrunable implements Runnable {
    public void run() {
        // for (int i = 0; i < 10; i++) {
        // System.out.print((i+1)+" ");
        // }
        System.out.println("i am new");
        // System.out.println(Thread.currentThread().getName());
    }
}

public class myrunablethread {
    public static void main(String[] args) {
        myrunable r = new myrunable();
        Thread t = new Thread(r);
        Thread t1 = new Thread(r);

        t.start();
        t.setPriority(10);
        t1.setDaemon(true);
        // System.out.println();
        // t.setName("Heloo");

        // for (int i = 10; i < 20; i++) {
        // System.out.print((i+1)+" ");
        // }
        // // System.out.println("\n");
        // System.out.println(t.getName());
        // System.out.println(t1.getName());
        // System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(9);

        System.out.println(t.getPriority());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("i am main");
    }
}