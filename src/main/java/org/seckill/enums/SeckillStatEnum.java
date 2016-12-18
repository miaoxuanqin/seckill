package org.seckill.enums; 
/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年12月8日 下午3:14:17 
* 类说明 
* Copyright (c)by 北京盖勒克丝环保科技有限公司
*/
public enum SeckillStatEnum {
	SUCCESS(1,"秒杀成功"),
	END(0,"秒杀结束"),
	REPEAT_KILL(-1,"重复秒杀"),
	INNER_ERROR(-2,"内部错误"),
	DATA_REWRITE(-3,"数据篡改");
	private int state;
	private String stateInfo;
	/**
	 * @param state
	 * @param stateInfo
	 */
	private SeckillStatEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	public int getState() {
		return state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public static SeckillStatEnum stateOf(int index){
		for(SeckillStatEnum state:values()){
		if (state.getState()==index) {
			return state;
			}	
		}
		return null;
	}
}
 