public class piramiedpattn {
    public static void main(String[] args) {
        int k,i;
        int n=6;
        for (i=n; i >= 0; i--) {
            for ( k = 0; k <i; k++) {
                System.out.print(k);
            }
            System.out.println(i);
            // System.out.println();
        }
    }
}
