
public class RenkFiltresi implements ElmaFiltresi { 
	 
	@Override 
	public boolean filtrele(Elma elma) {
		return elma.getRenk().equals("Kırmızı");  // eğer parametre olarak göndrerilen elmanın rengi kırmızı ise true döndericek
		
	}

}
