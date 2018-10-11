package com.ford.fordpass;

import java.util.ArrayList;

public class stacks<T> implements stackinterface<T> {

    ArrayList<T> data= new ArrayList<>();
	int count=0;
	static final int max=5;
	
	
	@Override
	public void push(T datapush) {
		if(count!=max-1)
		{
		   data.add()= datapush;
		}
		else
		{
			System.out.println("full");
		}
			
		
		
	}

	@Override
	public T pop() {
		
		return data[--count];
	}

	@Override
	public boolean isEmpty() {
		
		return count==0? true: false;
	}

	
}
