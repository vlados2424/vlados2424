package com.company;
//Программа отсчитывает от числа разряды после запятой с конца
public class MyFloat
{
    private long mantissa;
    private long exponent;

    public MyFloat(long mantissa, long exponent)
    {
        this.mantissa = mantissa;
        this.exponent = exponent;
    }

    public long getMantissa()
    {
        return mantissa;
    }

    public long getExponent() 
    {
        return exponent;
    }

    public static long stepen(long ch, long step)
    {
        long res = 1;
        int k = 0;
        while (k < step)
        {
            res = res * ch;
            k++;
        }
        return res;
    }

    public void sum(MyFloat b)
    {
        long aexp = this.getExponent();
        long bexp = b.getExponent();
        long cela = this.getMantissa() / stepen(10, aexp);
        long posleta = this.getMantissa() % stepen(10, aexp);
        long celb = b.getMantissa() / stepen(10, bexp);
        long posletb = b.getMantissa() % stepen(10, bexp);
        long celsum = cela + celb;
        if (aexp > bexp)
        {
            posletb = posletb * stepen(10, (aexp - bexp));
            long posletsum = posleta + posletb;
            if (posletsum >= (stepen(10, aexp)))
            {
                celsum = celsum + 1;
                posletsum = posletsum - stepen(10, aexp);
            }
            int k = 1;
            String posletsums = Long.toString(posletsum);
            if (posletsum < stepen(10, aexp - 1))
            {
                while (k <= aexp - 1)
                {
                    posletsums = "0" + posletsums;
                    k++;
                }
            }
            System.out.print(celsum);
            System.out.print(".");
            System.out.println(posletsums);
        }
        else if (aexp < bexp)
        {
            posleta = posleta * stepen(10, (bexp - aexp));
            long posletsum = posleta + posletb;
            if (posletsum >= (stepen(10, bexp)))
            {
                celsum = celsum + 1;
                posletsum = posletsum - stepen(10, bexp);
            }
            int k = 1;
            String posletsums = Long.toString(posletsum);
            if (posletsum < stepen(10, bexp - 1))
            {
                while (k <= bexp - 1)
                {
                    posletsums = "0" + posletsums;
                    k++;
                }
            }
            System.out.print((celsum));
            System.out.print(".");
            System.out.println(posletsums);
        }
        else
        {
            long posletsum = posleta + posletb;
            if (posletsum >= (stepen(10, bexp)))
            {
                celsum = celsum + 1;
                posletsum = posletsum - stepen(10, bexp);
            }
            int k = 1;
            String posletsums = Long.toString(posletsum);
            if (posletsum < stepen(10, bexp - 1))
            {
                while (k <= bexp - 1)
                {
                    posletsums = "0" + posletsums;
                    k++;
                }
            }
            System.out.print(celsum);
            System.out.print(".");
            System.out.println(posletsums);
        }
    }

    public void raznost(MyFloat b)
    {
        long aexp = this.getExponent();
        long bexp = b.getExponent();
        long cela = this.getMantissa() / stepen(10, aexp);
        long posleta = this.getMantissa() % stepen(10, aexp);
        long celb = b.getMantissa() / stepen(10, bexp);
        long posletb = b.getMantissa() % stepen(10, bexp);
        long celraz = cela - celb;
        if (aexp > bexp)
        {
            posletb = posletb * stepen(10, (aexp - bexp));
            long posletraz = posleta - posletb;
            if (posletraz < 0)
            {
                celraz = celraz - 1;
                posletraz = stepen(10, aexp) + posletraz;
            }
            int k = 1;
            String posletrazs = Long.toString(posletraz);
            if (posletraz < stepen(10, aexp - 1))
            {
                while (k <= aexp - 1)
                {
                    posletrazs = "0" + posletrazs;
                    k++;
                }
            }
            System.out.print(celraz);
            System.out.print(".");
            System.out.println(posletrazs);
        }
        else if (aexp < bexp)
        {
            posleta = posleta * stepen(10, (bexp - aexp));
            long posletraz = posleta - posletb;
            if (posletraz < 0)
            {
                celraz = celraz - 1;
                posletraz = stepen(10, bexp) + posletraz;
            }
            int k = 1;
            String posletrazs = Long.toString(posletraz);
            if (posletraz < stepen(10, bexp - 1))
            {
                while (k <= bexp - 1)
                {
                    posletrazs = "0" + posletrazs;
                    k++;
                }
            }
            System.out.print(celraz);
            System.out.print(".");
            System.out.println(posletrazs);
        }
        else
        {
            long posletraz = posleta - posletb;
            if (posletraz < 0)
            {
                celraz = celraz - 1;
                posletraz = stepen(10, bexp) + posletraz;
            }
            int k = 1;
            String posletrazs = Long.toString(posletraz);
            if (posletraz < stepen(10, bexp - 1))
            {
                while (k <= bexp - 1)
                {
                    posletrazs = "0" + posletrazs;
                    k++;
                }
            }
            System.out.print(celraz);
            System.out.print(".");
            System.out.println(posletrazs);
        }
    }
}