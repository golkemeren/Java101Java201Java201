
public abstract class Obstacle extends battleLocation {


	Obstacle(Player player, String name,Obstacle obstacle) {
		super(player,name);
		
	     this.obstacle = obstacle;
	     this.name=name;
	     
	}
	
	

}
