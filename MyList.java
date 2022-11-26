package List;

public class MyList<T>
{
    private Node<T> head;
    private Node<T> tail;
    private int count;

    public MyList() {}

    public MyList(MyList<T> newList)
    {
        this.head = new Node<T>(null, null);
        Node<T> nextNode = this.head;
        Node<T> go = newList.head;

        for (int i = 0; i < newList.count; i++)
        {
            nextNode.data = go.data;
                nextNode.next = new Node<T>(null, null);
                    nextNode = nextNode.next;
                        go = go.next;
                            this.count++;
        }
    }

    public void AddFirst(T data)
    {
        Node<T> new_node = new Node<T>(head, data);
        head = new_node;
        if (tail == null)
        {
            tail = new_node;
        }
        count++;
    }

    public void AddLast(T data)
    {
        Node<T> new_node = new Node<T>(null, data);
        if (tail == null)
        {
            head = new_node;
            tail = new_node;
        }
        else
        {
            Node<T> last_node = tail;
            last_node.next = new_node;
            tail = new_node;
        }
        count++;
    }

    public void DeleteData(T data) throws Exception
    {

        Node<T> delete_before_node = null;
        Node<T> delete_node = head;

        for (int i = 0; i < count; ++i)
        {
            T TmpData = delete_node.data;

            if (TmpData.equals(data))
            {
                if (delete_before_node != null)
                {
                    delete_before_node.next = delete_node.next;
                }
                else
                {
                    if (delete_node == tail)
                    {
                        tail = delete_before_node;
                    }
                    else
                    {
                        head = delete_node.next;
                    }
                }
                delete_node.data = null;
                delete_node.next = null;
                count--;
                return;
            }
            delete_before_node = delete_node;
            delete_node = delete_node.next;
        }
        throw new Exception("Нет элементов удовлетворяющих запросу");
    }

    public void DeleteFirst()
    {
        head = head.next;
        count--;
    }

    public void DeleteAll()
    {
         head = null;
         tail = null;
         count = 0;
    }

    public void CountList()
    {
        if (count == 0) {System.out.println("Cписок пуст");}
        else
        {System.out.println("В списке " + count + " элементов");}
    }

    public void print()
    {
        Node<T> Node = head;

        for (int i = 0; i < count; ++i)
        {
            System.out.print(Node.data + " -> ");
            Node = Node.next;
        }
        System.out.println("null");
    }
}


