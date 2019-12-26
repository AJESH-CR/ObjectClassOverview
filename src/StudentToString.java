/**
 * 
 */

/**
 * @author ajesh
 *
 */
public class StudentToString {

	/**
	 * @param arg
	 */
	String name;
	int rollnum;
	public StudentToString(String name, int rollnum) {
		this.name = name;
		this.rollnum = rollnum;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnum=" + rollnum + "]";
	}

	public static void main(String[] args) {
		StudentToString s1 = new StudentToString("Ajesh CR",101);
		StudentToString s2 = new StudentToString("Ajesh CR",101);
		StudentToString s3 = new StudentToString("Ajisha CR",103);
		StudentToString s4 = s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
