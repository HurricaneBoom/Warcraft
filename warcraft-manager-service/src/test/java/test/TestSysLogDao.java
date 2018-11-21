package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.warcraft.mapper.BuyerInfoMapper;

public class TestSysLogDao{
	protected ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
	}
	@After
	public void destory(){
		ctx.close();
	}
	
	@Test
	public void testFindPageObjects(){
		BuyerInfoMapper buyerInfoMapper=
		ctx.getBean("buyerInfoMapper", BuyerInfoMapper.class);
		System.out.println(buyerInfoMapper.findPageObjects("s", 0, 3));
	}
	
}




