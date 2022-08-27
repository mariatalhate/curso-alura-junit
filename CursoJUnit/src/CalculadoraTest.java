import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CalculadoraTest {
	@Test
	public void deveriaSomarDoisNumerosPositivos () {
		Calculadora calc = new Calculadora ();
		int soma = calc.somar(3, 7);
		// Como dizer pro JUnit verificar se o teste está correto ou não
		// No caso, estará correto se a variável soma valer 10
		// Assert.assertEquals(12, soma); //erra
		Assert.assertEquals(10, soma); //acerta
		
		// em vez de usar varios cenarios, cada cenário vira um @teste separado
	}
	
}
