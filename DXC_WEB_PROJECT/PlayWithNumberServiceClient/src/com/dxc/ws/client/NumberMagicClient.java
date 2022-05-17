package com.dxc.ws.client;

import com.dxc.ws.NumberMagic;
import com.dxc.ws.NumberMagicService;

public class NumberMagicClient {

	public static void main(String[] args) {
		int num1=12;
		int num2=23;
		NumberMagicService magicService=new NumberMagicService();
		NumberMagic magic=magicService.getNumberMagicPort();
		System.out.print("\n"+num1+" + "+num2+" = "+magic.numberSum(num1, num2));
		System.out.print("\n"+magic.numberType(num1));
		System.out.print("\nCube of "+num1+" is :"+magic.numberCube(num1));

	}

}
