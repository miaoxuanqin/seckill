package org.seckill.dao;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dao.SeckillDao;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;
import org.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年10月28日 上午10:01:40 
* 类说明 
* Copyright (c)by 北京盖勒克斯环保科技有限公司
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/*.xml"})
public class SuccessKilledServiceTest {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Resource
	private SeckillService seckillService;
	
	public void  getSeckillList() {
		List<Seckill> list=seckillService.getSeckillList();
		logger.info("list={}",list);
	}
	
	public void getById() {
		long id=1000;
		Seckill seckill=seckillService.getById(id);
		logger.info("seckill={}",seckill);
	}
	
	public void exportSeckillUrl() {
		long id=1000;
		Exposer exposer=seckillService.exportSeckillUrl(id);
		logger.info("exposer={}",exposer);
	}
	/**
	 * 开发团队达成一致约定
	 * 
	 */
	
	public void executeSeckill()
			throws SeckillException, RepeatKillException, SeckillCloseException {
		long id=1000;
		long phone=13555555555l;
		String md5="75d78bbabfef555190998c9113a8a400";
		try {
			SeckillExecution seckillExecution=seckillService.executeSeckill(id, phone, md5);
			logger.info("seckillExecution={}",seckillExecution);
		} catch (RepeatKillException e) {
			logger.info(e.getMessage());
		}catch (SeckillCloseException e) {
			logger.info(e.getMessage());
		}
		
	}
	@Test
	public void testLogic(){
		long id=2;
		Exposer exposer=seckillService.exportSeckillUrl(id);
		if (exposer.isExposed()) {
			long phone=13555555558l;
			String md5="75d78bbabfef555190998c9113a8a400";
			try {
				SeckillExecution seckillExecution=seckillService.executeSeckill(id, phone, md5);
				logger.info("seckillExecution={}",seckillExecution);
			} catch (RepeatKillException e) {
				logger.error(e.getMessage());
			}catch (SeckillCloseException e) {
				logger.error(e.getMessage());
			}
		}else{
			logger.warn("exposer={}",exposer);
		}
		
	}
	

}
 