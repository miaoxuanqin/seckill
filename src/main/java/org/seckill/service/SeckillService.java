package org.seckill.service;

import java.util.List;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年12月7日 下午4:36:02 
* 类说明   
* 站在使用者的角度去设计界面
* 三个方面 参数
* Copyright (c)by 北京盖勒克丝环保科技有限公司
*/
public interface SeckillService {
	List<Seckill> getSeckillList();
	/**
	 * 查询单个秒杀记录
	* @Title: getById
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param seckillId
	* @param @return    参数
	* @return Seckill    返回类型
	* @throws
	 */
	Seckill getById(long seckillId);
	
	Exposer exportSeckillUrl(long seckillId);
	
	SeckillExecution executeSeckill(long seckillId,long userPhone,String md5)
			throws SeckillException,RepeatKillException,SeckillCloseException;
	
	SeckillExecution executeSeckillProcedure(long seckillId,long userPhone,String md5)
			throws SeckillException,RepeatKillException,SeckillCloseException;
	
	
}
 