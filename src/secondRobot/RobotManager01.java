package secondRobot;

public class RobotManager01 {

    public static void main(String[] args) {
        // Создаем объект для управления роботом
        RobotManager01 rm = new RobotManager01();

        // Создаем объекта класса Robot
        Robot01 robot = new Robot01();
        // Курс 45 градусов
        robot.setCourse(45);
        // Напечатать курс
        System.out.println(robot.getCourse());      // Здесь будет 45

        // вызываем метод и передаем туда робота
        rm.changeCourse(robot);

        // Напечатать курс
        System.out.println(robot.getCourse());      // Здесь будет 180
    }

    private void changeCourse(Robot01 robot) {
        robot = new Robot01();
        robot.setCourse(180);
        System.out.println(robot.getCourse());
    }
}
