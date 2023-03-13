
public class Karga implements Ucabilir,Yuruyebilir{
 // birden fazla interfaces i implements etmek için virgül kullanıyoruz
	 // interfaceslerin asıl amacı yetenek belirtmektir.
	@Override 
	public void uc() {
		System.out.println("Kargalar Uçabilir");
	}
	
	@Override 
	public void yuru() {
		System.out.println("Kargalar yürüyebilir");
	}
	
}
