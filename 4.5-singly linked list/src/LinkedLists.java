
public class LinkedLists {

		Node head;

		static class Node {
			int data;
			Node next;

			Node(int data) {
				this.data = data;
			}
		}
		
		public static LinkedLists deleteByKey(LinkedLists list, int key) {	
			
			Node curr_node =  list.head;
			Node prev_node = null;
			
			if(curr_node !=null && curr_node.data == key) {
				System.out.println("Found element and deleted :"+key);
				list.head = curr_node.next;
				return list;
			}
			
			while(curr_node !=null && curr_node.data != key) {
				prev_node = curr_node;
				curr_node = curr_node.next;
			}
			
			if(curr_node != null) {
				prev_node.next =curr_node.next;
				System.out.println("Found element and deleted: "+key);
			}
			
			if(curr_node == null) {
				System.out.println("Element not found with key :"+key);
			}
			
			return list;
		}
		
		

		public static LinkedLists insert(LinkedLists list, int data) {
			Node new_node = new Node(data);

			if (list.head == null) {
				list.head = new_node;
			} else {
				Node last = list.head;
				while (last.next != null) {
					last = last.next;
				}

				last.next = new_node;
			}

			return list;
		}

		public static void printList(LinkedLists list) {
			Node temp = list.head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println("");
		}

		public static void main(String[] args) {
			LinkedLists list = new LinkedLists();
			list = LinkedLists.insert(list, 1);
			list = LinkedLists.insert(list, 2);
			list = LinkedLists.insert(list, 3);

			LinkedLists.printList(list);
			
			list = LinkedLists.deleteByKey(list, 2);
			list = LinkedLists.deleteByKey(list, 1);
			
			LinkedLists.printList(list);
		}

	}

