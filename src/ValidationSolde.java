public class ValidationSolde implements ISuportService {
    private ISuportService next = null;


    @Override
    public void setNext(ISuportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if(request.getType() == ETypeRequest.VALIDATION_SOLDE){

        }
    }
}
