public class Triangle extends Shape {
    private double side1, side2, side3, p;

    public Triangle() {
        super();
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
        this.p = (this.side1 + this.side2 + this.side3) / 2;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.p = (this.side1 + this.side2 + this.side3) / 2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getP() {
        return p;
    }

    public double getArea() {
        return Math.sqrt(this.p * (this.p - this.side1) * (this.p - this.side2) * (this.p - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side3 + this.side2;
    }

    @Override
    public String toString() {
        return "color " + this.getColor() + "\n"
                + "side 1: " + this.getSide1() + "\n"
                + "side 2: " + this.getSide2() + "\n"
                + "side 3: " + this.getSide3() + "\n"
                + "area: " + this.getArea() + "\n"
                + "Perimeter: " + this.getPerimeter();
    }
}
