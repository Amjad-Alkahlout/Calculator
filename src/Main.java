import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Functions f =new Functions();
        double num1,num2;
        int choice;
        char ch ='Y';
        while (ch =='Y' || ch =='y') {
            System.out.println("\t\t\tBasic Calculator\t\t\t");
            System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division\n5- Power\n6- Exit");
            System.out.print("select the operation: ");
            choice = in.nextInt();
            if (choice == 6) {
                break;
            }
                System.out.println("Enter the operands: ");
                num1 = in.nextDouble();
                num2 = in.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("The result of " +num1+"+"+num2+"= "+ f.addition(num1,num2));
                    break;
                case 2:
                    System.out.println("The result of " +num1+"-"+num2+"= "+ f.subtraction(num1,num2));
                    break;
                case 3:
                    System.out.println("The result of " +num1+"*"+num2+"= "+ f.multiply(num1,num2));
                    break;
                case 4:
                    double result=f.division(num1, num2);
                    if(num2!=0) {
                        System.out.println("The result of " + num1 + "/" + num2 + "= " + result);
                    }
                    break;
                case 5:
                    System.out.println("The result of " +num1+"^"+num2+"= "+ f.power(num1,num2));
                    break;
                default:
                    System.out.println("invalid choice");
            }
            System.out.println("Do you want to continue Y/N :");
             ch = in.next().charAt(0);
        }


        in.close();

        }
    }

