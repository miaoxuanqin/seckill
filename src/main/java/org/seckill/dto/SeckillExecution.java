package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;

/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年12月7日 下午4:50:52 
* 类说明 
* Copyright (c)by 北京盖勒克丝环保科技有限公司
*/
public class SeckillExecution {
	private long seckillId;
	private  int state;
	private String stateInfo;
	private SuccessKilled successKilled;
	public long getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public SuccessKilled getSuccessKilled() {
		return successKilled;
	}
	public void setSuccessKilled(SuccessKilled successKilled) {
		this.successKilled = successKilled;
	}
	/**
	 * @param seckillId
	 * @param state
	 * @param stateInfo
	 * @param successKilled
	 */
	public SeckillExecution(long seckillId, SeckillStatEnum statEnum,  SuccessKilled successKilled) {
		super();
		this.seckillId = seckillId;
		this.state = statEnum.getState();
		this.stateInfo = statEnum.getStateInfo();
		this.successKilled = successKilled;
	}
	/**
	 * @param seckillId
	 * @param state
	 * @param stateInfo
	 */
	public SeckillExecution(long seckillId, SeckillStatEnum statEnum) {
		super();
		this.seckillId = seckillId;
		this.state = statEnum.getState();
		this.stateInfo = statEnum.getStateInfo();
	}
	@Override
	public String toString() {
		return "SeckillExecution [seckillId=" + seckillId + ", state=" + state + ", stateInfo=" + stateInfo
				+ ", successKilled=" + successKilled + "]";
	}
	
	
	
}
 