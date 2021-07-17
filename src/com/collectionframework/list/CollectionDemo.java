	
package com.collectionframework.list;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> birdCollection=new ArrayList<>();
		birdCollection.add("pigeon");
		// add use to add the itme's in the list
		birdCollection.add("Owl");
		birdCollection.add("Cuckoo");
		birdCollection.add("Crow");
		birdCollection.add("Dove");
		System.out.println(birdCollection);
		
		birdCollection.remove(birdCollection.remove("Owl"));
		System.out.println(birdCollection);
		// contains element return boolean , it's check whether selected value is present or not 
		System.out.println(birdCollection.contains("Crow"));
		//for each method use to iterate collection , foreach is come in java 1.8	
		//foreach method use lambda expression , consumer is a lambda interface , use lambda expression to user comsumer interface
		birdCollection.forEach((element) ->{
			System.out.println(element);
			//birdCollection.clear();
			System.out.println(birdCollection);
		});
	}

}
