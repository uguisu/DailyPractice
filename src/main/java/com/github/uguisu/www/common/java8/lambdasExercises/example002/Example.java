/**
 * 
 */
package com.github.uguisu.www.common.java8.lambdasExercises.example002;

import com.github.uguisu.www.common.java8.lambdasExercises.example001.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

/**
 * @author hexin
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> in = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
		    in.add(i);
        }

		String out = in.stream()
				.map(x -> ++x)
				.map(Object::toString)
				.collect(Collectors.joining(", "));
		
		System.out.println(out);

		List<Integer> collects = in.stream()
									.filter(wrk -> { return wrk > 3; })
									.collect(toList());

		collects.forEach( System.out::println );

		System.out.println(collects.stream().min(Comparator.comparing( x -> x)).get());

		System.out.println("----------------------");

		int count = Stream.of(1, 2, 3)
                .reduce(0, calMe);

		System.out.println("count = " + count);

        System.out.println("--------bandsAndSolo----------");
        ArrayList<Artist> artist = new ArrayList<Artist>();
        for(int i = 0; i < 10; i++) {
            artist.add(new Artist(i, (i % 2 == 1 ? true : false)));
        }

        bandsAndSolo(artist.stream()).forEach(
                (k,v) -> {
                    System.out.println(">>>>" + String.valueOf(k) + "<<<<<");
                    v.stream().forEach(System.out::println);

                }
        );

        System.out.println("--------getArtist----------");
        System.out.println(getArtist("haah").getId());



        System.out.println("--------mapToInt----------");
        System.out.println(in.stream().mapToInt(wrk -> wrk).sum());


        System.out.println("--------countFeature----------");
        employeeGroup.add(new Employee(1, 20, "a", "b", "c"));
        employeeGroup.add(new Employee(2, 25, "a", "b", "c"));
        employeeGroup.add(new Employee(3, 15, "a", "b", "c"));

        System.out.println(countFeature(empl -> empl.getAge()));
    }

    // Declare a BinaryOperator objectcom
    private static BinaryOperator<Integer> calMe = (acc, element) -> acc + element;


    public static Map<Boolean, List<Artist>> bandsAndSolo(Stream<Artist> artist) {
        return artist.collect(partitioningBy(Artist::isSolo));
    }


    /* Cache */
    static Map<String, Artist> artistCache = new HashMap<>(0);

    public static Artist getArtist(String id) {
        return artistCache.computeIfAbsent(id, Example::readFromDb);
    }

    public static Artist readFromDb(String in) {
        return new Artist(-11, false);
    }


    public static ArrayList<Employee> employeeGroup = new ArrayList<>();
    public static long countFeature(ToIntFunction<Employee> function) {
        return employeeGroup.stream()
                .mapToInt(function)
                .sum();
    }

}
