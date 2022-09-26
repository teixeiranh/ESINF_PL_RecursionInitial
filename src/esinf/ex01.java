package esinf;

public class ex01
{
    /**
     * Exercise a
     */
    public static String reverString(String word)
    {
        //base case
        if (word.isEmpty())
        {
            return word;
        }

        //recursive case
        return reverString(word.substring(1))+word.charAt(0);
    }

    /**
     * Exercise b
     */
    public static int product(int a, int b)
    {
        //base case
        if (b==1)
        {
            return a;
        }

        //recursive case
        return a+product(a,b-1);
    }

    /**
     * Exercise c
     */
    public static int gcd(int a, int b)
    {
        //make shore that a is greater than b
        int temp=a;
        if (a < b)
        {
            a=b;
            b=temp;
        }

        //base case
        if (b==0)
        {
            return a;
        }

        //recursive case
        return gcd(b,(a%b));
    }
}
