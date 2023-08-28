class myjointhread extends Thread {
    static Thread mt;
    public void run()
    {
        try{
            mt.join(2);
        }catch(InterruptedException e){
            System.out.println("Something is heppand...");
        }
        
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            System.out.println("i am child thread...");
        }
    }
}


public class thradjoin {
    public static void main(String[] args) throws InterruptedException
     {
        myjointhread.mt=Thread.currentThread();
        myjointhread jo=new myjointhread();
        jo.start();
        // jo.join();
        
        for(int i =0;i<5;i++){
            Thread.sleep(1000);
            System.out.println("i am main thread..");
        }

    }
}
