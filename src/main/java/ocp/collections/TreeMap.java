package ocp.collections;

import java.util.SortedMap;

public class TreeMap
{

	public static void main(String[] args)
	{
		java.util.TreeMap<String, String> treeMap = new java.util.TreeMap<>();

		treeMap.put("a", "apple");
		treeMap.put("e", "egg");
		treeMap.put("g", "gear");
		System.out.println(treeMap); //{A=a, a=a, b=b, c=c}

		//Ordem Natual = [0-9] [A-Z] [a-z]
		SortedMap<String, String> sortedMap = treeMap.subMap("a", "e");
		/* Estou criando um mapa a partir de outro definindo o range em ordem natural
		 * Nesse caso chaves de entre a e d já que o 'e' é EXCLUSIVO
		 */
		sortedMap.put("d", "dado");
		sortedMap.put("a", "ave");

		System.out.println(sortedMap); //{a=ave, d=dado}

		sortedMap.put("e", "Erro"); //Aqui vai dar IllegalArgumentException

	}

}
