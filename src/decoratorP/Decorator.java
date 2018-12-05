package decoratorP;

//装饰者模式，有一个包装类是所有方法的父类，可实现方法的组合叠加
public class Decorator {

	public static void main(String[] args) {
		Coffee coffee = new CoffeeImpl();//黑咖啡
		Sugar sugar = new Sugar(coffee);
		
		Coffee milk = new Milk(sugar);
		Coffee honey = new Honey(milk);
		honey.coffee();
	}
}

/*首先定义一个接口来规范咖啡.*/
interface Coffee{
	void coffee();
}

/*实现这个上面这个接口中的方法.*/
class CoffeeImpl implements Coffee{
	@Override
	public void coffee() {
		System.out.println("黑咖啡");
	}
}

/*在给黑咖啡添加调味品之前,我们先定义一个类,
 * 这个类是所有添加调味品咖啡的父类,进行包装*/
class CoffeeWrapper implements Coffee{
	private Coffee coffee;
	public CoffeeWrapper(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void coffee() {
		coffee.coffee();
	}
}

/*加糖咖啡*/
class Sugar extends CoffeeWrapper{

	public Sugar(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void coffee() {
		super.coffee();
		System.out.println("加糖");
	}
}
	/*加奶咖啡*/
	class Milk extends CoffeeWrapper{
		
		public Milk(Coffee coffee) {
			super(coffee);
		}
		
		@Override
		public void coffee() {
			super.coffee();
			System.out.println("加奶");
		}
	
}
	/*加奶咖啡*/
	class Honey extends CoffeeWrapper{
		
		public Honey(Coffee coffee) {
			super(coffee);
		}
		
		@Override
		public void coffee() {
			super.coffee();
			System.out.println("蜂蜜");
		}
		
	}
	





