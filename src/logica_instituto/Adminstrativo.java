package logica_instituto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 66047656
 */
public class Adminstrativo extends Persona{
    private String turno;

    public Adminstrativo(String nombre, String apellido, String ci, String fnac, String turno) {
        super(nombre, apellido, ci, fnac);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Adminstrativo{" + "turno=" + turno + '}';
    }
    
    
}
