/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudgestoralumnos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author dogza
 */
public class clsCSV {
    
    //Atributo
    String archivo = "alumnos.csv";
    String archivoCliente = "alumnos.csv";
    
    public void importarClientes(){
        try(BufferedReader br = new BufferedReader( new FileReader(archivoCliente))){
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                // Asigancion de valores para importar datos
                DateTimeFormatter formatoCSV = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate fechaNac = java.time.LocalDate.parse(datos[4], formatoCSV);
                
                clsAlumno cAlumn = new clsAlumno( datos[0], datos[1] , Boolean.parseBoolean(datos[2]) , datos[3] , fechaNac , datos[5]);
                // Almacena en archivo txt
                cAlumn.guardar();
                
            }
            br.close();
            System.out.println("Se ha terminado con la importacion");
        }catch(IOException e){
            System.out.println("Mensaje de error" + e.getMessage());
        }
    }
}
