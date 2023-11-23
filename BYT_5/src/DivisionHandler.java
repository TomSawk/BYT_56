public class DivisionHandler extends AbstractOperationHandler {
    @Override
    public void handle(OperationRequest request) {
        if ("divide".equals(request.getOperation())) {
            if (request.getOperand2() != 0) {
                System.out.println("Result: " + (request.getOperand1() / request.getOperand2()));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            forwardToNext(request);
        }
    }
}
