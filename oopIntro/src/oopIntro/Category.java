package oopIntro;

public class Category {
	private int id;
	private String name;
	
	
	
	public Category() {

	}

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
