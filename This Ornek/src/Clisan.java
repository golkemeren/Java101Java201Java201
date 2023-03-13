import java.util.Date;

public class Clisan {

	private String isim;
	private double maas;
	private Date iseBaslamaTarihi;
	// this anahtar kelimesinin kulllanımına bir diğer örnekte constructor çağırımıdır.
	
	public Clisan() {
		this ("Bilinmiyor");
	}
	
	public Clisan(String isim) {
		this(isim,0);
	}
	public Clisan (String isim , double maas) {
		this(isim,maas,null);
	}
	public Clisan (String isim , double maas ,Date iseBaslamaTarihi) {
	this.isim = isim;
	this.maas = maas;
	this.iseBaslamaTarihi = iseBaslamaTarihi;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim=isim;  // burda this dediğimizde sınıfın kendisi referans edilmektedir.Dolayısıyla sınıfın içindeki isim değişkeninin değrri isim e eşit demiş oluyrouz.
	
	} 
	
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas=maas;
	}
	public Date getIseBaslamaTarihi() {
		return iseBaslamaTarihi;
	}
	public void setIseBaslamaTarihi(Date iseBaslamaTarihi) {
	this.iseBaslamaTarihi=iseBaslamaTarihi;	
	}
	
	public void yazdir() {
		System.out.println("İsim: "  + isim);
		System.out.println("Maas:  "  +  maas );
		System.out.println("İşe Başlama Tarihi :  " + iseBaslamaTarihi);
	}
}
