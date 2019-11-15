package cn.shmilyms.factories.test;
import cn.shmilyms.factories.demo.NoVIPStrategy;
import cn.shmilyms.factories.demo.ParticularStrategy;
import cn.shmilyms.factories.demo.Privileges;
import cn.shmilyms.factories.demo.Strategy;
import cn.shmilyms.factories.demo.SuperVIPStrategy;
import cn.shmilyms.factories.demo.User;
import cn.shmilyms.factories.demo.VIPStrategy;
import junit.framework.TestCase;

public class Test extends TestCase{
	public Test() {
		
		Strategy.registerStrategy(Privileges.noVIP, new NoVIPStrategy());
		Strategy.registerStrategy(Privileges.ParticularVIP, new ParticularStrategy());
		Strategy.registerStrategy(Privileges.SuperVIP, new SuperVIPStrategy());
		Strategy.registerStrategy(Privileges.VIP, new VIPStrategy());
	}
	public void testPrivileges() {
		User user = new User();

		user.setPrivilege(Privileges.noVIP);
		assertEquals(Strategy.quote(user, 10f),10f);
		
		user.setPrivilege(Privileges.VIP);
		assertEquals(Strategy.quote(user, 10f),9f);
		
		user.setPrivilege(Privileges.ParticularVIP);
		assertEquals(Strategy.quote(user, 10f),10f);
		
		user.setPrivilege(Privileges.ParticularVIP);
		assertEquals(Strategy.quote(user, 40f),28f);
		
		user.setPrivilege(Privileges.SuperVIP);
		assertEquals(Strategy.quote(user, 10f),8f);
		
		user.setExpired(true);
		user.setReminded(false);
		assertEquals(Strategy.quote(user, 10f),8f);
		
		assertEquals(Strategy.quote(user, 10f),9f);
		
		
	}
}
