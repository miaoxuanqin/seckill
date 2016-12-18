
package org.seckill.entity;

import java.util.Date;

/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年10月20日 下午3:59:16 
* 类说明 
* Copyright (c)by 北京盖勒克斯环保科技有限公司
*/
public class Seckill {
	private long seckillId;
	private String name;
	private int number;
	private Date startTime;
	private Date endTime;
	private Date createTime;
	

	public long getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Seckill [seckillId=" + seckillId + ", name=" + name + ", number=" + number + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", createTime=" + createTime + "]";
	}
	
}
 