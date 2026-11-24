package streams;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;

class Chocolate{
	private String name;
	private Double price;
	public Chocolate(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
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
}
public class Ex4 {

	public static void main(String[] args) {
		List<Chocolate> chocolates = List.of(
			    new Chocolate("Dairy Milk Silk Oreo", 185D),
			    new Chocolate("perk", 10D),
			    new Chocolate("Kit Kat", 10D),
			    new Chocolate("Ferrero Rocher",460D),
			    new Chocolate("Bourn ville",180D),
			    new Chocolate("Eclairs", 1D),
			    new Chocolate("Dairy Milk crispello", 50D)
			);
/*
Chocolate chocolate = chocolates.stream()
        .max(Comparator.comparingDouble(Chocolate::getPrice))
        .get();
System.out.println("Name: " + chocolate.getName()
        + " Price: " + chocolate.getPrice());
*//*
Chocolate chocolate = chocolates.stream()
        .min(Comparator.comparingDouble(Chocolate::getPrice))
        .get();

System.out.println("Name: " + chocolate.getName()
        + " Price: " + chocolate.getPrice());
*/
double total = chocolates.stream()
        .mapToDouble(Chocolate::getPrice)
        .sum();

System.out.println("Total Price: " + total);
DoubleSummaryStatistics stat=chocolates.stream()
       .mapToDouble(Chocolate::getPrice)
       .summaryStatistics();

System.out.println("Average"+stat.getAverage());
System.out.println("Count"+stat.getCount());
System.out.println("Max"+stat.getMax());
System.out.println("Min"+stat.getMin());
System.out.println("Sum"+stat.getSum());
}

}
