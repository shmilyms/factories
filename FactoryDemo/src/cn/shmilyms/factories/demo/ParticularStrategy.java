package cn.shmilyms.factories.demo;
/**
 * Strategy class for particular vips. Applys a 30% discount for orders over $30.
 * 
 * @author shmilyms
 */
public class ParticularStrategy extends Strategy {
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
		// TODO Auto-generated method stub
		return price>=30 ? price*0.7f : price;
	}

}
