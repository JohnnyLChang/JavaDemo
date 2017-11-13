package container;

public interface IContainer<T> {
	void Insert(T arg);
	boolean Search(T arg);
	void Delete(T arg);
}
