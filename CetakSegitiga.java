public class CetakSegitiga {
    public static void cetakSegitiga(int n) {
        if (n > 0) {
            cetakSegitiga(n - 1);
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int tinggiSegitiga = 5;
        cetakSegitiga(tinggiSegitiga);
    }
}
