public interface OperationHandler {
    void setNextHandler(OperationHandler handler);
    void handle(OperationRequest request);
}
