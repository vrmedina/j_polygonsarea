package areapoligonos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor Medina
 */
public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner in = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        //Llenar un poligono
        llenarPoligono();
        //Mostrar los datos y el area de cada poligono
        mostrarPoligonos();
    }
    
    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite que poligono desea: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = in.nextInt();
            } while (opcion<1 || opcion>2);
            
            switch (opcion) {
                case 1://Llenar un triangulo
                    llenarTriangulo();
                    break;
                case 2://Llenar un rectangulo
                    llenarRectangulo();
                    break;
            }
            System.out.print("Desea introducir otro poligono?(s/n): ");
            respuesta = in.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');  
    }
    
    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.print("Digite el lado 1 del triangulo: ");
        lado1 = in.nextDouble();
        System.out.print("Digite el lado 2 del triangulo: ");
        lado2 = in.nextDouble();
        System.out.print("Digite el lado 3 del triangulo: ");
        lado3 = in.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);    
    }
    
    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.print("Digite el lado 1 del triangulo: ");
        lado1 = in.nextDouble();
        System.out.print("Digite el lado 2 del triangulo: ");
        lado2 = in.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
    }
    
    public static void mostrarPoligonos() {
        
        for (Poligono poli: poligono) {
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.getArea());
            System.out.println("");
        }
    }
    
}
