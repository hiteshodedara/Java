class mythread extends Thread{
    
    
    public void run(){
        System.out.println("i am Run method");
    }
}
public class newthread {
    public static void main(String[] args) throws IllegalThreadStateException
     {
        mythread t=new mythread();
        mythread t1=new mythread();

        t.start();
        t1.start();
        // t.start();
        System.out.println("i am main method");
    }
}
