package com.ford.forpass;

import java.util.ArrayList;

import com.ford.fordpass.stackinterface;

public class stackarraylist<T> implements stackinterface<T>
{ int count=0;
   ArrayList<T>	stacklist = new ArrayList<>();
   

@Override
public void push(T datapush) {
	stacklist.add(datapush);
	count++;
}

@Override
public T pop() {
	if(count>0)
	return stacklist.;
}

@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}
} 

