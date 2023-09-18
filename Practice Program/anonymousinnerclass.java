public class anonymousinnerclass {
    public static void main(String[] args) {
        Thread t26=new Thread(){
            public void run(){
                for(int i =0;i<10;i++){
                    System.out.println("i am inner thread 1...");
                }
            }
        };
        Thread t27=new Thread(){
            public void run(){
                for(int i =0;i<10;i++){
                    System.out.println("i am inner thread 2...");
                }
            }
        };
        t26.start();
        t27.start();
        
        
    }
}
