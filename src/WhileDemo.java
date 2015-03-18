import java.util.Scanner;
public class WhileDemo {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int userNumber, computerNum;
		int i = 1;
		
		while( i < 4)
		{
			computerNum = 0 + (int)(Math.random() * 10);
			System.out.print("Enter a number: ");
			userNumber = input.nextInt();
			System.out.printf("Random number is: %d\n", computerNum);
			if(userNumber < computerNum)
			{
				System.out.println("Too Small!!!");
				
			}
			else if(userNumber > computerNum)
			{
				System.out.println("Too Big!!!");
			}
			else
			{
				System.out.println("Match");
			}
			System.out.println("Game number: " + i);
			i++;
		}
		System.out.println("Bye!!!");
		input.close();
	}
	

}
