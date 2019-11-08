package drawing;

public class QuestionC {
	int num;
	public static void main(String[] args) {
		QuestionC b=new QuestionC();
		b.num=5;
		QuestionC c=b;
		
		c.num=4;
		Object obj=c;
		QuestionC d=new QuestionC();
		d.num=b.num;
		
		System.out.println(b.hashCode());

		System.out.println(c.hashCode());
		System.out.println(obj.hashCode());
		System.out.println(d.hashCode());
		System.out.println(function(6));
	}
	public static int function(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else 
			return function(n-1)+2*function(n-2);
	}

}
