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
public class DCQuePapas extends ComplementoDecordador {

    Paquete paquete;

    public DCQuePapas(Paquete paquete) {
        this.paquete = paquete;
    }

    @Override
    public String getDescripcion() {
        return paquete.getDescripcion() + "\nDeliciosas bolitas de papa empanizadas, con queso y jalapeño";
    }

    @Override
    public int valor() {
        return 65 + paquete.valor();
    }
}
