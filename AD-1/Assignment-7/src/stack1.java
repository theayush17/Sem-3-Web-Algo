package A6;
import java.util.*;
public class stack1 {
 int array[];
 int front;
 int capacity;

public stack1(int capacity) {
	this.capacity=capacity;
	array=new int[capacity];
	front=-1;
}

public  void push(int value) {
	if(front==capacity-1) {
		System.out.println("stack Overflow");
	return;
	
}

array[++front]=value;
System.out.println("Pushed "+value+" info the stack");
}


public  int pop() {
	if(isEmpty()) {
		System.out.println("Stack Underflow");
		return-1;
	}
	return array[front--];
}

public  void display(){
	if(isEmpty()) {
		System.out.println("Stack is empty");
		return;
	}
	System.out.println("stack:");
	for(int i=0;i<=front;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println();
}


	public  boolean isEmpty() {
	// TODO Auto-generated method stub
	return front==-1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

stack1 stack=new stack1(5);
String c;
System.out.println("Menu");
System.out.println("1.push to stack \n"+"2.pop to stack\n"+"3.display \n"+"4.exit");
System.out.println("Enter your choice");
int n=sc.nextInt();
switch(n) {
case 1:
	System.out.println("Enter the element for push");
	int value=sc.nextInt();
	stack.push(value);
	break;
	
case 2:
	stack.pop();
	break;
	
case 3:
	stack.display();
	break;
	
case 4:
	 System.out.println("Exiting program.");
	 return;
	 
	 default:
		   System.out.println("Invalid choice. Please try again.");
}
System.out.println("Enter your choice:(y/n)");
c=sc.next();
while(c.equals("y")) {
	System.out.println("Menu");
	System.out.println("1.push to stack \n"+"2.pop to stack\n"+"3.display \n"+"4.exit");
	System.out.println("Enter your choice");
	int n1=sc.nextInt();
	switch(n1) {
	case 1:
		System.out.println("Enter the element for push");
		int value=sc.nextInt();
		stack.push(value);
		break;
		
	case 2:
		stack.pop();
		break;
		
	case 3:
		stack.display();
		break;
		
	case 4:
		 System.out.println("Exiting program.");
		 return;
		 
		 default:
			   System.out.println("Invalid choice. Please try again.");
	}
	System.out.println("Enter your choice:(y/n)");
	c=sc.next();
}

	}

}
