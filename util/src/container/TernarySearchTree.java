package container;

import java.io.Serializable;

public class TernarySearchTree implements IContainer<String> {
	TNode root;
	
	TernarySearchTree(){
		root = new TNode(0);
	}
	
	public void load(String filename) {
		
	}
	
	//insert new string
	public void Insert(String str){
		TNode it = this.root;
		
		for(char c : str.toCharArray()) {
			int v = (int)(c);
			//if current node is empty, set it
			while(it.getValue() != 0) {
				if(v == it.getValue()) {
					break;
				}
				else if(v > it.getValue())
					it = it.getRight();
				else
					it = it.getLeft();
			}	
			it.setValue(v);
			it.IncreaseSubTree();
			it = it.getEqual();
		}
		it.setLeaf();
	}
	
	public void Sort() {
		this.Sort(this.root, "");
	}
	
	private void Sort(TNode it, String prefix) {
		if(it == null)
			return;
		if(it.isLeaf())
			System.out.println(prefix);
		this.Sort(it.leftNode, prefix);
		this.Sort(it.equalNode, prefix + (char)it.value);
		this.Sort(it.rightNode, prefix);
	}
	
	public void dump() {
		this.dump(root);
	}
	
	private void dump(TNode it) {
		if(it == null)
			return;
		this.dump(it.leftNode);
		System.out.format("%d-%b\n", it.getValue(), it.isLeaf());
		this.dump(it.equalNode);
		this.dump(it.rightNode);
	}
	
	public boolean Search(String str){
		TNode it = this.root;
		if(it == null) return false;
		
		for(char c : str.toCharArray()) {
			int v = (int)(c);
			while(it != null) {
				if(it.getValue() == v) {
					it = it.getEqual();
					break;
				}
				else if(v > it.getValue())
					it = it.rightNode;
				else
					it = it.leftNode;
			}
		}
		if(it == null) return false;
		return it.isLeaf();
	}
	
	public void PrefixSearch(String str) {
		TNode it = this.root;
		if(it == null) return;
		
		for(char c : str.toCharArray()) {
			int v = (int)(c);
			while(it != null) {
				if(it.getValue() == v) {
					it = it.getEqual();
					break;
				}
				else if(v > it.getValue())
					it = it.rightNode;
				else
					it = it.leftNode;
			}
		}
		if(it == null) return;
		dumpSuffix(it, str);
	}
	
	public void dumpSuffix(TNode it, String prefix) {
		if(it == null) return;
		if(it.isLeaf())
			System.out.println("leaf:"+prefix);
		this.dumpSuffix(it.leftNode, prefix);
		this.dumpSuffix(it.equalNode, prefix + (char)it.value);
		this.dumpSuffix(it.rightNode, prefix);
	}
	
	public void Delete(String str) {
		
	}
	
	class TNode implements Serializable{
		private static final long serialVersionUID = 1L;
		public TNode leftNode;
		public TNode rightNode;
		public TNode equalNode;
		private boolean leafNode;
		private int subTreeSize;
		private int value;
		
		public TNode(int v) {
			this.value = v;
			this.subTreeSize = 0;
			leafNode = false;
		}
		
		public TNode getRight() {
			if(this.rightNode == null)
				this.rightNode = new TNode(0);
			return this.rightNode;
		}
		
		public TNode getLeft() {
			if(this.leftNode == null)
				this.leftNode = new TNode(0);
			return this.leftNode;
		}
		
		public TNode getEqual() {
			if(this.equalNode == null)
				this.equalNode = new TNode(0);
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
}
