import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] Args) { 
	List<String> list= new ArrayList<>();
	
	list.add("Maria");
	list.add("João");
	list.add("Bruno");
	list.add("Joana");
	list.add("Junior");
	list.add(2, "marco");
	
	System.out.println(list.size());
	for(String x : list) {
		
		System.out.println(x);
		
	}
	System.out.println("-----------------------------");
	list.remove(1);
	list.removeIf(x -> x.charAt(0) == 'M');
	System.out.println("--------------------------");
	
	for (String x : list) {
		
		System.out.println(x);
	}
	System.out.println("------------------------");
	System.out.println("Index of  Joao"+list.indexOf("Joao"));
	System.out.println("----------------------------------");
	List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
for (String x : result) {
		
		System.out.println(x);
	}
	System.out.println("----------------------------------");
	String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
	System.out.println(name);


}
}