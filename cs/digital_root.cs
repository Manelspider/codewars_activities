using System;

/*

    Digital root is the recursive sum of all the digits in a number.

    Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
    Examples

        16  -->  1 + 6 = 7
    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
    493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

*/


class sum_of_digits
{
    public static int DigitalRoot(long n)
    {
        
        char[] digits =  n.ToString().ToCharArray();

        int Result = 0;

        if (digits.Length < 2)
        {
            return Int32.Parse(digits[0].ToString());
        }

        while(digits.Length >= 2)
        {
            Result = 0;

            foreach (char digit in digits)
            {
                int digitConv = Int32.Parse(digit.ToString());
                Result = Result + digitConv;
            }
            digits = Result.ToString().ToCharArray();
        }
        
        Result = int.Parse(digits[0].ToString());

        return Result;
    }

    static void Main()
    {
        Console.WriteLine(DigitalRoot(999999999999));
    }
}

