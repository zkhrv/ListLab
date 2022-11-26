package List;

public class CountColor implements Comparable <CountColor>
{
    int count;
    String color;

    public CountColor(int cou, String col)
    {
        count = cou;
        color = col;
    }
    public String toString()
    {
        return count + " " + color;
    }
    public int compareTo (CountColor CC)
    {
        if (this.count < CC.count) {return -1;}
        if (this.count > CC.count) {return 1;}
        else {return 0;}
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof CountColor)
        {
            CountColor tmp = (CountColor) obj;
            return  (this.count == tmp.count) && (this.color.equals(tmp.color));
        }
        return false;
    }
}
