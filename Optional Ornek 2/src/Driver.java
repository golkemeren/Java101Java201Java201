import java.util.Optional;

public class Driver {

	public static void main(String[] args) {

		Motor motor =new Motor (1200);
Araba araba = new Araba ("X marka" , "Y model" ,Optional.ofNullable(motor));
System.out.println(araba);
	}

}
