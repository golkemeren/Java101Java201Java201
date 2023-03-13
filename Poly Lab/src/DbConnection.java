
public class DbConnection {
// veri tabanı işlemlerinin burası üzerinden yapılcağını varsayalım

public void openConnection () {  // openConnection ile veritabanı bağlantısının açıldığını düşünelim.
	System.out.println("VeriTabanı Bağlantısı Açıldı");
}
public void closeConnection () {
	System.out.println("Veri tabanı bağlantısı kapatıldı");
}
public void executeQuery(String sql) {
	System.out.println("SQL komutları çalıştırıldı");
}
}
