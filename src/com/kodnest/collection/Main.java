package com.kodnest.collection;
import java.util.ArrayList;
import java.util.Scanner;
class MyStack{
	ArrayList<Integer> al = new ArrayList<Integer>();
	void push(int el)
	{
		al.add(el);
		System.out.println(el+"push success");
	}
	void pop()
	{  if(al.size()==0)
	{
		System.out.println("stack is empty");
	}
	else
	{
		int rem=al.remove(al.size()-1);
		System.out.println(rem +"is removed");
		
			
			
	}
	}
	void peek()
	{
		if(al.size()==0)
		{
			System.out.println("stack is empty");
		}
		else {
		System.out.println(al.get(al.size()-1)+"peek");
	}
	}
	void display()
	{ if(al.size()==0)
	{
		System.out.println("stack is empty");
	}
	else {
		System.out.println(al);
	}
	}
}
public class Main {
	public static void main(String[] args) {
		MyStack s=new MyStack();
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("enter 1 for push");
			System.out.println("enter 2 for pop");
			System.out.println("enter 3  for peek");
			System.out.println("enter 4  for displaying the element");
			System.out.println("enter 5  for exit");
		
		int b=sc.nextInt();
		switch(b)
	 {case 1:
		   System.out.println("enter the elementt to be pushed");
		   int el=sc.nextInt();
			  s.push(el);
			  break;
		case 2:
			s.pop();
			break;
		case 3:
			s.peek();
			break;
		case 4:
			s.display();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("enter the valid no");
			  
		
		}
		}
		
//		s.push(a);
//		s.peek();
//		s.pop();
		
		
		
	}

}
