
public class StringPalindrome {

	public static void main(String[] args) {
		String r="madam";
		String s="";
		{
			for(int i=r.length()-1;i>=0;i--)
			{
				s= s+r.charAt(i);
			}
			System.out.println(s);
		}
		if(r.equals(s))
		{
			System.out.println("Given text is Palindrone");
		}
		else
		{
			System.out.println("Given text is not a Palindrone");
		}

	}

}
