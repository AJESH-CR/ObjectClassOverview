
public class StudentEquals {
	
	String name;
	int rollnum;
	public StudentEquals(String name, int rollnum) {
		this.name = name;
		this.rollnum = rollnum;
	}

	/*
	 * @Override public boolean equals(Object obj) { if(obj instanceof
	 * StudentEquals) { if(this == obj) { return true; } StudentEquals s =
	 * (StudentEquals)obj; if(this.name == s.name && this.rollnum == s.rollnum) {
	 * return true; } else { return false; } } return false; }
	 */
	
	public static void main(String[] args) {
		
		StudentEquals s1 = new StudentEquals("Ajesh CR", 101);
		StudentEquals s2 = new StudentEquals("Ajisha CR", 102);
		StudentEquals s3 = new StudentEquals("Ajesh CR", 101);
		StudentEquals s4 = s1;
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Ajesh CR"));
		System.out.println(s1.equals(null));
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentEquals) {
			if(this==obj)
				return true;
			StudentEquals s = (StudentEquals)obj;
			return (this.name == s.name && this.rollnum == s.rollnum)? true: false;
		}
		return false;
	}
	

}
