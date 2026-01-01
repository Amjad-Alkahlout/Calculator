public class Functions {
    public void addition(int num1,int num2){
        int result = num1+num2;
        System.out.println("The result of " +num1+"+"+num2+"= "+ result);
    }

    public void multiply(int num1,int num2){
        int result = num1*num2;
        System.out.println("The result of " +num1+"*"+num2+"= "+ result);
    }
    public void division(int num1,int num2){
        try {
            int result = num1 / num2;
            System.out.println("The result of " + num1 + "/" + num2 + "= " + result);
        }
        catch (ArithmeticException e){
            System.out.println("can not divide a number by zero");
        }
    }
    public void subtraction(int num1,int num2){
        int result =num1-num2;
        System.out.println("The result of " +num1+"-"+num2+"= "+ result);
    }
}
