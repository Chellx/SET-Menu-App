import java.util.Scanner;

public class DSAss1{
	// menu method
	public static void menu() {
		System.out.println("---------- MENU ----------\n");
		System.out.println("1. Add Number ");
		System.out.println("2. Check if a number is in the array");
		System.out.println("3. Remove any duplicates in first array");
		System.out.println("4. List the contents of the arrays");
		System.out.println("5. List the Biggest & Smallest Number In Each Array");
		System.out.println("6. Count The Even & Odd Numbers In Each Array");
		System.out.println("7. Exit");
		System.out.print("\nOption: ");
	}
	public static void initializeArrays(int[]array) {
		for(int index = 0;index < array.length;index++) {
			array[index] = 0;// Set all elements to zero
		}
	}
	public static int addNumber(int num,int[] numArray,int count) {
		if(count < numArray.length) {// checks if there is room in array
			for(int index = 0;index < numArray.length;index++) {
				if(numArray[index] == 0) {//finds empty position if there is one
					numArray[index] = num; //put number in array
					count++; // add one to count if number is entered in array
					break; // break loop if space is found in array
				}// end of if
			}// end of for loop
		}
		else {
			System.out.println("Array is Full");// array is full 
		}// end of else
		return count;// return number of filled positions
		}// end of addNumber
	public static boolean checkArray(int[]array,int arrayFilled,int checkNum){
		
		for(int i = 0 ;i < arrayFilled;i++){
			if(checkNum == array[i]){
				return true;
			}
		}
		return false;
	}
	public static int removeDuplicates(int[] array1,int[]array2,int array1Count,int array2Count) {
		for(int i = 0;i < array1Count;i++) {// loop through first array one element at a time
			
			for(int j = 0; j < array2Count;j++) {// loop through all elements of second array 
				
				if(array1[i] == array2[j]) { // if value in array1 is equal to value in array2
					for(int k = i; k <= array1.length-2;k++) {// start at that index position found in array1
						
						array1[k] = array1[k+1];// move element ahead of it on top
						
					}//end of delete loop
				i--;// reset index so you don't skip any index after delete	
				array1[array1.length-1] = 0; // move last position in array to zero
				array1Count--; // minus one from count
				}//end of if
			}// end of inside for loop
		}//end of outside for loop
	
	return array1Count;
	}//end of removeDuplicates
	public static void print(int[]array,int count) {
		for(int index = 0;index < array.length;index++) {// loop through contents of array
			if(array[index] != 0)
			System.out.print(array[index] + ",");// print contents of array and a comma
		}
		System.out.println();
	}
	public static void smallBig(int[]array1,int[]array2,int count1,int count2){
		int index1;
		int index2;
					
		int biggest1=0;
		int biggest2=0;
					
		int smallest1= array1[0];
		int smallest2= array2[0];
					
					// print biggest + smallest in array 1
		for (index1=0; index1 < count1; index1++)
			{
			if (array1 [index1] >biggest1){
					biggest1 = array1[index1];
				} 
			else if (array1[index1] <smallest1){
					smallest1 =array1[index1];
				}
			}
					
			System.out.println("Biggest Number in Array 1 is: " + biggest1);
			System.out.println("Smallest Number in Array 1 is: " + smallest1);
					
			// print biggest + smallest in array 2
			for (index2=0; index2 < count2; index2++)
				{
				if (array2 [index2] >biggest2){
					biggest2 = array2[index2];
					} 
			else if (array2[index2] <smallest2){
					smallest2 =array2[index2];
					}
				}
			System.out.println("Biggest Number in Array 2 is: " + biggest2);
			System.out.println("Smallest Number in Array 2 is: " + smallest2);				
	} 
	public static void oddEven(int[]array1,int[]array2){
		int oddEvenIndex1;
		int oddEvenIndex2;
					
		int counteven1 =0;
		int countodd1 =0;
					
		int counteven2 =0;
		int countodd2 =0;
					
		for (oddEvenIndex1=0; oddEvenIndex1<array1.length; oddEvenIndex1++){
			if(array1[oddEvenIndex1] != 0){
				if (array1[oddEvenIndex1] % 2 == 0){
					counteven1 ++;
								
					} 
				else {
					countodd1 ++;
							
					}

				}
			}
		System.out.println("There are " + counteven1 + " even numbers in Array 1");
		System.out.println("There are " + countodd1 + " odd numbers in Array 1");
				
		for (oddEvenIndex2=0; oddEvenIndex2<array2.length; oddEvenIndex2++){
			if(array2[oddEvenIndex2] != 0){	
				if (array2[oddEvenIndex2] % 2 == 0){
					counteven2 ++;
									
					} 
				else {
					countodd2 ++;
							
					}
				}
			}		
		System.out.println("There are " + counteven2 + " even numbers in Array 2");
		System.out.println("There are " + countodd2 + " odd numbers in Array 2");
				
	}
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		int option1 = 0;
		int option2 = 0;
		int array1Count = 0;// counts number of elements filled
		int array2Count = 0;
		
		initializeArrays(array1);// set arrays to zero
		initializeArrays(array2);
		
		while(option1 != 7)
		{
			menu();
			option1 = input1.nextInt();// User entered number
			
			switch(option1) 
			{
				case 1:// add one in
					System.out.println("Press 1 to ADD to FIRST ARRAY -OR- Press 2 to ADD to SECOND ARRAY");
					option2 = input2.nextInt();// User picks 1 or 2
					if(option2 == 1) {
						System.out.print("Enter a Number: ");
						option2 = input2.nextInt();// number entered into array 1 if there is space
						 array1Count = addNumber(option2,array1,array1Count); // +1 to array1Count if number entered successfully
					}
					else if(option2 == 2) {
						System.out.print("Enter a Number: ");
						option2 = input2.nextInt();// number entered into array 2 if there is space
						 array2Count = addNumber(option2,array2,array2Count); // +1 to array2Count if number entered successfully
					}
					else {
						System.out.println("Please pick 1 or 2!");// if User didn't pick 1 or 2
					}
			    break;
				case 2:// check if in array
					System.out.println("Enter a number to search for");
					option2 = input2.nextInt();// User picks 1 or 2
					if(checkArray(array1,array1Count,option2) == true){
						System.out.print("The number you searched was found in array\n");
					}
					else{
						System.out.print("The number you searched was not found in array\n");
					}
				break;
				case 3:// Remove duplicates in array
					array1Count = removeDuplicates(array1,array2,array1Count,array2Count);// -1 if values are removed from array1
				break;
				case 4:// list arrays
					System.out.print("Array 1: ");// list contents of array1
					print(array1,array1Count);
					System.out.print("Array 2: ");// list contents of array2
					print(array2,array2Count);
				break;
				case 5:// largest and smallest number in each array
					
					smallBig(array1,array2,array1Count,array2Count);
					
				break;
				case 6:// count even & odd 
					oddEven(array1,array2);
				break;
			}
		
		}
		System.out.println("Menu Exited");// message when user exits menu
	}

}
