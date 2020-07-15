package streamsAPI;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
		
//		8. Streams rows from text file, sort, filter and print
//		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//		bands
//			.sorted()
//			.filter(x -> x.length() > 13)
//			.forEach(System.out::println);
//		bands.close();
		
//		9. Stream rows from text file and save to List
//		List<String> bands2 = Files.lines(Paths.get("bands.txt"))
//				.filter(x -> x.contains("jit"))
//				.collect(Collectors.toList());
//		bands2.forEach(x -> System.out.println(x));
		
//		10. Stream rows from CSV file and count
//		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
//		int rowCount = (int)rows1
//				.map(x -> x.split(","))
//				.filter(x -> x.length == 3)
//				.count();
//		System.out.println("Row Count: " + rowCount);
//		rows1.close();
		
//		11. Stream rows from csv file, parse data from rows
//		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
//		rows2
//			.map(x -> x.split(","))
//			.filter(x -> x.length == 3)
//			.filter(x -> Integer.parseInt(x[1]) > 15)
//			.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
//		rows2.close();
		
//		12. Stream rows from CSV file, store fields in HashMap
//		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map = rows3
//				.map(x -> x.split(","))
//				.filter(x -> x.length == 3)
//				.filter(x -> Integer.parseInt(x[1]) > 15)
//				.collect(Collectors.toMap(
//						x -> x[0], 
//						x -> Integer.parseInt(x[1])));
//		rows3.close();
//		for(String key: map.keySet()) {
//			System.out.println(key + " " + map.get(key));
//		}
		
//		13. Reduction: Sum
		double total = Stream.of(7.3, 1.5, 4.8)
				.reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total: " + total);
		
//		14. Reduction: Summary Statistics
		IntSummaryStatistics summary = IntStream.of(7,1,12,56,17)
				.summaryStatistics();
		System.out.println(summary);
			
		
	}
}
