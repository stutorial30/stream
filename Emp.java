package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Emp {

    private Integer id;
    private String name;
    private Double sal;
    private Integer rating;
    private String dept;

    public Emp(Integer id, String name, Double sal, Integer rating, String dept) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.rating = rating;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSal() {
        return sal;
    }

    public Integer getRating() {
        return rating;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name +
                ", sal=" + sal + ", rating=" + rating +
                ", dept=" + dept + "]";
    }

    public static void main(String args[]) {

        List<Emp> e = List.of(
            new Emp(1, "aabc", 40000.0, 3, "IT"),
            new Emp(2, "aabc", 50000.0, 3, "IT"),
            new Emp(3, "aabc", 30000.0, 4, "HR"),
            new Emp(5, "aabc", 70000.0, 3, "IT"),
            new Emp(4, "aabc", 20000.0, 5, "sales"),
            new Emp(7, "aabc", 10000.0, 3, "IT"),
            new Emp(6, "aabc", 90000.0, 5, "finance"),
            new Emp(8, "aabc", 40000.0, 2, "IT"),
            new Emp(9, "aabc", 50000.0, 4, "IT")
        );

        e.stream()
         .filter(p -> p.getRating() > 4)
         .forEach(System.out::println);
        // 3. Add bonus of 10% for best performers
   /*     e.stream()
                .forEach(p -> p.setSal(p.getSal() + p.getSal() * 0.10));
        System.out.println("After Bonus:");
        e.forEach(System.out::println);*/
        // 4. Find employee with max salary after adding bonus
       Emp max = e.stream()
                .max(Comparator.comparingDouble(Emp::getSal))
                .get();
        System.out.println("Maximum Salary Employee:");
        System.out.println(max);
        // 5. Print total count of employees
        /*long count = e.stream().count();
        System.out.println("Total Employees: " + count);*/
        // 6. Print all available departments without duplicates
             Set<String> dept = e.stream()
                .map(Emp::getDept)
                .collect(Collectors.toSet());
        System.out.println("Departments: " + dept);
        // 7. Average salary of IT department
/*        double avg = e.stream()
                .filter(p -> p.getDept().equals("IT"))
                .mapToDouble(Emp::getSal)
                .average()
                .orElse(0.0);
        System.out.println("IT Average Salary: " + avg);
*/
        // 8. Sum of salary of all employees
        double sum = e.stream()
                .mapToDouble(Emp::getSal)
                .sum();
        System.out.println("Total Salary: " + sum);
        // 9. Sort employees based on rating
 /*       List<Emp> sorted = e.stream()
                .sorted(Comparator.comparing(Emp::getRating))
                .collect(Collectors.toList());
        System.out.println("Sorted By Rating:");
        sorted.forEach(System.out::println);
*/        // 10. Convert list of employees to Map
        Map<Integer, Emp> map = e.stream()
                .collect(Collectors.toMap(
                        Emp::getId,
                        p -> p
                ));
        System.out.println("Employee Map:");
        map.forEach((k, v) -> System.out.println(k + " = " + v));

    }

	private Object setSal(double d) {
		// TODO Auto-generated method stub
		return null;
	}
}