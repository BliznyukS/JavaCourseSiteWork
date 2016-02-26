package startRobot;

public class RobotManager {

    public static void main(String[] args) {

         /*Robot r1 = new Robot();
        Robot r2;
        r2 = new Robot();

        r1.x = 99;
        r2.x = 123;

        System.out.println(r1.x);
        System.out.println(r2.x);*/

        // Создаем объекта класса Robot
        Robot robot = new Robot();

        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Курс 90 градусов - не самый правильный способ
        // но давайте пока остановимся на нем
        robot.course = 90;
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Курс 45 градусов
        robot.course = 45;
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

    }
}
