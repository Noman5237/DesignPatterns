package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasics {
	
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Max", 18),
		                                     new Person("Peter", 23),
		                                     new Person("Pamela", 23),
		                                     new Person("David", 12));
		
		// find all the persons whose name starts with P
		Stream<Person> personsWithP = persons.stream()
		                                     .filter(person -> person.getName()
		                                                             .startsWith("P"));
		personsWithP.forEach(System.out::println);
		
		System.out.println(persons.stream()
		                          .map(Person::getAge)
		                          .reduce(Integer::sum)
		                          .orElseThrow());
		
		// list of 10 perfect squares
		List<Double> numbers = Arrays.asList(1.0, 4.0, 9.0, 16.0);
		
		// find the multiplication of square root of all numbers
		System.out.println(numbers.stream()
		                          .parallel()
		                          .unordered()
		                          .reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b));
		
		numbers.stream()
		       // convert each element to a stream of values upto that element
		       .map(a -> Stream.iterate(1, i -> i <= a, i -> i + 1))
		       .map(Stream::toArray)
		       .forEach(a -> System.out.println(Arrays.toString(a)));
		
		// flat map
		numbers.stream()
		       // convert each element to a stream of values upto that element
		       .flatMap(a -> Stream.iterate(1, i -> i <= a, i -> i + 1))
		       .forEach(System.out::println);
		
	}
}
