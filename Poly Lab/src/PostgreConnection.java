
public class PostgreConnection extends DbConnection {
	public void openConnection(){
		System.out.println("Postgre bağlantısı açıldı");
		
	}
	public void closeConnection () {
		System.out.println("Postgre bağlantısı kapatıldı ");
		
	}
	public void executeQuery(String sql) {
		System.out.println("PostgreSQL komutları çalıştırıldı ");
	}
 
}
