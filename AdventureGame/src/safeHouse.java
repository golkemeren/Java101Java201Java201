
public class safeHouse extends normalLoc {

	safeHouse(Player player ) {
		super(player, "Güvenli Ev");
	}
		public boolean getLocation() {
		player.setrHealtly(player.getrHealtly());
	System.out.println("Şuan Güvenli Evdesiniz .");
		System.out.println("Canınız Fullendi");
		return true;
		}
	

}
