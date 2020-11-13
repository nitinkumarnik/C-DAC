using ServiceLibraryDac;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace DacApp
{
    class Program
    {
        static void Main(string[] args)
        {

            //using ()
            ServiceHost host = new ServiceHost(typeof(CService));
            //{
                host.Open(); // listen to client
                Console.WriteLine("Server started ...");
                Console.WriteLine("Press a key to continue ...");
                Console.ReadLine();
                host.Close();
            //} // dispose called here and it close the server
            Console.WriteLine("Server shutdown ...");
        }
    }
}
