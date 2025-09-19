package logica_instituto;


import java.util.ArrayList;


public class Instituto {
    ArrayList<Estudiante> listaEstudiante = new ArrayList<>();
    ArrayList<Docente> listaDocente = new ArrayList<>();
    ArrayList<Adminstrativo> listaAdministrativo = new ArrayList<>();
    ArrayList<Docente> listaAltaDedicacion = new ArrayList<>();
    ArrayList<Estudiante> listaHabilitados=new ArrayList<>();
    
    public void agregar(Estudiante est){
        listaEstudiante.add(est);
       
    }
    public void agregar(Docente doc){
        listaDocente.add(doc);
        
    }
    public void agregar(Adminstrativo adm){
        listaAdministrativo.add(adm);
    }
    
    public ArrayList<Estudiante> alumnosHabilitados(){
        for(Estudiante e : listaEstudiante){
            if(e.isHabilitado()){
            listaHabilitados.add(e);
            }
        }
        return listaHabilitados;
    }
    
    public void mostrarAlumnosHabilitados(){
        System.out.println("X---------------------X");
        System.out.println("Alumnos habilitados :");
        for(Estudiante e : listaHabilitados){
            System.out.println("-" + e);
        }
    }
    
    public ArrayList<Docente> profesoresAltaDedicacion(){
        for(Docente d : listaDocente){
            if(d.getHorasAsignadas() > 15){
                listaAltaDedicacion.add(d);
            }
        }
        return listaAltaDedicacion;
    }
    
    public void mostrarProfesoresAlta(){
        System.out.println("X---------------------X");
        System.out.println("Profesores de alta Dedicacion :");
        for(Docente d : listaAltaDedicacion){
            System.out.println("-" + d);
        }
    }
    
    public boolean cierreNocturno(){
        boolean encontrado = false;
        ArrayList<Adminstrativo> listaEliminar = new ArrayList<>();
        for(Adminstrativo a : listaAdministrativo){
            if(a.getTurno().equalsIgnoreCase("nocturno")){
            listaEliminar.add(a);
            encontrado = true;
            }
        }
        if(!listaAdministrativo.isEmpty()){
        System.out.println("\n\n SE ELIMINARAN:");
        for(Adminstrativo a1 : listaEliminar){
        System.out.println("-" +a1.getNombre());
            }   
        }
       listaAdministrativo.removeAll(listaEliminar);
       return encontrado; 
    }
    
    
    public void mostrarTodo(){
        System.out.println("X---------------------X");
        System.out.println("Listado estudiantes:");
        for(Estudiante e : listaEstudiante){
       
            System.out.println("--"+ e.getNombre());
        }
        System.out.println("X---------------------X");
        System.out.println("Listado Docentes:");
        for(Docente d : listaDocente){  
            System.out.println("--"+ d.getNombre());
        }
        System.out.println("X---------------------X");
        System.out.println("Listado Adminstrativo:");
         for(Adminstrativo a : listaAdministrativo){
            System.out.println("--"+ a.getNombre());
        }
    }
}
