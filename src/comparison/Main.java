package comparison;

public class Main {
    public static void main(String[] args) {
            System.out.println("Welcome to Line Comparison Computation Program");
            Line line1 = new Line(1, 2, 3, 4);
            Line line2 = new Line(1, 2, 3, 4);
            int result = line1.compareTo(line2);

            if (result == 0) System.out.println("Lines are equal");
            else if (result > 0) System.out.println("Line1 is greater");
            else System.out.println("Line1 is smaller");
        }
    }
