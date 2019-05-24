package implementation;

import java.util.ArrayList;

import graph.Edge;
import graph.Graph;
import graph.Vertex;

public class MyGraph implements Graph{

	ArrayList<Edge> edges = new ArrayList<Edge>();
	ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	
	@Override
	public void addEdge(Edge arg0) {
		this.edges.add(arg0);
	}

	@Override
	public void addVertex(Vertex arg0) {
		this.vertices.add(arg0);
		
	}

	@Override
	public void checkEdge(Vertex arg0, Vertex arg1) {
		Edge edges[] = getAllEdges();
		Vertex vertices[];
		for(int i = 0; i<edges.length; i++) {
			vertices = edges[i].getVertices();
			if (vertices[0] == arg0 && vertices[1] == arg1 || vertices[0] == arg1 && vertices[1] == arg0) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
		
	}

	@Override
	public Edge[] getAllEdges() {
		return (Edge[]) this.edges.toArray();
	}

	@Override
	public Vertex[] getAllVertices() {
		return (Vertex[]) this.vertices.toArray();
	}

	@Override
	public Vertex[] getNeighbours(Vertex arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEdge(Vertex arg0, Vertex arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVertex(Vertex arg0) {
		// TODO Auto-generated method stub
		
	}

}
