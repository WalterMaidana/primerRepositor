package www.unlam.edu.ar;

/*import static org.junit.Assert.*;*/
import org.junit.Assert;
import org.junit.Test;

public class ContadorDeGanadoTest
{

	@Test
	public void testQuePuedaContar()
	{
		//1. Preparación
		/*de tipo CuentaGanado*/CuentaGanado miContador=new CuentaGanado();
		Integer cantidadEsperada=1;
		
		//2. Ejecución
		miContador.contar ();
		Integer cantidadObtenida = miContador.mostrarCantidad ();
		
		//3. Contrastación
	    Assert.assertEquals (cantidadEsperada, cantidadObtenida);
	    miContador.resetearCuenta();
		//4. Limpieza - Puede prescindirse ya que se encarga el
	    
	    miContador=null;
		
		
	}


}
