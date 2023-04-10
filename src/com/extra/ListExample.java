package com.extra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		
		list.add("Bellcy");
		list.add(2000);
		list.add("Bellcy");
		list.add(22);
		list.add("kisho");
		System.out.println(list);
		
//		Set list=new HashSet();
//		list.add("Akash");
//		list.add(22);
//		list.add("Akash");
//		list.add(28);
//		System.out.println(list);
		
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		Map map=new HashMap();
		map.put(1, "bell");
		map.put(0, "swe");
		map.put(null, "bellz");
		map.put(2, "sumi");
		map.put(2, "ammu");
		map.put(3, "mons");
		
		System.out.println(map);
		
		Collection c=map.values();
		Iterator i1=c.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
