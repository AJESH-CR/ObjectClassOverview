package clonedemo;

public class DeepCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException{
		Cat c = new Cat("Black");
		Mammals m1 = new Mammals(c,23.4);
		System.out.println(m1.weight+"..."+m1.c+"...."+m1.c.color);
		Mammals m2 = (Mammals)m1.clone();
		m2.c.color = "White";
		m2.weight = 12.34;
		System.out.println(m1.weight+"..."+m1.c+"...."+m1.c.color);

	}

}
