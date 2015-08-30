package br.aquino;

public enum RosaVentos{
	N("N", 0),W("W", 90),S("S", 180),E("E", 270);
	
	private String name;
	private int value;
	
	RosaVentos(String name, int value){
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	public RosaVentos doMove(Movimentos mov){
		switch (mov) {
		case L:
			return newDirection(limits(value + 90));
		case R:
			return newDirection(limits(value - 90));
		default:
			break;
		}
		return RosaVentos.N;
	}
	
	private RosaVentos newDirection(int value) {
		if(value < 90){
			return RosaVentos.N;
		}else if(value >= 90 && value < 180){
			return RosaVentos.W;
		}else if(value >= 180 && value < 270){
			return RosaVentos.S;
		}else if(value >= 270 && value < 360){
			return RosaVentos.E;
		}
		return RosaVentos.N;
	}

	private int limits(int value){
		if(value >= 360){
			value = 0;
		}else if(value < 0 ){
			value = 270;
		}
		return value;
	}
	
	
}
