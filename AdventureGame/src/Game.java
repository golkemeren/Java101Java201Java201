import java.util.Scanner;

public class Game {

	Scanner scan = new Scanner(System.in);
	Player player ;
	Location location;
	
	
	public void login () {
Scanner scan = new Scanner(System.in);
	
	System.out.println("Macera oyununa hoşgeldiniz ");
     System.out.println("Oyuna başlamadan önce isminizi giriniz :");
    // String playerName= scan.nextLine();
     player = new Player("a");
 	player.selectCha();
 	
 	start();	
}   
	
	public void start () {
		
		
		while (true) {
			System.out.println();
			System.out.println("==============================================================0");
			System.out.println();
			System.out.println("Lütfen bir harita seçiniz");
			System.out.println("1. Güvenli Ev --> Size ait güvenli bir mekan, düşman tehlikesi yok ! ");
			System.out.println("2.Mağara  --> Karşınıza belki zombi çıkabilir.!!");
			System.out.println("3.Orman  --> Karşınıza belki vampir çıkabilir.!!");
			System.out.println("4.Nehir  --> Karşınıza belki ayı çıkabilir.!!");
			System.out.println("5.Mağaza  --> Silah veya Zırh alabilirsiniz.!!");
			System.out.println("Gitmek istediğiniz yeri seçiniz :");
			
			int selLoc = scan .nextInt();
			while (selLoc<1 || selLoc>5) {
				System.out.println("Lütfen Geçerli bir harita seçiniz ");
				selLoc=scan.nextInt();	
			}
			switch (selLoc) {
			case 1: location = new safeHouse(player);
			       break;
			       default: location = new safeHouse(player);
			}
			
		if (!location.getLocation()) { 
			System.out.println("OYUN BİTTİ");
		     break;
		}
			
		}
		
	}
	

	}
