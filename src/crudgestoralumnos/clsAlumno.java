/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudgestoralumnos;

import java.time.LocalDate;

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
                this.Curp + "|" + this.FechaNacimiento;
        return alumno;
    }
    
    public void guardar() {
        
        mAlumno articulo = new mAlumno();
        // Enviamos la cadena de texto
        articulo.insertar(this.aTexto());
        
        System.out.println(this.aTexto());
    }
    
}
