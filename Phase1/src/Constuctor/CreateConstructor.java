package Constuctor;

public class CreateConstructor {
	String name;
	int emp_id;
	CreateConstructor()
	{
		System.out.println("this is the default constructor");
	}
	CreateConstructor(String name)
	{
		this.name = name ;
	
	}
	 void display()
	 {
		 System.out.println(name);
		 }  
	public static void main(String args[]) 
	{
        CreateConstructor obj = new CreateConstructor();
        System.out.println("now the blow part is parameterised constructor");
        CreateConstructor obj1 = new CreateConstructor("Abc");
        obj1.display();		
	}
}
