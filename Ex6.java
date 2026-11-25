package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex6 {

	public static void main(String[] args) {
		List<Integer>numbers=List.of(1,2,3,4,4,3,2,1);
	//remove duplicates from the list
		Set<Integer>set= numbers.stream()
		        .collect(Collectors.toSet());
		System.out.println(set);
	//remove dupli and odd num from the list keep only even num in list
		Set<Integer> set1 = numbers.stream()
		        .filter(n -> n % 2 == 0)
		        .collect(Collectors.toSet());
		System.out.println(set1);
		List<Product>pro=List.of(
				new Product(2,"Laptop",80000D),
				new Product(1,"tv",40000D),
				new Product(5,"ps5",70000D),
				new Product(4,"headphones",2000D),
				new Product(3,"AC",15000D)
				);
		//add 20% Gst for the product who are above 50k and create a separate list of that products
	/*	List<Product> list = pro.stream()
		        .filter(p -> p.getPrice() > 50000)
		        .map(p -> {
		            p.setPrice(p.getPrice() + (p.getPrice() * 0.20));
		            return p;
		        })
		        .collect(Collectors.toList());
		list.forEach(System.out::println);*/
	/*	Map<Integer,Product>map=pro.stream()
		.collect(Collectors.toMap(Product::getId,p->p));
	      System.out.println(map.get(3));*/
		Map<Integer, Product> map = pro.stream()
		        .filter(p -> p.getPrice() < 50000)
		        .map(p -> {
		            p.setPrice(p.getPrice() + 10000);
		            return p;
		        })
		        .collect(Collectors.toMap(p -> p.getId(), p -> p));
	    		 System.out.println(map);
	}

}
