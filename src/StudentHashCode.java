
public class StudentHashCode {
	String name;
	int rollnum;
	StudentHashCode(String name, int rollnum){
		this.name = name;
		this.rollnum = rollnum;
	}
	
	public static void main(String[] args) {
		
		StudentHashCode s1 = new StudentHashCode("Ajesh CR",101);
		StudentHashCode s2 = new StudentHashCode("Ajisha CR",102);
		StudentHashCode s3 = new StudentHashCode("Ajesh CR",101);
		StudentHashCode s4 = s1;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

	@Override
	public int hashCode() {
		return rollnum;
	}

}
