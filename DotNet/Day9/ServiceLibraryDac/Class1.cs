using ContractLibraryDac;
using System;
using System.ServiceModel;

namespace ServiceLibraryDac
{
    [ServiceBehavior]
    public class CService : IDacService
    {
        [OperationBehavior]
        public int AddFun(int x, int y)
        {
            Console.WriteLine("AddFun called");
            return x + y;
        }
        [OperationBehavior]
        public Response SubFun(Request req)
        {
            Console.WriteLine("SubFun called");
            Response res = new Response();
            res.Result = req.ValX - req.ValY;
            return res;
        }
    }
}
