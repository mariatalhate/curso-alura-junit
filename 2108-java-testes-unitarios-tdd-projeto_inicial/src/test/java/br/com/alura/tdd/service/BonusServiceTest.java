package br.com.alura.tdd.service;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Maria", LocalDate.now(), new BigDecimal ("25000")));
		
		assertEquals(BigDecimal.ZERO, bonus);
		
	
	}
	
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Maria", LocalDate.now(), new BigDecimal ("2500")));
		
		assertEquals(new BigDecimal("250.0"), bonus);
		
	
	}

}
