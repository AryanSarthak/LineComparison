package comparison;

public class Main {
    public static void main(String[] args) {
            System.out.println("Welcome to Line Comparison Computation Program");
            Line line1 = new Line(1, 2, 3, 4);
            Line line2 = new Line(1, 2, 3, 4);
            System.out.println(line1.equals(line2));
        }
    }
