package thirdRobot;

public class RobotExt03 extends Robot03 {

    public RobotExt03(double x, double y, double course) {
        super(x, y);
        this.course = course;
    }

    public void back(int distance) {
        forward(-distance);
    }
}
