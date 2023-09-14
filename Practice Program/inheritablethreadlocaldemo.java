class parenttlocal extends Thread {

    public void run() {
        threadlocaldemo3.tl3.set("parent");//it will not work ,only parant class can change InheritableThreadLocal name,id.
        System.out.println("Parant values is :" + inheritablethreadlocaldemo.tl4.get());

        childtlocal chlocal = new childtlocal();
        chlocal.start();
    }
}

class childtlocal extends Thread {
    public void run() {
        System.out.println("child values is: " + inheritablethreadlocaldemo.tl4.get());
    }
}

public class inheritablethreadlocaldemo {
    static InheritableThreadLocal tl4 = new InheritableThreadLocal();

    public static void main(String[] args) {
        tl4.set("ok");
        System.out.println("Main Values:" + tl4.get());
        tl4.set("ok2");
        parenttlocal ptl1 = new parenttlocal();
        ptl1.start();
    }
}
