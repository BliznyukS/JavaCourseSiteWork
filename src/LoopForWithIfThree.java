public class LoopForWithIfThree {
    public static void main(String[] arg) {
        int count = 10;

        // Внешний цикл
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < count; k++) {
                // Здесь условие даже немного проще
                if (i == count - 1 || k == count - 1 || i == k || k ==0 || i == 0 || k == count  - 1 - i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            // Переход на следующую строку
            System.out.println();
        }

    }
}
