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
public class DCPopsDeQueso extends ComplementoDecordador{
        Paquete paquete;
    
    public DCPopsDeQueso(Paquete paquete)
	{
		this.paquete=paquete;	
	}

    @Override
    public String getDescripcion() {
        return paquete.getDescripcion()+"\nBocados rellenos de queso mozzarella, espolvoreados con queso parmesano y hierbas finas";
    }

    @Override
    public int valor() {
        return 65+paquete.valor();
    }
}
