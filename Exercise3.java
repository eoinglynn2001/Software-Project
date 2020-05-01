 import java.util.Scanner;
    public class Exercise3{
         public static void main(String[] args){
             int number = 0;
             Scanner input = new Scanner(System.in);

       			System.out.print("Enter a number:");
       			number  = input.nextInt();

       			if(number > 19){
 					System.out.println("Number is greater than my age (19)");
 				}


 				if(number < 19){
 					System.out.println("Number is less than my age (19)");
 				}

 				if(number == 19){
 					System.out.println("Number matches my age (19)");
 				}


}
}