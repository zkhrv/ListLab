import List.CountColor;
import List.MyList;

public class TestList
{
    public static void main(String[] args) throws Exception
    {
        MyList<CountColor> ml = new MyList<CountColor>();
        System.out.println("Создание списка");
        CountColor O7 = new CountColor(7, "Red");
            ml.AddFirst(O7);
        CountColor O6 = new CountColor(6, "Blue");
            ml.AddFirst(O6);
        CountColor O5 = new CountColor(5, "Red");
            ml.AddFirst(O5);
        CountColor O4 = new CountColor(4, "Blue");
            ml.AddFirst(O4);
        CountColor O3 = new CountColor(3, "Blue");
            ml.AddFirst(O3);
                ml.print();
                    ml.CountList();
                        System.out.println("");

        System.out.println("Добавление первого элемента");
        CountColor O2 = new CountColor(2, "Black");
            ml.AddFirst(O2);
        CountColor O1 = new CountColor(1, "Grey");
            ml.AddFirst(O1);
                ml.print();
                    ml.CountList();
                        System.out.println("");

        System.out.println("Добавление последнего");
        CountColor O0 = new CountColor(0, "White");
            ml.AddLast(O0);
                ml.print();
                    ml.CountList();
                        System.out.println("");

        System.out.println("Копирование");
        MyList<CountColor> copy = new MyList<CountColor>(ml);
            copy.print();
                copy.CountList();
                    System.out.println("");

        try
        {
            System.out.println("Удаление первого элемента");
                ml.DeleteFirst();
                    ml.print();
                        ml.CountList();
                            System.out.println("");
        }
        catch (Exception NoElements)
        {
            throw  new Exception ("Первый элемент не удалился");
        }
        try
        {
            System.out.println("Удаление элемента по индексу 03");
                ml.DeleteData(O3);
                    ml.print();
                        ml.CountList();
                            System.out.println("");

        }
        catch (Exception NoElements)
        {
            throw  new Exception ("Элемент не удалился");
        }
        try
        {
            System.out.println("Удаление всех элементов списка");
                ml.DeleteAll();
                        ml.CountList();
                            System.out.println("");

        }
        catch (Exception NoElements)
        {
            throw  new Exception ("Ошибка при удалении списка");
        }
    }

}

