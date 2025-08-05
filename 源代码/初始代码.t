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
//2025.2.3开始编写
//2025.2.3实现动画播放
//2025.2.5完成加载界面
//2025.2.5完成动画补帧
//2025.2.6完善僵尸动态速度变更
//2025.2.6性能优化
//2025.2.7史诗级优化(今天换了显卡rtx4060ti)
//2025.2.8传奇级优化
//2025.2.9_ground实现
//2025.2.10动画演化实现/僵尸啃食动作完善
//2025.2.11实现动画代理/动画方面基本完善/制作植物
//2025.2.12可移植性完善/性能优化
//2025.2.13完善首次启动界面
//2025.2.27
//2025.3.1
//2025.3.2
//2025.3.15
//2025.3.16
//2025.3.27
//2025.3.28完善细节
//2025.3.28完善特效/运行到一半手机重启是什么情况
//2025.7.17我回来了，动画加载改为实时加载
//2025.7.21修复了anim的一些问题
//7.27制作子弹击中特效
//7.28优化格子坐标算法
//7.29见下
//7.30见下
//7.31见下
//8.1这三天将渲染引擎转为libgdx,原来是原生的canvas&drawbitmap
//8.2修复了shaderProgram的奇怪问题，增加樱桃炸弹爆炸特效
//8.3实现主界面
//8.4实现舞王僵尸
//@外部依赖库("../jar/classes-4.jar")
//@附加资源("../assets")
//@外部动态库("../../lib")
@输出名("上帝")
@外部依赖库("../libgdx/jar")
@外部动态库("../libgdx/libs")
@全局主题("Blue")
@导入Java("android.content.Intent")
@导入Java("android.os.*")
类 启动窗口 : 窗口

	@布局配置([[根布局=真,宽度=-1,高度=-1]])
	变量 线性布局1 : 线性布局
	@布局配置([[父布局=线性布局1,宽度=-1,高度=-1]])
	变量 Editor1 : 编辑框

	变量 view : 控件=空

	变量 width : 整数
	变量 height : 整数
	变量 帧长 : 整数=1000/60
	变量 index : 整数
	变量 trackw : XMLR

	变量 管理器 : 窗口管理器
	变量 loadbreak : 逻辑型=假

	变量 res : XMLR

	变量 atime : 整数[]=创建整数数组(100)
	变量 stn : 整数=0
	变量 atimemax : 整数=1
	变量 btime : 整数
	变量 btimemax : 整数
	变量 statepath : 文本="/storage/emulated/0/.pvz/log."

	//变量 绘制消耗帧 : 整数=帧长
	变量 初始化次数 : 整数=0
	变量 禁止初始化 : 逻辑型=假
	//变量 反色显示 : 逻辑型=假
	//变量 version="0.25.804.2 alpha dev(vb32.250804.415170)"

	//变量 ldt : 长整数=0L
	//a.b.c.d vb e.f.g
	//a 大版本号，记录重大更新次数
	//b 年份 c 月日 d 当日更新次数
	//e 制作总天数 f 日期 g tiecode代码文件字节数





	事件 启动窗口:即将创建()
		/*
		view=控件.创建控件(本对象)
		width=系统操作.取屏幕宽度(本对象)
		height=系统操作.取屏幕高度(本对象)
		*/
	结束 事件

	事件 启动窗口:创建完毕()
		/*
		code getWindow().setBackgroundDrawable(null); // 移除窗口默认背景
/*
		view=控件.创建控件(本对象)
		
/*
		width=系统操作.取屏幕宽度(本对象)
		height=系统操作.取屏幕高度(本对象)
		事件 view:绘图(canvas : Canvas)
			变量 h : 长整数=取当前时间戳()
			//test(100,100,位图对象.从文件路径创建位图("/storage/emulated/0/EhViewer/download/00_1248_sgw_123.jpg"))
			//日志(index.到文本())
			变量 bit : 位图对象=空
            开始俘获异常()
			bit=管理器.绘图(绘制消耗帧,帧长)
			俘获所有异常()
			变量 ex=取俘获异常()
			变量 b : 文本
			code #b=android.util.Log.getStackTraceString(#ex);
			日志(b)
			日志(ex.取异常信息())
			结束俘获异常()
			/*
		变量 cs : ColorSet=ColorSet.新建(width,height)
		cs.设置颜色(0xffffffff)
		变量 cst=ColorSet.从BitMap新建(bit)
		cs.绘制(cst,(width-bit.宽度)/2,0)
		
		canvas.drawBitmap(bit,(width-bit.宽度)/2,0,空)
		变量 paint : Paint
		paint.设置文字大小(30)
		变量 text=管理器.加载进度.value+"   "+管理器.realx+atimemax
		绘制反色文字(cs,text,0,0,paint)
		//paint.设置颜色(0xff000000)
		*//*
			变量 hbn=(取当前时间戳()-h) : 整数
			atime[stn]=hbn
			//atime=取当前时间戳()-h

			如果 atime[stn]>atimemax 则
				atimemax=atime[stn]
			结束 如果
			stn=stn+1
			如果 stn>=取数组长度(atime)则
				stn=0
			结束 如果
			开始俘获异常()
			//Total Memory
			//Animation on Loading:
			变量 textw=hbn.到文本()+"ms "+管理器.取加载进度()+"x1 "+取当前时间戳()+"\n"+管理器.加载进度.value+
			"\nTM:"+取大小(取内存())+"/"+取大小(取最大内存())+" "+取大小(取可用内存())+" available\n"+
			"ANL:"+管理器.加载信息+"\n"+
			"Drawing Info:"+管理器.帧信息+"\n"+
			"x:"+管理器.predx+"  y:"+管理器.predy+"\n"+
			"colorMatrix rebuild time:"+管理器.buildtime+"\n"+
			"ds q:"+管理器.ultna+"  ds n:"+管理器.ultnb+"\n"+
			version
			变量 paintw=Paint.创建Paint().设置文字大小(30)
			如果 反色显示 则
				变量 cs=ColorSet.新建((width-bit.宽度)/2,height)

				cs.设置颜色(0xffffffff)

				变量 stnb : 整数=stn
				循环(i, 0, 取数组长度(atime))
					变量 numb : 整数=atime[stnb]*取数组长度(atime)/atimemax
					循环(u, 0, numb)
						cs.seti(i,取数组长度(atime)-u,颜色取反(cs.geti(i,取数组长度(atime)-u),255))
					结束 循环
					stnb=stnb+1
					如果 stnb==取数组长度(atime)则
						stnb=0
					结束 如果
				结束 循环

				变量 bitw=位图对象.创建位图2(width,height,位图配置.ARGB_8888)
				变量 canvasw=Canvas.从BitMap创建(bitw)
				如果 bit!=空 则
					code #canvasw.drawColor(0xffffffff);
					canvasw.drawBitmap(bit,(width-bit.宽度)/2,0,空)
				结束 如果


				canvasw.drawBitmap(cs.取bitmap(),0,0,空)
				变量 wh=取最大长宽(paintw,textw)
				变量 bitc : 位图对象=空
				变量 we=wh[0].到整数()
				变量 he=wh[1].到整数()
				code #bitc=Bitmap.createBitmap(#bitw, 0, 0,#we ,#he);
				变量 cst=ColorSet.从BitMap新建(bitc)
				//日志(wh[0]+" yyy   "+wh[1])
				绘制反色文字(cst,textw,0,0,paintw,we,he,30)
				canvasw.drawBitmap(cst.取bitmap(),0,0,空)
				canvas.drawBitmap(bitw,0,0,空)
			否则
				变量 paint=Paint.创建Paint()
			    code #paint.setFilterBitmap(true);
				变量 matrix : Matrix=Matrix.新建().postTranslate((width-height*4/3)/2,0)
				canvas.drawBitmap_3(bit,matrix,paint)
				canvas.绘制文字(textw,0,30,paintw.设置颜色(color_from_rgb(hsvToRgb_float({管理器.渐变色值,1f,1f}))),30,-1)
			结束 如果

			textw=空
			//cst.b=空
			//cst=空
			//cs.b=空
			//cs=空
			优化内存()
			//变量 paint=Paint.创建Paint().设置文字大小(30).setXfermode(PorterDuffXfermode.新建(PorterDuff_Mode.LIGHTEN))
			//变量 textbt=位图对象.创建位图2(paint.测量文字(textw).到整数(),30*3,位图配置.ARGB_8888)
			//变量 paintm=Paint.创建Paint().设置文字大小(30).setAntiAlias(真).设置颜色(0xff000000)
			//变量 textcs=Canvas.从BitMap创建(textbt)
			//code #textcs.drawColor(0xffffffff,android.graphics.PorterDuff.Mode.CLEAR);
			//textcs.绘制文字(textw,0,30,paintm,30,-1)
			//canvas.drawBitmap(textbt,0,0,paint)
			如果 ldt==0L 则
				ldt=取当前时间戳()
			否则
				绘制消耗帧=(取当前时间戳()-ldt) : 整数
				ldt=取当前时间戳()
			结束 如果
			俘获所有异常()
			//日志(取俘获异常().取异常信息())
			弹出提示(取俘获异常().取异常信息())
			返回
			结束俘获异常()
		结束 事件
		事件 view:点击事件(点击事件 : 触摸事件) : 逻辑型
			管理器.handleTouch(点击事件)
			返回 真
		结束 事件*/



		如果 禁止初始化==假 则
			//提交到新线程运行()
			如果 初始化次数>=5 则
				Editor1.内容 = Editor1.内容+"强制重启，等待一秒......"
				禁止初始化=真
				重启(1000)
				返回
			结束 如果
			初始化次数=初始化次数+1
			//弹出提示((".8").到单精度小数())
			//弹出提示(取随机数(0,60))
			申请所有权限()
			开始俘获异常()
			文件操作.取子文件列表("/sdcard/")
			文件操作.写出文本文件("/sdcard/test.pvz_laus","test")
			俘获所有异常()
			弹出提示("error:权限测试失败")
			loadbreak=真
			返回
			结束俘获异常()
			loadbreak=假
			如果 文件操作.读入文本文件(statepath)!="finish" 则
				Editor1.内容 = Editor1.内容+"游戏启动被阻止，请求重新解压资源：\n"
				解压资源()
				返回
			结束 如果
			切换窗口(非启动窗口)
			/*
			view.添加到(线性布局1)
			view.setWidth(width)
			view.setHeight(height)
			线性布局1.移除组件(Editor1)
			//atime=数组创建(整数,(width-height*4/3)/2)
			隐藏标题栏(本对象)
			本对象.屏幕方向 = 0
			线性布局1.宽度 = width
			线性布局1.高度 = height
			弹出提示("你好，结绳！")
			文件操作.写出文本文件(logpath,"")
			//提交到新线程运行()
			开始俘获异常()
			atime=数组创建(整数,(max(width,height)-min(width,height)*4/3)/2)
			俘获所有异常()
			结束俘获异常()
			管理器.初始化(width,height)
			弹出提示("true")
			管理器.绘制更新速率=帧长
			管理器.speed=12f/(1000/帧长)*2
			//提交到主线程运行(本对象)
			start()
			//结束提交到主线程()
			//结束提交到新线程()
			//bitmap=位图对象.创建位图2(width,height,位图配置.ARGB_8888)
			//canvasw=Canvas.从BitMap创建(bitmap)
			/*
		XMLR.读取xml(res,文件操作.读入文本文件("/storage/emulated/0/.pvz/pvz/properties/resources.xml"),0)  //resources
		变量 resw : XMLR=res["ResourceManifest"]
		循环(i, 0, resw.length)
			如果 resw.index(i).name=="Resources" 则
				变量 resws : XMLR=resw.index(i)
				变量 path : 文本
				变量 idpredix : 文本
				循环(u, 0, resws.length)
					变量 reswb : XMLR=resws.index(u)
					如果 reswb.name=="SetDefaults" 则
						path=reswb.refeindex("path")
						idpredix=reswb.refeindex("idprefix")
					否则 reswb.name=="Image"
						resall.添加项目(idpredix+reswb.refeindex("id"),读取图片(path+"/"+reswb.refeindex("path")))
						//日志(idpredix+reswb.refeindex("id")+"   "+path+"/"+reswb.refeindex("path")+"\n")
					结束 如果
				结束 循环
			结束 如果
		结束 循环
		*/



			//开始俘获异常()

			//变量 zombie : XMLR
			//XMLR.读取xml(zombie,文件操作.读入文本文件("/storage/emulated/0/.pvz/pvz/compiled/reanim/finished_xml/Zombie.reanim"),0)  //resources

			//编辑框1.内容 = REANIM["Zombie"].track("Zombie_outerleg_foot").到文本(1)
			//俘获所有异常()
			//取俘获异常().输出堆栈信息()
			//弹出提示(取俘获异常().取异常信息())
			//结束俘获异常()
			//结束提交到新线程()


			订阅事件()
		结束 如果

	结束 事件

	事件 启动窗口:申请权限完毕(请求码 : 整数,权限集 : 文本[],允许结果 : 整数[])
		//变量 wbj : 文本集合=权限集
		//日志("权限请求:"+请求码+"   "+文本集合到文本(wbj,"  ")+"   "+整数集到文本(允许结果))
		如果 loadbreak 则
			本对象.创建完毕()
		结束 如果
	结束 事件

	方法 解压资源()
		//日志("调用")
		提交到新线程运行()
		提交到主线程运行(本对象)
		//日志("a")
		Editor1.内容 = Editor1.内容+"正在提取压缩文件：\n"
		结束提交到主线程()
		//日志("b")
		文件操作.写出资源文件(本对象,"pvz","/storage/emulated/0/.pvz/res.23")
		//日志("c")
		提交到主线程运行(本对象)
		Editor1.内容 = Editor1.内容+"解压资源：\n"
		结束提交到主线程()
		ZIP操作.解压文件("/storage/emulated/0/.pvz/res.23","/storage/emulated/0/")
		提交到主线程运行(本对象)
		Editor1.内容 = Editor1.内容+"解压完成，重新尝试启动......\n"
		结束提交到主线程()
		变量 hm : 文本=文件操作.读入文本文件(statepath)
		如果 hm!="keep" 则
			文件操作.写出文本文件(statepath,"finish")
		结束 如果
		提交到主线程运行(本对象)
		创建完毕()
		结束提交到主线程()
		结束提交到新线程()
	结束 方法

	方法 重启(时间 : 整数=100)
		@code
		new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage(getApplication().getPackageName());
                        LaunchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(LaunchIntent);
                    }
                }, #时间);
		@end
	结束 方法
结束 类














@导入Java("android.graphics.*")
@导入Java("android.graphics.Bitmap.Config")
@导入Java("com.badlogic.gdx.Gdx")
/*
@附加清单([[
android:allowBackup="true"
android:largeHeap="true"
android:hardwareAccelerated = "false">]])
*/
//@附加资源("../esass")
@输出名("凤舞九天")
@导入Java("android.content.Intent")
@导入Java("android.os.*")
类 非启动窗口 : Setup

	//@布局配置([[根布局=真,宽度=-1,高度=-1]])
	//变量 线性布局1 : 线性布局
	//@布局配置([[父布局=线性布局1,宽度=-1,高度=-1]])
	变量 Editor1 : 编辑框

	变量 view : 控件=空

	变量 width : 整数
	变量 height : 整数
	变量 帧长 : 整数=1000/60
	变量 index : 整数
	变量 trackw : XMLR

	变量 管理器 : 窗口管理器
	变量 loadbreak : 逻辑型=假

	变量 res : XMLR

	变量 glview : 绘图控件=空

	变量 atime : 整数[]=创建整数数组(100)
	变量 stn : 整数=0
	变量 atimemax : 整数=1
	变量 btime : 整数
	变量 btimemax : 整数
	变量 statepath : 文本="/storage/emulated/0/.pvz/log."

	变量 绘制消耗帧 : 整数=帧长
	变量 初始化次数 : 整数=0
	变量 禁止初始化 : 逻辑型=假
	变量 反色显示 : 逻辑型=假
	变量 version="0.25.805.2 alpha dev(vb33.250804.420362)"

	变量 ldt : 长整数=0L

	//lingdx的配置类
	变量 aac : AAC
	//libgdx场景绘制类
	变量 aa : AA

	变量 初始化完成 : 逻辑型=假





	//a.b.c.d vb e.f.g
	//a 大版本号，记录重大更新次数
	//b 年份 c 月日 d 当日更新次数
	//e 制作总天数 f 日期 g tiecode代码文件字节数




	/*
	事件 启动窗口:即将创建()
		/*
		view=控件.创建控件(本对象)
		width=系统操作.取屏幕宽度(本对象)
		height=系统操作.取屏幕高度(本对象)
		*/
	/*
	结束 事件
*/
	事件 非启动窗口:创建完毕()
		游戏初始化(aa,aac)

		view=控件.创建控件(本对象)
		glview=绘图控件.创建控件(本对象)
		code #view.setLayerType(android.view.View.LAYER_TYPE_HARDWARE, null);
		管理器.帧长=帧长
		管理器.主线程=本对象
		width=系统操作.取屏幕宽度(本对象)
		height=系统操作.取屏幕高度(本对象)
		事件 view:绘图(canvas : Canvas)
			/*
			//code #<操作类.日志>(#canvas.isHardwareAccelerated()+"");
			//code #canvas.drawColor(0xff000000);
			变量 h : 长整数=取当前时间戳()
			//test(100,100,位图对象.从文件路径创建位图("/storage/emulated/0/EhViewer/download/00_1248_sgw_123.jpg"))
			//日志(index.到文本())
			变量 bit : 位图对象=空

			开始俘获异常()
			bit=管理器.绘图(绘制消耗帧,帧长)
			俘获所有异常()
			变量 ex=取俘获异常()
			变量 b : 文本
			code #b=android.util.Log.getStackTraceString(#ex);
			日志(b)
			日志(ex.取异常信息())
			结束俘获异常()
			/*
		变量 cs : ColorSet=ColorSet.新建(width,height)
		cs.设置颜色(0xffffffff)
		变量 cst=ColorSet.从BitMap新建(bit)
		cs.绘制(cst,(width-bit.宽度)/2,0)
		
		canvas.drawBitmap(bit,(width-bit.宽度)/2,0,空)
		变量 paint : Paint
		paint.设置文字大小(30)
		变量 text=管理器.加载进度.value+"   "+管理器.realx+atimemax
		绘制反色文字(cs,text,0,0,paint)
		//paint.设置颜色(0xff000000)
		*//*
			变量 hbn=(取当前时间戳()-h) : 整数
			atime[stn]=hbn
			//atime=取当前时间戳()-h

			如果 atime[stn]>atimemax 则
				atimemax=atime[stn]
			结束 如果
			stn=stn+1
			如果 stn>=取数组长度(atime)则
				stn=0
			结束 如果
			开始俘获异常()
			//Total Memory
			//Animation on Loading:
			变量 textw=hbn.到文本()+"ms "+管理器.取加载进度()+"x1 "+取当前时间戳()+"\n"+管理器.加载进度.value+
			"\nTM:"+取大小(取内存())+"/"+取大小(取最大内存())+" "+取大小(取可用内存())+" available\n"+
			"ANL:"+管理器.加载信息+"\n"+
			"Drawing Info:"+管理器.帧信息+"\n"+
			"x:"+管理器.predx+"  y:"+管理器.predy+"\n"+
			"colorMatrix rebuild time:"+管理器.buildtime+"\n"+
			"ds q:"+管理器.ultna+"  ds n:"+管理器.ultnb+"\n"+
			version
			变量 paintw=Paint.创建Paint().设置文字大小(30)
			如果 反色显示 则
				变量 cs=ColorSet.新建((width-bit.宽度)/2,height)

				cs.设置颜色(0xffffffff)

				变量 stnb : 整数=stn
				循环(i, 0, 取数组长度(atime))
					变量 numb : 整数=atime[stnb]*取数组长度(atime)/atimemax
					循环(u, 0, numb)
						cs.seti(i,取数组长度(atime)-u,颜色取反(cs.geti(i,取数组长度(atime)-u),255))
					结束 循环
					stnb=stnb+1
					如果 stnb==取数组长度(atime)则
						stnb=0
					结束 如果
				结束 循环

				变量 bitw=位图对象.创建位图2(width,height,位图配置.ARGB_8888)
				变量 canvasw=Canvas.从BitMap创建(bitw)
				如果 bit!=空 则
					code #canvasw.drawColor(0xffffffff);
					canvasw.drawBitmap(bit,(width-bit.宽度)/2,0,空)
				结束 如果


				canvasw.drawBitmap(cs.取bitmap(),0,0,空)
				变量 wh=取最大长宽(paintw,textw)
				变量 bitc : 位图对象=空
				变量 we=wh[0].到整数()
				变量 he=wh[1].到整数()
				code #bitc=Bitmap.createBitmap(#bitw, 0, 0,#we ,#he);
				变量 cst=ColorSet.从BitMap新建(bitc)
				//日志(wh[0]+" yyy   "+wh[1])
				绘制反色文字(cst,textw,0,0,paintw,we,he,30)
				canvasw.drawBitmap(cst.取bitmap(),0,0,空)
				canvas.drawBitmap(bitw,0,0,空)
			否则
				变量 paint=Paint.创建Paint()
				变量 canvast : Canvas=Canvas.从BitMap创建(bit)


				//code #paint.setFilterBitmap(true);
				//变量 matrix : Matrix=Matrix.新建().postTranslate((width-height*4/3)/2,0)
				变量 屏幕 : SpriteBatch
				屏幕.开始绘制()
				变量 sp : Sprite=Sprite.取Sprite(Texture.从PixMap新建(Pixmap.从Bitmap创建(bit)))
				sp.draw_s(屏幕)
				变量 sp2 : Sprite=Sprite.取Sprite(Texture.从文件路径创建("/storage/emulated/0/.pvz/plant_cards.png"))
				sp2.draw_s(屏幕)
				屏幕.结束绘制()
				canvas.drawBitmap(bit,(width-height*4/3)/2,0,空)
				canvas.绘制文字(textw,0,30,paintw.设置颜色(color_from_rgb(hsvToRgb_float({管理器.渐变色值,1f,1f}))),30,-1)
				//canvas.ITC(bit)
				//canvas.绘制文字(textw,0,30,paintw.设置颜色(color_from_rgb(hsvToRgb_float({管理器.渐变色值,1f,1f}))),30,-1)
			结束 如果

			textw=空
			//cst.b=空
			//cst=空
			//cs.b=空
			//cs=空
			优化内存()
			//变量 paint=Paint.创建Paint().设置文字大小(30).setXfermode(PorterDuffXfermode.新建(PorterDuff_Mode.LIGHTEN))
			//变量 textbt=位图对象.创建位图2(paint.测量文字(textw).到整数(),30*3,位图配置.ARGB_8888)
			//变量 paintm=Paint.创建Paint().设置文字大小(30).setAntiAlias(真).设置颜色(0xff000000)
			//变量 textcs=Canvas.从BitMap创建(textbt)
			//code #textcs.drawColor(0xffffffff,android.graphics.PorterDuff.Mode.CLEAR);
			//textcs.绘制文字(textw,0,30,paintm,30,-1)
			//canvas.drawBitmap(textbt,0,0,paint)
			如果 ldt==0L 则
				ldt=取当前时间戳()
			否则
				绘制消耗帧=(取当前时间戳()-ldt) : 整数
				管理器.绘制消耗帧=绘制消耗帧
				ldt=取当前时间戳()
			结束 如果
			俘获所有异常()
			//日志(取俘获异常().取异常信息())
			弹出提示(取俘获异常().取异常信息())
			返回
			结束俘获异常()
			*/
		结束 事件
		事件 view:点击事件(点击事件 : 触摸事件) : 逻辑型
			管理器.handleTouch(点击事件)
			返回 真
		结束 事件


		如果 禁止初始化==假 则
			//提交到新线程运行()
			如果 初始化次数>=5 则
				Editor1.内容 = Editor1.内容+"强制重启，等待一秒......"
				禁止初始化=真
				重启(1000)
				返回
			结束 如果
			初始化次数=初始化次数+1
			//弹出提示((".8").到单精度小数())
			//弹出提示(取随机数(0,60))
			申请所有权限()
			开始俘获异常()
			文件操作.取子文件列表("/sdcard/")
			文件操作.写出文本文件("/sdcard/test.pvz_laus","test")
			俘获所有异常()
			弹出提示("error:权限测试失败")
			loadbreak=真
			返回
			结束俘获异常()
			loadbreak=假
			如果 文件操作.读入文本文件(statepath)!="finish" 则
				Editor1.内容 = Editor1.内容+"游戏启动被阻止，请求重新解压资源：\n"
				解压资源()
				返回
			结束 如果


			初始化完成=真
			//code ((android.view.ViewGroup)this.getWindow().getDecorView()).addView(#Editor1.getView());
			//setContinuousRendering(假)
			code getWindow().setBackgroundDrawable(null); // 移除窗口默认背景
			变量 mip : MIP
			事件 mip:触摸事件(触摸 : 触摸事件)
				//日志("true:  x  "+触摸.取横坐标()+"  y "+触摸.取纵坐标())
				管理器.handleTouch(触摸)
			结束 事件
			setInputProcessor(mip)
			/*
			view.添加到(线性布局1)
			view.setWidth(width)
			view.setHeight(height)
			线性布局1.移除组件(Editor1)*/
			//atime=数组创建(整数,(width-height*4/3)/2)
			隐藏标题栏(本对象)
			本对象.屏幕方向 = 0
			/*线性布局1.宽度 = width
			线性布局1.高度 = height*/
			弹出提示("你好，结绳！")
			开始俘获异常()
			如果 文件是否存在(logpath) 则
				文件操作.写出文本文件(logpath+".bak",文件操作.读入文本文件(logpath))
			结束 如果
			俘获所有异常()
			结束俘获异常()
			文件操作.写出文本文件(logpath,"")
			//提交到新线程运行()
			开始俘获异常()
			atime=数组创建(整数,(max(width,height)-min(width,height)*4/3)/2)
			俘获所有异常()
			结束俘获异常()
			提交到新线程运行()
			管理器.初始化(width,height)
			结束提交到新线程()
			管理器.绘制更新速率=帧长
			管理器.speed=12f/(1000/帧长)*2
			//提交到主线程运行(本对象)
			start()
			//结束提交到主线程()
			//结束提交到新线程()
			//bitmap=位图对象.创建位图2(width,height,位图配置.ARGB_8888)
			//canvasw=Canvas.从BitMap创建(bitmap)
			/*
		XMLR.读取xml(res,文件操作.读入文本文件("/storage/emulated/0/.pvz/pvz/properties/resources.xml"),0)  //resources
		变量 resw : XMLR=res["ResourceManifest"]
		循环(i, 0, resw.length)
			如果 resw.index(i).name=="Resources" 则
				变量 resws : XMLR=resw.index(i)
				变量 path : 文本
				变量 idpredix : 文本
				循环(u, 0, resws.length)
					变量 reswb : XMLR=resws.index(u)
					如果 reswb.name=="SetDefaults" 则
						path=reswb.refeindex("path")
						idpredix=reswb.refeindex("idprefix")
					否则 reswb.name=="Image"
						resall.添加项目(idpredix+reswb.refeindex("id"),读取图片(path+"/"+reswb.refeindex("path")))
						//日志(idpredix+reswb.refeindex("id")+"   "+path+"/"+reswb.refeindex("path")+"\n")
					结束 如果
				结束 循环
			结束 如果
		结束 循环
		*/



			//开始俘获异常()

			//变量 zombie : XMLR
			//XMLR.读取xml(zombie,文件操作.读入文本文件("/storage/emulated/0/.pvz/pvz/compiled/reanim/finished_xml/Zombie.reanim"),0)  //resources

			//编辑框1.内容 = REANIM["Zombie"].track("Zombie_outerleg_foot").到文本(1)
			//俘获所有异常()
			//取俘获异常().输出堆栈信息()
			//弹出提示(取俘获异常().取异常信息())
			//结束俘获异常()
			//结束提交到新线程()


			订阅事件()
		结束 如果

	结束 事件

	变量 rgb_vert : 文本=[[attribute vec4 a_position;
attribute vec4 a_color;
attribute vec2 a_texCoord0;

uniform mat4 u_projTrans;

varying vec4 v_color;
varying vec2 v_texCoords;

void main() {
    v_color = a_color;
    v_texCoords = a_texCoord0;
    gl_Position = u_projTrans * a_position;
}]]

//u_clipRegion  x,y,width,heoght

	变量 rgb_frag : 文本=[[#ifdef GL_ES
    precision mediump float;
#endif

varying vec4 v_color;
varying vec2 v_texCoords;
uniform sampler2D u_texture;
uniform vec3 u_rgbFactors; // x=red, y=green, z=blue
uniform float u_opacity;
uniform vec4 u_clipRegion;

void main() {
if (gl_FragCoord.x < u_clipRegion.x ||
      gl_FragCoord.y < u_clipRegion.y ||
      gl_FragCoord.x > (u_clipRegion.x + u_clipRegion.z) ||
      gl_FragCoord.y > (u_clipRegion.y + u_clipRegion.w)) {
    discard;
  }
    vec4 color = texture2D(u_texture, v_texCoords);
    // 应用RGB通道分离/增强
    color.r *= u_rgbFactors.x;
    color.g *= u_rgbFactors.y;
    color.b *= u_rgbFactors.z;
	color.a *= u_opacity;
    gl_FragColor = color * v_color;
}]]

	@输出名("霜雪千年")
	//这个方法会在系统请求绘制时被调用
	方法 繪製()
		//code #<操作类.日志>(#canvas.isHardwareAccelerated()+"");
		//code #canvas.drawColor(0xff000000);
		如果 初始化完成&&管理器.初始化完成 则
			变量 h : 长整数=取当前时间戳()
			//test(100,100,位图对象.从文件路径创建位图("/storage/emulated/0/EhViewer/download/00_1248_sgw_123.jpg"))
			//日志(index.到文本())
			变量 tr : TextureRegion=空
			变量 fbo1 : FrameBuffer=空
			开始俘获异常()
			变量 scr : SpriteBatch
			fbo1=FrameBuffer.新建(宽(),高())
			管理器.screen=scr
			管理器.fbo=fbo1
			如果 管理器.rgbShader==空 则
				ShaderProgram.setPedantic(假)
				管理器.rgbShader=ShaderProgram.新建(rgb_vert,rgb_frag)
			结束 如果
			tr=管理器.绘图(绘制消耗帧,帧长)
			
			俘获所有异常()
			变量 ex=取俘获异常()
			变量 b : 文本
			code #b=android.util.Log.getStackTraceString(#ex);
			日志("Manger.draw()方法出错")
			日志(b)
			日志(ex.取异常信息())
			结束俘获异常()
			/*
		变量 cs : ColorSet=ColorSet.新建(width,height)
		cs.设置颜色(0xffffffff)
		变量 cst=ColorSet.从BitMap新建(bit)
		cs.绘制(cst,(width-bit.宽度)/2,0)
		
		canvas.drawBitmap(bit,(width-bit.宽度)/2,0,空)
		变量 paint : Paint
		paint.设置文字大小(30)
		变量 text=管理器.加载进度.value+"   "+管理器.realx+atimemax
		绘制反色文字(cs,text,0,0,paint)
		//paint.设置颜色(0xff000000)
		*/
			变量 hbn=(取当前时间戳()-h) : 整数
			atime[stn]=hbn
			//atime=取当前时间戳()-h

			如果 atime[stn]>atimemax 则
				atimemax=atime[stn]
			结束 如果
			stn=stn+1
			如果 stn>=取数组长度(atime)则
				stn=0
			结束 如果
			开始俘获异常()
			//Total Memory
			//Animation on Loading:
			变量 textw=hbn.到文本()+"ms "+管理器.取加载进度()+"x1 "+取当前时间戳()+"\n"+管理器.加载进度.value+
			"\nTM:"+取大小(取内存())+"/"+取大小(取最大内存())+" "+取大小(取可用内存())+" available\n"+
			"ANL:"+管理器.加载信息+"\n"+
			"Drawing Info:"+管理器.帧信息+"\n"+
			"x:"+管理器.predx+"  y:"+管理器.predy+"\n"+
			"colorMatrix rebuild time:"+管理器.buildtime+"\n"+
			"ds q:"+管理器.ultna+"  ds n:"+管理器.ultnb+"\n"+
			version+"\n---------------1"
			//日志(textw)
			变量 paintw=Paint.创建Paint().设置文字大小(30)
			如果 反色显示 则
				/*
			////////变量 cs=ColorSet.新建((width-bit.宽度)/2,height)

			cs.设置颜色(0xffffffff)

			变量 stnb : 整数=stn
			循环(i, 0, 取数组长度(atime))
				变量 numb : 整数=atime[stnb]*取数组长度(atime)/atimemax
				循环(u, 0, numb)
					cs.seti(i,取数组长度(atime)-u,颜色取反(cs.geti(i,取数组长度(atime)-u),255))
				结束 循环
				stnb=stnb+1
				如果 stnb==取数组长度(atime)则
					stnb=0
				结束 如果
			结束 循环

			变量 bitw=位图对象.创建位图2(width,height,位图配置.ARGB_8888)
			变量 canvasw=Canvas.从BitMap创建(bitw)
			如果 bit!=空 则
				code #canvasw.drawColor(0xffffffff);
				///////////canvasw.drawBitmap(bit,(width-bit.宽度)/2,0,空)
			结束 如果


		///////////	canvasw.drawBitmap(cs.取bitmap(),0,0,空)
			变量 wh=取最大长宽(paintw,textw)
			变量 bitc : 位图对象=空
			变量 we=wh[0].到整数()
			变量 he=wh[1].到整数()
			code #bitc=Bitmap.createBitmap(#bitw, 0, 0,#we ,#he);
			变量 cst=ColorSet.从BitMap新建(bitc)
			//日志(wh[0]+" yyy   "+wh[1])
			绘制反色文字(cst,textw,0,0,paintw,we,he,30)
			canvasw.drawBitmap(cst.取bitmap(),0,0,空)
			//canvas.drawBitmap(bitw,0,0,空)
			*/
			否则
				变量 paint=Paint.创建Paint()
				//////////变量 canvast : Canvas=Canvas.从BitMap创建(bit)


				//code #paint.setFilterBitmap(true);
				//变量 matrix : Matrix=Matrix.新建().postTranslate((width-height*4/3)/2,0)
				变量 屏幕 : SpriteBatch
				屏幕.开始绘制()
				//变量 sp : Sprite=Sprite.取Sprite(Texture.从PixMap新建(Pixmap.从Bitmap创建(bit)))
				//sp.setPosition((width-height*4/3)/2,0)
				//sp.draw_s(屏幕)

				屏幕.draw_trxy(tr,(width-height*4/3)/2,0)
				管理器.字体1.getData().setScale(1)
				管理器.字体1.setColor(Color.新建_rgba(argb2rgba(color_from_rgb(hsvToRgb_float({管理器.渐变色值,1f,1f})))))
				管理器.字体1.draw_bsxy(屏幕,textw,0,height)
				屏幕.结束绘制()
				code #fbo1.dispose();
				code #屏幕.dispose();
				如果 管理器.fbo!=空 则
					code #<管理器.fbo>.dispose();
				结束 如果
				如果 管理器.screen!=空 则
					code #<管理器.screen>.dispose();
				结束 如果
				//canvas.drawBitmap(bit,(width-height*4/3)/2,0,空)
				//canvas.绘制文字(textw,0,30,paintw.设置颜色(color_from_rgb(hsvToRgb_float({管理器.渐变色值,1f,1f}))),30,-1)
				//canvas.ITC(bit)

				//canvas.绘制文字(textw,0,30,paintw.设置颜色(color_from_rgb(hsvToRgb_float({管理器.渐变色值,1f,1f}))),30,-1)
			结束 如果

			textw=空
			//cst.b=空
			//cst=空
			//cs.b=空
			//cs=空
			优化内存()
			//变量 paint=Paint.创建Paint().设置文字大小(30).setXfermode(PorterDuffXfermode.新建(PorterDuff_Mode.LIGHTEN))
			//变量 textbt=位图对象.创建位图2(paint.测量文字(textw).到整数(),30*3,位图配置.ARGB_8888)
			//变量 paintm=Paint.创建Paint().设置文字大小(30).setAntiAlias(真).设置颜色(0xff000000)
			//变量 textcs=Canvas.从BitMap创建(textbt)
			//code #textcs.drawColor(0xffffffff,android.graphics.PorterDuff.Mode.CLEAR);
			//textcs.绘制文字(textw,0,30,paintm,30,-1)
			//canvas.drawBitmap(textbt,0,0,paint)
			如果 ldt==0L 则
				ldt=取当前时间戳()
			否则
				绘制消耗帧=(取当前时间戳()-ldt) : 整数
				管理器.绘制消耗帧=绘制消耗帧
				ldt=取当前时间戳()
			结束 如果
			俘获所有异常()
			//日志(取俘获异常().取异常信息())
			弹出提示(取俘获异常().取异常信息())
			返回
			结束俘获异常()
		结束 如果
	结束 方法

	方法 start()
		如果 真 则
			提交到新线程运行()
			循环(i, 0, 10)
				i=0
				变量 nt=取当前时间戳()
				//日志(zombieList.长度.到文本())
				//开始俘获异常()
				如果 管理器.初始化完成 则
					管理器.Update()
				结束 如果
				/*
				俘获所有异常()
			变量 ex=取俘获异常()
			变量 b : 文本
			code #b=android.util.Log.getStackTraceString(#ex);
			日志("Manger.Update()方法出错")
			日志(b)
			日志(ex.取异常信息())
			结束俘获异常()*/
				nt=取当前时间戳()-nt
				如果 nt<10 则
					延时(10-nt)
				结束 如果
			结束 循环
			结束提交到新线程()
		结束 如果
		提交到新线程运行()
		循环(i, 0, 10)
			//变量 nt2 : 长整数=取当前时间戳()
			i=0
			开始俘获异常()
			//view.重绘()	

			变量 stnb=stn-1
			如果 stnb==-1 则
				stnb=取数组长度(atime)-1
			结束 如果
			变量 stnbb=stnb-1
			如果 stnbb<0 则
				stnbb=取数组长度(atime)-1
			结束 如果
			变量 nt=atime[stnbb]
			如果 nt<帧长 则
				延时(帧长-nt)
				nt=帧长
			结束 如果
			//绘制消耗帧=nt : 整数
			俘获所有异常()
			提交到主线程运行(本对象)
			日志("绘制异常:"+取俘获异常().取异常信息())
			弹出提示("绘制异常:"+取俘获异常().取异常信息())
			结束提交到主线程()
			结束俘获异常()
		结束 循环
		结束提交到新线程()
	结束 方法

	方法 重启(时间 : 整数=100)
		@code
		new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage(getApplication().getPackageName());
                        LaunchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(LaunchIntent);
                    }
                }, #时间);
		@end
	结束 方法

	方法 取内存() : 长整数
		code return Runtime.getRuntime().totalMemory();
	结束 方法

	方法 取最大内存() : 长整数
		code return Runtime.getRuntime().maxMemory();
	结束 方法

	方法 取可用内存() : 长整数
		code return Runtime.getRuntime().freeMemory();
	结束 方法

	方法 取大小(大小 : 长整数) : 文本
		如果 大小 <= 1024 则
			返回 大小+" B"
		否则 大小 <= 1024*1024
			返回 四舍五入(大小/1024F,3) +" KiB"
		否则 大小 <= 1024*1024*1024
			返回 四舍五入(大小/1024F/1024F,3) +" MiB"
		否则 大小 <= 1024L*1024L*1024L*1024L
			返回 四舍五入(大小/1024F/1024F/1024F,3) +" GiB"
		否则 大小 <= 1024L*1024L*1024L*1024L*1024L
			返回 四舍五入(大小/1024F/1024F/1024F/1024F,3) +" TiB"
		否则 大小 >= 1024*1024*1024*1024*1024 && 大小 <= 1024*1024*1024*1024*1024*1024
			返回 四舍五入(大小/1024F/1024F/1024F/1024F/1024F,3) +" PiB"
		否则 大小 >= 1024*1024*1024*1024*1024*1024 && 大小 <= 1024*1024*1024*1024*1024*1024*1024
			返回 四舍五入(大小/1024F/1024F/1024F/1024F/1024F/1024F,3) +" EiB"
		结束 如果
		返回 大小.到文本()
	结束 方法


	方法 解压资源()
		//日志("调用")
		提交到新线程运行()
		提交到主线程运行(本对象)
		//日志("a")
		Editor1.内容 = Editor1.内容+"正在提取压缩文件：\n"
		结束提交到主线程()
		//日志("b")
		文件操作.写出资源文件(本对象,"pvz","/storage/emulated/0/.pvz/res.23")
		//日志("c")
		提交到主线程运行(本对象)
		Editor1.内容 = Editor1.内容+"解压资源：\n"
		结束提交到主线程()
		ZIP操作.解压文件("/storage/emulated/0/.pvz/res.23","/storage/emulated/0/")
		提交到主线程运行(本对象)
		Editor1.内容 = Editor1.内容+"解压完成，重新尝试启动......\n"
		结束提交到主线程()
		变量 hm : 文本=文件操作.读入文本文件(statepath)
		如果 hm!="keep" 则
			文件操作.写出文本文件(statepath,"finish")
		结束 如果
		提交到主线程运行(本对象)
		创建完毕()
		结束提交到主线程()
		结束提交到新线程()
	结束 方法


	方法 取图片(id : 文本) : 文本
		变量 path : 文本="/storage/emulated/0/.pvz/pvz/"+管理器.resall.取项目(id)
		如果 文件是否存在(path+".jpg") 则
			返回 path+".jpg"
		否则 文件是否存在(path+".png")

		结束 如果
		返回 path+".png"
	结束 方法



	方法 获取错误信息(ex : 异常) : 文本
		code return android.util.Log.getStackTraceString(#ex);
	结束 方法

	方法 取最大长宽(paint : Paint,text : 文本) : 单精度小数[]
		变量 ht : 文本[]=text.分割文本("\n")
		变量 max=0f
		循环(i, 0, 取数组长度(ht))
			变量 t=paint.测量文字(ht[i])
			如果 t>max 则
				max=t
			结束 如果
		结束 循环
		变量 rlt : 单精度小数[]={max+50,取数组长度(ht)*paint.取文字大小()+50}
		返回 rlt
	结束 方法

	方法 绘制反色文字(csw : ColorSet,t : 文本,x : 整数,y : 整数,p : Paint,w : 整数,h : 整数,dh : 整数)
		变量 bt : 位图对象=位图对象.创建位图2(w,h,位图配置.ARGB_8888)
		//位图对象.创建位图2(p.测量文字(t).到整数(),p.取文字大小(),位图配置.ARGB_8888)
		//变量 color=p.取颜色()
		p.设置颜色(0xff000000)
		变量 canvas=Canvas.从BitMap创建(bt)
		code #canvas.drawColor(0xffffffff);
		canvas.绘制文字(t,0,dh,p,dh,-1)
		变量 cs : ColorSet=ColorSet.从BitMap新建(bt)
		循环(i, 0, cs.wid)
			循环(u, 0, cs.hei)
				变量 tst=位清零(cs.geti(i,u),0xffffff00)
				如果 tst<170 则
					csw.seti(x+i,y+u,颜色取反(csw.geti(x+i,y+u),255))
				结束 如果
			结束 循环
		结束 循环
		//csw.绘制(cs,100,100)
		//绘制(ColorSet.从BitMap新建(bt),x,y)
	结束 方法

	方法 重启(时间 : 整数=100)
		@code
		new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage(getApplication().getPackageName());
                        LaunchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(LaunchIntent);
                    }
                }, #时间);
		@end
	结束 方法





	//用户在组件上单击事件
	事件 Editor1:被单击()
		变量 abc : XMLR
		XMLR.读取xml(abc,Stringk.文本(文件操作.读入文本文件("/storage/emulated/0/.pvz/pvz/properties/levels.xml")),0)
		//日志(abc.基本文本.value)
		//日志(abc.到文本())
	结束 事件
	/*
	事件 启动窗口:菜单被创建(菜单 : 菜单)
		菜单.添加菜单项("test")
	结束 事件

	事件 启动窗口:菜单项被选中(菜单项 : 菜单项)
			//用户在组件上单击事
			开始俘获异常()
		变量 h : Editor
		线性布局1.添加组件(h)
		h.宽度 = width
		h.高度 = height
		俘获所有异常()
		变量 ex : 异常=取俘获异常()
		变量 my : 文本
		code #my=android.util.Log.getStackTraceString(#ex);
		日志(my)
		结束俘获异常()
		@code
		
		//#<CodeEditorc> t=new #<CodeEditorc>(this);
		@end
	结束 事件

*/



	方法 加载语言()
		code io.github.rosemoe.sora.langs.textmate.registry.GrammarRegistry.getInstance().loadGrammars("textmate/languages.json");
	结束 方法

	方法 加载主题()
		开始俘获异常()
		@code
		io.github.rosemoe.sora.langs.textmate.registry.FileProviderRegistry.getInstance().addFileProvider(
            new io.github.rosemoe.sora.langs.textmate.registry.provider.AssetsFileResolver(
                this.getApplicationContext().getAssets()
            )
        );
		java.nio.charset.Charset charset=null;
        String[] themes = {"darcula", "abyss", "quietlight", "solarized_drak"};
        io.github.rosemoe.sora.langs.textmate.registry.ThemeRegistry themeRegistry = io.github.rosemoe.sora.langs.textmate.registry.ThemeRegistry.getInstance();
		for (int i=0;i==themes.length;i++){
            String path = "textmate/"+themes[i]+".json";
			org.eclipse.tm4e.core.registry.IThemeSource ith=IThemeSource$_CC.fromInputStream(FileProviderRegistry.getInstance().tryGetInputStream(path), path, charset);
			if (themes[i] != "quietlight") {
                        themeRegistry.loadTheme(new io.github.rosemoe.sora.langs.textmate.registry.model.ThemeModel(ith, themes[i]));
			} else {
				themeRegistry.loadTheme(
                new io.github.rosemoe.sora.langs.textmate.registry.model.ThemeModel(
                    IThemeSource$_CC.fromInputStream(
                        FileProviderRegistry.getInstance().tryGetInputStream(path), path, charset
                    ), themes[i]
                )
            );
			}
			
                    }

        themeRegistry.setTheme("quietlight");
		@end
		俘获所有异常()
		弹出提示(取俘获异常().取异常信息())
		结束俘获异常()
	结束 方法



	@主题配置.主题类型(主题类型.MD亮主题_暗色标题栏)
	@主题配置.主题色("#2196f3")
	@主题配置.强调色("#2196f3")
	@主题配置.按钮背景色("#2196f3")
	变量 蓝色主题 : 主题资源 = "Blue"

	事件 aa:onRender()
		繪製()
	结束 事件
结束 类

//万物皆作流云，唯我羽化登仙！
@输出名("羽化登仙")
@导入Java("android.graphics.*")
@导入Java("android.graphics.Bitmap.Config")
类 窗口管理器

	//0 标题界面
	//1选择器界面
	//2游戏界面
	//3智慧树
	//4商店
	//5宝开Logo
	//7测试界面
	变量 窗口类型 : 整数=5

	变量 resall : 文本到未加載圖哈希表
	变量 加载进度 : Stringk=Stringk.文本("")
	变量 REANIM : reanim
	变量 加载完毕 : 逻辑型=假

	变量 image : Image
	变量 imagename : STSL
	变量 config : XMLR
	变量 screen : SpriteBatch=空
	变量 fbo : FrameBuffer=空
	变量 width : 整数
	变量 height : 整数

	变量 主线程 : 安卓窗口=空

	变量 渐变色值 : 单精度小数=0f

	变量 x : 单精度小数=0f
	变量 y : 整数=0
	变量 scale : 单精度小数=1f

	变量 游戏文本 : 文本到文本哈希表
	变量 文字大小 : 整数=15
	变量 文字字体 : 字体=空

	变量 dx : 单精度小数=-1f
	变量 dy : 单精度小数=-1f
	变量 tx : 单精度小数=-1f
	变量 ty : 单精度小数=-1f
	变量 tt : 长整数
	变量 触摸 : 触摸事件=空
	变量 speed : 单精度小数=-1f

	变量 animh : Anim

	变量 realx : 单精度小数=-1f

	变量 绘制更新速率 : 整数

	变量 透明度 : 单精度小数=1f


	//变量 spcres : 文本到未加載圖哈希表

	变量 触判矩形 : 文本到矩形数组

	变量 zombieList : ZombieList
	变量 plantList : PaintList
	变量 projList : ProjList
	变量 tracleList : TracleList
	变量 particleList : ParticleList
	变量 cards : 整数[]={0,1,2,3,4,5}
	变量 card_cool : 整数[]={0,0,0,0,0,0}

	变量 动画进度 : 整数

	//50x70 2 8
	变量 mmx : 整数=50
	变量 mmy : 整数=70
	变量 mux : 整数=2
	变量 muy : 整数=8
	变量 plant_cards : 位图对象=空

	变量 sunapp : 整数=50
	变量 sunappmax=1100
	变量 coinList : CoinList

	变量 wave : 整数
	变量 wavemax : 整数

	变量 绘制消耗帧 : 整数
	变量 帧长 : 整数



	变量 level : 整数=1
	//0冒险
	//1冒险2周
	//2小游戏
	变量 leveltype : 整数=0

	变量 进度 : 文本="unstart"
	变量 场景 : 整数=0

	变量 predanim : Anim=空
	变量 predx : 整数
	变量 predy : 整数
	变量 predxp : 单精度小数=0f
	变量 predyp : 单精度小数=0f
	变量 predtype : 整数
	变量 pred : 逻辑型
	变量 predidx : 整数
	变量 suncount : 整数

	变量 进程 : 整数=0

	变量 levels : XMLR

	变量 zombiecount : 整数

	变量 前进进度 : 单精度小数=0f

	变量 加载信息 : 文本
	变量 帧信息 : 文本

	变量 sinlist : 单精度小数[]=空
	变量 coslist : 单精度小数[]=空


	变量 ds : drawStyle
	变量 dst : drawStyle

	变量 ultna : 长整数
	变量 ultnb : 长整数
	变量 dscale : 整数=1

	变量 osct : OSCT

	变量 rgbShader : ShaderProgram=空

	变量 字体1 : BitmapFont=空

	变量 无冷却 : 逻辑型=假
	变量 不耗阳光 : 逻辑型=假

	变量 animess : Animed

	变量 USER : userdatas

	变量 state : 文本="none"
	变量 判定区域 : 矩形集

	//2025.8.4  冒险模式闪光用的，标记变化时的时间
	变量 bool : 整数
	//2025.8.5
	变量 初始化完成 : 逻辑型=假
	变量 rectw : Texture=空


	方法 sin_angle(angle : 单精度小数) : 单精度小数
		返回 sinlist[angle.到整数()%360]
	结束 方法

	方法 cos_angle(angle : 单精度小数) : 单精度小数
		返回 coslist[angle.到整数()%360]
	结束 方法


	方法 初始化(widthw : 整数,heightw : 整数)
		读取场景存档()
		plant_cards=位图对象.从文件路径创建位图("/storage/emulated/0/.pvz/plant_cards.png")
		文字字体=字体.从文件创建("/storage/emulated/0/.pvz/main/fzse_gbk.ttf")
		//heightw=60
		// /2
		width=heightw*4/3
		height=heightw
		scale=height/600f/dscale
		realx=(widthw-width)/2/dscale
		日志("width="+width)
		日志("height="+height)
		日志("scale="+scale)
		加载进度="加载场景"
		XMLR.读取xml(config,Stringk.文本(文件操作.读入文本文件("/storage/emulated/0/.pvz/pvz/properties/config.xml")),0)
		XMLR.读取xml(levels,Stringk.文本(文件操作.读入文本文件("/storage/emulated/0/.pvz/pvz/properties/levels.xml")),0)
		image.init(加载进度,imagename)
		变量 可释放图 : 未加载图
		可释放图.路径="/storage/emulated/0/.pvz/pvz/reanim/SodRollCap.png"
		image.可释放图.添加项目("SodRollCap",可释放图)
		initLawnString()
        初始化完成=真
		//screen=位图对象.创建位图2(width/dscale,height/dscale,位图配置.ARGB_8888)
		//canvas=Canvas.从BitMap创建(screen)
	结束 方法

	方法 getcardcs(type : 整数) : 位图对象
		变量 col : 整数=type%8
		变量 line : 整数=(type-col)/8
		变量 xs=col*(mmx+mux)
		变量 ys=line*(mmy+muy)
		变量 csr : 位图对象=裁剪位图(plant_cards,xs,ys,50,70)
		返回 csr
	结束 方法

	方法 getres(id :文本) : 未加载图
		返回 (image.可释放图)[imagename[id]]
	结束 方法

	方法 设置宽高()
		width=800
		height=600
		scale=1f
	结束 方法

    //你的耗时！为何如此之长！
	//一僵尸一毫秒，你吃的是脑子吗，你吃的是我的帧率
	@输出名("法外狂徒")
	方法 绘图(绘制消耗帧 : 整数,帧长 : 整数) : TextureRegion
		如果 字体1==空 则
			变量 fontName="/storage/emulated/0/.pvz/fonts/ziti"
			变量 pagecount=12
			变量 fh : FileHandle=FileHandle.新建(fontName+".fnt")
			变量 trs : TextureRegion[]=数组创建(TextureRegion,pagecount)
			循环(i, 0, 取数组长度(trs))
				变量 texture=Texture.从FileHandle创建(FileHandle.新建(fontName+(i+1).到文本()+".png"))
				trs[i]=TextureRegion.从Texture新建(texture)
			结束 循环
			字体1=BitmapFont.新建_trs(FileHandle.新建(fontName+".fnt"),trs2tra(trs))
		结束 如果
		如果 rectw==空 则
			变量 pixmap : Pixmap=Pixmap.新建(1,1)
			code #pixmap.setColor(0x000000ff);
			code #pixmap.fill();
			rectw=Texture.从PixMap新建(pixmap)
		结束 如果
		帧信息=""
		ultna=nullait/1000000
		ultnb=nullnbt
		nullait=0L
		nullnbt=0L
		如果 screen!=空 则

			code #screen.enableBlending();
			code #screen.setBlendFunction(0x302, 0x303);
			code #screen.setShader(#rgbShader);

			fbo.开始()
			screen.开始绘制()
			screen.stm(Matrix_4.从Matrix_3新建(Matrix_3.从floats新建(矩阵转置_m3(Matrix.新建().getValues()))))
			rgbShader.setUniformf3("u_rgbFactors",1,1,1)
			rgbShader.setUniformf4("u_clipRegion",0,0,width,height)
			变量 hex : 单精度小数=绘制消耗帧*1f/帧长
			//日志(hex.到文本()+"   "+帧长+"    "+绘制消耗帧)
			如果 取当前时间戳()-tt>20&&触摸!=空 则
				提交到新线程运行()
				handleTouch(触摸,真)
				触摸=空
				结束提交到新线程()
			结束 如果
			循环(i, 0, animess.长度)
				变量 ds : drawStyle
				ds.anim=animess[i]
				ds.sx=1f
				ds.sy=1f
				ds.kx=0f
				ds.ky=0f
				ds.color=0xffffffff
				ds.tx=0
				ds.ty=0
				绘制(screen,ds,hex)
			结束 循环
			如果 窗口类型==5 则
				清屏颜色(0,0,0,1)
				清屏()
				变量 conf : XMLR=( config)["image"]["logo"]
				变量 ImageRelativePath=conf.refeindex("ImageRelativePath")
				变量 scales=conf.refeindex("scale").到单精度小数()
				变量 matrix : Matrix=Matrix.新建()
				变量 logo= image.可释放图.取项目(ImageRelativePath).加载().取Texture()
				变量 scalew : 单精度小数=width*scales/logo.getWidth()
				matrix.postScale(scalew,scalew)
				//.postSkew_4(1,0,0,0)
				matrix.postTranslate((width-logo.getWidth()*scalew)/2,(height-logo.getHeight()*scalew)/2)
				//matrix.postScale(scale,scale)
				//变量 paintb : Paint=Paint.创建Paint().设置透明度((透明度*255).到整数())
				//日志((透明度*255).到整数().到文本())

				screen.dt_tma(logo,matrix,透明度,height,)
				动画进度= 动画进度+绘制消耗帧
				clear(matrix)
				clear(logo)
				//clear(paintb)
			否则 窗口类型==0

				变量 conf : XMLR=(config)["image"]["title"]
				变量 ImageRelativePath=conf.refeindex("ImageRelativePath")
				变量 dirt=image.可释放图.取项目(conf.refeindex("dirt")).加载().取Pixmap()
				变量 dirt_bottom=conf.refeindex("dirt_bottom").到单精度小数()*scale
				变量 grass : Pixmap=image.可释放图.取项目(conf.refeindex("grass")).加载().取Pixmap()
				变量 grass_bottom=conf.refeindex("grass_bottom").到单精度小数()*scale
				变量 titlescreen=image.可释放图.取项目(ImageRelativePath).加载().取Pixmap()
				变量 logo_top=conf.refeindex("logo_top").到单精度小数()*scale
				变量 matrix : Matrix=Matrix.新建().postScale(scale,scale)
				screen.draw_pm3a(titlescreen,matrix,,height)
				变量 matrix_dirt=Matrix.从Matrix新建(matrix)
				matrix_dirt.postTranslate(居中(dirt.width()*scale)+7*scale,height-dirt_bottom)
				screen.draw_pm3a(dirt,matrix_dirt,,height)
				变量 matrix_grass=Matrix.从Matrix新建(matrix)
				变量 grass_x=居中(grass.width()*scale)
				变量 grass_y=height-grass_bottom
				matrix_grass.postTranslate(grass_x,grass_y)
				变量 进度=取加载进度()
				变量 grass_width=(进度*grass.width()).到整数()
				如果 grass_width>0&&grass_width<=grass.width() 则
					grass=裁剪Pixmap(grass,0,0,grass_width,grass.height())
					screen.draw_pm3a(grass,matrix_grass,,height)
				结束 如果
				变量 roll=image.可释放图.取项目("SodRollCap").加载().取Pixmap()
				变量 matrix_roll=Matrix.从Matrix新建(matrix)
				变量 roll_scale=1f-进度*0.65f
				变量 roll_x=grass_width*scale+grass_x-roll.width()*scale/2
				变量 roll_y=height-grass_bottom-roll.height()*scale+grass.height()*scale
				matrix_roll.postRotate_3(进度*720f,roll.width()*scale/2,roll.height()*scale/2)
				matrix_roll.postScale_4(roll_scale,roll_scale,roll.width()*scale/2,roll.height()*scale)
				matrix_roll.postTranslate(roll_x,roll_y)
				如果 进度!=1.0f 则
					screen.draw_pm3a(roll,matrix_roll,,height)
				结束 如果
				变量 info : 文本
				变量 color : 整数=0xff000000
				变量 coll : 矩形x=触判矩形.取("start_botton",grass_x,height-dirt_bottom,dirt.width()*scale,dirt.height()*scale,窗口类型)
				绘制矩形(screen,coll,0xff0000ff)
				变量 logo=image.可释放图.取项目("PvZ_Logo").加载().取Pixmap()
				变量 matrix_logo=Matrix.从Matrix新建(matrix)
				matrix_logo.postTranslate(居中(logo.width()*scale),logo_top*scale)
				screen.draw_pm3a(logo,matrix_logo,,height)
				如果 coll.move 则
					color=0xffff6a00
				结束 如果
				变量 paint : Paint=Paint.创建Paint().设置字体(文字字体).设置文字大小((文字大小*scale).到整数()).设置颜色(color)
				如果 进度<1f 则
					info=游戏文本.取项目("LOADING")
				否则
					info=游戏文本.取项目("CLICK_TO_START")
				结束 如果
				变量 info_x=居中(paint.测量文字(info))
				变量 info_y=dirt_bottom-dirt.height()*scale/2+文字大小*scale*0.5f
				字体1.getData().setScale(文字大小*scale/30)
				字体1.setColor(Color.新建_rgba(argb2rgba(color)))
				字体1.draw_bsxy(screen,info,info_x,info_y)
				//////////canvas.绘制文字(info,info_x.到整数(),info_y.到整数(),paint,文字大小,-1)

			否则 加载完毕
				变量 ntt=取当前时间戳()
				//变量 bit : ColorSet=ColorSet.新建(width,height)
				如果 窗口类型==7 则
					变量 bk : Texture=空
					如果 场景==0 则
						如果 leveltype==0&&level<=3 则
							bk=image.可释放图.取项目("background1unsodded").加载().取Texture()
						否则
							bk=image.可释放图.取项目("background1").加载().取Texture()
						结束 如果
					否则 场景==1
						bk=image.可释放图.取项目("background2").加载().取Texture()
					否则 场景==2
						bk=image.可释放图.取项目("background3").加载().取Texture()
					否则 场景==3
						bk=image.可释放图.取项目("background4").加载().取Texture()
					否则 场景==4
						bk=image.可释放图.取项目("background5").加载().取Texture()
					否则 场景==5
						bk=image.可释放图.取项目("background6boss").加载().取Texture()
					结束 如果
					变量 matrix : Matrix=Matrix.新建().postScale(scale,scale)
					变量 matrix_bk : Matrix=Matrix.从Matrix新建(matrix)
					matrix_bk.postTranslate(x*scale,y*scale)
					//canvas.drawBitmap_3(bk,matrix_bk,空)
					变量 seedbank=image.可释放图.取项目("SeedBank").加载().取Pixmap()
					screen.dt_tma(bk,matrix_bk,,height)
					//canvas.绘制文字(plant.HP.到文本(),((plant.x()+x)*scale).到整数(),((plant.y+y)*scale).到整数(),Paint.创建Paint().设置文字大小(30).设置颜色(color_from_argb({255,hsv[0],hsv[1],hsv[2]})),30,-1)
					//日志(((20)*scale).到整数().到文本()+" res "+(60*scale).到整数())
					变量 matrix_sd : Matrix=Matrix.从Matrix新建(matrix)
					matrix_sd.postTranslate(10*scale,y*scale)
					screen.draw_pm3a(seedbank,matrix_sd,,height)

					变量 matrixc : Matrix
					matrixc.postScale(scale,scale)
					变量 rect : Pixmap=Pixmap.新建(1,1)
					code #rect.setColor(0x33333355);
					code #rect.fill();
					变量 t1 : Texture=Texture.从PixMap新建(rect)
					变量 rect2 : Pixmap=Pixmap.新建(1,1)
					code #rect2.setColor(0x00000088);
					code #rect2.fill();
					变量 t2 : Texture=Texture.从PixMap新建(rect2)
					变量 rect3 : Pixmap=Pixmap.新建(1,1)
					code #rect3.setColor(0x33333366);
					code #rect3.fill();
					变量 t3 : Texture=Texture.从PixMap新建(rect3)
					循环(i, 0, 取数组长度(cards))

						变量 hx=90+i*(mmx+10)
						变量 matrixd : Matrix=Matrix.从Matrix新建(matrixc)
						matrixd.preTranslate(hx,8)
						变量 pm : Pixmap=Pixmap.从Bitmap创建(getcardcs(cards[i]))
						screen.draw_pm3a(pm,matrixd,,height)
						code #pm.dispose();
						变量 coll : 矩形x=触判矩形.取("card_"+i,hx*scale,8*scale,50*scale,70*scale,窗口类型)
						如果 coll.move&&card_cool[i]<=0&&(getvalue(cards[i])<=suncount||不耗阳光) 则
							选择(cards[i])
							predidx=i
						结束 如果
						如果 card_cool[i]>0 则
							变量 maxct=getct(i)
							变量 wid=(0+50)*scale
							变量 hei=(0+70)*scale
							//日志(ytl2bl(hx*scale,height,wid).到文本())
							screen.draw_txywh(t1,hx*scale,ytl2bl(8*scale,height,hei),wid,hei)
							hei=(0+70*(card_cool[i]*1f/maxct))*scale
							screen.draw_txywh(t3,hx*scale,ytl2bl(8*scale,height,hei),wid,hei)
							/////////canvas.drawRect(hx*scale,8*scale,(hx+50)*scale,(8+70)*scale,Paint.创建Paint().设置颜色(0x55333333))
							////////:canvas.drawRect(hx*scale,8*scale,(hx+50)*scale,(8+70*(card_cool[i]*1f/maxct))*scale,Paint.创建Paint().设置颜色(0x66333333))
						结束 如果
						如果 suncount<getvalue(cards[i]) 则
							变量 wid=(0+50)*scale
							变量 hei=(0+70)*scale
							screen.draw_txywh(t2,hx*scale,ytl2bl(8*scale,height,hei),wid,hei)
							//////////canvas.drawRect(hx*scale,8*scale,(hx+50)*scale,(8+70)*scale,Paint.创建Paint().设置颜色(0x88000000))
						结束 如果
					结束 循环
					变量 paint : Paint=Paint.创建Paint().设置字体(文字字体).设置文字大小((文字大小*scale/25).到整数()).设置颜色(0xff000000)
					字体1.getData().setScale(文字大小*scale/25)
					字体1.setColor(Color.新建_rgba(argb2rgba(0xff000000)))
					//这里绘制了阳光总数
					字体1.draw_bsxy(screen,suncount.到文本(),((28-paint.测量文字(suncount.到文本())/4)*scale).到整数(),height-(62*scale).到整数())

					//////////canvas.绘制文字(suncount.到文本(),((45-paint.测量文字(suncount.到文本())/4)*scale).到整数(),(80*scale).到整数(),paint,(20*scale).到整数())
					变量 nt=取当前时间戳()
					循环(h, -2, 7)
						循环(i, 0, plantList.长度)
							如果 plantList[i].row==h 则

								变量 plant=plantList[i]
								shadow(plant.x+plant.cv.x-50,plant.y+plant.cv.y+17,"plantshadow",matrix)
								//ds.anim=zombie.anim
								ds.anim=空
								ds.sx=plant.scale
								ds.sy=plant.scale
								ds.kx=plant.旋转度数
								ds.ky=plant.旋转度数
								ds.kbx=0f
								ds.kby=0f
								ds.color=0xffffffff
								ds.tx=plant.x()
								ds.ty=plant.y
								ds.matrix=空
								循环(o, 0, 取数组长度(plant.anim))
									ds.anim=(plant.anim)[o]
									绘制(screen,ds,hex)
								结束 循环
							结束 如果
						结束 循环
					结束 循环
					ntt=取当前时间戳()
					帧信息=帧信息+"\n"+"plant:"+(ntt-nt).到文本()+"ms "+plantList.长度+"n"
					nt=ntt
					//code #canvas.save();
					循环(h, -2, 7)

						循环(i, 0, zombieList.长度)
							如果 zombieList[i].row==h 则
								变量 zombie=zombieList[i]

								//code #canvas.restore();
								//code #canvas.save();
								//canvas.clipRect(((x+zombie.x()-100)*scale).到整数(),(h*100*scale).到整数(),((x+zombie.x())*scale+150).到整数(),((h*100+200)*scale).到整数())
                                //这里是绘制僵尸的地方
								shadow(zombie.x()+zombie.cv.x-27,zombie.y+zombie.cv.y+zombie.cv.h-20,"plantshadow",matrix)

								ds.anim=zombie.anim
								ds.sx=1f
								ds.sy=1f
								ds.kx=zombie.旋转度数
								ds.ky=zombie.旋转度数
								ds.color=0xffffffff
								ds.tx=zombie.x()
								ds.ty=zombie.y
								如果 zombie.enableMatrix 则
									ds.matrix=zombie.matrix
								否则
									ds.matrix=空
								结束 如果
								如果 zombie.enableBroken 则
									变量 hx=(x+zombie.x()*zombie.限制矩形.x乘数+zombie.限制矩形.x)*scale
									变量 hy=(y+zombie.y*zombie.限制矩形.y乘数+zombie.限制矩形.y)*scale
									变量 hw=zombie.限制矩形.width*scale
									变量 hh=zombie.限制矩形.height*scale
									//绘制矩形2(screen,(x+zombie.x+zombie.限制矩形.x)*scale,(y+zombie.y+zombie.限制矩形.y)*scale,zombie.限制矩形.width*scale,zombie.限制矩形.height*scale,假)
									rgbShader.setUniformf4("u_clipRegion",hx,ytl2bl(hy,height,hh),hw,hh)
								否则
									rgbShader.setUniformf4("u_clipRegion",0,0,width,height)
								结束 如果
								绘制(screen,ds,hex)
								zombie.immUpdate()
							结束 如果
						结束 循环
					结束 循环
					rgbShader.setUniformf4("u_clipRegion",0,0,width,height)
					//code #canvas.restore();
					ntt=取当前时间戳()
					帧信息=帧信息+"\n"+"zombie:"+(ntt-nt).到文本()+"ms "+zombieList.长度+"n"
					nt=ntt
					循环(h, -2, 7)
						循环(i, 0, projList.长度)
							如果 projList[i].row==h 则
								变量 proj=projList[i]
								变量 bit : Pixmap=空
								变量 matrix_proj=Matrix.从Matrix新建(matrix).postTranslate((x+proj.x)*scale,(y+proj.y)*scale)
								如果 proj.tps=="image" 则
									bit=image.可释放图.取项目(proj.type).加载().取Pixmap()
									screen.draw_pm3a(bit,matrix_proj,,height)
									变量 ix=(x+proj.x)*scale
									变量 iy=(y+proj.y)*scale
									//////////canvas.drawRect(ix,iy,ix+10,iy+10,Paint.创建Paint().设置颜色(0xffff0000))
								结束 如果
							结束 如果
						结束 循环
					结束 循环

					ntt=取当前时间戳()
					帧信息=帧信息+"\n"+"proj:"+(ntt-nt).到文本()+"ms "+projList.长度+"n"
					nt=ntt
					循环(i, 0, coinList.长度)
						变量 coin=coinList[i]
						//变量 ds : drawStyle
						ds.anim=coin.anim
						ds.sx=coin.sx
						ds.sy=coin.sy
						ds.kx=coin.旋转度数
						ds.ky=coin.旋转度数
						ds.color=0xffffffff
						ds.tx=coin.x()
						ds.ty=coin.y()
						ds.matrix=空
						绘制(screen,ds,hex)
					结束 循环
					ntt=取当前时间戳()
					帧信息=帧信息+"\n"+"coin:"+(ntt-nt).到文本()+"ms "+coinList.长度+"n"
					nt=ntt
					循环(i, 0, tracleList.长度)
						变量 tracle=tracleList[i]
						如果 tracle.anim!=空 则
							//变量 ds : drawStyle
							ds.anim=tracle.anim
							ds.sx=1f
							ds.sy=1f
							ds.kx=tracle.r
							ds.ky=tracle.r
							ds.kbx=0f
							ds.kby=0f
							ds.color=0xffffffff
							ds.tx=tracle.x
							ds.ty=tracle.y
							ds.matrix=空

							绘制(screen,ds,hex)
						结束 如果
					结束 循环
					ntt=取当前时间戳()
					帧信息=帧信息+"\n"+"tracle:"+(ntt-nt).到文本()+"ms "+tracleList.长度+"n"
					nt=ntt
					循环(i, 0, particleList.长度)
						变量 particle=particleList[i]
						循环(u, 0, particle.parts.长度)
							变量 lz=(particle.parts)[u]
							变量 bit : Pixmap=空

							bit=image.可释放图.取项目(lz.pic).加载().取Pixmap()
							变量 matrix_part=Matrix.从Matrix新建(matrix).postRotate_3(lz.rotate,bit.height()/2,bit.height()/2).postScale_4(lz.取值(lz.scale),lz.取值(lz.scale),bit.width()/2,bit.height()/2).postTranslate((x+particle.x+(particle.parts)[u].x)*scale,(y+particle.y+(particle.parts)[u].y)*scale)
							如果 lz.cutn!=1 则
								变量 stx=lz.cutp*bit.width()/lz.cutn
								变量 wih=bit.width()/lz.cutn
								变量 het=bit.height()
								开始俘获异常()
								bit=裁剪Pixmap(bit,stx,0,wih,het)
								//code #bit=android.graphics.Bitmap.createBitmap(#bit,#stx,0,#wih,#het);
								俘获所有异常()
								//日志(lz.cutn+"   "+lz.cutp)
								结束俘获异常()
								//日志(lz.scale+"   /\\  "+lz.cutp)
							结束 如果
							//变量 paint : Paint=Paint.创建Paint().设置透明度((255*(particle.parts)[u].alpha).到整数())
							变量 color : 单精度小数[]={lz.取值(lz.red),lz.取值(lz.green),lz.取值(lz.blue),lz.取值(lz.alpha)}
							screen.draw_pm3c(bit,matrix_part,color,height,本对象)
						结束 循环
					结束 循环
					ntt=取当前时间戳()
					帧信息=帧信息+"\n"+"particle:"+(ntt-nt).到文本()+"ms "+particleList.长度+"n"
					nt=ntt
					//变量 ds : drawStyle
					ds.anim=animh
					ds.sx=1f
					ds.sy=1f
					ds.kx=0f
					ds.ky=0f
					ds.color=0xffffffff
					ds.tx=300
					ds.ty=0
					绘制(screen,ds,hex)
					//日志("hp"+zombie.HP)
					变量 meter : Pixmap=image.可释放图.取项目("FlagMeter").加载().取Pixmap()
					变量 procl : 整数=meter.width()-(meter.width()*wave*1f/wavemax).到整数()
					变量 procl2 : 整数=meter.width()-(meter.width()*(wave-1)*1f/wavemax).到整数()-procl
					如果 procl<=0 则
						procl=1
					否则 procl>=meter.width()-1
						procl=meter.width()-2
					结束 如果
					//日志(meter.高度.到文本())
					变量 left : Pixmap=空
					left=裁剪Pixmap(meter,0,0,procl,meter.height()/2)
					变量 right : Pixmap=空
					right=裁剪Pixmap2(meter,procl,meter.height()/2,meter.width(),meter.height()-1)
					变量 matrix_meter : Matrix


					matrix_meter.postTranslate(600,600-meter.height()/2)
					screen.draw_pm3a(left,Matrix.从Matrix新建(matrix_meter).postScale(scale,scale),,height)

					变量 matrix_flag : Matrix=Matrix.从Matrix新建(matrix_meter)
					matrix_meter.postTranslate(procl,0)
					screen.draw_pm3a(right,Matrix.从Matrix新建(matrix_meter).postScale(scale,scale),,height)

					变量 flags : Pixmap=image.可释放图.取项目("FlagMeterParts").加载().取Pixmap()
					变量 head : Pixmap=裁剪Pixmap2(flags,0,0,flags.width()/3,flags.height())
					变量 pole : Pixmap=裁剪Pixmap2(flags,flags.width()/3,0,flags.width()/3*2,flags.height())
					变量 flag : Pixmap=裁剪Pixmap2(flags,flags.width()/3*2,0,flags.width(),flags.height())
					变量 levelx : XMLRED=getwaveinfo().attr
					循环(i, 0, wavemax)
						如果 levelx[i].refeindex("flag")=="1" 则
							变量 matrix_f=Matrix.从Matrix新建(matrix_flag).postTranslate(meter.width()*(wavemax-i-1)*1f/wavemax*0.95f,-2)
							如果 i<=wave 则
								screen.draw_pm3a(pole,Matrix.从Matrix新建(matrix_f).postScale(scale,scale),,height)
								matrix_f.postTranslate(0f,-0.5f*flag.height())
								screen.draw_pm3a(flag,Matrix.从Matrix新建(matrix_f).postScale(scale,scale),,height)
							否则
								screen.draw_pm3a(flag,Matrix.从Matrix新建(matrix_f).postScale(scale,scale),,height)
							结束 如果
						结束 如果
					结束 循环
					matrix_meter.postTranslate(procl2*前进进度-1*head.width()/2-5,meter.height()/4-head.height()/2-5)
					screen.draw_pm3a(head,Matrix.从Matrix新建(matrix_meter.postScale(scale,scale)),,height)
					ntt=取当前时间戳()
					帧信息=帧信息+"\n"+"background:"+(ntt-nt).到文本()+"ms"
					nt=ntt
				否则 窗口类型==1
					如果 animess.长度==1&&animess[0].暂停 则
						如果 animess[0].animname=="anim_open" 则
							如果 state=="none" 则
								state="pre"
								如果 USER.账户数量==0 则
									创建账户(真)
								否则
									登记()
								结束 如果
							结束 如果
						结束 如果
					否则 state=="sign"

					否则 state=="advent"
						如果 bool>3500 则
							更新场景(7)
						否则
							如果 动画进度>bool+125 则
								bool=bool+125

								如果 bool%2==1 则
									如果 USER.账户.取成员(USER.当前账户).冒险关数<0 则
										animess[0].真值渲染("SelectorScreen_StartAdventure_button",{1f,1f,1f,1f}})
										//animess[0].代理图片("SelectorScreen_StartAdventure_button","IMAGE_REANIM_"+"SelectorScreen_StartAdventure_Highlight".到大写())
									否则
										animess[0].真值渲染("SelectorScreen_Adventure_button",{1f,1f,1f,1f})
										//animess[0].代理图片("SelectorScreen_Adventure_button","IMAGE_REANIM_"+"SelectorScreen_Adventure_highlight".到大写())
									结束 如果
								否则
									如果 USER.账户.取成员(USER.当前账户).冒险关数<0 则
										animess[0].真值渲染("SelectorScreen_StartAdventure_button",{0.5f,0.5f,0.5f,1f})
										//animess[0].代理图片("SelectorScreen_StartAdventure_button","IMAGE_REANIM_"+"SelectorScreen_StartAdventure_Highlight".到大写())
									否则
										animess[0].真值渲染("SelectorScreen_Adventure_button",{0.5f,0.5f,0.5f,1f}})
										//animess[0].代理图片("SelectorScreen_Adventure_button","IMAGE_REANIM_"+"SelectorScreen_Adventure_highlight".到大写())
									结束 如果
								结束 如果
							结束 如果
							动画进度= 动画进度+绘制消耗帧
						结束 如果

					结束 如果
					如果 animess.长度>0&&USER.账户数量!=0 则
						变量 paintw : Paint=Paint.创建Paint().设置字体(文字字体).设置文字大小((文字大小*scale*2*16/20).到整数()).设置颜色(0xff000000)
						字体1.getData().setScale(文字大小*scale/20)
						字体1.setColor(Color.新建_rgba(argb2rgba(0xffffffff)))
						//这里绘制了用户名
						变量 content=USER.账户.取成员(USER.当前账户).你的名字是ĉĵ+"!"
						字体1.draw_bsxy(screen,content,(173*scale-paintw.测量文字(content)/2).到整数(),height-(18*scale).到整数()-animess[0].获取当前POS("woodsign2").y)
					结束 如果
				结束 如果
				//canvas.drawBitmap(bit.取bitmap(),100,100,空)
			结束 如果



			变量 ntt=取当前时间戳()
			变量 nt=ntt

			循环(i, 0, 触判矩形.长度)
				变量 coll : 矩形x=(触判矩形.rects)[i]
				////////////绘制矩形(canvas,coll,0xff0000ff)
			结束 循环
			如果 渐变色值>=360f 则
				渐变色值=0f
			否则
				渐变色值=渐变色值+1f
			结束 如果
			循环(i, 0, zombieList.长度)
				变量 zombie=zombieList[i]
				变量 cv=zombieList[i].cv
				变量 coll : 矩形x
				coll.x=(cv.x+x+zombieList[i].x())*scale
				coll.y=(cv.y+y+zombieList[i].y)*scale
				coll.w=cv.w*scale
				coll.h=cv.h*scale
				绘制矩形(screen,coll,0xff0000ff)
				变量 HP=zombie.HP.到文本()
				如果 zombie.hasH==真 则
					HP=HP+"+"+zombie.HHP.到文本()
				结束 如果
				如果 zombie.hasS==真 则
					HP=HP+"+"+zombie.SHP.到文本()
				结束 如果
				变量 hsv=hsvToRgb_float({渐变色值,1f,1f})
				如果 cv.move 则
					变量 text : STSL=zombie.取信息()
					drawSTSL(screen,coll.x.到整数(),coll.y.到整数(),text)
				否则
					//////////canvas.绘制文字(HP,((zombie.x()+x)*scale).到整数(),((zombie.y+y)*scale).到整数(),Paint.创建Paint().设置文字大小(30).设置颜色(color_from_argb({255,hsv[0],hsv[1],hsv[2]})),30,-1)
				结束 如果
			结束 循环
			循环(i, 0, plantList.长度)
				变量 plant=plantList[i]
				变量 cv=plantList[i].cv
				变量 coll : 矩形x
				coll.x=(cv.x+x+plantList[i].x())*scale
				coll.y=(cv.y+y+plantList[i].y)*scale
				coll.w=cv.w*scale
				coll.h=cv.h*scale
				绘制矩形(screen,coll,0xff0000ff)
				变量 hsv=hsvToRgb_float({渐变色值,1f,1f})
				如果 cv.move 则
					变量 text : STSL=plant.取信息()
					drawSTSL(screen,coll.x.到整数(),coll.y.到整数(),text)
				否则
					//////////canvas.绘制文字(plant.HP.到文本(),((plant.x()+x)*scale).到整数(),((plant.y+y)*scale).到整数(),Paint.创建Paint().设置文字大小(30).设置颜色(color_from_argb({255,hsv[0],hsv[1],hsv[2]})),30,-1)
				结束 如果
			结束 循环
			循环(i, 0, coinList.长度)
				变量 coin=coinList[i]
				画碰撞体积(coin.cv,coin.x(),coin.y(),0xffff0000)
			结束 循环
			ntt=取当前时间戳()
			帧信息=帧信息+"\n"+"collisoin:"+(ntt-nt).到文本()+"ms"
			nt=ntt
			如果 pred 则
				变量 ds : drawStyle
				ds.anim=predanim
				ds.sx=1f
				ds.sy=1f
				ds.kx=0f
				ds.ky=0f
				ds.color=0xffffffff
				ds.tx=predxp-x-50
				ds.ty=predyp-50
				绘制(screen,ds,hex)
			结束 如果
		结束 如果
		/*
		
		变量 f1 : 单精度小数[]={1.5f,1.5f,1.5f}
		//rgbShader.setUniformf3("u_rgbFactors",0.5f,1.5f,0.5f)
		变量 matrix : Matrix=Matrix.新建().postTranslate(500,500)
		//rgbShader.setUniformf3("u_rgbFactors",1.5f,0.5f,0.5f)
		变量 f2 : 单精度小数[]={1.5f,0f,0f}
		循环(i, 0, 1)
			
			//rgbShader.setUniformf3("u_rgbFactors",1.5f,1.5f,1.5f)
			screen.dt_tmc(image.可释放图.取项目("Almanac_GroundIce").加载().取Texture(),matrix,f1,height,本对象)
			//rgbShader.setUniformf3("u_rgbFactors",1.5f,1.5f,1.5f)
			//rgbShader.setUniformf3("u_rgbFactors",1.5f,0f,0f)
		screen.dt_tmc(image.可释放图.取项目("Almanac_ZombieCard").加载().取Texture(),matrix,f2,height,本对象)
		//rgbShader.setUniformf3("u_rgbFactors",1.5f,0f,0f)
		结束 循环
		*/

		screen.结束绘制()
		fbo.终止()
		rgbShader.setUniformf1("u_opacity",1f)
		rgbShader.setUniformf3("u_rgbFactors",1f,1f,1f)
		变量 result : TextureRegion=TextureRegion.从Texture新建_twh(fbo.取纹理(),width,height).filp(false,true)
		//日志(result.getRegionWidth()+"    and  "+result.getRegionHeight())
		返回 result
	结束 方法

	方法 shadow(xi : 单精度小数,yi : 单精度小数,type : 文本,matrixs : Matrix)
		/////变量 azt=取当前纳秒时间戳()
		变量 matrix_shadow=Matrix.从Matrix新建(matrixs).postTranslate((x+xi)*scale,(y+yi)*scale)
		/////nullait=nullait+取当前纳秒时间戳()-azt
		bit=image.可释放图.取项目(type).加载().取Texture()

		screen.dt_tma(bit,matrix_shadow,,height)
	结束 方法

	方法 创建账户(回调注册 : 逻辑型)
		USER.账户数量=USER.账户数量+1
		变量 ud : userdata
		ud.你的名字是ĉĵ="Developer"
		ud.冒险关数=-1
		USER.账户.添加成员(ud)
		USER.当前账户=USER.账户.长度-1
		保存存档()
		如果 回调注册 则
			登记()
		结束 如果
	结束 方法

	方法 登记()
		state="sign"
		如果 (USER.账户)[USER.当前账户].冒险关数>=0 则
			animess[0].强制显示({"SelectorScreen_Adventure_button","SelectorScreen_Adventure_shadow"},0)
			animess[0].强制显示({"SelectorScreen_StartAdventure_button","SelectorScreen_StartAdventure_shadow"},-1)
		结束 如果
		如果 (USER.账户)[USER.当前账户].解锁小游戏==假 则
			animess[0].真值渲染("SelectorScreen_Survival_button",{0.5f,0.5f,0.5f,1f})
		结束 如果
		如果 (USER.账户)[USER.当前账户].解锁益智==假 则
			animess[0].真值渲染("SelectorScreen_Challenges_button",{0.5f,0.5f,0.5f,1f})
		结束 如果
		如果 (USER.账户)[USER.当前账户].解锁无尽==假 则
			animess[0].真值渲染("SelectorScreen_ZenGarden_button",{0.5f,0.5f,0.5f,1f})
		结束 如果
		animess[0].播放动画("anim_sign")
		animess[0].播完暂停=真
		变量 leaves={"leaf1","leaf2","leaf3","leaf4","leaf5","leaf_SelectorScreen_Leaves"}
		animess[0].强制显示(leaves,-1)
		animess.添加成员(Anim.创建动画("SelectorScreen",本对象).播放动画("anim_grass"))

	结束 方法

	方法 drawzb()

	结束 方法

	方法 drawSTSL(scr : SpriteBatch,xn : 整数,yn : 整数,stsl : STSL)
		变量 字大小 : 整数=1
		如果 yn+字大小*16*stsl.w1.长度>height 则
			yn=height-字大小*16*stsl.w1.长度
		结束 如果
		变量 titlecolor : 整数=color_from_rgb(hsvToRgb_float({渐变色值,1f,1f}))
		变量 valuecolor : 整数=颜色取反(titlecolor,0xff)
		变量 paint : Paint=Paint.创建Paint().设置文字大小(字大小*32).设置字体(文字字体)
		变量 yh=yn
		循环(i, 0, stsl.w1.长度)
			paint.设置颜色(titlecolor)
			变量 len : 整数=paint.测量文字((stsl.w1)[i]).到整数()
			字体1.getData().setScale(1)
			字体1.setColor(Color.新建_rgba(argb2rgba(titlecolor)))
			字体1.draw_bsxy(scr,(stsl.w1)[i],xn,ytl2bl(yh,height,80))
			////////canvas.画文字((stsl.w1)[i],xn,yh,paint)
			paint.设置颜色(valuecolor)
			字体1.setColor(Color.新建_rgba(argb2rgba(valuecolor)))
			字体1.draw_bsxy(scr,(stsl.w2)[i],xn+len+15,ytl2bl(yh,height,80))
			////////canvas.画文字((stsl.w2)[i],xn+len+15,yh,paint)
			yh=yh+字大小*16
		结束 循环
	结束 方法

	方法 killz()
		zombieList.清空()
	结束 方法

	方法 画碰撞体积(cv : 矩形x,xt : 单精度小数,yt : 单精度小数,颜色 : 整数)
		变量 coll : 矩形x
		coll.x=(cv.x+x+xt)*scale
		coll.y=(cv.y+y+yt)*scale
		coll.w=cv.w*scale
		coll.h=cv.h*scale
		绘制矩形(screen,coll,颜色)

	结束 方法


	方法 getct(type : 整数) : 整数
		返回 config["card"][type.到文本()].refeindex("ct").到整数()
	结束 方法

	方法 getvalue(type : 整数) : 整数
		返回 config["card"][type.到文本()].refeindex("v").到整数()
	结束 方法

	方法 读取场景存档() : 逻辑型
		开始俘获异常()
		USER.账户.清空()
		变量 path="/storage/emulated/0/.pvz/user.dat"
		如果 文件操作.文件是否存在(path) 则
			变量 hex=文件操作.读入文件字节(path)
			//FF FF FF FF FF FF FF FF 
			//FF FF FF FF FF FF FF FF
			//50 56 5A 31 00 00 00 01//版本
			//账户数量 当前账户序号
			//账户表索引 设置表索引
			//账户一索引 账户二索引(账户表索引)
			//......
			//账户一名字 冒险周目
			//冒险关数
			//小游戏数量 是否通关(byte 0 1)
			//无尽旗子数
			变量 pos=0x18
			USER.账户数量=字节到整数(读取hex(hex,pos,4))
			USER.当前账户=字节到整数(读取hex(hex,pos+4,4))
			//账户表索引↓
			pos=字节到整数(读取hex(hex,pos+8,4))
			循环(i, 0, USER.账户数量)
				变量 userp=字节到整数(读取hex(hex,pos+i*4,4))
				变量 user : userdata
				变量 用户名=读取文本2(hex,userp)
				user.你的名字是ĉĵ=字节集到文本(用户名)
				userp=userp+取数组长度(用户名)+1
				user.冒险周目=字节到整数(读取hex(hex,userp,4))
				user.冒险关数=字节到整数(读取hex(hex,userp+4,4))
				user.解锁小游戏=字节到布尔(读取hex(hex,userp+8,1)[0])
				user.解锁益智=字节到布尔(读取hex(hex,userp+9,1)[0])
				user.解锁无尽=字节到布尔(读取hex(hex,userp+10,1)[0])
				USER.账户.添加成员(user)
			结束 循环

			返回 真
		否则
			返回 假
		结束 如果
		俘获所有异常()
		弹出窗口("注意，已有存档读取失败，说不定是损坏了，简而言之，你存档没了。")
		结束俘获异常()
		返回 假
	结束 方法

	方法 弹出窗口(内容 : 文本)

	结束 方法

	方法 保存存档()
		变量 hex : 字节[]=数组创建(字节,1024)
		写入hex(hex,0,文本转字节("FF FF FF FF FF FF FF FF    FF FF FF FF FF FF FF FF    50 56 5A 31 00 00 00 01"))
		变量 pos=0x18
		写入hex(hex,pos,整数转倒字节(USER.账户.长度))
		写入hex(hex,pos+4,整数转倒字节(USER.当前账户))
		写入hex(hex,pos+8,整数转倒字节(pos+16))
		pos=pos+16
		变量 账户信息位置=pos+USER.账户.长度*4
		循环(i, 0, USER.账户.长度)
			写入hex(hex,pos+i*4,整数转倒字节(账户信息位置))
			变量 namew=USER.账户.取成员(i).你的名字是ĉĵ.到字节集()
			写入hex(hex,账户信息位置,namew)
			账户信息位置=账户信息位置+取数组长度(namew)+1
			写入hex(hex,账户信息位置,整数转倒字节(USER.账户.取成员(i).冒险周目))
			写入hex(hex,账户信息位置+4,整数转倒字节(USER.账户.取成员(i).冒险关数))
			账户信息位置=账户信息位置+8
			写入hex(hex,账户信息位置,{布尔到字节(USER.账户.取成员(i).解锁小游戏)})
			写入hex(hex,账户信息位置+1,{布尔到字节(USER.账户.取成员(i).解锁益智)})
			写入hex(hex,账户信息位置+2,{布尔到字节(USER.账户.取成员(i).解锁无尽)})
			账户信息位置=账户信息位置+3
		结束 循环
		变量 path="/storage/emulated/0/.pvz/user.dat"
		文件操作.写出字节文件(path,hex)
	结束 方法

	@静态
	方法 文本转字节(内容 : 文本) : 字节[]
		内容=内容.替换(" ","").替换("\n","")
		变量 结果 : 字节[]=空
		code #结果=new byte[#内容.length()/2];
		循环(i, 0, 取数组长度(结果))
			变量 temp=内容.取文本中间(i*2,i*2+1).到整数(16)
			如果 temp>127 则
				temp=temp-256
			结束 如果
			结果[i]=temp.到字节()
		结束 循环
		返回 结果
	结束 方法

	方法 写入hex(hex : 字节[],位置 : 整数,codew : 字节[])
		循环(i, 位置, 位置+取数组长度(codew))
			hex[i]=codew[i-位置]
		结束 循环
	结束 方法
	/*
	方法 保存代码(地址 : 整数,代码 : 文本,长度 : 整数)
		变量 位置 : 整数=0
		循环 (i, 地址, 地址+长度/2)
			文件1[i]=代码.取文本中间(位置,位置+1).到整数(16).到字节()
			位置=位置+2
		结束 循环
		
	结束 方法
	*/
	方法 hexStr2Str(hexStr : 文本) : 文本
		@code
        String str = "0123456789abcdef";
        char[] hexs = #hexStr.toCharArray();
        byte[] bytes = new byte[#hexStr.length() / 2]; //1个byte数值 -> 两个16进制字符
        int n;
        for (int i = 0; i < bytes.length; i++) {
            n = str.indexOf(hexs[2 * i]) * 16;
            n += str.indexOf(hexs[2 * i + 1]);
            bytes[i] = (byte) (n & 0xff);
        }
        return new String(bytes); 
	@end
	结束 方法

	方法 补齐(二进制 : 文本,长度 : 整数) 为 文本
		如果 二进制.长度>长度 则
			二进制=二进制.取文本右边(二进制.长度-长度)
		否则
			循环(i,0,长度)
				如果 二进制.长度<长度 则
					二进制="0"+二进制
				否则
					退出循环
				结束 如果
			结束 循环
		结束 如果
		返回 二进制
	结束 方法

	方法 读取(hex : 字节[],位置 : 整数,长度 : 整数,倒序 : 逻辑型=真) : 文本
		变量 result : 文本=""
		循环 (i,位置,位置+长度)
			如果 倒序 则
				result=补齐(hex[i].到整数().到十六进制(),2)+""+result
			否则
				result=result+""+补齐(hex[i].到整数().到十六进制(),2)
			结束 如果

		结束 循环
		返回 result
	结束 方法

	方法 读取hex(hex : 字节[],位置 : 整数,长度 : 整数) : 字节[]
		变量 res : 字节[]=空
		code #res=new byte[#长度];
		循环(i, 位置, 位置+长度)
			res[i-位置]=hex[i]
		结束 循环
		返回 res
	结束 方法

	方法 读取文本(hex : 字节[],位置 : 整数) : 文本
		变量 结果=位置
		变量 长度=0
		//变量 tmp : 文本
		循环(i,0,10)
			i=1
			如果 hex[位置]==0 则
				//结果=读取(位置+1,长度,假)
				//文件操作.追加文件内容("/storage/emulated/0/bk/bin.bkb",(位置+1).到文本()+结果+"\n")
				退出循环
			否则
				位置=位置+1
				//文件操作.追加文件内容("/storage/emulated/0/bk/bin.bkb",文件1[位置].到文本())
				长度=长度+1
			结束 如果
		结束 循环
		//文件操作.追加文件内容("/storage/emulated/0/bk/bin.bkb",位置+" "+结果+hexStr2Str(结果)+"\n")
		code byte[] bytes = new byte[#长度];
		循环(it,0,长度)
			code bytes[#it]=#hex[#it+#结果];
		结束 循环
		//文件操作.追加文件内容("/storage/emulated/0/bk/bin.bkb",位置+" "+结果+hexStr2Str(结果)+"\n")
		code return new String(bytes); 
	结束 方法

	//2024
	方法 读取文本2(hex : 字节[],位置 : 整数) : 字节[]
		变量 结果=位置
		变量 长度=0
		//变量 tmp : 文本
		循环(i,0,10)
			i=1
			如果 hex[位置]==0 则
				//结果=读取(位置+1,长度,假)
				//文件操作.追加文件内容("/storage/emulated/0/bk/bin.bkb",(位置+1).到文本()+结果+"\n")
				退出循环
			否则
				位置=位置+1
				//文件操作.追加文件内容("/storage/emulated/0/bk/bin.bkb",文件1[位置].到文本())
				长度=长度+1
			结束 如果
		结束 循环
		//文件操作.追加文件内容("/storage/emulated/0/bk/bin.bkb",位置+" "+结果+hexStr2Str(结果)+"\n")
		code byte[] bytes = new byte[#长度];
		循环(it,0,长度)
			code bytes[#it]=#hex[#it+#结果];
		结束 循环
		//文件操作.追加文件内容("/storage/emulated/0/bk/bin.bkb",位置+" "+结果+hexStr2Str(结果)+"\n")
		code return bytes; 
	结束 方法

	方法 选择(类型 : 整数)
		变量 plant : Plant=Plant.create(本对象,-1,-1,类型)
		pred=真
		predanim=(plant.anim)[0]
		predtype=类型
	结束 方法

	方法 消选()
		pred=假
		predanim=空
	结束 方法

	方法 initLevel(关卡 : 整数,类型 : 整数)
		level=关卡
		leveltype=类型
		场景=initLevel_场景(关卡,类型)
		动画进度=0
		//开始俘获异常()
		变量 zombietype=getzombie(getwaveinfo().refeindex("allowedZombies"))
		wave=0
		wavemax=getwaveinfo().attr.长度
		sunapp=0

		//初始阳光总数
		suncount=1000//100
		循环(i, 0, 取数组长度(zombietype))
			zombieList.添加成员(zombieidle(zombietype[i]))
		结束 循环
		变量 hst=取随机数(0,5)
		如果 取数组长度(zombietype)<5则
			hst=取数组长度(zombietype)
		结束 如果
		循环(i, 0, hst)
			zombieList.添加成员(zombieidle(zombietype[取随机数(0,取数组长度(zombietype)-1)]))
		结束 循环
		循环(i, 0, 5)
			//coinList.添加成员(Coin.create(本对象,lawnmower,200,100+i*100))
		结束 循环
		///
		//俘获所有异常()
		//日志(取俘获异常().取异常信息())
		//结束俘获异常()
	结束 方法

	方法 getwaveinfo() : XMLR
		返回 levels["PVZ"].getbyrefe("id",getlevelname(level,leveltype))
	结束 方法

	方法 zombieidle(类型 : 整数) : Zombie
		变量 zombie=Zombie.create(本对象,类型,0)
		zombie.anim.播放动画("anim_idle")
		zombie.x=取随机数(1000,1200)
		zombie.y=取随机数(0,500)
		zombie.anim.speed=0.5f*Zombie.tool_getrandom()
		返回 zombie
	结束 方法

	方法 getzombie(zt : 文本) : 整数[]
		变量 hst=zt.分割文本(" ")
		变量 mrs : 整数[]=数组创建(整数,取数组长度(hst))
		循环(i, 0, 取数组长度(hst))
			容错处理()
			mrs[i]=hst[i].到整数()
			结束容错()
		结束 循环
		mrs=整数数组排序(mrs)
		变量 hu : 整数=0
		循环(i, 1, 取数组长度(mrs))
			如果 mrs[i]==mrs[i-1] 则
				hu=hu+1
			结束 如果
		结束 循环
		变量 rlt : 整数[]=数组创建(整数,取数组长度(mrs)-hu)
		rlt[0]=mrs[0]
		变量 idx : 整数=1
		循环(i, 1, 取数组长度(mrs))
			如果 mrs[i]!=mrs[i-1] 则
				rlt[idx]=mrs[i]
				idx=idx+1
			结束 如果
		结束 循环
		返回 rlt
	结束 方法

	方法 getlevelname(level : 整数,mode : 整数) : 文本
		变量 modea : 文本
		如果 mode==0 则
			modea=""
		否则 mode==1
			modea="B"
		否则 mode==2
			modea="C"
		否则 mode==3
			modea="D"
		结束 如果
		返回 modea+level.到文本()
	结束 方法

	方法 initLevel_场景(关卡 : 整数,类型 : 整数) : 整数
		如果 类型==0||类型==1 则
			如果 关卡<=10 则
				返回 0
			否则 关卡<=20
				返回 1
			否则 关卡<=30
				返回 2
			否则 关卡<=40
				返回 3
			否则 关卡<50
				返回 4
			否则 关卡==50
				返回 5
			结束 如果
		结束 如果
		返回 0
	结束 方法

	方法 pixel2grid(x : 单精度小数,y : 单精度小数) : 整数[]
		变量 x1=x-260
		x1=(x1-x1%80)/80
		变量 y1=y-80
		y1=(y1-y1%100)/100
		变量 rlt : 整数[]={x1.到整数(),y1.到整数()}
		返回 rlt
	结束 方法

    方法 绘制矩形2(scr : SpriteBatch,xw : 单精度小数,yw : 单精度小数,ww : 单精度小数,hw : 单精度小数,fill : 逻辑型)
    	如果 fill 则
		否则
			
			scr.draw_txywh(rectw,xw*scale,ytl2bl(yw,height,ww),ww,hw)
			//rgbShader.setUniformf1("u_opacity",0.4f)
    	结束 如果
    结束 方法

	方法 绘制矩形(screenw : SpriteBatch,矩形w : 矩形x,颜色 : 整数)
		//变量 paint : Paint=Paint.创建Paint().设置颜色(颜色).设置样式(Paint_Style.STROKE).setStrokeWidth(2)
		
		//////////canvasw.drawRect(矩形w.x,矩形w.y,(矩形w.x+矩形w.w),(矩形w.y+矩形w.h),paint)
	结束 方法

	方法 handleTouch(event : 触摸事件,反复 : 逻辑型=假)
		开始俘获异常()
		触摸=event
		变量 click : 逻辑型
		变量 move : 逻辑型
		tx=(event.取横坐标()-realx) : 单精度小数
		ty=event.取纵坐标() : 单精度小数
		变量 nt=取当前时间戳()
		如果 pred 则
			变量 xy=pixel2grid(tx/scale-x,ty/scale)
			predx=xy[0]
			predy=xy[1]
			predxp=tx/scale
			predyp=ty/scale
		结束 如果
		如果 event.当前动作==触摸动作.按下&&反复==假 则
			dx=tx
			dy=ty
			tt=取当前时间戳()
		否则 event.当前动作==触摸动作.抬起&&反复==假
			如果 pred 则
				变量 canplant : 逻辑型=真
				循环(i, 0, plantList.长度)
					如果 predy==plantList[i].row&&predx==plantList[i].line 则
						canplant=假
						退出循环
					结束 如果
				结束 循环
				如果 canplant 则
					plantList.添加成员(Plant.create(本对象,predy,predx,predtype))
					变量 conf : XMLR=(config)["card"][predtype.到文本()]
					如果 无冷却==假 则
						card_cool[predidx]=conf.refeindex("ct").到整数()
					结束 如果
					如果 不耗阳光==假 则
						suncount=suncount-getvalue(predtype)
					结束 如果
				结束 如果
				pred=假
				predanim=空
			结束 如果
			如果 绝对值float(tx-dx)+绝对值float(tx-dx)<50&&nt-tt<100 则
				click=真
				加载进度.value="click:x="+tx+"  y="+ty
			结束 如果
			触摸=空
			//move=假
		否则 event.当前动作==触摸动作.移动||反复
			如果 nt-tt>=20 则
				move=真
				加载进度.value="move:x="+tx+"  y="+ty
			结束 如果
		结束 如果
		//如果 窗口类型==0 则
		变量 矩形已判定 : 逻辑型=假
		变量 point=Point.新建(tx/scale,ty/scale)
		如果 move||click 则
			循环(i, 0, 触判矩形.长度+coinList.长度+plantList.长度+zombieList.长度+判定区域.长度)
				变量 cv : 矩形x
				变量 rdx : 矩形x=空
				如果 i<触判矩形.长度 则
					cv=触判矩形.index(i)
					rdx=cv
				否则 i<触判矩形.长度+coinList.长度
					变量 coin=coinList[i-触判矩形.长度]
					cv.x=(coin.x()+coin.cv.x+x)*scale
					cv.y=(coin.y()+coin.cv.y)*scale
					cv.w=coin.cv.w*scale
					cv.h=coin.cv.h*scale
					rdx=coin.cv
					//日志(cv.x+"  "+cv.y+"  "+cv.w+"  "+cv.h)
				否则 i<触判矩形.长度+coinList.长度+plantList.长度
					变量 plant=plantList[i-触判矩形.长度-coinList.长度]
					cv.x=(plant.x()+plant.cv.x+x)*scale
					cv.y=(plant.y()+plant.cv.y)*scale
					cv.w=plant.cv.w*scale
					cv.h=plant.cv.h*scale
					rdx=plant.cv
				否则 i<触判矩形.长度+coinList.长度+plantList.长度+zombieList.长度
					变量 zombie=zombieList[i-触判矩形.长度-coinList.长度-plantList.长度]
					cv.x=(zombie.x()+zombie.cv.x+x)*scale
					cv.y=(zombie.y+zombie.cv.y)*scale
					cv.w=zombie.cv.w*scale
					cv.h=zombie.cv.h*scale
					rdx=zombie.cv
				否则
					rdx=空

				结束 如果
				如果 rdx!=空 则
					如果 cv.判定(tx,ty) 则
						rdx.move=move
						rdx.click=click
					否则
						rdx.move=假
						rdx.click=假
					结束 如果
				结束 如果
			结束 循环


		结束 如果
		循环(i, 0, 判定区域.长度)
			变量 rect=判定区域[i]
			如果 矩形已判定==假 则
				如果 rect.判定(point) 则
					矩形已判定=真
					如果 event.当前动作==触摸动作.抬起 则
						如果 rect.是点击(point) 则
							rect.点击(point)
						否则
							rect.划过(point,"up")
						结束 如果
						判定区域.当前矩形名称=""
					否则
						如果 判定区域.当前矩形名称==rect.name 则
							rect.划过(point,"move")
						否则
							如果 判定区域.当前矩形名称!="" 则
								判定区域.取矩形(判定区域.当前矩形名称).划过(point,"up")
							结束 如果
							rect.按下时间=取当前时间戳()
							rect.按下坐标=point
							rect.划过(point,"down")
							判定区域.当前矩形名称=rect.name
						结束 如果
					结束 如果
				结束 如果
			结束 如果
		结束 循环
		如果 矩形已判定==假&&判定区域.当前矩形名称!="" 则
			判定区域.取矩形(判定区域.当前矩形名称).划过(point,"up")
			判定区域.当前矩形名称=""
		结束 如果
		俘获所有异常()
		结束俘获异常()
		//结束 如果
	结束 方法

	方法 添加对话框()

	结束 方法

	方法 取加载进度() : 单精度小数
		变量 rlt : 单精度小数=0f
		如果 加载进度.info=="reanim" 则
		否则 加载进度.info=="image"
			返回 0f
		否则 加载进度.info=="anim"
			rlt=rlt+0.5f
		结束 如果
		如果 加载进度.int2!=0 则
			rlt=rlt+加载进度.int1*0.5f/加载进度.int2
		结束 如果
		//日志(rlt.到文本()+"   "+加载进度.int1+"   "+加载进度.int2+"   "+加载进度.info)
		返回 rlt
	结束 方法

	方法 居中(宽度 : 单精度小数) : 单精度小数
		返回 (width-宽度)/2
	结束 方法

	方法 绘制(screenw : SpriteBatch,ds : drawStyle,绘制时间 : 单精度小数)
		变量 anim=ds.anim
		//日志(anim.名称)
		循环(i, 0, anim.rean.长度)
			绘制动画(screenw,ds.anim,anim.frame,(anim.rean)[i],ds.tx,ds.ty,ds.kx,ds.ky,0,ds.sx,ds.sy,i,绘制时间,ds.kbx,ds.kby,ds.matrix)
			变量 hv=(anim.panims)[i]

			如果 hv!=空 则
				变量 dsw : drawStyle
				变量 pos_int : POS_int=anim.getPOS(anim.frame,i)
				变量 posw : POS=pos_int.pos2
				dsw.anim=hv
				dsw.sx=posw.sx
				dsw.sy=posw.sy
				dsw.kx=posw.kx
				dsw.ky=posw.ky
				dsw.tx=posw.x
				dsw.ty=posw.y
				//日志(anim.panims.双重动画.长度)
				如果 (anim.panims.双重动画)[anim.panims.索引轨道(i)] 则


					dsw.与(ds)
					变量 posf=anim.panims.pos(i)
					//变量 dst : drawStyle
					dst.tx=posf.x
					dst.ty=posf.y
					dst.sx=posf.sx
					dst.sy=posf.sy
					dst.kx=posf.kx
					dst.ky=posf.ky
					dsw.与(dst)
					dsw.kbx=posf.bkx
					dsw.kby=posf.bky
					clear(posf)
				结束 如果


				绘制(screenw,dsw,绘制时间)
				clear(dsw)
				clear(pos_int)
				clear(posw)

				clear(dst)

			否则

			结束 如果
		结束 循环
		如果 anim.强制演化帧!=-1 则
			anim.强制演化进度=anim.强制演化进度+anim.speed*anim.speedslow*绘制时间*speed
			如果 anim.强制演化进度>=anim.强制演化时间 则
				anim.frame=anim.强制演化帧
				anim.强制演化帧=-1
				anim.强制演化时间=-1f
				anim.强制演化进度=-1f
				anim.update=真
			结束 如果
		否则
			如果 anim.暂停==假 则
				anim.frame= anim.frame+anim.speed*anim.speedslow*绘制时间*speed
				如果 anim.frame+1+anim.speed*绘制时间*speed>=anim.maxframe 则
					如果 anim.播完暂停 则
						anim.暂停=真
					结束 如果
				结束 如果
				如果 anim.frame+1+anim.speed*anim.speedslow*绘制时间*speed>=anim.maxframe 则
					如果 anim.动画回归!="" 则
						anim.播放动画(anim.动画回归)
						anim.动画回归=""
						anim.hasReplay=真
					否则 anim.播完暂停==假
						anim.frame=anim.startframe
						anim.update=真
					结束 如果
				结束 如果
			结束 如果

		结束 如果
		clear(ds)
	结束 方法


	变量 buildtime : 整数=0
	变量 nullait : 长整数=0L
	变量 nullnbt : 长整数=0L
	方法 绘制动画(screenw : SpriteBatch,anim : Anim,indexw : 单精度小数,reans : Reanim,
		xf : 单精度小数,yf : 单精度小数,xk : 单精度小数,yk : 单精度小数,
		color : 整数,xs : 单精度小数,ys : 单精度小数,
		动画索引 : 整数,绘制时间 : 单精度小数,bkx : 单精度小数,bky : 单精度小数,
		matrixt : Matrix) : POS

		//变量 pos : POS=trackw.pos(indexw)
		/////标准解决
		//日志("a:"+anim.startframe+" s:"+anim.maxframe)
		nullnbt=nullnbt+1
		color=color
		变量 pos_int=anim.getPOS(indexw,动画索引)
		变量 pos=pos_int.pos0
		//变量 post=pos_int.pos1
		变量 posh=pos_int.pos2
		变量 index=pos_int.int
		如果 anim.f(动画索引,index)==-1 则
			返回 空
		结束 如果
		/*
		变量 indexw=index
		循环(i, 0, 10)
			i=0
			如果 pos.notinit()&&indexw>0 则
				变量 test=trackw.pos(indexw)
				pos.与(test)
				indexw=indexw-1
			否则
				退出循环
			结束 如果
		结束 循环
		*/
		//如果 pos.无值() 则
		//返回 posw
		//结束 如果
		//日志(reans.pos.image)
		如果 pos.image=="" 则
			//日志("null:"+anim.名称+"  "+(anim.rean)[动画索引].name)
			返回 空
		结束 如果
		//如果 reans.colorset.wid<=0 则
		//日志("invaild:"+anim.名称+"  "+pos.image)
		reans.colorset=resall.取项目(pos.image).加载()
		//返回 空
		//结束 如果
		变量 bit=reans.colorset.取Texture()

		变量 colorMatrix : Color=Color.新建_r_g_b_a(1,1,1,1)
		变量 渲染信息x : 渲染信息=(anim.渲染值)[动画索引]
		如果 渲染信息x.是否渲染 则
			变量 colorx=渲染信息x.取渲染值()
			变量 argb=colorx
			如果 colorMatrix==空 则
				colorMatrix=Color.新建_r_g_b_a(1,1,1,1)
				buildtime=buildtime+1
			结束 如果
			colorMatrix.set(argb[0],argb[1],argb[2],argb[3])
			渲染信息x.time=渲染信息x.time-anim.speed*绘制时间
		结束 如果
		如果 渲染信息x.代理图像!="" 则
			//日志("proxy:"+渲染信息x.代理图像)
			bit=resall.取项目(渲染信息x.代理图像).加载().取Texture()
		结束 如果
		//posw=pos
		变量 cm=渲染信息x.取渲染值()

		变量 f9 : 单精度小数[]


		绘制图形(screenw,bit,x*scale+xf*scale,y*scale+yf*scale,(posh.sx*xs)*scale,(posh.sy*ys)*scale,
		posh.kx,posh.ky,-1,cm,xk,yk,x*scale+xf*scale+bkx,y*scale+yf*scale+bky,reans.colorset.wid,reans.colorset.hei,matrixt,
		posh.x*scale*xs,posh.y*scale*ys)

		clear(pos_int)
		clear(pos)
		clear(posh)
		clear(bit)
		clear(colorMatrix)

		返回 空
	结束 方法

	方法 格子宽() : 整数
		返回 80
	结束 方法

	变量 matrix : Matrix=Matrix.新建()
	变量 paint : Paint=空
	@输出名("浮光掠影")
	方法 绘制图形(canvas : SpriteBatch,bitmap : Texture,x : 单精度小数,y : 单精度小数,sx : 单精度小数,sy : 单精度小数,
		kx : 单精度小数,ky : 单精度小数,f : 整数,cm : 单精度小数[],
		akx : 单精度小数,aky : 单精度小数,bkx : 单精度小数,bky : 单精度小数,w : 整数,h : 整数,matrixt : Matrix,
		xf : 单精度小数,yf : 单精度小数) : 对象

		如果 matrix==空 则
			matrix=Matrix.新建()
		否则
			code #matrix.reset();
		结束 如果

		变量 f9 : 单精度小数[]
		如果 matrixt!=空 则
			f9=matrixt.getValues()
			//code #matrix.setValues(#f9);
			f9[2]=f9[2]*scale
			f9[5]=f9[5]*scale
			matrixt=Matrix.新建()
			code #matrixt.setValues(#f9);
		结束 如果


		如果 paint==空 则
			paint=Paint.创建Paint()
			code #paint.setFilterBitmap(true);
		结束 如果
		//变量 reakx : 单精度小数=double2float(数学运算.角度转弧度(kx))
		变量 mcy=ky-kx
		变量 reaky : 单精度小数=double2float(数学运算.角度转弧度(360-mcy))
		//变量 reaky : 单精度小数=360-mcy
		matrix.postScale_4(sx,sy,0,0)
		变量 asy : 单精度小数=double2float(数学运算.求余弦(reaky))
		//cos_angle(reaky)
		变量 mx : 单精度小数=double2float(数学运算.求正弦(reaky))
		//h*sin_angle(reaky)/w
		//matrix.postSkew_4(reakx,reaky,w,h)
		//日志(sx+"   "+sy)

		matrix.postScale_4(1f,asy,0,0)
		matrix.postSkew_4(mx,0,0,0)
		matrix.postRotate_3(kx,0,0)
		matrix.postTranslate(xf,yf)
		如果 matrixt!=空 则
			code #matrix.postConcat(#matrixt);
		结束 如果
		matrix.postTranslate(x,y)
		matrix.postRotate_3((akx+aky)/2,bkx,bky)
		/*
		变量 f9 : 单精度小数[]=matrix.getValues()
		变量 mx=数学运算.角度转弧度(kx)
		变量 my=数学运算.角度转弧度(ky)
		f9[0]=double2float(sx*数学运算.求余弦(my))
		f9[4]=double2float(sy*数学运算.求余弦(mx))
		f9[2]=x
		f9[5]=y
		f9[1]=double2float(-1*h*数学运算.求正弦(my)/w)
		f9[3]=double2float(w*数学运算.求正弦(mx)/h)
		f9[6]=0
		f9[7]=0
		f9[8]=1
		code #matrix.setValues(#f9);
		/*
		@code
		if(#cm!=null){
			#paint.setColorFilter(new ColorMatrixColorFilter(#cm));
		} else {
		    #paint.setColorFilter(null);
		}
		*/
		/*
		@end
		*/

		@code
		
		@end

		如果 cm==空 则

		否则

			screen.dt_tmc(bitmap,matrix,cm,height,本对象)
			//rgbShader.setUniformf1("u_opacity",1)
			//rgbShader.setUniformf3("u_rgbFactors",1,1,1)
		结束 如果


		clear(bitmap)
		clear(matrix)

		返回 空
	结束 方法

	方法 initLawnString()
		变量 paths=文件操作.读入文本文件("/storage/emulated/0/.pvz/main/properties/LawnStrings.txt","GB2312")
		变量 t : 文本
		变量 str : 文本
		变量 state="wait"
		变量 enter : 逻辑型=假
		变量 name : 文本
		循环(i, 0, paths.长度)
			t=paths.取文本中间(i,i)
			如果 state=="wait" 则
				如果 t=="[" 则
					state="name"
					str=""
				结束 如果
			否则 state=="name"&&t=="]"
				name=str
				str=""
				state="text"
			否则
				如果 t=="\n" 则
					如果 str!="" 则
						如果 state=="text" 则
							如果 enter 则

								游戏文本.添加项目(name,str)
								//日志("["+name+"]   <"+str+">   over")
								str=""
								state="wait"
							否则
								enter=真
							结束 如果
						结束 如果
					结束 如果
				否则
					如果 enter 则
						如果 state=="text" 则
							t="\n"+t
						结束 如果
						enter=假
					结束 如果
					str=str+t
				结束 如果
			结束 如果
		结束 循环
	结束 方法



	方法 init()
		//提交到新线程运行()
		变量 pngpath : 文本[]=文本集集到文本集({文件操作.取子文件列表("/storage/emulated/0/.pvz/pvz/reanim/"),文件操作.取子文件列表("/storage/emulated/0/.pvz/main/reanim/")})
		加载进度.info="reanim"
		//加载进度.int2=取数组长度(pngpath)
		循环(i, 0, 取数组长度(pngpath))
			如果 pngpath[i].结尾为(".jpg")||pngpath[i].结尾为(".png") 则
				//日志("load:"+pngpath[i])
				resall.添加项目("IMAGE_REANIM_"+文件操作.取文件前缀名(文件操作.取文件名(pngpath[i].到大写())),读取图片("",pngpath[i]))
				加载进度=("索引资源:"+(i+1).到文本()+"/"+取数组长度(pngpath)).到文本()+"  "+文件操作.取文件前缀名(文件操作.取文件名(pngpath[i]))
				加载进度.int1=(i+1)
				加载进度.int2=取数组长度(pngpath)
			结束 如果
		结束 循环
		加载进度="加载动画"
		REANIM=reanim.init(加载进度,本对象)
		加载完毕=真

		//trackw=REANIM["Zombie"].track("Zombie_outerleg_foot")
		/////animh=Anim.创建动画("Z",本对象)
		//结束提交到新线程()
	结束 方法

	@静态
	方法 读取图片(相对路径 : 文本,完整路径 : 文本="/storage/emulated/0/.pvz/pvz/") : 未加载图
		变量 path : 文本=完整路径+相对路径
		如果 文件是否存在(path+".jpg") 则
			path=path+".jpg"
		否则 文件是否存在(path+".png")
			path=path+".png"
		结束 如果
		//日志(path)
		变量 可释放图 : 未加载图
		可释放图.路径=path
		如果 path.结尾为("jpg") 则
			循环(i, 0, 取数组长度(可释放图.b))
				如果 (可释放图.b)[i]==0xff000000 则
					(可释放图.b)[i]=0
				结束 如果
			结束 循环
		结束 如果
		返回 可释放图
	结束 方法

	//切换场景
	方法 更新场景(序号 : 整数)
		clear(animess)
		animess=创建 Animed
		窗口类型=序号
		动画进度=0
		如果 序号==0 则
			init()
		否则 序号==1
			变量 a1=Anim.创建动画("SelectorScreen",本对象).播放动画("anim_open")
			a1.播完暂停=真
			a1.强制显示({"SelectorScreen_Adventure_button","SelectorScreen_Adventure_shadow"},-1)
			animess.添加成员(a1)
			循环(i, 0, 7)
				如果 i!=3 则
					变量 animt=Anim.创建动画("SelectorScreen",本对象).播放动画("anim_cloud"+i)
					animt.speed=animt.speed/随机单精度小数(48,64)
					animt.frame=随机单精度小数(animt.startframe,animt.maxframe-1)
					animess[0].代理("Cloud"+i,animt,创建 POS,假)
				结束 如果
			结束 循环
			变量 冒险模式 : 判定矩形=判定矩形.新建_list(410,81,410,160,730,200,735,100)
			冒险模式.name="冒险模式"
			判定区域.添加成员(冒险模式)
			事件 冒险模式:划过(point : Point,状态 : 文本)
				如果 状态=="down" 则
					判定区域.当前矩形名称=冒险模式.name
					如果 USER.账户.取成员(USER.当前账户).冒险关数<0 则
						animess[0].代理图片("SelectorScreen_StartAdventure_button","IMAGE_REANIM_"+"SelectorScreen_StartAdventure_Highlight".到大写())
					否则
						animess[0].代理图片("SelectorScreen_Adventure_button","IMAGE_REANIM_"+"SelectorScreen_Adventure_highlight".到大写())
					结束 如果
				否则 状态=="move"
				否则 状态=="up"
					判定区域.当前矩形名称=""
					如果 USER.账户.取成员(USER.当前账户).冒险关数<0 则
						animess[0].代理图片("SelectorScreen_StartAdventure_button","IMAGE_REANIM_"+"SelectorScreen_StartAdventure_Button1".到大写())
					否则
						animess[0].代理图片("SelectorScreen_Adventure_button","IMAGE_REANIM_"+"SelectorScreen_Adventure_button".到大写())
					结束 如果
				结束 如果
			结束 事件
			事件 冒险模式:点击(point : Point)
				冒险模式.划过(point,"up")
				//2025.8.4
				//铛铛铛铛！呵呵哈哈哈哈哈
				变量 哈哈哈 : Anim=Anim.创建动画("Zombie_hand",本对象)
				哈哈哈.播完暂停=真
				animess.添加成员(哈哈哈)
				state="advent"
			结束 事件
			变量 迷你游戏 : 判定矩形=判定矩形.新建_list(410,170,410,250,710,305,725,220)//725,225,710,305)
			迷你游戏.name="迷你游戏"
			判定区域.添加成员(迷你游戏)
			事件 迷你游戏:划过(point : Point,状态 : 文本)
				如果 状态=="down" 则
					判定区域.当前矩形名称=迷你游戏.name
					animess[0].代理图片("SelectorScreen_Survival_button","IMAGE_REANIM_"+"SelectorScreen_Survival_highlight".到大写())
				否则 状态=="move"
				否则 状态=="up"
					判定区域.当前矩形名称=""
					animess[0].代理图片("SelectorScreen_Survival_button","IMAGE_REANIM_"+"SelectorScreen_Survival_button".到大写())
				结束 如果
			结束 事件
			事件 迷你游戏:点击(point : Point)
				迷你游戏.划过(point,"up")
				//点击了迷你游戏 玩玩小游戏 第二个选项
			结束 事件
			变量 益智模式 : 判定矩形=判定矩形.新建_list(415,260,415,320,680,380,700,310)//725,225,710,305)
			益智模式.name="益智模式"
			判定区域.添加成员(益智模式)
			事件 益智模式:划过(point : Point,状态 : 文本)
				如果 状态=="down" 则
					判定区域.当前矩形名称=益智模式.name
					animess[0].代理图片("SelectorScreen_Challenges_button","IMAGE_REANIM_"+"SelectorScreen_Challenges_highlight".到大写())
				否则 状态=="move"
				否则 状态=="up"
					判定区域.当前矩形名称=""
					animess[0].代理图片("SelectorScreen_Challenges_button","IMAGE_REANIM_"+"SelectorScreen_Challenges_button".到大写())
				结束 如果
			结束 事件
			事件 益智模式:点击(point : Point)
				益智模式.划过(point,"up")
				//点击了益智模式 解谜模式 第三个选项
			结束 事件
			变量 生存模式 : 判定矩形=判定矩形.新建_list(420,330,420,385,665,450,680,385)//725,225,710,305)
			生存模式.name="生存模式"
			判定区域.添加成员(生存模式)
			事件 生存模式:划过(point : Point,状态 : 文本)
				如果 状态=="down" 则
					判定区域.当前矩形名称=生存模式.name
					animess[0].代理图片("SelectorScreen_ZenGarden_button","IMAGE_REANIM_"+"SelectorScreen_Vasebreaker_highlight".到大写())
				否则 状态=="move"
				否则 状态=="up"
					判定区域.当前矩形名称=""
					animess[0].代理图片("SelectorScreen_ZenGarden_button","IMAGE_REANIM_"+"SelectorScreen_Vasebreaker_button".到大写())
				结束 如果
			结束 事件
			事件 生存模式:点击(point : Point)
				生存模式.划过(point,"up")
				//点击了益智模式 解谜模式 第三个选项
			结束 事件
		否则 序号==7
			initLevel(9,0)

		结束 如果
	结束 方法

	方法 addwave() 
		zombiecount=0
		前进进度=1f
		变量 zt : XMLR=(levels["PVZ"].getbyrefe("id",getlevelname(level,leveltype)).attr)[wave]
		变量 points=zt.refeindex("points").到整数()
		变量 mustHaveZombies=getzombie(zt.refeindex("mustHaveZombies"))
		循环(i, 0, 取数组长度(mustHaveZombies))
			zombieList.添加成员(Zombie.create(本对象,mustHaveZombies[i],取随机数(0,取行数()-1)))
			zombiecount=zombiecount+1
		结束 循环
		循环(ut, 0, 10)
			ut=1
			如果 points<=0 则
				退出循环
			结束 如果
			变量 hm : 整数集
			变量 rm : 整数集
			变量 allowz : 整数[]=getzombie(getwaveinfo().refeindex("allowedZombies"))
			循环(i, 0, 取数组长度(allowz))
				如果 getzv(allowz[i],"p").到整数()<=points 则
					hm.添加成员(allowz[i])
					变量 cs=getzv(allowz[i],"s").到单精度小数()
					变量 ce=getzv(allowz[i],"e").到单精度小数()
					rm.添加成员((cs+(ce-cs)*(wave*1f/wavemax)).到整数())
				结束 如果
			结束 循环
			变量 总权重 : 整数
			循环(i, 0, rm.长度)
				总权重=总权重+rm[i]
			结束 循环
			变量 shv=取随机数(0,总权重)
			循环(i, 0, hm.长度)
				如果 shv<rm[i] 则
					zombieList.添加成员(Zombie.create(本对象,hm[i],取随机数(0,4)))
					zombiecount=zombiecount+1
					points=points-getzv(hm[i],"p").到整数()
					退出循环
				结束 如果
			结束 循环
		结束 循环
		如果 zt.refeindex("flag")=="1" 则
			zombieList.添加成员(Zombie.create(本对象,1,取随机数(0,4)))
		结束 如果
		wave=wave+1
	结束 方法


	方法 getzv(type : 整数,name : 文本) : 文本
		返回 ((config)["Zombie"])[type.到文本()].refeindex(name)
	结束 方法

	方法 getweight(type : 整数) : 整数

	结束 方法

	方法 Update()
		如果 窗口类型==5 则
			变量 conf : XMLR=( config)["image"]["logo"]
			变量 time1=conf.refeindex("1time").到单精度小数()
			变量 time2=conf.refeindex("2time").到单精度小数()
			变量 time3=conf.refeindex("3time").到单精度小数()
			变量 exchangeTime=conf.refeindex("exchangeTime").到单精度小数()
			//变量 scale=conf.refeindex("1time")

			如果 动画进度<time1 则
				透明度= 动画进度/time1
			否则 动画进度>exchangeTime
				更新场景(0)
			否则 动画进度>=time3
				透明度=0
			否则 动画进度>time2
				透明度=(time3- 动画进度)/(time3-time2)
			结束 如果
		否则 窗口类型==0
			变量 coll : 矩形x=触判矩形.get("start_botton")
			如果 coll!=空 则
				如果 coll.move 则
					//日志("reals")
				否则 coll.click
					如果 取加载进度()==1f 则
						更新场景(1)

						//日志("real")
					否则
						coll.click=假
					结束 如果

				结束 如果
			结束 如果
		否则 窗口类型==7
			如果 前进进度>0f 则
				前进进度=前进进度-0.01f
			否则
				前进进度=0f
			结束 如果
			动画进度=动画进度+1
			如果 进程==0&&动画进度>=100 则
				进程=1
				动画进度=0
			否则 进程==1
				x=x-3f
				如果 x<=-600 则
					进程=2
					动画进度=0
				结束 如果
			否则 进程==2&&动画进度>=100
				进程=3
				动画进度=0
			否则 进程==3
				x=x+3f
				如果 x>=-217f 则
					进程=4
					动画进度=0
					zombieList.清空()
					//这里可以在测试使创建几个僵尸看一看(2025.8.2)
					循环(i, 0, 1)
						//日志("addzombie:"+i.到文本())
						zombieList.添加成员(Zombie.create(本对象,取随机数(8,8),取随机数(0,取行数()-1)))
					结束 循环
					循环(i, 0, 5)
						//日志("addzombie:"+i.到文本())
						//zombieList.添加成员(Zombie.create(本对象,取随机数(3,3),取随机数(0,4)))
					结束 循环
					循环(u,0,3)
						循环(i, 0, 5)
							//日志("addzombie:"+i.到文本())
							//plantList.添加成员(Plant.create(本对象,i,u,取随机数(0,0)))
						结束 循环
					结束 循环
				结束 如果
			否则 进程==4
				如果 动画进度>=200 则
					addwave()
					进程=5
					动画进度=0
				结束 如果
			否则 进程==5
				//3000
				//出怪最大间隔
				如果 动画进度>=3000||zombieList.长度*3<=zombiecount 则
					addwave()
					如果 wave==wavemax-1 则
						进程=6
					结束 如果
					动画进度=0
				结束 如果
			否则 进程==6
				如果 zombieList.长度==0 则
					plantwin()
				结束 如果
			结束 如果
			sunapp=sunapp-1
			如果 sunapp<=0 则
				sunapp=sunappmax
				变量 coin : Coin=Coin.create(本对象,sun,取随机数(400,800),50)
				coin.yv=0.5f
				coin.最低y=取随机数(200,500)
				coinList.添加成员(coin)
			结束 如果
		结束 如果
		循环(i, 0, 取数组长度(card_cool))
			如果 card_cool[i]>0 则
				card_cool[i]=card_cool[i]-1
			结束 如果
		结束 循环

		循环(i, 0, zombieList.长度)
			变量 hu : 整数=zombieList.长度-i-1
			变量 zombie=zombieList[hu]
			如果 zombie.冰冻>0 则
				zombie.冰冻=zombie.冰冻-1
			否则 zombie.寒冷>0
				zombie.anim.speedslows=0.5f
				zombie.寒冷=zombie.寒冷-1
				如果 zombie.间断点 则
					如果 zombieList[hu].Update() 则
						clear(zombieList[hu])
						zombieList.删除成员(hu)
					结束 如果
					zombie.间断点=假
				否则
					zombie.间断点=真
				结束 如果
			否则
				如果 zombieList[hu].Update() 则
					clear(zombieList[hu])
					zombieList.删除成员(hu)
				结束 如果
			结束 如果
		结束 循环
		循环(i, 0, plantList.长度)
			//开始俘获异常()
			变量 hu : 整数=plantList.长度-i-1
			如果 plantList[hu].Update() 则
				clear(plantList[hu])
				plantList.删除成员(hu)
			结束 如果
			//俘获所有异常()
			//结束俘获异常()
		结束 循环
		循环(i, 0, projList.长度)
			//开始俘获异常()
			变量 hu : 整数=projList.长度-i-1
			如果 projList[hu].Update() 则
				clear(projList[hu])
				projList.删除成员(hu)
			结束 如果
			//俘获所有异常()
			//结束俘获异常()
		结束 循环
		循环(i, 0, coinList.长度)
			//开始俘获异常()
			变量 hu : 整数=coinList.长度-i-1
			如果 coinList[hu].Update()==真 则
				clear(coinList[hu])
				coinList.删除成员(hu)
			结束 如果
			//俘获所有异常()
			//结束俘获异常()
		结束 循环
		循环(i, 0, tracleList.长度)
			//开始俘获异常()
			变量 hu : 整数=tracleList.长度-i-1
			如果 tracleList[hu].Update()==真 则
				clear(tracleList[hu])
				tracleList.删除成员(hu)
			结束 如果
			//俘获所有异常()
			//结束俘获异常()
		结束 循环
		循环(i, 0, particleList.长度)
			//开始俘获异常()
			变量 hu : 整数=particleList.长度-i-1
			如果 particleList[hu].Update()==真 则
				clear(particleList[hu])
				particleList.删除成员(hu)
			结束 如果
			//俘获所有异常()
			//结束俘获异常()
		结束 循环
	结束 方法

	方法 gety(row : 整数,x : 单精度小数) : 单精度小数
		变量 hl=取行高()
		如果 场景==2||场景==3 则
			返回 70+hl+row*hl
		否则 场景==4||场景==5
			如果 x>670 则
				返回 75+hl+row*hl
			否则
				返回 75+hl+(670-x)/4f+row*hl
			结束 如果
		否则
			返回 80+hl+row*hl
		结束 如果
	结束 方法





	方法 取行数() : 整数
		如果 场景==2||场景==3 则
			返回 6
		结束 如果
		返回 5
	结束 方法

	方法 取行高() : 整数
		如果 2<=场景&&场景<=5 则
			返回 85
		否则
			返回 100
		结束 如果
	结束 方法
	
	方法 取行宽() : 整数
		返回 80
	结束 方法

	方法 plantwin()

	结束 方法
结束 类