var seckill={
		URL:{
			now:function(){
				return '/seckill/time/now';
			}
		},
		validatePhone:function(phone){
			if (phone&&phone.length==11&&!isNaN(phone)) {
				return true
			}else{
				return false;
			}
		},
		
		countdown:function(seckillId,nowTime,startTime,endTime){
			var seckillBox=$('#seckill-box');
			if (nowTime>endTime) {
				seckillBox.html('秒杀结束');
			}else if(nowTime<startTime){
				var killTime=new Date(startTime+1000);
				seckillBox.countdown(killTime,function(event){
					//控制时间格式
					var format=event.strftime('秒杀倒计时：%D天 %H时 %M分 %S秒');
					seckillBox.html(format);
				});
			}else{
				
			}
		},
		detail:{
			init:function(params){
				//用户手机验证相关的操作、计时交互
				//规划交互流程
				var killPhone=$.cookie('killPhone');
				var startTime=params['startTime'];
				var endTime=params['endTime'];
				var seckillId=params['seckillId'];
				
				if (!seckill.validatePhone(killPhone)) {
					var killPhoneModal=$('#killPhoneModal');
					killPhoneModal.modal({
						show:true,
						backdrop:'static',
						keyboard:false
					});
					$("#killPhoneBtn").click(function(){
						var inputPhone=$('#killPhoneKey').val();
						if (seckill.validatePhone(inputPhone)) {
							$.cookie('killPhone',inputPhone,{expires:7,path:'/seckill'});
							window.location.reload();
						}else{
							$("#killPhoneMessage").hide().html('<lable class="lable lable-danger">手机号错误！</lable>').show(300);
						}
					});
				}
				$.get(seckill.URL.now(),{},function(result){
					if (result&&result['success']) {
						var nowTime=result['data'];
						countdown(seckillId,nowTime,startTime,endTime);
					}else{
						console.log('result'+result);
					}
				});
				
			}	
		}
		
		
		
}