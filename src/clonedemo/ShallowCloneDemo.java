package clonedemo;

/*In shallow cloning using cloned object reference, if we perform any change to the
contained object, the those changes will reflected to the main object.*/

public class ShallowCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException{
		Cat c = new Cat("Black");
		Animal a = new Animal(c,48.34);
		System.out.println(a.weight+"..."+a.c+"...."+a.c.color);
		Animal b = (Animal)a.clone();
		b.weight = 72;
		b.c.color = "Blue";
		/* ie, the change in b.c.color will affect a.c.color */
		System.out.println(a.weight+"..."+a.c+"...."+a.c.color);

	}

}
