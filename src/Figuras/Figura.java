package Figuras;
public abstract class Figura implements Comparable<Figura>{
    public abstract double getArea();
    @Override
    public int compareTo(Figura f) {
        double myArea = this.getArea();
        double otherShapeArea = f.getArea();
        return myArea > otherShapeArea ? 1 : myArea < otherShapeArea ? -1 :0;
    }
    /*public String ToString() {
        return getClass().getName()+'@'+Integer.toHexString(1);
    }*/
}