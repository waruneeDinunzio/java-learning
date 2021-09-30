package blendedProjectPackage;

public class Loop {

	public static void main(String[] args) {
		
//		for(int i=1; i<=50; i+=2)
//		{
//			System.out.println(i);
//		}
//		for(int i=50; i>0; i-=2){
//			
//			System.out.println(i);
//		}
		
//		int i =1;
//		while(i<=50)
//		{
//			System.out.println(i);
//			i+=2;
//		}
//		int i = 50;
//		while(i>=0)
//		{
//			System.out.println(i);
//			i -= 2;
//		}
	/*
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 */
//		for(int r = 1; r<=5; r++) {
//			for(int c=1; c<=r; c++) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}
//		
	/*
	 * 55555
	 * 4444
	 * 333
	 * 22
	 * 1
	 */
//		for(int r=5; r>=1; r--)
//		{
//			for(int c=1; c<=r; c++) {
//				System.out.print(r);
//			}
//			System.out.println();
//		}
		
		
/*
 * Practice for loops and while loops:

           For loops
1.Write a for loop that runs 10 times and print the value of the controlling variable all on the same line
2.Write a for loop that iterates between 1 and 10, but counts by 2. Inside the loop, print your name on different lines 
3.Write a for loop to print asterisk (*) 15 times on the same line


 */
// 1.
		for(int i=1; i <= 10; i++)
		{
			System.out.print(i);
		}
		System.out.println();
// 2. ??
// 3.
		for(int i=1; i<= 15; i++)
		{
			System.out.print("*");
		}
		System.out.println();
// 4. Write a for loop for the given output:
        //1, 3, 5, 7, 9
        //2, 4, 6, 8, 10
		for(int i=1; i<=10; i+=2)
		{
			System.out.print(i+",");
		}
		System.out.println();
		for(int i=2; i<=10; i+=2)
		{
			System.out.print(i+",");
		}
		System.out.println();

/*
 * While loops

 Use a while loop to add up the numbers 1 to 20 into one variable. Print out the sum at the end
 Use a while loop to print out the even number from 1 to 20
 */
		int num = 1;
		int sum = 0;
		while(num<=20)
		{
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println();
		int i = 1;
		int evenNum =0;
		while(i<=20)
		{
			if(i%2!=0)
			{
				System.out.println(i);	
			}
			i++;
		}
		
/* Nested loops

 1. Write a for loop to display the following outputs: 
 1                                             11111
 22                                           2222
 333                                         333
 4444                                       44
 55555                                     5
 
 2. Write a for loop that iterates from 1 - 20. Should print “prime” for all prime numbers.
 */
// 1.
//		for(int r = 1; r<=5; r++) {
//			for(int c=1; c<=r; c++) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}
		
		for(int r=5; r>=1; r--) {
			for(int c=1; c<=r; c++) {
				System.out.print(c);
			}
		}
		
	}

}
