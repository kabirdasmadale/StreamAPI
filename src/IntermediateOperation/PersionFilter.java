package IntermediateOperation;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Stream;

public class PersionFilter {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("kabirdas");
		p.setAge(27);
		p.setDegignation("software engginere");
		
		Person p1=new Person();
		p1.setName("sandip");
		p1.setAge(24);
		p1.setDegignation("quality engginere");
		
		Person p2=new Person();
		p2.setName("gautam");
		p2.setAge(45);
		p2.setDegignation("civil engginere");
		
		List<Person> list=new ArrayList();
		list.add(p);
		list.add(p1);
		list.add(p2);
		Stream<Person> stream = list.stream();
		
	//	Stream<Person> filter = stream.filter((i)-> i.getAge()<=24);
		//filter.forEach((i)->System.out.println(i));
		
	//	Stream<Person> filter = stream.filter((i)->i.getAge()<=24  && i.getAge()<=27);
		//filter.forEach((i)->System.out.println(i));
		
		Stream<Person> filter = stream.filter((i)-> i.getAge()>=24 || i.getAge()>=42);
		filter.forEach((i)->System.out.println(i));
		
	}

}
