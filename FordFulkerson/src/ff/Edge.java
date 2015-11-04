package ff;

public class Edge {
	Node from;
	Node to;
	int capacity = 0;
	int flow = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Edge(Node fr, Node t) {
		this.from = fr;
		this.to = t;
	}
	
	public void addCapacity(int cap) {
		this.capacity = cap;
	}
	
	public void addFlow(int fl) {
		this.flow += fl;
	}
	
	
	
}
