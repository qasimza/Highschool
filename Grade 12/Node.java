public class Node
{
    Node link;
    int data;
    Node()
    {
        link=null;
        data=0;
    }
    Node(Node n, int d)
    {
        link=n;
        data=d;
    }
    public void setLink(Node n)
    {
        link=n;
    }
    public void setData(int d)
    {
        data=d;
    }
    public Node getLink()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
    
}