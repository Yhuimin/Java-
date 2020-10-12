package hardisk;

public class HardDisk {
	
	private int amount;
	protected double area;
	
	public void setAmount(int m){
		amount=m;
	}
	public int getAmount(){
		return amount;
	}
	//构造方法	
	public HardDisk() {
		super();
	}
	public HardDisk(int amount, double area) {
		super();
		this.amount = amount;
		this.area = area;
	}
	
	
	
}
