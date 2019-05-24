package implementation;

import graph.*;

public class TestMyGraph {
	public static void main(String[] args) {
		MyGraph graph = new MyGraph();
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		
		graph.addVertex(v1);
		graph.addVertex(v2);
		graph.addVertex(v3);
		
		Edge e1 = new UndirectedEdge(v1, v2);
		Edge e2 = new UndirectedEdge(v3, v2);
		
		graph.addEdge(e1);
		graph.addEdge(e2);
		
		Vertex vertices[] = graph.getAllVertices();
		System.out.println("Vertices : ");
		for(int i = 0; i<vertices.length; i++) {
			System.out.println("Vertex"+" "+(i+1)+" = "+ vertices[i].getContent());
		}
		
		System.out.println("arc entre v3 et v2");
		graph.checkEdge(v3, v1);
		System.out.println("arc entre v1 et v2");
		graph.checkEdge(v1, v2);

	}
}
