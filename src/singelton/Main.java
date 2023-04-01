package singelton;

public class Main {
    public static void main(String[] args) {
        Node node1 = Node.getInstance();
        Node node2 = Node.getInstance();

        System.out.println(node1.equals(node2));
    }
}
