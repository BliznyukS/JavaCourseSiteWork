public class LoopForWithIfFour {
    public static void main(String[] args) {

        int count = 11;
        int smh = 0;

        for (int i = 0; i < count; i++) {
            if (i < count / 2) {
                smh = count / 2 + i;
            } else {
                smh = i - count / 2;
            }

            for (int k = 0; k < count; k++) {
                if (k == smh || k == count - smh - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
