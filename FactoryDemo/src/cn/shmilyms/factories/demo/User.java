package cn.shmilyms.factories.demo;

/**
 * Main pojo class for user identity.
 * 
 * @author shmilyms
 */
public class User {
	
	private String username;		// user name
	private Privileges privilege;	// privilege user qualifies
	private boolean expired;		// flag for membership validity. true - expired, false - valid
	private boolean reminded;		// flag for discount trial. true - applied, false - not applied
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Privileges getPrivilege() {
		return privilege;
	}
	
	public void setPrivilege(Privileges privilege) {
		this.privilege = privilege;
	}
	
	public boolean isExpired() {
		return expired;
	}
	
	public void setExpired(boolean isExpired) {
		this.expired = isExpired;
	}
	
	public boolean isReminded() {
		return reminded;
	}
	
	public void setReminded(boolean reminded) {
		this.reminded = reminded;
	}
	
}
