package speed;

public class CPU {
	//��������	
	private int speed;
	private int weight;
	
	//int speed;
	public void setSpeed(int m){
		speed=m;
	}
	
	public int getSpeed(){
		return speed;
	}
	//���췽��	
	public CPU() {
		super();
	}
	public CPU(int speed, int weight) {
		super();
		this.speed = speed;
		this.weight = weight;
	}
	
	
	
	
}
