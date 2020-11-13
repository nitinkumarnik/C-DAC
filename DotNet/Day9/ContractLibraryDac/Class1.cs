using System.Runtime.Serialization;
using System.ServiceModel;

namespace ContractLibraryDac
{
    [DataContract]
    public class Request
    {
        [DataMember]
        public int ValX { get; set; }
        [DataMember]
        public int ValY { get; set; }
    }

    [DataContract]
    public class Response
    {
        [DataMember]
        public int Result { get; set; }
    }

    [ServiceContract]
    public interface IDacService
    {
        [OperationContract]
        int AddFun(int x, int y); // implicitly datacontract
        [OperationContract]
        Response SubFun(Request req);
    }
}
