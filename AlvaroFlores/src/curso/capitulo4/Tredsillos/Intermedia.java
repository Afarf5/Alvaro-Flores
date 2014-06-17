/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curso.capitulo4.Tredsillos;

/**
 *
 * @author T107
 */
public class Intermedia implements Runnable {
    public static void main(String args[]){
            //Paso1.-Crear el thread.
        Runnable r=new Intermedia();
        Thread t1=new Thread(r); //impresion
        Thread t2=new Thread(r);  //conexion
        Thread t3=new Thread(r);  //guardar
        //Paso2.-Inicializado
        t1.start();
        t2.start();
        t3.start();
        
        t1.setName("impresion");
        t2.setName("conexion");
        t3.setName("guardar");
     }
    
    @Override
    public void run() {
        try{
      if(Thread.currentThread().getName().equals("conexion"))Thread.sleep(8000);
      if(Thread.currentThread().getName().equals("impresion"))Thread.sleep(6000);
      if(Thread.currentThread().getName().equals("guardar"))Thread.sleep(10000);
    //ejecutarse.
        System.out.println(Thread.currentThread().getName());
        System.out.println("Soy medio Tred");
    }catch(Exception e){} 
  } 
}
