package org.seckill.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年10月25日 下午2:22:12 
* 类说明 
* Copyright (c)by 北京盖勒克斯环保科技有限公司
*/
public interface SeckillDao {
	/**
	 * 
	* @Title: reduceNumber
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param seckillId
	* @param @param killDate
	* @param @return    参数
	* @return int    返回类型
	* @throws
	 */
	int reduceNumber(@Param("seckillId") long seckillId,@Param("killDate") Date killDate);
	
	Seckill queryById(long seckillId);
	
	List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	void killByProcedure(Map<String, Object> paramMap);
}
 