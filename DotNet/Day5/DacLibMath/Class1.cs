using System;

namespace DacLibMath
{
    public class CMath
    {
        public CMath()
        {
            Console.WriteLine("CMath ctor 1.0.0.0");
        }

        public int AddFun(int x, int y)
        {
            Console.WriteLine("AddFun 1.0.0.0");
            return x + y;
        }

        ~CMath() // finalizer
        {
            Console.WriteLine("CMath d-tor 1.0.0.0");
        }
    }
}
