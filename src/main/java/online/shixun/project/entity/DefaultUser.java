package online.shixun.project.entity;

import javax.validation.constraints.NotBlank;

public class DefaultUser extends SimpleUser{
	@NotBlank
	private String email;
	@NotBlank
	private String profession;
	
	
	public DefaultUser() {
		super();
	}
	public DefaultUser(@NotBlank String email, @NotBlank String profession) {
		super();
		this.email = email;
		this.profession = profession;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	@Override
	public String toString() {
		return "DefaultUser [email=" + email + ", profession=" + profession + "]";
	}
	
	
}
