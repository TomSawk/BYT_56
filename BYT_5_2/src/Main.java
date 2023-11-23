public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ChatUser(mediator, "John");
        User user2 = new ChatUser(mediator, "Doe");
        User user3 = new ChatUser(mediator, "Smith");
        User user4 = new ChatUser(mediator, "Alice");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
