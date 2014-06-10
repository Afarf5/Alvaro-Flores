/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursos.capitulo2.Tipos;
/* static int algo;
   solo de esta manera se ejcuta.
*/
/**
 *
 * @author T107
 */
public class Tipos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos un valor de enteros
        //int [] arreglo1= new int[3];
        //System.out.println(arreglo1[0]);
        
        /*int [] algo;        
         "algo" no se ejecuta si solo se pone: int algo;
        este solo se ejecuta si se pone enseguida despues de la clase.
         */
         int [] arreglo1= {-20,7,8,54};
        
        
         /* for(int i=0; i<arreglo1.length;i++){
            //arreglo1.length verifica el tamaño del arreglo, asi este se autocorrige.
            System.out.println(arreglo1[i]);
         }*/
          
//El tipo de dato sobre el que se va a iterar se relaciona al tipo de dato del entero
         for(int x:arreglo1){
             System.out.println(x);
         }
    }
    
}
