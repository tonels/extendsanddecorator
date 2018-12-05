package extendsP;

//继承方式实现方法加强
public class ExtendsCoffee {
	
	//测试模拟
	public static void main(String[] args) {
		Coffee coffee = new Milk();
		coffee.blankCoffee();
	}
}
/*创建一个咖啡的类，里面有黑咖啡*/
class Coffee{
	void blankCoffee(){
		System.out.println("黑咖啡……");
	}
}
/*对黑咖啡加糖*/
class Sugar extends Coffee{

	@Override
	void blankCoffee() {
		super.blankCoffee();
		System.out.println("加糖");
	}
}
/*对黑咖啡加奶*/
class Milk extends Coffee{
	
	@Override
	void blankCoffee() {
		super.blankCoffee();
		System.out.println("加奶");
	}
}
/*对黑咖啡加蜂蜜*/
class Honey extends Coffee{
	
	@Override
	void blankCoffee() {
		super.blankCoffee();
		System.out.println("加蜂蜜");
	}
}