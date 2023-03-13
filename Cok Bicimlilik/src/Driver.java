
public class Driver {
public static void main(String[] args) {
/*	Hayvan hayvan =new Hayvan();
hayvan.ses();

Kedi kedi = new Kedi();
kedi.ses();

Kopek kopek = new Kopek();
kopek.ses(); */
	Hayvan hayvan = new Kus();  // hayvan tipinde bir köpek ınstancesi alabiliriz çünki her köpek bir hayvandır
	hayvan.ses();  // bu şekilde çalışma zamanında yadığımız kodların davranışlarını değiştirebiliriz.
// yani baseclass üzerinden sub classlarıda tutabilir hale geliryoruz.
	
}

}
