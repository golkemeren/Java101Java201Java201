
public class Driver {
public static void main(String[] args) {
	Araba araba =new Araba();
	araba.setMarka("X marka");
	araba.setModel("Y model");
	// araba sınıfının içerisindeki model sınıfından bir ınstance alalım 
	Araba.Motor motor = araba.new Motor();  // burda dikkat edilmesi gereken işlem iç sınıfın yani motor sınıfının  araba nesnesi üzerinden oluşturulmasdır. 
	motor.setHacim(1600);
	araba.setMotor(motor);
	
	System.out.println(araba.getMarka());
	System.out.println(araba.getModel());
	System.out.println(araba.getMotor().getHacim());
	
}
}
