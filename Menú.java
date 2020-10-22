import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * Se encarga de lanzar el menú al usuario, así el decide se quiere jugar solo o en pareja. 
 * 
 * @author Hannsell Solís Ramírez
 * @version 22/09/2020
 */
public class Menú
{
    /**
     * Desplegar las opciones al usuario.
     */
    public static void main (String [] args){
        String entrada= "";
        //Opciones
        while (! "c".equals (entrada)){
            entrada= JOptionPane.showInputDialog ( "Menú\n"
                + "Bienvenido a CONECTA 4. Elija la opción que deseas ;) \n"
                + "a. Jugador vs Maquina\n"
                + "b. Dos jugadores\n"
                + "c. SALIR\n");
              
              
            //Elegir entre las opciones
            switch (entrada.toLowerCase()){
                case "a":
                Conecta4conmaquina.main(null);
                break;

                case "b":
                
                Conecta4con2.main(null);
                break;

                case "c":
                System.out.println ("Muchas Gracias al optar por este programa, hasta la proxima");
                break;

            }

        }
    }
}