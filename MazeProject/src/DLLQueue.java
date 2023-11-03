
public class DLLQueue<T> implements Queue<T> {
	private int size;
	private DoublyLinkedLists<T> list; 
	
	public DLLQueue() {
		this.list = new DoublyLinkedLists<T>(); 
		this.size = 0;
	}

	@Override
	public void enqueue(T n) {
		// TODO Auto-generated method stub 
		list.addLast(n);
		size++;
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub 
		size--;
		return list.removeFirst(); 
		
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub  
		//return list.returnHead();  
	return null;
		
		

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	public String toString() { 
		
		return list.toString();

	}

	
	

}
