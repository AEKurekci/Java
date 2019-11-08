
public class ConditionalDemo2 {

    public static void main(String[] args){

    	int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        int result;

        boolean someCondition = true;

        result = someCondition ? value1 : value2;//it will be printed 1, because someConditional's true. If it was be false,it would be printed 2

        System.out.println(result);	
    }
}
