import java.sql.SQLOutput;

public class LinkedLIstExample {
    Node head=null;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;

        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addlast(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null) {
            currNode = currNode.next;

        }
        currNode.next=newNode;
    }

    public void Showoutput(){
        if(head==null){
            System.out.println("List is Empty !");
            return;
        }

        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("Null");
    }
    public void deletfirst(){
        if(head==null){
            System.out.println("List is Empty !");
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("List Is empty !");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node LastNode=head.next;
        while(LastNode.next!=null){
            LastNode=LastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }

    public static void main(String[] args) {
        LinkedLIstExample list=new LinkedLIstExample();
        list.addFirst("this");
        list.addlast("is");
        list.addlast("a");
        list.addFirst("Hello !");
        list.Showoutput();
        list.deletfirst();
        System.out.println("");
        list.Showoutput();;
        list.deletelast();
        System.out.println("");
        list.Showoutput();;


    }
}
