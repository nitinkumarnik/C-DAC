using System;

namespace LoggerLibrary
{
    public interface IDacMessage
    {
        void dispatch(string msg);
    }

    internal class NullMessage : IDacMessage
    {
        public void dispatch(string msg)
        {
            // do nothing
        }
    }

    public static class DacMessageFactory
    {
        public static IDacMessage GetMessageInstance()
        {
            Console.WriteLine("DacMessageFactory version 1.0.0.0");
            // return null; // bad practice
            return new NullMessage();
        }
    }
}
