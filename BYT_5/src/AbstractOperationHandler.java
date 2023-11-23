public abstract class AbstractOperationHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNextHandler(OperationHandler handler) {
        this.nextHandler = handler;
    }

    protected void forwardToNext(OperationRequest request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
