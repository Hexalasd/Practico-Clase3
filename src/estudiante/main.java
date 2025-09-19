/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 66047656
 */
public class main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);
        ArrayList<Estudiante> lista =  new ArrayList<>();
        String nombre;
        String apellido;
        String club;
        
                for(int i = 0; i < 3; i++){
            System.out.println("--- Ingreso de Datos del alumno ---\n");
            System.out.println("Ingresar el nombre del estudiante " + i);
            nombre = gato.nextLine();
            System.out.println("Ingresar el apellido del estudiante " + i);
            apellido = gato.nextLine();
            System.out.println("Ingresar el club en que esta el estudiante " + i);
            club = gato.nextLine();

            Estudiante estudiante = new Estudiante(nombre, apellido, club);

            boolean repetido = false;
            for (Estudiante l : lista) {
                if (l.getApellido().equals(apellido)) {
                    repetido = true;
                    break; 
                }
            }

            if (repetido) {
                System.out.println("--X El estudiante tiene el mismo apellido, no lo vamos a añadir X--\n");
            } else {
                lista.add(estudiante);
                System.out.println("--- Se añadió el estudiante con éxito ---\n");
            }
        }
    }
}
