package clonedemo;

public class Mammals implements Cloneable {
	
	Cat c;
	double weight;
	public Mammals(Cat c, double weight) {
		this.c = c;
		this.weight = weight;
	}
	
	  public Object clone() throws CloneNotSupportedException{ Cat c1 = new
	  Cat(c.color); Mammals m = new Mammals(c1,weight); return m; }
	 
}
