package compositeTree;

public class Component extends Leaf{
	
	public Component(String name, String value){
		super.name = name; 
		super.value = value; 
	}
	
	
	@Override
	public String toString(){
		return "Name: " + this.name + " , " + "Value: " + this.value;
	}
	
	@Override
	public Leaf insert(Leaf leaf){
		return null; 
	}
	
}
