import java.util.Comparator;

public class ElmaKarsilastirici implements Comparator {

	@Override
	public int compare(Object o1, Object o2) { // o1 ve o2 bizim senaryomuzda elma nesneleri olucak
		// int bir değerdöndermemiz istiyor. eğer parametre olarak gönderilen iki nesne bizim parametremizde eşit olarak değerlendiriliyorsa geiye sıfır,ilk nesne daha büyük ikinci nesne daha küçükse geriye pozitif,ikinci nesne daha büyük birinci nesne daha küçükse geriye negatif bir değer döndürmemiz gerekiyor 
		// dolayısıylamatematiksel düşünüp e1 in ağırlığını e2 nin ağırlığından çıkatıcaz.
		Elma e1 = (Elma)o1;
		Elma e2 = (Elma)o2;
		return e1.getAgirlik() - e2.getAgirlik(); // e1 in ağırlığının 10 olduğunu düşünelim e2 nin ağırlığının 20 olduğunu düşünelim dolayısıyla 10-20 den eksi bir değer dönücek dolayısıyla ilk gönderilen elmanın küçük olduğu anlaşılıcak
		// ilk çalıştırdığımızda elmaların küçükten büyüğe sırlandığını görebiliriz.Burda ElmaKarsilastici sınıfının içerisinde bunu belirleyebilriiz.
// e2 - e1 yaparsak bu sefer büyükten küçüğe sıralama yapılır.
		// ancak bu sıralama işlemi sadece tek bir defa gerçekleştirilecektir.Yani bu ElmaKarsilastici sınıfınını biz başka bir yerde kullanmıyıcaz.Burda yeni bir sınıf oluşturup aynı tanımları yapmak uzun sürecek ve maliyetli olacağından yardımımıza anonymus ınner classs lar koşacaktır  
	}

}
