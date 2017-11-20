package online.shixun.project.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SimpleUser {
	
	@NotBlank(message="gg")
	@Size(min=2,max=8)
	private String name;
	@NotBlank
	private String password;
	
	
	public SimpleUser() {
		super();
	}
	public SimpleUser(String name,String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "SimpleUser [name=" + name + ", password=" + password + "]";
	}
}
