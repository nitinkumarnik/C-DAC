using System;

namespace DacLibNs
{
    public class CMath
    {
        public int AddFun(int x, int y)
        {
            Console.WriteLine("Addfun called");
            return x + y;
        }

        public void SubFun(int x, int y, out int z)
        {
            Console.WriteLine("SubFun called");
            z = x - y;
        }

        public void MulFun(int x, ref int y)
        {
            Console.WriteLine("MulFun called ");
            y = x * y;
        }

        public double DivFun(double x, double y)
        {
            Console.WriteLine("DivFun called ");
            return x / y;
        }

        public int SumAllElem(int [] arr)
        {
            int sum = 0;
            foreach(var item in arr)
            {
                sum += item;
            }
            return sum;
        }
        public int SumAllParam(params int[] arr)
        {
            int sum = 0;
            foreach (var item in arr)
            {
                sum += item;
            }
            return sum;
        }
    }
}
