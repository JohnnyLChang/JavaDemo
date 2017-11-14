package container;

import java.io.Serializable;
import java.util.ArrayList;

class TNodePool implements Serializable{
	private final int InitCapacity = 64;
	private ArrayList<TNode> nodes = new ArrayList<TNode>(InitCapacity);
	private int Watermark = 1;
	private int currentSize = 1;
	
	public TNodePool() {
		nodes.add(new TNode(this));
	}
	
	public TNode getNode() {
		if(Watermark >= currentSize*0.8) {
			nodes.ensureCapacity(Watermark+InitCapacity);
			for(int i=0;i<Watermark+InitCapacity;++i)
				nodes.add(new TNode(this));
			currentSize += InitCapacity;
		}
		return nodes.get(Watermark++);
	}
	
	public int getSize() {
		return this.Watermark;
	}
	
	public TNode getRoot() {
		if(this.Watermark > 0)
			return nodes.get(0);
		return null;
	}
}