/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertarnombresfor;

//importar paquete
import dominio.Persona;
import java.util.Scanner;

/**
 *
 * @author Alumno mañana
 */
public class InsertarNombresFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
//Declarar array de objetos con sintaxis resumida
//        Persona personas[]={new Persona("Santi"), new Persona("Iker"),new Persona("María") };

        //  Array de objetos de tipo personas
        Persona personas[] = new Persona[3];
        personas[0] = new Persona();
        personas[1] = new Persona();
        personas[2] = new Persona();

        for (int i = 0; i < personas.length; i++) {
            //Declarar un objeto con cada iteracion
            //personas[i]=new Persona();
            System.out.printf("Introduce un nombre: ");
            personas[i].setNombre(ent.nextLine());
            System.out.println("- Persona " + i + " : " + personas[i].getNombre());
            
        }
    }
}
