package TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MachingOperatons {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("kabirdas");
		p.setAge(27);
		p.setDegignation("software engginer");

		Person p1 = new Person();
		p1.setName("prerak");
		p1.setAge(25);
		p1.setDegignation("mechanical engginer");

		Person p2 = new Person();
		p2.setName("suyog");
		p2.setAge(29);
		p2.setDegignation("civil engginer");

		List<Person> list = new ArrayList();
		list.add(p);
		list.add(p1);
		list.add(p1);

		Stream<Person> stream = list.stream();
		// boolean match = stream.anyMatch((i) -> i.getDegignation().equals("mechanical
		// engginer"));
		// System.out.println(match);

		// boolean match = stream.allMatch((i1) -> i1.getDegignation().equals("civil
		// engginer"));
		// System.out.println(match);

		// boolean match = stream.noneMatch((i2) -> i2.getDegignation().equals("civil
		// engginer"));
		// System.out.println(match);

// finding methods findFirst(),findAny()

//		Stream<Person> filter = stream.filter((i3) -> i3.getDegignation().equals("mechanical engginer"));
//		Optional<Person> findFirst = filter.findFirst();
//		System.out.println(findFirst);

		Stream<Person> filter = stream.filter((i4) -> i4.getDegignation().equals("mechanical engginer"));
		Optional<Person> findAny = filter.findAny();
		System.out.println(findAny);
	}

}
