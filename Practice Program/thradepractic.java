// import java.beans.IntrospectionException;

class custom extends RuntimeException {
    public custom(String s) {
        super(s);
    }
}

class mynewthread extends Thread {
    public void run() {
        Thread.currentThread().setName("hitesh");
        Thread.currentThread().setPriority(MAX_PRIORITY);

        System.out.print("i Am " + Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class thradepractic {
    public static void main(String[] args) throws InterruptedException {
        // mynewthread t4=new mynewthread();
        // t4.start();
        // System.out.print("i am "+Thread.currentThread().getName());
        // for(int i=0;i<5;i++){
        // for (int j = 0; j < i; j++) {
        // System.out.print("@");
        // }
        // System.out.println();
        // }
        // Thread.currentThread().setName("Hitesh");
        // try{
        // System.out.println(100/0);
        // }
        // catch(ArithmeticException e){
        // throw new custom("bc bolana 0 se divid nahi hota");
        // }

        // Thread.sleep(10000);
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println("bhai error aavi se");
        }
        System.out.println("helooo");

        // System.out.println(100/0);
        // System.out.println("helllo");
    }
}
