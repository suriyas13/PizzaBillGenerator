
public class Pizza {
	private int price;
	private boolean veg;
	private int cheeseprice=100;
	private int toppingsprice=150;
	private int bagprice=20;
	private int pizzaprice;
	private boolean isaddedCheese;
	private boolean isaddedtoppings;
	private boolean isaddedbag;
	public Pizza(boolean veg) {
		this.veg = veg;
		if(this.veg) {
			price=300;
		}else {
			price=400;
		}
		pizzaprice=price;
		
	}
	public void addCheese() {
		price+=cheeseprice;
		isaddedCheese=true;
	}
	public void addToppings() {
		price+=toppingsprice;
		isaddedtoppings=true;
	}
	public void takeAway() {
		price+=bagprice;
		isaddedbag=true;
	}
	public void getBill() {
		String bill="";
		bill+="Pizza: "+pizzaprice+"\n";
		if(isaddedCheese) {
			bill+="Extra Cheese: "+cheeseprice+"\n";
		}
		if(isaddedtoppings) {
			bill+="Extra Toppings : "+toppingsprice+"\n";
		}
		if(isaddedbag) {
			bill+="Take Away : "+bagprice+"\n";
		}
		bill+="Total Amount :"+price;
		System.out.println(bill);
	}
	
}
