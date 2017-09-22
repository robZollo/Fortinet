package fortinet;

public class Node {
	Node next;
	int value;
	
	Node(int val)
	{
		this.value= val;
	}

	public static Node reverse(Node head)
	{
		Node currentNode = head;
		Node previousNode = null, nextNode = null;
		while (currentNode != null)
		{
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}

}