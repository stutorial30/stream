package streams;

import java.util.List;

class Flowers{
	private String name;
	private String color;
	private Double price;
	
	public Flowers(String name, String color, Double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
public class Ex3 {

	public static void main(String[] args) {

List<Flowers> flowers = List.of(
    new Flowers("Rose", "red", 100D),
    new Flowers("Jasmine", "White", 5D),
    new Flowers("Hibiscus", "red", 10D),
    new Flowers("sunflower", "yellow", 100D),
    new Flowers("lily","pink",200d)
);
/*
flowers.stream()
       .map(f -> f.getName())
       .forEach(System.out::println);

	}
*/ 
/*
flowers.stream()
       .map(f -> f.getColor().toLowerCase())
       .distinct()
       .forEach(System.out::println);
*/
/*flowers.stream()
       .map(f -> f.getColor().toUpperCase())
       .forEach(System.out::println);*/
/*
flowers.stream()
       .filter(f -> f.getPrice() > 50)
       .map(f -> f.getPrice() + (f.getPrice() * 20 / 100))
       .forEach(System.out::println);*/
long count=flowers.stream()
.filter(f->f.getPrice()>=50)
.count();
System.out.println(count);
}}