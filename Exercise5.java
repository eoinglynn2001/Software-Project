public class Exercise5{
         public static void main(String[] args){

          int[] x ={20,30,40,50};
           int sum = 0;
           int average = 0;
		   int product = 0;


		for(int i = 0; i < x.length; i++){

			sum = sum + x[i];
		}
		 System.out.println("Sum of array values= "+sum );


           for(int i = 0; i < x.length; i++){


			product = product + x[i]*x[i];
		}
			System.out.println("Product of array values= "+product);





			for(int i = 0; i < x.length; i++){


			average = average + x[i]/4;
		}
			System.out.println("Average of array values= "+average );




}
}