package dataclasses;

public class Attribute {
	
	enum AttributeType{
		VARCHAR,
		INT,
		DATE_TIME
	};
	
	public Attribute() {
		name = "";
		displayName = "";
		
		type = null;
		
		attributeLength = 0;
	}
	
	public Attribute(String name, AttributeType theType, int length, String displayName) {
		this.name = name;
		this.type = theType;
		this.attributeLength = length;
		this.displayName = displayName;
	}
	
	//name of the attribute
	private String name;
	
	//display name of the attribute
	private String displayName;
	
	//attribute database type
	private AttributeType type;
	
	//length of the attribute, if applicable.  Applicable in case of VARCHAR
	private int attributeLength;
}
