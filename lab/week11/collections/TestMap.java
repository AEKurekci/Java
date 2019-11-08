package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestMap {

	public static void main(String[] args) {
		Map<String,Student> st = new TreeMap<>();
		Student a = new Student("01", 54, "Ozgur");
		st.put(a.id, a);
		st.put("09", a);
		a = new Student("06", 44, "Ozgur");
		st.put(a.id, a);
		a = new Student("01", 54, "Ozgur");
		st.put(a.id, a);
		a = new Student("03", 94, "Ahmet");
		st.put(a.id, a);
		a = new Student("02", 74, "Ali");
		st.put(a.id, a);
		a = new Student("05", 74, "Mehmet");
		st.put(a.id, a);
		a = new Student("04", 74, "Ali");
		st.put(a.id, a);
		
		System.out.println(st);
		
		System.out.println(st.keySet());
		System.out.println(st.values());
		
		for (Entry<String,Student> e : st.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue().grade);
		}
	}

}
