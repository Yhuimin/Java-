package cpuanddisk;

import hardisk.HardDisk;
import speed.CPU;

public class PC {
	//��������
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
	//�޲εĹ��췽��
	public PC() {
		super();
	}
	//�вεĹ��췽��
	public PC(CPU cpu, HardDisk hD, int age, String school) {
		super();
		this.cpu = cpu;
		HD = hD;
		this.age = age;
		this.school = school;
	}
	
	public void show(){
		System.out.println("cpu���ٶ��ǣ�"+cpu.getSpeed());
		System.out.println("cpu�������ǣ�"+HD.getAmount());	
	}
	
	
}
