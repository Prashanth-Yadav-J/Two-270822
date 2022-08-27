
public class FirstProgram {
	static String a = "Please Enter your text here:";
	public void method1()
	{
		System.out.println("This is Method1 from FirstProgram Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstProgram fp=new FirstProgram();
		SecondProgram sp=new SecondProgram();
		fp.method1();
		sp.method1();
		System.out.println("Hi New Laptop");
		System.out.println("Acer Aspire 7 AMD Ryzen 5");
		System.out.println(a);

	}

}
