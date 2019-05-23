package graph;

import java.util.*;

public interface Graph {
	
	/**
	 * @param Vertex
	 * */
	public void addVertex(Vertex v);
	
	/**
	 * @param Vertex, Edge
	 * */
	public Vertex removeVertex(Vertex v, ArrayList<Edge> e);
	
	/**
	 * @param Edge, Vertex, Vertex
	 * */
	public void addEdge(Edge e, Vertex v1, Vertex v2);
	
	/**
	 * @param Edge
	 * */
	public Edge removeEdge(Edge e);
}
