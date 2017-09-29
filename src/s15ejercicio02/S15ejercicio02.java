/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ejercicio02;

/**
 *
 * @author alumno
 */
public class S15ejercicio02 {

                
    public static void main(String[] args) {
    Curso curso01 = new Curso("Estructura de Datos");
    Curso curso02 = new Curso("Sisteme de base de Datos");
    
    curso01.agregarEstudiante("Peter");
    curso01.agregarEstudiante("Kim");
    curso01.agregarEstudiante("Anne");
    
    curso02.agregarEstudiante("Peter");
    curso02.agregarEstudiante("Steve");
    
        System.out.println(" ");
        System.out.println("CURSO 02");
        System.out.println("N° Estudiantes - Curso 01: " + curso01.obtenerNumEstudiantes());
        String[] estudiantesC01 = curso01.obtenerEstudiantes();
        for(int i =0; i < curso01.obtenerNumEstudiantes(); i++){
        String[] estudiantesC02 = null;
            System.out.println(" -" + estudiantesC02[i]);
        }
    }
    
    
        
        
      
    
    
    
    
    
    
    
    
    }
    
}
