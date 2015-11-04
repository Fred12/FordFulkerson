package ff;

import java.util.List;

public class Node {
	String name;
	List <Edge> edgeList;
	public static void main(String[] args) {
		

	}
	public Node (String name) {
		this.name = name;
	}
	
	public void addEdge(Edge e) {
		edgeList.add(e);		
	}
	
	
}
