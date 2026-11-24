package streams;

import java.util.Collections;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<Integer>num=List.of(30,21,5,15,20,6,4,50,40);
	/*	num.stream()
		.map(n1->n1*n1)
		.forEach(System.out::println);*/
		  num.stream()
	         .filter(n1 -> n1 % 2 != 0)
	         .map(n1 -> n1 * n1)
	         .sorted(Collections.reverseOrder())
	         .forEach(System.out::println);

		List<String>names=List.of("amit","sahil","sameer","rahul","siddharth","kalyani");
       // names.stream().map(n1->n1.toLowerCase())
        //.forEach(System.out::println);	
/*	names.stream()
    .filter(n1 -> n1.startsWith("s"))
    .map(n1 -> new StringBuilder(n1)
    .reverse().toString())
    .forEach(System.out::println);*/
}}
