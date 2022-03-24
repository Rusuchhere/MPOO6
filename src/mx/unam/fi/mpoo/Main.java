package mx.unam.fi.mpoo;

import controlador.Sumadora; //conectar clases
/**
 * Clase principal
 * @author Duque Rafael 
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase empaquetada");
        
        Sumadora sumadora = new Sumadora();
        double suma = sumadora.sumar(3, 4);
        System.out.println(suma);
        
    }
}
