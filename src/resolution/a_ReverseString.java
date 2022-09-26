package resolution;

public class a_ReverseString
{
    //a
    public static String reverString(String word)
    {
        //caso base
        if (word.length() == 1)
        {
            return word;
        }

        //TODO: Acabar este exercício
        return word;
    }

    //b
    public static int compute(int x, int y)
    {
        //base case
        if (x==0||y==0)
        {
            return 0;
        }

        //recursive case
        if (x <= y)
        {
            return compute(x - 1, y) + y;
        }
        else
        {
            return compute(x, y-1) + x;
        }

        //TODO: Testar este método
    }

    //c
    public static int greatestCommonDivisor(int int1, int int2)
    {
        int divisor = int2;
        //base case
        if (int1 % int2 == 0)
        {
            return divisor;
        }

        //recursive case
        return greatestCommonDivisor(int2, int1 % int2);
    }

    //TODO: Acabar o exercício
}
