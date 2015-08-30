package br.aquino;

public class Cartesiano{
	private int x;
	private int y;

	public Cartesiano(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void move(RosaVentos rosaVentos){
		switch (rosaVentos) {
		case N:
			this.y = this.y + 1;
			break;
		case S:
			this.y = this.y - 1;
			break;
		case W:
			this.x = this.x - 1;
			break;
		case E:
			this.x = this.x + 1;
			break;
		default:
			break;
		}
	}

	@Override
	public String toString(){
		return String.format("(%s, %s)", this.x, this.y); 
	}
}
