public class SubtractionHandler extends AbstractOperationHandler {
    @Override
    public void handle(OperationRequest request) {
        if ("subtract".equals(request.getOperation())) {
            System.out.println("Result: " + (request.getOperand1() - request.getOperand2()));
        } else {
            forwardToNext(request);
        }
    }
}

