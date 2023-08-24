class mythread extends Thread{
    
    public void start(){
        super.start();
        System.out.println("i am start method");
    }
    public void run(){
        System.out.println("i am Run method");
    }
}
public class newthread {
    public static void main(String[] args) {
        mythread t=new mythread();
        t.start();
        System.out.println("i am main method");
    }
}
