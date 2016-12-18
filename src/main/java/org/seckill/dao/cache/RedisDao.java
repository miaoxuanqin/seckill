package org.seckill.dao.cache;

import org.seckill.entity.Seckill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年12月17日 下午6:25:51 
* 类说明 
* Copyright (c)by 北京盖勒克丝环保科技有限公司
*/
public class RedisDao {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	private final JedisPool jedisPool;
	private RuntimeSchema<Seckill> schema=RuntimeSchema.createFrom(Seckill.class);
	
	public RedisDao(String ip ,int port){
		jedisPool=new JedisPool(ip,port);
	}
	
	public Seckill getSeckill(long seckillId){
		
		try {
			Jedis jedis=jedisPool.getResource();
			try {
				String key="seckill:"+seckillId;
				byte[] bytes=jedis.get(key.getBytes());
				if (bytes!=null) {
					Seckill seckill=schema.newMessage();
					ProtostuffIOUtil.mergeFrom(bytes, seckill, schema);
					return seckill;
				}
				
			}finally{
				jedis.close();
			}
		} catch (Exception e) {
			// 
			logger.error(e.getMessage());
		}
		return null;
	}
	
	public String putSeckill(Seckill seckill){
		try {
			Jedis jedis=jedisPool.getResource();
			try {
				String key="seckill:"+seckill.getSeckillId();
				byte[] bytes=ProtostuffIOUtil.toByteArray(seckill, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
				String result=jedis.setex(key.getBytes(), 3600, bytes); 
				return result;
			} finally  {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
 