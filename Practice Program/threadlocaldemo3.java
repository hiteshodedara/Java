class parenttlocal extends Thread {

    public void run() {
        threadlocaldemo3.tl3.set("parent");
        System.out.println("Parant values is :" + threadlocaldemo3.tl3.get());

        childtlocal chlocal = new childtlocal();
        chlocal.start();
    }
}

class childtlocal extends Thread {
    public void run() {
        System.out.println("child values is: " + threadlocaldemo3.tl3.get());
    }
}

public class threadlocaldemo3 {
    static ThreadLocal tl3 = new ThreadLocal<>();

    public static void main(String[] args) {
        tl3.set("main");
        System.out.println("Main Values:" + tl3.get());
        parenttlocal ptl1 = new parenttlocal();
        ptl1.start();
    }
}
