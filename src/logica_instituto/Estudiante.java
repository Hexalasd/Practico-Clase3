package logica_instituto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 66047656
 */
public class Estudiante extends Persona{
    private boolean habilitado = false;

    public Estudiante(String nombre, String apellido, String ci, String fnac, boolean habilitado) {
        super(nombre, apellido, ci, fnac);
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void seHabilitado(boolean algo) {
        this.habilitado = algo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "algo=" + habilitado + '}';
    }

  
      
   
}
