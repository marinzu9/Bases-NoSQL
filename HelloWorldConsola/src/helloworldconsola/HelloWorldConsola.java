/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldconsola;

/**
 *
 * @author Laboratorios
 */
public class HelloWorldConsola {

    /**
     * @param args the command line arguments
     */
    
    public static void DigaHolaMundo(){
        Mensajeria elMensaje = new Mensajeria();
        elMensaje.ImprimirMensaje("Hola Mundo!");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        DigaHolaMundo();
    }
    
}
