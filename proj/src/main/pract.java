import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        float a,b;

        System.out.println("Which operation do you want to perform? \n1.Addition\t2.Subtraction\t3.Multiplication\t4.divition\t5.Modulo");
        ch=sc.nextInt();
        System.out.println("You chose:"+ch);

        System.out.println("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.print("Numbers are:" +a);
        System.out.println("   " +a);

        switch (ch){
            case 1:
            {
                System.out.print("Answer is:");
                System.out.println(a+b);
                break;
            }
            case 2:
            {
                System.out.print("Answer is:");
                System.out.println(a-b);
                break;
            }
            case 3:
            {
                System.out.print("Answer is:");
                System.out.println(a*b);
                break;
            }
            case 4:
            {
                System.out.print("Answer is:");
                System.out.println(a/b);
                break;
            }
            case 5:
            {
                System.out.print("Answer is:");
                System.out.println(a%b);
                break;
            }

            default:
                System.out.println("Choose correct option !!");
        }


    }
}
