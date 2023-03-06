/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_matrices;

/**
 *
 * @author Marisol G
 */
public class EVA1_10_MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //filas x columnas 
        int [][] matrizDatos = new int [3][4];
        // llenar con numeros aleatorios
        // primer ciclo primera dimension(las filas)
        for (int i = 0; i < matrizDatos.length; i++) {//filas
           
            for (int j = 0; j < 4; j++) { // segudno ciclo_segunda dimension columnas 
               matrizDatos[i][j] = (int) (Math.random()*100);
            }   
        }
        for (int i = 0; i < matrizDatos.length; i++) {//filas
            for (int j = 0; j < 4; j++) { // segudno ciclo_segunda dimension columnas 
                System.out.print("[" + matrizDatos[i][j] + "]"); 
            } 
            System.out.println("");
        }
         
    }
    
}
