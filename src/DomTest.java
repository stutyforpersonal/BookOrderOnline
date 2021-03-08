package com.wj;

import java.lang.reflect.Field;

public class DomTest {
	public static void main(String[] args)  {
		Field[] fields=User.class.getFields();
		for(Field field:fields){
			String s=field.getName();
			System.out.println(s);
		}
	}
	//
	public string getTips(){
		return "";
	}
	
}

