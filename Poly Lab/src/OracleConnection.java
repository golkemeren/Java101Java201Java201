
public class OracleConnection extends DbConnection {

	public void openConnection() {
		System.out.println("Oracle bağlantısı açıldı");
		
	}
	public void closeConnection() {
		System.out.println("Oracle bağlantısı kapatıldı");
		
	}
	public void executeQuery(String sql) {
		System.out.println("Oracle komutları çalıştırıldı");
	}
	
}
