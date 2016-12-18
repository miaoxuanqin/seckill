package org.seckill.entity;

import java.util.Date;

/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年10月25日 下午2:12:11 
* 类说明 
* Copyright (c)by 北京盖勒克斯环保科技有限公司
*/
public class SuccessKilled {
	private long seckillId;
	private long userPhone;
	private short state;
	private Date CreateTime;
	
	private Seckill seckill;
	
	
	public Seckill getSeckill() {
		return seckill;
	}
	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}
	public long getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public short getState() {
		return state;
	}
	public void setState(short state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	@Override
	public String toString() {
		return "SuccessKilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state
				+ ", CreateTime=" + CreateTime + "]";
	}
	
}
 