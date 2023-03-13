
public class Driver {

private void helloWorld() {
	System.out.println("Hello World");
	
}

private int topla(int x,int y){
	int toplam = x + y;
	return toplam;   // burdaki return  bize metodun işleminin bittiğini ve geriye ilgili değeri döndürdüğü anlamına gelir.
	
	
}
 // iki metodun ismi parametre tipleri ve parametre sırası farklı olursa aynı olabilir.
private float topla(float x,int y){
	float toplam = x + y;
	return (float)toplam;   
	
}
private float topla(float x,float y){
	float toplam = x + y;
	return (float)toplam;   
	
}
private int topla(byte x,byte y){ // iki tane byte toplamı int oalcaktır
	int toplam = x + y;
	return toplam;   
	
}
public static void main(String[] args) {
	new Driver().helloWorld(); // satatik tanımlamalarda statik olamayan öetodlar çağırılamaz dolaysııyla bu değeri driver sınıfı üzerinden getirmeliyiz
// metodun imazası denilen kavram metodun adından ve adlığı parametrelerden oluşmaktadır. Metodun geri dönüş tipi metodun imzasına dahil değildir.

Driver driver=new Driver();
int sonuc = driver.topla(20, 30);

System.out.println(sonuc);

}
}
