package startRobot;

public class RobotManager01 {

    public static void main(String[] args) {

         /*Robot r1 = new Robot();
        Robot r2;
        r2 = new Robot();

        r1.x = 99;
        r2.x = 123;

        System.out.println(r1.x);
        System.out.println(r2.x);*/

        // Создаем объекта класса Robot
        Robot01 robot = new Robot01();

        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Это более корректный способ менять курс.
        // Реализация внутри робота не сильно отличается, но
        // мы в любой момент сможем сделать более продвинутую версию
        // Но класс RobotManager об этом даже не узнает
        robot.setCourse(90);
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Курс 45 градусов
        robot.setCourse(45);
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

    }
}
