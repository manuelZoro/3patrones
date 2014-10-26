package PaqueteDecorador;

/**
 * Indica un tipo de combo basico, 
 * heredando de la clase padre Combo
 * @author chenao
 *
 */
public class PaquetePareja extends Paquete{

	public PaquetePareja() {
		descripcion="1 Pizza \n" + "Que Papas \n" + "2 Refrescos de 600 ml";
	}
	
	@Override
	public int valor() {
		return 200;
	}
}
