import java.util.*;
public class task2 {

	public static void main(String[] args) {
		int i=0;
		double marks;
		double totalmarks=0;
		String grade="";
		Scanner sc=new Scanner(System.in);
	while(i<5) {
		
		marks=sc.nextInt();
		if(marks<=100) {
		totalmarks+=marks;
		i++;
		}
		else {
			System.out.println("please enter corrrect amrks");
		}
	}
	double percentage=((totalmarks/500)*(100));
	if(percentage>=90&&percentage<=100) {
		grade="outstanding";
		
	}
	else if(percentage>=80&&percentage<=89) {
		grade="excellent";
		
	}
	else if(percentage>=70&&percentage<=79) {
		grade="very good";
		
	}
	else if(percentage>=60&&percentage<=69) {
		grade="good";
		
	}
	else if(percentage>=55&&percentage<=59) {
		grade="above avg";
		
	}
	else if(percentage>=40&&percentage<=49) {
		grade="avg";
		
	}
	
	else {
		grade="fail";
	}
	System.out.println("result");
	System.out.println("totalmarks="+totalmarks);
	System.out.println("percentage="+percentage+"%");
	System.out.println("grade="+grade);
	

	}

}