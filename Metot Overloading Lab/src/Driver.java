import java.util.Date;

public class Driver {
public static void main(String[] args) {
	
	
	Calisan calisan1 = new Calisan();
	calisan1.bilgileriYazdir();
	Calisan calisan2 = new Calisan("IT");
	calisan2.bilgileriYazdir();
	Calisan calisan3=new Calisan("IT","ALI CAN");
	calisan3.bilgileriYazdir();
	Calisan calisan4 = new Calisan ("IT" , "ALI CAN ",new Date());
calisan4.bilgileriYazdir();
}
}
