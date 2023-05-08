public class CalculatorPlus {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int factorial(int a)
    {
        int result = a ;
        for(int b = 1 ; b < a ; b++)
        {
            result *= b ;
        }

        return result ;
    }

    public int flipSign(int a)
    {
        return (-1) * a ;
    }

    public int square(int a)
    {
        return a * a ;
    }

    public double squareRoot(double a)
    {
        return Math.sqrt(a) ;
    }

    public String se()
    {
        String a = "software" ;
        String b = "engineering" ;

        return a + b ;
    }
}
