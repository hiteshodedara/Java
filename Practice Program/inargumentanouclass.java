public class inargumentanouclass {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println("i am inner...");
                }
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        
        System.out.println("main t= " +Thread.currentThread().getName());
    }
}
