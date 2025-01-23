public interface ISuportService {
    void setNext(ISuportService next);
    void handleRequest(ServiceRequest request);

}
