public class Massive {
	
	public static void main(String[] args) {
	  
		method1();
		method2();
	   	method3();
		method4();
	}

	// Задание 1.1
	public static void method1()
	{
		int mas[] = {1,3,5};
		try {
		for (int i=0; i<=mas.length; i++)
		{
			mas[i]++;
		}  } catch (ArrayIndexOutOfBoundsException ob1)
		   {System.out.println("Метод 1: ошибка - выход за пределы массива.");};
	
		}
	
	// Задание 1.2
	public static void method2()
	{
		int mas[] = {1,3,5};
		try {
		for (int i=0; i<=mas.length; i++)
		{
			mas[i]++;
			if (i == mas.length-1) {mas[i] = mas[i] / 0;}
		}  } catch (ArrayIndexOutOfBoundsException ob1)
		   {System.out.println("Метод 1: ошибка - выход за пределы массива.");}
		     catch (ArithmeticException ob1)
		   {System.out.println("Метод 1: ошибка - деление на ноль.");}
	
		}
	
	///Задание 1.3
	public static void method3()
	{
		int mas[] = {1,3,5};
		try {
		for (int i=0; i<=mas.length; i++)
		{
			mas[i]++;
		    if (i == mas.length-1) {mas[i] = mas[i] / 0;}
		}  } catch (ArrayIndexOutOfBoundsException | ArithmeticException ob1)
		   {System.out.print("Метод 3: ошибка - ");
		    String s = ob1.getMessage();
		    if (s.equals("/ by zero")) {System.out.println("деление на ноль.");}
		    else {System.out.println("выход за пределы массива.");}
		   } 
	} 

	//Задание 1.4
	public static void method4()
	{
		int mas[] = {1,3,5};
		try {
		for (int i=0; i<=mas.length; i++)
		{
			mas[i]++;
		}  } catch (ArrayIndexOutOfBoundsException ob1)
		   {System.out.println("Метод 4: ошибка - выход за пределы массива.");}
	         finally{System.out.println("Hello!");};
		}
	
}
