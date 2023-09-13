class demonthreaddcler extends Thread{
    public void run(){
        System.out.println("i am New Threade");
    }
}

public class demonthread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        
        try{
            Thread.currentThread().setDaemon(true);
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println(Thread.currentThread().isDaemon());

        demonthreaddcler demon=new demonthreaddcler();

        demon.start();
        System.out.println("with out set:"+demon.isDaemon());

        demon.setDaemon(true);

        System.out.println("with: "+demon.isDaemon());
    }
}
