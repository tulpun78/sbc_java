package day4;

public class Item {
	int id, weight, dimension_x, dimension_y,dimension_z;
	float price;
	boolean isPresentInShop;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setWeight(int weight){
		this.weight=weight;
	}
	public int getWeight() {
			return weight;
	}
	public void setDimension_x(int dimension_x) {
		this.dimension_x=dimension_x;
	}
	public int getDimension_x (){
		return dimension_x;
	}

	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	public void setIsPresentInShop(boolean isPresentInShop) {
		this.isPresentInShop=isPresentInShop;
		
	}
	public boolean getIspresentInShop() {
		return isPresentInShop;
	}
}
			
			
				

