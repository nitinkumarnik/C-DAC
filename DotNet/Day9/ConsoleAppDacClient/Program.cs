using ContractLibraryDac;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleAppDacClient
{
    // proxy (place holder of a service or it is surrogate of a service)
    // 
    public class DacServiceClient : ClientBase<IDacService>, IDacService
    {
        public int AddFun(int x, int y)
        {
            return base.Channel.AddFun(x, y);
        }

        public Response SubFun(Request req)
        {
            return base.Channel.SubFun(req);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a number ");
            int num1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter another number ");
            int num2 = int.Parse(Console.ReadLine());
            DacServiceClient proxy = new DacServiceClient();
            int res = proxy.AddFun(num1, num2);
            Console.WriteLine($"{num1}+{num2}={res}");
            Request req = new Request() { ValX = num1, ValY = num2 };
            Response rspnz = proxy.SubFun(req);
            Console.WriteLine($"{num1}-{num2}={rspnz.Result}");
            proxy.Close();
        }
    }
}
