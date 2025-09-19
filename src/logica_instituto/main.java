package logica_instituto;


import java.util.ArrayList;


 /*Respuestas
    a) Si es aconsejable creear una nueva clase abstracta para usarla
        como molde para otras clases
    b) 
*/
public class main {
    public static void main(String[] args) {        
        Instituto esiBuceo= new Instituto();
        
        
        Estudiante estudiante1 = new Estudiante ("juan", "Lopez" , "484611-6" , "30/05/2000", true);
        esiBuceo.agregar(estudiante1);
        Estudiante estudiante2 = new Estudiante ("marcela ", "Kloosterboer", "59312-5", "27/09/2001", false);
        esiBuceo.agregar(estudiante2);
        Estudiante estudiante3 = new Estudiante ("Genaro ", "Rodriges", "55978-2", "27/09/2000", true);
        esiBuceo.agregar(estudiante3);
        Docente docente1 = new Docente ("Elbio" , "Lento" ,"25525-0", "28/11/2001", 25, "Efectivo");
        esiBuceo.agregar(docente1);
        Docente docente2 = new Docente ("albion" , "vitamin" ,"35526-9", "28/11/2881", 15, "interino");
        esiBuceo.agregar(docente2);
        Docente docente3 = new Docente ("online" , "idk" ,"23525-3", "28/11/2003", 250, "Efectivo");
        esiBuceo.agregar(docente3);
        Adminstrativo admin1 = new Adminstrativo ("tio", "dude", "12345-1", "11/9/2001", "matutino");
        esiBuceo.agregar(admin1);
        Adminstrativo admin2 = new Adminstrativo ("juanito", "juanete", "66666-6", "1/1/1", "nocturno");
        esiBuceo.agregar(admin2);
        
        esiBuceo.mostrarTodo();
        esiBuceo.cierreNocturno();
        esiBuceo.mostrarAlumnosHabilitados();
        esiBuceo.mostrarProfesoresAlta();
    }
    
    
    
    
}
