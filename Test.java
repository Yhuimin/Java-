package main;

import cpuanddisk.PC;
import hardisk.HardDisk;
import speed.CPU;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//��������
		CPU cpu;
		HardDisk disk;
		PC pc;
		//Ϊ����������
		cpu = new CPU(); 
		disk = new HardDisk();
		pc = new PC();*/
		//��������
		CPU cpu = new CPU();
		HardDisk disk = new HardDisk();
		PC pc = new PC();
		//������Լ��ı�����ֵ
		cpu.setSpeed(2200);
		disk.setAmount(200);
		/*//�����.���Եķ���
		cpu.speed=2200;
		disk.amount=200;*/
		
		//pc����**����
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}

}
