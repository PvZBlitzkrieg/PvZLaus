/****
PvZLaus
    Copyright (C) 2025  Xborks

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
****/
类 Zombie
	变量 HP : 整数
	变量 HPM : 整数

	//0普僵
	//1旗帜
	变量 type : 整数
	变量 anim : Anim
	变量 x : 单精度小数=0f
	变量 y : 单精度小数=0f
	变量 xv : 单精度小数=0f
	变量 scale : 单精度小数=1f
	变量 row : 整数=-1
	//头盔血helmet
	变量 hasH : 逻辑型
	变量 HHP : 整数
	变量 HHPM : 整数
	变量 Htype : 文本
	//护盾血shield
	变量 hasS :逻辑型
	变量 SHP : 整数
	变量 SHPM : 整数
	变量 Stype : 文本
	变量 更新帧 : 单精度小数=0f
	变量 无敌 : 逻辑型=假
	变量 无视 : 逻辑型=假
	变量 无形 : 逻辑型=假
	变量 hasLostArm : 逻辑型=假
	变量 hasDying : 逻辑型=假
	变量 后摇 : 逻辑型=假

	变量 旋转度数 : 单精度小数=0f
	变量 旋转速度 : 单精度小数=0f

	变量 寒冷 : 整数=0
	变量 冰冻 : 整数=0

	变量 spcsta : 文本="none"
	//2025.8.12
	变量 进了家 : 逻辑型=假
	//2025.8.18
	变量 die : 逻辑型=假


	//这个值每个固定帧会改变，可以完成一些2帧一次的操作
	变量 frex : 逻辑型=假

	变量 是否寒冷 : 逻辑型=假

	//2025.8.4  计时 某些僵尸可能需要计时
	变量 dtime : 整数
	//2025.8.4
	变量 enableBroken : 逻辑型

	变量 限制矩形 : 四边形
	//生是true,死是false
	//僵尸......真的有生命吗？
	变量 生命状态 : 逻辑型=真

	变量 舞王动画进度 : 单精度小数

	变量 无为 : 逻辑型
	变量 代理x : 单精度小数


	@静态
	变量 zombie_handin : 文本[]={"anim_innerarm1","anim_innerarm2","anim_innerarm3"}
	@静态
	变量 zombie_handout : 文本[]={"Zombie_outerarm_upper","Zombie_outerarm_lower","Zombie_outerarm_hand"}
	@静态
	变量 zombie_screen_hand : 文本[]={"Zombie_outerarm_screendoor",
	"Zombie_innerarm_screendoor","Zombie_innerarm_screendoor_hand"}
	@静态
	变量 zombie_screen : 文本[]={"anim_screendoor"}
	@静态
	变量 zombie_cone : 文本[]={"anim_cone"}
	@静态
	变量 zombie_bucket : 文本[]={"anim_bucket"}
	@静态
	变量 zombie_flag_hand : 文本[]={"Zombie_flaghand","Zombie_innerarm_screendoor"}
	@静态
	变量 zombie_duckytube : 文本[]={"Zombie_duckytube"}
	@静态
	变量 zombie_mustache : 文本[]={"Zombie_mustache"}
	@静态
	变量 zombie_tongue : 文本[]={"anim_tongue"}
	@静态
	变量 zombie_head : 文本[]={"Zombie_mustache","anim_tongue","anim_head1","anim_head2","anim_hair"}


	变量 管理器 : 窗口管理器

	变量 state="uninit"
	变量 cv : 矩形x
	变量 预制位置x : 单精度小数=0f
	变量 行走动画 : 文本
	变量 行走状态 : 文本
	变量 speed : 单精度小数=0f
	变量 间断点 : 逻辑型=假

	//2025.8.2
	变量 倒着走 : 逻辑型=假
	//2025.8.2
	变量 matrix : Matrix=Matrix.新建()
	变量 enableMatrix : 逻辑型=假
	变量 诞生x : 单精度小数=0f

	变量 僵尸 : Zombie[]
	变量 被推 : 逻辑型=假

	方法 设置寒冷(时间 : 整数)
		寒冷=时间
		是否寒冷=真
		anim.真值渲染(,{0.6f,0.6f,1.8f,1f})
	结束 方法

	方法 setStay(bool : 逻辑型)
		如果 bool 则
			代理x=x()
			预制位置x=0
		否则 无为==真
			x=x-预制位置x
			预制位置x=0
		结束 如果
		无为=bool
	结束 方法

	方法 设置冰冻(时间 : 整数)
		冰冻=时间
		anim.真值渲染(,{0.7f,0.7f,1.6f,1f})
	结束 方法


	方法 更新(帧长 : 整数)

	结束 方法

	方法 setHPM(HPx : 整数) : Zombie
		HPM=HPx
		HP=HPM
		返回 本对象
	结束 方法

	方法 setSHPM(HPx : 整数) : Zombie
		SHPM=HPx
		SHP=SHPM
		返回 本对象
	结束 方法

	方法 setHHPM(HPx : 整数) : Zombie
		HHPM=HPx
		HHP=HHPM
		返回 本对象
	结束 方法

	//创建僵尸，注意要zombieList.add(Zombie.create(...))添加到列表中
	@输出名("万恶之源")
	@静态
	方法 create(manager : 窗口管理器,type : 整数,row : 整数) : Zombie
		变量 zombie : Zombie
		zombie.管理器=manager
		zombie.x=取随机数(950,1050)
		zombie.row=row
		zombie.state="walk"
		zombie.type=type
		zombie.cv()
		zombie.诞生x=zombie.x
		如果 type==0 则
			zombie.anim_Zombie(0.2f)
		否则 type==1
			zombie.anim_Zombie(0.4f)
			zombie.setHPM(500)
			zombie.anim.强制显示(文本集集到文本集({zombie_flag_hand}),0,假)
			zombie.anim.强制显示(文本集集到文本集({zombie_handin}),-1,假)
			变量 pos : POS
			pos.置值()
			pos.kx=20
			pos.ky=20
			pos.x=10
			pos.y=-40
			pos.bkx=0
			pos.bky=70
			zombie.anim.代理("Zombie_flaghand",Anim.创建动画("Zombie_FlagPole",manager),pos)
		否则 type==2
			zombie.anim_Zombie(0.2f).anim_helmet("anim_cone",370)
		否则 type==3
			//run jump walk
			zombie.sstate("run")
			zombie.setHPM(500)
			zombie.hasH=真
			zombie.y=setY(row)-10
			zombie.anim=Anim.创建动画("Zombie_polevaulter",manager)
			zombie.播放行走动画("anim_run")
			zombie.speed=tool_getrandom()*0.8f
			zombie.anim.speed=zombie.speed*2f
			zombie.xv=zombie.speed
			zombie.anim.强制显示(文本集集到文本集({zombie_screen_hand,zombie_flag_hand,zombie_duckytube,zombie_screen,zombie_bucket,zombie_mustache}),-1,真)
			如果 取随机数(0,100)<50 则
				zombie.anim.强制显示(zombie_tongue,-1,假)
			结束 如果
		否则 type==4
			zombie.anim_Zombie(0.4f).anim_helmet("anim_bucket",1100)
		否则 type==5
			zombie.sstate("walk")
			zombie.setSHPM(150)
			zombie.setHPM(270)
			zombie.y=50+100*row
			zombie.anim=Anim.创建动画("Zombie_paper",manager)
			zombie.Stype="Zombie_paper_paper"
			zombie.播放行走动画("anim_walk")
			zombie.speed =tool_getrandom()*0.4f
			zombie.anim.speed=zombie.speed*2f
			zombie.xv=zombie.speed
			zombie.anim_shield("Zombie_paper_paper",150)
		否则 type==6
			zombie.anim_Zombie(0.4f).anim_zombie_shield("anim_screendoor",1100)
		否则 type==7
			zombie.state="walk"
			zombie.setHPM(270)
			zombie.anim=Anim.创建动画("Zombie_football",manager)
			zombie.y=zombie.gety()
			zombie.播放行走动画("anim_walk")
			zombie.speed =tool_getrandom()*1.5f
			zombie.anim.speed=zombie.speed*2f
			zombie.xv=zombie.speed
			zombie.anim_helmet("zombie_football_helmet",1400)
		否则 type==8
			zombie.setHPM(500)
			zombie.anim=Anim.创建动画("Zombie_Jackson",manager)
			zombie.y=zombie.gety()
			zombie.播放行走动画("anim_moonwalk")
			zombie.speed =tool_getrandom()*0.5f
			zombie.anim.speed=zombie.speed*2f
			zombie.xv=zombie.speed
			//zombie.anim_helmet("zombie_football_helmet",1400)
			//注意这里的posttranslate不是绘图时的坐标(x*scale) 2025.8.2
			zombie.enableMatrix=真
			zombie.matrix.postScale(-1,1).postTranslate(100,0)
			zombie.sstate("moonwalk")
			zombie.僵尸=数组创建(Zombie,4)
		否则 type==9
			zombie.setHPM(500)
			zombie.anim=Anim.创建动画("Zombie_dancer",manager)
			zombie.y=zombie.gety()
			zombie.播放行走动画("anim_armraise")
			zombie.sstate("dance")
			zombie.speed =tool_getrandom()*0.5f
			zombie.anim.speed=zombie.speed*2f
			zombie.xv=zombie.speed
			zombie.matrix.postScale(-1,1).postTranslate(100,0)
			zombie.setsp(zombie.anim.speed/2)
		结束 如果
		zombie.xv=1f
		返回 zombie
	结束 方法

	方法 取影子位置() : 单精度小数[]

	结束 方法

	方法 sstate(sta : 文本)
		state=sta
		行走状态=sta
	结束 方法

	方法 播放行走动画(名称 : 文本)
		行走动画=名称
		anim.播放动画(名称)
	结束 方法

	@静态
	方法 tool_getrandom() : 单精度小数
		返回 取随机数(850,1150)/1000f
	结束 方法

	方法 setsp(ft : 单精度小数) : Zombie
		speed=ft*0.5f
		anim.speed=ft
		返回 本对象
	结束 方法

	方法 anim_Zombie(速度 : 单精度小数=0.6f) : Zombie
		sstate("walk")
		setHPM(270)
		cv()
		anim=Anim.创建动画("Zombie",管理器)
		y=gety()
		如果 取随机数(0,100)<50 则
			播放行走动画("anim_walk")
		否则
			播放行走动画("anim_walk2")
		结束 如果
		speed=取随机数(700,1300)/1000f*速度
		anim.speed=speed*2f
		xv=speed
		anim.强制显示(文本集集到文本集({zombie_screen_hand,zombie_flag_hand,zombie_duckytube,zombie_screen,zombie_cone,zombie_bucket,zombie_mustache}),-1,真)
		anim_zombie_randomtongue()
		返回 本对象
	结束 方法

	方法 cv()
		cv.x=40
		cv.y=40
		cv.w=40
		cv.h=80
	结束 方法

	方法 setC(x : 单精度小数,y : 单精度小数,w : 单精度小数,h : 单精度小数)

	结束 方法

	方法 anim_helmet(name : 文本,hHP : 整数) : Zombie
		anim.强制显示({name},0,假)
		Htype=name
		setHHPM(hHP)
		hasH=真
		返回 本对象
	结束 方法

	方法 anim_zombie_shield(name : 文本,sHP : 整数) : Zombie
		anim.强制显示(文本集集到文本集({{name},zombie_screen_hand}),0,假)
		anim.强制显示(文本集集到文本集({zombie_handin,zombie_handout}),-1,假)
		Stype=name
		setSHPM(sHP)
		hasS=真
		返回 本对象
	结束 方法

	方法 anim_shield(name : 文本,hHP : 整数) : Zombie
		Stype=name
		setSHPM(hHP)
		hasS=真
		返回 本对象
	结束 方法

	方法 anim_zombie_randomtongue() : Zombie
		如果 取随机数(0,100)<50 则
			anim.强制显示(zombie_tongue,-1,假)
		结束 如果
		返回 本对象
	结束 方法

	//2025.8.11
	方法 推()
		被推=真
	结束 方法

	@静态
	方法 setY(row : 整数) : 整数
		返回 50+100*row
	结束 方法

	@静态
	方法 文本集集到文本集(nr : 文本[][]) : 文本[]
		变量 len : 整数
		循环(i, 0, 取数组长度(nr))
			len=len+取数组长度(nr[i])
		结束 循环
		变量 index : 整数
		变量 index2 : 整数
		变量 rlt : 文本[]=数组创建(文本,len)
		循环(i, 0, len)
			如果 index2>=取数组长度(nr[index])则
				index2=0
				index=index+1
			结束 如果
			rlt[i]=nr[index][index2]
			index2=index2+1
		结束 循环
		//变量 wbs : 文本集合=rlt
		//日志(文本集合到文本(wbs,"\n"))
		返回 rlt
	结束 方法

	方法 文本集集到文本集2(t : 文本[][]) : 文本[]
		变量 len=0
		循环(i, 0, 取数组长度(t))
			len=len+取数组长度(t[i])
		结束 循环
		变量 index : 整数
		变量 index2 : 整数
		变量 rlt : 文本[]=数组创建(文本,len)
		循环(i, 0, len)
			rlt[i]=t[index][index2]
			index2=index2+1
			如果 index2==取数组长度(t[index]) 则
				index2=0
				index=index+1
			结束 如果
		结束 循环
		返回 rlt
	结束 方法

	方法 gety() : 单精度小数
		变量 realy=管理器.gety(row,x()+50)-5
		变量 offy=-130
		如果 anim.名称=="Zombie" 则
			offy=-130
		否则 anim.名称=="Zombie_polevaulter"||anim.名称=="Zombie_football"
			offy=-140
		结束 如果
		返回 realy+offy
	结束 方法

	方法 Update() : 逻辑型
		如果 die 则
			返回 真
		结束 如果
		//小推车——僵尸的终极克星
		如果 被推 则
			变量 tracle : Tracle=Tracle.create(管理器,zombie_mowered,x(),y)
			anim.暂停=真
			变量 posw : POS
			posw.置值()
			变量 animv : Anim=Anim.创建动画("LawnMoweredZombie",管理器).代理("locator",anim,posw,真)
			animv.播完暂停=真
			tracle.anim=animv

			管理器.tracleList.添加成员(tracle)
			返回 真
		结束 如果

		如果 anim.animname=="anim_idle" 则
		否则
			变量 realy=gety()
			变量 cha=y-realy
			如果 cha>=1f 则
				y=y-1f
			否则 cha<=-1f
				y=y+1f
			否则
				y=realy
			结束 如果
		结束 如果
		如果 frex 则
			frex=假
		否则
			frex=真
		结束 如果
		如果 寒冷==0&&冰冻==0 则
			anim.speedslows=1f
		结束 如果
		如果 state=="charry" 则
			变量 tracle : Tracle=Tracle.create(管理器,zombie_charred,x(),y)
			管理器.tracleList.添加成员(tracle)
			返回 真
		结束 如果
		如果 x<0 则
			返回 真
		结束 如果
		//日志(hpx)
		如果 后摇&&(anim.frame>=anim.maxframe-1f-anim.speed||anim.update) 则
			返回 真
		结束 如果
		如果 后摇==假 则
			//日志("hp:"+hpx)
			如果 HP<=0 则
				后摇=真
				无敌=真
				无视=真
				无形=真
				变量 animt : 文本[]={"anim_death"}
				如果 anim.名称=="Zombie" 则
					animt={"anim_superlongdeath","anim_death","anim_death2"}
				结束 如果
				pos()
				anim.播放动画(animt[取随机数(0,取数组长度(animt)-1)])
				anim.强制显示({"Zombie_whitewater","Zombie_whitewater2"},-1)
				anim.update=假
				返回 假
			结束 如果
			x()
		结束 如果
		如果 hasDying&&frex 则
			HP=HP-1
		结束 如果
		/*
		如果 state=="eat" 则
		否则
			如果 anim.名称=="Zombie" 则
				变量 b4=44
				变量 b3=57
				变量 b2=67
				变量 b1=80
				变量 a1=91
				变量 a2=107
				变量 a3=114
				变量 a4=130
				变量 a5=137
				变量 f=anim.frame
				变量 xvf=xv*scale
				如果 b4<f&&f<=b3 则
					x=x-xvf*1f
				否则 b3<f&&f<=b2
					x=x-xvf*0.1f
				否则 b2<f&&f<=b1
					x=x-xvf*1.4f
				否则 b1<f&&f<=a1
					x=x-xvf*0.3f
				否则 a1<f&&f<=a2
					x=x-xvf*0.8f
				否则 a2<f&&f<=a3
					x=x-xvf*0.1f
				否则 a3<f&&f<=a4
					x=x-xvf
				否则 a4<f&&f<=a5
					x=x-xvf*0.4f
				否则
					x=x-xvf
				结束 如果
			否则
				x=x-xv
			结束 如果
		结束 如果
*//*
		变量 poslist=anim.获取Reanim("_ground").poslist
		变量 indexw=anim.frame
		变量 hb=indexw%1
		变量 index=(indexw-hb).到整数()
		变量 ft=poslist[index].x
		变量 indexs=index+1
		如果 indexs==anim.maxframe 则
			indexs=anim.startframe
		结束 如果
		变量 st=poslist[indexs].x
		*/
		//变量 delta=(st-ft)*(anim.frame-更新帧)*xv
		//更新帧=indexw
		如果 state!="eat" 则
			变量 poslist=anim.获取Reanim("_ground").poslist
			变量 indexw=anim.frame
			变量 hb=indexw%1
			变量 index=(indexw-hb).到整数()

			如果 anim.强制演化帧==-1 则
				如果 index>=anim.maxframe 则
					index=anim.startframe
					anim.frame=anim.startframe
					pos()
				结束 如果
			结束 如果

			变量 ft=poslist[anim.startframe].x
			变量 ht=poslist[index].x
			变量 indexs=index+1

			如果 indexs>=anim.maxframe 则

				indexs=anim.startframe
				pos()
			否则
				变量 st=poslist[indexs].x
				如果 anim.update 则
					pos()
					//anim.update=假
				否则 anim.强制演化帧==-1

					预制位置x=-1*((st-ht)*hb*xv+(ht-ft)*xv)

					如果 enableMatrix 则
						变量 f9=matrix.getValues()
						预制位置x=预制位置x*f9[0]
					结束 如果

				结束 如果
				//((ht-st)*hb-ft)*xv
			结束 如果
		结束 如果
		如果 hasDying==假 则
			如果 无视==假 则
				变量 eat : 逻辑型=假
				循环(i, 0, 管理器.plantList.长度)
					变量 plant : Plant=(管理器.plantList)[i]
					如果 plant.row==row&&plant.无视==假 则
						变量 xd : 整数=x() : 整数
						变量 xe : 整数=plant.x : 整数
						如果 cv.碰撞(plant.cv,xd,xe) 则
							如果 type==3&&state=="run" 则
								pos()
								anim.播放动画("anim_jump")
								anim.动画回归="anim_walk"
								state="waitwalk"
								无敌=真
								无视=真
							否则
								如果 state=="eat" 则
								否则
									pos()
									空手到吃(假)
									如果 hasS 则
										铁门到空手(假)
									结束 如果
									变量 fr : 整数=anim.frame : 整数
									anim.暂停=假
									anim.播完暂停=假
									如果 spcsta=="gasp" 则
										anim.播放动画("anim_eat_nopaper")
									否则
										anim.播放动画("anim_eat")
									结束 如果
									anim.过渡从(fr,4)
									cstate("eat")
								结束 如果
								如果 plant.type==4&&plant.state=="idle" 则
									plant.state="boom"
								结束 如果
								如果 plant.无敌==假&&frex 则
									(管理器.plantList)[i].HP=(管理器.plantList)[i].HP-1
								结束 如果
								eat=真
							结束 如果
							退出循环
						结束 如果
					结束 如果
				结束 循环
				如果 eat==假&&state=="eat" 则
					如果 hasS 则
						铁门到空手(真)
					结束 如果
					空手到吃(真)
					变量 fr : 整数=anim.frame : 整数
					anim.播放动画(行走动画)
					如果 fr!=anim.startframe 则
						anim.过渡从(fr,4)
					结束 如果
					cstate(行走状态)

				结束 如果
			结束 如果

		结束 如果
		如果 后摇==假 则
			如果 type==8||(type==9&&state!="pre") 则
				如果 state=="moonwalk" 则
					enableMatrix=true
					如果 诞生x-x()>=3*管理器.格子宽() 则
						pos()
						enableMatrix=假
						state="point"
						anim.播放动画("anim_point")
						anim.播完暂停=真
					结束 如果
				否则 state=="point"
					如果 dtime==50 则
						循环(i, 0, 4)
							//  0
							//1    3
							//  2
							如果 (僵尸[i]==空||僵尸[i].生命状态==假)&&((row==0&&i==0)==假)&&((row==管理器.取行数()-1&&i==2)==假) 则
								变量 rowh=row
								变量 dancer : Zombie=Zombie.create(管理器,9,rowh)
								dancer.state="pre"
								dancer.anim.暂停=true
								如果 i==0 则
									dancer.row=row-1
									dancer.x=x
									dancer.y=y-管理器.取行高()
								否则 i==1
									dancer.x=x-管理器.取行宽()
									dancer.y=y
								否则 i==2
									dancer.row=row+1
									dancer.x=x
									dancer.y=y+管理器.取行高()
								否则 i==3
									dancer.x=x+管理器.取行宽()
									dancer.y=y
								结束 如果
								//变量 sbx : 四边形=四边形.新建(dancer.y)
								dancer.y=dancer.y+100
								dancer.无视=真
								dancer.限制矩形=四边形.新建(-200,dancer.y-120,400,145,1,0)
								dancer.enableBroken=true
								//dancer.限制矩形
								管理器.zombieList.添加成员(dancer)
								变量 part=Particle.新建("DancerRise",dancer.x()+10,dancer.y-15,row,管理器)
								管理器.particleList.添加成员(part)
								僵尸[i]=dancer
							结束 如果
						结束 循环
					结束 如果
					如果 dtime>=200 则
						setsp(anim.speed/2)
						dtime=0
						anim.播放动画("anim_armraise")
						anim.update=假
						sstate("dance")
						enableMatrix=真
					否则
						dtime=dtime+1
					结束 如果
				否则 state=="dance"
					变量 fr=67
					如果 type==9 则
						fr=21
					结束 如果
					变量 cr=46
					如果 type==9 则
						cr=0
					结束 如果
					如果 state!="pre"&&state!="moonwalk"&&state!="point"&&state!="eat" 则
						anim.暂停=真
						如果 舞王动画进度<40 则
							anim.startframe=fr
							anim.maxframe=fr+12
							如果 anim.frame>fr+舞王动画进度%10 则
								pos()
							结束 如果
							anim.frame=fr+舞王动画进度%10
							enableMatrix=整数到逻辑型(((舞王动画进度.到整数()-舞王动画进度.到整数()%10)/10+1)%2)
						否则 舞王动画进度<80
							anim.startframe=cr
							anim.maxframe=cr+22
							如果 anim.frame>cr+(舞王动画进度-40)%20 则
								pos()
							结束 如果
							anim.frame=cr+(舞王动画进度-40)%20
							enableMatrix=假
						否则
							舞王动画进度=0
							如果 舞王需要更新() 则
								state="point"
								anim.播放动画("anim_point")
								dtime=0
								anim.暂停=假
								anim.播完暂停=true
								anim.speed=1f
							结束 如果

						结束 如果
						如果 type==8 则
							变量 停止行动 : 逻辑型=假
							循环(i, 0, 取数组长度(僵尸))
								如果 僵尸[i]!=空&&(僵尸[i].state=="eat"&&僵尸[i].生命状态==true) 则
									僵尸[i].enableMatrix=假
									停止行动=真
									退出循环
								结束 如果
							结束 循环
							setStay(停止行动)
							循环(i, 0, 取数组长度(僵尸))
								如果 僵尸[i]!=空 则
									僵尸[i].setStay(停止行动)
								结束 如果
							结束 循环
						结束 如果
					结束 如果
					变量 baw=舞王动画进度
					舞王动画进度=舞王动画进度+0.2f
					如果 舞王动画进度>=60f&&baw<60f 则
						pos()
					结束 如果
					循环(i, 0, 取数组长度(僵尸))
						如果 僵尸[i]!=空 则
							僵尸[i].舞王动画进度=舞王动画进度
						结束 如果
					结束 循环
				否则 type==8&&state=="eat"
					enableMatrix=假
					循环(i, 0, 取数组长度(僵尸))
						如果 僵尸[i]!=空 则
							僵尸[i].setStay(真)
						结束 如果
					结束 循环
				结束 如果
			否则 type==9
				如果 state=="pre" 则
					dtime=dtime+1
					//y=y+1
					如果 dtime==100 则
						enableBroken=假
						anim.暂停=真
						sstate("dance")
						dtime=0
						无视=假
						enableMatrix=真
						anim.暂停=假
						anim.播完暂停=true
					结束 如果
				结束 如果
			结束 如果
		结束 如果
		anim.update=假
		immUpdate()
		返回 假
	结束 方法

	方法 immUpdate()
		如果 anim.animname.结尾为("nopaper")&&spcsta=="doubt" 则
			anim.speed=anim.speed*4
			speed=speed*4
			spcsta="gasp"
		结束 如果
		如果 state=="waitwalk"&&anim.hasReplay 则
			sstate("walk")
			行走动画="anim_walk"
			anim.hasReplay=假
			anim.speed=speed*2f
			x=x-147
			无敌=假
			无视=假
			anim.强制显示({"Zombie_polevaulter_pole","Zombie_polevaulter_pole2"},-1,假)
		结束 如果
		如果 是否寒冷&&寒冷<=0 则
			anim.真值渲染(,{1f,1f,1f,1f})
		结束 如果
	结束 方法

	方法 舞王需要更新() : 逻辑型
		如果 type==8 则
			循环(i, 0, 4)
				如果 (僵尸[i]==空&&(row==0&&i==0)==假&&(row==管理器.取行数()-1&&i==2)==假)||(僵尸[i]!=空&&僵尸[i].生命状态==假) 则
					返回 真
				结束 如果
			结束 循环
		结束 如果
		返回 假
	结束 方法

	方法 pos()
		如果 无为==假 则
			x=x+预制位置x
			预制位置x=0
		结束 如果
	结束 方法

	方法 cstate(sta : 文本)
		如果 state=="walk" 则
			pos()
		结束 如果
		如果 sta=="eat" 则
			anim.speed=1f
		否则
			anim.speed=speed*2f
		结束 如果
		state=sta
	结束 方法

	方法 x() : 单精度小数
		如果 无为 则
			返回 代理x
		否则
			返回 x+预制位置x
		结束 如果
	结束 方法
	//0豌豆,1爆炸,2寒冰,3地雷
	方法 damage(attack : 整数,typew : 整数=0)
		如果 typew==2 则
			如果 (hasS||type==12)==假 则
				设置寒冷(1000)
			结束 如果
		结束 如果

		如果 hasS 则
			如果 SHP<attack 则
				attack=attack-SHP
				SHP=0
				delShield()
				//anim.强制显示({anim})
			否则
				SHP=SHP-attack

				glow(Stype,1.5f,10)
				开始俘获异常()
				如果 SHP<SHPM*1f/3f 则
					变量 namex=(anim.获取Reanim(Stype).poslist)[0].image
					anim.代理图片(Stype,namex.取文本中间(0,namex.长度-2)+"3")
				否则 SHP<SHPM*2f/3f
					变量 namex=(anim.获取Reanim(Stype).poslist)[0].image
					anim.代理图片(Stype,namex.取文本中间(0,namex.长度-2)+"2")
				结束 如果
				俘获所有异常()
				日志(Stype)
				结束俘获异常()
				返回
			结束 如果
		结束 如果
		如果 hasH 则
			如果 HHP<attack 则
				attack=attack-HHP
				HHP=0
				delHelmet()
				//anim.强制显示({anim})
			否则
				HHP=HHP-attack
				glow(Htype,1.5f,10)
				如果 HHP<HHPM*1f/3f 则
					变量 namex=(anim.获取Reanim(Htype).poslist)[0].image
					变量 tempx=1
					如果 namex.结尾为("1") 则
						tempx=2
					结束 如果
					anim.代理图片(Htype,namex.取文本中间(0,namex.长度-tempx)+"3")
					//日志(namex)
				否则 HHP<HHPM*2f/3f
					变量 namex=(anim.获取Reanim(Htype).poslist)[0].image
					变量 tempx=1
					如果 namex.结尾为("1") 则
						tempx=2
					结束 如果
					anim.代理图片(Htype,namex.取文本中间(0,namex.长度-tempx)+"2")
				结束 如果
				返回
			结束 如果
		结束 如果
		如果 HP<attack 则
			HP=0
			如果 typew==1 则
				state="charry"
			结束 如果
		否则
			HP=HP-attack
		结束 如果
		glow(,1.5f,10)
		如果 hasLostArm==假&&HP<HPM*2f/3f 则
			hasLostArm=真
			变量 ordz : 整数[]={0,1,2,4,5,6,7,8,9,10}
			如果 整数属于整数集(ordz,type) 则
				断({"Zombie_outerarm_lower","Zombie_outerarm_hand"})
				anim.代理图片("Zombie_outerarm_upper","IMAGE_REANIM_"+"Zombie_outerarm_upper2".到大写())
			否则 type==3
				断({"Zombie_polevaulter_outerarm_lower","Zombie_outerarm_hand"})
				anim.代理图片("Zombie_polevaulter_outerarm_upper","IMAGE_REANIM_"+"Zombie_polevaulter_outerarm_upper2".到大写())
			结束 如果
		结束 如果
		如果 hasDying==假&&HP<HPM*1f/3f 则
			生命状态=假
			hasDying=真
			anim.speedcat=1f/anim.speed
			断(zombie_head,100)
		结束 如果
		返回
	结束 方法

	方法 断(txt : 文本[],高度 : 整数=50)
		变量 显示=anim.过滤(txt)
		anim.强制显示(txt,-1)
		变量 tracle : Tracle=Tracle.create(管理器,-1,x(),y)
		tracle.anim=anim.copy1f().强制显示(显示,0,真)
		//日志("<<<"+整数集到文本(tracle.anim.mandaf.到数组()).替换("\n"," "))
		tracle.rv=随机单精度小数(0.1f,0.7f)
		tracle.xv=tracle.rv
		tracle.yv=1.8f
		tracle.maxy=y+高度
		//tracle.ya=0.015f

		tracle.setdt(30+(高度/tracle.yv).到整数())
		管理器.tracleList.添加成员(tracle)
	结束 方法

	方法 glow(name : 文本="",color : 单精度小数,time : 单精度小数)
		变量 colorx : 单精度小数[]={color,color,color,1f}
		如果 name=="" 则
			循环(i, 0, anim.rean.长度)
				(anim.渲染值)[i].渲染(colorx,time)
			结束 循环
		否则
			anim.渲染(name,colorx,time)
		结束 如果
	结束 方法

	方法 delHelmet()
		hasH=假
		断({Htype},100)
		//anim.强制显示({Htype},-1)
	结束 方法

	方法 delShield()
		hasS=假
		断({Stype},10)
		铁门到空手(假)
		如果 type==5 则
			pos()
			如果 anim.animname=="anim_eat" 则
				anim.播放动画("anim_gasp")
				anim.动画回归="anim_eat_nopaper"
			否则
				anim.播放动画("anim_gasp")
				anim.动画回归="anim_walk_nopaper"
			结束 如果
			spcsta="doubt"
		结束 如果
	结束 方法

	方法 铁门到空手(正反 : 逻辑型=假)
		变量 a=-1
		变量 b=0
		如果 正反 则
			a=0
			b=-1
		结束 如果
		anim.强制显示(zombie_screen_hand,a)
		anim.强制显示(文本集集到文本集({zombie_handout,zombie_handin}),b)
	结束 方法

	方法 空手到吃(正反 : 逻辑型=假)
		变量 a=-1
		变量 b=0
		如果 正反 则
			a=0
			b=-1
		结束 如果
		//anim.强制显示({"Zombie_outerarm_hand"},a)
		//anim.强制显示({"Zombie_outerarm_hand2"},b)
	结束 方法

	方法 取信息() : STSL
		变量 stsl : STSL
		stsl.add("BHP",HP.到文本()+"/"+HPM.到文本())
		变量 hhp : 文本="0"
		如果 hasH 则
			hhp=HHP+"/"+HHPM+"<"+Htype+">"
		结束 如果
		stsl.add("HHP",hhp)
		变量 shp : 文本="0"
		如果 hasS 则
			shp=SHP+"/"+SHPM+"<"+Stype+">"
		结束 如果
		stsl.add("SHP",shp)
		stsl.add("type",type.到文本())
		stsl.add("state",state.到文本())
		stsl.add("dtime",dtime.到文本())
		stsl.add("prex",预制位置x.到文本())
		stsl.add("ddt",舞王动画进度.到文本())
		stsl.add("anim.name",anim.名称+"<"+anim.animname+">")
		stsl.add("anim.frame",anim.frame.到文本())
		stsl.add("anim.startframe",anim.startframe.到文本())
		stsl.add("anim.maxframe",anim.maxframe.到文本())
		stsl.add("anim.speed",anim.speed.到文本())
		stsl.add("anim.mustframe",anim.强制演化帧.到文本())
		stsl.add("anim.musttime",anim.强制演化时间.到文本())
		stsl.add("anim.mustprocess",anim.强制演化进度.到文本())
		stsl.add("anim.return",anim.动画回归)
		stsl.add("anim.stop",anim.暂停.到文本())
		stsl.add("anim.update",anim.update.到文本())
		stsl.add("x",x().到文本())
		stsl.add("y",y.到文本())
		stsl.add("xv",xv.到文本())
		stsl.add("row",row.到文本())
		stsl.add("isInvincible",无敌.到文本())
		stsl.add("isUndetectable",无视.到文本())
		stsl.add("isIntangible",无形.到文本())
		stsl.add("cold",寒冷.到文本())
		stsl.add("freeze",冰冻.到文本())
		stsl.add("enableMatrix",enableMatrix.到文本())
		返回 stsl
	结束 方法

结束 类

类 ZombieList : 集合模板类<Zombie>
结束 类

类 PaintList : 集合模板类<Plant>
结束 类

类 ProjList : 集合模板类<Proj>
结束 类

类 CoinList : 集合模板类<Coin>
结束 类

类 TracleList : 集合模板类<Tracle>
结束 类

类 ParticleList : 集合模板类<Particle>
结束 类

//2025.8.9
类 推车集
	变量 mowerList : MowerList
	//x=强制x+强制索引乘数*index
	变量 强制x : 单精度小数=0
	变量 强制索引乘数 : 单精度小数=0
	变量 显示 : 逻辑型=假
	变量 gm : 窗口管理器=空

	方法 初始化(数量 : 整数,类型 : 整数[],x : 单精度小数,gm : 窗口管理器)
		mowerList.清空()
		本对象.gm=gm
		如果 数量==0 则
		否则
			循环(i, 0, 数量)
				如果 类型[i]!=-1 则
					变量 mower : Mower=Mower.create(类型[i],i,gm)
					mower.x=x
					mowerList.添加成员(mower)
				结束 如果
			结束 循环
		结束 如果
	结束 方法

	方法 Update()
		循环(i, 0, mowerList.长度)
			变量 mower=mowerList[mowerList.长度-i-1]
			如果 mower.启动==假 则
				//mower.x=强制x+强制索引乘数*row
			结束 如果
			如果 mower.Update() 则
				//注意这里mower并没有被移除
				//你的推车无了
				//丢车是好事
				//战术丢车
				//丢车也是实力的一部分
				mower.销毁=真
			结束 如果
		结束 循环
	结束 方法
结束 类

类 MowerList : 集合模板类<Mower>

结束 类

类 Mower
	变量 x: 单精度小数=0f
	变量 启动 : 逻辑型=假
	变量 xv : 单精度小数=0f
	变量 type : 整数=0
	变量 row : 整数=0
	变量 anim : Anim
	变量 gm : 窗口管理器=空
	变量 销毁: 逻辑型=假
	变量 scale : 单精度小数=0.9f
	变量 击杀数 : 整数=0

	@静态
	方法 create(type : 整数=0,row : 整数=0,gm : 窗口管理器) : Mower
		变量 mower : Mower
		mower.type=type
		mower.row=row
		mower.gm=gm
		如果 mower.type==0 则
			mower.anim=Anim.创建动画("LawnMower",gm)
			mower.anim.播放动画("anim_normal")
			mower.anim.暂停=真
		否则 mower.type==1
			mower.anim=Anim.创建动画("PoolCleaner",gm)
			mower.anim.播放动画("anim_landsuck")
			mower.anim.暂停=真
		否则 mower.type==2
			mower.anim=Anim.创建动画("RoofCleaner",gm)
			mower.anim.暂停=真
		结束 如果
		返回 mower
	结束 方法

	方法 y() : 单精度小数
		返回 gm.gety(row,x)-gm.取行高()+35
	结束 方法

	方法 Update() : 逻辑型
		如果 启动 则
			x=x+xv
		结束 如果
		如果 x>1400 则
			返回 真
		结束 如果
		循环(i, 0, gm.zombieList.长度)
			变量 zombie : Zombie=gm.zombieList.取成员(i)
			如果 zombie.row==row&&碰上(zombie) 则
				zombie.推()
				击杀数=击杀数+1
				如果 启动==假 则
					anim.暂停=假
					启动=真
					xv=3
					(gm.禁出行)[row]=3000
				否则 击杀数>5
					xv=2
				结束 如果
			结束 如果
		结束 循环
		返回 假
	结束 方法

	方法 碰上(zombie : Zombie) : 逻辑型
		如果 x<zombie.x&&zombie.x<x+50 则
			返回 真
		结束 如果
		返回 假
	结束 方法
结束 类

类 Plant
	变量 HP : 整数
	变量 HPM : 整数
	变量 type : 整数
	变量 anim : Anim[]
	变量 x : 单精度小数=0f
	变量 y : 单精度小数=0f
	变量 scale : 单精度小数=1f
	变量 row : 整数=-1
	变量 line : 整数=-1
	变量 dtime : 整数=0
	变量 dtimemax : 整数
	变量 发射延迟 : 整数
	变量 cv : 矩形x
	变量 可发射 : 逻辑型
	变量 color : 整数
	变量 旋转度数 : 单精度小数=0f
	变量 旋转速度 : 单精度小数=0f
	变量 无敌 : 逻辑型
	变量 无视 : 逻辑型
	变量 state : 文本
	//2025.8.15
	变量 遇到僵尸 : 逻辑型=假

	变量 管理器 : 窗口管理器

	@静态
	方法 create(manager : 窗口管理器,row : 整数,line : 整数,type : 整数) : Plant
		变量 plant : Plant
		plant.type=type
		plant.HP=300
		plant.row=row
		plant.line=line
		plant.x=260+80*line
		plant.y=manager.gety(row,plant.x)-manager.取行高()
		plant.管理器=manager
		plant.setC(45,40,25,50)
		如果 type==0 则
			变量 posw : POS
			posw.置值()
			posw.x=-38
			posw.y=-48
			变量 anim_head : Anim=Anim.创建动画("PeaShooterSingle",manager).播放动画("anim_head_idle")
			anim_head.speed=0.5f
			变量 anim=Anim.创建动画("PeaShooterSingle",manager).播放动画("anim_idle").代理("anim_stem",anim_head,posw)
			//日志(anim.startframe+"   "+anim.maxframe)
			anim.speed=Zombie.tool_getrandom()*0.5f
			plant.anim={anim}

			plant.dtimemax=150
			plant.dtime=取随机数(80,120)
			plant.发射延迟=30
			/*
			如果 取随机数(0,100)<50 则
				plant.anim.播放动画("anim_walk")
			否则
				plant.anim.播放动画("anim_walk2")
			结束 如果
			变量 speed : 单精度小数=取随机数(700,1300)/1000f*0.25f
			//plant.anim.强制显示(文本集集到文本集({plant_screen_hand,plant_flag_hand,plant_duckytube,plant_screen,plant_cone,plant_bucket,plant_mustache}),-1,真)
			*/
		否则 type==1
			变量 animw=Anim.创建动画("SunFlower",manager).播放动画("anim_idle")
			//变量 文本集合 : 文本集合=文件操作.取子文件列表("/storage/emulated/0/.pvz/pvz/compiled/reanim/finished_xml/")
			//日志(文本集合到文本(文本集合,"\n"))
			animw.speed=Zombie.tool_getrandom()*0.5f
			plant.anim={animw}
			plant.dtimemax=取随机数(2350,2500)
			plant.dtime=取随机数(300,1250)
		否则 type==2
			变量 animw=Anim.创建动画("CherryBomb",manager).播放动画("anim_explode")
			animw.播完暂停=真
			plant.anim={animw}
			plant.HP=1800
			plant.无敌=真
		否则 type==3
			变量 animw=Anim.创建动画("Wallnut",manager).播放动画("anim_idle")
			plant.anim={animw}
			plant.HP=4000
			animw.speed=0.5f
		否则 type==4

			变量 animw=Anim.创建动画("PotatoMine",manager).播放动画("anim_idle")
			animw.speed=Zombie.tool_getrandom()*0.5f
			plant.anim={animw}
			plant.scale=0.8f
			plant.动画移位(0,20)
			plant.dtime=1500
		否则 type==5
			变量 posw : POS
			posw.置值()
			posw.x=-38
			posw.y=-48
			变量 anim_head : Anim=Anim.创建动画("SnowPea",manager).播放动画("anim_head_idle")
			anim_head.speed=0.5f
			变量 anim=Anim.创建动画("SnowPea",manager).播放动画("anim_idle").代理("anim_stem",anim_head,posw)
			//日志(anim.startframe+"   "+anim.maxframe)
			anim.speed=Zombie.tool_getrandom()*0.5f
			plant.anim={anim}
			plant.dtimemax=150
			plant.dtime=取随机数(80,120)
			plant.发射延迟=30
		否则 type==6
			变量 animw=Anim.创建动画("Chomper",manager).播放动画("anim_idle")
			animw.speed=Zombie.tool_getrandom()*0.5f
			plant.anim={animw}
		否则 type==7
			变量 posw : POS
			posw.置值()
			posw.x=-38
			posw.y=-48
			变量 anim_head : Anim=Anim.创建动画("PeaShooter",manager).播放动画("anim_head_idle")
			变量 animw=Anim.创建动画("PeaShooter",manager).播放动画("anim_idle").代理("anim_stem",anim_head,posw)
			//变量 animw=Anim.创建动画("Chomper",manager).播放动画("anim_idle")
			animw.speed=Zombie.tool_getrandom()*0.5f
			plant.anim={animw}
			plant.dtimemax=150
			plant.dtime=取随机数(80,120)
		否则 type==8
			变量 animw=Anim.创建动画("Puffshroom",manager).播放动画("anim_idle")
			//变量 animw=Anim.创建动画("Chomper",manager).播放动画("anim_idle")
			animw.speed=Zombie.tool_getrandom()*0.5f
			plant.anim={animw}
			plant.dtimemax=150
			plant.dtime=取随机数(0,plant.dtimemax)
		否则 type==9
			变量 animw=Anim.创建动画("SunShroom",manager).播放动画("anim_idle")
			animw.speed=Zombie.tool_getrandom()*0.5f
			plant.anim={animw}
		否则 type==10
			变量 animw=Anim.创建动画("Fumeshroom",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==11
			变量 animw=Anim.创建动画("Gravebuster",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==12
			变量 animw=Anim.创建动画("Hypnoshroom",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==13
			变量 animw=Anim.创建动画("ScaredyShroom",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==14
			变量 animw=Anim.创建动画("Iceshroom",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==15
			变量 animw=Anim.创建动画("DoomShroom",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==16
			变量 animw=Anim.创建动画("Lilypad",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==17
			变量 animw=Anim.创建动画("Squash",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==18
			变量 animw=Anim.创建动画("ThreePeater",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==19
			变量 animw=Anim.创建动画("Tanglekelp",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==20
			变量 animw=Anim.创建动画("Jalapeno",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==21
			变量 animw=Anim.创建动画("Caltrop",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==22
			变量 animw=Anim.创建动画("Torchwood",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==23
			变量 animw=Anim.创建动画("Tallnut",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==24
			变量 animw=Anim.创建动画("SeaShroom",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==25
			变量 animw=Anim.创建动画("Plantern",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==26
			变量 animw=Anim.创建动画("Cactus",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==27
			变量 animw=Anim.创建动画("Blover",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==28
			变量 animw=Anim.创建动画("SplitPea",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==29
			变量 animw=Anim.创建动画("Starfruit",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==30
			变量 animw=Anim.创建动画("Pumpkin",manager).播放动画("anim_idle")
			plant.HP=4000
			animw.speed=0.5f
			plant.anim={animw}

		否则 type==31
			变量 animw=Anim.创建动画("Magnetshroom",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==32
			变量 animw=Anim.创建动画("Cabbagepult",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==33
			变量 animw=Anim.创建动画("Pot",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==34
			变量 animw=Anim.创建动画("Cornpult",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==35
			变量 animw=Anim.创建动画("Coffeebean",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==36
			变量 animw=Anim.创建动画("Garlic",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==37
			变量 animw=Anim.创建动画("Umbrellaleaf",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==38
			变量 animw=Anim.创建动画("Marigold",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==39
			变量 animw=Anim.创建动画("Melonpult",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==40
			变量 animw=Anim.创建动画("GatlingPea",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==41
			变量 animw=Anim.创建动画("TwinSunflower",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==42
			变量 animw=Anim.创建动画("GloomShroom",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==43
			变量 animw=Anim.创建动画("Cattail",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==44
			变量 animw=Anim.创建动画("WinterMelon",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==45
			变量 animw=Anim.创建动画("GoldMagnet",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==46
			变量 animw=Anim.创建动画("SpikeRock",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==47
			变量 animw=Anim.创建动画("TangleKelp",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==48
			变量 animw=Anim.创建动画("Imitater",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==49
			变量 animw=Anim.创建动画("TangleKelp",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==50
			变量 animw=Anim.创建动画("TangleKelp",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==51
			变量 animw=Anim.创建动画("TangleKelp",manager).播放动画("anim_idle")
			plant.anim={animw}
		否则 type==52
			变量 animw=Anim.创建动画("TangleKelp",manager).播放动画("anim_idle")
			plant.anim={animw}
		结束 如果
		plant.HPM=plant.HP
		返回 plant
	结束 方法

	方法 Update() : 逻辑型

		如果 HP<=0 则
			返回 真
		结束 如果

		如果 type==0||type==5||type==7||type==8 则

			/*
			如果 (可发射&&dtime==dtimemax-发射延迟) 则
				可发射=假
				变量 tp="ProjectilePea"
				如果 type==5 则
					tp="ProjectileSnowPea"
				结束 如果
				管理器.projList.添加成员(Proj.create(管理器,tp,row,x()+50,y+15+取随机数(0,10)-5))
			结束 如果
			如果 (可发射==假&&dtime<=0)||(可发射&&dtime==dtimemax-发射延迟) 则
				循环(i, 0, 管理器.zombieList.长度)
					变量 zombie=(管理器.zombieList)[i]
					如果 zombie.无形==假&&zombie.row==row&&zombie.x()>x() 则
						变量 anim_head=anim[0].panims.名称("anim_stem")
						如果 dtime<=0&&anim_head.动画回归=="" 则
							dtime=dtimemax
							anim_head.播放动画("anim_shooting",真)
							可发射=真
						结束 如果
					结束 如果
				结束 循环
			结束 如果
			dtime=dtime-1
			*/
			变量 pd=判定僵尸()
			//如果 pd!=空 则
			如果 type==0||type==5||type==7||type==8 则
				变量 anim_head : Anim=空
				如果 type==0||type==5||type==7 则
					anim_head=anim[0].panims.名称("anim_stem")
				否则 type==8
					anim_head=anim[0]
				结束 如果
				如果 (dtime==30||(dtime==0&&type==7))&&pd!=空 则

					anim_head.speed=1f
					如果 type==7 则
						anim_head.speed=1.8f
					结束 如果
					变量 fr=anim_head.animname
					如果 anim_head.动画回归!="" 则
						fr=anim_head.动画回归
					结束 如果
					anim_head.播放动画("anim_shooting",真)
					anim_head.动画回归=fr
					可发射=真
				否则 （dtime==1||(dtime==130&&type==7))&&可发射
					shoot()
					如果 (type==7&&dtime==15)==假 则
						可发射=假
					结束 如果
				结束 如果
				如果 anim_head.animname!="anim_shooting" 则
					anim_head.speed=0.5f
				结束 如果
			结束 如果
			如果 可发射||pd!=空 则
				dtime=dtime-1
				如果 dtime<0 则
					dtime=dtimemax
				结束 如果
			结束 如果
		否则 type==1
			如果 dtime<=0 则
				变量 sunt : Coin=Coin.create(管理器,sun,x()+50,y)
				sunt.yv=-2f
				sunt.ya=0.04f
				sunt.xv=double2float(取随机小数(-0.5f,0.5f))
				sunt.最左x=x()-50
				sunt.最右x=x()+50
				sunt.最低y=y+50
				管理器.coinList.添加成员(sunt)
				dtime=dtimemax
			否则
				dtime=dtime-1
			结束 如果
		否则 type==2
			如果 anim[0].暂停 则
				管理器.particleList.添加成员(Particle.新建("Powie",x(),y(),row,管理器))
				变量 ux=x+cv.x
				变量 uy=y+cv.y
				循环(i, 0, 管理器.zombieList.长度)
					变量 zombie : Zombie=(管理器.zombieList)[i]
					变量 zomx : 单精度小数=zombie.x+cv.x+cv.w/2
					变量 zomy : 单精度小数=zombie.y+cv.y+cv.y/2
					变量 半径 : 整数=140
					如果 ux-半径<zomx&&zomx<ux+半径&&(uy-半径<zomy&&zomy<uy+半径) 则
						zombie.damage(1800,1)
					结束 如果
				结束 循环
				返回 真
			结束 如果
		否则 type==3
			如果 HP<HPM*1/3 则
				anim[0].代理图片("anim_face","IMAGE_REANIM_"+"Wallnut_cracked2".到大写())
			否则 HP<HPM*2/3
				anim[0].代理图片("anim_face","IMAGE_REANIM_"+"Wallnut_cracked1".到大写())
			否则
				anim[0].代理图片("anim_face","IMAGE_REANIM_WALLNUT_BODY")
			结束 如果
		否则 type==4
			如果 state=="boom" 则
				scale=1.2f
				变量 ux=x+cv.x
				变量 uy=y+cv.y
				循环(i, 0, 管理器.zombieList.长度)
					变量 zombie : Zombie=(管理器.zombieList)[i]
					变量 zomx : 单精度小数=zombie.x+cv.x+cv.w/2
					变量 zomy : 单精度小数=zombie.y+cv.y+cv.y/2
					变量 半径 : 整数=100
					如果 ux-半径<zomx&&zomx<ux+半径&&(uy-半径<zomy&&zomy<uy+半径) 则
						zombie.damage(1800,3)
					结束 如果
				结束 循环
				无视=真
				anim[0].播放动画("anim_mashed").暂停=真
				anim[0].禁止演化=真
				state="dying"
				dtime=300
			结束 如果
			如果 dtime==0 则
				如果 state=="dying" 则
					返回 真
				否则
					anim[0].播放动画("anim_rise")
					anim[0].动画回归="anim_armed"
					无敌=真
				结束 如果
			否则 dtime<0
				如果 anim[0].动画回归=="" 则
					state="idle"
				结束 如果
			结束 如果
			dtime=dtime-1
		否则 type==6
			变量 pd=判定僵尸()
			//如果 (dtime<=0) 则
			如果 pd!=空&&(dtime<=0)&&anim[0].animname=="anim_idle" 则
				anim[0].speed=anim[0].speed*2
				state="bite"
				anim[0].播放动画("anim_bite")
				anim[0].播完暂停=真

			否则 anim[0].animname=="anim_bite"&&anim[0].frame>=42&&state=="bite"
				state="chew"

				如果 pd==空 则

				否则

					dtime=4340
					pd.die=真
				结束 如果
			否则 anim[0].animname=="anim_bite"&&anim[0].暂停
				anim[0].speed=0.5f
				anim[0].播完暂停=假
				如果 dtime==0 则
					变量 fr=anim[0].frame
					anim[0].播放动画("anim_idle")
					//anim[0].speed=anim[0].speed/2
					anim[0].过渡从(fr.到整数(),4)
				否则
					anim[0].播放动画("anim_chew")
				结束 如果
			否则 dtime<=0&&anim[0].animname=="anim_chew"
				state="swall"
				anim[0].播放动画("anim_swallow")
				anim[0].动画回归="anim_idle"
				//anim[0].speed=anim[0].speed*2
			结束 如果
			如果 dtime>0 则
				dtime=dtime-1
			否则
				dtime=0
			结束 如果
			//否则
			//结束 如果
		否则 type==30
			如果 HP<HPM*1/4 则
				anim[0].代理图片("Pumpkin_front","IMAGE_REANIM_"+"Pumpkin_damage3".到大写())
			否则 HP<HPM*2/4
				anim[0].代理图片("Pumpkin_front","IMAGE_REANIM_"+"Pumpkin_damage2".到大写())
			否则 HP<HPM*3/4
				anim[0].代理图片("Pumpkin_front","IMAGE_REANIM_"+"Pumpkin_damage1".到大写())
			否则
				anim[0].代理图片("Pumpkin_front","IMAGE_REANIM_"+"Pumpkin_front".到大写())
			结束 如果
		结束 如果
		返回 假
	结束 方法

	方法 shoot()
		变量 ox=50
		变量 oy=16+取随机数(0,5)-5
		变量 tp="ProjectilePea"
		如果 type==5 则
			tp="ProjectileSnowPea"
		否则 type==8
			tp="PuffShroom_puff1"
			oy=45
			管理器.particleList.添加成员(Particle.新建("PuffShroomMuzzle",x()+50,y()+45,row,管理器))
		结束 如果
		管理器.projList.添加成员(Proj.create(管理器,tp,row,x()+ox,y+oy))
	结束 方法

	方法 判定僵尸() : Zombie
		变量 rlt : Zombie=空
		循环(i, 0, 管理器.zombieList.长度)
			变量 zombie=(管理器.zombieList)[i]
			如果 zombie.无形==假&&zombie.row==row&&zombie.x()>x()-50&&(rlt==空||zombie.x()<rlt.x()) 则
				rlt=zombie
			结束 如果
		结束 循环
		如果 type==6&&rlt!=空&&rlt.x()>x()+120 则
			返回 空
		结束 如果
		如果 type==8&&rlt!=空&&rlt.x()>x()+300 则
			返回 空
		结束 如果
		返回 rlt
	结束 方法

	方法 动画移位(xn : 单精度小数,yn : 单精度小数)
		x=x+xn
		y=y+yn
		cv.x=cv.x-xn
		cv.y=cv.y-yn
	结束 方法

	方法 setC(xw : 单精度小数,yw : 单精度小数,w : 单精度小数,h : 单精度小数)
		cv.x=xw
		cv.y=yw
		cv.w=w
		cv.h=h
	结束 方法

	方法 x() : 单精度小数
		返回 x
	结束 方法

	方法 y() : 单精度小数
		返回 y
	结束 方法

	方法 取信息() : STSL
		变量 stsl : STSL
		stsl.add("HP",HP.到文本())
		stsl.add("type",type.到文本())
		stsl.add("anim.name",anim[0].名称)
		stsl.add("anim.frame",anim[0].frame.到文本())
		stsl.add("anim.speed",anim[0].speed.到文本())
		stsl.add("anim.return",anim[0].动画回归)
		stsl.add("x",x().到文本())
		stsl.add("y",y.到文本())
		stsl.add("row",row.到文本())
		stsl.add("line",line.到文本())
		stsl.add("dtime",dtime.到文本())
		stsl.add("dtimemax",dtimemax.到文本())
		stsl.add("delayt",发射延迟.到文本())
		stsl.add("shable",可发射.到文本())
		stsl.add("state",state)
		返回 stsl
	结束 方法
结束 类

类 Proj
	变量 x : 单精度小数=0f
	变量 y : 单精度小数=0f
	变量 xv : 单精度小数=0f
	变量 yv : 单精度小数=0f
	变量 xa : 单精度小数=0f
	变量 ya : 单精度小数=0f
	变量 type : 文本
	变量 管理器 : 窗口管理器=空
	变量 tps : 文本
	变量 row : 整数
	变量 reanproj : 文本[]={"Melonpult_melon","WinterMelon_projectile"}
	变量 imgproj : 文本[]={"ProjectileCactus","ProjectilePea","ProjectileSnowPea","Projectile_star"}
	变量 damage : 整数
	变量 splash : 单精度小数=0f
	变量 effect : 整数=0
	变量 scale : 单精度小数=1f

	@静态
	方法 create(manager : 窗口管理器,type : 文本,row : 整数,横坐标 : 单精度小数,纵坐标 : 单精度小数) : Proj
		变量 proj : Proj
		proj.管理器=manager
		proj.x=横坐标
		proj.y=纵坐标+double2float(取随机小数(-5f,5f))
		proj.xv=4f
		proj.setType(type)
		proj.row=row
		返回 proj
	结束 方法

	方法 setType(tp : 文本) : Proj
		type=tp
		如果 文本属于文本集(reanproj,tp) 则
			tps="reanim"
		否则 type=="ProjectilePea"
			tps="image"
			damage=20
		否则 type=="ProjectileSnowPea"
			tps="image"
			damage=20
			effect=500
		否则 type=="PuffShroom_puff1"
			damage=20
			tps="image"
			scale=0f
		结束 如果
		返回 本对象
	结束 方法

	方法 Update() : 逻辑型
		如果 x<0||x>1400||y<0||y>600 则
			返回 真
		结束 如果
		如果 type=="PuffShroom_puff1"&&scale<1f 则
			scale=scale+0.05f
		否则
			scale=1
		结束 如果
		x=x+xv
		y=y+yv
		xv=xv+xa
		yv=yv+ya
		循环(i, 0, 管理器.zombieList.长度)
			变量 zombie=(管理器.zombieList)[i]
			如果 zombie.row==row 则
				如果 zombie.cv.判定x(x+20,zombie.x(),0)&&zombie.无形==假 则
					如果 type=="ProjectileSnowPea" 则
						zombie.damage(damage,2)
					否则
						zombie.damage(damage,0)
						管理器.particleList.添加成员(Particle.新建("PeaSplat",x,y,row,管理器))
					结束 如果
					返回 真
				结束 如果
			结束 如果
		结束 循环
		返回 假
	结束 方法

结束 类

类 Coin
	变量 x : 单精度小数=0f
	变量 dx : 单精度小数=0f
	变量 y : 单精度小数=0f
	变量 dy :单精度小数=0f
	变量 xv : 单精度小数=0f
	变量 yv : 单精度小数=0f
	变量 ya : 单精度小数=0f
	变量 cv : 矩形x
	变量 管理器 : 窗口管理器=空
	变量 type : 整数
	变量 anim : Anim
	变量 最左x : 单精度小数=-1713f
	变量 最右x : 单精度小数=-1713f
	变量 最低y : 单精度小数=-1713f
	变量 旋转度数 : 单精度小数=0f
	变量 旋转速度 : 单精度小数=0f
	变量 状态倒计时 : 整数=0
	变量 状态 : 整数=0
	变量 sx : 单精度小数=1f
	变量 sy : 单精度小数=1f
	变量 初始y : 单精度小数=0f

	@静态
	方法 create(manager : 窗口管理器,type : 整数,横坐标 : 单精度小数,纵坐标 : 单精度小数) : Coin
		变量 coin : Coin
		coin.管理器=manager
		coin.type=type
		coin.cv()
		如果 type==sun 则
			coin.anim=Anim.创建动画("Sun",manager).播放动画("Sun1").禁止回演化(真)
			coin.anim.speed=0.5f
		否则 type==silver_coin
			coin.anim=Anim.创建动画("Coin_silver",manager)
		否则 type==gold_coin
			coin.anim=Anim.创建动画("Coin_gold",manager)
		否则 type==lawnmower
			coin.anim=Anim.创建动画("LawnMower",manager).播放动画("anim_normal")
			coin.sx=0.75f
			coin.sy=coin.sx
			coin.动画移位(-30,0)
		否则 type==plantcard
			coin.初始y=纵坐标
			coin.yv=-2.5f
			coin.ya=0.05f
		结束 如果
		coin.x=横坐标
		coin.y=纵坐标
		返回 coin
	结束 方法

	方法 动画移位(xn : 单精度小数,yn : 单精度小数)
		x=x+xn
		y=y+yn
		cv.x=cv.x-xn
		cv.y=cv.y-yn
	结束 方法

	//2025.3.15
	方法 cv(wh : 整数=25)
		cv.x=-1*wh
		cv.y=-1*wh
		cv.w=wh*2
		cv.h=wh*2
	结束 方法

	方法 x() : 单精度小数
		返回 x+dx
	结束 方法

	方法 y() : 单精度小数
		返回 y+dy
	结束 方法

	方法 Update() : 逻辑型
		x=x+xv
		y=y+yv
		yv=yv+ya
		旋转度数=旋转度数+旋转速度
		如果 旋转度数<0 则
			旋转度数=旋转度数+360f
		否则 旋转度数>360f
			旋转度数=旋转度数-360f
		结束 如果
		如果 最低y<y&&最低y!=-1713f 则
			y=最低y
			xv=0f
		结束 如果
		如果 x<最左x&&最左x!=-1713f 则
			x=最左x
		结束 如果
		如果 最右x<x&&最右x!=-1713f 则
			x=最右x
		结束 如果
		如果 type==sun 则
			如果 (cv.move||cv.click)&&状态==0 则
				管理器.suncount=管理器.suncount+25
				管理器.收集阳光(本对象)
				状态=1
			否则 状态==1
				状态倒计时=状态倒计时+1
				如果 状态倒计时>100 则
					返回 真
				结束 如果
				dx=(-管理器.x-x+50)*状态倒计时/100
				dy=(-管理器.y-y+50)*状态倒计时/100
				如果 状态倒计时>80 则
					anim.真值渲染(,{1f,1f,1f,(100-状态倒计时)/20f})
				结束 如果
				//日志(x().到文本())
			结束 如果
		否则 type==plantcard
			如果 y>初始y 则
				y=初始y
				yv=0
				ya=0
			结束 如果
			如果 (cv.move||cv.click)&&状态==0 则
				管理器.过关(本对象)
				状态=1
			否则 状态==1
				状态倒计时=状态倒计时+1
				如果 状态倒计时>500 则
					返回 真
				结束 如果

				//日志(x().到文本())
			结束 如果
		结束 如果
		返回 假
	结束 方法

结束 类

@全局类
@静态
类 static

	@静态
	常量 silver_coin : 整数=0
	@静态
	常量 gold_coin : 整数=1
	@静态
	常量 diamond : 整数=2
	@静态
	常量 sun : 整数=3
	@静态
	常量 lawnmower : 整数=21
	@静态
	常量 dustcatcher : 整数=22
	@静态
	常量 plantcard : 整数=23
	@静态
	常量 zombie_mowered : 整数=24
	@静态
	常量 zombie_charred : 整数=0
	@静态
	常量 zombie_arm : 整数=1
	@静态
	常量 zombie_head : 整数=2
	@静态
	常量 usf : 单精度小数=-1713f

结束 类

类 Tracle
	变量 x : 单精度小数=0f
	变量 y : 单精度小数=0f
	变量 xv : 单精度小数=0f
	变量 yv : 单精度小数=0f
	变量 xa : 单精度小数=0f
	变量 ya : 单精度小数=0f
	变量 r : 单精度小数=0f
	变量 rv : 单精度小数=0f
	变量 minx : 单精度小数=usf
	变量 maxx : 单精度小数=-1713f
	变量 maxy : 单精度小数=-1713f
	变量 管理器 : 窗口管理器=空
	变量 type : 整数
	变量 anim : Anim=空
	变量 rotate : 单精度小数=0f
	变量 dtime : 整数
	变量 dtimemax : 整数
	变量 state : 文本



	@静态
	方法 create(manager : 窗口管理器,type : 整数,横坐标 : 单精度小数,纵坐标 : 单精度小数) : Tracle
		变量 tracle : Tracle
		tracle.管理器=manager
		tracle.type=type
		如果 type==zombie_charred 则
			tracle.anim=Anim.创建动画("Zombie_charred",manager)
			tracle.anim.播完暂停=真
			tracle.anim.禁止回演化=真
			tracle.dtime=50
		否则 type==zombie_head

		否则 type==zombie_arm


		结束 如果
		tracle.x=横坐标
		tracle.y=纵坐标
		tracle.dtimemax=tracle.dtime
		返回 tracle
	结束 方法

	方法 Update() : 逻辑型
		x=x+xv
		y=y+yv
		xv=xv+xa
		yv=yv+ya
		r=r+rv
		如果 maxy<y&&maxy!=usf 则
			y=maxy
			如果 type==-1 则
				yv=-0.5f
				ya=0.01f
			结束 如果
		结束 如果
		如果 type==zombie_charred 则
			如果 anim.暂停 则
				返回 透明化()
			结束 如果
		否则 type==-1
			如果 state=="dido" 则
				返回 透明化()
			否则
				如果 dtime<=0 则
					state="dido"
					setdt(20)
				否则
					dtime=dtime-1
				结束 如果
			结束 如果
		否则 type==zombie_mowered
			如果 anim.暂停==真 则
				返回 真
			结束 如果
		结束 如果
		返回 假
	结束 方法

	方法 setdt(dt : 整数) : Tracle
		dtime=dt
		dtimemax=dt
		返回 本对象
	结束 方法

	方法 透明化() : 逻辑型
		如果 dtime<=0 则
			返回 真
		否则
			dtime=dtime-1
			anim.真值渲染(,{1f,1f,1f,dtime*1f/dtimemax})
		结束 如果
		返回 假
	结束 方法

结束 类

//2025.7.26
类 Particle
	变量 parts : 粒子集合
	变量 x : 单精度小数
	变量 y : 单精度小数
	//特效已存在的时长
	变量 dtime : 整数
	//特效的存在时长
	变量 dtimemax : 整数
	变量 type : 文本
	变量 循环播放 : 逻辑型=假
	变量 row : 整数
	变量 管理器 : 窗口管理器=空
	变量 颜色渲染保护 : 逻辑型=假

	@静态
	方法 新建(type : 文本,x : 单精度小数,y : 单精度小数,row : 整数=-1,gm : 窗口管理器) : Particle
		变量 prt : Particle
		prt.row=row
		prt.x=x
		prt.y=y
		prt.type=type
		prt.管理器=gm
		如果 type=="PeaSplat" 则
			变量 dt=20
			prt.dtime=0
			prt.dtimemax=dt
			变量 lz : 粒子=粒子.新建(,,,,,)
			lz.pic="pea_splats"
			lz.setdtime(dt)
			lz.cutn=4
			lz.轮播=真
			prt.parts.添加成员(lz)
			循环(i, 0, 取随机数(6,10))
				变量 lzb : 粒子=粒子.新建(,,,,,)
				lzb.pic="Pea_particles"
				lzb.setdtime(dt)
				lzb.cutn=3
				lzb.cutp=取随机数(0,2)
				变量 缩放=随机单精度小数(0.8f,1.2f)
				lzb.scale="0-"+缩放+" 80-"+缩放+" 100-0"
				lzb.alpha="0-1 80-1 100-0"
				//日志("zzzzz   "+lzb.scale.到文本())

				变量 speed=double2float(取随机小数(1.5f,1.8f))
				变量 dir=数学运算.角度转弧度(取随机数(0,359))
				lzb.xv=speed*double2float(数学运算.求余弦(dir))
				lzb.yv=speed*double2float(数学运算.求正弦(dir))
				lzb.ya=0.15f
				lzb.xf=粒子.全值(0.1f)
				lzb.yf=粒子.全值(0.1f)

				prt.parts.添加成员(lzb)
			结束 循环
		否则 type=="Powie"
			变量 dt=100
			prt.颜色渲染保护=真
			prt.dtime=0
			prt.dtimemax=dt
			变量 count=10

			//PowieBigClouds
			循环(i, 0, count)
				变量 lzb : 粒子=粒子.新建(,,,,,)
				lzb.pic="ExplosionCloud"
				lzb.setdtime(dt)
				变量 alpha=(i*10f/count+60f).到文本()
				变量 缩放=随机单精度小数(1.2f,1.6f)
				lzb.scale="0-"+缩放+" 60-"+缩放+" 100-0"

				lzb.red=粒子.全值(1)
				lzb.green="0-0.9 100-0.4"
				lzb.blue=粒子.全值(0)
				lzb.alpha="0-1 "+alpha+"-1 100-0"
				//日志("zzzzz   "+lzb.scale.到文本())
				lzb.rotate=随机单精度小数(0,359)
				lzb.spinspeed=随机单精度小数(-2,2)
				变量 speed=2
				变量 dir=数学运算.角度转弧度(取随机数(0,359))
				lzb.xv=speed*double2float(数学运算.求余弦(dir))
				lzb.yv=speed*double2float(数学运算.求正弦(dir))
				lzb.xf="0-0.1 40-0.1 100-1"
				lzb.yf="0-0.28 40-0.28 100-1"

				prt.parts.添加成员(lzb)
			结束 循环
			count=14
			//PowieSmallClouds
			循环(i, 0, count)

				变量 lzb : 粒子=粒子.新建(,,,,,)
				lzb.pic="ExplosionCloud"
				lzb.setdtime(dt)
				//变量 缩放=随机单精度小数(0.8f,1.2f)

				lzb.red=粒子.全值(1)
				lzb.green="0-0.7 100-0"
				lzb.blue=粒子.全值(0)
				变量 alpha=(i*50f/count+25f)
				lzb.alpha="0-1 "+alpha.到文本()+"-1 "+(alpha+24f).到文本()+"-0"
				//日志("zzzzz   "+lzb.scale.到文本())
				lzb.scale="0-0.5 60-0.5 100-0"
				lzb.rotate=随机单精度小数(0,359)
				lzb.spinspeed=随机单精度小数(-2,2)
				变量 speed=5
				变量 dir=数学运算.角度转弧度(取随机数(0,359))
				lzb.xv=speed*double2float(数学运算.求余弦(dir))
				lzb.yv=speed*double2float(数学运算.求正弦(dir))
				lzb.xf="0-0.15 40-0.15 100-1"
				lzb.yf="0-0.25 40-0.25 100-1"

				prt.parts.添加成员(lzb)
			结束 循环
			变量 lz : 粒子=粒子.新建(-70,-70,,,,)
			lz.pic="ExplosionPowie"
			lz.setdtime(70)
			prt.parts.添加成员(lz)
		否则 type=="DancerRise"
			变量 dt=200
			prt.dtime=0
			prt.dtimemax=dt
			//DancerDirtClumps

			循环(i, 0, 14)
				变量 lzb : 粒子=粒子.新建(,,,,,)
				lzb.pic="dirtbig"
				lzb.setdtime(dt)
				lzb.alpha="0-1 100-1"
				//日志("zzzzz   "+lzb.scale.到文本())
				变量 scale=随机单精度小数(0.7f,0.9f)
				lzb.scale="0-0 10-"+scale+" 100-"+scale
				lzb.x=随机单精度小数(-30f,30f)
				lzb.y=随机单精度小数(-5f,5f)
				lzb.shake=2.5f
				lzb.cutn=4
				lzb.row=2
				lzb.cutp=取随机数(0,7)
				prt.parts.添加成员(lzb)
			结束 循环
			变量 count=40
			//DancerDirtSplash
			循环(i, 0, count)
				变量 lzb : 粒子=粒子.新建(,,,,,)
				lzb.pic="dirtsmall"
				lzb.setdtime(dt)
				变量 开始时间 : 单精度小数=(i*1f/count)*0.6f*100+2
				变量 结束时间=开始时间+40
				lzb.alpha="0-0 "+(开始时间-1).到文本()+"-0 "+开始时间+"-1 "+结束时间+"-1 "+(结束时间+1).到文本()+"-0"+" 100-0"
				lzb.starte=开始时间*dt/100
				lzb.ende=结束时间*dt/100
				lzb.x=随机单精度小数(-5f,5f)
				lzb.xv=随机单精度小数(-0.5f,0.5f)
				lzb.yv=-1.5f
				lzb.ya=0.03f
				lzb.shake=0.1f
				lzb.scale=粒子.全值(0.65f)
				lzb.cutn=8
				lzb.row=2
				lzb.cutp=取随机数(0,15)
				prt.parts.添加成员(lzb)
			结束 循环
		否则 type=="SodRoll"
			prt.dtime=0
			prt.dtimemax=200
			变量 dt=50
			循环(i, 0, 100)
				变量 lzb : 粒子=粒子.新建(,,,,,)
				lzb.pic="dirtsmall"
				lzb.setdtime(dt)
				lzb.存活倒计时=dt
				lzb.激活倒计时=(i*1.5f).到整数()
				lzb.alpha="0-1 80-1 100-0"
				lzb.x=0
				lzb.y=随机单精度小数(0,50f)
				lzb.xv=随机单精度小数(-1f,0)
				lzb.yv=-1.5f
				lzb.ya=0.03f
				lzb.shake=0.1f
				lzb.scale=粒子.全值(1f)
				lzb.cutn=8
				lzb.row=2
				lzb.cutp=取随机数(0,15)
				prt.parts.添加成员(lzb)
			结束 循环
		否则 type=="PuffShroomMuzzle"
			prt.dtime=0
			prt.dtimemax=20
			变量 dt=20
			循环(i, 0, 取随机数(6,8))
				变量 lzb : 粒子=粒子.新建(,,,,,)
				lzb.pic="PuffShroom_puff2"
				lzb.setdtime(dt)
				变量 alpha=随机单精度小数(0.3f,0.8f)
				lzb.alpha="0-"+alpha+" 80-"+alpha+" 100-0"
				lzb.x=随机单精度小数(2,4)
				lzb.y=随机单精度小数(-3,2)
				lzb.xv=随机单精度小数(1f,0)
				lzb.yv=随机单精度小数(-1f,1f)
				lzb.ya=0.03f
				变量 s1=随机单精度小数(0.2f,0.3f)
				变量 s2=随机单精度小数(0.6f,0.8f)
				lzb.scale="0-"+s1+" 70-"+s2+" 100-0"
				prt.parts.添加成员(lzb)
			结束 循环
			//PuffShroom_puff2
		否则 type=="PuffShroomTrail"

		结束 如果
		返回 prt
	结束 方法


	方法 Update() : 逻辑型
		如果 type=="SodRoll" 则
			x=220+管理器.动画进度
		结束 如果
		如果 dtime>=dtimemax 则
			返回 真
		结束 如果
		循环(i, 0, parts.长度)

			//开始俘获异常()
			变量 hu : 整数=parts.长度-i-1

			如果 parts[hu].Update()==真 则
				clear(parts[hu])
				parts.删除成员(hu)
			结束 如果
			//俘获所有异常()
			//结束俘获异常()
		结束 循环
		dtime=dtime+1
		返回 假
	结束 方法

结束 类

类 粒子集合 : 集合模板类<粒子>
结束 类

//2025.7.26
类 粒子
	变量 x : 单精度小数=0f
	变量 y : 单精度小数=0f
	变量 xv : 单精度小数=0f
	变量 yv : 单精度小数=0f
	变量 xa : 单精度小数=0f
	变量 ya : 单精度小数=0f
	//摩擦力，方向永远与xv相反
	变量 xf : 文本="0-0 100-0"
	//摩擦力，方向永远与yv相反
	变量 yf : 文本="0-0 100-0"

	变量 alpha : 文本="0-1 100-1"
	变量 scale : 文本="0-1 100-1"
	变量 red : 文本="0-1 100-1"
	变量 green : 文本="0-1 100-1"
	变量 blue : 文本="0-1 100-1"
	变量 rotate : 单精度小数=0
	变量 spinspeed : 单精度小数=0
	变量 shake : 单精度小数=0




	//特效已存在的时长
	变量 dtime : 整数
	//特效的存在时长
	变量 dtimemax : 整数
	//要播的图片名称
	变量 pic : 文本
	//如果图片要切割，这里是切割片段总数
	变量 cutn : 整数=1
	//要播第几张切割片段
	变量 cutp : 整数=0
	//切割行数
	变量 row : 整数=1
	变量 gm : 窗口管理器
	变量 轮播 : 逻辑型=假
	变量 循环播放 : 逻辑型=假

	变量 starte : 单精度小数=0
	变量 ende : 单精度小数=-1
	变量 存活倒计时 : 整数=-1
	变量 激活倒计时 : 整数=0


	@静态
	方法 新建(xn : 单精度小数=0f,yn : 单精度小数=0f,xvn : 单精度小数=0f,yvn : 单精度小数=0f,xan : 单精度小数=0f,yan : 单精度小数=0f) : 粒子
		变量 lz : 粒子
		lz.x=xn
		lz.y=yn
		lz.xv=xvn
		lz.yv=yvn
		lz.xa=xan
		lz.ya=yan
		返回 lz
	结束 方法

	方法 setdtime(dt : 整数) : 粒子
		dtime=0
		dtimemax=dt
		返回 本对象
	结束 方法

	方法 Update() : 逻辑型
		如果 激活倒计时<=0 则
			如果 存活倒计时!=-1 则
				存活倒计时=存活倒计时-1
				如果 存活倒计时<=0 则
					返回 真
				结束 如果
			结束 如果
			如果 dtime>=dtimemax 则
				返回 真
			结束 如果
			如果 starte<=dtime&&((ende==-1)||dtime<=ende) 则
				xv=xv+xa
				yv=yv+ya
				x=x+xv
				y=y+yv
				变量 xfn=取值(xf)
				如果 xv>xfn 则
					xv=xv-xfn*绝对值_f(xv)/3
				否则 xv<-1*xfn
					xv=xv+xfn*绝对值_f(xv)/3
				否则
					xv=0
				结束 如果
				变量 yfn=取值(yf)
				如果 yv>yfn 则
					yv=yv-yfn*绝对值_f(yv)/3
				否则 yv<-1*yfn
					yv=yv+yfn*绝对值_f(yv)/3
				否则
					yv=0
				结束 如果
				rotate=rotate+spinspeed
			结束 如果
			如果 轮播 则
				变量 durt : 整数=dtimemax/cutn
				cutp=(dtime-(dtime%durt)-1)/durt
			结束 如果
			dtime=dtime+1
		否则
			激活倒计时=激活倒计时-1
		结束 如果
		返回 假
	结束 方法

	@静态
	方法 全值(值 : 单精度小数) : 文本
		返回 "0-"+值+" 1-"+值
	结束 方法

	方法 取值(东西 : 文本) : 单精度小数
		变量 t=dtime*100f/dtimemax
		变量 rule : 文本[]=东西.分割文本(" ")
		循环(i, 0, 取数组长度(rule))
			变量 v=rule[i].分割文本("-")
			如果 t<v[0].到单精度小数() 则
				如果 i==0 则
					返回 v[1].到单精度小数()
				否则
					变量 s=rule[i-1].分割文本("-")
					返回 s[1].到单精度小数()+(v[1].到单精度小数()-s[1].到单精度小数())*
					(t-s[0].到单精度小数())/(v[0].到单精度小数()-s[0].到单精度小数())
				结束 如果
			结束 如果
		结束 循环
		返回 (rule[取数组长度(rule)-1].分割文本("-"))[1].到单精度小数()
	结束 方法
结束 类

类 userdatas
	变量 账户数量=0
	变量 当前账户 : 整数=-1
	变量 账户 : userdataed

	方法 当前账户() : userdata
		返回 账户[当前账户]
	结束 方法
结束 类

类 userdata
	//用户名
	变量 你的名字是ĉĵ : 文本
	变量 冒险周目 : 整数
	变量 冒险关数 : 整数
	变量 小游戏通关 : 整数[]=数组创建(整数,100)
	变量 解锁小游戏 : 逻辑型=假
	变量 解锁益智 : 逻辑型=假
	变量 解锁无尽 : 逻辑型=假
	变量 卡槽数量 : 整数=6
	变量 紫卡解锁 : 逻辑型[]=数组创建(逻辑型,8)
结束 类

类 userdataed : 集合模板类<userdata>
结束 类

类 Dialog

结束 类