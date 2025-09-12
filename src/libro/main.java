/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 66047656
 */
public class main {
    public static void main(String[] args) {
        Scanner gato = new Scanner (System.in);
        ArrayList<Libro> lista = new ArrayList<>();
        String titulo;
        String autor;
  
    
   for(int i = lista.size(); i < 3; i++){
       System.out.println("--- Ingreso de datos del libro ---\n");
       System.out.println("ingrese el titulo del libro");
       titulo = gato.nextLine();
       System.out.println("Ingrese el Autor del libro");
       autor = gato.nextLine();
       Libro libros = new Libro(titulo, autor);
       
       boolean repetido = false;
       for(Libro l : lista){
           if(l.getTitulo().equals(titulo)){
               repetido = true;
               break;
           }
      }
      if(repetido){
          System.out.println("el libro ya existe, y no se va a agregar \n");
      }else{
          
       System.out.println(libros);
       lista.add( new Libro ( titulo, autor ));
       System.out.println("libro agregado con exito \n");
       
      }
    }
  }
}
