class customerdemo extends Thread{
    static int cid=0;
    private static ThreadLocal tl1=new ThreadLocal(){
        protected Integer initialValue(){
            return ++cid;
        }
    };
    customerdemo(String name){
            super(name);
        }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" executing wit customer id:"+tl1.get());
    }
}

public class threadlocaldemo2 {
    public static void main(String[] args) {
        customerdemo ctl1=new customerdemo("Hitesh");
        customerdemo ctl2=new customerdemo("Raju");
        customerdemo ctl3=new customerdemo("Jitesh");
        customerdemo ctl4=new customerdemo("Mitesh");
        customerdemo ctl5=new customerdemo("Rajesh");

        ctl1.start();
        ctl2.start();
        ctl3.start();
        ctl4.start();
        ctl5.start();

    }
}
