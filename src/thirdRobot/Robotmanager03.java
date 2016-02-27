package thirdRobot;

public class Robotmanager03 {

    public static void main(String[] args) {
        // Создаем объекта класса Robot - теперь с параметрами
        RobotExt robot = new RobotExt(0, 0, 0);

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
        // И назад на 10 метров - это метод для RobotExt
        robot.back(10);
        // Напечатать координаты
        robot.printCoordinates();
    }
}
