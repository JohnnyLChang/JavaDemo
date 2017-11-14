package container;

import java.io.Serializable;
import java.util.ArrayList;

class TNode implements Serializable{
	private static final long serialVersionUID = 1L;
	public TNode leftNode;
	public TNode rightNode;
	public TNode equalNode;
	private boolean leafNode;
	private int subTreeSize;
	private int value;
	TNodePool pool;
    
	public TNode(TNodePool pool) {
		this.pool = pool;
	}
	
	private TNode() {
		this.subTreeSize = 0;
		leafNode = false;
	}
	
	public TNode getRight() {
		if(this.rightNode == null)
			this.rightNode = pool.getNode();
		return this.rightNode;
	}
	
	public TNode getLeft() {
		if(this.leftNode == null)
			this.leftNode = pool.getNode();
		return this.leftNode;
	}
	
	public TNode getEqual() {
		if(this.equalNode == null)
			this.equalNode = pool.getNode();
		return this.equalNode;
	}
	
	public void IncreaseSubTree() {
		this.subTreeSize++;
	}
	
	public void DecreaseSubTree() {
		this.subTreeSize--;
	}
	
	public int getValue() {
		return this.value;
	}
	public int getSize() {
		return this.subTreeSize;
	}
	
	public void setValue(int v) {
		this.value = v;
	}
	
	public void setLeaf() {
		this.leafNode = true;
	}
	
	public boolean isLeaf() {
		return this.leafNode;
	}
}