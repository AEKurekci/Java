package lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NumberConverter {

	Map<String,Integer> values = new HashMap<>(); 
	
	public NumberConverter() {
		values.put("zero", 0);
		values.put("one", 1);
		values.put("two", 2);
		values.put("three", 3);
		values.put("four", 4);
		values.put("five", 5);
		values.put("six", 6);
		values.put("seven", 7);
		values.put("eight", 8);
		values.put("nine", 9);

	}
	
	
	public int convert(String text) throws ConvertException{
		Integer val = values.get(text);
		if (val == null) {
			throw new ConvertException(text);
		}else if (val == 0) {
			throw new ArithmeticException("an arithmetic exception");
		}
		return val;
	}
	
	
	public static void main(String[] args) {
		NumberConverter converter = new NumberConverter();
		Scanner scanner;
		
		while (true){
			System.out.print("Enter text: ");
			scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			if(input.equals("bye")){
				break;
			}
			
			try {
				printNumber(converter, input);
				System.out.println("Number succesfully converted");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Enter a valid number please");
			} //catch (ArithmeticException ex){
			//	System.out.println(ex.getMessage());
			//}
			

		} 		
		
	}

	public static void printNumber(NumberConverter converter, String input) throws ConvertException{
		
			System.out.println(converter.convert(input));
		
	}
	
}
