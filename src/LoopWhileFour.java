public class LoopWhileFour {
    public static void main(String[] args) {
        int count = 3;

        int i = 0;
        while (i < count) {

            int k = 0;
            while (k++ < i + 1) {

                System.out.print(" *");
            }

            System.out.println();
            i++;
        }

    }
}
