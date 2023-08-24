public class firstprogram {

    public static void sum() {
        int sal = 18000;
        int incre = 20;

        for (int i = 0; i <= 10; i++) {
            int ans = sal * incre / 100;
            sal = ans + sal;
            System.out.println(sal);
        }

    }

    public static void main(String[] args) {

        sum();

    }
}