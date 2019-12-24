import java.util.Scanner;

public class Reverse {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String Input=in.next();
		
		//StringBuffer string=new StringBuffer(reverse);
		int len=Input.length();
		String rev="";
		int count=0;
		for(int i=len-1;i>=0;i--)
		{
			rev= rev+Input.charAt(i);
			if(Input.charAt(i)=='a'||Input.charAt(i)=='e'||Input.charAt(i)=='i'||Input.charAt(i)=='o'||Input.charAt(i)=='u')
			count++;
		}
		System.out.println("Reverse string is:");
		System.out.println(rev);
		System.out.println("Number of vowels are:");
		System.out.println(count);
		
	}

}