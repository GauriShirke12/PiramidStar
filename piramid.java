public class piramid {
    public static void main(String[] args) {
        int r, c;
        for (r = 1; r <= 9; r++) {
            for (c = 1; c <= r; c++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (r = 1; r <= 9; r++) {
            for (c = 1; c <= 10 - r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
