public class Massive {
	
	public static void main(String[] args) {
	  
		method1();
		method2();
	   	method3();
		method4();
	}

	// ������� 1.1
	public static void method1()
	{
		int mas[] = {1,3,5};
		try {
		for (int i=0; i<=mas.length; i++)
		{
			mas[i]++;
		}  } catch (ArrayIndexOutOfBoundsException ob1)
		   {System.out.println("����� 1: ������ - ����� �� ������� �������.");};
	
		}
	
	// ������� 1.2
	public static void method2()
	{
		int mas[] = {1,3,5};
		try {
		for (int i=0; i<=mas.length; i++)
		{
			mas[i]++;
			if (i == mas.length-1) {mas[i] = mas[i] / 0;}
		}  } catch (ArrayIndexOutOfBoundsException ob1)
		   {System.out.println("����� 1: ������ - ����� �� ������� �������.");}
		     catch (ArithmeticException ob1)
		   {System.out.println("����� 1: ������ - ������� �� ����.");}
	
		}
	
	///������� 1.3
	public static void method3()
	{
		int mas[] = {1,3,5};
		try {
		for (int i=0; i<=mas.length; i++)
		{
			mas[i]++;
		    if (i == mas.length-1) {mas[i] = mas[i] / 0;}
		}  } catch (ArrayIndexOutOfBoundsException | ArithmeticException ob1)
		   {System.out.print("����� 3: ������ - ");
		    String s = ob1.getMessage();
		    if (s.equals("/ by zero")) {System.out.println("������� �� ����.");}
		    else {System.out.println("����� �� ������� �������.");}
		   } 
	} 

	//������� 1.4
	public static void method4()
	{
		int mas[] = {1,3,5};
		try {
		for (int i=0; i<=mas.length; i++)
		{
			mas[i]++;
		}  } catch (ArrayIndexOutOfBoundsException ob1)
		   {System.out.println("����� 4: ������ - ����� �� ������� �������.");}
	         finally{System.out.println("Hello!");};
		}
	
}
