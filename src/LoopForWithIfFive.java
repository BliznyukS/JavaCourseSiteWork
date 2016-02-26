public class LoopForWithIfFive {
    public static void main(String[] arg) {
        int count = 11;

        // Внешний цикл
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < count; k++) {
                // Здесь условие даже немного проще
                if (i == count - 1 || k == count - 1 || k == count  - 1 - i ) {
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
