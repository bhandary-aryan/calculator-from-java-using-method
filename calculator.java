import java.util.Scanner;
public class calculator {
    static float sum(float x, float y){
        float z=x+y;
        return z;
    }

    static float sub(float x, float y){
        float z=x-y;
        return z;
    }

    static float mul(float x, float y){
        float z=x*y;
        return z;
    }

    static float div(float x, float y){
        float z=x/y;
        return z;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\nLoading Calcualtor....\n");

        System.out.println("Select: \n 1--> for addition.\n 2--> for Subtraction.\n 3--> for Multiplication.\n 4--> for Division");
        int choose= sc.nextInt();

        System.out.println("Enter first number: ");
        float a= sc.nextFloat();
        System.out.println("Enter second number: ");
        float b= sc.nextFloat();
        float c;
        

        switch(choose){
            case 1:
            c=sum(a, b);
            System.out.println("The addtion of "+a+ "+"+b+" = " +c);
            break;

            case 2:
            c=sub(a,b);
            System.out.println("The Substraction of "+a+"-" +b+" = "+c);
            break;

            case 3:
            c=mul(a,b);
            System.out.println("The multiplication of "+a+" x "+b+" = "+c);
            break;

            case 4:
            c= div(a,b);
            System.out.println("The division of "+a+"/"+b+" = "+c);
            break;
            
            default:
            System.out.println("Invalid input...");
        }

        sc.close();

            

    }
    
}
