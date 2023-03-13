import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		int sonuc = JOptionPane.showConfirmDialog(null, "Varmısın / Yokmusun?","Yarışma",JOptionPane.YES_NO_OPTION,3);
		if (sonuc == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null,"Varım dedii !");
		else 
			JOptionPane.showMessageDialog(null, "YOKUM DEDİ !!");

	}

}
