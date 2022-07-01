package areapoligonos;

/**
 *
 * @author Victor Medina
 */

//Herencia
public class Rectangulo extends Poligono {
    //Encapsulamiento
    private double lado1;
    private double lado2;
    
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    //Sobreescritura de miembros
    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString() +"\nlado1=" + lado1 + "\nlado2=" + lado2;
    }
    
    @Override
    public double getArea() {
        return lado1 * lado2;
    }
     
}
