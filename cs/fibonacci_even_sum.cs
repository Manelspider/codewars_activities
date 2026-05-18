using System;

/*

    Give the summation of all even numbers in a Fibonacci sequence up to, but not including, the number passed to your function. Or, in other words, sum all the even Fibonacci numbers that are lower than the given number n (n is not the nth element of Fibonacci sequence) without including n.

    The Fibonacci sequence is a series of numbers where the next value is the addition of the previous two values. The series starts with 0 and 1:

    0 1 1 2 3 5 8 13 21...

    For example:

    0 --> 0
    33 --> 10
    25997544 --> 19544084

*/

class fibonacci_even_sum
{

    public static long Fibonacci(int max)
    {   

        List<int> fibo = [0, 1];
        long sumParFibo = 0;

        int prevNum = 0;
        int cargNum = 1;

        while(true)
        {
            int nextNum = prevNum + cargNum;

            if(nextNum >= max){
                break;
            }

            fibo.Add(nextNum);
            if(nextNum % 2 == 0){
                sumParFibo = sumParFibo + nextNum;
            }

            prevNum = cargNum;
            cargNum = nextNum;

        }
        
        return sumParFibo;
    }

    static void Main()
    {
        Console.WriteLine(Fibonacci(10));
    }
}

