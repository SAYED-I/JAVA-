public class Circle {
    private int radius;
    private static final double PI = 3.14;
    private static int numOfCircles = 0;
    private static double totalSurface = 0;

    public Circle(int radius) {
        this.radius = radius;
        updateStaticField();
    }
    private void updateStaticField() {
        numOfCircles++;
        totalSurface = totalSurface + Surface();
    }
    public Circle() {
        radius = 1;
        updateStaticField();
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        if(radius > 0){
            this.radius = radius;
        }
    }
    private double Surface(){

        return PI * radius * radius;

    }

    // setter and getter for numOfCircles
    public static int getNumOfCircles(){
        return numOfCircles;
    }
    public static void setNumOfCircles(int numOfCircles){
        Circle.numOfCircles = numOfCircles;
    }

    // getter and setter for totalSurface
    public static double getTotalSurface(){
        return totalSurface;
    }
    public void setTotalSurface(double totalSurface){
        Circle.totalSurface = totalSurface + Surface();
    }

}
