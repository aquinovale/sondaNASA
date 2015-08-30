package br.aquino;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void sonda1() {
		Posicao sonda1 = new Posicao(new Cartesiano(1, 2), RosaVentos.N);
		sonda1.Movimentacao(Movimentos.L);
		sonda1.Movimentacao(Movimentos.M);

		sonda1.Movimentacao(Movimentos.L);
		sonda1.Movimentacao(Movimentos.M);

		sonda1.Movimentacao(Movimentos.L);
		sonda1.Movimentacao(Movimentos.M);

		sonda1.Movimentacao(Movimentos.L);
		sonda1.Movimentacao(Movimentos.M);
		sonda1.Movimentacao(Movimentos.M);
		
		assertEquals("(1, 3) N", sonda1.toString());
	}
	@Test
	public void sonda2() {
		Posicao sonda2 = new Posicao(new Cartesiano(3, 3), RosaVentos.E);
		sonda2.Movimentacao(Movimentos.M);
		sonda2.Movimentacao(Movimentos.M);

		sonda2.Movimentacao(Movimentos.R);
		sonda2.Movimentacao(Movimentos.M);
		
		sonda2.Movimentacao(Movimentos.M);
		sonda2.Movimentacao(Movimentos.R);
		
		sonda2.Movimentacao(Movimentos.M);
		sonda2.Movimentacao(Movimentos.R);
		
		sonda2.Movimentacao(Movimentos.R);
		sonda2.Movimentacao(Movimentos.M);
		
		assertEquals("(5, 1) E", sonda2.toString());
	}
}
