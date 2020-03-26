import javax.swing.*;

public class Node {

   private Node next;
    private String name;
    private String address;
    private Double number;
    private Node Next;

    public Node (String n, String a, Double num)
    {
        name=n;
        address =a;
        number=num;

    }

    public Node() {

    }

    public void setName(String Name)
    {
        name=Name;
    }
    public String getName()

    {
        return name;
    }
    public void  setID(Double ID)
    {
        number=ID;
    }
    public Double getID()
    {
        return number;
    }

    public void setAddress(String a)
    {
        address=a;
    }

    public String getAddress()
    {
        return address;
    }
    public  void setNext(Node List)
    {
        List=Next;
    }
    public Node getNext(Node List)
    {
        return Next;
    }



    public String toString()
    {
        return ("Name is"+name +"address is"+address +"number is"+number);
    }

    
    public int compareTo(String TargetKey)
    {
        return(name.compareTo(TargetKey));

    }
    public Node deepCopy()
    {
        Node clone=new Node(name,address,number);
        return  clone;

    }



    public void input( )
    {

        name = JOptionPane.showInputDialog("Enter the Name");

        address = JOptionPane.showInputDialog("Enter the address");

        number = Double.valueOf(JOptionPane.showInputDialog("Enter the number"));



    }


}


