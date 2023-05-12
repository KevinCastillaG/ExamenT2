/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author kevin
 */
public class Estudiante {

    /**
     * @return the cantAsistencias
     */
    public int getCantAsistencias() {
        return cantAsistencias;
    }

    /**
     * @param cantAsistencias the cantAsistencias to set
     */
    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }

    /**
     * @return the cantFaltas
     */
    public int getCantFaltas() {
        return cantFaltas;
    }

    /**
     * @param cantFaltas the cantFaltas to set
     */
    public void setCantFaltas(int cantFaltas) {
        this.cantFaltas = cantFaltas;
    }
    
    private String nombre;
    private Aula aula;
    private int cantAsistencias;
    private int cantFaltas;        
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the aula
     */
    public Aula getAula() {
        return aula;
    }

    /**
     * @param aula the aula to set
     */
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    
    
            
           
}
