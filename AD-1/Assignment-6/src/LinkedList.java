package A6;
import java.util.Scanner;

class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start= null;
		for (int i = 10; i <= 50; i=i+10) {
			Node newNode = new Node(i);
			if (start == null) {
				start= newNode;
            } 
			else {
				Node q = start;
                while (q.next != null) {
                    q = q.next;
                }
                q.next = newNode;
            }
        }

		System.out.println("Linked list: ");
        Node q = start;
        while (q != null) {
            System.out.print(q.data + " ");
            q = q.next;
        }

		
		System.out.println("\nMENU");
		System.out.println("1. Insert at start\n"
				+ "2. Insert at end\n"
				+ "3. Insert at any position\n"
				+ "4. Delete at start\n"
				+ "5. Delete at end\n"
				+ "6. Delete at any position\n"
				+ "7. Display\n"
				+ "8. Reverse");
		System.out.print("Enter choice: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
			case 1:
				insbeg(start);
				break;
			case 2:
				insend(start);
				break;
			case 3:
				insany(start);
				break;
			case 4:
				delbeg(start);
				break;
			case 5:
				delend(start);
				break;
			case 6:
				delany(start);
				break;
			case 7:
				display(start);
				break;
			case 8:
				reverse(start);
				break;
			default:
				System.out.println("Wrong input: ");
				break;
		}
	}
	public static void insbeg(Node start) {
		System.out.print("Enter info: ");
		Scanner sc=new Scanner(System.in);
		int info=sc.nextInt();
		Node q = new Node(info);
		q.next=start;
		start=q;
		display(start);
	}
	public static void insend(Node start) {
		System.out.print("Enter info: ");
		Scanner sc=new Scanner(System.in);
		int info=sc.nextInt();
		Node p = new Node(info);
		Node q=start;
		while(q.next!=null) {
			q=q.next;
		}
		q.next=p;
		p.next=null;

		display(start);
	}
	public static void insany(Node start) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter position: ");
		int ind=sc.nextInt();		
		
		if(ind==1) {
			insbeg(start);
			System.exit(0);
		}
		System.out.print("Enter info: ");
		int info=sc.nextInt();
		Node p = new Node(info);
		Node q=start;
		for(int i=0;i<ind-2;i++){
			q=q.next;
		}
		p.next=q.next;
		q.next=p;
		
		display(start);
	}
	public static void delbeg(Node start) {
		start=start.next;
		display(start);
	}
	public static void delend(Node start) {
		Node q=start;
		while(q.next.next!=null) {
			q=q.next;
		}
		q.next=null;
		display(start);
	}
	public static void delany(Node start) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter position: ");
		int ind=sc.nextInt();
		if(ind==1) {
			delbeg(start);
		}
		Node q=start;
		for(int i=0;i<ind-2;i++){
			q=q.next;
		}
		Node p=q.next;
		q.next=p.next;
		display(start);
	}
	public static void display(Node start) {
		System.out.println("Linked list: ");
        Node q = start;
        while (q != null) {
            System.out.print(q.data + " ");
            q = q.next;
        }
	}
	public static void reverse(Node start) {
		Node q=start;
		Node p=null;
		Node temp;
		while(q!=null) {
			temp=q.next;
			q.next=p;
			p=q;
			q=temp;
		}
		
		display(p);
	
	}
}
