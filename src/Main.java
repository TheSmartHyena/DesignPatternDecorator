public class Main {
    public static void main(String[] args) {
        IMessagerie test = new Messagerie("Poney", 1, 2 );
        System.out.println(test.getMessage());

        test = new EncodeMessagerieDecorator(test);
        System.out.println(test.getMessage());

        test = new DecodeMessagerieDecorator(test);
        System.out.println(test.getMessage());
    }
}