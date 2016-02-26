public class LoopWhileThree {
    public static void main(String[] arg) {
        int count = 3;

        int i = 0;
        while (i < count) {
            int k = 0;
            while (k < count) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
