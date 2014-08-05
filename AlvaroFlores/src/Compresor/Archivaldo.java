/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compresor;

/**
 *
 * @author T107
 */
import java.io.*;
public class Archivaldo implements Serializable {

    private File file;
    private String nombre;
    private long tamano;

    public Archivaldo() {
    }

    public Archivaldo(File file, String nombre, long tamano) {
        this.file = file;
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTamano() {
        return tamano;
    }

    public void setTamano(long tamano) {
        this.tamano = tamano;
    }
    

    
}
