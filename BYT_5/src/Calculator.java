import java.util.Scanner;

public class Calculator {
    private OperationHandler handler1;
    public Calculator(){
        this.handler1 = new AdditionHandler();
        OperationHandler handler2 = new SubtractionHandler();
        OperationHandler handler3 = new MultiplicationHandler();
        OperationHandler handler4 = new DivisionHandler();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(handler4);
    }

    public void startChain(OperationRequest request){
        handler1.handle(request);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        OperationRequest request;

        while (true){
            double n1, n2;
            String operation;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter type of operation:");
            operation=in.nextLine();

            System.out.println("Enter operand 1: ");
            n1=in.nextDouble();

            System.out.println("Enter operand 2: ");
            n2=in.nextDouble();

            request = new OperationRequest(n1, n2, operation);
            calculator.startChain(request);

        }

    }
}