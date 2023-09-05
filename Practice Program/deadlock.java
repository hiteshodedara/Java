class A{
    public synchronized void d1(B b) throws InterruptedException{
        System.out.println(" a method started...");
        Thread.sleep(10000);
        System.out.println("try to execute last method of A ...");
        b.last();
    }
    public synchronized void last(){
        System.out.println("i am last method of a class");
    }
}

class B{
    public synchronized void d2(A a) throws InterruptedException{
        System.out.println(" b method started...");
        Thread.sleep(10000);
        System.out.println("try to execute last method of B ...");
        a.last();
    }
    public synchronized void last(){
        System.out.println("i am last method of b class");
    }
}

class deadlock extends Thread{
    A a1=new A();
    B b1=new B();
    public void maintom1() throws InterruptedException{
        this.start();
        a1.d1(b1);
    }

    public void run(){
        try {
            b1.d2(a1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        deadlock dead1=new deadlock();
        dead1.maintom1();
    }
}

