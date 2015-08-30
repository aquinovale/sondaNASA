package br.aquino;

public enum Movimentos{
	L("L"),R("R"),M("M");
	
	private String value;
	
	Movimentos(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}

}
