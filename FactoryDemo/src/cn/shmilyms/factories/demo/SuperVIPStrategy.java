package cn.shmilyms.factories.demo;
/**
 * Strategy class for Super vips. Applys a universal 20% discount. 
 * When membership expired, applys a 20% discount once and 
 * downgrades to standard VIP, a.k.a. 10% discount.
 * 
 * @author shmilyms
 */
public class SuperVIPStrategy extends Strategy {
	/**
	 * Quotes with 20% off when valid. Otherwise downgrades to a
	 * trial as a reminder to maintain membership.
	 * 
	 * @param user
	 * 			User class to identify users and corresponding attributes.
	 * @param price
	 * 			Raw total price to apply discounts.
	 */
	@Override
	protected float quote0(User user, float price) {

		if (!user.isExpired())
			return price*0.8f;
		else
		if(!user.isReminded()) {
			user.setReminded(true);
			return price*0.8f;
			}
		else
			return price*0.9f;
		
	}

}
