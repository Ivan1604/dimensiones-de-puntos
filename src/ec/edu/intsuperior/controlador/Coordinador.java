
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Punto;

/**
 *
 * @author PC-IVAN
 */
public class Coordinador {
   
    Punto array[];
    public void dimension(int dim){
        array=new Punto[dim];
    }
    public int getLongitud(){
        return array.length;
    }
    public void llenarArreglo(int x, int y){
        int i=0;
        while(array[i]!=null){
            i++;
        }
            
                array[i]=new Punto(x, y);
                        
        
    }
}
