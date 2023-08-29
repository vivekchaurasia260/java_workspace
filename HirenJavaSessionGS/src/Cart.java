import java.util.Scanner;

public class Cart {
	
	public static void total_bill(Products[] product_arr)
	{
		double total_price = 0;
		
		for(Products prod : product_arr)
		{
			total_price += prod.getProduct_price();
		}
		
		System.out.println("Total bill is " + total_price);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number_of_products = scan.nextInt();
		
		Products[] product_array = new Products[number_of_products];
		
		for(int i=0; i<number_of_products; i++)
		{
			String name = scan.next();
			double price = scan.nextDouble();
			
			product_array[i] = new Products(name, price);
		}
		
		total_bill(product_array);
		
	}
}
