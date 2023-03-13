package ders;

public class hafta5arraydiziler5 {

	public static void main (String [] args) {
		
		int [][] myNumbers = { { 11,12,13,14}, { 5,6,7} , {10,20,30} };
		int x = myNumbers [2][2];
		//System.out.println(x);
		
		int y =myNumbers [0][1];
		//System.out.println(y);
		
		for (int i =0; i<myNumbers.length; ++i) {
			
			
			for(int j=0; j< myNumbers[i].length; ++j) {
				System.out.println( myNumbers [i] [j]);
			}
		}
		
	}
}
