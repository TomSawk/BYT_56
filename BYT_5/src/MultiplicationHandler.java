public class MultiplicationHandler extends AbstractOperationHandler {
    @Override
    public void handle(OperationRequest request) {
        if ("multiply".equals(request.getOperation())) {
            System.out.println("Result: " + (request.getOperand1() * request.getOperand2()));
        } else {
            forwardToNext(request);
        }
    }
}
