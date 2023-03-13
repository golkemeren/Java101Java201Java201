import java.util.Scanner;

public class Player {

	
private int damage,healty,money,rHealtly;


private String name,cName;  // name:oynayanın adı,cName: karakterinin adı. 
private Inventory ınv;

Scanner scan = new Scanner(System.in);

public Player(String name) {
	
	this.name = name;
}

public void selectCha() {
switch (chaMenu()) {
// Samuray seçildi
case 1 :
	initPlayer("SAMURAY", 15, 21, 5);
    break;
    //Okçu ise
case 2:
	initPlayer("OKÇU", 20, 18, 7);
    break;
    //şövalye ise
case 3:
	initPlayer("ŞÖVALYE", 5, 24, 8);
    break;
    
    default:
    	setcName("SAMURAY");
        setDamage(5);
        setHealty(21);
        setMoney(15);
        break;
        
}

System.out.println("Karakter :" + getcName() + "\t Hasar:" +getDamage() + "\t Sağlık :" +getHealty() + "\t Para :" +getMoney());
}

 public int chaMenu() {
	System.out.println("Lütfen bir karakter seçiniz:");
	System.out.println("1-Samuray \t Hasar:5 \t Sağlık:21 \t Para:15");
	System.out.println("2-Okçu    \t Hasar:7 \t Sağlık:18 \t Para:20");
	System.out.println("3-Şövalye \t Hasar:8 \t Sağlık:24 \t Para:5");
System.out.println("Karakter seçiniz :");
    int chaId = scan.nextInt();
    while (chaId<1  || chaId>3) {
    	System.out.print("Lütfen geçerli bir karakter giriniz");
          chaId=scan.nextInt();
    }
	return chaId;
}

public void initPlayer (String cName, int dmg ,int hlty , int mny) {
	setcName(cName);
	setDamage(dmg);    // switch-case içinde sürekli tekrar eden metotları fonksiyon olarak bir kere oluşturduk ve kodu kısaltmış olduk .
	setHealty(hlty);
    setMoney(mny);	
    setrHealtly(healty);
}


public int getDamage() {
	return damage;
}
public void setDamage(int damage) {
	this.damage = damage;
}
public int getHealty() {
	return healty;
}
public void setHealty(int healty) {
	this.healty = healty;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public Inventory getInv() {
	return ınv;
}
public void setInv(Inventory inv) {
	ınv = inv;
}

public int getrHealtly() {
	return rHealtly;
}

public void setrHealtly(int rHealtly) {
	this.rHealtly = rHealtly;
}



}
