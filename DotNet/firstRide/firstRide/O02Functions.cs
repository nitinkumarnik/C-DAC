using System;


namespace firstRide2
{


    class CMain
    {
        static void Main1(string[] args)
        {
            int x = 10, y = 20;
            x = x + y;
            y = x - y;
            x = x - y;

            string result = string.Format("x={0} and y={1}", x, y);
            Console.WriteLine(result);

        }

        static void Main2(string[] args)
        {
            for (int i=1, num=0; i<=5; i++)
                Console.WriteLine(num = num * 10 + i);
        }

        static void Main3(string[] args)
        {
            for (int i = 5; i >= 1; i--)
                Console.WriteLine(i); 
        }

        static void Main4(string[] args)
        {
            int x = 15, y = 60;
            while(x != y)
            {
                if (x > y)
                    x = x - y;
                if (y > x)
                    y = y - x;
            }
            Console.WriteLine("The HCF is {0}", x);
        }

        static void Main(string[] args)
        {
            for (int i=1; i<6; i++)
            {
                for (int j=1; j<=i; j++)
                {
                    Console.Write("{0, -3}",j);
                }
                Console.WriteLine();
            }
        }
    }

}