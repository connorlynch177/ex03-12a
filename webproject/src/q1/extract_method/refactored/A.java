package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      ex(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      ex(edgeList, p);
      return null;
   }

   class Graph {
		String name;
		boolean contains(String p) {
			return name.contains(p);
		}
	}
   
   class Node extends Graph{
	   String name;

	   public boolean contains(String p) {
	      return name.contains(p);
	   }
	}

	class Edge extends Graph{
	   String name;

	   public boolean contains(String p) {
	       return name.contains(p);
	   }
	}

	<T extends Graph> void ex(List<T> input, String p) {
		for (T item : input) 
		{
			if (item.contains(p))
				System.out.println(item);
		}
	}



}