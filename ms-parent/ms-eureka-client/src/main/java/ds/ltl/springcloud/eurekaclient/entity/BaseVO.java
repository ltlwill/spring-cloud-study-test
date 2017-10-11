package ds.ltl.springcloud.eurekaclient.entity;

import java.io.Serializable;

public class BaseVO implements Serializable{

	private static final long serialVersionUID = -4928478078504653386L;
	
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
