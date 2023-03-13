
public class Dikdortgen extends Sekil{
	
private int genislik;
private int yukseklik;

public Dikdortgen(int a , int b) {
	genislik =a;
	yukseklik=b;
}

public int getGenislik () {
	return genislik;
}
public void setGenislik(int a) {
	genislik = a;
}
public int getYukseklik() {
	return yukseklik;
}
public void setYukseklik(int b) {
	yukseklik = b;
}

public void alan() {
	System.out.println("Dikdörtgenin Alanı :  "  +  (genislik*yukseklik));
	
}

}


