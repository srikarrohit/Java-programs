
public class ArrayStack implements Stack{
	
	public static final int CAPACITY=1024;
	private Object S[];
	private int N;
	private int t=-1;
	
	public ArrayStack(){
		N = this.CAPACITY;
		S=new Object[N];
	}
	
	public ArrayStack(int capacity){
		N=capacity;
		S=new Object[N];
	}
	public int size() {
		return (t+1);
	}

	public boolean isEmpty() {
		return (t<0);
	}

	public Object top() throws StackEmptyException{	
		if(isEmpty())
			throw new StackEmptyException("Stack is empty");
		return S[t];
	}

	public void push(Object obj) throws StackFullException {
		if(size() == N)
			throw new StackFullException("Stack Overflow");
		S[++t]=obj;
	}

	public Object pop() throws StackEmptyException {
		Object elem;
		if(isEmpty())
			throw new StackEmptyException("Stack is empty");
		elem = S[t];
		S[t--]=null;
		return elem;
	}

}
