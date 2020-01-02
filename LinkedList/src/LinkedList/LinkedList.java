package LinkedList;

public class LinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
			
		}
	}
		public static LinkedList insert(LinkedList list,int data){
			Node new_node=new Node(data);
			new_node.next=null;
			if(list.head==null){
				list.head=new_node;
			}
			else
			{
				Node last=list.head;
				while(last.next!=null){
					last=last.next;
				}
				last.next=new_node;
				
				}
			
			
			return list;
		}
		public static void printList(LinkedList list){
			Node curr=list.head;
			System.out.println("LinkedList");
			while(curr.next!=null){
				System.out.println(curr.data+" ");
				curr=curr.next;
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list= insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		printList(list);

	}

}
