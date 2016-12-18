package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年10月25日 下午2:27:49 
* 类说明 
* Copyright (c)by 北京盖勒克斯环保科技有限公司
*/
public interface SuccessKilledDao {
	
	int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long UserPhone);;
	
	SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,  @Param("userPhone")long UserPhone);
	
}
 