package lab;

public class ConvertException extends Exception {
	public ConvertException(String number) {
		super(number + " can not be converted");
	}
}