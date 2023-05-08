package HSolution;

public class Q12Solution {
    private Node head;

    Solution()
    {
        this.head=null;
     }

    static class Node {
        private int data;
        private Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void display() {

        Node trave = head;

        if (head == null) {
            throw new RuntimeException("List is Empty");
        } else {
            while (trave != null) {
                System.out.print(trave.data + " ");
                trave = trave.next;
            }

        }

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node trave = head;

        if (head == null) {
            head = newNode;
        } else {
            while (trave.next != null) {
                trave = trave.next;
            }
            trave.next = newNode;
            newNode.next = null;

        }

    }

    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        Node trave = head;

        if (head == null || position <= 1) {
            newNode.next = head;
            head = newNode;

        } else {
            for (int i = 0; i < position - 1; i++) // 16 13 7
            {
                if (trave == null)
                    break;
                trave = trave.next;
            }
            newNode.next = trave.next;
            trave.next = newNode;

        }

    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Q12Solution solution = new Q12Solution();
        solution.addLast(16);
        solution.addLast(13);
        solution.addLast(7);
        solution.insertAtPosition(2, 1);
        solution.display();
    }

}
