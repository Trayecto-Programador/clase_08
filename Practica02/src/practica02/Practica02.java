/**
 * Escribir un programa que solicite la carga de un valor positivo 
 * y nos muestre desde 1 hasta el valor ingresado de uno en uno.
 * Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.
 */
package practica02;

import javax.swing.JOptionPane;

public class Practica02 {

    public static void main(String[] args) {
        int inicio, fin;
        
        inicio =1;
        fin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de tope Positivo"));
        
        
        while (!(fin >= 0) ) {            
        fin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor Positivo"));
        }
        
        do {            
            if(inicio <= fin)
            System.out.println(inicio);
            inicio++;
        } while (inicio !=fin+1);
        
    }
    
}
