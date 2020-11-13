using AccountsLibrary;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DacApp
{
    class BankApp
    {
        static void Main(string[] args)
        {
            SavingsAccount savings = new SavingsAccount();
            savings.DoCredit(101, 30000);
            savings.DoDebit(101, 10000);

            CurrentAccount current = new CurrentAccount();
            current.DoCredit(102, 50000);
            current.DoDebit(102, 20000);

            Console.ReadLine();
        }
    }
}
