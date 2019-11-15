package cn.shmilyms.factories.demo;
/**
 * Strategy class for standard vips. Applys a universal 10% discount. 
 * 
 * @author shmilyms
 */
public class VIPStrategy extends Strategy {
	/**
	 * Quotes with 30% off for orders over $30.
	 * 
	 * @param user
	 * 			User class to identify users and corresponding attributes.
	 * @param price
	 * 			Raw total price to apply discounts.
	 */
	@Override
	protected float quote0(User user,float price) {
		return 0.9f*price;
		
	}

}
