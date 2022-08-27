
public class StringBuilderProgram {

	public static void main(String[] args) {
		String a="apple";
		a.concat("banana");
		System.out.println(a);
		String b=a.concat("cherry");
		System.out.println(b);
		
		StringBuilder c=new StringBuilder("donut");
        System.out.println(c);
        c.append("eclaris");
        System.out.println(c);
        
        int d=c.length();
        System.out.println(d);
        
        char e=c.charAt(0);
        System.out.println(e);
        
        c.insert(5,"and");
        System.out.println(c);
        
        c.replace(5, 7, "or");
        System.out.println(c);
        
        c.deleteCharAt(7);
        System.out.println(c);
        
        c.reverse();
        System.out.println(c);
	}

}
