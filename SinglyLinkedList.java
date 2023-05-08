package SinglyLinkedList;

import java.util.Scanner;

class SinglyLinkedList {
	
    static class Node{
    	/*We are making Node class as Static Nested CLass so that 
    	we can use private Members Directly and also We don't need to Create Object 
    	of Node in SinglyLinkedList Class also we can object of node w/o creating object of singlyLinekd list*/
        private int data;
        private Node next;

        public Node() {//Parameterless Constructor
            data=0;
            next=null;
        }

        public Node(int data) {//Parameterized Constructor
            this.data = data;
            this.next = null;
        }
    }

    private Node head;//Only Field of SinglyLinked List
    public SinglyLinkedList(){//Parameterless Constructor
        this.head = null;
    }
    void display(){
        Node trav=head;
        System.out.println("List:\n");
        while(trav!=null){//to traverse till no next element
            System.out.print(trav.data+" ");
            trav=trav.next;
        }
        System.out.println();
    }
    
    void addFirst(int value){
    	//Creating and Initializing New Node
        Node newNode=new Node(value);

        newNode.next=head;//newNode.next Should point to previous 1St element which was pointed by Head
        head=newNode;//Now Head should point to newNode to make it 1st Element
    }
    void addLast(int value){
    	//Create and initialize newNode
        Node newNode=new Node(value);
        //Special case1:if list is empty Make new Node as first node
        if(head==null){head=newNode;}
        else
        {
            Node trav=head;
            while(trav.next!=null){
            trav=trav.next;
            }
            trav.next=newNode;//LastNode.next =newNode reference
        }
    }
   /* void addAtPos(int value,int pos){
        Node newNode=new Node(value);
        Node temp=null;
        Node trav=head;
        int i=1;
        while(i!=pos){
            temp=trav;
            trav=trav.next;
            i++;
        }
        newNode.next=trav;
        temp.next=newNode;
    }*/
    void addAtPos(int value,int pos) {
    	//Special case1:if List empty add at First
    	//Special case2:if pos<=1
        if (head==null || pos<=1) {addFirst(value);}
        //General Case:Add at given Position
        else {
            Node newNode = new Node(value);
            Node trav = head;
            for (int i = 1; i < pos - 1; i++) {
            	//Special case3:Pos>available nodes
                if(trav.next==null){System.out.println("Invalid position");break;}
                trav = trav.next;
            }
            newNode.next = trav.next;
            trav.next = newNode;
        }
    }
    void delFirst(){
    	//Special case1:if empty
        if (head==null)
            throw new RuntimeException("List is Empty");
        head=head.next;//point head to next node
        //Note 1st node Garbage Collected
    }
    void delLast(){
    	if(head==null) {throw new RuntimeException("List is Empty");}//list empty
    	if(head.next==null) {head=null;}//only one element
        Node temp=null,trav=head;
        while(trav.next!=null){
            temp=trav;//point to previous element which is to be deleted 
            trav=trav.next;//point to last element
        }
        temp.next=null;//Make previous node point to nothing
    }
    void delAll(){
        head=null;
        //all nodes are Garbage Collected
    }
    void delAtPos(int pos){
    	//Special Case1:if POS=1, delete First
        if(pos==1){
            delFirst();
        }
        //Special Case2:if List is empty or POS<1 then throw Exception
        else if(head==null||pos<1){
			throw new RuntimeException("List is Empty or Invalid Position Input");
			}
        else{
        	//New method other than pos-1 which we did in addAtPOs
        	//We will make temp run behind trav
         Node temp=null,trav=head;
        
         for(int i=1;i<pos;i++){//iteration till pos-1 so that temp is previous element and 
        	 //trav.next to next element which we still want
                if(trav.next==null){throw new RuntimeException("Invalid Position");}
                temp=trav;
                trav=trav.next;
            }
         //trav is node to be Deleted & temp is node before that
         temp.next=trav.next;
         //trav node is garbage collected
          }
	    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		SinglyLinkedList list=new SinglyLinkedList();
        int choice;
        do{
            System.out.println("0-EXIT");
            System.out.println("1-View List");
            System.out.println("2-Add First");
            System.out.println("3-Add Last");
            System.out.println("4-Add at Position");
            System.out.println("5-Delete First");
            System.out.println("6-Delete Last");
            System.out.println("7-Delete At Position");
            System.out.println("8-Delete All");
            System.out.print("Enter Choice:");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    list.display();
                    break;
                case 2:
                    System.out.print("Enter Element: ");
                    int val=sc.nextInt();
                    list.addFirst(val);
                    break;
                case 3:
                    System.out.print("Enter Element: ");
                    int val1=sc.nextInt();
                    list.addLast(val1);
                    break;
                case 4:
                    System.out.print("Enter Element: ");
                    int val2=sc.nextInt();
                    System.out.print("Enter Position where u want to add Element: ");
                    int pos=sc.nextInt();
                    list.addAtPos(val2,pos);
                    break;
                case 5:list.delFirst();
                    break;
                case 6:list.delLast();
                    break;
                case 7:
                    System.out.print("Enter which element to Delete: ");
                    int pos2 = sc.nextInt();
                    list.delAtPos(pos2);
                    break;
                case 8:list.delAll();
                    break;

            }
        }while(choice!=0);
    }
}
