
public interface Queue<T> {

	public void enqueue(T n);
		
	public T dequeue(); 
	public T first(); 
	public int size(); 
	public boolean isEmpty();
}
