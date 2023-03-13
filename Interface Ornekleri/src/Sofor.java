
public class Sofor implements Surebilir{
	// Soforun araba sürme kabiliyeti var dolaysıyla surebilir ınterfaces 'ini implement edebilir.  
	// daha önnce sınıfları biribirinin alt sınfıı olarak belirlemek isterken extends kullanıyorduk şimdi ise implements kullanıyoruz

	@Override
	public void sur() {
		System.out.println("Şöfor araç sürebilir");
		
	} 
}
