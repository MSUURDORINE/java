import java.util.Scanner;
  public class MultipleNumbers{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number: ");
    int number = input.nextInt();
    
    for(int index = 120; number <= index ; index--){
     
      if(number % index == 0){ 
    
      System.out.println(index);     
    }

    }
  }
}
