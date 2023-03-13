
public class Kare extends Sekil {
	
	
	private int kenarUzunlugu;
	public Kare (int u) {
		kenarUzunlugu=u;
	}
	 public int getKenarUzunglugu () {
		return kenarUzunlugu;
	}
	 public void setKenarUzunlugu(int u) {
		 
kenarUzunlugu = u;
	 }
	
	
	public void alan () {
		System.out.println("Karenin alanı:  "   +  (Math.pow(kenarUzunlugu, 2)));
		
	}

}
