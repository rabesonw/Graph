package implementation;

import java.util.ArrayList;

import graph.Edge;
import graph.Graph;
import graph.Vertex;

public class MyGraph implements Graph{

	ArrayList<Edge> edges;
	ArrayList<Vertex> vertices;
	
	public MyGraph() {
		this.edges = new ArrayList<Edge>();
		this.vertices = new ArrayList<Vertex>();
	}
	
	public MyGraph(ArrayList<Edge> e, ArrayList<Vertex> v) {
		this.edges = e;
		this.vertices = v;
	}
	
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
			if (vertices[0] == arg0 && vertices[1] == arg1) {
				System.out.println("true");
				return;
			} 
		}
		System.out.println("false");
		return;
	}

	@Override
	public Edge[] getAllEdges() {
		Edge[] e = new Edge[this.edges.size()];
		e = this.edges.toArray(e);
		return e;
	}

	@Override
	public Vertex[] getAllVertices() {
		Vertex[] v = new Vertex[this.vertices.size()];
		v = this.vertices.toArray(v);
		return v;
	}

	@Override
	public Vertex[] getNeighbours(Vertex arg0) {
		return (Vertex[]) getNeighbors(arg0).toArray();
	}
	
	public ArrayList<Vertex> getNeighbors(Vertex arg0) {
		Edge edges[] = getAllEdges();
		ArrayList<Vertex> neighbors = new ArrayList<Vertex>();
		Vertex vertices[];
		for(int i = 0; i<edges.length; i++) {
			vertices = edges[i].getVertices();
			if (vertices[0] == arg0) {
				neighbors.add(vertices[1]);
			}
		}
		return neighbors;
	}

	@Override
	public void removeEdge(Vertex arg0, Vertex arg1) {
		for(int i = 0; i<this.edges.size(); i++) {
			if (edges.get(i).getVertices()[0] == arg0 && edges.get(i).getVertices()[1] == arg1) {
				this.edges.remove(i);
			}
		}
		
	}

	@Override
	public void removeVertex(Vertex arg0) {
		for(int i = 0; i<this.edges.size(); i++) {
			if (edges.get(i).getVertices()[0] == arg0 || edges.get(i).getVertices()[1] == arg0) {
				this.edges.remove(i);
			}
		}
		this.vertices.remove(arg0);
	}

}