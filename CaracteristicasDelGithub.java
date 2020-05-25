/*
Saludos.Implemente un algoritmo que le permita ingresar por teclado 
los conocimientos que usted tenga sobre el Software GitHub, analizando
cada una de sus características importantes. 
 */
package caracteristicasdelgithub;

/**
 *
 * @author: Ana Graciela Pico Solis
 */
import java.util.Scanner;
public class CaracteristicasDelGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in); //new, reserva espacio de la mamoria
        System.out.println("-----------Caracteristicas de GitHub---------");
        
        System.out.println("Software más utilizado en el mundo, por su simplicidad");
         
        System.out.println("Característica principal del Software:");
        String caracteristicaprincipal=objeto.nextLine();
                
        System.out.println("¿Que es Git?");
        String git=objeto.nextLine();
                
        System.out.println("¿Que controla Git?");
        String controlagit=objeto.nextLine();
          
        System.out.println("¿Como nos ayuda Git?");
        String ayudagit=objeto.nextLine();
        
        System.out.println("Cuales son los servicios que nos da GitHub:");//Ingrese dos.
        String servicios=objeto.nextLine();

        System.out.println("De que manera nos ayuda GitHub:");//Argumente su respuesta
        String ayudagithub=objeto.nextLine();
        
        System.out.println("¡¡¡EXCELENTE TRABAJO!!!");
        
       System.out.println("GRACIAS");
    }
    
}
