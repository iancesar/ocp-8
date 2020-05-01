package ocp.collections;

public class ArrayDeque
{

	public static void main(String[] args)
	{
		 java.util.ArrayDeque<String> arrayDeque = new java.util.ArrayDeque<>();
		 arrayDeque.add("a");
		 arrayDeque.add("s");
		 
		 arrayDeque.addFirst("c");
		 arrayDeque.addLast("a");
		 System.out.println(arrayDeque); //casa
		 
		 arrayDeque.removeFirstOccurrence("a");//csa
		 arrayDeque.removeLastOccurrence("a");//cs
		 
		 System.out.println(arrayDeque); //cs
	}
	
}
