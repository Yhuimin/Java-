# Java-
## Java课程作业项目仓库
### 实验目的
	掌握类的运用（变量的声明、方法的定义），构造方法与对象的创建，以及访问权限（private、protected、public）的具体操作
### 实验内容
	用Java应用程序建PC、CPU、HardDisk以及主类Test这4个类，
	
	其中，CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋给speed；
	
	HardDisk类要求getAmount()返回amount的值，要求setAmount (int m)方法将参数m的值赋给amount；
	
	PC类要求setCPU(CPU c)将参数c的值赋给cpu, 要求setHardDisk (HardDisk h)方法将参数h的值赋给HD，要求show()方法能显示cpu的速度和硬盘的容量；
	
	主方法的要求：
	
	（1）main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200；
	
	（2）main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200；
	
	（3）main方法中创建一个PC对象pc；
	
	（4）pc调用setCPU(CPU c)方法，调用时实参是cpu；
	
	（5）pc调用setHardDisk(HardDisk  h)方法，调用时实参是disk；
	
	（6）pc调用show()方法
	
	
### 试验方法
    创建4个类，前3个类都需要定义该类的属性和方法，用set()方法来设置对象中的数据成员值、get()方法来获取对象中的数据成员值，主类中需要创建3个对象，然后对象给变量赋值，并通过set()方法调用实参，最后通过调用show()方法输出显示结果	   
### 核心方法/伪代码
```
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
  ```
   ```
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
  ```
   ```
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
  ```
   ```
  public static void main(String[] args) {
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
```
### 实验结果
·
![img](http://note.youdao.com/yws/public/resource/72aa84bd3a5d198f1794c36f35956f84/xmlnote/WEBRESOURCE0ecaa4d00568afcef6a040cfd437cc3d/13)
	
### 实验感想

    通过这次实验，我更加了解了类的成员、变量、对象以及构造方法的使用，还有4个访问权限符的作用
    
