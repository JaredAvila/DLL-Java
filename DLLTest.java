public class DLLTest {
    public static void main(String[] args) {
        Dll dll = new Dll();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);
        Node n7 = new Node(30);

        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);

        // dll.printAllBackwards();
        // Node popped = dll.pop();
        // System.out.println(popped.value);
        // System.out.println(dll.contains(70));
        // System.out.println(dll.size());
        dll.insertAt(n7, 3);
        dll.printAllValues();
        dll.removeAt(3);
        dll.printAllValues();

    }
}