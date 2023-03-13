
public /*final*/class Ogrenci {
 private final int numara; // final koyarsak uygulamanaın herhangi bir yerinde numara değişkeninini değiştirilemez yapmış oluruz
 // final olarak işaretlenen değerlerin ilk ataması yapıldıktan sonra değerleri değiştirilemez.
 //final değişkenlerin ilk değeri değişkenin tanımlandığı anda veya sınıfın constructor unda yani yapıcı metodunda yapılabilir. 
 // eğer bir sınıfın başına final yazaarsak o sınıftan hiçbir sınıf türeyemez
 // örneğin Math ve String sınıfı final olarak işaretlenmiştir bu sebeple bunlardan türeyen başka bir işlem  yapamayız
 public Ogrenci (int n ) {  // dolayısıyla bir constructor oluşturup sınıfın yapıcı metodunda final tanımladık .
	 numara=n; 
	 }
 
 public int getNumara() {
	 return numara;
	 // final anahtar kelimesinin bir diğer kullanım şekli de  metotlar üzerinden kullanımdır.
 // yani final override edilemez genişletilemez tekrardan tanımlanamaz anlamlarına gelir.
 }
 public void yazdir() {
	 System.out.println(numara);
	 
 }

 
}
// Yani kısacası  final anahtar kelimesinin 3 farklı kullanımı vardır 
//1. si final anahtar kelimesini değişkenlerin başına yazarak ilk değerinin  atandıktan sonra değiştirilmesini engellemek .
//2 . si sınıfların başına yazarak bu sınıflardan miras alınmasını engellemek 
// 3 . sü ise metodların başına final koyup bu metodların miras alınan sınıflar tarafından  tekrar tanımlamasını engellemek oldu 
// final bize kısıtlama işlemlerind eyardımcı oldu object oryanted dünyada programlama yaparken yazdığımız kodları başkası kullanacakmış gibi düşünmemiz gerekiyor. 
// finakl kullanmaktan çekinmemeliyiz o sınıfı kullanacak kişiler o sınıfın değiştirimemesi gerektiğini final anahtar kelimesinden anlayabilirler.