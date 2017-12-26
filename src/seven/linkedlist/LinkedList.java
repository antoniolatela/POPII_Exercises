package seven.linkedlist;

public class LinkedList<T> {

    class Node<T> {//removing public access and class became package access (only in the package)
        private T item;
        private Node next; //recursive data structure

        /**
         *
         * @param value
         * @param next
         */
        public Node(T value, Node<T> next){
            setValue(value);
            setNext(next);
        }

        public T getvalue(){
            return item;
        }

        public void setValue(T value){
            item = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next){
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +

                    '}';
        }
    }


    private Node<T> head;
    private int size;


    { //alwys executed - Tupe of constructor
        head = null;
        size = 0;
    }

    public LinkedList() {

    }

    public int size(){
        return size;
    }

    public void add(T value){
        head = addToEnd(head, value);
        size++;
    }

    private Node<T> addToEnd(Node<T> node, T value) { //let it work in iterative and recursive way.
        if (node == null) {
            return new Node(value, null);
        } else {
            addToEnd(node.getNext(), value);
        }
        return node;
    }

    @Override
    public String toString() {
        return "" + listToString(head) + "";
    }

    private Node getNext(Node<T> node, T value) {
        return new Node(value, node);
    }

    private String listToString(Node<T> node) {
        if (node == null){
            return "";
        } else {
            return node + "\n" + listToString(node.getNext());
        }
    }
}
