
public class Daire extends Sekil {
	private int yariCap;
	public Daire (int y) {
		yariCap=y;
	}
	
	public int getYariCap () {
		return yariCap;
	}
	
	public void setYariCap ( int y) {
		
		yariCap=y;
	}
	public void alan() {
		System.out.println("Dairenin alanı : "  + (Math.PI*Math.pow(yariCap, 2)));
	}
	

}
