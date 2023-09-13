class demontestthread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i Am Child...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class testdemont {
    public static void main(String[] args) {
        demontestthread testdemon=new demontestthread();
        testdemon.setDaemon(true);
        testdemon.start();

        System.out.println("end of main thread..");
    }
}
