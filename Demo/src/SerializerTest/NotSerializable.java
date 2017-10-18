package SerializerTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NotSerializable {
	public static void main(String[] args)
	{
		MyClass m  = new MyClass(123);
        System.out.println(m.toString());
        ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("notserial.txt"));
	        oos.writeObject(m);
	        oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class MyClass extends MyClass2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1111L;

	public MyClass(int quantity) {
		setNonSerializableProperty(new NonSerializableClass(quantity));
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		// note, here we don't need out.defaultWriteObject(); because
		// MyClass has no other state to serialize
		out.writeInt(super.getNonSerializableProperty().getQuantity());
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException {
		// note, here we don't need in.defaultReadObject();
		// because MyClass has no other state to deserialize
		super.setNonSerializableProperty(new NonSerializableClass(in.readInt()));
	}
}

/* this class must have no-arg constructor accessible to MyClass */
class MyClass2 {

	/*
	 * this property must be gettable/settable by MyClass. It cannot be final,
	 * therefore.
	 */
	private NonSerializableClass nonSerializableProperty;

	public void setNonSerializableProperty(NonSerializableClass nonSerializableProperty) {
		this.nonSerializableProperty = nonSerializableProperty;
	}

	public NonSerializableClass getNonSerializableProperty() {
		return nonSerializableProperty;
	}
}

class NonSerializableClass {

	private final int quantity;

	public NonSerializableClass(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}
}
