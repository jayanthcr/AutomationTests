package com.test;

import lombok.Data;

@Data
public class GettersandSetters {
	private int id;
	private int num;
	public static void main(String[] args)
	{
		GettersandSetters gs=new GettersandSetters();
		gs.id=10;
		gs.num=1019;
		System.out.println(gs.id);
		System.out.println(gs.num);
		
	}

}
