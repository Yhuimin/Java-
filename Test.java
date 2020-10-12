package main;

import cpuanddisk.PC;
import hardisk.HardDisk;
import speed.CPU;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//声明对象
		CPU cpu;
		HardDisk disk;
		PC pc;
		//为对象分配变量
		cpu = new CPU(); 
		disk = new HardDisk();
		pc = new PC();*/
		//创建对象
		CPU cpu = new CPU();
		HardDisk disk = new HardDisk();
		PC pc = new PC();
		//对象给自己的变量赋值
		cpu.setSpeed(2200);
		disk.setAmount(200);
		/*//类对象.属性的方法
		cpu.speed=2200;
		disk.amount=200;*/
		
		//pc调用**方法
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}

}
