/* URL : https://leetcode.com/problems/design-linked-list/description/ */
class MyLinkedList {
    class Node {
        int val;
        Node next;
        public Node() {
            this.next = null;
        }
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        head = null;
        tail = head;
        size = 0;
    }
    
    public int get(int index) {
        if(index >= size) {
            return -1;
        }
        if(index == 0) {
            return head.val;
        }
        if(index == size-1) {
            return tail.val;
        }
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = head;
            size++;
        } else {
            node.next = head;
            head = node;
            size++;
        }
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(tail == null) {
            head = node;
            tail = head;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) {
            return;
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node node= new Node(val);
            if(index == 0) {
                addAtHead(val);
            } else {
                Node temp = head;
                for(int i = 0; i < index-1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size) {
            return;
        } else {
            if(index == 0) {
                head = head.next;
                size--;
            } else {
                Node temp = head;
                for(int i = 0; i < index-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                if(index == size-1) {
                    tail = temp;
                }
                size--;
            }
        }
    }
}
