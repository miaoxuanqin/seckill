package org.seckill.dao;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dao.SeckillDao;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年10月28日 上午10:01:40 
* 类说明 
* Copyright (c)by 北京盖勒克斯环保科技有限公司
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class St {
	@Resource
	private SeckillDao seckillDao;
	
	@Test
	public void queryById() {
		long id=1;
		Seckill xx=seckillDao.queryById(id);
		System.out.println(xx);
	}
	
	@Test
	public void reduceNumber() {
		int x =seckillDao.reduceNumber(1, new Date());
		System.out.println(x);
	}
	@Test
	public void queryAll() {
		List<Seckill> xx =seckillDao.queryAll(0, 1000);
		System.out.println(xx);
	}


}
 