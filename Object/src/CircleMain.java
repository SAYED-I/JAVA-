public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(8);

        System.out.println(Circle.getNumOfCircles());
        System.out.println(Circle.getTotalSurface());
    }
}
