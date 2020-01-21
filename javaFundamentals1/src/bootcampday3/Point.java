package bootcampday3;

public class Point {
    protected double x;
    protected double y;

    Point(double xCoord, double yCoord){
        this.x = xCoord;
        this.y = yCoord;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
    public static double distance(Point a, Point b)
    {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Point p1 = new Point(-1,1);
        Point p2 = new Point(3,4);
        System.out.println("Distance between them is " + Point.distance(p1, p2));
    }
}
