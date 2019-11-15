package cn.shmilyms.factories.demo;
import java.util.HashMap;
import java.util.Map;

/** 
 * Abstract class for strategy. Override quote0 method to specify quoting details.
 * 
 * @author shmilyms
 */
public abstract class Strategy {
	
	private static Map<Privileges,Strategy> strategies = new HashMap<>();
	
	/**
	 * Main method for quoting. For unregistered privileges default strategy is "no discount".
	 * 
	 * @param user
	 * 			User class to identify users and corresponding attributes.
	 * @param price
	 * 			Raw total price to apply discounts.
	 */
	public static float quote(User user,float price) {
		
		if (strategies.containsKey(user.getPrivilege()))
			return strategies.get(user.getPrivilege()).quote0(user,price);
		else {
			// logger.log
			return strategies.get(Privileges.noVIP).quote0(user,price);
		}
			
	}
	
	/**
	 * Main method for registration of privileges. 
	 * 
	 * @param privilege
	 * 			Privilege to register.
	 * @param strategy
	 * 			Corresponding strategy for the registering privilege.
	 */
	public static final void registerStrategy(Privileges privilege,Strategy strategy) {
		
		if (strategies.containsKey(privilege))
			;// logger.log
		strategies.put(privilege,strategy);
		
	}
	
	protected abstract float quote0(User user,float price) ;
}
