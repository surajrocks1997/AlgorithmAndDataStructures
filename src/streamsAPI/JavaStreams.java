package streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {

//		1.Int Stream
		IntStream
			.range(1, 10)
			.forEach(System.out::print);
		System.out.println();
		
//		2. Int Stream with skip
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
//		3. Int Stream with sum
		System.out.println(IntStream
				.range(0, 10)
				.sum());
		
//		4. Stream.of, sorted and findFirst
		Stream.of("Ava", "Ana", "Albert")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
		
//		5. Stream from Array, sort, filter and print
		String[] names = {
				"Al", "Ankit", "Kushal", "Brianna", "Sarah", "Avi", "Ana", "Savannah", "Suraj"
		};
		Arrays.stream(names)
			.filter(x -> x.startsWith("S"))
			.sorted()
			.forEach(System.out::println);
		
//		6. Average of sqaures of int array
		Arrays.stream(new int[] {2,4,6,8,10})
			.map(x -> x*x)
			.average()
			.ifPresent(System.out::println);
		
//		7. Stream from list, filter, print
		List<String> people = Arrays.asList("Al", "Ali", "Ankit", "Kushal", "Brianna", "Sarah", "Avi", "Ana", "Savannah", "Suraj");
		people
			.stream()
			.map(String::toLowerCase)
			.filter(x -> x.startsWith("a"))
			.forEach(System.out::println);
		
		
	}
}
