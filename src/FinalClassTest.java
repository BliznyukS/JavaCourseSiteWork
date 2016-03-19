public class FinalClassTest {

    public static void main(String[] arg) {
        final Integer f = new Integer(100);
        f = 200;
    }

   /* private final Integer value;

    public FinalClassTest() {
        // Здесь будет ошибка, если инициализация
        // будет сделана в описании свойства
        value = 100;
    }*/
}
