package DAY1;
	import java.util.LinkedList;

	public class position {
	    public static void main(String[] args) {
	        LinkedList<Integer> list = new LinkedList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        list.add(60);
	        list.addFirst(777);
	        list.add(3, 333);
	        System.out.println( list);
	    }
	}


