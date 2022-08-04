package com.demo;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Typeslist {
public static void main(String[] args) {
	List <Object> a = new ArrayList <Object>();
	List <Object> t = new ArrayList <Object>();
	List <Object> d = new Vector <Object>();
	
	a.add("Hello");
	a.add("Everyone");
	System.out.println("Add  "  +a);
	
	t.add("XXX");
	t.add(13);
	System.out.println("Add  "  +t);
	
	d.add("yyy");
	d.add(45);
	System.out.println("Add  "  +d);
	
	a.addAll(t);
	System.out.println("Addall  "  +a);
	
	a.addAll(d);
	System.out.println("Addall  "  +a);
	
	int b = a.size();
	System.out.println("Size  " +b);
	
	Object c = a.get(5);
	System.out.println("Get  "   +c);
	
	int i = a.indexOf("Everyone");
	System.out.println("indexOf  "   +i);
	
	boolean y = a.contains("XXX");
	System.out.println("contains  " +y);
	
	a.set(2, "zzz");
	System.out.println("set  "  +a);
	
	a.remove(4);
	System.out.println("Remove  "  +a);
	
	a.retainAll(t);
	System.out.println("RetainAll  "  +a);
	
	a.removeAll(a);
	System.out.println("RemoveAll  " +a);
	
	a.clear();
	System.out.println("Clear  "   +a);
	}
}
