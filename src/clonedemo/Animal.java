package clonedemo;

public class Animal implements Cloneable {
	Cat c;
	double weight;
	Animal(Cat c, double weight){
		this.c = c;
		this.weight = weight;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
