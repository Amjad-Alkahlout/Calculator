import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Functions f =new Functions();
        int num1,num2;
        int choice;
        char ch ='Y';
        while (ch =='Y') {
            System.out.println("\t\t\tBasic Calculator\t\t\t");
            System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division\n5- Exit");
            System.out.print("select the operation: ");
            choice = in.nextInt();
            if (choice==5){
                System.exit(0);
            }
                System.out.println("Enter the operands: ");
                num1 = in.nextInt();
                num2 = in.nextInt();

            switch (choice) {
                case 1:f.addition(num1,num2);
                    break;
                case 2:f.subtraction(num1,num2);
                    break;
                case 3:f.multiply(num1,num2);
                    break;
                case 4:f.division(num1,num2);
                    break;
                default:
                    System.out.println("invalid choice");
            }
            System.out.println("Do you want to continue Y/N :");
             ch = in.next().charAt(0);
        }



        }
    }

