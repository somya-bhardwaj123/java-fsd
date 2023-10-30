package collections;
import java.util.*;

public class Collections {


		public static void main(String[] args) {
			
	        System.out.println("ArrayList");
	        ArrayList<Integer> AL = new ArrayList<>();
	        AL.add(5);
	        AL.add(6);
	        AL.add(4);
	        AL.add(9);
	        AL.add(45);
	        AL.add(78);
	        System.out.println(AL);
	        System.out.println("\n");
	        System.out.println("LinkedList implement");
	        LinkedList<String> ll =new LinkedList<>();
	        ll.add("ramu");
	        ll.add("shamu");
	        ll.add("hello");
	        ll.add("bye");
	        Iterator<String> itr=ll.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		      }
	      
	        System.out.println("\n");
	        System.out.println("hashSET");
	        
		       HashSet<Integer> hashset=new HashSet<Integer>();  
		       hashset.add(10);  
		       hashset.add(120);  
		       hashset.add(120);
		        hashset.add(11);
		       System.out.println(hashset);
		       
		      
		       System.out.println("\n");
		       System.out.println("LinkedHashSet Implementation");
		       LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();  
		       lhs.add(1);  
		       lhs.add(3);  
		       lhs.add(2);
		      lhs.add(4);	       
		       System.out.println(lhs);
		       System.out.println("\n");
			      System.out.println("Vector implemetation");
			      Vector<Integer> v = new Vector();
			      v.addElement(18); 
			      v.addElement(20); 
			      v.addElement(80); 
			      v.addElement(50); 
			      System.out.println(v);


	        

		}

	}

