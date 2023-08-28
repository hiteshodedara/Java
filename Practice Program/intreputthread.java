class myintruptedthread extends Thread{
    public void run() 
    {
         for(int i=0;i<100;i++){
            String y = Character.toString( 128_512 );
            System.out.println( i+":"+y ) ;
            if(i==90){
                try {
                    System.out.println("i am going to sleep");
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Main Method: Kick Me ");
                }
            }
        }
    }
}

public class intreputthread {
    public static void main(String[] args) throws InterruptedException
     {
        myintruptedthread it=new myintruptedthread();
        Thread.currentThread().setName("hitesh");
        it.start();
        it.interrupt();
        it.join();
       System.out.println("i am main");
    }
}
