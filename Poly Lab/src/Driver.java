import java.util.Arrays;
import java.util.Scanner;
public class Driver {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	
	DbConnection connection = (DbConnection) Class.forName(args[0]).newInstance(); // Class.forName metodu bie parametre olarak aldığı clasın tipini geri dönderir. args[0]  sıfırıncı argumanı almamızı sağlar
	connection.openConnection();
	connection.executeQuery("SELECT * FROM student");
	connection.closeConnection();// şimdi uygulamamızı çalıştırıken parametre olarak instancesini alınmasını istediğimiz sınıfın adını run configurationsatan göndericez.MySqlConnection yazdığımızda bu arguman bizim main metodumuza gönderilicek 
	//Class.forName metodu argumanın sıfırıncı indeksini alıcak yani MySqlConection ve MySqlConnection sınıfından bir ınstance alarak DbConnection referansında bu ınstanceyi tutucak sonrasında da openConnection ,executeQuery ve closeConnection  metodları çağırılıcak.  
	
	
	//newInstance metodu geriye object döndürmekte bizim istediğimiz tip ise DbConnection  dolayısıyla burda bir casting işlemi yapmalıyız.
	// yazdığımız uygulamalara arguman gönderebilmek için  Run driver ın yanında bulunan ok a tıklayarak run configurations diyoruz.Ve arguman kısmına istediğimiz argumanların arasında boşluk bırakarak gönderiyoruz. 
		 // yani biz uygulamamıza selam naber nasılsın diye ekledik gönderdiğimiz parametreler main metoduna  string args olarak gönderiliyor yani bir string array olarak gönderiliyor.
	
	
	
	// veritabanına bağlanmak için DbConnection isminde bir class oluşturduk

	// POSTGRECONNECTİON Sınıfını driver a tanımlamadan direkt olarak run configurations ardından arguments a ekleyerek çalıştırıabiliriz.
	// yani biz run time da istediğimiz bir sınıf tipini baseclass referansı üzerinde tutabiliriz, bu sınıfın tipi de run time da belli olduğu için kodlarımız genişlemeye açık değişikliğe kapalı hale gelmektedir.
	
	
/*DbConnection connection = new DbConnection();
connection.openConnection();
connection.executeQuery("SELECT*FROM STUDENT");
connection.closeConnection();


MySqlConnection mySQLConnection = new MySqlConnection(); 
mySQLConnection.openConnection();
mySQLConnection.executeQuery("SELECT*FROM student");
mySQLConnection.closeConnection();


MsSQLConnection msSQLConnection = new MsSQLConnection();
msSQLConnection.openConnection();
msSQLConnection.executeQuery("SELECT*FROM student");
msSQLConnection.closeConnection();*/
	
/*	Scanner scanner = new Scanner(System.in);
	System.out.println("Database tipi seçiniz [1 (MsSQL), 2 (MySQL),3 (OracleSQL)] : ");
	int dbType = scanner.nextInt();
	DbConnection dbConnection = null;
	switch (dbType) {   // switch case yapısı ekleyerek hangi sayıyı girersek o veri tabanının çalıştırılmasını sağlamış oluruz.
	case 1: 
		dbConnection= new MsSQLConnection();
		break;
	case 2: 
		dbConnection= new MySqlConnection();
		break;
	case 3: 
		dbConnection = new OracleConnection();
		break;
		default: System.out.println("Yanlış veri tabanı");
		break;
	}
	
	if (dbConnection != null) {
	dbConnection.openConnection();
	dbConnection.executeQuery("SELECT * FROM student");
	dbConnection.closeConnection();
	
	}*/
}
}
