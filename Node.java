package List;

public class Node<T>
{
    T data;
    Node<T> next;
    public Node (Node<T> next, T data)
    {
        this.data=data;
        this.next=next;
    }
}
