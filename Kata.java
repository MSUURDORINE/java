public class Kata{
    public static int findTheLargestNumber(int firstNumber,int secondNumber) {
		if(firstNumber > secondNumber){
		    return firstNumber;
		}
		else{
		    return secondNumber;
		}
	}
	
	public static boolean isEven(int number){
		
		if (number % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isPrimeNumber(int number){
		int factors = 0;
		
        for(int count = 1; count <= number; count++){
        if(number % count == 0)
             factors++;
		}  
        if(factors == 2){
        	return true;
		}

        else{
        	return false;
		}
	}
	
	public static int subtract(int firstNumber, int secondNumber){
		if (firstNumber > secondNumber){
			return firstNumber - secondNumber;	
		}
		else{
			return secondNumber - firstNumber;
		}
	}
	
	public static int divide(int firstNumber,int secondNumber){
		if(secondNumber == 0){
			return 0;
		}
		else{
			return firstNumber / secondNumber; 
		}
	}
	
	public static int factorsOf(int number){
		int factors = 0;
	
		for(int index =1; index <= number; index++){
			if(number % index == 0){
				factors++;
			}
		}
		return factors;
	}
	
	public static boolean isPerfectSquare(int number){
		 if(Math.sqrt(number) % 1 == 0){
		 	return true;
		 }	
		 else{
		 	return false;
		 }
	}
	public static boolean isPalindrome(int number){
		int original = number;
		int reverse = 0;
		while(number != 0){//1
			int lastDigit = number % 10;//1
			reverse = (reverse * 10) + lastDigit;//(32*10)+1=321
			number /= 10;//1/10=0
		}
		if(original == reverse){
			return true;
		}
		else{
			return false;
		}
	}		
	public static long factorialOf(int number){
		long product = 1;
		for(int count = 1; count <= number; count++){
			product *= count;
		}
		return product;
	}		
	
	public static long squareOf(int number){
		long square =  number * number;
		return square;
	}
	
	public static void main(String[] args){
        int maximumResult = findTheLargestNumber(19, 17);
    	System.out.println("Maximum number is " + maximumResult);
    	
    	boolean evenResult = isEven(6);
    	System.out.println(evenResult);
    	
    	boolean primeResult = isPrimeNumber(8);
    	System.out.println(primeResult);
    	
    	int subtractResult = subtract(3,7);
    	System.out.println(subtractResult);
    	
    	int divideResult = divide(9,3);
    	System.out.println(divideResult);
    	
    	int factorsResult = factorsOf(10);
    	System.out.println(factorsResult);
    	
    	boolean perfectSquareResult = isPerfectSquare(7);
    	System.out.println(perfectSquareResult);
    	
    	boolean palindromeResult = isPalindrome(54145);
    	System.out.println(palindromeResult);
    	
    	long factorialResult = factorialOf(5);
    	System.out.println(factorialResult);
    	
    	long squareResult = squareOf(5);
    	System.out.println(squareResult);
	}
}
