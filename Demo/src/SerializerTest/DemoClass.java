package SerializerTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoClass implements Serializable {
	private int width;    
    private int height;    
    
    public void setWidth(int width){    
        this.width  = width;    
    }    
    public void setHeight(int height){    
        this.height = height;    
    }    
    public int getWidth(){    
        return this.width;    
    }    
    public int getHeight(){    
    	return this.height;    
    }    
    
    public static void main(String[] args){    
    	DemoClass myBox = new DemoClass();    
        myBox.setWidth(50);    
        myBox.setHeight(30);    
    
        try{    
            FileOutputStream fs = new FileOutputStream("demo.ser");    
            ObjectOutputStream os =  new ObjectOutputStream(fs);    
            os.writeObject(myBox);    
            os.close();    
            
            myBox.setWidth(100);    
            myBox.setHeight(60);
            fs = new FileOutputStream("demo.ser");   
            os =  new ObjectOutputStream(fs);    
            os.writeObject(myBox);    
            os.close();    
            
            FileInputStream fsread = new FileInputStream("demo.ser");    
            ObjectInputStream osread =  new ObjectInputStream(fsread);    
            DemoClass obj = (DemoClass) osread.readObject();    
            osread.close();
            System.out.println(obj.height);
            System.out.println(obj.width);
            
        }catch(Exception ex){    
            ex.printStackTrace();    
        }    
    }      
}
