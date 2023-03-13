import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {
public static void main(String[] args) {
	Araba araba = new Araba();
	araba.setPlaka("34AA0123");
	araba.setMarka("X Marka");
    araba.setModel("Y model");
    araba.setYil(2020);
Motor motor = new Motor();
motor.setHacim(1600);
araba.setMotor(motor);


File file = new File ("araba.bin");
FileOutputStream fileOutputStream = null;
ObjectOutputStream objectOutputStream = null;

try {
	fileOutputStream = new FileOutputStream(file);
	objectOutputStream = new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(araba);
} catch (Exception e) {
	System.out.println(e.getMessage());
}finally {
	try {
		if (objectOutputStream != null) {
			objectOutputStream.close();
		}
		if(fileOutputStream != null) {
			fileOutputStream.close();
		}
	} catch (Exception e2) {
	System.out.println(e2.getMessage());
	}
}

}
}
