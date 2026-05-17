/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudgestoralumnos;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author dogza
 */
public class clsAlumno {
    
    private String Nombre;
    private String Matricula;
    private boolean Estatus;
    private String Curp;
    private LocalDate FechaNacimiento;
    private String Telefono;
    
    public clsAlumno(String Nombre , String Matricula , boolean Estatus , String Curp ,
            LocalDate FechaNacimiento , String Telefono) {
        this.Nombre = Nombre;
        this.Matricula = Matricula;
        this.Estatus = Estatus;
        this.Curp = Curp;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
    }
    
    public String aTexto(){
        String alumno = this.Nombre + "|" + this.Matricula + "|" + this.Estatus + "|" +
                this.Curp + "|" + this.FechaNacimiento + "|" + this.Telefono;
        return alumno;
    }
    
    public void guardar() {
        
        mAlumno alumno = new mAlumno();
        // Enviamos la cadena de texto
        alumno.insertar(this.aTexto());
        
        System.out.println(this.aTexto());
    }
    
     public DefaultListModel<String> LlenarLista(){
        //Instancia desde el modelo
        mAlumno mClient = new mAlumno();
        //Llenamos la variable con los datos del modelo
        ArrayList<String> datos = mClient.consultar();
        // Creamos la plantilla en blanco para el modelo
        DefaultListModel<String> modelLista = new DefaultListModel();
        // Llenamos la plantilla con los datos del modelo
        for ( String registro: datos){
            modelLista.addElement(registro);
        }
        // Devuelve los datos cargados en el modelo de lista
        return modelLista;
    }
    
    public void actualizar(String newNombre , String newMatricula , boolean newEstatus ,
                String newCurp , LocalDate newFecha , String newTelefono) {
        
        String nuevaLinea = newNombre + "|" + newMatricula + "|" + newEstatus + "|"
                + newCurp + "|" + newFecha + "|" + newTelefono;
        String lineaOriginal = this.Nombre + "|" + this.Matricula + "|" + this.Estatus + "|" +
                this.Curp + "|" + this.FechaNacimiento + "|" + this.Telefono;
        
        //Imprimir los nuevos valores 
        System.out.println("Valores nuevos" + nuevaLinea);
        System.out.println("Valores originales" + lineaOriginal);
        
        //Solicita la actualizacion del registro
        mAlumno mAlumn = new mAlumno();
        
        mAlumn.update(lineaOriginal, nuevaLinea , "listado_clientes.txt");
    }
        
    public void eliminar() {
        // Registro a eliminar
        String lineaOriginal = this.Nombre + "|" + this.Matricula + "|" + this.Estatus + "|" +
                this.Curp + "|" + this.FechaNacimiento + "|" + this.Telefono;
        
        //Imprimir los valores originales 
        System.out.println("Valores originales" + lineaOriginal);
        
        //Solicita la eliminacion del registro
        mAlumno mClient = new mAlumno();
        
        mClient.delete(lineaOriginal,"listado_clientes.txt");
        
    }
    
    public String getNombre() {
        return this.Nombre;
    }
    
}
