package fortinet;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReverseTest {
	@Test
	public void testReverse() 
	{
		
		Node u = new Node(5);
		Node v = new Node(6);
		Node w = new Node(7);
		Node x = new Node(8);
		Node y = new Node(9);
		Node z = new Node(10);
		u.next = v;
		v.next = w;
		w.next = x;
		x.next = y;
		y.next = z;
		
		Node n = Node.reverse(u);
		
		int[] checkArray = {10, 9, 8, 7, 6, 5};
		boolean passedSoFar = true;
		
		for (int i=0; i < checkArray.length; i++)
		{
			if (n == null)
			{
				passedSoFar = false;
				break;
			}
			else if (n.value != checkArray[i])
			{
				passedSoFar = false;
				break;
			}
			n = n.next;
		}
		if (n != null) //make sure the last node doesn't link anywhere.
			passedSoFar = false;
		assertTrue(passedSoFar);
	}

}
