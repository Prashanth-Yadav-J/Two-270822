
public class StringBufferProgram {

	

	public static void main(String[] args) {
		String a="One";
		System.out.println(a);
		a.concat("Two");
		System.out.println(a);
		String b=a.concat("Three");
		System.out.println(b);
		
		StringBuffer d=new StringBuffer("Four");
		System.out.println(d);
		d.append("Five");
		System.out.println(d);
		
		int e=d.length();
		System.out.println(e);
		
		char f=d.charAt(0);
		System.out.println(f);
		char g=d.charAt(1);
		System.out.println(g);
		char h=d.charAt(4);
		System.out.println(h);
		char i=d.charAt(6);
		System.out.println(i);
		
		d.insert(4, "and");
		System.out.println(d);
		
		d.replace(4, 6, "OR");
		System.out.println(d);
		
		d.deleteCharAt(6);
		System.out.println(d);
		
		d.reverse();
		System.out.println(d);
		
		

	}

}
