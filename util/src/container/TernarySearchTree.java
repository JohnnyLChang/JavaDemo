package container;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class TernarySearchTree implements IContainer<String> {
	TNodePool tst;
	TNode root;
	String filename = "tst.blob";
	
	public TernarySearchTree(){
		tst = new TNodePool();
		root = tst.getRoot();
	}
	
	public int getPoolSize() {
		return tst.getSize();
	}
	
	public int getRootValue() {
		return root.getValue();
	}
	
	public void load() {
	    ObjectInputStream objectinputstream;
		try {
			FileInputStream streamIn = new FileInputStream(filename);
			objectinputstream = new ObjectInputStream(streamIn);
			TNodePool tmp = (TNodePool) objectinputstream.readObject();
			tst = tmp;
			root = tst.getRoot();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void save() {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(tst);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

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
	
	public ArrayList<String> Sort() {
		ArrayList<String> ret = new ArrayList<String>();
		this.Sort(this.root, "", ret);
		return ret;
	}
	
	private void Sort(TNode it, String prefix, ArrayList<String> ret) {
		if(it == null)
			return;
		if(it.isLeaf())
			ret.add(prefix);
		this.Sort(it.leftNode, prefix, ret);
		this.Sort(it.equalNode, prefix + (char)it.getValue(), ret);
		this.Sort(it.rightNode, prefix, ret);
	}
	
	public void dump() {
		System.out.println("dump tst");
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
	
	public ArrayList<String> PrefixSearch(String str) {
		TNode it = this.root;
		ArrayList<String> ret = new ArrayList<String>();
		if(it == null) return ret;
		
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
		if(it == null) return ret;
		dumpSuffix(it, str, ret);
		return ret;
	}
	
	void dumpSuffix(TNode it, String prefix, ArrayList<String> result) {
		if(it == null) return;
		if(it.isLeaf())
			result.add(prefix);
		this.dumpSuffix(it.leftNode, prefix, result);
		this.dumpSuffix(it.equalNode, prefix + (char)it.getValue(), result);
		this.dumpSuffix(it.rightNode, prefix, result);
	}
	
	public void Delete(String str) {
		
	}
	
	public int Size() {
		return root.getSize();
	}
	
	
}
