using System;

namespace AccountsLibrary_1
{
    public class SavingsAccount
    {
        public void DoDebit(int accountId, int amount)
        {
            Console.WriteLine("Open Database");
            Console.WriteLine($"Saving Account: Perform Debit Operation for {accountId} of {amount}");
            Console.WriteLine("Close Database");
        }

        public void DoCredit(int accountId, int amount)
        {
            Console.WriteLine("Open Database");
            Console.WriteLine($"Saving Account: Perform Credit Operation for {accountId} of {amount}");
            Console.WriteLine("Close Database");
        }
    }

    public class CurrentAccount
    {
        public void DoDebit(int accountId, int amount)
        {
            Console.WriteLine("Open Database");
            Console.WriteLine($"Current: Perform Debit Operation for {accountId} of {amount}");
            Console.WriteLine("Close Database");
        }

        public void DoCredit(int accountId, int amount)
        {
            Console.WriteLine("Open Database");
            Console.WriteLine($"Current: Perform Credit Operation for {accountId} of {amount}");
            Console.WriteLine("Close Database");
        }
    }
}


namespace AccountsLibrary_2
{
    public abstract class Account
    {
        protected Account()
        {

        }
        public void DoDebit(int accountId, int amount)
        {
            Console.WriteLine("Open Database");
            ActualDebit(accountId, amount); //Console.WriteLine($"Account: Perform Debit Operation for {accountId} of {amount}");
            Console.WriteLine("Close Database");
        }
        
        public void DoCredit(int accountId, int amount)
        {
            Console.WriteLine("Open Database");
            ActualCredit(accountId, amount); //Console.WriteLine($"Account: Perform Credit Operation for {accountId} of {amount}");
            Console.WriteLine("Close Database");
        }

        protected abstract void ActualCredit(int accountId, int amount);
        protected abstract void ActualDebit(int accountId, int amount);
    }

    public class SavingsAccount : Account
    {
        protected override void ActualCredit(int accountId, int amount)
        {
            Console.WriteLine($"SavingsAccount: Perform Credit Operation for {accountId} of {amount}");
        }
        protected override void ActualDebit(int accountId, int amount)
        {
            Console.WriteLine($"SavingsAccount: Perform Debit Operation for {accountId} of {amount}");
        }
    }

    public class CurrentAccount : Account
    {
        protected override void ActualCredit(int accountId, int amount)
        {
            Console.WriteLine($"CurrentAccount: Perform Credit Operation for {accountId} of {amount}");
        }

        protected override void ActualDebit(int accountId, int amount)
        {
            Console.WriteLine($"CurrentAccount: Perform Debit Operation for {accountId} of {amount}");
        }
    }
}


namespace AccountsLibrary_3
{
    public class DB
    {
        public void OpenDb()
        {
            Console.WriteLine("Open Database");
        }

        public void CloseDb()
        {
            Console.WriteLine("Close Database");
        }
    }

    public abstract class Account
    {
        DB db;
        protected Account()
        {
            db = new DB();
        }
        public void DoDebit(int accountId, int amount)
        {
            db.OpenDb();
            ActualDebit(accountId, amount); //Console.WriteLine($"Account: Perform Debit Operation for {accountId} of {amount}");
            db.CloseDb();
        }

        public void DoCredit(int accountId, int amount)
        {
            db.OpenDb();
            ActualCredit(accountId, amount); //Console.WriteLine($"Account: Perform Credit Operation for {accountId} of {amount}");
            db.CloseDb();
        }

        protected abstract void ActualCredit(int accountId, int amount);
        protected abstract void ActualDebit(int accountId, int amount);
    }

    public class SavingsAccount : Account
    {
        protected override void ActualCredit(int accountId, int amount)
        {
            Console.WriteLine($"SavingsAccount: Perform Credit Operation for {accountId} of {amount}");
        }
        protected override void ActualDebit(int accountId, int amount)
        {
            Console.WriteLine($"SavingsAccount: Perform Debit Operation for {accountId} of {amount}");
        }
    }

    public class CurrentAccount : Account
    {
        protected override void ActualCredit(int accountId, int amount)
        {
            Console.WriteLine($"CurrentAccount: Perform Credit Operation for {accountId} of {amount}");
        }

        protected override void ActualDebit(int accountId, int amount)
        {
            Console.WriteLine($"CurrentAccount: Perform Debit Operation for {accountId} of {amount}");
        }
    }
}


namespace AccountsLibrary_4
{
    public class DB
    {
        public void OpenDb()
        {
            Console.WriteLine("Open Database");
        }

        public void CloseDb()
        {
            Console.WriteLine("Close Database");
        }
    }

    public static class DbFactoryClass
    {
        public static DB GetDb()
        {
            return new DB();
        }
    }

    public abstract class Account
    {
        DB db;
        protected Account()
        {
            db = DbFactoryClass.GetDb();
        }
        public void DoDebit(int accountId, int amount)
        {
            db.OpenDb();
            ActualDebit(accountId, amount);
            db.CloseDb();
        }

        public void DoCredit(int accountId, int amount)
        {
            db.OpenDb();
            ActualCredit(accountId, amount);
            db.CloseDb();
        }

        protected abstract void ActualCredit(int accountId, int amount);
        protected abstract void ActualDebit(int accountId, int amount);
    }

    public class SavingsAccount : Account
    {
        protected override void ActualCredit(int accountId, int amount)
        {
            Console.WriteLine($"SavingsAccount: Perform Credit Operation for {accountId} of {amount}");
        }
        protected override void ActualDebit(int accountId, int amount)
        {
            Console.WriteLine($"SavingsAccount: Perform Debit Operation for {accountId} of {amount}");
        }
    }

    public class CurrentAccount : Account
    {
        protected override void ActualCredit(int accountId, int amount)
        {
            Console.WriteLine($"CurrentAccount: Perform Credit Operation for {accountId} of {amount}");
        }

        protected override void ActualDebit(int accountId, int amount)
        {
            Console.WriteLine($"CurrentAccount: Perform Debit Operation for {accountId} of {amount}");
        }
    }
}


namespace AccountsLibrary
{
    public abstract class DB
    {
        public abstract void OpenDb();

        public abstract void CloseDb();
        
    }

    public class SqlDb : DB
    {
        public override void CloseDb()
        {
            Console.WriteLine("Sql : Close Database");
        }

        public override void OpenDb()
        {
            Console.WriteLine("Sql : Open Database");
        }
    }

    public class OracleDb : DB
    {
        public override void CloseDb()
        {
            Console.WriteLine("Oracle : Close Database");
        }
        public override void OpenDb()
        {
            Console.WriteLine("Oracle : Open Database");
        }
    }

    public static class DbFactoryClass
    {
        public static DB GetDb()
        {
            // return new SqlDb();
            return new OracleDb();
        }
    }

    public abstract class Account
    {
        DB db;
        protected Account()
        {
            db = DbFactoryClass.GetDb();
        }
        public void DoDebit(int accountId, int amount)
        {
            db.OpenDb();
            ActualDebit(accountId, amount);
            db.CloseDb();
        }

        public void DoCredit(int accountId, int amount)
        {
            db.OpenDb();
            ActualCredit(accountId, amount);
            db.CloseDb();
        }

        protected abstract void ActualCredit(int accountId, int amount);
        protected abstract void ActualDebit(int accountId, int amount);
    }

    public class SavingsAccount : Account
    {
        protected override void ActualCredit(int accountId, int amount)
        {
            Console.WriteLine($"SavingsAccount: Perform Credit Operation for {accountId} of {amount}");
        }
        protected override void ActualDebit(int accountId, int amount)
        {
            Console.WriteLine($"SavingsAccount: Perform Debit Operation for {accountId} of {amount}");
        }
    }

    public class CurrentAccount : Account
    {
        protected override void ActualCredit(int accountId, int amount)
        {
            Console.WriteLine($"CurrentAccount: Perform Credit Operation for {accountId} of {amount}");
        }

        protected override void ActualDebit(int accountId, int amount)
        {
            Console.WriteLine($"CurrentAccount: Perform Debit Operation for {accountId} of {amount}");
        }
    }
}