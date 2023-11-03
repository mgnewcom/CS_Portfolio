import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedLists<T> implements Iterable<T> {
	private Node header;
	private Node trailer;
	private int size;

	public DoublyLinkedLists() {
		// instansiate a header and a trailer
		// set the prev and value of a header to be null, and next pointer to be a
		// trailer
		header = new Node(null, null, null);
		// instanciate the trailer to have a null value, null next pointer, and the
		// header is the prev
		trailer = new Node(null, null, header);
		header.next = trailer;
		size = 0;

	}

	// return the size of the list, not including sentinel nodes
	public int size() {
		return this.size;

	}

	// return true of list is empty, return false otherwise
	public boolean isEmpty() {
		return this.size == 0;
		// alternatley: return header.next == ttrailer;

	}

	// add a new node with given value right after the sentinel header node
	public void addFirst(T value) {
		addBetween(value, header, header.next);

	}

	// helper method in between
	private void addBetween(T value, Node first, Node second) {
		// check everything passed is legitimate
		if (first == null || second == null) {
			throw new IllegalArgumentException("DLL: null values passed to add between");
		}
		if (first.next != second || second.prev != first) {
			throw new IllegalArgumentException("DLL addBetween: cannot place new node unless passed node");

		}
		// check a new node with value passed. It's prev is first and its next is second
		Node newNode = new Node(value, second, first);
		// update pointers of first and second refer to the new node
		first.next = newNode;
		second.prev = newNode;
		size++;

	}

	public T removeAtIndex(int n) {
		Node remove = this.header;
		Node previous = this.header;
		int count = 0;
		// find previous node
		// special case if the index is zero
		// traverse or go to previous node
		// draw picture
		if (n == 0) {
			return null;
		} else {
			while (count < n) {
				previous = previous.next;
				count++;
				System.out.println(previous.value);
			}

			System.out.println("break!");
			count = 0;
			while (count <= n) {
				remove = remove.next;
				count++;
				System.out.println(remove.value);
			}

			return removeBetween(previous, remove);

		}
	}

	private T removeBetween(Node node1, Node node2) {
		// check if either is null
		if (node1 == null || node2 == null) {
			throw new IllegalArgumentException("Must have valid parameters");
		}
		// Check for an empty list
		if (header.next == trailer) {
			throw new NoSuchElementException("Cannot delete from an empty list");
		}
		// check that given nodes are 1 apart
		if (node1.next.next != node2) {
			throw new IllegalArgumentException("The nodes must have a single node betwen them");
		}
		T valueToReturn = node1.next.value;

		node1.next = node2;
		node2.prev = node1;
		// valueToReturn = node2.prev.value;

		// shorten the list
		this.size--;
		// set value to null

		return valueToReturn;
	}

	// add a new node with given value right before the sentinel trailer node
	public void addLast(T value) {
		addBetween(value, trailer.prev, trailer);

	}

	// remove the first element (right after the sentinel node header)
	// return the value of that node
	// NoSuchElementException is thrown if the list is empty
	public T removeFirst() { 
		
		return removeBetween(header, header.next.next); 
		

	}

	// remove the last element (right before the sentinel node trailer)
	// return the value of that node
	// NoSuchElementException is thrown if the list is empty
	public T removeLast() {
		return removeBetween(trailer.prev.prev, trailer);

	}

	public String toString() {
		Node current = header.next;
		String result = "";
		System.out.println("toString works");
		while (current != trailer) {

			result += current.value.toString() + " ";
			current = current.next;
		}

		return result;
	}

	public int search(T Value) {
		Node current = this.header;

		int count = 0;
		if (current.equals(trailer)) {
			System.out.println("called empty");
			return -1;
		} else {
			while (current.next != trailer) {
				if (current.next.value.equals(Value)) {
					System.out.println("called in loop");
					return count;

				} else {
					current = current.next;
					count++;
				}
			}
			System.out.println("nothing called");
			return -1;
		}

	}

	// inner class for storing nodes
	public class Node {
		private T value;
		private Node next;
		private Node prev;

		public Node(T v, Node n, Node p) {
			this.value = v;
			this.next = n;
			this.prev = p;
		}
		/*
		 * @Override public String toString() { return value.toString();
		 * 
		 * }
		 */

	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new DLLIterator();
	}

	private class DLLIterator implements Iterator<T> {
		private Node current;
		private boolean canRemove; // flag, or semaphore, tells me if next() was just

		public DLLIterator() {
			current = header.next;

		}

		public boolean hasNext() {
			return current != trailer;

		}

		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			T value = current.value;
			current = current.next;
			canRemove = true;
			return value;
		}

		@Override
		// remove method should remove the node that was just returned
		// only remove if their just was a call to next()
		// we must remove the node prior to current

		// remove should remove the node that was just returned.
		// only remove if there just was a call to next()
		// we must remove the node prior to current
		public void remove() {
			if (!canRemove) {
				throw new IllegalStateException("DLLIterator: Invalid call to remove()");
			} else {
				current.prev.prev.next = current;
				current.prev = current.prev.prev;
				canRemove = false;
			}
		}

	}
}
