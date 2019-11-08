package lab;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Homework {

	public static void main(String[] args) {
		String[] strs= {"a","b","c","d"};
		List<String> strList = new ArrayList<>();
		addToCollection(strs,strList);
		
		Integer[] ints= {1,2,3,4};
		List<Integer> intList = new ArrayList<>();
		addToCollection(ints,intList);
		
		List<Number> numList=new ArrayList<>();
		
		List<Integer> intList2=Arrays.asList(1,2,3,4);
		copyCollection(intList2,numList);
		
		List<Double> dList=Arrays.asList(1.3,2.0,3.5,4.0);
		copyCollection(dList, numList);
		
		System.out.printf("Maximum of %d, %d and %d is %d\n\n",3, 4, 5, max(3,4,5));
		
		System.out.printf("Maximum of %.2f, %.2f and %.2f is %.2f\n\n",6.67, 8.89, 7.75, max(6.67,8.89,7.75));
		
		System.out.printf("Maximum of %s, %s and %s is %s\n","pear","apple","orange", max("pear","apple","orange"));
		
		
	}
	public static<T extends Comparable<T>> Object max(T i, T j, T k) {
		T max=i;
		if(j.compareTo(max)>0)
			max=j;
		if(k.compareTo(max)>0)
			max=k;
					
		return max;
	}
	public static<T extends Number> void copyCollection(Collection<? extends T> list, List<Number> numList) {
		for(T items : list)
			numList.add(items);
		
		/*for(int i=0;i<numList.size();i++)
			System.out.println(numList.get(i));*/
		
	}
	public static<T> void addToCollection(T[] AnArray,List<T> list) {
		
		for(T array : AnArray) {
			list.add(array);
		}
		/*for(int i=0;i<list.size();i++)
     		System.out.println(list.get(i));*/
	}
	

	
}
