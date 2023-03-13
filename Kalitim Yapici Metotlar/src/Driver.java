
public class Driver {
public static void main(String[] args) {
	//A a = new A();
	//B b = new B();  // sadece B sınıfının constructorunu çağırmak istediğimizde A sınıfının ki de otomatik çalışır bunun sebebi B sınıfının A sınıfından miras almasıdır yani A sınıfı olmadan B sınıfı olamaz.

// Bu sebeple önce A sınıfının oluşturulması lazım . A sınıfı oluşturulduktan sonra B sınıfının A sınıfından miras alması lazım.

C c = new C("Text");
}
}
