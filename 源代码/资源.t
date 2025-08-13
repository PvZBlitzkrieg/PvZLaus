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
类 rubie
	变量 基本文本 : Stringk=""

	方法 取值(zs: 双整数) : 文本
		//返回 zs.start.到文本()+"  "+zs.end.到文本()

		如果 zs.start>zs.end 则
			返回 ""
		结束 如果
		如果 基本文本.value=="" 则
			返回 "none"
		结束 如果
		//日志(zs.start.到文本()+"  "+zs.end.到文本())
		返回 基本文本.value.取文本中间(zs.start,zs.end)

	结束 方法
结束 类

类 XMLR : rubie
	变量 namerd : 双整数
	变量 inford : 双整数
	变量 refe : reflected
	变量 attr : XMLRED

	变量 readed : 逻辑型=真
	变量 rtp : 文本

	属性读 name() : 文本
		返回 取值(namerd)
	结束 属性

	属性读 info() : 文本
		返回 取值(inford)
	结束 属性

	属性写 name(zs : 双整数)
		namerd=zs
	结束 属性

	属性写 info(zs : 双整数)
		inford=zs
	结束 属性

	@虚拟方法
	@运算符重载
	方法 [](namew : 文本) : XMLR
		返回 索引(namew)
	结束 方法

	方法 index(int : 整数) : XMLR
		返回 attr[int]
	结束 方法

	方法 get(t : 文本) : 文本
		循环(i, 0, attr.长度)
			如果 attr[i].name==t 则
				返回 attr[i].info
			结束 如果
		结束 循环
		返回 ""
	结束 方法

	方法 refeindex(title : 文本) : 文本
		循环(i, 0, refe.长度)
			如果 refe.取成员(i).title==title 则
				返回 refe.取成员(i).value
			结束 如果
		结束 循环
		返回 ""
	结束 方法

	//2025.3.16
	方法 getbyrefe(refetitle : 文本,refevalue : 文本) : XMLR
		循环(i, 0, attr.长度)
			变量 attrw=attr[i]
			循环(u, 0, attrw.refe.长度)
				变量 refew : reflect=(attrw.refe)[u]
				如果 refew.title==refetitle&&refew.value==refevalue 则
					返回 attrw
				结束 如果
			结束 循环
		结束 循环
		返回 空
	结束 方法

	方法 索引(namew : 文本) : XMLR
		循环(i, 0, attr.长度)
			如果 attr[i].name==namew 则
				返回 attr[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法

	属性读 length() : 整数
		返回 attr.长度
	结束 属性

	方法 track(namew : 文本) : XMLR
		循环(i, 0, attr.长度)
			如果 attr[i].name=="track" 则
				变量 at : XMLR=attr[i].attr.取成员(0)
				如果 at.name=="name"&&at.info==namew 则
					返回 attr[i]
				结束 如果
			结束 如果
		结束 循环
		返回 空
	结束 方法

	方法 pos(index : 整数) : POS
		变量 pos : POS
		变量 tracked : XMLRED=index(index+1).attr
		循环(i, 0, tracked.长度)
			如果 tracked[i].name=="x" 则
				pos.x=tracked[i].info.到单精度小数()
			否则 tracked[i].name=="y"
				pos.y=tracked[i].info.到单精度小数()
			否则 tracked[i].name=="sx"
				pos.sx=tracked[i].info.到单精度小数()
			否则 tracked[i].name=="sy"
				pos.sy=tracked[i].info.到单精度小数()
			否则 tracked[i].name=="kx"
				pos.kx=tracked[i].info.到单精度小数()
			否则 tracked[i].name=="ky"
				pos.ky=tracked[i].info.到单精度小数()
			否则 tracked[i].name=="f"
				pos.f=tracked[i].info.到整数()
			否则 tracked[i].name=="i"
				pos.image=tracked[i].info
			结束 如果
		结束 循环
		返回 pos
	结束 方法

	方法 duration() : 整数
		返回 attr.长度-1
	结束 方法

	@静态
	方法 读取xml(xmlr : XMLR,xml : Stringk,index : 整数) : 整数
		//如果 xml!="" 则
		xmlr.基本文本=xml
		//结束 如果
		变量 t : 字符
		变量 str : 双整数
		str.清空(index)

		/*name 0
		skip 1
		none 2
		jump 3
		value 4
		exit 5
		title 6
		info 7
		*/
		变量 state : 整数=0
		变量 title : 双整数
		变量 leftfirst : 逻辑型
		变量 symbol : 逻辑型
		变量 en=("\n".到字符集())[0]
		//变量 symst=("\\".到字符集())[0]
		循环(i, index, xml.value.长度)
			t=(xml.value)[i]
			如果 state==1 则
				如果 t=='>' 则
					state=2
				结束 如果
			否则 t=='<' 
				如果 state==7 则
					xmlr.info=str
					str=str.copy().清空(i+1)
					//code #<xmlr.info>==#str.toString();
				结束 如果
				state=3
				leftfirst=真
				str=str.copy().清空(i+1)
			否则 t==' '
				如果 state==0 则
					xmlr.name=str
					//code #<xmlr.name>==#str.toString();
					state=6
					str=str.copy().清空(i+1)
				否则 state==4
					变量 rele : reflect
					rele.基本文本=xml
					rele.title=title
					rele.value=str
					//code #<rele.value>==#str.toString();
					xmlr.refe.添加成员(rele)
					state=6
					str=str.copy().清空(i+1)
				结束 如果
			否则 t=='='
				title=str
				//code #title=#str.toString();
				state=4
				str=str.copy().清空(i+1)
			否则 t=='"'
				如果 state==4 则
					变量 st : 双整数
					i=readStr(xml,i+1,st)
					str=st
				结束 如果
			否则 t=='/'
				symbol=真
				如果 leftfirst 则
					state=5
				结束 如果
			否则 t=='>'
				如果 state==5 则
					返回 i
				否则
					如果 state==4 则
						变量 rele : reflect
						rele.基本文本=xml
						rele.title=title
						rele.value=str
						str=str.copy().清空(i+1)
						//code #<rele.value>==#str.toString();
						xmlr.refe.添加成员(rele)
					否则 state==0
						xmlr.name=str
						/////
						str=str.copy().清空(i+1)
						//code #<xmlr.name>==#str.toString();
					结束 如果
					如果 symbol 则
						返回 i
					否则
						state=6
						str=str.copy().清空(i+1)
					结束 如果
					state=7
				结束 如果
			否则 t=='!'||t=='?'
				如果 leftfirst 则
					state=1
				结束 如果
			否则 state!=2&&state!=5&&t!=' '&&t!=en
				如果 leftfirst 则
					变量 xmlrs : XMLR
					i=读取xml(xmlrs,xml,i)
					xmlr.attr.添加成员(xmlrs)
				结束 如果
				str.end=i
				如果 str.clear 则
					str.start=i
					str.clear=假
				结束 如果
				leftfirst=假

			结束 如果
		结束 循环
		返回 xml.value.长度
	结束 方法

	@静态
	方法 readStr(xml : Stringk,index : 整数,st : 双整数) : 整数
		变量 skip : 逻辑型=假
		变量 t : 文本
		st.清空(index)
		循环(i, index, xml.value.长度)
			t=(xml.value)[i].到文本()
			如果 skip 则
				st.end=st.end+1
				skip=假
			否则 t=="\""
				st.end=i-1
				返回 i
			否则
				st.end=st.end+1
			结束 如果
		结束 循环
		返回 xml.value.长度
	结束 方法

	方法 到文本(int : 整数=0) : 文本
		变量 this : XMLR=本对象
		变量 e : 文本="name:"+this.name
		如果 (this.info)!="" 则
			e=e+" info:"+this.info
		结束 如果
		循环(i, 0, refe.长度)
			e=e+"\ntitle:"+refe[i].title+" value:"+refe[i].value
		结束 循环
		循环(i, 0, attr.长度)
			e=e+"\n"+attr[i].到文本(1)
		结束 循环
		返回 e.替换("\n","\n"+" "*(int*4))
	结束 方法
结束 类

类 Stringk
	变量 value : 文本

	变量 int1 : 整数
	变量 int2 : 整数
	变量 info : 文本

	@静态
	方法 文本(text : 文本) : Stringk
		变量 s : Stringk=空
		code #s=new #<Stringk>(#text);
		s.value=text
		返回 s
	结束 方法

	@运算符重载
	方法 =(text : 文本)
		value=text
	结束 方法

	@运算符重载
	方法 +(欲相加对象 : 对象) : Stringk
		value=value+欲相加对象
		返回 本对象
	结束 方法

	@运算符重载
	方法 ==(另一个文本 : 文本) : 逻辑型
		返回 value==另一个文本
	结束 方法

	@运算符重载
	方法 !=(另一个文本 : 文本) : 逻辑型
		返回 value!=另一个文本
	结束 方法

	@虚拟方法
	方法 到文本() : 文本
		返回 value
	结束 方法

结束 类

类 reanim

	变量 name : 文本集合
	变量 xmlred : XMLRED
	变量 rean : Reanimeds
	变量 gm : 窗口管理器=空

	@静态
	方法 init(加载进度 : Stringk,管理器 : 窗口管理器) : reanim
		加载进度.info="anim"
		变量 rean : reanim
		rean.gm=管理器
		变量 paths : 文本[]=文件操作.取子文件列表("/storage/emulated/0/.pvz/pvz/compiled/reanim/finished_xml/")
		循环(i, 0, 取数组长度(paths))
			变量 rea : XMLR
			rea.readed=假
			rea.rtp=paths[i]
			//变量 nt=取当前时间戳()
			//XMLR.读取xml(rea,Stringk.文本(文件操作.读入文本文件(paths[i])),0)
			//日志("xmlr:"+(取当前时间戳()-nt).到文本())
			rean.name.添加成员(文件操作.取文件名(paths[i]))
			rean.xmlred.添加成员(rea)
			rean.rean.add(创建 Reanimed)
			如果 文本属于文本集({"Zombie","SelectorScreen","CrazyDave"},文件操作.取文件前缀名(文件操作.取文件名(paths[i]))) 则
				//文本属于文本集({"Zombie","SelectorScreen","CrazyDave"},文件操作.取文件前缀名(文件操作.取文件名(paths[i])))
				rean.finize(i)
			结束 如果
			//变量 nt=取当前时间戳()
			/*
			rea.readed=假
			rea.rtp=paths[i]
			//日志("xmlr:"+(取当前时间戳()-nt).到文本())
			rean.name.添加成员(文件操作.取文件名(paths[i]))
			rean.xmlred.添加成员(rea)
			rean.rean.add(创建 Reanimed)
			*/
			加载进度.value="加载动画信息:"+(i+1).到文本()+"/"+取数组长度(paths)+"   "+文件操作.取文件前缀名(取文件名(paths[i]))
			加载进度.int1=i+1
			加载进度.int2=取数组长度(paths)
		结束 循环
		返回 rean
	结束 方法

	方法 get(namew : 文本) : Reanimed
		循环(i, 0, xmlred.长度)
			如果 name[i]==namew+".reanim" 则

				如果 xmlred[i].readed==假 则
					finize(i)
				结束 如果

				返回 rean[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法

	方法 finize(i : 整数)
		gm.加载信息="Processing "+文件操作.取文件前缀名(文件操作.取文件名(xmlred[i].rtp))
		XMLR.读取xml(xmlred[i],Stringk.文本(文件操作.读入文本文件(xmlred[i].rtp)),0)
		rean[i]=proc(xmlred[i],gm)
		xmlred[i].readed=真
		gm.加载信息="Processing completed"
	结束 方法

	@静态
	方法 proc(trackx : XMLR,管理器 : 窗口管理器) : Reanimed

		变量 reanh : Reanimed
		//变量 trackx : XMLR=(管理器.REANIM)[name]
		循环(i, 1, trackx.length())
			//日志(i.到文本())
			变量 tracks : XMLR=trackx.index(i)
			//日志(tracks.到文本())
			变量 reanw : Reanim
			reanw.name=tracks.index(0).info
			变量 id : 文本=tracks.index(1).get("i")
			如果 id=="" 则
				//日志(trackx.到文本())
			否则
				//日志("idtest:"+id)
				变量 wt : 未加载图=管理器.resall.取项目(id)
				如果 wt==空 则
					开始俘获异常()
					管理器.getres(id).加载()
					俘获所有异常()
					日志("error:ubi  "+id+" len:"+管理器.resall.长度)
					结束俘获异常()
				否则
					reanw.colorset=wt.加载()
				结束 如果
				//开始俘获异常()
				//reanw.colorset=管理器.resall.取项目(id).加载()
				//俘获所有异常()
				//日志(id)
				//结束俘获异常()
			结束 如果
			reanw.anim=tracks
			变量 pos : POS
			pos.置值()
			pos.image=id
			循环(u, 0, reanw.anim.duration())
				变量 posw=reanw.anim.pos(u)
				posw.与(pos)
				//日志("xt:"+posw.image)
				reanw.poslist.添加成员(posw)
				pos=posw
			结束 循环
			reanh.添加成员(reanw)
			//日志(tracks.duration())
		结束 循环

		返回 reanh
	结束 方法

	@运算符重载
	方法 [](namew : 文本) : XMLR
		循环(i, 0, xmlred.长度)
			如果 name[i]==namew+".reanim" 则
				返回 xmlred[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法
结束 类

类 Reanim
	变量 colorset : ColorSet
	变量 name : 文本
	变量 anim : XMLR
	变量 poslist : POSLIST

结束 类

类 POSLIST : 集合模板类<POS>
结束 类

//对Reanimed的封装
类 Reanimedm
	变量 reani : Reanimed

	@静态
	方法 r(reani : Reanimed) : Reanimedm
		变量 reanw : Reanimedm
		reanw.reani=reani
		返回 reanw
	结束 方法
结束 类

类 Reanimedsm : 集合模板类<Reanimedm>
结束 类

//对Reanimedsm类的封装
类 Reanimeds
	变量 reanedsm : Reanimedsm

	@运算符重载
	方法 [](index : 整数) : Reanimed
		返回 reanedsm.取成员(index).reani
	结束 方法

	@运算符重载
	方法 []=(index : 整数,reanm : Reanimed)
		reanedsm.置成员(index,Reanimedm.r(reanm))
	结束 方法

	方法 add(reanm : Reanimed)
		reanedsm.添加成员(Reanimedm.r(reanm))
	结束 方法

	方法 delete(index : 整数)
		reanedsm.删除成员(index)
	结束 方法
结束 类

类 reflect : rubie
	变量 titlerd : 双整数
	变量 valuerd : 双整数

	属性读 title() : 文本
		返回 取值(titlerd)
	结束 属性

	属性写 title(zs : 双整数)
		titlerd=zs
	结束 属性

	属性读 value() : 文本
		返回 取值(valuerd)
	结束 属性

	属性写 value(zs : 双整数)
		valuerd=zs
	结束 属性
结束 类

类 XMLRED : 集合模板类<XMLR>
结束 类

类 reflected : 集合模板类<reflect>
结束 类

类 POS
	变量 x : 单精度小数=-1719f
	变量 y : 单精度小数=-1719f
	变量 sx : 单精度小数=-1719f
	变量 sy : 单精度小数=-1719f
	变量 kx : 单精度小数=-1719f
	变量 ky : 单精度小数=-1719f
	变量 f : 整数=-1719
	变量 mandaf : 整数=-1719
	变量 image : 文本=""

	变量 bkx : 整数
	变量 bky : 整数

	方法 无值() : 逻辑型
		如果 (x==-1f)&&(y==-1f)&&(sx==-1f)&&(sy==-1f)&&(kx==-1f)&&ky==-1f 则
			返回 真
		结束 如果
		返回 假
	结束 方法

	方法 置值(v : 单精度小数=-1719f)
		如果 v==-1719f 则
			x=0f
			y=0f
			sx=1f
			sy=1f
			kx=0f
			ky=0f
			f=0
		否则
			x=v
			y=v
			sx=v
			sy=v
			kx=v
			ky=v
		结束 如果
	结束 方法

	方法 与(posw : POS) : 逻辑型
		如果 x==-1719f 则
			x=posw.x
		结束 如果
		如果 y==-1719f 则
			y=posw.y
		结束 如果
		如果 sx==-1719f 则
			sx=posw.sx
		结束 如果
		如果 sy==-1719f 则
			sy=posw.sy
		结束 如果
		如果 kx==-1719f 则
			kx=posw.kx
		结束 如果
		如果 ky==-1719f 则
			ky=posw.ky
		结束 如果
		如果 f==-1719f 则
			f=posw.f
		结束 如果
		如果 image=="" 则
			//日志(posw.image)
			image=posw.image
			返回 真
		结束 如果
		返回 假
	结束 方法

	方法 notinit() : 逻辑型
		如果 (x==-1719f)||(y==-1719f)||(sx==-1719f)||(sy==-1719f)||(kx==-1719f)||(ky==-1719f)||(f==-1719)||image=="" 则
			返回 真
		结束 如果
		返回 假
	结束 方法

	方法 f() : 整数
		如果 mandaf==-1719 则
			返回 f
		否则
			返回 mandaf
		结束 如果
	结束 方法
结束 类



类 文本到Reanim哈希表 : 哈希表模板类<文本, ColorSet>
结束 类

类 文本到ColorSet哈希表 : 哈希表模板类<文本, ColorSet>
结束 类

类 文本到未加載圖哈希表 : 哈希表模板类<文本, 未加载图>
结束 类

类 Reanimed : 集合模板类<Reanim>
结束 类

类 Animed : 集合模板类<Anim>
结束 类

类 代理动画
	变量 代理动画轨道 : 整数集
	变量 代理动画名称 : 文本集合
	变量 panim : Animed
	变量 pos : POSLIST
	变量 双重动画 : 逻辑型集合

	方法 添加动画(轨道 : 整数,名称 : 文本,anim : Anim,posw : POS,使用原动画 : 逻辑型=真)
		代理动画轨道.添加成员(轨道)
		代理动画名称.添加成员(名称)
		panim.添加成员(anim)
		pos.添加成员(posw)
		双重动画.添加成员(使用原动画)
	结束 方法

	方法 删除动画(轨道 : 整数)
		循环(i, 0, 代理动画轨道.长度)
			如果 代理动画轨道[i]==轨道 则
				代理动画轨道.删除成员(i)
				代理动画名称.删除成员(i)
				panim.删除成员(i)
				pos.删除成员(i)
				双重动画.删除成员(i)
			结束 如果
		结束 循环
	结束 方法

	@运算符重载
	方法 [](轨道 : 整数) : Anim
		循环(i, 0, 代理动画轨道.长度)
			如果 代理动画轨道[i]==轨道 则
				返回 panim[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法

	方法 索引轨道(外索引 : 整数) : 整数
		循环(i, 0, 代理动画轨道.长度)
			如果 代理动画轨道[i]==外索引 则
				返回 i
			结束 如果
		结束 循环
		返回 -1
	结束 方法

	方法 pos(轨道 : 整数) : POS
		循环(i, 0, 代理动画轨道.长度)
			如果 代理动画轨道[i]==轨道 则
				返回 pos[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法

	方法 name(st : 文本) : Anim
		循环(i, 0, 代理动画轨道.长度)
			如果 panim[i].名称==st 则
				返回 panim[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法

	方法 名称(st : 文本) : Anim
		循环(i, 0, 代理动画名称.长度)
			如果 代理动画名称[i]==st 则
				返回 panim[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法

结束 类

类 渲染信息
	变量 color : 单精度小数[]={1f,1f,1f,1f}
	变量 totaltime : 单精度小数=0f
	变量 time : 单精度小数=0f
	变量 代理图像 : 文本
	变量 realcolor : 单精度小数[]={1f,1f,1f,1f}

	变量 渐变 : 逻辑型=假
	变量 循环渐变 : 逻辑型=假
	变量 是否渲染 : 逻辑型=假
	变量 真值 : 逻辑型

	方法 渲染(colorx : 单精度小数[],timex : 单精度小数)
		color=colorx
		time=timex
		totaltime=time
		渐变=真
		是否渲染=真
	结束 方法

	方法 渲染循环(colorx : 单精度小数[],timex : 单精度小数)
		color=colorx
		time=timex
		totaltime=time
		循环渐变=真
		是否渲染=真
	结束 方法

	方法 真值渲染(colorx : 单精度小数[])
		realcolor=colorx
		//日志(取数组长度(realcolor).到文本())
		是否渲染=真
		真值=真
	结束 方法

	方法 取渲染值() : 单精度小数[]

		如果 渐变 则
			/*
			变量 colorx : 单精度小数[]=数组创建(单精度小数,取数组长度(color))
			变量 htt=(time/(totaltime/2))
			如果 time>totaltime/2 则
				htt=2-htt
			结束 如果
			循环(i, 0, 取数组长度(colorx))
				如果 i<取数组长度(colorx)-1 则
					colorx[i]=1f+(color[i]-1f)*htt
				否则
					colorx[i]=color[i]
				结束 如果
			结束 循环
			*/
			变量 colorx : 单精度小数[]=数组创建(单精度小数,取数组长度(color))
			变量 htt=(time/totaltime)
			循环(i, 0, 取数组长度(colorx))
				如果 i<取数组长度(colorx)-1 则
					colorx[i]=1f+(color[i]-1f)*htt
				否则
					colorx[i]=color[i]
				结束 如果
			结束 循环

			返回 getrealcolor(colorx)
		否则 循环渐变
			变量 colorx : 单精度小数[]=数组创建(单精度小数,取数组长度(color))
			变量 htt=(time/(totaltime/2))
			如果 time>totaltime/2 则
				htt=2-htt
			结束 如果
			循环(i, 0, 取数组长度(colorx))
				如果 i<取数组长度(colorx)-1 则
					colorx[i]=1f+(color[i]-1f)*htt
				否则
					colorx[i]=color[i]
				结束 如果
			结束 循环
			返回 getrealcolor(colorx)
		否则
			返回 getrealcolor(color)
		结束 如果
	结束 方法

	方法 取消渲染()
		是否渲染=假
		渐变=假
		循环渐变=假
		time=0
	结束 方法

	方法 getrealcolor(pending : 单精度小数[]) : 单精度小数[]
		如果 time<=0 则
			渐变=假
			循环渐变=假
			color={1f,1f,1f,1f}
		结束 如果
		循环(i, 0, 取数组长度(pending))
			pending[i]=pending[i]*realcolor[i]
		结束 循环
		返回 pending
	结束 方法
结束 类

类 渲染信息集合 : 集合模板类<渲染信息>
结束 类

类 Anim
	变量 名称 : 文本
	变量 rean : Reanimed
	变量 startframe : 整数
	变量 frame : 单精度小数=0f
	变量 maxframe : 整数
	变量 speed : 单精度小数=1f
	变量 mandaf : 整数集
	变量 强制演化帧 : 整数=-1
	变量 强制演化时间 : 单精度小数=-1f
	变量 强制演化进度 : 单精度小数=0
	变量 panims : 代理动画
	变量 update : 逻辑型
	变量 动画回归 : 文本
	变量 animname : 文本
	变量 hasReplay=假
	变量 渲染值 : 渲染信息集合
	变量 暂停 : 逻辑型
	变量 播完暂停 : 逻辑型
	变量 禁止演化 : 逻辑型
	变量 禁止回演化 : 逻辑型
	变量 speedslows : 单精度小数=1f
	变量 speedcat : 单精度小数=1f
	变量 管理器 : 窗口管理器=空

	属性读 speedslow() : 单精度小数
		返回 speedslows*speedcat
	结束 属性

	方法 copy1f() : Anim
		变量 anime : Anim=Anim.创建动画(名称,管理器)
		anime.播放动画(animname)
		anime.frame=frame
		anime.update=update
		anime.动画回归=动画回归
		anime.hasReplay=hasReplay
		anime.暂停=真
		anime.禁止演化=禁止演化
		anime.禁止回演化=禁止回演化
		循环(i, 0, 渲染值.长度)
			(anime.渲染值)[i].代理图像=渲染值[i].代理图像
		结束 循环
		循环(i, 0, mandaf.长度)
			anime.mandaf.添加成员(mandaf[i])
		结束 循环

		//anime.speedslow=1f

		/*
		anime.名称=名称
		anime.rean=rean
		anime.startframe=startframe
		anime.frame=frame
		anime.maxframe=maxframe
		anime.speed=speed
		anime.mandaf=mandaf
		anime.强制演化帧=强制演化帧
		anime.强制演化时间=强制演化时间
		anime.强制演化进度=强制演化进度
		anime.panims=panims
		anime.名称=名称
		anime.名称=名称
		anime.名称=名称
		anime.名称=名称
		*/
		返回 anime
	结束 方法


	@静态
	方法 创建动画(name : 文本,管理器w : 窗口管理器) : Anim
		//日志("anim:"+trackx.length)
		变量 anim : Anim
		anim.名称=name
		anim.管理器=管理器w
		anim.rean=管理器w.REANIM.get(name)
		anim.frame=0
		anim.maxframe=(anim.rean)[0].anim.duration()
		循环(i, 0, anim.rean.长度)
			anim.mandaf.添加成员(-2)
			anim.渲染值.添加成员(创建 渲染信息)
		结束 循环
		返回 anim
	结束 方法
	
	方法 重播() : Anim
		暂停=假
		frame=startframe
		返回 本对象
	结束 方法

	方法 禁止演化(value : 逻辑型) : Anim
		禁止演化=value
		禁止回演化=value
		返回 本对象
	结束 方法

	方法 禁止回演化(value : 逻辑型) : Anim
		禁止回演化=value
		返回 本对象
	结束 方法

	方法 渲染(namew : 文本="",color : 单精度小数[],time : 单精度小数)
		循环(i, 0, rean.长度)
			如果 rean[i].name==namew 则
				渲染值[i].渲染(color,time)

			结束 如果
		结束 循环

	结束 方法

	方法 真值渲染(namew : 文本="",color : 单精度小数[])
		循环(i, 0, rean.长度)
			如果 rean[i].name==namew||namew=="" 则
				渲染值[i].真值渲染(color)
			结束 如果
		结束 循环
	结束 方法

	方法 代理(namew : 文本,animw : Anim,pos : POS,使用原动画 : 逻辑型=真) : Anim
		循环(i, 0, rean.长度)
			如果 rean[i].name==namew 则
				mandaf[i]=0
				panims.添加动画(i,namew,animw,pos,使用原动画)
				退出循环
			结束 如果
		结束 循环
		返回 本对象
	结束 方法

	方法 代理图片(namew : 文本,pngname : 文本) : Anim
		循环(i, 0, rean.长度)
			如果 rean[i].name==namew 则
				//日志("pngname:"+pngname)
				渲染值[i].代理图像=pngname
				退出循环
			结束 如果
		结束 循环
		返回 本对象
	结束 方法
	
	方法 obtainPOS(namer : 文本) : POS
		返回 getPOS(frame,取reanim索引(namer)).pos2
	结束 方法
	
	方法 取reanim索引(rid : 文本) : 整数
		循环(i, 0, rean.长度)
			如果 rean[i].name==rid 则
				返回 i
			结束 如果
		结束 循环
		返回 -1
	结束 方法

	方法 getPOS(indexw : 单精度小数,动画索引 : 整数) : POS_int
		变量 hb=indexw%1
		变量 index=(indexw-hb).到整数()
		变量 reans=rean[动画索引]
		变量 indexs=index+1
		如果 index>=reans.poslist.长度 则
			index=reans.poslist.长度-1
			indexs=startframe
		结束 如果
		变量 pos=(reans.poslist)[index]
		如果 强制演化帧!=-1 则
			indexs=强制演化帧
			hb=强制演化进度/强制演化时间
			//日志(anim.强制演化进度+" gvb  "+anim.强制演化时间+" @h   "+hb)
		否则

			如果 indexs>=maxframe 则
				indexs=startframe
				如果 禁止回演化||禁止演化 则
					hb=0
				结束 如果
			结束 如果
		结束 如果
		变量 post : POS
		如果 indexs>=reans.poslist.长度 则
			如果 startframe>=reans.poslist.长度 则
				post=(reans.poslist)[index]
			结束 如果
		否则
			post=(reans.poslist)[indexs]
		结束 如果


		变量 posh : POS
		如果 禁止演化 则
			hb=0
		结束 如果
		posh.x=(post.x-pos.x)*hb+pos.x
		posh.y=(post.y-pos.y)*hb+pos.y
		posh.sx=(post.sx-pos.sx)*hb+pos.sx
		posh.sy=(post.sy-pos.sy)*hb+pos.sy
		posh.kx=(post.kx-pos.kx)*hb+pos.kx
		posh.ky=(post.ky-pos.ky)*hb+pos.ky
		posh.f=pos.f
		posh.mandaf=pos.mandaf
		posh.image=pos.image
		变量 pos_int : POS_int
		pos_int.pos0=pos
		pos_int.pos1=post
		pos_int.pos2=posh
		pos_int.int=index
		返回 pos_int
	结束 方法

	方法 f(index : 整数,track : 整数) : 整数
		如果 mandaf[index]==-2 则
			返回 (rean[index].poslist)[track].f
		否则
			返回 mandaf[index]
		结束 如果
	结束 方法

	//2.10
	方法 过渡从(fr : 整数,时间 : 单精度小数)
		强制演化帧=frame.到整数()
		frame=fr
		强制演化时间=时间
		强制演化进度=0
		
	结束 方法

	方法 过滤(名称w : 文本[]) : 文本[]
		变量 rlt : 文本集合
		循环(u, 0, rean.长度)
			//日志("mub:"+rean[u].name)
			循环(i, 0, 取数组长度(名称w))
				如果 rean[u].name==名称w[i] 则
					如果 mandaf[u]==0||mandaf[u]==-2 则
						rlt.添加成员(名称w[i])
					结束 如果
					退出循环
				结束 如果
			结束 循环
		结束 循环
		返回 rlt.到数组()
	结束 方法

	//0显示
	//-1不显示
	//-1719不强制，采用既定方案
	//预设若为真，则自动将其它轨道设为相反的值
	方法 强制显示(名称 : 文本[],v : 整数,预设 : 逻辑型=假) : Anim
		变量 v2 : 整数=0

		如果 v==0 则
			v2=-1
		结束 如果
		循环(u, 0, rean.长度)
			//日志("mub:"+rean[u].name)
			变量 fd=假
			循环(i, 0, 取数组长度(名称))
				如果 rean[u].name==名称[i] 则
					mandaf[u]=v
					/*
					循环(o, 0, rean[u].poslist.长度)
						(rean[u].poslist)[o].mandaf=v
					结束 循环
					*/
					fd=真
					退出循环
				结束 如果

			结束 循环
			如果 预设&&fd==假 则
				/*
					循环(o, 0, rean[u].poslist.长度)
						(rean[u].poslist)[o].mandaf=v2
					结束 循环
					*/
				mandaf[u]=v2
			结束 如果
		结束 循环
		返回 本对象
	结束 方法

	方法 播放动画(名称w : 文本,单次播放 : 逻辑型=假) : Anim
		暂停=假
		如果 单次播放 则
			动画回归=animname
		结束 如果
		animname=名称w
		强制演化帧=-1
		//日志("bnn")
		循环(i, 0, rean.长度)
			变量 reanw=(rean[i].anim)
			//日志("ann:"+reanw.info)
			如果 reanw.index(0).info==名称w 则
				startframe=0
				maxframe=reanw.duration()
				循环(i, 1, reanw.length)
					变量 t=(reanw.index(i))["f"]
					如果 t!=空 则
						//日志("cnn:"+t.info)
						如果 t.info=="0" 则
							startframe=i
						否则 t.info=="-1"
							maxframe=i-1
						结束 如果
					结束 如果
				结束 循环
				如果 maxframe==0 则
					maxframe=reanw.duration()
				结束 如果
				//日志(startframe+"   hmn "+maxframe)
				退出循环
			结束 如果
		结束 循环
		frame=startframe
		返回 本对象
	结束 方法

	方法 获取当前POS(reanimName : 文本) : POS
		变量 poslist=获取Reanim(reanimName).poslist
		变量 indexw=frame
		变量 hb=indexw%1
		变量 index=(indexw-hb).到整数()
		//变量 ft=poslist[startframe].x
		//变量 ht=poslist[index].x
		变量 indexs=index+1

		如果 indexs>=maxframe 则
			返回 poslist[maxframe]
		否则
			返回 poslist[indexs]

			//((ht-st)*hb-ft)*xv
		结束 如果
	结束 方法

	方法 获取Reanim(namew : 文本) : Reanim
		循环(i, 0, rean.长度)
			如果 rean[i].name==namew 则
				返回 rean[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法
结束 类

@指代类("android.graphics.Matrix")
类 Matrix
	@静态
	方法 新建() : Matrix
		code return new android.graphics.Matrix();
	结束 方法

	@静态
	方法 从Matrix新建(matrix : Matrix) : Matrix
		code return new android.graphics.Matrix(#matrix);
	结束 方法

	方法 getValues() : 单精度小数[]
		变量 values : 单精度小数[]=数组创建(单精度小数,9)
		code #this.getValues(#values);
		返回 values
	结束 方法

	方法 postRotate_3( degrees : 单精度小数,  px : 单精度小数,  py : 单精度小数) : Matrix
		code #this.postRotate(#degrees,#px,#py);
		code return #this;
	结束 方法

	方法 postRotate( degrees : 单精度小数) : Matrix
		code #this.postRotate(#degrees);
		code return #this;
	结束 方法

	方法 postScale_4( sx : 单精度小数, sy : 单精度小数, px : 单精度小数, py : 单精度小数) : Matrix
		code #this.postScale( #sx,  #sy,  #px,  #py);
		code return #this;
	结束 方法

	方法 postScale( sx : 单精度小数, sy : 单精度小数) : Matrix
		code #this.postScale( #sx,  #sy);
		code return #this;
	结束 方法

	方法 postSkew_4( kx : 单精度小数,  ky : 单精度小数, px : 单精度小数, py : 单精度小数) : Matrix
		code #this.postSkew( #kx,  #ky,#px,#py);
		code return #this;
	结束 方法

	方法 postSkew( kx : 单精度小数,  ky : 单精度小数) : Matrix
		code #this.postSkew( #kx,  #ky);
		code return #this;
	结束 方法

	方法 postTranslate( dx : 单精度小数,  dy : 单精度小数) : Matrix
		code #this.postTranslate(#dx, #dy);
		code return #this;
	结束 方法

	方法 preRotate_3( degrees : 单精度小数,  px : 单精度小数,  py : 单精度小数) : Matrix
		code #this.preRotate(#degrees,#px,#py);
		code return #this;
	结束 方法

	方法 preRotate( degrees : 单精度小数) : Matrix
		code #this.preRotate(#degrees);
		code return #this;
	结束 方法

	方法 preScale_4( sx : 单精度小数, sy : 单精度小数, px : 单精度小数, py : 单精度小数) : Matrix
		code #this.preScale( #sx,  #sy,  #px,  #py);
		code return #this;
	结束 方法

	方法 preScale( sx : 单精度小数, sy : 单精度小数) : Matrix
		code #this.preScale( #sx,  #sy);
		code return #this;
	结束 方法

	方法 preSkew_4( kx : 单精度小数,  ky : 单精度小数, px : 单精度小数, py : 单精度小数) : Matrix
		code #this.preSkew( #kx,  #ky,#px,#py);
		code return #this;
	结束 方法

	方法 preSkew( kx : 单精度小数,  ky : 单精度小数) : Matrix
		code #this.preSkew( #kx,  #ky);
		code return #this;
	结束 方法

	方法 preTranslate( dx : 单精度小数,  dy : 单精度小数) : Matrix
		code #this.preTranslate(#dx, #dy);
		code return #this;
	结束 方法

结束 类

类 未加载图 : ColorSet
	变量 是否加载 : 逻辑型=假
	变量 路径 : 文本

	方法 释放() ： 未加载图
		是否加载=假
		b=空
		wid=-1
		hei=-1
	结束 方法

	方法 加载() : 未加载图
		如果 是否加载==假 则
			//日志(取当前时间戳().到文本()+" 加载")
			从BitMap更改(位图对象.从文件路径创建位图(路径))
			如果 路径.结尾为("jpg") 则
				变量 temp : 文件=路径
				变量 通道=temp.取父目录()+"/"+文件操作.取文件前缀名(取文件名(路径))+"_.png"
				如果 文件操作.文件是否存在(通道) 则
					修正(通道)
				否则
					通道=temp.取父目录().到文本().替换("main","pvz")+"/"+文件操作.取文件前缀名(取文件名(路径))+"_.png"
					如果 文件操作.文件是否存在(通道) 则
						修正(通道)
					结束 如果
				结束 如果

			结束 如果
			是否加载=真
		结束 如果
		//bitmap=空
		clear(b)
		返回 本对象
	结束 方法

	方法 修正(通道 : 文本)
		//日志("修正图片"+通道)
		变量 alpha : ColorSet=ColorSet.从BitMap新建(位图对象.从文件路径创建位图(通道))
		//文件操作.写出字节文件("/storage/emulated/0/.pvz/pvz/reanim/")
		循环(i, 0, 取数组长度(alpha.b))
			//如果 (alpha.b)[i]==0xff000000 则
			变量 v=(alpha.b)[i]
			变量 b2=color_to_argb(b[i])
			变量 v2=color_to_argb(v)
			如果 v2[3]<5 则
				b[i]=0
			否则
				b2[0]=v2[3]
				b[i]=color_from_argb(b2)
			结束 如果
			/*
			code #v=#v<<24>>24;
			如果 v<5 则
				b[i]=0
			否则
				code #b[#i]=#v<<24|#b[#i]<<8>>8;
			结束 如果
			*/
			//2025.8.3
			//b[i]=位清零((alpha.b)[i],0xffffff00)
			//结束 如果
		结束 循环
		alpha.b=空
		clear(alpha)
	结束 方法
结束 类

类 Image
	变量 可释放图 : 文本到未加載圖哈希表

	方法 init(进度 : Stringk,imagename : STSL)
		变量 pathw : 文本[]={"/storage/emulated/0/.pvz/pvz/","/storage/emulated/0/.pvz/main/","/storage/emulated/0/.pvz/pvz/particles/","/storage/emulated/0/.pvz/main/particles/"}
		进度.info="image"
		变量 paths :文本[]=文件操作.取子文件列表(pathw[0]+"images/")
		变量 pathsd :文本[]=文件操作.取子文件列表(pathw[1]+"images/")
		变量 pathse :文本[]=文件操作.取子文件列表(pathw[2])
		变量 pathsf :文本[]=文件操作.取子文件列表(pathw[3])
		进度.int2=取数组长度(paths)//+取数组长度(pathsd)
		init_path(进度,paths,0,pathw[0],imagename)
		进度.int2=取数组长度(paths)+取数组长度(pathsd)
		init_path(进度,pathsd,取数组长度(paths),pathw[1],imagename)
		init_path(进度,pathse,取数组长度(paths),pathw[2],imagename)
		init_path(进度,pathsf,取数组长度(paths),pathw[3],imagename)
	结束 方法

	方法 init_path(进度 : Stringk,paths : 文本[],srcidx : 整数,path : 文本,imagename : STSL)
		path=path
		循环(i, 0, 取数组长度(paths))
			如果 paths[i].结尾为(".png")||paths[i].结尾为(".jpg") 则
				变量 hsm : 文本=文件操作.取文件前缀名(文件操作.取文件名(paths[i]))
				可释放图.添加项目(hsm,窗口管理器.读取图片("",paths[i]))
				//日志(i+"  "+hsm)
				imagename.add("IMAGE_REANIM_"+hsm.到大写(),hsm)
			结束 如果
			进度.value="索引场景图:"+(srcidx+i+1).到文本()+"/"+进度.int2
			进度.int1=srcidx+i+1
			//日志(paths[i])
		结束 循环
	结束 方法



结束 类

类 STSL
	变量 w1 : 文本集合
	变量 w2 : 文本集合

	方法 add(a1 : 文本,a2 : 文本) : STSL
		w1.添加成员(a1)
		w2.添加成员(a2)
		返回 本对象
	结束 方法

	@运算符重载
	方法 [](a1 : 文本) : 文本
		循环(i, 0, w1.长度)
			如果 w1[i]==a1 则
				返回 w2[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法


结束 类

类 矩形x
	变量 x : 单精度小数=-1f
	变量 y : 单精度小数=-1f
	变量 w : 单精度小数=-1f
	变量 h : 单精度小数=-1f
	变量 sence : 整数=-1

	变量 move : 逻辑型
	变量 click : 逻辑型

	@静态
	方法 新建(x : 单精度小数,y : 单精度小数,w : 单精度小数,h : 单精度小数) : 矩形x
		变量 rect : 矩形x
		rect.x=x
		rect.y=y
		rect.w=w
		rect.h=h
		返回 rect
	结束 方法

	方法 判定(xw : 单精度小数,yw : 单精度小数) : 逻辑型
		如果 x<=xw&&xw<x+w&&y<=yw&&yw<y+h 则
			返回 真
		结束 如果
		返回 假
	结束 方法

	方法 判定x(xw : 单精度小数,thisx : 单精度小数,xwx : 单精度小数) : 逻辑型
		如果 x+thisx<xw+xwx&&xw+xwx<x+thisx+w 则
			返回 真
		结束 如果
		返回 假
	结束 方法

	方法 碰撞(cv : 矩形x,thisx : 整数,cvx : 整数) : 逻辑型
		变量 ax=x+thisx
		变量 bx=cv.x+cvx
		如果 ax+w<bx+cv.w&&bx<ax+w 则
			返回 真
		否则 bx<ax&&ax<bx+cv.w
			返回 真
		结束 如果
		返回 假
	结束 方法

结束 类

类 文本到矩形数组
	变量 name : 文本集合
	变量 rects : 矩形集合

	@运算符重载
	方法 [](namew : 文本) : 矩形x
		返回 get(namew)
	结束 方法

	属性读 长度() : 整数
		返回 min(name.长度,rects.长度)
	结束 属性

	方法 index(index : 整数) : 矩形x
		返回 rects[index]
	结束 方法

	方法 get(namew : 文本) : 矩形x
		循环(i, 0, min(name.长度,rects.长度))
			如果 name[i]==namew 则
				返回 rects[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法

	方法 添加(名称 : 文本,rect : 矩形x) : 文本到矩形数组
		name.添加成员(名称)
		rects.添加成员(rect)
		返回 本对象
	结束 方法

	方法 取(namew : 文本,x : 单精度小数,y : 单精度小数,w : 单精度小数,h : 单精度小数,type : 整数) : 矩形x
		变量 get=get(namew)
		如果 get==空 则
			get=矩形x.新建(x,y,w,h)
			get.sence=type
			添加(namew,get)
		结束 如果
		返回 get
	结束 方法
结束 类

类 矩形集合 : 集合模板类<矩形x>
结束 类

类 drawStyles : 集合模板类<drawStyle>
结束 类

类 drawStyle
	变量 anim : Anim=空
	变量 sx : 单精度小数=1f
	变量 sy : 单精度小数=1f
	变量 kx : 单精度小数=0f
	变量 ky : 单精度小数=0f
	变量 kbx : 单精度小数=0f
	变量 kby : 单精度小数=0f
	变量 color : 整数
	变量 tx : 单精度小数=0f
	变量 ty : 单精度小数=0f
	//2025.8.2 主要是因为舞王僵尸的太空步动画添加的，那个动画是左右倒着的
	变量 matrix : Matrix=空

	方法 与(ds : drawStyle)
		sx=sx*ds.sx
		sy=sy*ds.sy
		kx=kx+ds.kx
		ky=ky+ds.ky
		color=color+ds.color
		tx=tx+ds.tx
		ty=ty+ds.ty
	结束 方法
结束 类

类 POS_int
	变量 pos0 : POS
	变量 pos1 : POS
	变量 pos2 : POS
	变量 int : 整数
结束 类

@指代类("android.graphics.Xfermode")
类 Xfermode
结束 类

@指代类("android.graphics.PorterDuffXfermode")
@导入Java("android.graphics.PorterDuff.Mode")
类 PorterDuffXfermode : Xfermode

	@静态
	方法 新建(porterduff : PorterDuff_Mode) : PorterDuffXfermode
		code return new android.graphics.PorterDuffXfermode(#porterduff);
	结束 方法

结束 类

@导入Java("android.graphics.PorterDuff")
@指代类("android.graphics.PorterDuff.Mode")
类 PorterDuff_Mode
	@静态
	常量 ADD : PorterDuff_Mode?
	@静态
	常量 CLEAR : PorterDuff_Mode?
	@静态
	常量 DARKEN : PorterDuff_Mode?
	@静态
	常量 DST : PorterDuff_Mode?
	@静态
	常量 DST_STOP : PorterDuff_Mode?
	@静态
	常量 DST_IN : PorterDuff_Mode?
	@静态
	常量 DST_OUT : PorterDuff_Mode?
	@静态
	常量 DST_OVER : PorterDuff_Mode?
	@静态
	常量 LIGHTEN : PorterDuff_Mode?
	@静态
	常量 MULTIPLY : PorterDuff_Mode?
	@静态
	常量 OVERLAY : PorterDuff_Mode?
	@静态
	常量 SCREEN : PorterDuff_Mode?
	@静态
	常量 SRC : PorterDuff_Mode?
	@静态
	常量 SRC_ATOP : PorterDuff_Mode?
	@静态
	常量 SRC_IN : PorterDuff_Mode?
	@静态
	常量 SRC_OUT : PorterDuff_Mode?
	@静态
	常量 SRC_OVER : PorterDuff_Mode?
	@静态
	常量 XOR : PorterDuff_Mode?


	@code
	static{
	#ADD=PorterDuff.Mode.ADD;
	#CLEAR=PorterDuff.Mode.CLEAR;
	#DARKEN=PorterDuff.Mode.DARKEN;
	#DST=PorterDuff.Mode.DST;
	#DST_STOP=PorterDuff.Mode.DST_ATOP;
	#DST_IN=PorterDuff.Mode.DST_IN;
	#DST_OUT=PorterDuff.Mode.DST_OUT;
	#DST_OVER=PorterDuff.Mode.DST_OVER;
	#LIGHTEN=PorterDuff.Mode.LIGHTEN;
	#MULTIPLY=PorterDuff.Mode.MULTIPLY;
	#OVERLAY=PorterDuff.Mode.OVERLAY;
	#SCREEN=PorterDuff.Mode.SCREEN;
	#SRC=PorterDuff.Mode.SRC;
	#SRC_ATOP=PorterDuff.Mode.SRC_ATOP;
	#SRC_IN=PorterDuff.Mode.SRC_IN;
	#SRC_OUT=PorterDuff.Mode.SRC_OUT;
	#SRC_OVER=PorterDuff.Mode.SRC_OVER;
	#XOR=PorterDuff.Mode.XOR;
	}
	@end
结束 类

@指代类("android.graphics.BlendMode")
@导入Java("android.graphics.BlendMode")
类 BlendMode


	@静态
	常量 DST : BlendMode?
	@静态
	常量 PLUS : BlendMode?
	@静态
	常量 SCREEM : BlendMode?
	@静态
	常量 SRC : BlendMode?
	@静态
	常量 XOR : BlendMode?

	@code
	static{
		#DST=BlendMode.DST;
		#PLUS=BlendMode.PLUS;
		#SCREEM=BlendMode.SCREEN;
		#SRC=BlendMode.SRC;
		#XOR=BlendMode.XOR;
	}
	@end

结束 类
/*
//2025.2.13
类 Particles

	变量 name : 文本集合
	变量 xmlred : XMLRED
	变量 parts : Particled

	@静态
	方法 init(加载进度 : Stringk,管理器 : 窗口管理器) : Particles
		加载进度.info="particle"
		变量 pts : Particles
		变量 paths : 文本[]=文件操作.取子文件列表("/storage/emulated/0/.pvz/pvz/compiled/particles/finished_xml/")
		循环(i, 0, 取数组长度(paths))
			变量 part : XMLR
			变量 nt=取当前时间戳()
			XMLR.读取xml(part,Stringk.文本(文件操作.读入文本文件(paths[i])),0)
			//日志("xmlr:"+(取当前时间戳()-nt).到文本())
			pts.name.添加成员(文件操作.取文件名(paths[i]))
			pts.xmlred.添加成员(part)
			//pts.parts.添加成员(part)
			加载进度.value="加载特效信息:"+(i+1).到文本()+"/"+取数组长度(paths)+"   "+文件操作.取文件前缀名(取文件名(paths[i]))
			加载进度.int1=i+1
			加载进度.int2=取数组长度(paths)
		结束 循环
		返回 pts
	结束 方法

	方法 get(namew : 文本) : Particle
		循环(i, 0, xmlred.长度)
			如果 name[i]==namew+".reanim" 则
				返回 parts[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法

	@运算符重载
	方法 [](namew : 文本) : XMLR
		循环(i, 0, xmlred.长度)
			如果 name[i]==namew+".reanim" 则
				返回 xmlred[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法

结束 类

类 Particle
结束 类

类 Particled : 集合模板类<Particle>
结束 类
*/
@指代类("android.graphics.ColorMatrix")
类 ColorMatrix
	@静态
	方法 新建() : ColorMatrix
		code return new android.graphics.ColorMatrix();
	结束 方法

	方法 setScale(r : 单精度小数,g : 单精度小数,b : 单精度小数,a : 单精度小数) : ColorMatrix
		code #this.setScale(#r,#g,#b,#a);
		code return #this;
	结束 方法
结束 类

类 SHAPE
	变量 pic : 未加载图
结束 类

类 双整数
	变量 start : 整数
	变量 end : 整数
	变量 clear : 逻辑型=真

	方法 清空(zsn : 整数) : 双整数
		start=zsn
		end=zsn-1
		clear=真
		返回 本对象
	结束 方法

	方法 设置值(zsn : 整数)
		start=zsn
		end=zsn
	结束 方法



	方法 copy() : 双整数
		变量 zs : 双整数
		zs.start=start
		zs.end=end
		返回 zs
	结束 方法
结束 类

@全局类
@静态
类 pvz

结束 类

@强制输出
@导入Java("android.opengl.GLSurfaceView")
@导入Java("android.content.Context")
@导入Java("android.util.AttributeSet")
@导入Java("android.view.View")
@导入Java("android.graphics.Canvas")
@导入Java("android.view.MotionEvent")
@导入Java("android.widget.LinearLayout")
@后缀代码(" extends android.opengl.GLSurfaceView implements View.OnClickListener")
类 GLSurfaceView
	@静态
	方法 创建控件(环境 : 安卓环境) : GLSurfaceView
		code return new #<GLSurfaceView>(#环境);
	结束 方法

	@code
	Context mContext = null;
	
    public #<GLSurfaceView>(Context context) {
        super(context);
        this.mContext = context;
		init();
		#初始化();
    }
 
    public #<GLSurfaceView>(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		init();
		#初始化();
    }
	
	private void init(){
	    this.setEGLContextClientVersion(2); 
		this.setRenderer(new #<Renderer>());
        this.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
	}
	
		@Override  
    public boolean onTouchEvent(MotionEvent event) {  
		return #点击事件(event);
	}
	
	@Override
    public void onClick(View view) {
        //Toast.makeText(mContext, "\n5\n".split("\n")[], 0).show();
    }
	@end

	方法 getWidth() : 整数
		code return this.getWidth();
	结束 方法

	方法 getHeight() : 整数
		code return this.getHeight();
	结束 方法

	方法 setWidth(width : 整数)
		@code
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.width=#width;
		this.setLayoutParams(params_1);
		@end
	结束 方法

	方法 setHeight(height : 整数)
		@code
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.height=#height;
		this.setLayoutParams(params_1);
		@end
	结束 方法

	方法 重绘()

	结束 方法

	方法 添加到(布局 : 布局组件)
		code #布局.getView().addView(this);
	结束 方法

	方法 dispatchTouchEvent(点击事件 : 触摸事件) : 逻辑型
		code return dispatchTouchEvent(#点击事件);
	结束 方法

	定义事件 初始化()
	定义事件 绘图(canvas : Canvas)
	定义事件 点击事件(点击事件 : 触摸事件) : 逻辑型
结束 类

@导入Java("android.opengl.GLSurfaceView.Renderer")
@导入Java("javax.microedition.khronos.opengles.GL10")
@导入Java("javax.microedition.khronos.egl.EGLConfig")
@导入Java("android.opengl.*")
@后缀代码(" implements android.opengl.GLSurfaceView.Renderer")
@输出名("fuckrenderer")
类 Renderer
	@code
	
	private final float[] vPMatrix= new float[16];
	    private final float[] projMatrix= new float[16];
	    private final float[] vMatrix= new float[16];
	    public #<Renderer>() {
		        super();
		}
	
		@Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config){
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f); // 黑色背景
        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {
            GLES20.glViewport(0, 0, width, height);
			float ratio = (float) width / height;
			        // create a projection matrix from device screen geometry
			        Matrix.frustumM(projMatrix, 0, -ratio, ratio, -1, 1, 3, 7);
					Matrix.setLookAtM(vMatrix, 0, 0, 0, -3, 0f, 0f, 0f, 0f, 1.0f, 0.0f);
					        // Combine the projection and camera view matrices
					        Matrix.multiplyMM(vPMatrix, 0, projMatrix, 0, vMatrix, 0);
        }

        @Override
        public void onDrawFrame(GL10 gl) {
            GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        }
		

	@end
结束 类

@强制输出
@导入Java("android.content.Context")
@导入Java("android.util.AttributeSet")
@导入Java("android.view.SurfaceHolder")
@导入Java("android.view.View")
@导入Java("android.graphics.Canvas")
@导入Java("android.view.MotionEvent")
@导入Java("android.widget.LinearLayout")
@后缀代码(" extends android.view.SurfaceView implements SurfaceHolder.Callback, View.OnClickListener")
类 SurfaceView
	@静态
	方法 创建控件(环境 : 安卓环境) : SurfaceView
		code return new #<SurfaceView>(#环境);
	结束 方法

	@code
	Context mContext = null;
	private Thread drawingThread;
    private boolean isRunning;
    private int positionX = 0;
    private final int speedX = 5;
	
    public #<SurfaceView>(Context context) {
        super(context);
        this.mContext = context;
		getHolder().addCallback(this);
		#初始化();
    }
 
    public #<SurfaceView>(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		getHolder().addCallback(this);
		#初始化();
    }
	
	@Override
    public void surfaceCreated(SurfaceHolder holder) {
        isRunning = true;
        drawingThread = new Thread(() -> {
            while (isRunning) {
                Canvas canvas = holder.lockHardwareCanvas();
                if (canvas != null) {
                    synchronized (holder) {
                        #绘图(canvas);
                    }
                    holder.unlockCanvasAndPost(canvas);
                }
            }
        });
        drawingThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        // Handle surface changes if needed
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        isRunning = false;
        try {
            drawingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
    @Override  
    public boolean onTouchEvent(MotionEvent event) {  
		return #点击事件(event);
	}
	
	@Override
    public void onClick(View view) {
        //Toast.makeText(mContext, "\n5\n".split("\n")[], 0).show();
    }
	@end

	方法 getWidth() : 整数
		code return this.getWidth();
	结束 方法

	方法 getHeight() : 整数
		code return this.getHeight();
	结束 方法

	方法 setWidth(width : 整数)
		@code
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.width=#width;
		this.setLayoutParams(params_1);
		@end
	结束 方法

	方法 setHeight(height : 整数)
		@code
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.height=#height;
		this.setLayoutParams(params_1);
		@end
	结束 方法

	方法 添加到(布局 : 布局组件)
		code #布局.getView().addView(this);
	结束 方法

	方法 dispatchTouchEvent(点击事件 : 触摸事件) : 逻辑型
		code return dispatchTouchEvent(#点击事件);
	结束 方法

	定义事件 初始化()
	定义事件 绘图(canvas : Canvas)
	定义事件 点击事件(点击事件 : 触摸事件) : 逻辑型
结束 类
/*
@外部Java文件("../java/canvasgl/CanvasGL.java")
@外部Java文件("../java/canvasgl/ICanvasGL.java")
@外部Java文件("../java/canvasgl/MultiTexOffScreenCanvas.java")
@外部Java文件("../java/canvasgl/OffScreenCanvas.java")
@外部Java文件("../java/canvasgl/OpenGLUtil.java")
@外部Java文件("../java/canvasgl/androidCanvas/AndroidCanvasHelperAsync.java")
@外部Java文件("../java/canvasgl/androidCanvas/AndroidCanvasHelperSync.java")
@外部Java文件("../java/canvasgl/androidCanvas/IAndroidCanvasHelper.java")
@外部Java文件("../java/canvasgl/CanvasGL.java")
@外部Java文件("../java/canvasgl/CanvasGL.java")
@外部Java文件("../java/canvasgl/glcanvas/BasicTexture.java")
@外部Java文件("../java/canvasgl/glcanvas/BitmapTexture.java")
@外部Java文件("../java/canvasgl/glcanvas/GLCanvas.java")
@外部Java文件("../java/canvasgl/glcanvas/GLCanvasUtils.java")
@外部Java文件("../java/canvasgl/glcanvas/GLES20Canvas.java")
@外部Java文件("../java/canvasgl/glcanvas/GLES20IdImpl.java")
@外部Java文件("../java/canvasgl/glcanvas/GLId.java")
@外部Java文件("../java/canvasgl/glcanvas/GLPaint.java")
@外部Java文件("../java/canvasgl/glcanvas/IntArray.java")
@外部Java文件("../java/canvasgl/glcanvas/RawTexture.java")
@外部Java文件("../java/canvasgl/glcanvas/Texture.java")
@外部Java文件("../java/canvasgl/glcanvas/TextureMatrixTransformer.java")
@外部Java文件("../java/canvasgl/glcanvas/UploadedTexture.java")

@外部Java文件("../java/canvasgl/glview/GLContinuousView.java")
@外部Java文件("../java/canvasgl/glview/GLView.java")

@外部Java文件("../java/canvasgl/glview/texture/BaseGLCanvasTextureView.java")
@外部Java文件("../java/canvasgl/glview/texture/BaseGLTextureView.java")
@外部Java文件("../java/canvasgl/glview/texture/GLContinuousTextureView.java")
@外部Java文件("../java/canvasgl/glview/texture/GLMultiTexConsumerView.java")
@外部Java文件("../java/canvasgl/glview/texture/GLMultiTexProducerView.java")
@外部Java文件("../java/canvasgl/glview/texture/GLSharedContextView.java")
@外部Java文件("../java/canvasgl/glview/texture/GLSurfaceTextureProducerView.java")
@外部Java文件("../java/canvasgl/glview/texture/GLTexture.java")
@外部Java文件("../java/canvasgl/glview/texture/GLTextureView.java")
@外部Java文件("../java/canvasgl/glview/texture/GLViewRenderer.java")

@外部Java文件("../java/canvasgl/glview/texture/gles/EGLLogWrapper.java")
@外部Java文件("../java/canvasgl/glview/texture/gles/EglContextWrapper.java")
@外部Java文件("../java/canvasgl/glview/texture/gles/EglHelper.java")
@外部Java文件("../java/canvasgl/glview/texture/gles/EglHelperAPI17.java")
@外部Java文件("../java/canvasgl/glview/texture/gles/EglHelperFactory.java")
@外部Java文件("../java/canvasgl/glview/texture/gles/GLThread.java")
@外部Java文件("../java/canvasgl/glview/texture/gles/IEglHelper.java")

@外部Java文件("../java/canvasgl/matrix/BaseBitmapMatrix.java")
@外部Java文件("../java/canvasgl/matrix/IBitmapMatrix.java")

@外部Java文件("../java/canvasgl/shapeFilter/BasicDrawShapeFilter.java")
@外部Java文件("../java/canvasgl/shapeFilter/DrawCircleFilter.java")
@外部Java文件("../java/canvasgl/shapeFilter/DrawShapeFilter.java")

@外部Java文件("../java/canvasgl/textureFilter/BasicTextureFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/ColorMatrixFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/ContrastFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/CropFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/DarkenBlendFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/DirectionalSobelEdgeDetectionFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/FilterGroup.java")
@外部Java文件("../java/canvasgl/textureFilter/GammaFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/GaussianBlurFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/HueFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/LightenBlendFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/LookupFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/OneValueFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/PixelationFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/RGBFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/SaturationFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/TextureFilter.java")
@外部Java文件("../java/canvasgl/textureFilter/TextureSampling3mul3Filter.java")
@外部Java文件("../java/canvasgl/textureFilter/TwoTextureFilter.java")

@外部Java文件("../java/canvasgl/util/FileLogger.java")
@外部Java文件("../java/canvasgl/util/FileUtil.java")
@外部Java文件("../java/canvasgl/util/Loggers.java")

@强制输出
@导入Java("com.chillingvan.canvasgl.glview.*")
@导入Java("android.content.Context")
@导入Java("android.util.AttributeSet")
@导入Java("android.view.View")
@导入Java("android.graphics.Canvas")
@导入Java("android.view.MotionEvent")
@导入Java("android.widget.LinearLayout")
@导入Java("com.chillingvan.canvasgl.ICanvasGL")
@后缀代码(" extends GLContinuousView implements View.OnClickListener")
类 绘图控件

	@静态
	方法 创建控件(环境 : 安卓环境) : 绘图控件
		code return new #<绘图控件>(#环境);
	结束 方法

	@code
	Context mContext = null;
	
    public #<绘图控件>(Context context) {
        super(context);
        this.mContext = context;
		#初始化();
    }
 
    public #<绘图控件>(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		#初始化();
    }
	
		@Override  
    public boolean onTouchEvent(MotionEvent event) {  
		return #点击事件(event);
	}
	
	@Override
    public void onClick(View view) {
        //Toast.makeText(mContext, "\n5\n".split("\n")[], 0).show();
    }
	
	@Override
    protected void onGLDraw(ICanvasGL canvas) {
	    #绘图(canvas);
	}
	@end

	方法 getWidth() : 整数
		code return this.getWidth();
	结束 方法

	方法 getHeight() : 整数
		code return this.getHeight();
	结束 方法

	方法 setWidth(width : 整数)
		@code
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.width=#width;
		this.setLayoutParams(params_1);
		@end
	结束 方法

	方法 setHeight(height : 整数)
		@code
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.height=#height;
		this.setLayoutParams(params_1);
		@end
	结束 方法

	方法 重绘()

	结束 方法

	方法 添加到(布局 : 布局组件)
		code #布局.getView().addView(this);
	结束 方法

	方法 dispatchTouchEvent(点击事件 : 触摸事件) : 逻辑型
		code return dispatchTouchEvent(#点击事件);
	结束 方法


	定义事件 初始化()
	定义事件 绘图(canvas : ICanvasGL)
	定义事件 点击事件(点击事件 : 触摸事件) : 逻辑型
结束 类

@指代类("com.chillingvan.canvasgl.ICanvasGL")
类 ICanvasGL
	方法 drawBitmap_bmf(b : 位图对象,m : IBitmapMatrix,f : TextureFilter) : ICanvasGL
		code #this.drawBitmap(#b,#m,#f);
		code return #this;
	结束 方法

	方法 drawBitmap_bp(b : 位图对象,left : 整数,top : 整数) : ICanvasGL
		code #this.drawBitmap(#b,#left,#top);
		code return #this;
	结束 方法

	方法 drawBitmap_bpf(b : 位图对象,left : 整数,top : 整数,f : TextureFilter) : ICanvasGL
		code #this.drawBitmap(#b,#left,#top,#f);
		code return #this;
	结束 方法

	方法 drawBitmap_bpl(b : 位图对象,left : 整数,top : 整数,width : 整数,height : 整数) : ICanvasGL
		code #this.drawBitmap(#b,#left,#top,#width,#height);
		code return #this;
	结束 方法

	方法 ITC(b : 位图对象) : ICanvasGL
		code #this.invalidateTextureContent(#b);
		code return #this;
	结束 方法

	方法 save() : ICanvasGL
		code #this.save();
		code return #this;
	结束 方法

	方法 restore() : ICanvasGL
		code #this.restore();
		code return #this;
	结束 方法

	方法 drawBitmap_3(b : 位图对象,m : Matrix,p : Paint)
		变量 mt4 : Matrix4=Matrix4.新建(m)
		drawBitmap_bmf(b,mt4,RGBFilter.新建(1f,1f,1f))
	结束 方法

	方法 绘制文字(内容 : 文本,x : 整数,y : 整数,paint : Paint,纵间距 : 整数,宽度 : 整数=-1)

	结束 方法

	方法 drawRect(x : 单精度小数,y : 单精度小数,w : 单精度小数,h : 单精度小数,paint : Paint)

	结束 方法

	方法 画文字(内容 : 文本,x : 整数,y : 整数,paint : Paint)

	结束 方法

结束 类



@指代类("com.chillingvan.canvasgl.matrix.IBitmapMatrix")
类 IBitmapMatrix
结束 类

@导入Java("com.chillingvan.canvasgl.textureFilter.RGBFilter")
@指代类("com.chillingvan.canvasgl.textureFilter.RGBFilter")
类 RGBFilter : TextureFilter
	@静态
	方法 新建(r : 单精度小数,g : 单精度小数,b : 单精度小数) : RGBFilter
		code return new RGBFilter(#r,#g,#b);
	结束 方法
结束 类


@指代类("com.chillingvan.canvasgl.textureFilter.TextureFilter")
类 TextureFilter
结束 类
/*
@后缀代码("extends com.chillingvan.canvasgl.matrux.IBitmapMatrix")
类 我的类
	@code
	@Oveeride
	public float[] obtainResultMatrix(int viewportW, int viewportH, float x, float y, float drawW, float drawH) {
	@end
结束 类
*/
/*
@强制输出
@导入Java("com.chillingvan.canvasgl.ICanvasGL.BitmapMatrix")
@指代类("com.chillingvan.canvasgl.ICanvasGL.BitmapMatrix")
类 BitmapMatrix
	@静态
	方法 新建() : BitmapMatrix
		code return new BitmapMatrix();
	结束 方法
结束 类

@外部Java文件("../java/canvasgl/matrix/Matrix4.java")
@导入Java("com.chillingvan.canvasgl.matrix.Matrix4")
@指代类("com.chillingvan.canvasgl.matrix.Matrix4")
类 Matrix4 : IBitmapMatrix
	@静态
	方法 新建(f16 : Matrix) : Matrix4
		变量 v=gm2om(f16)
		code return new Matrix4(#v);
	结束 方法
结束 类

@导入Java("com.chillingvan.canvasgl.glview.GLView.GetDrawingCacheCallback")
//@后缀代码("implements com.chillingvan.canvasgl.glview.GLView.GetDrawingCacheCallback")
类 GDCCT
	变量 gdcc : GDCC=空



	方法 新建()
		@code
		#gdcc=new GetDrawingCacheCallback(){
		    @Override
	public void onFetch(android.graphics.Bitmap bitmap){
	    #getFetch(bitmap);
	}
		};
		
		@end
	结束 方法

	定义事件 getFetch(bitmap : 位图对象)
结束 类

@指代类("com.chillingvan.canvasgl.glview.GLView.GetDrawingCacheCallback")
类 GDCC

结束 类

@导入Java("com.chillingvan.canvasgl.OffScreenCanvas")
@导入Java("com.chillingvan.canvasgl.glcanvas.RawTexture")
@导入Java("com.chillingvan.canvasgl.glcanvas.BasicTexture")
@导入Java("android.graphics.SurfaceTexture")
@导入Java("com.chillingvan.canvasgl.ICanvasGL")
类 OSCT

	变量 osc : OSC=空

	方法 新建(长 : 整数=0,宽 : 整数=0)
		@code
		#osc= new OffScreenCanvas(#长,#宽){
		    @Override
            protected void onGLDraw(ICanvasGL canvas, SurfaceTexture producedSurfaceTexture, RawTexture producedRawTexture,
                                    SurfaceTexture outsideSharedSurfaceTexture,BasicTexture outsideSharedTexture) {
                #绘图(canvas);
            }
		};
		#osc.start();
		@end
	结束 方法



	定义事件 绘图(canvas : ICanvasGL)
结束 类

@指代类("com.chillingvan.canvasgl.OffScreenCanvas")
类 OSC
	方法 getDrawingBitmap(rect : 矩形,gdcc : GDCC)
		code #this.getDrawingBitmap(#rect,#gdcc);
	结束 方法
结束 类
*/
@指代类("com.badlogic.gdx.ApplicationAdapter")
类 ApplicationAdapter

结束 类



@导入Java("android.os.*")
@导入Java("android.content.*")
@导入Java("android.view.KeyEvent")
@导入Java("android.os.Bundle")
类 Setup:AndroidApplication

	@code
	private #<可视化组件> root;
	
    @Override
    protected void onCreate(Bundle savedBundleInstance) {
		#即将创建();
		super.onCreate(savedBundleInstance);
        onInit();
        #创建完毕();
    }

    
	
	protected void setLayout(#<可视化组件> root) {
		this.root = root;
		setContentView(root.getView());
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		#被启动();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		#被重新启动();
	}

	@Override
	protected void onStop() {
		super.onStop();
		#被停止();
	}

	@Override
	protected void onPause() {
		super.onPause();
		#被暂停();
	}

	@Override
	protected void onResume() {
		super.onResume();
		#被恢复();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		#被销毁();
	}
	
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		#菜单被创建(menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(android.view.MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			#标题栏返回键被单击();
		} else {
			#菜单项被选中(item);
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		#获得返回数据(requestCode, resultCode, data);
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		#申请权限完毕(requestCode, permissions, grantResults);
	}
	
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	return #按下某键(keyCode) ? true : super.onKeyDown(keyCode, event);
    }
    @end

	/*
	窗口即将创建时触发该事件
	*/
	@虚拟事件
	方法 即将创建()
	结束 方法

	/*
	窗口创建完毕时触发该事件
	*/
	@虚拟事件
	@自动订阅事件
	方法 创建完毕()
	结束 方法

	/*
	窗口被启动时触发该事件
	*/
	@虚拟事件
	方法 被启动()
	结束 方法

	/*
	窗口被重新启动时触发该事件
	*/
	@虚拟事件
	方法 被重新启动()
	结束 方法

	/*
	窗口被暂停时触发该事件
	*/
	@虚拟事件
	方法 被暂停()
	结束 方法

	/*
	窗口被启动时触发该事件
	*/
	@虚拟事件
	方法 被停止()
	结束 方法

	@虚拟事件
	方法 被恢复()
	结束 方法

	@虚拟事件
	方法 被销毁()
	结束 方法

	@虚拟事件
	方法 菜单被创建(菜单 : 菜单)
	结束 方法

	@虚拟事件
	方法 菜单项被选中(菜单项 : 菜单项)
	结束 方法

	@虚拟事件
	方法 标题栏返回键被单击()
	结束 方法

	/*
	当窗口要求另一个窗口返回数据成功时，会触发该事件用于接收返回数据
	*/
	@虚拟事件
	方法 获得返回数据(请求码 : 整数,结果码 : 整数,数据 : 启动信息)
	结束 方法

	@虚拟事件
	方法 申请权限完毕(请求码 : 整数,权限集 : 文本[],允许结果 : 整数[])
	结束 方法

	@输出名("onBackPressed")
	@虚拟方法
	方法 返回键被按下()
		code super.onBackPressed();
	结束 方法

	@虚拟方法
	方法 按下某键(键代码:整数):逻辑型
		返回 假
	结束 方法

	/*
	设置窗口布局内容
	*/
	方法 置窗口布局(布局 : 可视化组件)
		code setLayout(#布局);
	结束 方法

	/*
	设置窗口布局内容
	*/
	方法 置窗口布局2(布局 : 组件容器)
		@code
		setLayout(#<布局.取根布局>());
		#<布局.创建完毕>();
		@end
	结束 方法

	/*
	获取窗口布局内容
	*/
	方法 取窗口布局() : 可视化组件
		@code
		return this.root;
		@end
	结束 方法

	方法 游戏初始化(listener:AA,config:AAC)
		code initialize(#listener,#config);
	结束 方法

结束 类

@强制输出
类 AA:ApplicationAdapter
	@code
	@Override
	public void create () {
	    #onCreate();
	}
	
    @Override
	public void render () {
	    #onRender();
	}
	
	@Override
	public void resize (int width, int height) {
	    #onResize(width,height);
	}

	@Override
	public void pause () {
	    #onPause();
	}

	@Override
	public void resume () {
	     #onResume();
	}

	@Override
	public void dispose () {
	      #onDispose();
	}
	@end

	@虚拟事件
	方法 onCreate()

	结束 方法


	定义事件 onRender()


	@虚拟事件
	方法 onResize(宽:整数,高:整数)

	结束 方法

	@虚拟事件
	方法 onPause()

	结束 方法

	@虚拟事件
	方法 onResume()

	结束 方法

	@虚拟事件
	方法 onDispose()

	结束 方法
结束 类

@指代类("com.badlogic.gdx.backends.android.AndroidApplicationConfiguration")
类 游戏配置类
结束 类


@指代类("com.badlogic.gdx.backends.android.AndroidApplication")
类 AndroidApplication:安卓窗口
结束 类

@指代类("com.badlogic.gdx.backends.android.AndroidApplicationConfiguration")
类 AAC
结束 类
@强制输出
@导入Java("android.os.Bundle")
类 游戏启动类:AndroidApplication
	@code
	   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      #创建完毕();
   }
   @end

	@虚拟事件
	方法 创建完毕()
	结束 方法

	方法 initialize(listener:AA,config:AAC)
		code initialize(#listener,#config);
	结束 方法

结束 类

类 SB:SpriteBatch
	@code
	public #<SB>() {
	   super();
	}
	
	public #<SB>(int size) {
	   super(size);
	}
	@end

	方法 开始绘制()
		code begin();
	结束 方法

	方法 绘制(绘制对象:Texture,位置X:单精度小数, 位置Y:单精度小数)
		code draw(#绘制对象,#位置X,#位置Y);
	结束 方法

	方法 绘制(绘制对象:TextureRegion,位置X:单精度小数, 位置Y:单精度小数)
		code draw(#绘制对象,#位置X,#位置Y);
	结束 方法

	方法 绘制(绘制对象:TextureRegion,位置X:单精度小数, 位置Y:单精度小数)
		code draw(#绘制对象,#位置X,#位置Y);
	结束 方法

	方法 绘制(绘制对象:Texture,位置X:单精度小数, 位置Y:单精度小数,宽:单精度小数, 高:单精度小数)
		code draw(#绘制对象,#位置X,#位置Y,#宽,#高);
	结束 方法



	方法 绘制(绘制对象:TextureRegion,位置X:单精度小数, 位置Y:单精度小数, 宽:单精度小数, 高:单精度小数)
		code draw(#绘制对象,#位置X,#位置Y,#宽,#高);
	结束 方法

	方法 结束绘制()
		code end();
	结束 方法

	方法 置视图矩阵(矩阵:Matrix_4)
		code setProjectionMatrix(#矩阵);
	结束 方法

	方法 回收资源()
		code dispose();
	结束 方法

结束 类

@导入Java("com.badlogic.gdx.graphics.g2d.Sprite")
@指代类("com.badlogic.gdx.graphics.g2d.Sprite")
类 Sprite : TextureRegion

	方法 从Sprite新建(sprite : Sprite) : Sprite
		code return new Sprite(#sprite);
	结束 方法

	方法 新建() : Sprite
		code return new Sprite();
	结束 方法

	方法 从纹理新建(texture : Texture) : Sprite
		code return new Sprite(#texture);
	结束 方法

	方法 draw_s(spritebatch : SpriteBatch)
		code #this.draw(#spritebatch);
	结束 方法

	方法 setPosition(x : 单精度小数,y : 单精度小数)
		code #this.setPosition(#x,#y);
	结束 方法

	方法 setAlpha(alpha : 单精度小数) : Sprite
		code #this.setAlpha(#alpha);
		code return #this;
	结束 方法
	/*
	@code
	public #<Sprite>() {
	   super();
	}
	
	public #<Sprite>(#<Sprite> sprite) {
	   super(sprite);
	}
	
	public #<Sprite>(#<Texture> texture) {
	   super(texture);
	}
	
	public #<Sprite>(#<Texture> texture, int width, int height) {
	   super(texture,width,height);
	}
	
	public #<Sprite>(#<Texture> texture, int srcX, int srcY, int srcWidth, int srcHeight) {
	   super(texture,srcX,srcY,srcWidth,srcHeight);
	}
	
	public #<Sprite>(#<TextureRegion> region) {
	   super(region);
	}
	
	public #<Sprite>(#<TextureRegion> reg, int srcX, int srcY, int srcWidth, int srcHeight) {
	   super(reg,srcX,srcY,srcWidth,srcHeight);
	}
	@end
	*/
	方法 绘制(绘制对象:SpriteBatch)
		code #this.draw(#绘制对象);
	结束 方法

	方法 绘制(绘制对象:SpriteBatch, alphaModulation:单精度小数)
		code #this.draw(#绘制对象,#alphaModulation);
	结束 方法

	方法 绘制颜色(颜色:Color) : Sprite
		code #this.setColor(#颜色);
		code return #this;
	结束 方法

	方法 绘制颜色(R:整数,G:整数, B:整数, A:整数)
		code setColor(#R, #G, #B, #A);
	结束 方法

	方法 置属性(X:单精度小数, Y:单精度小数, 宽:单精度小数, 高:单精度小数)
		code setBounds(#X,#Y,#宽,#高);
	结束 方法

	方法 置大小(宽:单精度小数, 高:单精度小数)
		code setSize(#宽,#高);
	结束 方法

	方法 翻转(翻转X:逻辑型, 翻转Y:逻辑型)
		code flip(#翻转X,#翻转Y);
	结束 方法

	方法 强制翻转(翻转X:逻辑型, 翻转Y:逻辑型)
		code setFlip(#翻转X,#翻转Y);
	结束 方法

	方法 中心点(X:单精度小数, Y:单精度小数)
		code setCenter(#X,#Y);
	结束 方法

	方法 中心点X(X:单精度小数)
		code setCenterX(#X);
	结束 方法

	方法 中心点Y(Y:单精度小数)
		code setCenterY(#Y);
	结束 方法

	方法 缩放与旋转原点(X:单精度小数, Y:单精度小数)
		code setOrigin(#X,#Y);
	结束 方法

	@静态
	方法 取Sprite(纹理:Texture):Sprite
		code return new Sprite(#纹理);
	结束 方法
结束 类

@导入Java("com.badlogic.gdx.graphics.g2d.TextureRegion")
@指代类("com.badlogic.gdx.graphics.g2d.TextureRegion")
类 TextureRegion
	@静态
	方法 新建() : TextureRegion
		code return new TextureRegion();
	结束 方法

	@静态
	方法 从Texture新建(texture : Texture) : TextureRegion
		code return new TextureRegion(#texture);
	结束 方法

	@静态
	方法 从Texture新建_twh(texture : Texture,width : 整数,height : 整数) : TextureRegion
		code return new TextureRegion(#texture,#width,#height);
	结束 方法

	方法 filp(x : 逻辑型,y : 逻辑型) : TextureRegion
		code #this.flip(#x,#y);
		code return #this;
	结束 方法

	方法 getRegionWidth() : 整数
		code return #this.getRegionWidth();
	结束 方法

	方法 getRegionHeight() : 整数
		code return #this.getRegionHeight();
	结束 方法

结束 类

@指代类("com.badlogic.gdx.graphics.g2d.SpriteBatch")
类 SpriteBatch : Batch
	方法 开始绘制()
		code #this.begin();
	结束 方法

	方法 draw_trxy(tr : TextureRegion,x : 单精度小数,y : 单精度小数) : SpriteBatch
		code #this.draw(#tr,#x,#y,0,0,#tr.getRegionWidth(),#tr.getRegionHeight(),1.0f,1f,0f);
		code return #this;
	结束 方法

	方法 draw_pm3a(pixmap : Pixmap,matrix : Matrix,alpha : 单精度小数=1f,height : 整数)
		dt_tma(Texture.从PixMap新建(pixmap),matrix,alpha,height)
	结束 方法

	方法 draw_pm3c(pixmap : Pixmap,matrix : Matrix,color : 单精度小数[],height : 整数,gm : 窗口管理器)
		变量 ts : Texture=Texture.从PixMap新建(pixmap)
		dt_tmc(ts,matrix,color,height,gm)
	结束 方法

	方法 draw_txy(t : Texture,x : 单精度小数,y : 单精度小数) : SpriteBatch
		code #this.draw(#t,#x,#y);
		code return #this;
	结束 方法

	方法 dt_tma(texture : Texture,matrix : Matrix,alpha : 单精度小数=1f,height : 整数,gm : 窗口管理器=空)
		/*
		变量 vsp :单精度小数[]=ctl2bl(matrix,height,texture.getHeight()).getValues()
		
		//变量 azt=取当前纳秒时间戳()
		vsp=矩阵转置_m3(vsp)
		
		//日志("处理一张时间:"+(取当前纳秒时间戳()-azt).到文本()+"  height= "+texture.getHeight())
		//变量 m4 : Matrix_4=Matrix_4.从Matrix_3新建(Matrix_3.从floats新建(vsp))
		
		变量 aff=Affine2.从Matrix3创建(Matrix_3.从floats新建(vsp))
		//变量 sprite : Sprite=Sprite.取Sprite(texture).绘制颜色(color)
		//变量 原始矩陣=gtm()
		//
		//stm(m4)
		//
		
		变量 thisw : SpriteBatch=空
		code #thisw=#this;
		
		变量 tr : Sprite=Sprite.取Sprite(texture)
		//tr.setAlpha(0.5f)
		//tr.绘制颜色(Color.新建_r_g_b_a(0.5f,0.5f,1.5f,0.5f))
		/*
		如果 rgbShader!=空 则
			如果 alpha!=1 则
				rgbShader.setUniformf1("u_opacity",alpha)
			结束 如果
			如果 保留渲染值==假 则
				rgbShader.setUniformf3("u_rgbFactors",1,1,1)
			结束 如果
		结束 如果*/
		/*
		变量 azt=取当前纳秒时间戳()
		code#this.setColor(0.36f,0.36f,3.24f,1f);
		thisw.draw_trwha2(tr,texture.getWidth(),texture.getHeight(),aff)
		如果 gm!=空 则
			gm.nullait=gm.nullait+取当前纳秒时间戳()-azt
		结束 如果
		*/
		//变量 color : Color=Color.新建_r_g_b_a(alpha,1,1,1)
		//	dt_tma(texture,matrix,alpha,height)
		变量 color : 单精度小数[]={1f,1,1,alpha}
		dt_tmc(texture,matrix,color,height,gm)
	结束 方法

	方法 draw_txywh(texture : Texture,x : 单精度小数,y : 单精度小数,width : 单精度小数,height : 单精度小数)
		code #this.draw(#texture,#x,#y,#width,#height);
	结束 方法

	方法 dt_tmc(texture : Texture,matrix : Matrix,cm : 单精度小数[],height : 整数,gm : 窗口管理器)
		变量 vsp :单精度小数[]=ctl2bl(matrix,height,texture.getHeight()).getValues()

		vsp=矩阵转置_m3(vsp)

		//日志("处理一张时间:"+(取当前纳秒时间戳()-azt).到文本()+"  height= "+texture.getHeight())
		//变量 m4 : Matrix_4=Matrix_4.从Matrix_3新建(Matrix_3.从floats新建(vsp))

		变量 aff=Affine2.从Matrix3创建(Matrix_3.从floats新建(vsp))
		//变量 sprite : Sprite=Sprite.取Sprite(texture).绘制颜色(color)
		//变量 原始矩陣=gtm()
		//
		//stm(m4)
		//

		变量 thisw : SpriteBatch=空
		code #thisw=#this;

		变量 tr : Sprite=Sprite.取Sprite(texture)
		//tr.setAlpha(0.5f)
		//tr.绘制颜色(Color.新建_r_g_b_a(0.5f,0.5f,1.5f,0.5f))
		/*
		如果 rgbShader!=空 则
			如果 alpha!=1 则
				rgbShader.setUniformf1("u_opacity",alpha)
			结束 如果
			如果 保留渲染值==假 则
				rgbShader.setUniformf3("u_rgbFactors",1,1,1)
			结束 如果
		结束 如果*/
		变量 rgbShader : ShaderProgram=getShader()
		//	rgbShader.setUniformf1("u_opacity",cm[3])
		//code#this.setColor(0,0,0,1f);
		thisw.draw_trwha2(tr,texture.getWidth(),texture.getHeight(),aff)
		rgbShader.setUniformf1("u_opacity",cm[3])
		rgbShader.setUniformf3("u_rgbFactors",cm[0],cm[1],cm[2])

		//code#this.setColor(1,1,1,1);
		变量 azt=取当前纳秒时间戳()
		如果 gm!=空 则
			gm.nullait=gm.nullait+取当前纳秒时间戳()-azt
		结束 如果
		//sprite.绘制(thisw);
	结束 方法

	方法 getShader() : ShaderProgram
		code return #this.getShader();
	结束 方法

	方法 draw_trwha2(tr : TextureRegion,w : 整数,h : 整数,a2 : Affine2)
		code #this.draw(#tr,#w,#h,#a2);
	结束 方法


	方法 gtm() : Matrix_4
		code return #this.getTransformMatrix();
	结束 方法

	方法 stm(matrix4 : Matrix_4)
		code #this.setTransformMatrix(#matrix4);
	结束 方法


	方法 结束绘制()
		code #this.end();
	结束 方法
结束 类

//2025.7.31 9:15:59pm
@导入Java("com.badlogic.gdx.math.Affine2")
@指代类("com.badlogic.gdx.math.Affine2")
类 Affine2
	@静态
	方法 从Matrix3创建(m3 : Matrix_3) : Affine2
		code Affine2 a2= new Affine2();
		code a2.set(#m3);
		code return a2;
	结束 方法
结束 类

@导入Java("com.badlogic.gdx.graphics.Texture")
@指代类("com.badlogic.gdx.graphics.Texture")
类 Texture
	@静态
	方法 从PixMap新建(pixmap : Pixmap) : Texture
		@code
		Texture texture = new Texture(#pixmap,true);
texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

		 return texture;
		@end
	结束 方法

	@静态
	方法 从FileHandle创建(fh : FileHandle) : Texture
		code return new Texture(#fh);
	结束 方法

	@静态
	方法 从文件路径创建(path : 文本) : Texture
		code return new Texture(#path);
	结束 方法

	方法 getWidth() : 整数
		code return #this.getWidth();
	结束 方法

	方法 getHeight() : 整数
		code return #this.getHeight();
	结束 方法



结束 类

@导入Java("com.badlogic.gdx.graphics.Color")
@指代类("com.badlogic.gdx.graphics.Color")
类 Color
	@静态
	方法 新建() : Color
		code return new Color();
	结束 方法

	@静态
	方法 新建_rgba(rgba : 整数) : Color
		code return new Color(#rgba);
	结束 方法

	@静态
	方法 新建_r_g_b_a(r : 单精度小数,g : 单精度小数,b : 单精度小数,a : 单精度小数) : Color
		code return new Color(#r,#g,#b,#a);
	结束 方法

	@静态
	方法 新建_c(color : Color) : Color
		code return new Color(#color);
	结束 方法

	方法 set(r : 单精度小数,g : 单精度小数,b : 单精度小数,a : 单精度小数)
		code #this.set(#r,#g,#b,#a);
	结束 方法

结束 类

@外部依赖库("../libgdx/jar")
@强制输出
@导入Java("com.badlogic.gdx.graphics.Pixmap")
@导入Java("java.nio.*")
@指代类("com.badlogic.gdx.graphics.Pixmap")
类 Pixmap

	@静态
	方法 新建(width : 整数,height : 整数) : Pixmap
		code return new Pixmap(#width,#height,Pixmap.Format.RGBA8888);
	结束 方法

	@静态
	方法 从ColorSet创建(cs : ColorSet) : Pixmap
		//变量 b=cs.b
		//变量 wid=cs.wid
		//变量 hei=cs.hei
		@code
		int[] pixels=#<cs.b>;
		int width=#<cs.wid>;
		int height=#<cs.hei>;

    // 创建 Pixmap，格式必须选 RGBA8888（libGDX 内部是 RGBA 顺序）
    Pixmap pixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);

    // 获取底层 ByteBuffer（每个像素 4 字节，顺序为 RGBA）
    ByteBuffer buffer = pixmap.getPixels();
    buffer.clear();

    for (int pixel : pixels) {
        // pixel: 0xAARRGGBB
        int r = (pixel >> 16) & 0xff;
        int g = (pixel >>  8) & 0xff;
        int b = (pixel      ) & 0xff;
        int a = (pixel >> 24) & 0xff;

        // 按 RGBA 顺序写入
        buffer.put((byte) r);
        buffer.put((byte) g);
        buffer.put((byte) b);
        buffer.put((byte) a);
    }

    buffer.flip(); // 可选，确保指针回到开头
    return pixmap;

		@end
	结束 方法

	@静态
	方法 从Bitmap创建(bitmap : 位图对象) : Pixmap
		变量 b : 整数[]=数组创建(整数,bitmap.宽度*bitmap.高度)
		Bitmap_getPixels(bitmap,b,0,bitmap.宽度,0,0,bitmap.宽度,bitmap.高度)
		变量 pixmap = Pixmap.新建(bitmap.宽度, bitmap.高度)
		变量 c : 字节[]=整数集转字节集(b)
		变量 buffer  : ByteBuffer= 空
		code #buffer=#pixmap.getPixels();
		code #buffer.clear();
		code #buffer.put(#c);
		code #buffer.flip();
		返回 pixmap
	结束 方法

	方法 width() : 整数
		code return #this.getWidth();
	结束 方法

	方法 height() : 整数
		code return #this.getHeight();
	结束 方法
结束 类

@导入Java("com.badlogic.gdx.Gdx")
@导入Java("com.badlogic.gdx.graphics.Pixmap")
@导入Java("com.badlogic.gdx.graphics.glutils.FrameBuffer")
@指代类("com.badlogic.gdx.graphics.glutils.FrameBuffer")
类 FrameBuffer
	@静态
	方法 新建(width : 整数,height : 整数) : FrameBuffer
		code return new FrameBuffer(Pixmap.Format.RGB888,#width,#height,true);
	结束 方法

	方法 开始()
		code #this.begin();
	结束 方法

	方法 终止()
		code #this.end();
	结束 方法

	方法 取纹理() : Texture
		code return #this.getColorBufferTexture();
	结束 方法

结束 类

@导入Java("com.badlogic.gdx.graphics.glutils.ShaderProgram")
@指代类("com.badlogic.gdx.graphics.glutils.ShaderProgram")
类 ShaderProgram
	@静态
	方法 新建(vertexShader : 文本,fragmentShader : 文本) : ShaderProgram
		code return new ShaderProgram(#vertexShader,#fragmentShader);
	结束 方法
    
	@静态
	方法 setPedantic(bool : 逻辑型)
		code ShaderProgram.pedantic=#bool;
	结束 方法

	方法 setUniformf3(name : 文本,a : 单精度小数,b : 单精度小数,c : 单精度小数)
		code #this.setUniformf(#name,#a,#b,#c);
	结束 方法
	
	方法 setUniformf4(name : 文本,a : 单精度小数,b : 单精度小数,c : 单精度小数,d : 单精度小数)
		code #this.setUniformf(#name,#a,#b,#c,#d);
	结束 方法

	方法 setUniformf1(name : 文本,a : 单精度小数)
		code #this.setUniformf(#name,#a);
	结束 方法
结束 类

//libgdx
@导入Java("com.badlogic.gdx.math.Matrix3")
@指代类("com.badlogic.gdx.math.Matrix3")
类 Matrix_3

	@静态
	方法 从floats新建(f9 : 单精度小数[]) : Matrix_3
		code return new Matrix3(#f9);
	结束 方法
结束 类

//libgdx
@导入Java("com.badlogic.gdx.math.Matrix4")
@指代类("com.badlogic.gdx.math.Matrix4")
类 Matrix_4
	@静态
	方法 从Matrix_3新建(m3 : Matrix_3) : Matrix_4
		code Matrix4 temp= new Matrix4();
		code temp.set(#m3);
		code return temp;
	结束 方法
结束 类

@后缀代码("implements com.badlogic.gdx.InputProcessor")
类 MIP
	@code
	@Override
    public boolean keyDown(int keycode) {
	/*
        if (keycode == Input.Keys.SPACE) {
            System.out.println("Space key pressed");
        }
		*/
        return true; // 返回 true 表示事件已处理
    }

    @Override
    public boolean keyUp(int keycode) {
	/*
        if (keycode == Input.Keys.SPACE) {
            System.out.println("Space key released");
        }*/
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        System.out.println("Key typed: " + character);
        return true;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        //System.out.println("Touch down at: " + screenX + ", " + screenY);
		#touchDown(screenX,screenY);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        //System.out.println("Touch up at: " + screenX + ", " + screenY);
		#touchUp(screenX,screenY);
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        //System.out.println("Touch dragged to: " + screenX + ", " + screenY);
		#touchDragged(screenX,screenY);
        return true;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        System.out.println("Mouse moved to: " + screenX + ", " + screenY);
        return true;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        System.out.println("Scrolled: " + amountX + ", " + amountY);
        return true;
    }
	@end

	方法 touchDown(x : 整数,y : 整数)
		触摸事件(新建触摸事件(取当前时间戳(),0,x,y))
	结束 方法

	方法 touchDragged(x : 整数,y : 整数)
		触摸事件(新建触摸事件(取当前时间戳(),2,x,y))
	结束 方法

	方法 touchUp(x : 整数,y : 整数)
		触摸事件(新建触摸事件(取当前时间戳(),1,x,y))
	结束 方法

	定义事件 触摸事件(触摸 : 触摸事件)


结束 类

@导入Java("com.badlogic.gdx.graphics.glutils.ShapeRenderer")
@指代类("com.badlogic.gdx.graphics.glutils.ShapeRenderer")
类 ShapeRenderer
	@静态
	方法 新建() : ShapeRenderer
		code return new ShapeRenderer();
	结束 方法

	方法 开始()
		code #this.begin();
	结束 方法

	方法 终止()
		code #this.end();
	结束 方法

	方法 setColor(颜色:Color) : Sprite
		code #this.setColor(#颜色);
		code return #this;
	结束 方法

	方法 setColor_r_g_b_a(R:整数,G:整数, B:整数, A:整数)
		code setColor(#R, #G, #B, #A);
	结束 方法

	方法 rect(x : 单精度小数,y : 单精度小数,width : 单精度小数,height : 单精度小数)
		code rect(#x,#y,#width,#height);
	结束 方法

结束 类

@强制输出
@导入Java("com.badlogic.gdx.graphics.glutils.ShapeRenderer")
@指代类("com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType")
类 ShapeType
	方法 Line() : ShapeType
		code return ShapeRenderer.ShapeType.Line;
	结束 方法
结束 类

@强制输出
@导入Java("com.badlogic.gdx.graphics.g2d.BitmapFont")
@指代类("com.badlogic.gdx.graphics.g2d.BitmapFont")
类 BitmapFont
	@静态
	方法 新建(fnt : FileHandle,png : FileHandle) : BitmapFont
		code return new BitmapFont(#fnt,#png,false);
	结束 方法

	@静态
	方法 新建_trs(fnt : FileHandle,png : Array) : BitmapFont
		code return new BitmapFont(new BitmapFont.BitmapFontData(#fnt,false),#png,false);
	结束 方法

	方法 getData() : BitmapFontData
		code return #this.getData();
	结束 方法

	方法 setColor(color : Color)
		code #this.setColor(#color);
	结束 方法

	方法 draw_6(batch : Batch,str : 文本,x : 单精度小数,y : 单精度小数)
		变量 texts : 文本[]=str.分割文本("\n")
		变量 i2=0
		循环(i, 0, 取数组长度(texts))
			//日志("动态"+(y-i2*100).到文本()+"   "+texts[i]+"  "+i)
			draw_bsxy(batch,texts[i],x,y-i2*100)
			i2=i2+1
		结束 循环
	结束 方法

	方法 draw_bsxy(batch : Batch,str : 文本,x : 单精度小数,y : 单精度小数)
		code #this.draw(#batch,#str,#x,#y);
	结束 方法
结束 类

@强制输出
@导入Java("com.badlogic.gdx.files.FileHandle")
@指代类("com.badlogic.gdx.files.FileHandle")
类 FileHandle
	@静态
	方法 新建(path : 文本) : FileHandle
		code return new FileHandle(#path);
	结束 方法


结束 类

@强制输出
@导入Java("com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData")
@指代类("com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData")
类 BitmapFontData

	方法 setScale(scale : 单精度小数)
		code #this.setScale(#scale);
	结束 方法
结束 类

@强制输出
@导入Java("com.badlogic.gdx.graphics.g2d.Batch")
@指代类("com.badlogic.gdx.graphics.g2d.Batch")
类 Batch

结束 类

@强制输出
@导入Java("com.badlogic.gdx.utils.Array")
@指代类("com.badlogic.gdx.utils.Array")
类 Array

结束 类

@输出名("Point")
类 Point
	变量 x : 单精度小数
	变量 y : 单精度小数
	
	@静态
	方法 新建(x : 单精度小数,y : 单精度小数) : Point
		变量 point : Point
		point.x=x
		point.y=y
		返回 point
	结束 方法
结束 类

类 判定矩形
	变量 points : Pointed
	变量 name : 文本
	变量 按下时间 : 长整数
	变量 按下坐标 : Point
	
	@静态
	方法 新建_list(x1 : 单精度小数,y1 : 单精度小数,x2 : 单精度小数,y2 : 单精度小数,x3 : 单精度小数,y3 : 单精度小数,x4 : 单精度小数,y4 : 单精度小数) : 判定矩形
		变量 p1=Point.新建(x1,y1)
		变量 p2=Point.新建(x2,y2)
		变量 p3=Point.新建(x3,y3)
		变量 p4=Point.新建(x4,y4)
		返回 新建({p1,p2,p3,p4})
	结束 方法
	
	@静态
	方法 新建(points : Point[]) : 判定矩形
		变量 判定矩形1 : 判定矩形
		判定矩形1.points=points
		返回 判定矩形1
	结束 方法
	
	方法 是点击(point : Point) : 逻辑型
		变量 time=取当前时间戳()-按下时间
		如果 time<200 则
			变量 xt=数学运算.取绝对值(按下坐标.x-point.x)
			变量 yt=数学运算.取绝对值(按下坐标.y-point.y)
			如果 xt<10&&yt<10 则
				返回 真
			结束 如果
		结束 如果
		返回 假
	结束 方法
	
	方法 判定(point : Point) : 逻辑型
		变量 quad=points.到数组()
		@code
		Point[] quad=#quad;
		Point touch=#point;
        if (quad.length != 4) {
            throw new IllegalArgumentException("四边形必须有四个顶点");
        }

        // 计算四边形的面积（分成两个三角形）
        double area1 = #<操作类.三角形面积>(quad[0], quad[1], quad[2]);
        double area2 = #<操作类.三角形面积>(quad[0], quad[2], quad[3]);
        double area_quad = area1 + area2;

        // 计算触摸点与四边形构成的四个三角形的面积
        double area_sum = 0;
        for (int i = 0; i < 4; i++) {
            Point p1 = quad[i];
            Point p2 = quad[(i + 1) % 4];
            area_sum += #<操作类.三角形面积>(touch, p1, p2);
        }

        // 允许一定的浮点误差
        return Math.abs(area_sum - area_quad) < 1;
@end
	结束 方法
	
	定义事件 划过(point : Point,状态 : 文本)
	定义事件 点击(point : Point)
结束 类

类 Pointed : 集合模板类<Point>
结束 类

类 矩形集_list : 集合模板类<判定矩形>
	
	
结束 类

类 矩形集 : 矩形集_list
	变量 当前矩形名称 : 文本
	
	方法 取矩形(name : 文本) : 判定矩形
		循环(i, 0, 本对象.长度)
			如果 name==本对象[i].name 则
				返回 本对象[i]
			结束 如果
		结束 循环
		返回 空
	结束 方法
结束 类

类 四边形
	变量 x : 单精度小数
	变量 y : 单精度小数
	变量 width : 单精度小数
	变量 height : 单精度小数
	变量 x乘数 : 单精度小数=1f
	变量 y乘数 : 单精度小数=1f
	
	@静态
	方法 新建(x : 单精度小数,y : 单精度小数,w : 单精度小数,h : 单精度小数,xc : 单精度小数=1f,yc : 单精度小数=1f) : 四边形
		变量 sbx : 四边形
		sbx.x=x
		sbx.y=y
		sbx.width=w
		sbx.height=h
		sbx.x乘数=xc
		sbx.y乘数=yc
		返回 sbx
	结束 方法
结束 类