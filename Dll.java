public class Dll {

    //member variables

    public Node head;
    public Node tail;

    //constructors

    public Dll() {
        this.head = null;
        this.tail = null;
    }

    public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.prev = lastNode;
        this.tail = newNode;
    }

    public void printAllValues() {
        Node runner = this.head;
        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }

    public void printAllBackwards() {
        Node runner = this.tail;
        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.prev;
        }
    }

    public Node pop() {
        if (this.head == null) {
            return null;
        }
        Node runner = this.tail;
        runner.prev.next = null;
        return runner;
    }

    public Boolean contains(Integer val) {
        if (this.head == null) {
            return false;
        }
        Node runner = this.head;
        while (true) {
            if (val == runner.value) {
                return true;
            } else if (runner.next != null) {
                runner = runner.next;
            } else {
                return false;
            }
        }
    }

    public int size() {
        if (this.head == null) {
            return 0;
        }
        Node runner = this.head;
        int count = 0;
        while(runner != null) {
            count++;
            runner = runner.next;
        }
        return count;
    }

    public void insertAt(Node newNode, int index) {
        Node runner = this.head;
        for(int i = 0; i < index; i++) {
            runner = runner.next;
        }
        newNode.next = runner;
        newNode.prev = runner.prev;
        runner.prev.next = newNode;
        runner.prev = newNode;
    }

    public void removeAt(int idx) {
        Node runner = this.head;
        for(int i = 0; i < idx; i++) {
            runner = runner.next;
        }
        runner.prev.next = runner.next;
        runner.next.prev = runner.prev;
    }
}