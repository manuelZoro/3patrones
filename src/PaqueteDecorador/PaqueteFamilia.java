package PaqueteDecorador;
/**
 * Indica un tipo de combo Especial, 
 * heredando de la clase padre Combo
 * @author chenao
 *
 */
public class PaqueteFamilia extends Paquete{

	public PaqueteFamilia()
	{
		descripcion="2 Pizzas \n" + "Pops de Queso, Palitos de Pan \n"+ "Refresco de (2 L)";
	}
	
	@Override
	public int valor() {
		return 220;
	}
	
	
}
