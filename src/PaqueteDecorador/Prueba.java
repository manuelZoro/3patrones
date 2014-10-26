/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteDecorador;

/**
 *
 * @author Memito
 */
public class Prueba {
    public static void main(String[]args){
        Paquete p= new PaquetePareja();
        p= new DCPalitosDePan(p);
        p= new DCQuePapas(p);
        System.out.println(p.getDescripcion()+"\n $ "+p.valor());
        
    }
}
