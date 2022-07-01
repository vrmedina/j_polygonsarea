package areapoligonos;

/**
 *
 * @author Victor Medina
 */

//Clases y Metodos abstractos
public abstract class Poligono {
    protected int numLados;

    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    //Metodo toString()
    @Override
    public String toString() {
        return "Numero de Lados=" + numLados;
    }
    
    public abstract double getArea();
    
}
