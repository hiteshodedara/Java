class testmythread extends Thread{
    public void run(){
        System.out.println("i am first");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
class testmythread2 extends Thread{
    public void run(){
        System.out.println("i am second");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

public class testthread {
    public static void main(String[] args) {
        testmythread test=new testmythread();
        testmythread2 test2=new testmythread2();

        test.setPriority(10);
        test2.setPriority(10);
        test.start();
        test2.start();
        Thread.currentThread().setPriority(1);

        System.out.println("i am third");
        for(int i=0;i<5;i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
