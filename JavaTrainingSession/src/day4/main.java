package day4;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Item item = new Item(); item.setPrice(120); item.setId(3);
		 * item.setDimension_x(15); item.setWeight(100); item.setIsPresentInShop(true);
		 */
		
		Jam jambrand1 = new Jam();
		jambrand1.setPrice(120);
		jambrand1.setId(3);
		jambrand1.setDimension_x(15);
		jambrand1.setWeight(100);
		jambrand1.setIsPresentInShop(true);
		jambrand1.setDestription("Some peculiar description");
		System.out.println("The price of something is " +jambrand1.getPrice());
		System.out.println("The int id is "+jambrand1.getId());
		System.out.println("The dimension of something is " +jambrand1.getDimension_x());
		System.out.println("The weight is "  +jambrand1.getWeight());
		System.out.println("Jam is present "+jambrand1.getIspresentInShop());
		System.out.println(jambrand1.getDescription());
		
		Mango malda = new Mango();
	}

}
