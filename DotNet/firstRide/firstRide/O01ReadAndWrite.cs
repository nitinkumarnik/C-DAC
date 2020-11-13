using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace firstRide1
{
    class O01ReadAndWrite
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your name:");
            string name = Console.ReadLine();
            
            Console.WriteLine("Enter your city:");
            // var type inference 
            var city = Console.ReadLine();
            
            Console.WriteLine("Enter your Age: ");
            var ageStr = Console.ReadLine();
            int age = int.Parse(ageStr);

            Console.WriteLine("No. of days");
            int days = int.Parse(Console.ReadLine());

            Console.WriteLine("Initial amount to pay");
            string advStr = Console.ReadLine();
            int advance = Convert.ToInt32(advStr);

            string sLine = new string('_', 50);
            string dLine = new string('=', 50);

            Console.WriteLine(sLine);

            Console.WriteLine("Name: {1}\nCity: {0}", city, name);
            Console.WriteLine("Age: {0}", age);
            Console.WriteLine("Days: {0}", days);
            Console.WriteLine("Adva: {0}", advance);
            Console.WriteLine(dLine);
        }
    }
}
