import java.util.Scanner;
public class Factorial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long factorial = 1;
		if(num>0){
			for (int i = 1; i <= num; i++) {
           factorial *= i;
			}
		}
		else{
			System.out.println("Enter Positive Integer");
		}

        
        

        System.out.println("THE FACTORIAL OF THE NUMBER IS:-"+factorial);
    }
}
