

public class LinkedList {
    //object
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //as property
    public static Node head;
    public static Node tail;
    public static int size;
    //add First
    
    public void addFirst(int data){
        size++;
        //create newNode
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //linking
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //for printing
    public void print(){
        if(head==null)
        return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //adding in the midlle
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //from removing from first
    public int removeFirst(){
        int val=head.data;
        head=head.next;
        return val;
    }
    //for searching
    
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head==null)
        return -1;

        if(head.data==key)
        return 0;
        
        int idx=helper(head.next, key);
        if(idx==-1)
            return-1;

         return idx+1;   
    }
    //recursive search...
    public int recSearch(int key){
        return helper(head,key);

    }

    //reverse a LinkedList
    public void reverse(){
        Node currNode=tail=head;
        Node prevNode=null;
        Node nextNode;
        while(currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;

        }
        head=prevNode;

    }
    //find and remove the nth node from the end
    public void deleteFromEnd(int n){
        int sz=0;
        Node temp=head;
        //for calculating size
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;

    }
    //check if ll is palindrome or not

    //to find the middleNode----->by slow and fast approach
    public Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null)
        return false;

        //step--findmid;
        Node mid=middle(head);
        //reverse the second half

        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;
        while(right!=null){
            if(right.data!=left.data)
            return false;

            left=left.next;
            right=right.next;
        }
        return true;
       
    }

    //to detect linkedList cycle
    public boolean  llcycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next==null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    // remove linked list cycle
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false)
        return;
        //finding the meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle--->last.next=null
        prev.next=null;
    }
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//midNode
    }

    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next; 
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    //performing merge sort
    public Node mergeSort(Node head){
        //base coondition
        if(head==null && head.next==null)
        return head;
        //find mid
        Node mid=getMid(head);
        //left half and right half ms
        Node rightHead=mid.next;
        mid.next=null;
        
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //merge 
        return merge(newLeft,newRight);


    }
    public static void main(String[]args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addLast(0);
        ll.print();
        ll.addLast(-4);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();
       
       System.out.println("pal--"+ll.checkPalindrome());
       //ll.add(2,7);
       ll.print();
       //ll.removeFirst();
       ll.print();
       System.out.println(ll.itrSearch(7));
       System.out.println(ll.itrSearch(0));
       System.out.println(ll.recSearch(4));
       //ll.reverse();
       ll.print();
       System.out.println(ll.size);
       //ll.deleteFromEnd(1);
       ll.print();
       ll.llcycle(head);
       ll.print();
       System.out.println(ll.llcycle(head));
     


    }
}
