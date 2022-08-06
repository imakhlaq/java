class Circle {
    public int radius;

    public double area() {
        return Math.PI*this.radius * this.radius;
    }

}
class Cylinder extends Circle{
    public int height;
    @Override
    public double area() {
        return Math.PI*this.radius * this.radius;
    }
    

}

public class practice2 {
    public static void main(String[] args) {

    }
}
