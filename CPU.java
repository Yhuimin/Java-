package speed;

public class CPU {
	//定义属性	
	private int speed;
	private int weight;
	
	//int speed;
	public void setSpeed(int m){
		speed=m;
	}
	
	public int getSpeed(){
		return speed;
	}
	//构造方法	
	public CPU() {
		super();
	}
	public CPU(int speed, int weight) {
		super();
		this.speed = speed;
		this.weight = weight;
	}
	
	
	
	
}
