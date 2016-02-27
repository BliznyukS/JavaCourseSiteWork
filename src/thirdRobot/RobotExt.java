package thirdRobot;

public class RobotExt extends Robot03 {

    public RobotExt(double x, double y, double course) {
        super(x, y);
        setCourse(course);
    }

    public void back(int distance) {
        forward(-distance);
    }
}
