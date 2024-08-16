
public class DeluxPizza extends Pizza{
	public DeluxPizza(boolean veg) {
		super(veg);
		super.addCheese();
		super.addToppings();
	}
	@Override
	public void addCheese() {}
	@Override
	public void addToppings() {}
	
	public void takeAway() {
		super.takeAway();
	}
	public void getBill() {
		super.getBill();
	}

}
