package compositeTree;

import java.util.ArrayList;

public class ArrayComposite extends Leaf {
	
	ArrayList<Leaf> children; 
	
	public ArrayComposite( String name, String value,  Leaf... components){
		super.name = name; 
		super.value = value; 
		children = new ArrayList<Leaf>();
		for(Leaf component : components){
			children.add( component );
		}
	}
	
	public Leaf insert(Leaf component){
		int index = children.lastIndexOf(component); 
		if( index < 0 ){
			// element doesn't exist
			children.add(component);
			index = children.lastIndexOf(component);
		}
		
		return children.get(index); 
	}
	
	public ArrayList<Leaf> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Leaf> children) {
		this.children = children;
	}

	@Override
	public String toString(){
		String result =  "Name: " + name + " , " + "Value: " + value
					+ "\n";
		for( Leaf child : children){
			result += child.toString() + "\n";
		}
		
		return result; 
	}
	
	public static void main(String args[]){
		ArrayComposite Area = new ArrayComposite("Area", "aaaa");
		ArrayComposite Region = new ArrayComposite("Region", "Rere");
		ArrayComposite Region1 = new ArrayComposite("Region", "bbbb");

		ArrayComposite market = new ArrayComposite("Market", "Yaha");
		ArrayComposite market2 = new ArrayComposite("Market", "Saka");
		Component site2 = new Component("Site", "2222");
		Component site3 = new Component("Site", "3333");
		Component site4 = new Component("Site", "4444");
		Component site5 = new Component("Site", "4444");
		Component site6 = new Component("Site", "6666");
		
		System.out.println(site4.equals(site5));
		Area.insert(Region).insert(market).insert(site4);
		Area.insert(Region).insert(market).insert(site5);

	
		System.out.println( Area );
	}
	
}
