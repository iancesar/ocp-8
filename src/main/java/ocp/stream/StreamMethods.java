package ocp.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethods
{

	public static void main(String[] args)
	{

		List<String> lista = Arrays.asList("A", "B", "C", "D");
		//peek
		System.out.println(lista.stream().peek(System.out::print).findAny().get()); //AA
		System.out.println(lista.parallelStream().peek(System.out::print).findAny().get()); //Não determinante

	}

}
