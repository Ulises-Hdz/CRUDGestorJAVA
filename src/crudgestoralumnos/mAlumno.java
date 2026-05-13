/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudgestoralumnos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dogza
 */
public class mAlumno {
    
    public void insertar(String cadenaArticulo){
        
    try {
        // Esta linea crea el archivo donde se guarda la informacion
        FileWriter archivo = new FileWriter("listado_alumnos.txt" , true);
        // Buffer temporal que se encarga de guardar los datos en el archivo
        BufferedWriter buffer = new BufferedWriter(archivo);
            
        // Escribe en el archivo de texto
        buffer.write(cadenaArticulo); 
        // Agrega un salto de linea al registro
        buffer.newLine(); 
        // Guarda los registros en el archivo
        buffer.close();

    } catch (IOException e) {
        //lblSaludo.setText("Error al guardar el archivo: " + e.getMessage());
        }
    }
    
}
