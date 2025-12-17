package comparison;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        Point p3 = new Point(2, 3);
        Point p4 = new Point(6, 7);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        if (line1.equals(line2))
            System.out.println("Both lines are equal");
        else
            System.out.println("Both lines are not equal");

        int result = line1.compareTo(line2);

        if (result == 0)
            System.out.println("Line1 is equal to Line2");
        else if (result > 0)
            System.out.println("Line1 is greater than Line2");
        else
            System.out.println("Line1 is less than Line2");
        }
    }
