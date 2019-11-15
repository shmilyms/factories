package cn.shmilyms.factories.demo;

/**
 * Strategy class for non-vip users. No discount applied.
 * 
 * @author shmilyms
 */
public class NoVIPStrategy extends Strategy {
	/**
	 * Quotes with no discount.
	 * 
	 * @param user
	 * 			User class to identify users and corresponding attributes.
	 * @param price
	 * 			Raw total price to apply discounts.
	 */
	@Override
	protected float quote0(User user,float price) {
		// TODO Auto-generated method stub
		return 1.0f*price;
	}

}
