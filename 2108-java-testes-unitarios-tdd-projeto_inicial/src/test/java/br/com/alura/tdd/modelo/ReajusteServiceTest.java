package br.com.alura.tdd.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class ReajusteServiceTest {

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Maria", LocalDate.now(), new BigDecimal("1000.00"));
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Maria", LocalDate.now(), new BigDecimal("1000.00"));
		service.concederReajuste(funcionario, Desempenho.BOM);

		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Maria", LocalDate.now(), new BigDecimal("1000.00"));
		service.concederReajuste(funcionario, Desempenho.OTIMO);

		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeQuarentaPorcentoQuandoDesempenhoForEspetacular() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Maria", LocalDate.now(), new BigDecimal("1000.00"));
		service.concederReajuste(funcionario, Desempenho.ESPETACULAR);

		assertEquals(new BigDecimal("1400.00"), funcionario.getSalario());
	}

}
