
public class usageofnode {
	public static void main(String[] args) {
		Node n = new Node("hello",null);
		System.out.println(n.getData()+","+n.getNext());
	}
	public static String getThird(Node list){
		return list.getNext().getNext().getData();
	}
	public static void insertSecond(Node list,String s){
		/*Node n1 = new Node(s,null);
		n1.setNext(list.getNext());
		list.setNext(n1);*/
		list.setNext(new Node(s,list.getNext()));//shortform
	}
	public static int size(Node list){
		int count=0;
		while(list !=null){//list itself is null....list.gettNext() causes null pointer exception
			count++;
			list=list.getNext();//the global variable is not list, it's only a local one. So, doesn't matter.
		}
		return count;//if count+1 is done, then we get a null pointer exception
	}
	//This is correct if list is not null
	/*public static void addLast(Node list,String s){
		while(list.getNext() !=null){
			list=list.getNext();
		}
		list.setNext(new Node(s,null));
	}*/
	//Another method
	public static void addLast(Node list,String s){
		Node prev = null;
		Node curr = list;
		while(curr!=null){
			prev=curr;
			prev=curr.getNext();
		}
		prev.setNext(new Node(s,null));
	}
	/* Return front of the node 
	 public static void addLast(Node list,String s){
	 	if(list == null){
	 	list = new Node(s,null);
	 	return list;
	 	}
	 	Node temp = list;
		while(temp.getNext() !=null){
			temp=temp.getNext();
		}
		temp.setNext(new Node(s,null));
		return list;
	}
	*/
	public static void removeLast(Node list){
		if(list == null)
			return;
		Node curr = list;
		Node prev = null;
		while(curr.getNext() !=null){
			prev = curr;
			curr=curr.getNext();
		}
		if(prev ==null){
		curr = null;
		return;
		}
		else
		prev.setNext(null);
	}
}