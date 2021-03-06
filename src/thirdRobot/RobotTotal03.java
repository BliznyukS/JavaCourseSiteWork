package thirdRobot;

public class RobotTotal03 extends Robot03{

    // Вводим поле дляхранения пройденной дистанции
    private double totalDistance = 0;

    // Конструктор тоже надо переопределить
    public RobotTotal03(double x, double y) {
        super(x, y);
    }

    @Override
    public void forward(int distance) {
        // Вызов нашего метода у класса предка.
        // Нужно указать зарезервированное слово super
        super.forward(distance);
        totalDistance += distance;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
