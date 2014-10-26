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
public class DCPalitosDePan extends ComplementoDecordador{
    
    Paquete paquete;
    
    public DCPalitosDePan(Paquete paquete)
	{
		this.paquete=paquete;	
	}

    @Override
    public String getDescripcion() {
        return paquete.getDescripcion()+"\nPalitos de pan espolvoreados con queso parmesano acompañados de rica salsa boloñesa";
    }

    @Override
    public int valor() {
        return 50+paquete.valor();
    }
    
}
