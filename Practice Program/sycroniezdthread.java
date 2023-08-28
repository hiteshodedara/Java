class disply{
    public  void  wish(String name) throws InterruptedException{
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Good Morning:"+name);
            Thread.sleep(2000);
        }
    }
}

class myteamthreade extends Thread{
    disply d;
    String name;

    public myteamthreade(disply d,String name){
        this.d=d;
        this.name=name;
    }

    public void run(){
        try {
            d.wish(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class sycroniezdthread {
    public static void main(String[] args) {
     disply d=new disply();
     myteamthreade t2=new myteamthreade(d, "sagar"); 
     myteamthreade t1=new myteamthreade(d, "raju"); 
     myteamthreade t3=new myteamthreade(d, "hitesh"); 

    //  t2.setPriority(8);
    //  t1.setPriority(2);
     t3.setPriority(10);

     t1.start();      
     t2.start();      
     t3.start();      
    }
}
