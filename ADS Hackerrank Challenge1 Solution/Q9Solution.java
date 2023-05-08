package HSolution;


    class LinkedList{
        Node head;
        
        class Node{
            int data ;
            Node next;
            
            Node(int d){
                data  =d;
                next=null;
            }
        }
        public void insert(int data){
            Node new_node=new Node(data);
            
            if(head==null){
                head=new_node;
            }else{
                Node current_node=head;
                
              while(current_node.next!=null){
                  current_node = current_node.next;
                  
              }
                current_node.next =new_node;
            }
        }
            public void display(){
                Node current_node=head;
                
                while(current_node !=null){
                    System.out.print(current_node.data + " -> ");
                    current_node = current_node.next;
                }
                System.out.print("null");
            }
        }
           
        public class Q9Solution {
            public static void main(String[]args){
                LinkedList list =new LinkedList();
                list.insert(1);
                list.insert(2);
                list.insert(3);
                list.insert(4);
                list.display();
                
            }
        }
    

