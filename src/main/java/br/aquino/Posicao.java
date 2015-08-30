package br.aquino;

import br.aquino.Cartesiano;
import br.aquino.Movimentos;
import br.aquino.RosaVentos;

public class Posicao{
	
	private Cartesiano cartesiano;
	private RosaVentos rosaVentos;

	public Posicao(Cartesiano cartesiano, RosaVentos rosaVentos){
		this.cartesiano = cartesiano;
		this.rosaVentos = rosaVentos;
	}
	
	public void Movimentacao(Movimentos mov){
		if(!mov.toString().equals("M")){
			moveRosaVentos(mov);
		}else{
			moveCartesiano();
		}
	}
	
	private void moveCartesiano() {
		cartesiano.move(this.rosaVentos);
	}

	private void moveRosaVentos(Movimentos mov){
		rosaVentos = rosaVentos.doMove(mov);
	}

	@Override
	public String toString(){
		return cartesiano.toString() + " " + rosaVentos.toString();
	}
}
