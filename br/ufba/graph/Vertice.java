package br.ufba.graph;

import br.ufba.datastructures.UnionFind.UnionElement;

public class Vertice implements UnionElement{
	public int x;

	public int y;

	public int set;

	public int first;

	public int next;

	public int width;

	public int height;
	
	public String nome;
	
	private Vertice root;
	
	private Vertice parent;
	

	@Override
	public UnionElement getRoot() {
		return root;
	}

	@Override
	public UnionElement getParent() {
		return parent;
	}

	@Override
	public void setRoot(UnionElement x) {
		this.root = (Vertice)x;		
	}

	@Override
	public void setParent(UnionElement x) {
		this.parent = (Vertice)x;		
	}
	
	@Override
	public boolean equals(Object obj) {
		return nome.equals(((Vertice)obj).nome );
	}

}
