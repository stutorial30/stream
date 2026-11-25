package streams;

import java.util.List;

public class Product {
private Integer id;
private String name;
private Double price;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Product(Integer id, String name, Double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public class Ex5{
	public static void main(String args[]) {
		List<Product>pro=List.of(
				new Product(2,"Laptop",80000D),
				new Product(1,"tv",40000D),
				new Product(5,"ps5",70000D),
				new Product(4,"headphones",2000D),
				new Product(3,"AC",15000D)
				);
	//cal the total price of cart using stream	
/*	double sum=	pro.stream()
				 .mapToDouble(p->p.getPrice())
				 .sum(); 
	double sum= pro.stream()
	 .mapToDouble(p->p.getPrice())
	 .reduce((a,b)->a+b)
	 .getAsDouble();
			System.out.println(sum); */
	/*	List<Integer>num=List.of(10,20,30,40,50);
		Integer sum=num.stream()
				.reduce((a,b)->a+b)
				.get();
		System.out.println(sum);   */
	//find the max price from product cart using reduce
  Product product=pro.stream()
				.reduce((a,b)->a.getPrice()>b.getPrice()? a:b)
				.get();
		System.out.println("Name:"+product.getName()+"Price:"+product.getPrice()); 
	//cal the sum of product price whose id are even
		double sum = pro.stream()
		        .filter(p -> p.getId() % 2 == 0)
		        .mapToDouble(p -> p.getPrice())
		        .sum();
		System.out.println("Sum of Even ID Products: " + sum);
     
	}
}
}
