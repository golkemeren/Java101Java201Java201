import java.util.Arrays;
import java.util.Comparator;
public class Driver {
public static void main(String[] args) {
	
	Elma []elmalar = {
			new Elma (10) ,
			new Elma(40),
			new Elma (20),
			new Elma (50),
	};
  // sort Arrayi kendisine verilen array i sıralamak için kullanılır burda neye göre sıralama yapaıcağını belirtmemiz gerkir.
	// eğer bu array byte,char,double veya int  arryi ise direk sıralar ancak bizim örneğimizdeki gibi custom bir sınıf ise burda sınıf tanımladığımızdan belirtmemiz gerekir
	// solayısıyla sort metodu bizden ikinci bir parametre olarak  comparatör interfaces i olarak tanımlanan bir interfaces ister.comperator interc-facesinden tureyen bir sınıf göndermeliyiz.
	System.out.println(Arrays.toString(elmalar));
	Arrays.sort(elmalar,new Comparator() {
		@Override
		public int compare ( Object o1,Object o2) {
			Elma e1=(Elma)o1;
			Elma e2 = (Elma)o2;
			return e1.getAgirlik()-e2.getAgirlik();
		}
	});
	Arrays.sort(elmalar,new Comparator() {
		@Override
		public int compare ( Object o1,Object o2) {
			Elma e1=(Elma)o1;
			Elma e2 = (Elma)o2;
			return e1.getAgirlik()-e2.getAgirlik();
		}
	});
	// 
	System.out.println(Arrays.toString(elmalar));
}
}
