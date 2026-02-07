import java.util.Scanner;
public class InputBasedCalculator{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
     System.out.println("Enter first number:");
     double num1 = sc.nextDouble();
     System.out.println("Enter second number:");
    double num2 = sc.nextDouble();
    System.out.println("Enter Operation:\n 1: Addition \n 2:Subtraction \n 3: Multiplication \n 4: Division");
    int op =sc.nextInt();
    if(op==1){
        System.out.println("Addition of Two Number is: "+(num1+num2));
    }
    else if(op==2){
        System.out.println("Subtraction of Two Number is: "+(num1-num2));
    }
    else if(op==3){
        System.out.println("Multiplication of Two Number is: "+(num1*num2));
    }
    else if(op==4){
        if(num2 == 0){
            System.out.println("Can't Divide by 0");
        }
        else
        System.out.println("Division of Two Number is: "+(num1/num2));
    }
    else{
        System.out.println("Invalid Operation");
    }
    }
}