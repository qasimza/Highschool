import java.util.*;
class List extends Node
{
    Node start;
    List()
    {
        start=null;
    }
    public boolean listIsEmpty()
    {
        return start==null;
    }
    public void insert(int val)
    {
        Node nptr, ptr, save=null;
        nptr=new Node(null, val);
        boolean ins=false;
        if (start==null)
        {
            start=nptr;
        }
        else if (val<=start.getData()) 
        {
            nptr=setLink(start);
            start=nptr;
        }
        else 
        {
            save=start;
            ptr=start.getlink();
            while (ptr!=null)
            {
                if (val>=save.getData()&&val<=ptr.getData())
                {
                    save.setLink(nptr);
                    nptr.setlink(ptr);
                    ins=true;
                    break;
                }
                else
                {
                    save=ptr;
                    ptr=ptr.getLink();
                }
            }
            if(ins==false)
            {
                save.setlink(nptr);
            }
        }
    }
}