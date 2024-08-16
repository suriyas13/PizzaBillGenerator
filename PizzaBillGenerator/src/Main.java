import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Do you want a Normal Pizza or a Delux Pizza");
		String pizzatype=sc.nextLine();
		String[] parts=pizzatype.split(" ");
		System.out.println("Do you want a veg or non-veg pizza (V/NV)");
		String vegoption=sc.nextLine();
		boolean veg;
		if(vegoption.toLowerCase().equals("v")) {
			veg=true;
		}
		else {
			veg=false;
		}
		if(parts[0].toLowerCase().equals("normal")) {
		
		Pizza pz=new Pizza(veg);
		System.out.println("Do you want Extra Cheese(Y/N)?");
		String addon=sc.nextLine();
		if(addon.toLowerCase().equals("y")) {
		pz.addCheese();
		}
		System.out.println("Do you want Extra Toppings(Y/N)?");
		addon=sc.nextLine();
		if(addon.toLowerCase().equals("y")) {
		pz.addToppings();
		}
		System.out.println("Do you want to take it home(Y/N)?");
		addon=sc.nextLine();
		if(addon.toLowerCase().equals("y")) {
		pz.takeAway();
		}
		pz.getBill();
		}
		else {
		DeluxPizza dp=new DeluxPizza(veg);
		System.out.println("Do you want to take it home(Y/N)?");
		String addon=sc.nextLine();
		if(addon.toLowerCase().equals("y")) {
		dp.takeAway();
		}
		dp.getBill();
		}
	}

}
