package Figuras;

public class Cercle extends Figura{
    double radio;
    public Cercle(double radio){
        this.radio = radio;
    }
    @Override
    public double getArea() {
        return radio * radio * 3.14;
    }
}