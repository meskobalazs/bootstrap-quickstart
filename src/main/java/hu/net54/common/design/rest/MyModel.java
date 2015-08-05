package hu.net54.common.design.rest;

import java.io.Serializable;


public class MyModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
