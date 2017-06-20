//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster () {
		setHeight(0);
		setWeight(0);
		setAge(0);
	}
	public Monster(int ht) {
		setHeight(ht);
		setWeight(0);
		setAge(0);
	}
	public Monster(int ht, int wt) {
		setHeight(ht);
		setWeight(wt);
		setAge(0);
	}
	public Monster(int ht, int wt, int age) {
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}

	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht) {
		myHeight = ht;
	}
	public void setWeight(int wt) {
		myWeight = wt;
	}
	public void setAge(int age) {
		myAge = age;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight(){
		return myHeight;
	}
	public int getWeight(){
		return myWeight;
	}
	public int getAge(){
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		Monster o = (Monster) obj;
		if(this.getHeight()==o.getHeight()) return true;
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(this.getHeight()!=rhs.getHeight()) {
			if (this.getHeight()>rhs.getHeight()) return 1;
			if (this.getHeight()<rhs.getHeight()) return -1;
		}
		if(this.getWeight()!=rhs.getWeight()) {
			if (this.getWeight()>rhs.getWeight()) return 1;
			if (this.getWeight()<rhs.getWeight()) return -1;
		} 
		if (this.getAge()>rhs.getAge()) return 1;
		if (this.getAge()<rhs.getAge()) return -1;

		return 0;
	}

	//write a toString() method
	public String toString() {
		
		return myHeight + " "+ myWeight + " "+ myAge;
	}
}