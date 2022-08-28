package br.com.alura.tdd.modelo;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Maria", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.0"), bonus);
	}
	
	@Test
	void bonusNaoDeveriaExistir() {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class, 
				() -> service.calcularBonus(new Funcionario("Maria", LocalDate.now(), new BigDecimal("11000"))));
	}

	
	// nesse caso, fizemos o desenvolvimento antes e os testes automatizados depois
	// mas tambem existe TDD: test driven development
	
	
	
	
	
}