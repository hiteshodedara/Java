public class threadusinginnerclass {
    public static void main(String[] args) {
        Thread t23=new Thread(){
            public void run(){
                for(int i =1;i<=10;i++){
                    System.out.println("i am inner thread 1...");
                }
            }
        };
        t23.start();
        System.out.println("inner class over...");
        for (int i = 0; i <10; i++) {
            System.out.println("i am main thread...");
        }
        Thread t24=new Thread(){
            public void run(){
                for(int i =1;i<=10;i++){
                    System.out.println("i am inner thread 2...");
                }
            }
        };
        t24.start();
    }
}
