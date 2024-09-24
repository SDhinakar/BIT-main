package edu.bit.dsa.list;
import java.util.Vector;
import java.util.RandomAccess;
import java.io.Serializable;
import java.lang.Cloneable;
public class V {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Samantha");
		v.add("Sairam");
		v.add(null);
		v.add(2,"143");
		v.addElement("Dracarys");
		
		System.out.println(v.capacity());
		System.out.println(v);
		
		System.out.println(v instanceof RandomAccess);
		System.out.println(v instanceof Serializable);
		System.out.println(v instanceof Cloneable);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.elementAt(0));
		
		System.out.println(v.get(1));
		
		v.remove(2);
		v.remove(String.valueOf("sairam"));
		v.removeElementAt(1);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
	}
}
