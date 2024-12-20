import java.util.Scanner;

public class Voter {
	 static  	public  void  isVoted(int age) throws  IsAbleToVote{
		if(age<18){
			throw  new IsAbleToVote("you under 18 so , you not able to vote");
		}else{
			System.out.println(" you can give the vote ");
		}
	}

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int age ;
		System.out.println("Enter your age ");
		age = sc.nextInt();
		try
		{

		Voter.isVoted(age);
		}catch ( Exception e){
			System.out.println(e.getMessage());
		}
		 finally {
			System.out.println("this is final block !");
		}
	}
}
