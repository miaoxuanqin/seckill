package org.seckill.exception; 
/** 
* @author mxq E-mail: 397968061@qq.com
* @version 创建时间：2016年12月7日 下午4:56:14 
* 类说明 
* Copyright (c)by 北京盖勒克丝环保科技有限公司
*/
public class RepeatKillException extends RuntimeException {
	public RepeatKillException(String message){
		super(message);
	}
	public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
 