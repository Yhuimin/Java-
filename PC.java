package cpuanddisk;

import hardisk.HardDisk;
import speed.CPU;

public class PC {
	//声明对象
    CPU cpu;
	HardDisk HD;
	
	private int age;
	protected  String school;
	
	public void setCPU(CPU c){
		cpu=c;
	}
	public void setHardDisk(HardDisk h){
		HD=h;
	}		
	//无参的构造方法
	public PC() {
		super();
	}
	//有参的构造方法
	public PC(CPU cpu, HardDisk hD, int age, String school) {
		super();
		this.cpu = cpu;
		HD = hD;
		this.age = age;
		this.school = school;
	}
	
	public void show(){
		System.out.println("cpu的速度是："+cpu.getSpeed());
		System.out.println("cpu的容量是："+HD.getAmount());	
	}
	
	
}
