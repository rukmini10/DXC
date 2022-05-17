package com.dxc.ws.endpoint;

import javax.xml.ws.Endpoint;

import com.dxc.ws.NumberMagic;

public class NumberMagicEndPointPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/PlayWithNumberService/NumberMagic", new NumberMagic());
	}

}
