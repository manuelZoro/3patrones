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
public class DCPalitosRellenos extends ComplementoDecordador{
        Paquete paquete;
    
    public DCPalitosRellenos(Paquete paquete)
	{
		this.paquete=paquete;	
	}

    @Override
    public String getDescripcion() {
        return paquete.getDescripcion()+"\nPalitos de pan rellenos de queso crema y mozzarella";
    }

    @Override
    public int valor() {
        return 60+paquete.valor();
    }
}
