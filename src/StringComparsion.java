
public class StringComparsion {

	public static void main(String[] args) {
		String a="one";
		String b="two";
		String c="ONE";
		String d="two";
		String e=new String("one");
		System.out.println(a==e);
		System.out.println(b==d);
		System.out.println(a.equals(e));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));

	}

}
