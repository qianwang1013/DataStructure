package compositeTree;

abstract class Leaf {
	// getting the map value pair
	protected String name; 
	protected String value; 
	

	protected abstract Leaf insert(Leaf arg);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override 
	public boolean equals(Object obj){
		return name == ((Leaf) obj).getName() && value == ((Leaf) obj).getValue(); 
	}
}
