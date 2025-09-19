package logica_instituto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 66047656
 */
public class Docente extends Persona {
    private int horasAsignadas;
    private String algo;

    public Docente(String nombre, String apellido, String ci, String fnac ,int horasAsignadas, String algo) {
        super(nombre, apellido, ci, fnac);
        this.horasAsignadas = horasAsignadas;
        this.algo = algo;
    }

      
    public int getHorasAsignadas() {
        return horasAsignadas;
    }

    public void setHorasAsignadas(int horasAsignadas) {
        this.horasAsignadas = horasAsignadas;
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }

    @Override
    public String toString() {
        return "Docente{" + "horasAsignadas=" + horasAsignadas + ", algo=" + algo + '}';
    }
    
    
}
