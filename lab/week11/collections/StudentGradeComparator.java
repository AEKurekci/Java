package collections;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int result = o2.grade - o1.grade;
		if (result == 0) {
			return o1.id.compareTo(o2.id);
		}
		return result;
	}


	



}
