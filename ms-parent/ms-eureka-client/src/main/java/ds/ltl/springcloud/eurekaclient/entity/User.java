package ds.ltl.springcloud.eurekaclient.entity;

public class User extends BaseVO {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String address;
	
	private String phone;
	
	private String mail;
	
	public User(){
		
	}
	
	public User(String id,String name){
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
