public class Functions {

    public double addition(double num1,double num2){
        double result;
         result = num1+num2;
        return result;
    }

    public double multiply(double num1,double num2){
        double result;
         result = num1*num2;
        return result;
    }
    public double division(double num1,double num2) {
        double result;
        if (num2 == 0) {
            System.out.println("can not divide a number by zero");
            return 0;
        }
        result = num1 / num2;
        return result;
    }
    public double subtraction(double num1,double num2){
        double result;
         result =num1-num2;
        return result;

    }
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

}
