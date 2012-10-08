package dataclasses;

import java.util.ArrayList;

public class Entity {

	private String name;
	private String displayName;
	ArrayList<Attribute> attributes;
	
	public Entity() {
		
	}
	
	public Entity(String name, String displayName, ArrayList<Attribute> theAttributes) {
		this.name = name;
		this.displayName = displayName;
		this.attributes = theAttributes;
	}
	
	public void addAttribute(Attribute theAttribute) {
		attributes.add(theAttribute);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("[ Entity Name: " + name);
		sb.append(", Entity Display Name: " + displayName);
		sb.append(". Attributes List: " + attributes.toString() + " ]\n");
		
		return sb.toString();
		
	}
}
