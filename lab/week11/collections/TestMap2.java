package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestMap2 {

	public static void main(String[] args) {
		Map<Student,Integer> st = new TreeMap<>(new StudentGradeComparator());
		Student a = new Student("01", 54, "Ozgur");
		st.put(a, a.grade);
		st.put(a, a.grade);
		a = new Student("06", 44, "Ozgur");
		st.put(a, a.grade);
		a = new Student("01", 100, "Ozgur");
		st.put(a, a.grade);
		a = new Student("03", 94, "Ahmet");
		st.put(a, a.grade);
		a = new Student("02", 74, "Ali");
		st.put(a, a.grade);
		a = new Student("05", 74, "Mehmet");
		st.put(a, a.grade);
		a = new Student("04", 74, "Ali");
		st.put(a, a.grade);
		
		System.out.println(st);
		
		System.out.println(st.keySet());
		System.out.println(st.values());
		
		for (Entry<Student,Integer> e : st.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
	}

}
