package Figuras;
import java.util.Arrays;
public class GestorFiguras {

    static void Print(Figura[] figuraList){
        for (Figura f: figuraList) {
            String mensajeFigura = "Àrea del ";
            mensajeFigura += f.getClass().getSimpleName();
            mensajeFigura += " té un valor de: "+f.getArea();
            PrintarConsola(mensajeFigura);
        }
    }
    static double Suma(Figura[] figuraList){
        double result = 0;
        for (Figura f : figuraList) {
            result += f.getArea();
        }
        return result;
    }
    static void Sort(Figura[] figuraList){

        Arrays.sort(figuraList);
    }
    static void PrintarConsola(Object message){

        System.out.println(message);
    }
    public static void main(String[] args) {

        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5,4);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5, 5);
        v[3] = new Triangle(8,4);

        double res = Suma(v);

        System.out.println("suma: "+res);

        Print(v);

        Sort(v);

        Print(v);
    }

}