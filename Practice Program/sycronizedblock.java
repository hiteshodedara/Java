class displyme {
    public void wish(String name) {

        //10 lakh line of code..

        // for(int i =0;i<10;i++){System.out.print(i);}
        // try{Thread.sleep(2000);}catch(InterruptedException e){}



        //sycronized block only one thread can access one at time...
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print("good morning :");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println(name);
            }
        }

        //10 lakh line of code..

        // for(int i =0;i<10;i++){System.out.print(i);}
        // try{Thread.sleep(2000);}catch(InterruptedException e){}

    }
}

//creating thread class
class mysycblock extends Thread {
    displyme d;
    String name;

    mysycblock(displyme d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

public class sycronizedblock {
    public static void main(String[] args) {
        //object of displayme class
        displyme d3 = new displyme();

        //creating object of thread class
        mysycblock ms1 = new mysycblock(d3, "hitesh");
        mysycblock ms2 = new mysycblock(d3, "Raju");

        //Starting a Thread...
        ms1.start();
        ms2.start();
    }
}
