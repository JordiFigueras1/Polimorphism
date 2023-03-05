package Figuras;
public class Triangle extends Figura{
    double base;
    double height;
    public Triangle(double height,double base){
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return base * height / 2;
    }

}