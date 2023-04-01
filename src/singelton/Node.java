package singelton;

public class Node {
    private static Node instance;

    private Node() { }

    public synchronized static Node getInstance() {
        if (instance == null) {
            instance = new Node();
        }
        return instance;
    }
}
