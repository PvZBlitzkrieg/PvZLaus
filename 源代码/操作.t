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
@导入Java("java.io.FileInputStream")
@附加权限(安卓权限.文件权限_读取)
@附加权限(安卓权限.文件权限_写入)
@附加权限(安卓权限.管理外部文件权限)
类 字节输入流
	code FileInputStream fin=null;

	@运算符重载
	方法 =(路径 : 文本)
		开始俘获异常()
		@code
		fin=new FileInputStream(#路径);
		@end
		俘获所有异常()
		结束俘获异常()
	结束 方法

	//read a byte
	方法 读取() : 整数
		开始俘获异常()
		code return fin.read();

		俘获所有异常()
		结束俘获异常()
		返回 -1
	结束 方法

	方法 读(b : 字节[]) : 整数
		开始俘获异常()
		code return fin.read(#b);
		俘获所有异常()
		//启动窗口.日志("55")
		结束俘获异常()
		返回 -1
	结束 方法

	方法 读到(byte : 字节[],偏移 : 整数,长度 : 整数) : 整数
		开始俘获异常()
		code return fin.read(#byte,#偏移,#长度);
		俘获所有异常()
		结束俘获异常()
		返回 -1
	结束 方法

	方法 有效() : 整数
		容错处理()
		code return fin.available();
		结束容错()
		返回 -1
	结束 方法

	方法 关闭()
		开始俘获异常()
		code fin.close();
		俘获所有异常()
		结束俘获异常()
	结束 方法
结束 类

@导入Java("java.io.FileOutputStream")
@附加权限(安卓权限.文件权限_读取)
@附加权限(安卓权限.文件权限_写入)
@附加权限(安卓权限.管理外部文件权限)
类 字节输出流
	code FileOutputStream fin=null;

	@运算符重载
	方法 =(路径 : 文本)
		开始俘获异常()
		@code
		fin=new FileOutputStream(#路径);
		@end
		俘获所有异常()
		结束俘获异常()
	结束 方法

	//read a byte
	方法 写出(内容 : 整数)
		开始俘获异常()
		code fin.write(#内容);
		俘获所有异常()
		结束俘获异常()
	结束 方法

	方法 写(b : 字节[])
		开始俘获异常()
		code fin.write(#b);
		俘获所有异常()
		//启动窗口.日志("55")
		结束俘获异常()
	结束 方法

	方法 写入(byte : 字节[],偏移 : 整数,长度 : 整数)
		开始俘获异常()
		code fin.read(#byte,#偏移,#长度);
		俘获所有异常()
		结束俘获异常()
	结束 方法

	方法 有效()
		code return fin.available();
	结束 方法

	方法 关闭()
		开始俘获异常()
		code fin.close();
		俘获所有异常()
		结束俘获异常()
	结束 方法
结束 类

类 逻辑型集
	变量 bools : 逻辑型集合

	@运算符重载
	方法 [](索引 : 整数) : 逻辑型
		返回 bools[索引]
	结束 方法

	@运算符重载
	方法 []=(索引 : 整数,值 : 逻辑型)
		bools[索引]=值
	结束 方法
结束 类

类 逻辑型集合 : 对象

	变量 bool : 逻辑型[]

	@静态
	方法 空集合() : 逻辑型集合
		变量 b : 逻辑型[]
		code #b=new boolean[0];
		变量 r : 逻辑型集合=b
		返回 r
	结束 方法

	@运算符重载
	方法 =(集合1 : 逻辑型[])
		bool=集合1
	结束 方法

	@运算符重载
	方法 [](索引 : 整数) : 逻辑型
		返回 bool[索引]
	结束 方法

	@运算符重载
	方法 []=(索引 : 整数,值 : 逻辑型)
		bool[索引]=值
	结束 方法

	方法 添加成员(成员 : 逻辑型)
		@code
		boolean[] b=new boolean[#取长度()+1];
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		@end
		变量 b1 : 逻辑型[]
		code #b1=b;
		循环(i, 0, 取长度())
			b1[i]=bool[i]
		结束 循环
		b1[取长度()]=成员
		bool = b1
	结束 方法

	方法 添加(集合2 : 逻辑型[])
		@code
		boolean[] b=new boolean[#bool.length+#集合2.length];
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		@end
		变量 b1 : 逻辑型[]
		code #b1=b;
		循环(i, 0, 取数组长度(bool))
			b1[i]=bool[i]
		结束 循环
		循环(u, 取数组长度(bool), 取数组长度(bool)+取数组长度(集合2))
			b1[u]=集合2[u-取数组长度(bool)]
		结束 循环
		bool = b1
	结束 方法

	方法 插入成员(索引 : 整数,成员 : 逻辑型)
		@code
		boolean[] b=new boolean[#取长度()+1];
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		@end
		变量 b1 : 逻辑型[]
		code #b1=b;
		变量 减一 : 逻辑型=假
		循环(i, 0, 取长度()-1)
			如果 i==索引 则
				减一=真
				b1[i]=成员
			否则
				如果 减一 则
					b1[i]=bool[i-1]
				否则
					b1[i]=bool[i]
				结束 如果
			结束 如果
		结束 循环
		bool = b1
	结束 方法

	方法 取成员(索引 : 整数) : 逻辑型
		返回 bool[索引]
	结束 方法

	//清空集合
	方法 清空()
		code #bool=new boolean[0];
	结束 方法

	//删除指定索引处成员
	方法 删除成员(索引 : 整数)
		@code
		boolean[] b=new boolean[#取长度()-1];
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		@end
		变量 b1 : 逻辑型[]
		code #b1=b;
		变量 减一 : 逻辑型=假
		循环(i, 0, 取长度()-1)
			如果 i==索引&&减一==假 则
				减一=真
				i=i-1
			否则
				如果 减一 则
					b1[i]=bool[i+1]
				否则
					b1[i]=bool[i]
				结束 如果
			结束 如果
		结束 循环
		bool = b1
	结束 方法

	方法 取长度() : 整数
		返回 取数组长度(bool)
	结束 方法

	/*
	将集合转为数组
	*/
	方法 到数组() : 逻辑型[]
		返回 bool
	结束 方法

	属性读 长度() : 整数
		返回 取数组长度(bool)
	结束 属性
结束 类


@全局类
@静态
类 基本类型操作

	@code
	public static byte[] intToByte4(int i) {
		byte[] targets = new byte[4];
		targets[3] = (byte) (i & 0xFF);
		targets[2] = (byte) (i >> 8 & 0xFF);
		targets[1] = (byte) (i >> 16 & 0xFF);
		targets[0] = (byte) (i >> 24 & 0xFF);
		return targets;
	}
	
	public static byte[] longToByte8(long lo) {
		byte[] targets = new byte[8];
		for (int i = 0; i < 8; i++) {
			int offset = (targets.length - 1 - i) * 8;
			targets[i] = (byte) ((lo >>> offset) & 0xFF);
		}
		return targets;
	}

	public static byte[] unsignedShortToByte2(int s) {
		byte[] targets = new byte[2];
		targets[0] = (byte) (s >> 8 & 0xFF);
		targets[1] = (byte) (s & 0xFF);
		return targets;
	}
		
	
	public static int byte4ToInt(byte[] bytes, int off) {
		int b0 = bytes[off] & 0xFF;
		int b1 = bytes[off + 1] & 0xFF;
		int b2 = bytes[off + 2] & 0xFF;
		int b3 = bytes[off + 3] & 0xFF;
		return (b0 << 24) | (b1 << 16) | (b2 << 8) | b3;
	}
	
	public static int setSpecifiedBitTo0(int originByte, int bitIndex) {
        return originByte &= ~(1 << bitIndex);
    }


	@end

	@静态
	常量 hex : 文本集合={"00","01","02","03","04","05","06","07","08","09","0a","0b","0c","0d","0e","0f","10","11","12","13","14","15","16","17","18","19","1a","1b","1c","1d","1e","1f","20","21","22","23","24","25","26","27","28","29","2a","2b","2c","2d","2e","2f","30","31","32","33","34","35","36","37","38","39","3a","3b","3c","3d","3e","3f","40","41","42","43","44","45","46","47","48","49","4a","4b","4c","4d","4e","4f","50","51","52","53","54","55","56","57","58","59","5a","5b","5c","5d","5e","5f","60","61","62","63","64","65","66","67","68","69","6a","6b","6c","6d","6e","6f","70","71","72","73","74","75","76","77","78","79","7a","7b","7c","7d","7e","7f","80",
	"81","82","83","84","85","86","87","88","89","8a","8b","8c","8d","8e","8f","90","91","92","93","94","95","96","97","98","99","9a","9b","9c","9d","9e","9f","a0","a1","a2","a3","a4","a5","a6","a7","a8","a9","aa","ab","ac","ad","ae","af","b0","b1","b2","b3","b4","b5","b6","b7","b8","b9","ba","bb","bc","bd","be","bf","c0","c1","c2","c3","c4","c5","c6","c7","c8","c9","ca","cb","cc","cd","ce","cf","d0","d1","d2","d3","d4","d5","d6","d7","d8","d9","da","db","dc","dd","de","df","e0","e1","e2","e3","e4","e5","e6","e7","e8","e9","ea","eb","ec","ed","ee","ef","f0","f1","f2","f3","f4","f5","f6","f7","f8","f9","fa","fb","fc","fd","fe","ff"}

	@静态
	方法 add(a : 整数,b : 整数) : 整数
		返回 a+b
	结束 方法

	@静态
	方法 位清零(数 : 整数,index : 整数) : 整数
		code #数 &=~(#index);
		返回 数
	结束 方法

	@静态
	方法 添加int(集合1 : 字节[],值 : 整数) : 字节[]
		code return #字节集追加字节集(#集合1,intToByte4(#值));
	结束 方法

	@静态
	方法 min(a : 整数,b : 整数) : 整数
		如果 a<b 则
			返回 a
		否则
			返回 b
		结束 如果
	结束 方法

	@静态
	方法 max(a : 整数,b : 整数) : 整数
		如果 a>b 则
			返回 a
		否则
			返回 b
		结束 如果
	结束 方法

	@静态
	方法 double2float(d : 小数) : 单精度小数
		code return new Double(#d).floatValue();
	结束 方法

	@静态
	方法 添加byte3(集合1 : 字节[],值 : 整数) : 字节[]
		变量 b : 字节[]=整数转字节(值)
		返回 字节集追加字节集(集合1,{b[1],b[2],b[3]})
	结束 方法

	@静态
	方法 赋值byte3(集合1 : 字节[],值 : 整数,偏移 : 整数) : 字节[]
		变量 b : 字节[]=整数转字节(值)
		集合1[偏移]=b[1]
		集合1[偏移+1]=b[2]
		集合1[偏移+2]=b[3]
		返回 集合1
	结束 方法

	@静态
	方法 赋值int(集合1 : 字节[],值 : 整数,偏移 : 整数) : 字节[]
		code byte[] b=intToByte4(#值);
		循环(i, 偏移, 偏移+4)
			code #集合1[#i]=b[#i-#偏移];
		结束 循环
		返回 集合1
	结束 方法

	@静态
	方法 向下取整(num : 单精度小数) : 整数
		返回 num%1
	结束 方法

	方法 比较大小(a : 单精度小数,b : 单精度小数) : 整数
		如果 a>b 则
			返回 1
		否则 a==b
			返回 0
		否则
			返回 -1
		结束 如果
	结束 方法

	@静态
	方法 添加long(集合1 : 字节[],值 : 长整数) : 字节[]
		code return #字节集追加字节集(#集合1,longToByte8(#值));
	结束 方法

	@静态
	方法 添加short(集合1 : 字节[],值 : 整数) : 字节[]
		code return #字节集追加字节集(#集合1,unsignedShortToByte2(#值));
	结束 方法

	@静态
	方法 转整数(集合1 : 字节[],偏移 : 整数) : 整数
		code return byte4ToInt(#集合1,#偏移);
	结束 方法

	@静态
	方法 字节集追加字节集(a : 字节[],b : 字节[]) : 字节[]
		变量 s=取数组长度(a)
		变量 x=s+取数组长度(b)
		变量 z : 字节[]
		@code
		byte[] a2 = new byte[#x];
		#z=a2;
		@end
		//弹出提示(x)
		如果 取数组长度(a)!=0 则
			循环(i, 0, s)
				z[i]=a[i]
			结束 循环
		结束 如果
		循环(i, s, x)
			//开始俘获异常()
			z[i]=b[i-s]
			//俘获所有异常()
			//弹出提示(i)
			//结束俘获异常()
		结束 循环
		返回 z;
	结束 方法

	@静态
	方法 文本数组到文本_文件名(list : 文本[],分隔符 : 文本) : 文本
		变量 rs : 文本
		循环(i, 0, 取数组长度(list))
			rs=rs+文件操作.取文件名(list[i])
			如果 i!=取数组长度(list)-1则
				rs=rs+分隔符
			结束 如果
		结束 循环
		返回 rs
	结束 方法

	@静态
	方法 文本数组到文本(list : 文本[],分隔符 : 文本) : 文本
		变量 rs : 文本
		循环(i, 0, 取数组长度(list))
			rs=rs+list[i]
			如果 i!=取数组长度(list)-1则
				rs=rs+分隔符
			结束 如果
		结束 循环
		返回 rs
	结束 方法

	@静态
	方法 字节集到文本(b : 字节[]) : 文本
		code return new String(#b);
	结束 方法

	@静态
	方法 字节转文本(b : 字节) : 文本
		变量 a : 整数=(b : 整数)
		如果 a<0 则
			a=add(a,256)
		结束 如果
		返回 hex[a]
	结束 方法

	@静态
	方法 字节集转文本(b : 字节[]) : 文本
		变量 r : 文本
		循环(i, 0, 取数组长度(b))
			r=r+字节转文本(b[i])
			如果 i!=取数组长度(b)-1则
				如果 i%16==15 则
					r=r+"\n"
				否则 i%8==7
					r=r+"  "
				否则
					r=r+" "
				结束 如果
			结束 如果
		结束 循环
		返回 r
	结束 方法

	@静态
	方法 addbyte(a : 字节[],b : 字节) : 字节[]
		变量 x=取数组长度(a)+1
		变量 z : 字节[]
		@code
		byte[] a2 = new byte[#x];
		#z=a2;
		@end
		循环(i, 0, x-1)
			z[i]=a[i]
		结束 循环
		z[x-1]=b
		//弹出提示(取数组长度(z))
		返回 z;
	结束 方法

	@静态
	方法 addint(a : 整数[],b : 整数) : 整数[]
		变量 x=取数组长度(a)+1
		变量 z : 整数[]
		@code
		int[] a2 = new int[#x];
		#z=a2;
		@end
		循环(i, 0, x-1)
			z[i]=a[i]
		结束 循环
		z[x-1]=b
		//弹出提示(取数组长度(z))
		返回 z;
	结束 方法

	@静态
	方法 addbool(a : 逻辑型[],b : 逻辑型[]) : 逻辑型[]
		变量 s=取数组长度(a)
		变量 x=s+取数组长度(b)
		变量 z : 逻辑型[]
		@code
		boolean[] a2 = new boolean[#x];
		#z=a2;
		@end
		//弹出提示(x)
		如果 取数组长度(a)!=0 则
			循环(i, 0, s)
				z[i]=a[i]
			结束 循环
		结束 如果
		循环(i, s, x)
			//开始俘获异常()
			z[i]=b[i-s]
			//俘获所有异常()
			//弹出提示(i)
			//结束俘获异常()
		结束 循环
		返回 z;
	结束 方法

	@静态
	方法 整数数组排序(数组 : 整数[]) : 整数[]
		code java.util.Arrays.sort(#数组);
		返回 数组
	结束 方法

	@静态
	方法 文本到长整数(内容 : 文本) : 长整数
		如果 内容.开头为("0x") 则
			返回 内容.取文本中间(2,内容.长度-1).到长整数(16)
		否则
			返回 内容.到长整数()
		结束 如果
	结束 方法

	@静态
	方法 文本到整数(内容 : 文本) : 整数
		如果 内容.开头为("0x") 则
			返回 内容.取文本中间(2,内容.长度-1).到整数(16)
		否则
			返回 内容.到整数()
		结束 如果
	结束 方法

	@静态
	方法 sub(a : 字节,b : 字节) : 字节
		返回 (a.到整数()-b.到整数()).到字节()
	结束 方法

	@静态
	方法 文本到字节2(内容 : 文本) : 字节
		如果 内容.开头为("0x") 则
			返回 (内容.取文本中间(2,内容.长度-1).到整数(16)%256).到字节()
		否则
			返回 (内容.到整数()%256).到字节()
		结束 如果
	结束 方法

	@静态
	方法 长整数到字节集(内容 : 长整数) : 字节[]
		code return longToByte8(#内容);
	结束 方法

	@静态
	方法 长整数到精简字节集(内容 : 长整数) : 字节[]
		变量 b1 : 字节[]
		变量 b2 : 字节[]=创建字节数组(长整数精简字节长度(内容))
		code #b1 = longToByte8(#内容);
		循环(i, 0, 取数组长度(b2))
			b2[i]=b1[8-取数组长度(b2)+i]
		结束 循环
		返回 b2
	结束 方法

	@静态
	方法 长整数精简字节长度(内容 : 长整数) : 整数
		如果 内容<0L 则
			返回 8
		否则 内容<0x100L
			返回 1
		否则 内容<0x10000L
			返回 2
		否则 内容<0x1000000L
			返回 3
		否则 内容<0x100000000L
			返回 4
		否则 内容<0x10000000000L
			返回 5
		否则 内容<0x1000000000000L
			返回 6
		否则 内容<0x100000000000000L
			返回 7
		否则
			返回 8
		结束 如果
	结束 方法

	@静态
	方法 整数到精简字节集(内容 : 整数) : 字节[]
		变量 b1 : 字节[]
		变量 b2 : 字节[]=创建字节数组(整数精简字节长度(内容))
		code #b1 = intToByte4(#内容);
		循环(i, 0, 取数组长度(b2))
			b2[i]=b1[4-取数组长度(b2)+i]
		结束 循环
		返回 b2
	结束 方法

	@静态
	方法 整数精简字节长度(内容 : 整数) : 整数
		如果 内容<0 则
			返回 4
		否则 内容<0x100
			返回 1
		否则 内容<0x10000
			返回 2
		否则 内容<0x1000000
			返回 3
		否则
			返回 4
		结束 如果
	结束 方法


	@静态
	方法 字节集转布尔集(b : 字节[]) : 逻辑型[]
		变量 lj : 逻辑型[]
		变量 lja : 逻辑型[]={假,假,假,假,假,假,假,假}
		循环(i, 0, 取数组长度(b))
			code #lja[7]=#整数转布尔((#b[#i]+128>>0)%2);
			code #lja[6]=#整数转布尔((#b[#i]+128>>1)%2);
			code #lja[5]=#整数转布尔((#b[#i]+128>>2)%2);
			code #lja[4]=#整数转布尔((#b[#i]+128>>3)%2);
			code #lja[3]=#整数转布尔((#b[#i]+128>>4)%2);
			code #lja[2]=#整数转布尔((#b[#i]+128>>5)%2);
			code #lja[1]=#整数转布尔((#b[#i]+128>>6)%2);
			如果 b[i]<0 则
				lja[0]=真
			否则
				lja[0]=假
			结束 如果
			lj=addbool(lj,lja)
			//文本框2.内容 = 文本框2.内容+"\n"+b[i].到文本()+" "+lja[0].到文本()+" "+lja[1].到文本()+" "+lja[2].到文本()+" "+lja[3].到文本()+" "+lja[4].到文本()+" "+lja[5].到文本()+" "+lja[6].到文本()+" "+lja[7].到文本()
		结束 循环
		返回 lj
	结束 方法

	@静态
	方法 布尔集转字节集(b : 逻辑型[]) : 字节[]
		变量 lj : 字节[]
		如果 取数组长度(b)%8!=0 则
			lj=创建字节数组(取数组长度(b)/8+1)
		否则
			lj=创建字节数组(取数组长度(b)/8)
		结束 如果
		循环(i, 0, 取数组长度(lj))
			容错处理()
			lj[i]=(128*布尔转整数(b[i*8])+64*布尔转整数(b[i*8+1])+32*布尔转整数(b[i*8+2])+16*布尔转整数(b[i*8+3])+8*布尔转整数(b[i*8+4])+4*布尔转整数(b[i*8+5])+2*布尔转整数(b[i*8+6])+1*布尔转整数(b[i*8+7])).到字节()
			结束容错()
		结束 循环
		返回 lj
	结束 方法

	//2025.8.4
	@静态
	方法 布尔到字节(bool : 逻辑型) : 字节
		如果 bool 则
			变量 true1 : 字节=1
			返回 true1
		否则
			变量 false1 : 字节=0
			返回 false1
		结束 如果
	结束 方法

	//2025.8.4
	@静态
	方法 字节到布尔(byte : 字节) : 逻辑型
		如果 byte==0 则
			返回 false
		否则
			返回 true
		结束 如果
	结束 方法

	//2024
	@静态
	方法 整数转布尔(z : 整数) : 逻辑型
		如果 z==1 则
			返回 真
		否则
			返回 假
		结束 如果
	结束 方法

	@静态
	方法 布尔转整数(z : 逻辑型) : 整数
		如果 z 则
			返回 1
		否则
			返回 0
		结束 如果
	结束 方法

	@静态
	方法 整数转字节(值 为 整数) 为 字节[]
		code return intToByte4(#值);
	结束 方法

	@静态
	方法 整数转倒字节(值 为 整数) 为 字节[]
		变量 字节a : 字节[]
		code #字节a= intToByte4(#值);
		变量 字节b : 字节[]=数组创建(字节,取数组长度(字节a))
		循环(i, 0, 取数组长度(字节b))
			字节b[i]=字节a[取数组长度(字节a)-i-1]
		结束 循环
		返回 字节b
	结束 方法

	@静态
	方法 整数转字节整数集(值 为 整数) 为 整数[]
		变量 b : 字节[]
		变量 r : 整数[]=创建整数数组(4)
		code #b=intToByte4(#值);
		循环(i, 0, 4)
			r[i]=b[i]
		结束 循环
		返回 r
	结束 方法

	@静态
	方法 整数转固定布尔(值 为 整数,长度 : 整数) 为 逻辑型[]
		变量 b : 逻辑型集合=逻辑型集合.空集合()
		长度=长度%32
		变量 b2 : 逻辑型集合=字节集转布尔集(整数转字节(值))
		如果 长度==32 则
			返回 b2.到数组()
		结束 如果
		循环(i, 0, 长度)
			b.添加成员(b2[32-长度+i])
		结束 循环
		返回 b.到数组()
	结束 方法

	@静态
	方法 整数转固定字节(值 为 整数,长度 : 整数) 为 字节[]
		变量 b : 字节[]=创建字节数组(长度)
		长度=长度%4
		变量 b2 : 字节[]=整数转字节(值)
		如果 长度==4 则
			返回 b2
		结束 如果
		循环(i, 0, 长度)
			b[i]=b2[4-长度+i]
		结束 循环
		返回 b
	结束 方法

	@静态
	方法 长整数转固定布尔(值 为 长整数,长度 : 整数) 为 逻辑型[]
		变量 b : 逻辑型集合=逻辑型集合.空集合()
		长度=长度%64
		变量 b2 : 逻辑型集合=字节集转布尔集(长整数到字节集(值))
		如果 长度==64 则
			返回 b2.到数组()
		结束 如果
		循环(i, 0, 长度)
			b.添加成员(b2[64-长度+i])
		结束 循环
		返回 b.到数组()
	结束 方法

	@静态
	方法 长整数转固定字节(值 为 整数,长度 : 整数) 为 字节[]
		变量 b : 字节[]=创建字节数组(长度)
		长度=长度%8
		变量 b2 : 字节[]=长整数到字节集(值)
		如果 长度==8 则
			返回 b2
		结束 如果
		循环(i, 0, 长度)
			b[i]=b2[8-长度+i]
		结束 循环
		返回 b
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

	@静态
	方法 整数乘方(数字1 : 整数,数字2 : 整数) : 整数
		如果 数字2<=0 则
			返回 1
		否则 数字2==1
			返回 数字1
		否则
			变量 res=1
			循环(i, 0, 数字2)
				res=res*数字1
			结束 循环
			返回 res
		结束 如果
	结束 方法

	@静态
	方法 整数集到文本(int : 整数[]) : 文本
		变量 str : 文本=取数组长度(int)+"\n"
		循环(i, 0, 取数组长度(int))
			str=str+int[i].到文本()+"\n"
		结束 循环
		返回 str
	结束 方法

	@静态
	方法 创建字节数组(长度 : 整数) : 字节[]
		code return new byte[#长度];
	结束 方法

	@静态
	方法 创建整数数组(长度 : 整数) : 整数[]
		code return new int[#长度];
	结束 方法

	@静态
	方法 乘方(a : 整数,b : 整数) : 整数
		变量 r : 整数=1
		循环(i, 0, b)
			r=r*a
		结束 循环
		返回 r
	结束 方法

	@静态
	方法 乘方小数(a : 小数,b : 整数) : 小数
		变量 r : 小数=1
		循环(i, 0, b)
			r=r*a
		结束 循环
		返回 r
	结束 方法

	@静态
	方法 文本属于文本集(tl : 文本[],t : 文本) : 逻辑型
		循环(i, 0, 取数组长度(tl))
			如果 tl[i]==t 则
				返回 真
			结束 如果
		结束 循环
		返回 假
	结束 方法

	@静态
	方法 整数属于整数集(tl : 整数[],t : 整数) : 逻辑型
		循环(i, 0, 取数组长度(tl))
			如果 tl[i]==t 则
				返回 真
			结束 如果
		结束 循环
		返回 假
	结束 方法
结束 类

类 整数集

	变量 ints : 整数[]

	@静态
	方法 空集合() : 整数集
		变量 b : 整数[]
		code #b=new int[0];
		变量 r : 整数集=b
		返回 r
	结束 方法

	@运算符重载
	方法 =(集合1 : 整数[])
		ints=集合1
	结束 方法

	@运算符重载
	方法 [](索引 : 整数) : 整数
		返回 ints[索引]
	结束 方法

	@运算符重载
	方法 []=(索引 : 整数,值 : 整数)
		ints[索引]=值
	结束 方法

	方法 添加成员(成员 : 整数)
		@code
		int[] b=new int[#取长度()+1];
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		@end
		变量 b1 : 整数[]
		code #b1=b;
		循环(i, 0, 取长度())
			b1[i]=ints[i]
		结束 循环
		b1[取长度()]=成员
		ints = b1
	结束 方法

	方法 添加(集合2 : 整数[])
		@code
		int[] b=new int[#ints.length+#集合2.length];
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		@end
		变量 b1 : 整数[]
		code #b1=b;
		循环(i, 0, 取数组长度(ints))
			b1[i]=ints[i]
		结束 循环
		循环(u, 取数组长度(ints), 取数组长度(ints)+取数组长度(集合2))
			b1[u]=集合2[u-取数组长度(ints)]
		结束 循环
		ints = b1
	结束 方法

	方法 插入成员(索引 : 整数,成员 : 整数)
		@code
		int[] b=new int[#取长度()+1];
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		@end
		变量 b1 : 整数[]
		code #b1=b;
		变量 减一 : 逻辑型=假
		循环(i, 0, 取长度()-1)
			如果 i==索引 则
				减一=真
				b1[i]=成员
			否则
				如果 减一 则
					b1[i]=ints[i-1]
				否则
					b1[i]=ints[i]
				结束 如果
			结束 如果
		结束 循环
		ints = b1
	结束 方法

	方法 取成员(索引 : 整数) : 整数
		返回 ints[索引]
	结束 方法

	//清空集合
	方法 清空()
		code #ints=new int[0];
	结束 方法

	//删除指定索引处成员
	方法 删除成员(索引 : 整数)
		@code
		int[] b=new int[#取长度()-1];
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		@end
		变量 b1 : 整数[]
		code #b1=b;
		变量 减一 : 逻辑型=假
		循环(i, 0, 取长度()-1)
			如果 i==索引&&减一==假 则
				减一=真
				i=i-1
			否则
				如果 减一 则
					b1[i]=ints[i+1]
				否则
					b1[i]=ints[i]
				结束 如果
			结束 如果
		结束 循环
		ints = b1
	结束 方法

	方法 取长度() : 整数
		返回 取数组长度(ints)
	结束 方法

	/*
	将集合转为数组
	*/
	方法 到数组() : 整数[]
		返回 ints
	结束 方法

	属性读 长度() : 整数
		返回 取数组长度(ints)
	结束 属性
结束 类

@全局类
类 数组编辑
	@静态
	@嵌入式代码
	方法 数组添加成员(数组 : 变体型,内容 : 变体型,类型 : 变体型)
		@code
		#类型[] b=new #类型[#数组.length+1];
		for(int i=0;i<#数组.length;i++){
			b[i]=#数组[i];
		}
		b[#数组.length]=#内容;
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		#数组=b;
		@end

	结束 方法

	@静态
	@嵌入式代码
	方法 数组扩展(数组 : 变体型,长度 : 整数,类型 : 变体型) : 对象[]
		@code
		#类型[] b=new #类型[#数组.length+#长度];
		for(int i=0;i<#数组.length;i++){
			b[i]=#数组[i];
		}
		/*
		for(int i=0;i==#集合1.length;i++){
			b[i]=#集合1[i];
		}
		for(int u=0;u==#集合1.length+#集合2.length;u++){
			b[u]=#集合2[u-#集合1.length];
		}
		return b;
		@end
		*/
		#数组=b;
		@end

	结束 方法

	@静态
	@嵌入式代码
	方法 数组创建(成员类型 : 变体型,长度 : 整数) : 对象[]
		code new #成员类型[#长度]
	结束 方法

	@静态
	@嵌入式代码
	方法 数组数组创建(成员类型 : 变体型,长度 : 整数) : 对象[][]
		code new #成员类型[#长度][0]
	结束 方法

	@静态
	@嵌入式代码
	方法 数组截取(数组 : 变体型,left : 整数,right : 整数,类型 : 变体型) : 对象[]
		@code
		#类型[] btempxck=new #类型[#right-#left];
		for(int i=#left;i<#right;i++){
			btempxck[i-#left]=#数组[i];
		}
		#数组=btempxck;
		@end

	结束 方法
结束 类



@强制输出
@指代类("android.media.MediaCodec")
类 MediaCodec
	/*
	@嵌入式代码
	方法 置入(键名 : 文本, 数据 : 对象)
		code #this.putExtra(#键名, #数据);
	结束 方法
	*/


	@静态
	常量 BUFFER_FLAG_CODEC_CONFIG=0x00000002
	@静态
	常量 BUFFER_FLAG_KEY_FRAME=0x00000001
	@静态
	常量 CONFIGURE_FLAG_ENCODE=0x00000001

	@后缀代码(" throws Exception")
	@静态
	方法 createEncoderByType(type : 文本) : MediaCodec
		code return android.media.MediaCodec.createEncoderByType(#type);
	结束 方法

	方法 configure(format : MediaFormat,surface : Surface,crypto : MediaCrypto,flags : 整数)
		code #this.configure(#format,#surface,#crypto,#flags);
	结束 方法

	方法 createInputSurface() : Surface
		code return #this.createInputSurface();
	结束 方法

	方法 dequeueOutputBuffer(info : BufferInfo,timeoutUs : 长整数) : 整数
		code return #this.dequeueOutputBuffer(#info,#timeoutUs);
	结束 方法

	方法 dequeueInputBuffer(timeoutUs : 长整数) : 整数
		code return #this.dequeueInputBuffer(#timeoutUs);
	结束 方法

	方法 getOutputBuffer(index : 整数) : ByteBuffer
		code return #this.getOutputBuffer(#index);
	结束 方法

	方法 queueInputBuffer(index : 整数,offset : 整数,size : 整数,presentationTimeUs : 长整数,flags : 整数)
		code #this.queueInputBuffer(#index,#offset,#size,#presentationTimeUs,#flags);
	结束 方法

	方法 releaseOutputBuffer(index : 整数,render : 逻辑型)
		code #this.releaseOutputBuffer(#index,#render);
	结束 方法

	方法 start()
		code #this.start();
	结束 方法

	方法 stop()
		code #this.stop();
	结束 方法

	方法 release()
		code #this.release();
	结束 方法



结束 类

@强制输出
@指代类("android.media.MediaFormat")
类 MediaFormat


	/*
Creates a minimal audio format.

Parameters
mime
String: The mime type of the content. This value cannot be null.
sampleRate
int: The sampling rate of the content.
channelCount
int: The number of audio channels in the content.
Returns
MediaFormat
This value cannot be null.
*/
	@静态
	方法 createAudioFormat(mime : 文本, sampleRate : 整数, channelCount : 整数) : MediaFormat
		code return android.media.MediaFormat.createAudioFormat(#mime,#sampleRate,#channelCount);
	结束 方法
	@静态
	方法 createSubtitleFormat(mime : 文本, language : 文本) : MediaFormat
		code return android.media.MediaFormat.createSubtitleFormat(#mime,#language);
	结束 方法
	/*
Creates a minimal video format.

Parameters
mime
String: The mime type of the content. This value cannot be null.
width
int: The width of the content (in pixels)
height
int: The height of the content (in pixels)
Returns
MediaFormat
This value cannot be null.
*/
	@静态
	方法 createVideoFormat(mime : 文本, width : 整数, height : 整数) : MediaFormat
		code return android.media.MediaFormat.createVideoFormat(#mime,#width,#height);
	结束 方法

	@静态
	常量 COLOR_RANGE_FULL : 整数=0x00000001
	@静态
	常量 COLOR_RANGE_LIMITED : 整数=0x00000002
	@静态
	常量 COLOR_STANDARD_BT2020 : 整数=0x00000006
	@静态
	常量 COLOR_STANDARD_BT601_NTSC : 整数=0x00000004
	@静态
	常量 COLOR_STANDARD_BT601_PAL : 整数=0x00000002
	@静态
	常量 COLOR_STANDARD_BT709 : 整数=0x00000001
	@静态
	常量 COLOR_TRANSFER_HLG : 整数=0x00000007
	@静态
	常量 COLOR_TRANSFER_LINEAR : 整数=0x00000001
	@静态
	常量 COLOR_TRANSFER_SDR_VIDEO : 整数=0x00000003
	@静态
	常量 COLOR_TRANSFER_ST2084 : 整数=0x00000006
	@静态
	常量 KEY_AAC_DRC_ALBUM_MODE : 文本="aac-drc-album-mode"
	@静态
	常量 KEY_AAC_DRC_ATTENUATION_FACTOR : 文本="aac-drc-cut-level"
	@静态
	常量 KEY_AAC_DRC_BOOST_FACTOR : 文本="aaaaaaa"
	@静态
	常量 KEY_AAC_DRC_EFFECT_TYPE : 文本="aaaaaaa"
	@静态
	常量 KEY_AAC_DRC_HEAVY_COMPRESSION : 文本="aaaaaaa"
	@静态
	常量 KEY_AAC_DRC_OUTPUT_LOUDNESS : 文本="aaaaaaa"
	@静态
	常量 KEY_AAC_DRC_TARGET_REFERENCE_LEVEL : 文本="aaaaaaa"
	@静态
	常量 KEY_AAC_ENCODED_TARGET_LEVEL : 文本="aaaaaaa"
	@静态
	常量 KEY_AAC_MAX_OUTPUT_CHANNEL_COUNT : 文本="aaaaaaa"
	@静态
	常量 KEY_AAC_PROFILE : 文本="aaaaaaa"
	@静态
	常量 KEY_AAC_SBR_MODE : 文本="aaaaaaa"
	@静态
	常量 KEY_ALLOW_FRAME_DROP : 文本="aaaaaaa"
	@静态
	常量 KEY_BITRATE_MODE : 文本="aaaaaaa"
	@静态
	常量 KEY_BIT_RATE : 文本="bitrate"
	@静态
	常量 KEY_BUFFER_BATCH_MAX_OUTPUT_SIZE : 文本="aaaaaaa"
	@静态
	常量 KEY_BUFFER_BATCH_THRESHOLD_OUTPUT_SIZE : 文本="aaaaaaa"
	@静态
	常量 KEY_CAPTION_SERVICE_NUMBER : 文本="aaaaaaa"
	@静态
	常量 KEY_CAPTURE_RATE : 文本="aaaaaaa"
	@静态
	常量 KEY_CHANNEL_COUNT : 文本="aaaaaaa"
	@静态
	常量 KEY_CHANNEL_MASK : 文本="aaaaaaa"
	@静态
	常量 KEY_CODECS_STRING : 文本="aaaaaaa"
	@静态
	常量 KEY_COLOR_FORMAT : 文本="color-format"
	@静态
	常量 KEY_COLOR_RANGE : 文本="color-range"
	@静态
	常量 KEY_COLOR_STANDARD : 文本="color-standard"
	@静态
	常量 KEY_COLOR_TRANSFER : 文本="color-transfer"
	@静态
	常量 KEY_COLOR_TRANSFER_REQUEST : 文本="color-transfer-request"
	@静态
	常量 KEY_COMPLEXITY : 文本="complexity"
	@静态
	常量 KEY_CREATE_INPUT_SURFACE_SUSPENDED : 文本="create-input-buffers-suspended"
	@静态
	常量 KEY_CROP_BOTTOM : 文本="crop-bottom"
	@静态
	常量 KEY_CROP_LEFT : 文本="crop-left"
	@静态
	常量 KEY_CROP_RIGHT : 文本="crop-right"
	@静态
	常量 KEY_CROP_TOP : 文本="crop-top"
	@静态
	常量 KEY_DURATION : 文本="durationUs"
	@静态
	常量 KEY_ENCODER_DELAY : 文本="encoder-delay"
	@静态
	常量 KEY_ENCODER_PADDING : 文本="encoder-padding"
	@静态
	常量 KEY_FLAC_COMPRESSION_LEVEL : 文本="flac-compression-level"
	@静态
	常量 KEY_FRAME_RATE : 文本="frame-rate"
	@静态
	常量 KEY_GRID_COLUMNS : 文本="grid-cols"
	@静态
	常量 KEY_GRID_ROWS : 文本="grid-rows"
	@静态
	常量 KEY_HAPTIC_CHANNEL_COUNT : 文本="haptic-channel-count"
	@静态
	常量 KEY_HARDWARE_AV_SYNC_ID : 文本="hw-av-sync-id"
	@静态
	常量 KEY_HDR10_PLUS_INFO : 文本="hdr10-plus-info"
	@静态
	常量 KEY_HDR_STATIC_INFO : 文本="hdr-static-info"
	@静态
	常量 KEY_HEIGHT : 文本="height"
	@静态
	常量 KEY_IMPORTANCE : 文本="importance"
	@静态
	常量 KEY_INTRA_REFRESH_PERIOD : 文本="intra-refresh-period"
	@静态
	常量 KEY_IS_ADTS : 文本="is-adts"
	@静态
	常量 KEY_IS_AUTOSELECT : 文本="is-autoselect"
	@静态
	常量 KEY_IS_DEFAULT : 文本="is-default"
	@静态
	常量 KEY_IS_FORCED_SUBTITLE : 文本="is-forced-subtitle"
	@静态
	常量 KEY_I_FRAME_INTERVAL : 文本="i-frame-interval"
	@静态
	常量 KEY_LANGUAGE : 文本="language"
	@静态
	常量 KEY_LATENCY : 文本="latency"
	@静态
	常量 KEY_LEVEL : 文本="level"
	@静态
	常量 KEY_LOW_LATENCY : 文本="low-latency"
	@静态
	常量 KEY_MAX_B_FRAMES : 文本="aaaaaaa"
	@静态
	常量 KEY_MAX_FPS_TO_ENCODER : 文本="aaaaaaa"
	@静态
	常量 KEY_MAX_HEIGHT : 文本="aaaaaaa"
	@静态
	常量 KEY_MAX_INPUT_SIZE : 文本="aaaaaaa"
	@静态
	常量 KEY_MAX_OUTPUT_CHANNEL_COUNT : 文本="aaaaaaa"
	@静态
	常量 KEY_MAX_PTS_GAP_TO_ENCODER : 文本="aaaaaaa"
	@静态
	常量 KEY_MAX_WIDTH : 文本="aaaaaaa"
	@静态
	常量 KEY_MIME : 文本="mime"
	@静态
	常量 KEY_MPEGH_REFERENCE_CHANNEL_LAYOUT : 文本="aaaaaaa"
	@静态
	常量 KEY_MPEGH_PROFILE_LEVEL_INDICATION : 文本="aaaaaaa"
	@静态
	常量 KEY_OPERATING_RATE : 文本="aaaaaaa"
	@静态
	常量 KEY_OUTPUT_REORDER_DEPTH : 文本="aaaaaaa"
	@静态
	常量 KEY_PCM_ENCODING : 文本="aaaaaaa"
	@静态
	常量 KEY_PICTURE_TYPE : 文本="aaaaaaa"
	@静态
	常量 KEY_PIXEL_ASPECT_RATIO_HEIGHT : 文本="aaaaaaa"
	@静态
	常量 KEY_PIXEL_ASPECT_RATIO_WIDTH : 文本="aaaaaaa"
	@静态
	常量 KEY_PREPEND_HEADER_TO_SYNC_FRAMES : 文本="aaaaaaa"
	@静态
	常量 KEY_PRIORITY : 文本="aaaaaaa"
	@静态
	常量 KEY_PUSH_BLANK_BUFFERS_ON_STOP : 文本="aaaaaaa"
	@静态
	常量 KEY_REPEAT_PREVIOUS_FRAME_AFTER : 文本="aaaaaaa"
	@静态
	常量 KEY_PROFILE : 文本="aaaaaaa"
	@静态
	常量 KEY_QUALITY : 文本="aaaaaaa"
	@静态
	常量 KEY_ROTATION : 文本="aaaaaaa"
	@静态
	常量 KEY_SAMPLE_RATE : 文本="aaaaaaa"
	@静态
	常量 KEY_SLICE_HEIGHT : 文本="aaaaaaa"
	@静态
	常量 KEY_SLOW_MOTION_MARKERS : 文本="aaaaaaa"
	@静态
	常量 KEY_STRIDE : 文本="aaaaaaa"
	@静态
	常量 KEY_TEMPORAL_LAYERING : 文本="aaaaaaa"
	@静态
	常量 KEY_TILE_HEIGHT : 文本="aaaaaaa"
	@静态
	常量 KEY_TILE_WIDTH : 文本="aaaaaaa"
	@静态
	常量 KEY_TRACK_ID : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_ENCODING_STATISTICS_LEVEL : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_QP_AVERAGE : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_QP_B_MAX : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_QP_B_MIN : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_QP_I_MAX : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_QP_I_MIN : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_QP_MAX : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_QP_MIN : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_QP_P_MAX : 文本="aaaaaaa"
	@静态
	常量 KEY_VIDEO_QP_P_MIN : 文本="aaaaaaa"
	@静态
	常量 KEY_WIDTH : 文本="aaaaaaa"
	@静态
	常量 LOG_SESSION_ID : 文本="aaaaaaa"
	/*
	@静态
	常量 KEY_COLOR_RANGE : 文本="aaaaaaa"
	@静态
	常量 KEY_COLOR_RANGE : 文本="aaaaaaa"
	@静态
	常量 KEY_COLOR_RANGE : 文本="aaaaaaa"
	
	*/
	@静态
	常量 MIMETYPE_VIDEO_AV1 : 文本="video/av01"
	@静态
	常量 MIMETYPE_VIDEO_AVC : 文本="video/avc"
	@静态
	常量 MIMETYPE_VIDEO_DOLBY_VISION : 文本="video/dolby-vision"
	@静态
	常量 MIMETYPE_VIDEO_H263 : 文本="video/3gpp"
	@静态
	常量 MIMETYPE_VIDEO_HEVC : 文本="video/hevc"
	@静态
	常量 MIMETYPE_VIDEO_MPEG2 : 文本="video/mpeg2"
	@静态
	常量 MIMETYPE_VIDEO_MPEG4 : 文本="video/mp4v-es"
	@静态
	常量 MIMETYPE_VIDEO_RAW : 文本="video/raw"
	@静态
	常量 MIMETYPE_VIDEO_SCRAMBLED : 文本="video/scrambled"
	@静态
	常量 MIMETYPE_VIDEO_VP8 : 文本="video/x-vnd.on2.vp8"
	@静态
	常量 MIMETYPE_VIDEO_VP9 : 文本="video/x-vnd.on2.vp9"


	方法 setByteBuffer(name : 文本,bytes : ByteBuffer)
		code #this.setByteBuffer(#name,#bytes);
	结束 方法

	方法 setFloat(name : 文本,value : 整数)
		code #this.setFloat(#name,#value);
	结束 方法

	方法 setInteger(name : 文本,value : 整数)
		code #this.setInteger(#name,#value);
	结束 方法

	方法 setLong(name : 文本,value : 长整数)
		code #this.setLong(#name,#value);
	结束 方法

	方法 setString(name : 文本,value : 文本)
		code #this.setString(#name,#value);
	结束 方法

结束 类

@强制输出
@指代类("android.media.MediaMuxer")
类 MediaMuxer
	@静态
	@后缀代码(" throws Exception")
	方法 MediaMuxer(path : 文本,format : 整数) : MediaMuxer
		code return new android.media.MediaMuxer(#path,#format);
	结束 方法

	方法 addTrack(format : MediaFormat) : 整数
		code return #this.addTrack(#format);
	结束 方法

	方法 release()
		code #this.release();
	结束 方法

	方法 start()
		code #this.start();
	结束 方法

	方法 stop()
		code #this.stop();
	结束 方法

	方法 writeSampleData(trackIndex : 整数,byteBuf : ByteBuffer,bufferInfo : BufferInfo)
		code #this.writeSampleData(#trackIndex,#byteBuf,#bufferInfo);
	结束 方法

结束 类

@指代类("android.media.MediaMuxer.OutputFormat")
类 OutputFormat
	@静态
	常量 MUXER_OUTPUT_3GPP : 整数=2
	@静态
	常量 MUXER_OUTPUT_HEIF : 整数=3
	@静态
	常量 MUXER_OUTPUT_MPEG_4 : 整数=0
	@静态
	常量 MUXER_OUTPUT_OGG : 整数=4
	@静态
	常量 MUXER_OUTPUT_WEBM : 整数=1

结束 类

@指代类("android.media.MediaCodecInfo.CodecCapabilities")
类 CodecCapabilities
	@静态
	常量 COLOR_FormatSurface : 整数=0x7f000789
	@静态
	常量 COLOR_FormatYUV420Planar : 整数=2135033992
结束 类

@指代类("android.media.MediaCrypto")
类 MediaCrypto

结束 类

@指代类("android.view.Surface")
类 Surface

	方法 lockCanvas(rect : 矩形=空) : Canvas
		code return #this.lockCanvas(#rect);
	结束 方法

	方法 unlockCanvasAndPost(canvas :  Canvas)
		code #this.unlockCanvasAndPost(#canvas);
	结束 方法
结束 类

@指代类("android.graphics.Paint.Style")
类 Paint_Style
	@静态
	常量 FILL : Paint_Style?
	@静态
	常量 STROKE : Paint_Style?
	@静态
	常量 FILL_STROKE : Paint_Style?

	@code
	static {
		#FILL=android.graphics.Paint.Style.FILL;
		#STROKE=android.graphics.Paint.Style.STROKE;
		#FILL_STROKE=android.graphics.Paint.Style.FILL_AND_STROKE;
	}
	@end

结束 类



@指代类("android.graphics.Paint")
类 Paint

	@静态
	方法 创建Paint() : Paint
		code return new android.graphics.Paint();
	结束 方法

	方法 取颜色() : 整数
		code return #this.getColor();
	结束 方法

	方法 设置字体(font : 字体) : Paint
		code #this.setTypeface(#font);
		code return #this;
	结束 方法

	方法 设置文字大小(size : 整数) : Paint
		code #this.setTextSize(#size);
		code return #this;
	结束 方法

	方法 取文字大小() : 单精度小数
		code return #this.getTextSize();
	结束 方法

	方法 设置颜色(color : 整数) : Paint
		code #this.setColor(#color);
		code return #this;
	结束 方法

	方法 设置文字对齐方式() : Paint
		//code #this.setTextAlign
		code return #this;
	结束 方法

	方法 测量文字(内容 : 文本) : 单精度小数
		code return #this.measureText(#内容);
	结束 方法

	方法 设置样式(样式 : Paint_Style) : Paint
		code #this.setStyle(#样式);
		code return #this;
	结束 方法

	方法 设置文本对齐方式(对齐方式 : Align) : Paint
		code #this.setTextAlign(#对齐方式);
		code return #this;
	结束 方法

	方法 设置透明度(透明度 : 整数) : Paint
		code #this.setAlpha(#透明度);
		code return #this;
	结束 方法

	方法 setAntiAlias(value : 逻辑型) : Paint
		code #this.setAntiAlias(#value);
		code return #this;
	结束 方法

	方法 setBlendMode(mode : BlendMode) : Paint
		code #this.setBlendMode(#mode);
		code return #this;
	结束 方法

	方法 setStrokeWidth(stroke : 整数) : Paint
		code #this.setStrokeWidth(#stroke);
		code return #this;
	结束 方法

	方法 setTextSize(textSize: 单精度小数) : Paint
		code #this.setTextSize(textSize);
		code return #this;
	结束 方法

	方法 setTextSkewX(skewX : 单精度小数) : Paint
		code #this.setTextSkewX(#skewX);
		code return #this;
	结束 方法

	方法 setUnderlineText(underlineText: 逻辑型) : Paint
		code #this.setUnderlineText(#underlineText);
		code return #this;
	结束 方法

	方法 setXfermode(xfermode : Xfermode) : Paint
		code #this.setXfermode(#xfermode);
		code return #this;
	结束 方法
结束 类

@指代类("android.graphics.Paint.Align")
类 Align

结束 类

类 文本对齐方式
	@嵌入式代码
	@静态
	方法 居中() : Align
		code android.graphics.Paint.Align.CENTER
	结束 方法
结束 类

@指代类("android.graphics.Canvas")
类 Canvas

	@静态
	方法 从BitMap创建(bitmap : 位图对象) : Canvas
		code return new android.graphics.Canvas(#bitmap);
	结束 方法

	方法 clipRect(left : 整数,top : 整数,right : 整数,bottom : 整数) : 逻辑型
		code return #this.clipRect(#left,#top,#right,#bottom);
	结束 方法

	//2025.2.6 8:39pm
	方法 画颜色数组(colors : 整数[], offset : 整数, stride : 整数,  x : 单精度小数, y : 单精度小数, width : 整数, height : 整数, hasAlpha : 逻辑型, paint : Paint) : Canvas
		code #this.drawBitmap(#colors, # offset, # stride, # x, # y, # width, # height, # hasAlpha, # paint)
	结束 方法

	方法 画文字(内容 : 文本,x : 整数,y : 整数,paint : Paint)
		code #this.drawText(#内容,#x,#y,#paint);
	结束 方法

	方法 drawPoint(x : 单精度小数,y : 单精度小数,paint : Paint)
		code #this.drawPoint(#x,#y,#paint);
	结束 方法

	方法 drawCircle(cx : 单精度小数,cy : 单精度小数,radius : 单精度小数,paint : Paint)
		code #this.drawCircle(#cx,#cy,#radius,#paint);
	结束 方法

	方法 drawLine(startX : 单精度小数,startY : 单精度小数,stopX : 单精度小数,stopY : 单精度小数,paint : Paint)
		code #this.drawLine(#startX,#startY,#stopX,#stopY,#paint);
	结束 方法


	方法 绘制文字(内容 : 文本,x : 整数,y : 整数,paint : Paint,纵间距 : 整数,宽度 : 整数=-1)
		变量 tx : 文本[]=内容.分割文本("\n")
		变量 color : 整数=paint.取颜色()
		循环(i,0,取数组长度(tx))
			变量 cx : 整数=x
			变量 temp : 文本
			循环(u, 0, tx[i].长度)
				如果 (宽度==-1)||(cx+纵间距*2<x+宽度) 则
					temp=tx[i].取文本中间(u,u)
					code #this.drawText(#temp,#cx,#y,#paint);
				否则
					paint.设置颜色(0xffff0000)
					code #this.drawText("...",#cx,#y,#paint);
					paint.设置颜色(color)
					退出循环
				结束 如果
				cx=cx+paint.测量文字(temp).到整数()
			结束 循环
			y=y+纵间距
		结束 循环
	结束 方法

	方法 drawRect(x : 单精度小数,y : 单精度小数,w : 单精度小数,h : 单精度小数,paint : Paint)
		code #this.drawRect(#x, #y, #w, #h, #paint);
	结束 方法

	方法 getWidth() : 整数
		code return #this.getWidth();
	结束 方法

	方法 drawBitmap(bitmap : 位图对象,left : 单精度小数,top : 单精度小数,paint : Paint)
		code #this.drawBitmap(#bitmap,#left,#top,#paint);
	结束 方法

	方法 drawBitmap_3(bitmap : 位图对象,matrix : Matrix,paint : Paint)
		code #this.drawBitmap(#bitmap,#matrix,#paint);
	结束 方法


结束 类

@指代类("android.media.MediaCodec.BufferInfo")
类 BufferInfo
	@静态
	方法 BufferInfo() : BufferInfo
		code return new android.media.MediaCodec.BufferInfo();
	结束 方法

	属性读 size() : 整数
		code return #this.size;
	结束 属性

	属性读 presentationTimeUs() : 长整数
		code return #this.presentationTimeUs;
	结束 属性

	属性读 flags() : 整数
		code return #this.flags;
	结束 属性

	属性读 offset() : 整数
		code return #this.offset;
	结束 属性

	属性写 size(size : 整数) 
		code #this.size=#size;
	结束 属性

	属性写 presentationTimeUs(presentationTimeUs : 长整数) 
		code #this.presentationTimeUs=#presentationTimeUs;
	结束 属性

	属性写 flags(flags : 整数) 
		code #this.flags=#flags;
	结束 属性

	属性写 offset(offset : 整数) 
		code #this.offset=#offset;
	结束 属性

结束 类

@指代类("java.nio.ByteBuffer")
类 ByteBuffer
	方法 get(byte : 字节[]) : ByteBuffer
		code return #this.get(#byte);
	结束 方法

	@静态
	方法 wrap(array : 字节[]) : ByteBuffer
		code return java.nio.ByteBuffer.wrap(#array);
	结束 方法
结束 类

@指代类("")
类 ByteArray

结束 类

@指代类("android.graphics.Typeface")
类 字体
	@静态
	方法 从资源创建(管理器 : 附加资源管理器,路径 : 文本) : 字体
		code return android.graphics.Typeface.createFromAsset(#管理器,#路径);
	结束 方法

	@静态
	方法 从文件创建(路径 : 文本)  : 字体
		code return android.graphics.Typeface.createFromFile(#路径);
	结束 方法
结束 类

@全局类
类 全局常量
	@静态
	常量 false : 逻辑型=假
	@静态
	常量 true : 逻辑型=真
	@静态
	常量 null : 对象=空
结束 类

@附加权限(安卓权限.文件权限_读取)
@附加权限(安卓权限.文件权限_写入)
@附加权限(安卓权限.管理外部文件权限)
@附加权限(安卓权限.屏幕截图权限)
@附加权限(安卓权限.录制屏幕权限)
@导入Java("android.graphics.*")
@导入Java("android.graphics.drawable.*")
@导入Java("android.content.*")
@导入Java("android.provider.*")
@导入Java("android.app.*")
@导入Java("android.view.*")
@导入Java("java.io.*")
@强制输出
类 屏幕截图
	@静态
	方法 截取当前屏幕(环境 : 安卓窗口, 保存路径 : 文本)
		变量 文件1 : 文件 = 保存路径
		如果 取反(文件1.存在) 则
			文件1.新建文件()
		结束 如果
		@code
		savePic(takeScreenShot(#环境), #保存路径);
		@end
	结束 方法

	@静态
	方法 保存(图 : 位图对象, 保存路径 : 文本)
		@code
		savePic(#图,#保存路径);
		@end
	结束 方法

	@静态
	方法 截取(控件 : 可视化组件, 保存路径 : 文本)
		@code
		savePic(takeViewShot(#控件.getView()), #保存路径);
		@end
	结束 方法

	@静态
	方法 截取位图(控件 : 可视化组件) : 位图对象
		变量 a : 位图对象=空
		开始俘获异常()
		@code
		#a=takeViewShot(#控件.getView());
		@end
		俘获所有异常()
		a=位图对象.创建位图2(8,64,位图配置.ARGB_8888)
		结束俘获异常()
		返回 a
	结束 方法

	@静态
	方法 保存位图(bt : 位图对象,路径 : 文本)
		文件操作.创建文件(路径)
		code savePic(#bt,#路径);
	结束 方法

	@code
	private static String clipText;
   private static Bitmap takeScreenShot(Activity activity) {
		View view = activity.getWindow().getDecorView();
		view.setDrawingCacheEnabled(true);
		view.buildDrawingCache();
		Bitmap b1 = view.getDrawingCache();

		Rect frame = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		int statusBarHeight = frame.top;

		int width = activity.getWindowManager().getDefaultDisplay().getWidth();
		int height = activity.getWindowManager().getDefaultDisplay().getHeight();

		Bitmap b = Bitmap.createBitmap(b1, 0, statusBarHeight, width, height - statusBarHeight);
		view.destroyDrawingCache();
		return b;
	}
	
	private static Bitmap takeViewShot(View view) {
		view.setDrawingCacheEnabled(true);
		view.buildDrawingCache();
		Bitmap b1 = view.getDrawingCache();
		Rect frame = new Rect();
		int statusBarHeight = frame.top;

		int width = view.getWidth();
		int height = view.getHeight();

		Bitmap b = Bitmap.createBitmap(b1, 0, statusBarHeight, width, height - statusBarHeight);
		view.destroyDrawingCache();
		return b;
	}

	private static Bitmap takeScreenShot2(Activity activity, int a, int c, int i, int d) {
		View view = activity.getWindow().getDecorView();
		view.setDrawingCacheEnabled(true);
		view.buildDrawingCache();
		Bitmap b1 = view.getDrawingCache();

		Rect frame = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		Bitmap b = Bitmap.createBitmap(b1, a, c, i, d);
		view.destroyDrawingCache();
		return b;
	}

	private static void savePic(Bitmap b, String strFileName) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(strFileName);
			if (null != fos) {
				b.compress(Bitmap.CompressFormat.JPEG, 90, fos);
				fos.flush();
				fos.close();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("屏幕截图 未找到文件:" + strFileName);
		}
		catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("屏幕截图 没有存储权限");
		}
	}
	@end
结束 类

@强制输出
@导入Java("android.view.MotionEvent")
@导入Java("android.content.Context")
@导入Java("android.util.AttributeSet")
@导入Java("android.widget.Toast")
@导入Java("android.graphics.*")
@导入Java("java.io.File")
@导入Java("android.view.View")
@导入Java("android.widget.LinearLayout")
@后缀代码(" extends android.view.View implements View.OnClickListener")
类 控件

	@静态
	方法 创建控件(环境 : 安卓环境) : 控件
		code return new #<控件>(#环境);
	结束 方法

	@code
	
	Context mContext = null;
	
    public #<控件>(Context context) {
        super(context);
        this.mContext = context;
		#初始化();
    }
 
    public #<控件>(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		#初始化();
    }
	
    @Override
    protected void onDraw(Canvas canvas) {
	    #绘图(canvas);
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

	方法 重绘()
		code invalidate();
	结束 方法

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

	定义事件 onKeyDown()

	定义事件 点击事件(点击事件 : 触摸事件) : 逻辑型

结束 类

@导入Java("com.badlogic.gdx.graphics.Pixmap")
@导入Java("android.view.WindowManager")
@导入Java("android.graphics.*")
@全局类
类 操作类

	@静态
	常量 logpath : 文本="/storage/emulated/0/.pvz/pvz/properties/log.cat"

	@静态
	方法 随机单精度小数(s : 单精度小数,e : 单精度小数) :单精度小数
		返回 double2float(数学运算.取随机小数(s,e-1f))
	结束 方法
	
	@静态
	方法 平滑取值(起 : 单精度小数,终 : 单精度小数,取值总数 : 单精度小数,当前 : 整数) : 单精度小数
		变量 差值 : 单精度小数=终-起
		//变量 中间值 : 单精度小数=(起+终)/2
		//变量 高 : 单精度小数=差值/2
		变量 半总 : 单精度小数=取值总数/2
		变量 递增值 : 单精度小数=差值/(半总*(半总+1))
		//变量 前值 : 单精度小数=(当前-起)/(差值/2)*(取值总数/2)
		如果 当前<0 则
			返回 0
		否则 当前<取值总数/2
			返回 (当前+1)*递增值
		否则 当前<取值总数
			返回 (取值总数-当前)*递增值
		否则
			返回 0
		结束 如果
		
	结束 方法

	@静态
	方法 平方(num : 整数) : 整数
		返回 num*num
	结束 方法

	@静态
	方法 整数集转字节集(ints  : 整数[]) : 字节[]
		变量 bytes : 字节[]=数组创建(字节,取数组长度(ints)*4)
		变量 c : 字节[]=空
		循环(i, 0, 取数组长度(ints))
			c=整数转字节(ints[i])
			bytes[i*4+0]=c[1]
			bytes[i*4+1]=c[2]
			bytes[i*4+2]=c[3]
			bytes[i*4+3]=c[0]
		结束 循环
		返回 bytes
	结束 方法

	@静态
	方法 平方float(num : 单精度小数) : 单精度小数
		返回 num*num
	结束 方法

	@静态
	方法 绝对值(num : 整数) : 整数
		如果 num<0 则
			返回 -1*num
		否则
			返回 num
		结束 如果
	结束 方法

	@静态
	方法 绝对值_f(num : 单精度小数) : 单精度小数
		如果 num<0 则
			返回 -1*num
		否则
			返回 num
		结束 如果
	结束 方法

	@静态
	方法 绝对值float(num : 单精度小数) : 单精度小数
		如果 num<0 则
			返回 -1*num
		否则
			返回 num
		结束 如果
	结束 方法

	@静态
	方法 三角形面积( a : Point,  b : Point,  c : Point) : 小数
		返回 数学运算.取绝对值((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
	结束 方法

	@静态
	方法 整数到逻辑型(int : 整数) : 逻辑型
		如果 int>0 则
			返回 真
		结束 如果
		返回 假
	结束 方法

	@静态
	方法 color_to_argb(color : 整数) : 整数[]
		code int[] colors={android.graphics.Color.alpha(#color),android.graphics.Color.red(#color),android.graphics.Color.green(#color),android.graphics.Color.blue(#color)};
		code return colors;
	结束 方法

	@静态
	方法 color_from_argb(color : 整数[]) : 整数
		code return android.graphics.Color.argb(#color[0],#color[1],#color[2],#color[3]);
	结束 方法

	@静态
	方法 color_from_rgb(color : 整数[],alpha : 整数=0xff) : 整数
		code return android.graphics.Color.argb(#alpha,#color[0],#color[1],#color[2]);
	结束 方法

	@静态
	方法 Bitmap_getPixels(bitmap : 位图对象,Pixels : 整数[],offset : 整数,stride : 整数,x : 整数,y : 整数,width : 整数,height : 整数)
		code #bitmap.getPixels(#Pixels,#offset,#stride,#x,#y,#width,#height);
	结束 方法

	@静态
	方法 裁剪位图(source : 位图对象, x : 整数,  y : 整数, width : 整数, height :整数) : 位图对象
		code return android.graphics.Bitmap.createBitmap(#source, #x, #y, #width, #height, null, false);
	结束 方法

	@静态
	方法 裁剪Pixmap(px : Pixmap, x : 整数,  y : 整数, width : 整数, height :整数) : Pixmap
		@code
		Pixmap originalPixmap = #px;
int cropX = #x, cropY = #y, cropWidth = #width, cropHeight = #height;

Pixmap croppedPixmap = new Pixmap(cropWidth, cropHeight, originalPixmap.getFormat());
croppedPixmap.drawPixmap(originalPixmap, 0, 0, cropX, cropY, cropWidth, cropHeight);



//originalPixmap.dispose(); // 记得释放资源
return croppedPixmap;
		@end
	结束 方法

	@静态
	方法 裁剪Pixmap2(source : Pixmap, left : 整数,  top : 整数, right : 整数, bottom :整数) : Pixmap
		返回 裁剪Pixmap(source,left,top,right-left,bottom-top)
	结束 方法

	@静态
	方法 裁剪位图2(source : 位图对象, left : 整数,  top : 整数, right : 整数, bottom :整数) : 位图对象
		code return android.graphics.Bitmap.createBitmap(#source, #left, #top, #right-#left, #bottom-#top, null, false);
	结束 方法

	@静态
	方法 矩阵转置_m3(m3 : 单精度小数[]) : 单精度小数[]
		变量 newf : 单精度小数[]=数组创建(单精度小数,取数组长度(m3))
		newf[0]=m3[0]
		newf[1]=m3[3]
		newf[2]=m3[6]
		newf[3]=m3[1]
		newf[4]=m3[4]
		newf[5]=m3[7]
		newf[6]=m3[2]
		newf[7]=m3[5]
		newf[8]=m3[8]
		返回 newf
	结束 方法

	@静态
	方法 ctl2bl2(originalMatrix :Matrix,height : 单精度小数) : Matrix
		@code
    // Step 1: 创建基础变换矩阵 T
    Matrix T = new Matrix();
    T.setScale(1, -1);        // 绕X轴翻转（Y值取反）
    T.postTranslate(0, #height); // 向下平移H（Y轴平移画布高度）

    // Step 2: 计算 N = T * M * T
    Matrix result = new Matrix();
    result.set(T);             // result = T
    result.postConcat(#originalMatrix); // result = T * M
    result.postConcat(T);      // result = T * M * T
    return result;
	@end
	结束 方法

	//左上角座标系转左下角坐标系
	@静态
	方法 ctl2bl(originalMatrix : Matrix,height : 整数,bth : 整数) : Matrix
		/*
		@code
    Matrix result = new Matrix(#originalMatrix); // 复制原始矩阵

    Matrix flipAndTranslate = new Matrix();
    flipAndTranslate.setScale(1f, -1f); // 翻转 Y 轴
    flipAndTranslate.postTranslate(0f, #height); // 平移回正确位置

    result.postConcat(flipAndTranslate); // 应用到原始矩阵
	
	Matrix matrix = new Matrix();
// 1. 垂直翻转（y 缩放 -1）
matrix.setScale(1, -1);
// 2. 把翻转后的图像再向下平移一个高度，让底边和原图底边对齐
matrix.postTranslate(0, #bth);
matrix.postConcat(result);

	
	return matrix;
	@end
	*/
		originalMatrix.preTranslate(0,bth)
		originalMatrix.preScale(1,-1)
		originalMatrix.postScale(1,-1)
		originalMatrix.postTranslate(0,height)
		返回 originalMatrix
	结束 方法


	@静态
	方法 ytl2bl(y : 单精度小数,height : 单精度小数,bth : 单精度小数) : 单精度小数
		返回 height-y-bth
	结束 方法

	@静态
	方法 trs2tra(trs : TextureRegion[]) : Array
		@code
		com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> arr=new com.badlogic.gdx.utils.Array(#trs);
		return arr;
		@end
	结束 方法

	@静态
	方法 argb2rgba(color : 整数) : 整数
		变量 t1 : 整数[]=color_to_argb(color)
		变量 t2 : 整数[]=数组创建(整数,4)
		t2[0]=t1[1]
		t2[1]=t1[2]
		t2[2]=t1[3]
		t2[3]=t1[0]
		返回 color_from_argb(t2)
	结束 方法


	@静态
	方法 clear(obj : 对象)
		obj=空
		优化内存()
	结束 方法

	@静态
	方法 日志(log : 文本)
		文件操作.追加文件内容(logpath,log+"\n")
	结束 方法

	@静态
	方法 Bitmap_setPixels(bitmap : 位图对象,Pixels : 整数[],offset : 整数,stride : 整数,x : 整数,y : 整数,width : 整数,height : 整数)
		code #bitmap.setPixels(#Pixels,#offset,#stride,#x,#y,#width,#height);
	结束 方法

	@静态
	方法 rgbToHsv_float(rgb : 整数[]) : 单精度小数[]
		code return rgbToHsv(#rgb);
	结束 方法

	@静态
	方法 rgbToHsv_int(rgb : 整数[]) : 整数[]
		变量 ds : 单精度小数[]=rgbToHsv_float(rgb)
		变量 h=(ds[0]*256/360).到整数()
		变量 s=(ds[1]*256).到整数()
		变量 v=(ds[2]*256).到整数()
		如果 h>255 则
			h=255
		否则 h<0
			h=0
		结束 如果
		如果 s>255 则
			s=255
		否则 s<0
			s=0
		结束 如果
		如果 v>255 则
			v=255
		否则 v<0
			v=0
		结束 如果
		变量 is : 整数[]={h,s,v}
		返回 is
	结束 方法

	@静态
	方法 hsvToRgb_float(hsv : 单精度小数[]) : 整数[]
		变量 h=hsv[0]
		变量 s=hsv[1]
		变量 v=hsv[2]
		code return hsvToRgb(#h,#s,#v);
	结束 方法

	@静态
	方法 hsvToRgb_int(hsv : 整数[]) : 整数[]
		变量 hsvf : 单精度小数[]={hsv[0]/256f*360,hsv[1]/256f,hsv[2]/256f}
		变量 is : 整数[]=hsvToRgb_float(hsvf)
		返回 is
	结束 方法

	@code
	
	// RGB to HSV  
    public static float[] rgbToHsv(int[] rgb) {  
        float[] hsv = new float[3];  
        float rNorm = rgb[0] / 255f;  
        float gNorm = rgb[1] / 255f;  
        float bNorm = rgb[2] / 255f;  
        float max = Math.max(rNorm, Math.max(gNorm, bNorm));  
        float min = Math.min(rNorm, Math.min(gNorm, bNorm));  
        float delta = max - min;  
  
        // Hue  
        if (delta == 0) {  
            hsv[0] = 0;  
        } else if (max == rNorm) {  
            hsv[0] = 60 * ((gNorm - bNorm) / delta % 6);  
        } else if (max == gNorm) {  
            hsv[0] = 60 * ((bNorm - rNorm) / delta + 2);  
        } else {  
            hsv[0] = 60 * ((rNorm - gNorm) / delta + 4);  
        }  
  
        // Saturation  
        hsv[1] = (max == 0) ? 0 : delta / max;  
  
        // Value  
        hsv[2] = max;  
  
        return hsv;  
    }  
  
    // HSV to RGB  
    public static int[] hsvToRgb(float h, float s, float v) {  
        int[] rgb = new int[3];  
		
		float hh = h / 60;
	int i = ((int) hh) % 6;

	float f = hh - i;
		
        float p = v * (1 - s);  
        float q = v * (1 - f * s);  
        float t = v * (1 - (1 - f) * s);  
  
        switch (i % 6) {  
            case 0:  
                rgb[0] = (int) (v * 255);  
                rgb[1] = (int) (t * 255);  
                rgb[2] = (int) (p * 255);  
                break;  
            case 1:  
                rgb[0] = (int) (q * 255);  
                rgb[1] = (int) (v * 255);  
                rgb[2] = (int) (p * 255);  
                break;  
            case 2:  
                rgb[0] = (int) (p * 255);  
                rgb[1] = (int) (v * 255);  
                rgb[2] = (int) (t * 255);  
                break;  
            case 3:  
                rgb[0] = (int) (p * 255);  
                rgb[1] = (int) (q * 255);  
                rgb[2] = (int) (v * 255);  
                break;  
            case 4:  
                rgb[0] = (int) (t * 255);  
                rgb[1] = (int) (p * 255);  
                rgb[2] = (int) (v * 255);  
                break;  
            case 5:  
                rgb[0] = (int) (v * 255);  
                rgb[1] = (int) (p * 255);  
                rgb[2] = (int) (q * 255);  
                break;  
        }  
  
        return rgb;  
    }
	

	@end
	@静态
	方法 隐藏标题栏(窗口 : 安卓窗口)
		@code
		#窗口.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		#窗口.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
// 全屏展示

        #窗口.getWindow().getDecorView().setSystemUiVisibility(
                android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
                        | android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
	@end
	结束 方法

	@静态
	方法 取余(数 : 整数,模 : 整数) : 整数
		如果 数<0 则
			返回 模+数%模
		结束 如果
		返回 数%模
	结束 方法

	@静态
	方法 取余float_int(数 : 单精度小数,模 : 整数) : 单精度小数
		如果 数<0 则
			返回 模+数%模
		结束 如果
		返回 数%模
	结束 方法

	@静态
	方法 整数除整数(a : 整数,b : 整数) : 整数
		返回 a/b
	结束 方法

	@静态
	方法 整数除单精度小数(a : 整数,b : 单精度小数) : 单精度小数
		返回 a/b
	结束 方法

	@静态
	方法 补齐(内容 : 文本,长度 : 整数,符号 : 文本) : 文本
		循环(i, 0, 长度)
			如果 内容.长度<长度 则
				内容=符号+内容
			否则
				退出循环
			结束 如果
		结束 循环
		返回 内容
	结束 方法

	@静态
	方法 取上级目录(路径 : 文本) : 文本
		变量 结果 : 文本
		变量 temp : 文本
		变量 str : 文本
		变量 t : 文本
		循环(i, 0, 路径.长度)
			t=路径.取文本中间(i,i)
			如果 t=="/" 则
				结果=结果+temp
				temp=str
				str=t
			否则
				str=str+t
			结束 如果
		结束 循环
		返回 结果+"/"
	结束 方法

	@静态
	方法 补斜杠(路径 : 文本) : 文本
		如果 路径.结尾为("/")==假 则
			路径=路径+"/"
		结束 如果
		返回 路径
	结束 方法

	@静态
	方法 去斜杠(路径 : 文本) : 文本
		如果 路径.结尾为("/") 则
			路径=路径.取文本中间(0,路径.长度-2)
		结束 如果
		返回 路径
	结束 方法

	@静态
	方法 文本集合到文本(文本集 : 文本集合,分隔符 : 文本) : 文本
		变量 结果 : 文本
		循环(i, 0, 文本集.长度)
			如果 i==0 则
				结果=文本集[i]
			否则
				结果=结果+分隔符+文本集[i]
			结束 如果
		结束 循环
		返回 结果
	结束 方法

	@静态
	方法 颜色取反(color : 整数,alpha : 整数) : 整数
		//变量 alpha1=位清零(color,0x00ffffff)
		变量 rgb=位清零(color,0xff000000)
		//弹出提示(rgb.到十六进制())
		rgb=0xffffff-rgb
		code #alpha=#alpha<<24;
		返回 0xff000000+rgb
	结束 方法

	@静态
	方法 gm2om(gm : Matrix) : 单精度小数[]
		@code
    // 获取原始3x3矩阵值（行主序）
    float[] values = new float[9];
    #gm.getValues(values);
    
    // 创建4x4 OpenGL矩阵（列主序）
    float[] glMatrix = new float[16];
	
	glMatrix[0] = values[0];  // scaleX → [0]
	glMatrix[5] = values[4];  // scaleY → [5]
	glMatrix[12] = values[2]; // transX → [12]
	glMatrix[13] = values[5]; // transY → [13]
	glMatrix[10] = 1.0f;      // Z缩放 = 1
	glMatrix[15] = 1.0f; // pers2 → [15]
    /*
    // 映射2D变换分量
    glMatrix[0] = values[0];  // scaleX → [0]
    glMatrix[4] = values[1];  // skewX  → [4]
    glMatrix[12] = values[2]; // transX → [12]
    
    glMatrix[1] = values[3];  // skewY  → [1]
    glMatrix[5] = values[4];  // scaleY → [5]
    glMatrix[13] = values[5]; // transY → [13]
    
    // 处理透视分量（如有）
    glMatrix[3] = values[6];  // pers0 → [3]
    glMatrix[7] = values[7];  // pers1 → [7]
    glMatrix[15] = values[8]; // pers2 → [15]
    
    // 设置Z轴单位矩阵和齐次坐标
    glMatrix[10] = 1.0f;      // Z缩放 = 1
    glMatrix[11] = 0.0f;      // 透视Z分量
    glMatrix[14] = 0.0f;      // Z平移
    
    // 其他位置补零
    glMatrix[2] = 0; glMatrix[6] = 0; 
    glMatrix[8] = 0; glMatrix[9] = 0;
    */
	
	//glMatrix[12] = values[2]; // transX → [12]
	//glMatrix[13] = values[5]; // transY → [13]
    return glMatrix;
		@end
	结束 方法

	@静态
	@嵌入式代码
	方法 清屏颜色(R:单精度小数, G:单精度小数, B:单精度小数, A:单精度小数)
		code com.badlogic.gdx.Gdx.gl.glClearColor(#R,#G,#B,#A);
	结束 方法

	@静态
	@嵌入式代码
	方法 清屏()
		code com.badlogic.gdx.Gdx.gl.glClear(com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT | com.badlogic.gdx.graphics.GL20.GL_DEPTH_BUFFER_BIT);
	结束 方法

	@静态
	@嵌入式代码
	方法 setContinuousRendering(bool : 逻辑型)
		code com.badlogic.gdx.Gdx.graphics.setContinuousRendering(#bool);
	结束 方法

	@静态
	@嵌入式代码
	方法 setInputProcessor(ip : MIP)
		code com.badlogic.gdx.Gdx.input.setInputProcessor(#ip);
	结束 方法

	@静态
	方法 新建触摸事件(按下时间 : 长整数,动作 : 整数,x : 单精度小数,y : 单精度小数) : 触摸事件
		code return android.view.MotionEvent.obtain(#按下时间,#按下时间+100,#动作,#x,#y,0);
	结束 方法

	@静态
	@嵌入式代码
	方法 宽() : 整数
		code com.badlogic.gdx.Gdx.graphics.getWidth()
	结束 方法

	@静态
	@嵌入式代码
	方法 高() : 整数
		code com.badlogic.gdx.Gdx.graphics.getHeight()
	结束 方法


结束 类

@指代类("android.view.ViewGroup")
类 布局控件
	方法 添加组件(组件 : 可视化组件)
		code #this.addView(#组件);
	结束 方法
结束 类


//==============
// 
//   @阿杰  Meng
//
//==============
@附加权限(安卓权限.文件权限_读取)
类 文件打开方式

	@静态
	方法 获取MIME(路径或扩展名 : 文本) : 文本
		@code
	  String FileType = #路径或扩展名.substring(#路径或扩展名.lastIndexOf('.')+1,#路径或扩展名.length()).toLowerCase();
	  int n = MIME表.length;
      for(int i=0; i<n; i++)
      if(MIME表[i][0].equals(FileType)) return MIME表[i][1];
      return "*/*";
	  @end
	结束 方法

	@静态
	方法 获取扩展名(MIME类型 : 文本) : 文本
		@code
	  String 值 = #MIME类型.toLowerCase();
	  int n = MIME表.length;
      for(int i=0; i<n; i++)
         if(MIME表[i][1].equals(值)) return MIME表[i][0];
      return "application/octet-stream";
	  @end
	结束 方法

	@静态 
	方法 打开文件(上下文 : 安卓环境, 路径 : 文本) : 逻辑型
		@code
      if(#上下文 == null || #路径 == null)return false;
      android.content.Intent intent = new android.content.Intent();
      //设置intent的Action属性
      intent.setAction(android.content.Intent.ACTION_VIEW);
      intent.addFlags(android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION);
      intent.addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addCategory(android.content.Intent.CATEGORY_DEFAULT);

      try {
         java.io.File out = new java.io.File(#路径);
         android.net.Uri fileURI;
         if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            // 7.0+文件访问，可直接跳过权限
            // fileURI = androidx.core.content.FileProvider.getUriForFile(context,"{包名}.provider",out);
            // 直接跳过权限
            android.os.StrictMode.VmPolicy.Builder builder = new android.os.StrictMode.VmPolicy.Builder();
            android.os.StrictMode.setVmPolicy(builder.build());
            fileURI = android.net.Uri.fromFile(out);
         }else{
            fileURI = android.net.Uri.fromFile(out);
         }
         //设置intent的data和Type属性
         intent.setDataAndType(fileURI, #获取MIME(#路径));
         //跳转
         if (#上下文.getPackageManager().resolveActivity(intent, android.content.pm.PackageManager.MATCH_DEFAULT_ONLY) != null) {
            #上下文.startActivity(intent);
            return true;
         } else {
            android.widget.Toast.makeText(#上下文, "没有找到对应的程序", android.widget.Toast.LENGTH_SHORT).show();
            return false;
         }

      } catch (Exception e) { //当系统没有携带文件打开软件，提示
         android.widget.Toast.makeText(#上下文, "无法打开该格式文件", android.widget.Toast.LENGTH_SHORT).show();
         e.printStackTrace();
      }
      return false;
      @end
	结束 方法

	@code
   private static final String[][] MIME表 = {
      //{扩展名,           MIME类型}
      {"ez",                "application/andrew-inset"},
      {"aw",                "application/applixware"},
      {"atom",            "application/atom+xml"},
      {"atomcat",      "application/atomcat+xml"},
      {"atomsvc",      "application/atomsvc+xml"},
      {"bdoc",            "application/bdoc"},
      {"ccxml",          "application/ccxml+xml"},
      {"cdmia",          "application/cdmi-capability"},
      {"cdmic",          "application/cdmi-container"},
      {"cdmid",          "application/cdmi-domain"},
      {"cdmio",          "application/cdmi-object"},
      {"cdmiq",          "application/cdmi-queue"},
      {"cu",                "application/cu-seeme"},
      {"mpd",              "application/dash+xml"},
      {"davmount",    "application/davmount+xml"},
      {"dbk",              "application/docbook+xml"},
      {"dssc",            "application/dssc+der"},
      {"xdssc",          "application/dssc+xml"},
      {"ecma",            "application/ecmascript"},
      {"emma",            "application/emma+xml"},
      {"epub",            "application/epub+zip"},
      {"exi",              "application/exi"},
      {"pfr",              "application/font-tdpfr"},
      {"woff",            "application/font-woff"},
      {"woff2",          "application/font-woff2"},
      {"geojson",      "application/geo+json"},
      {"gml",              "application/gml+xml"},
      {"gpx",              "application/gpx+xml"},
      {"gxf",              "application/gxf"},
      {"gz",                "application/gzip"},
      {"stk",              "application/hyperstudio"},
      {"ink",              "application/inkml+xml"},
      {"inkml",          "application/inkml+xml"},
      {"ipfix",          "application/ipfix"},
      {"jar",              "application/java-archive"},
      {"war",              "application/java-archive"},
      {"ear",              "application/java-archive"},
      {"ser",              "application/java-serialized-object"},
      {"class",          "application/java-vm"},
      {"js",                "application/javascript"},
      {"mjs",              "application/javascript"},
      {"json",            "application/json"},
      {"map",              "application/json"},
      {"json5",          "application/json5"},
      {"jsonml",        "application/jsonml+json"},
      {"jsonld",        "application/ld+json"},
      {"lostxml",      "application/lost+xml"},
      {"hqx",              "application/mac-binhex40"},
      {"cpt",              "application/mac-compactpro"},
      {"mads",            "application/mads+xml"},
      {"webmanifest","application/manifest+json"},
      {"mrc",              "application/marc"},
      {"mrcx",            "application/marcxml+xml"},
      {"ma",                "application/mathematica"},
      {"nb",                "application/mathematica"},
      {"mb",                "application/mathematica"},
      {"mathml",        "application/mathml+xml"},
      {"mbox",            "application/mbox"},
      {"mscml",          "application/mediaservercontrol+xml"},
      {"metalink",    "application/metalink+xml"},
      {"meta4",          "application/metalink4+xml"},
      {"mets",            "application/mets+xml"},
      {"mods",            "application/mods+xml"},
      {"m21",              "application/mp21"},
      {"mp21",            "application/mp21"},
      {"mp4s",            "application/mp4"},
      {"m4p",              "application/mp4"},
      {"doc",              "application/msword"},
      {"dot",              "application/msword"},
      {"mxf",              "application/mxf"},
      {"bin",              "application/octet-stream"},
      {"dms",              "application/octet-stream"},
      {"lrf",              "application/octet-stream"},
      {"mar",              "application/octet-stream"},
      {"so",                "application/octet-stream"},
      {"dist",            "application/octet-stream"},
      {"distz",          "application/octet-stream"},
      {"pkg",              "application/octet-stream"},
      {"bpk",              "application/octet-stream"},
      {"dump",            "application/octet-stream"},
      {"elc",              "application/octet-stream"},
      {"deploy",        "application/octet-stream"},
      {"exe",              "application/octet-stream"},
      {"dll",              "application/octet-stream"},
      {"deb",              "application/octet-stream"},
      {"dmg",              "application/octet-stream"},
      {"iso",              "application/octet-stream"},
      {"img",              "application/octet-stream"},
      {"msi",              "application/octet-stream"},
      {"msp",              "application/octet-stream"},
      {"msm",              "application/octet-stream"},
      {"buffer",        "application/octet-stream"},
      {"oda",              "application/oda"},
      {"opf",              "application/oebps-package+xml"},
      {"ogx",              "application/ogg"},
      {"omdoc",          "application/omdoc+xml"},
      {"onetoc",        "application/onenote"},
      {"onetoc2",      "application/onenote"},
      {"onetmp",        "application/onenote"},
      {"onepkg",        "application/onenote"},
      {"oxps",            "application/oxps"},
      {"xer",              "application/patch-ops-error+xml"},
      {"pdf",              "application/pdf"},
      {"pgp",              "application/pgp-encrypted"},
      {"asc",              "application/pgp-signature"},
      {"sig",              "application/pgp-signature"},
      {"prf",              "application/pics-rules"},
      {"p10",              "application/pkcs10"},
      {"p7m",              "application/pkcs7-mime"},
      {"p7c",              "application/pkcs7-mime"},
      {"p7s",              "application/pkcs7-signature"},
      {"p8",                "application/pkcs8"},
      {"ac",                "application/pkix-attr-cert"},
      {"cer",              "application/pkix-cert"},
      {"crl",              "application/pkix-crl"},
      {"pkipath",      "application/pkix-pkipath"},
      {"pki",              "application/pkixcmp"},
      {"pls",              "application/pls+xml"},
      {"ai",                "application/postscript"},
      {"eps",              "application/postscript"},
      {"ps",                "application/postscript"},
      {"cww",              "application/prs.cww"},
      {"pskcxml",      "application/pskc+xml"},
      {"rdf",              "application/rdf+xml"},
      {"rif",              "application/reginfo+xml"},
      {"rnc",              "application/relax-ng-compact-syntax"},
      {"rl",                "application/resource-lists+xml"},
      {"rld",              "application/resource-lists-diff+xml"},
      {"rs",                "application/rls-services+xml"},
      {"gbr",              "application/rpki-ghostbusters"},
      {"mft",              "application/rpki-manifest"},
      {"roa",              "application/rpki-roa"},
      {"rsd",              "application/rsd+xml"},
      {"rss",              "application/rss+xml"},
      {"rtf",              "application/rtf"},
      {"sbml",            "application/sbml+xml"},
      {"scq",              "application/scvp-cv-request"},
      {"scs",              "application/scvp-cv-response"},
      {"spq",              "application/scvp-vp-request"},
      {"spp",              "application/scvp-vp-response"},
      {"sdp",              "application/sdp"},
      {"setpay",        "application/set-payment-initiation"},
      {"setreg",        "application/set-registration-initiation"},
      {"shf",              "application/shf+xml"},
      {"smi",              "application/smil+xml"},
      {"smil",            "application/smil+xml"},
      {"rq",                "application/sparql-query"},
      {"srx",              "application/sparql-results+xml"},
      {"gram",            "application/srgs"},
      {"grxml",          "application/srgs+xml"},
      {"sru",              "application/sru+xml"},
      {"ssdl",            "application/ssdl+xml"},
      {"ssml",            "application/ssml+xml"},
      {"tei",              "application/tei+xml"},
      {"teicorpus",  "application/tei+xml"},
      {"tfi",              "application/thraud+xml"},
      {"tsd",              "application/timestamped-data"},
      {"plb",              "application/vnd.3gpp.pic-bw-large"},
      {"psb",              "application/vnd.3gpp.pic-bw-small"},
      {"pvb",              "application/vnd.3gpp.pic-bw-var"},
      {"tcap",            "application/vnd.3gpp2.tcap"},
      {"pwn",              "application/vnd.3m.post-it-notes"},
      {"aso",              "application/vnd.accpac.simply.aso"},
      {"imp",              "application/vnd.accpac.simply.imp"},
      {"acu",              "application/vnd.acucobol"},
      {"atc",              "application/vnd.acucorp"},
      {"acutc",          "application/vnd.acucorp"},
      {"air",              "application/vnd.adobe.air-application-installer-package+zip"},
      {"fcdt",            "application/vnd.adobe.formscentral.fcdt"},
      {"fxp",              "application/vnd.adobe.fxp"},
      {"fxpl",            "application/vnd.adobe.fxp"},
      {"xdp",              "application/vnd.adobe.xdp+xml"},
      {"xfdf",            "application/vnd.adobe.xfdf"},
      {"ahead",          "application/vnd.ahead.space"},
      {"azf",              "application/vnd.airzip.filesecure.azf"},
      {"azs",              "application/vnd.airzip.filesecure.azs"},
      {"azw",              "application/vnd.amazon.ebook"},
      {"acc",              "application/vnd.americandynamics.acc"},
      {"ami",              "application/vnd.amiga.ami"},
      {"apk",              "application/vnd.android.package-archive"},
      {"cii",              "application/vnd.anser-web-certificate-issue-initiation"},
      {"fti",              "application/vnd.anser-web-funds-transfer-initiation"},
      {"atx",              "application/vnd.antix.game-component"},
      {"mpkg",            "application/vnd.apple.installer+xml"},
      {"m3u8",            "application/vnd.apple.mpegurl"},
      {"pkpass",        "application/vnd.apple.pkpass"},
      {"swi",              "application/vnd.aristanetworks.swi"},
      {"iota",            "application/vnd.astraea-software.iota"},
      {"aep",              "application/vnd.audiograph"},
      {"mpm",              "application/vnd.blueice.multipass"},
      {"bmi",              "application/vnd.bmi"},
      {"rep",              "application/vnd.businessobjects"},
      {"cdxml",          "application/vnd.chemdraw+xml"},
      {"mmd",              "application/vnd.chipnuts.karaoke-mmd"},
      {"cdy",              "application/vnd.cinderella"},
      {"cla",              "application/vnd.claymore"},
      {"rp9",              "application/vnd.cloanto.rp9"},
      {"c4g",              "application/vnd.clonk.c4group"},
      {"c4d",              "application/vnd.clonk.c4group"},
      {"c4f",              "application/vnd.clonk.c4group"},
      {"c4p",              "application/vnd.clonk.c4group"},
      {"c4u",              "application/vnd.clonk.c4group"},
      {"c11amc",        "application/vnd.cluetrust.cartomobile-config"},
      {"c11amz",        "application/vnd.cluetrust.cartomobile-config-pkg"},
      {"csp",              "application/vnd.commonspace"},
      {"cdbcmsg",      "application/vnd.contact.cmsg"},
      {"cmc",              "application/vnd.cosmocaller"},
      {"clkx",            "application/vnd.crick.clicker"},
      {"clkk",            "application/vnd.crick.clicker.keyboard"},
      {"clkp",            "application/vnd.crick.clicker.palette"},
      {"clkt",            "application/vnd.crick.clicker.template"},
      {"clkw",            "application/vnd.crick.clicker.wordbank"},
      {"wbs",              "application/vnd.criticaltools.wbs+xml"},
      {"pml",              "application/vnd.ctc-posml"},
      {"ppd",              "application/vnd.cups-ppd"},
      {"car",              "application/vnd.curl.car"},
      {"pcurl",          "application/vnd.curl.pcurl"},
      {"dart",            "application/vnd.dart"},
      {"rdz",              "application/vnd.data-vision.rdz"},
      {"uvf",              "application/vnd.dece.data"},
      {"uvvf",            "application/vnd.dece.data"},
      {"uvd",              "application/vnd.dece.data"},
      {"uvvd",            "application/vnd.dece.data"},
      {"uvt",              "application/vnd.dece.ttml+xml"},
      {"uvvt",            "application/vnd.dece.ttml+xml"},
      {"uvx",              "application/vnd.dece.unspecified"},
      {"uvvx",            "application/vnd.dece.unspecified"},
      {"uvz",              "application/vnd.dece.zip"},
      {"uvvz",            "application/vnd.dece.zip"},
      {"fe_launch",  "application/vnd.denovo.fcselayout-link"},
      {"dna",              "application/vnd.dna"},
      {"mlp",              "application/vnd.dolby.mlp"},
      {"dpg",              "application/vnd.dpgraph"},
      {"dfac",            "application/vnd.dreamfactory"},
      {"kpxx",            "application/vnd.ds-keypoint"},
      {"ait",              "application/vnd.dvb.ait"},
      {"svc",              "application/vnd.dvb.service"},
      {"geo",              "application/vnd.dynageo"},
      {"mag",              "application/vnd.ecowin.chart"},
      {"nml",              "application/vnd.enliven"},
      {"esf",              "application/vnd.epson.esf"},
      {"msf",              "application/vnd.epson.msf"},
      {"qam",              "application/vnd.epson.quickanime"},
      {"slt",              "application/vnd.epson.salt"},
      {"ssf",              "application/vnd.epson.ssf"},
      {"es3",              "application/vnd.eszigno3+xml"},
      {"et3",              "application/vnd.eszigno3+xml"},
      {"ez2",              "application/vnd.ezpix-album"},
      {"ez3",              "application/vnd.ezpix-package"},
      {"fdf",              "application/vnd.fdf"},
      {"mseed",          "application/vnd.fdsn.mseed"},
      {"seed",            "application/vnd.fdsn.seed"},
      {"dataless",    "application/vnd.fdsn.seed"},
      {"gph",              "application/vnd.flographit"},
      {"ftc",              "application/vnd.fluxtime.clip"},
      {"fm",                "application/vnd.framemaker"},
      {"frame",          "application/vnd.framemaker"},
      {"maker",          "application/vnd.framemaker"},
      {"book",            "application/vnd.framemaker"},
      {"fnc",              "application/vnd.frogans.fnc"},
      {"ltf",              "application/vnd.frogans.ltf"},
      {"fsc",              "application/vnd.fsc.weblaunch"},
      {"oas",              "application/vnd.fujitsu.oasys"},
      {"oa2",              "application/vnd.fujitsu.oasys2"},
      {"oa3",              "application/vnd.fujitsu.oasys3"},
      {"fg5",              "application/vnd.fujitsu.oasysgp"},
      {"bh2",              "application/vnd.fujitsu.oasysprs"},
      {"ddd",              "application/vnd.fujixerox.ddd"},
      {"xdw",              "application/vnd.fujixerox.docuworks"},
      {"xbd",              "application/vnd.fujixerox.docuworks.binder"},
      {"fzs",              "application/vnd.fuzzysheet"},
      {"txd",              "application/vnd.genomatix.tuxedo"},
      {"ggb",              "application/vnd.geogebra.file"},
      {"ggt",              "application/vnd.geogebra.tool"},
      {"gex",              "application/vnd.geometry-explorer"},
      {"gre",              "application/vnd.geometry-explorer"},
      {"gxt",              "application/vnd.geonext"},
      {"g2w",              "application/vnd.geoplan"},
      {"g3w",              "application/vnd.geospace"},
      {"gmx",              "application/vnd.gmx"},
      {"gdoc",            "application/vnd.google-apps.document"},
      {"gslides",      "application/vnd.google-apps.presentation"},
      {"gsheet",        "application/vnd.google-apps.spreadsheet"},
      {"kml",              "application/vnd.google-earth.kml+xml"},
      {"kmz",              "application/vnd.google-earth.kmz"},
      {"gqf",              "application/vnd.grafeq"},
      {"gqs",              "application/vnd.grafeq"},
      {"gac",              "application/vnd.groove-account"},
      {"ghf",              "application/vnd.groove-help"},
      {"gim",              "application/vnd.groove-identity-message"},
      {"grv",              "application/vnd.groove-injector"},
      {"gtm",              "application/vnd.groove-tool-message"},
      {"tpl",              "application/vnd.groove-tool-template"},
      {"vcg",              "application/vnd.groove-vcard"},
      {"hal",              "application/vnd.hal+xml"},
      {"zmm",              "application/vnd.handheld-entertainment+xml"},
      {"hbci",            "application/vnd.hbci"},
      {"les",              "application/vnd.hhe.lesson-player"},
      {"hpgl",            "application/vnd.hp-hpgl"},
      {"hpid",            "application/vnd.hp-hpid"},
      {"hps",              "application/vnd.hp-hps"},
      {"jlt",              "application/vnd.hp-jlyt"},
      {"pcl",              "application/vnd.hp-pcl"},
      {"pclxl",          "application/vnd.hp-pclxl"},
      {"sfd-hdstx",  "application/vnd.hydrostatix.sof-data"},
      {"mpy",              "application/vnd.ibm.minipay"},
      {"afp",              "application/vnd.ibm.modcap"},
      {"listafp",      "application/vnd.ibm.modcap"},
      {"list3820",    "application/vnd.ibm.modcap"},
      {"irm",              "application/vnd.ibm.rights-management"},
      {"sc",                "application/vnd.ibm.secure-container"},
      {"icc",              "application/vnd.iccprofile"},
      {"icm",              "application/vnd.iccprofile"},
      {"igl",              "application/vnd.igloader"},
      {"ivp",              "application/vnd.immervision-ivp"},
      {"ivu",              "application/vnd.immervision-ivu"},
      {"igm",              "application/vnd.insors.igm"},
      {"xpw",              "application/vnd.intercon.formnet"},
      {"xpx",              "application/vnd.intercon.formnet"},
      {"i2g",              "application/vnd.intergeo"},
      {"qbo",              "application/vnd.intu.qbo"},
      {"qfx",              "application/vnd.intu.qfx"},
      {"rcprofile",  "application/vnd.ipunplugged.rcprofile"},
      {"irp",              "application/vnd.irepository.package+xml"},
      {"xpr",              "application/vnd.is-xpr"},
      {"fcs",              "application/vnd.isac.fcs"},
      {"jam",              "application/vnd.jam"},
      {"rms",              "application/vnd.jcp.javame.midlet-rms"},
      {"jisp",            "application/vnd.jisp"},
      {"joda",            "application/vnd.joost.joda-archive"},
      {"ktz",              "application/vnd.kahootz"},
      {"ktr",              "application/vnd.kahootz"},
      {"karbon",        "application/vnd.kde.karbon"},
      {"chrt",            "application/vnd.kde.kchart"},
      {"kfo",              "application/vnd.kde.kformula"},
      {"flw",              "application/vnd.kde.kivio"},
      {"kon",              "application/vnd.kde.kontour"},
      {"kpr",              "application/vnd.kde.kpresenter"},
      {"kpt",              "application/vnd.kde.kpresenter"},
      {"ksp",              "application/vnd.kde.kspread"},
      {"kwd",              "application/vnd.kde.kword"},
      {"kwt",              "application/vnd.kde.kword"},
      {"htke",            "application/vnd.kenameaapp"},
      {"kia",              "application/vnd.kidspiration"},
      {"kne",              "application/vnd.kinar"},
      {"knp",              "application/vnd.kinar"},
      {"skp",              "application/vnd.koan"},
      {"skd",              "application/vnd.koan"},
      {"skt",              "application/vnd.koan"},
      {"skm",              "application/vnd.koan"},
      {"sse",              "application/vnd.kodak-descriptor"},
      {"lasxml",        "application/vnd.las.las+xml"},
      {"lbd",              "application/vnd.llamagraphics.life-balance.desktop"},
      {"lbe",              "application/vnd.llamagraphics.life-balance.exchange+xml"},
      {"123",              "application/vnd.lotus-1-2-3"},
      {"apr",              "application/vnd.lotus-approach"},
      {"pre",              "application/vnd.lotus-freelance"},
      {"nsf",              "application/vnd.lotus-notes"},
      {"org",              "application/vnd.lotus-organizer"},
      {"scm",              "application/vnd.lotus-screencam"},
      {"lwp",              "application/vnd.lotus-wordpro"},
      {"portpkg",      "application/vnd.macports.portpkg"},
      {"mcd",              "application/vnd.mcd"},
      {"mc1",              "application/vnd.medcalcdata"},
      {"cdkey",          "application/vnd.mediastation.cdkey"},
      {"mwf",              "application/vnd.mfer"},
      {"mfm",              "application/vnd.mfmp"},
      {"flo",              "application/vnd.micrografx.flo"},
      {"igx",              "application/vnd.micrografx.igx"},
      {"mif",              "application/vnd.mif"},
      {"daf",              "application/vnd.mobius.daf"},
      {"dis",              "application/vnd.mobius.dis"},
      {"mbk",              "application/vnd.mobius.mbk"},
      {"mqy",              "application/vnd.mobius.mqy"},
      {"msl",              "application/vnd.mobius.msl"},
      {"plc",              "application/vnd.mobius.plc"},
      {"txf",              "application/vnd.mobius.txf"},
      {"mpn",              "application/vnd.mophun.application"},
      {"mpc",              "application/vnd.mophun.certificate"},
      {"xul",              "application/vnd.mozilla.xul+xml"},
      {"cil",              "application/vnd.ms-artgalry"},
      {"cab",              "application/vnd.ms-cab-compressed"},
      {"xls",              "application/vnd.ms-excel"},
      {"xlm",              "application/vnd.ms-excel"},
      {"xla",              "application/vnd.ms-excel"},
      {"xlc",              "application/vnd.ms-excel"},
      {"xlt",              "application/vnd.ms-excel"},
      {"xlw",              "application/vnd.ms-excel"},
      {"xlam",            "application/vnd.ms-excel.addin.macroenabled.12"},
      {"xlsb",            "application/vnd.ms-excel.sheet.binary.macroenabled.12"},
      {"xlsm",            "application/vnd.ms-excel.sheet.macroenabled.12"},
      {"xltm",            "application/vnd.ms-excel.template.macroenabled.12"},
      {"eot",              "application/vnd.ms-fontobject"},
      {"chm",              "application/vnd.ms-htmlhelp"},
      {"ims",              "application/vnd.ms-ims"},
      {"lrm",              "application/vnd.ms-lrm"},
      {"thmx",            "application/vnd.ms-officetheme"},
      {"msg",              "application/vnd.ms-outlook"},
      {"cat",              "application/vnd.ms-pki.seccat"},
      {"stl",              "application/vnd.ms-pki.stl"},
      {"ppt",              "application/vnd.ms-powerpoint"},
      {"pps",              "application/vnd.ms-powerpoint"},
      {"pot",              "application/vnd.ms-powerpoint"},
      {"ppam",            "application/vnd.ms-powerpoint.addin.macroenabled.12"},
      {"pptm",            "application/vnd.ms-powerpoint.presentation.macroenabled.12"},
      {"sldm",            "application/vnd.ms-powerpoint.slide.macroenabled.12"},
      {"ppsm",            "application/vnd.ms-powerpoint.slideshow.macroenabled.12"},
      {"potm",            "application/vnd.ms-powerpoint.template.macroenabled.12"},
      {"mpp",              "application/vnd.ms-project"},
      {"mpt",              "application/vnd.ms-project"},
      {"docm",            "application/vnd.ms-word.document.macroenabled.12"},
      {"dotm",            "application/vnd.ms-word.template.macroenabled.12"},
      {"wps",              "application/vnd.ms-works"},
      {"wks",              "application/vnd.ms-works"},
      {"wcm",              "application/vnd.ms-works"},
      {"wdb",              "application/vnd.ms-works"},
      {"wpl",              "application/vnd.ms-wpl"},
      {"xps",              "application/vnd.ms-xpsdocument"},
      {"mseq",            "application/vnd.mseq"},
      {"mus",              "application/vnd.musician"},
      {"msty",            "application/vnd.muvee.style"},
      {"taglet",        "application/vnd.mynfc"},
      {"nlu",              "application/vnd.neurolanguage.nlu"},
      {"ntf",              "application/vnd.nitf"},
      {"nitf",            "application/vnd.nitf"},
      {"nnd",              "application/vnd.noblenet-directory"},
      {"nns",              "application/vnd.noblenet-sealer"},
      {"nnw",              "application/vnd.noblenet-web"},
      {"ngdat",          "application/vnd.nokia.n-gage.data"},
      {"n-gage",        "application/vnd.nokia.n-gage.symbian.install"},
      {"rpst",            "application/vnd.nokia.radio-preset"},
      {"rpss",            "application/vnd.nokia.radio-presets"},
      {"edm",              "application/vnd.novadigm.edm"},
      {"edx",              "application/vnd.novadigm.edx"},
      {"ext",              "application/vnd.novadigm.ext"},
      {"odc",              "application/vnd.oasis.opendocument.chart"},
      {"otc",              "application/vnd.oasis.opendocument.chart-template"},
      {"odb",              "application/vnd.oasis.opendocument.database"},
      {"odf",              "application/vnd.oasis.opendocument.formula"},
      {"odft",            "application/vnd.oasis.opendocument.formula-template"},
      {"odg",              "application/vnd.oasis.opendocument.graphics"},
      {"otg",              "application/vnd.oasis.opendocument.graphics-template"},
      {"odi",              "application/vnd.oasis.opendocument.image"},
      {"oti",              "application/vnd.oasis.opendocument.image-template"},
      {"odp",              "application/vnd.oasis.opendocument.presentation"},
      {"otp",              "application/vnd.oasis.opendocument.presentation-template"},
      {"ods",              "application/vnd.oasis.opendocument.spreadsheet"},
      {"ots",              "application/vnd.oasis.opendocument.spreadsheet-template"},
      {"odt",              "application/vnd.oasis.opendocument.text"},
      {"odm",              "application/vnd.oasis.opendocument.text-master"},
      {"ott",              "application/vnd.oasis.opendocument.text-template"},
      {"oth",              "application/vnd.oasis.opendocument.text-web"},
      {"xo",                "application/vnd.olpc-sugar"},
      {"dd2",              "application/vnd.oma.dd2+xml"},
      {"oxt",              "application/vnd.openofficeorg.extension"},
      {"pptx",            "application/vnd.openxmlformats-officedocument.presentationml.presentation"},
      {"sldx",            "application/vnd.openxmlformats-officedocument.presentationml.slide"},
      {"ppsx",            "application/vnd.openxmlformats-officedocument.presentationml.slideshow"},
      {"potx",            "application/vnd.openxmlformats-officedocument.presentationml.template"},
      {"xlsx",            "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"},
      {"xltx",            "application/vnd.openxmlformats-officedocument.spreadsheetml.template"},
      {"docx",            "application/vnd.openxmlformats-officedocument.wordprocessingml.document"},
      {"dotx",            "application/vnd.openxmlformats-officedocument.wordprocessingml.template"},
      {"mgp",              "application/vnd.osgeo.mapguide.package"},
      {"dp",                "application/vnd.osgi.dp"},
      {"esa",              "application/vnd.osgi.subsystem"},
      {"pdb",              "application/vnd.palm"},
      {"pqa",              "application/vnd.palm"},
      {"oprc",            "application/vnd.palm"},
      {"paw",              "application/vnd.pawaafile"},
      {"str",              "application/vnd.pg.format"},
      {"ei6",              "application/vnd.pg.osasli"},
      {"efif",            "application/vnd.picsel"},
      {"wg",                "application/vnd.pmi.widget"},
      {"plf",              "application/vnd.pocketlearn"},
      {"pbd",              "application/vnd.powerbuilder6"},
      {"box",              "application/vnd.previewsystems.box"},
      {"mgz",              "application/vnd.proteus.magazine"},
      {"qps",              "application/vnd.publishare-delta-tree"},
      {"ptid",            "application/vnd.pvi.ptid1"},
      {"qxd",              "application/vnd.quark.quarkxpress"},
      {"qxt",              "application/vnd.quark.quarkxpress"},
      {"qwd",              "application/vnd.quark.quarkxpress"},
      {"qwt",              "application/vnd.quark.quarkxpress"},
      {"qxl",              "application/vnd.quark.quarkxpress"},
      {"qxb",              "application/vnd.quark.quarkxpress"},
      {"bed",              "application/vnd.realvnc.bed"},
      {"mxl",              "application/vnd.recordare.musicxml"},
      {"musicxml",    "application/vnd.recordare.musicxml+xml"},
      {"cryptonote","application/vnd.rig.cryptonote"},
      {"cod",              "application/vnd.rim.cod"},
      {"rm",                "application/vnd.rn-realmedia"},
      {"rmvb",            "application/vnd.rn-realmedia-vbr"},
      {"link66",        "application/vnd.route66.link66+xml"},
      {"st",                "application/vnd.sailingtracker.track"},
      {"see",              "application/vnd.seemail"},
      {"sema",            "application/vnd.sema"},
      {"semd",            "application/vnd.semd"},
      {"semf",            "application/vnd.semf"},
      {"ifm",              "application/vnd.shana.informed.formdata"},
      {"itp",              "application/vnd.shana.informed.formtemplate"},
      {"iif",              "application/vnd.shana.informed.interchange"},
      {"ipk",              "application/vnd.shana.informed.package"},
      {"twd",              "application/vnd.simtech-mindmapper"},
      {"twds",            "application/vnd.simtech-mindmapper"},
      {"mmf",              "application/vnd.smaf"},
      {"teacher",      "application/vnd.smart.teacher"},
      {"sdkm",            "application/vnd.solent.sdkm+xml"},
      {"sdkd",            "application/vnd.solent.sdkm+xml"},
      {"dxp",              "application/vnd.spotfire.dxp"},
      {"sfs",              "application/vnd.spotfire.sfs"},
      {"sdc",              "application/vnd.stardivision.calc"},
      {"sda",              "application/vnd.stardivision.draw"},
      {"sdd",              "application/vnd.stardivision.impress"},
      {"smf",              "application/vnd.stardivision.math"},
      {"sdw",              "application/vnd.stardivision.writer"},
      {"vor",              "application/vnd.stardivision.writer"},
      {"sgl",              "application/vnd.stardivision.writer-global"},
      {"smzip",          "application/vnd.stepmania.package"},
      {"sm",                "application/vnd.stepmania.stepchart"},
      {"wadl",            "application/vnd.sun.wadl+xml"},
      {"sxc",              "application/vnd.sun.xml.calc"},
      {"stc",              "application/vnd.sun.xml.calc.template"},
      {"sxd",              "application/vnd.sun.xml.draw"},
      {"std",              "application/vnd.sun.xml.draw.template"},
      {"sxi",              "application/vnd.sun.xml.impress"},
      {"sti",              "application/vnd.sun.xml.impress.template"},
      {"sxm",              "application/vnd.sun.xml.math"},
      {"sxw",              "application/vnd.sun.xml.writer"},
      {"sxg",              "application/vnd.sun.xml.writer.global"},
      {"stw",              "application/vnd.sun.xml.writer.template"},
      {"sus",              "application/vnd.sus-calendar"},
      {"susp",            "application/vnd.sus-calendar"},
      {"svd",              "application/vnd.svd"},
      {"sis",              "application/vnd.symbian.install"},
      {"sisx",            "application/vnd.symbian.install"},
      {"xsm",              "application/vnd.syncml+xml"},
      {"bdm",              "application/vnd.syncml.dm+wbxml"},
      {"xdm",              "application/vnd.syncml.dm+xml"},
      {"tao",              "application/vnd.tao.intent-module-archive"},
      {"pcap",            "application/vnd.tcpdump.pcap"},
      {"cap",              "application/vnd.tcpdump.pcap"},
      {"dmp",              "application/vnd.tcpdump.pcap"},
      {"tmo",              "application/vnd.tmobile-livetv"},
      {"tpt",              "application/vnd.trid.tpt"},
      {"mxs",              "application/vnd.triscape.mxs"},
      {"tra",              "application/vnd.trueapp"},
      {"ufd",              "application/vnd.ufdl"},
      {"ufdl",            "application/vnd.ufdl"},
      {"utz",              "application/vnd.uiq.theme"},
      {"umj",              "application/vnd.umajin"},
      {"unityweb",    "application/vnd.unity"},
      {"uoml",            "application/vnd.uoml+xml"},
      {"vcx",              "application/vnd.vcx"},
      {"vsd",              "application/vnd.visio"},
      {"vst",              "application/vnd.visio"},
      {"vss",              "application/vnd.visio"},
      {"vsw",              "application/vnd.visio"},
      {"vis",              "application/vnd.visionary"},
      {"vsf",              "application/vnd.vsf"},
      {"wbxml",          "application/vnd.wap.wbxml"},
      {"wmlc",            "application/vnd.wap.wmlc"},
      {"wmlsc",          "application/vnd.wap.wmlscriptc"},
      {"wtb",              "application/vnd.webturbo"},
      {"nbp",              "application/vnd.wolfram.player"},
      {"wpd",              "application/vnd.wordperfect"},
      {"wqd",              "application/vnd.wqd"},
      {"stf",              "application/vnd.wt.stf"},
      {"xar",              "application/vnd.xara"},
      {"xfdl",            "application/vnd.xfdl"},
      {"hvd",              "application/vnd.yamaha.hv-dic"},
      {"hvs",              "application/vnd.yamaha.hv-script"},
      {"hvp",              "application/vnd.yamaha.hv-voice"},
      {"osf",              "application/vnd.yamaha.openscoreformat"},
      {"osfpvg",        "application/vnd.yamaha.openscoreformat.osfpvg+xml"},
      {"saf",              "application/vnd.yamaha.smaf-audio"},
      {"spf",              "application/vnd.yamaha.smaf-phrase"},
      {"cmp",              "application/vnd.yellowriver-custom-menu"},
      {"zir",              "application/vnd.zul"},
      {"zirz",            "application/vnd.zul"},
      {"zaz",              "application/vnd.zzazz.deck+xml"},
      {"vxml",            "application/voicexml+xml"},
      {"wgt",              "application/widget"},
      {"hlp",              "application/winhlp"},
      {"wsdl",            "application/wsdl+xml"},
      {"wspolicy",    "application/wspolicy+xml"},
      {"7z",                "application/x-7z-compressed"},
      {"abw",              "application/x-abiword"},
      {"ace",              "application/x-ace-compressed"},
      {"dmg",              "application/x-apple-diskimage"},
      {"arj",              "application/x-arj"},
      {"aab",              "application/x-authorware-bin"},
      {"x32",              "application/x-authorware-bin"},
      {"u32",              "application/x-authorware-bin"},
      {"vox",              "application/x-authorware-bin"},
      {"aam",              "application/x-authorware-map"},
      {"aas",              "application/x-authorware-seg"},
      {"bcpio",          "application/x-bcpio"},
      {"bdoc",            "application/x-bdoc"},
      {"torrent",      "application/x-bittorrent"},
      {"blb",              "application/x-blorb"},
      {"blorb",          "application/x-blorb"},
      {"bz",                "application/x-bzip"},
      {"bz2",              "application/x-bzip2"},
      {"boz",              "application/x-bzip2"},
      {"cbr",              "application/x-cbr"},
      {"cba",              "application/x-cbr"},
      {"cbt",              "application/x-cbr"},
      {"cbz",              "application/x-cbr"},
      {"cb7",              "application/x-cbr"},
      {"vcd",              "application/x-cdlink"},
      {"cfs",              "application/x-cfs-compressed"},
      {"chat",            "application/x-chat"},
      {"pgn",              "application/x-chess-pgn"},
      {"crx",              "application/x-chrome-extension"},
      {"cco",              "application/x-cocoa"},
      {"nsc",              "application/x-conference"},
      {"cpio",            "application/x-cpio"},
      {"csh",              "application/x-csh"},
      {"deb",              "application/x-debian-package"},
      {"udeb",            "application/x-debian-package"},
      {"dgc",              "application/x-dgc-compressed"},
      {"dir",              "application/x-director"},
      {"dcr",              "application/x-director"},
      {"dxr",              "application/x-director"},
      {"cst",              "application/x-director"},
      {"cct",              "application/x-director"},
      {"cxt",              "application/x-director"},
      {"w3d",              "application/x-director"},
      {"fgd",              "application/x-director"},
      {"swa",              "application/x-director"},
      {"wad",              "application/x-doom"},
      {"ncx",              "application/x-dtbncx+xml"},
      {"dtb",              "application/x-dtbook+xml"},
      {"res",              "application/x-dtbresource+xml"},
      {"dvi",              "application/x-dvi"},
      {"evy",              "application/x-envoy"},
      {"eva",              "application/x-eva"},
      {"bdf",              "application/x-font-bdf"},
      {"gsf",              "application/x-font-ghostscript"},
      {"psf",              "application/x-font-linux-psf"},
      {"otf",              "application/x-font-otf"},
      {"pcf",              "application/x-font-pcf"},
      {"snf",              "application/x-font-snf"},
      {"ttf",              "application/x-font-ttf"},
      {"ttc",              "application/x-font-ttf"},
      {"pfa",              "application/x-font-type1"},
      {"pfb",              "application/x-font-type1"},
      {"pfm",              "application/x-font-type1"},
      {"afm",              "application/x-font-type1"},
      {"arc",              "application/x-freearc"},
      {"spl",              "application/x-futuresplash"},
      {"gca",              "application/x-gca-compressed"},
      {"ulx",              "application/x-glulx"},
      {"gnumeric",    "application/x-gnumeric"},
      {"gramps",        "application/x-gramps-xml"},
      {"gtar",            "application/x-gtar"},
      {"hdf",              "application/x-hdf"},
      {"php",              "application/x-httpd-php"},
      {"install",      "application/x-install-instructions"},
      {"iso",              "application/x-iso9660-image"},
      {"jardiff",      "application/x-java-archive-diff"},
      {"jnlp",            "application/x-java-jnlp-file"},
      {"latex",          "application/x-latex"},
      {"luac",            "application/x-lua-bytecode"},
      {"lzh",              "application/x-lzh-compressed"},
      {"lha",              "application/x-lzh-compressed"},
      {"run",              "application/x-makeself"},
      {"mie",              "application/x-mie"},
      {"prc",              "application/x-mobipocket-ebook"},
      {"mobi",            "application/x-mobipocket-ebook"},
      {"application","application/x-ms-application"},
      {"lnk",              "application/x-ms-shortcut"},
      {"wmd",              "application/x-ms-wmd"},
      {"wmz",              "application/x-ms-wmz"},
      {"xbap",            "application/x-ms-xbap"},
      {"mdb",              "application/x-msaccess"},
      {"obd",              "application/x-msbinder"},
      {"crd",              "application/x-mscardfile"},
      {"clp",              "application/x-msclip"},
      {"exe",              "application/x-msdos-program"},
      {"exe",              "application/x-msdownload"},
      {"dll",              "application/x-msdownload"},
      {"com",              "application/x-msdownload"},
      {"bat",              "application/x-msdownload"},
      {"msi",              "application/x-msdownload"},
      {"mvb",              "application/x-msmediaview"},
      {"m13",              "application/x-msmediaview"},
      {"m14",              "application/x-msmediaview"},
      {"wmf",              "application/x-msmetafile"},
      {"wmz",              "application/x-msmetafile"},
      {"emf",              "application/x-msmetafile"},
      {"emz",              "application/x-msmetafile"},
      {"mny",              "application/x-msmoney"},
      {"pub",              "application/x-mspublisher"},
      {"scd",              "application/x-msschedule"},
      {"trm",              "application/x-msterminal"},
      {"wri",              "application/x-mswrite"},
      {"nc",                "application/x-netcdf"},
      {"cdf",              "application/x-netcdf"},
      {"pac",              "application/x-ns-proxy-autoconfig"},
      {"nzb",              "application/x-nzb"},
      {"pl",                "application/x-perl"},
      {"pm",                "application/x-perl"},
      {"prc",              "application/x-pilot"},
      {"pdb",              "application/x-pilot"},
      {"p12",              "application/x-pkcs12"},
      {"pfx",              "application/x-pkcs12"},
      {"p7b",              "application/x-pkcs7-certificates"},
      {"spc",              "application/x-pkcs7-certificates"},
      {"p7r",              "application/x-pkcs7-certreqresp"},
      {"rar",              "application/x-rar-compressed"},
      {"rpm",              "application/x-redhat-package-manager"},
      {"ris",              "application/x-research-info-systems"},
      {"sea",              "application/x-sea"},
      {"sh",                "application/x-sh"},
      {"shar",            "application/x-shar"},
      {"swf",              "application/x-shockwave-flash"},
      {"xap",              "application/x-silverlight-app"},
      {"sql",              "application/x-sql"},
      {"sit",              "application/x-stuffit"},
      {"sitx",            "application/x-stuffitx"},
      {"srt",              "application/x-subrip"},
      {"sv4cpio",      "application/x-sv4cpio"},
      {"sv4crc",        "application/x-sv4crc"},
      {"t3",                "application/x-t3vm-image"},
      {"gam",              "application/x-tads"},
      {"tar",              "application/x-tar"},
      {"tcl",              "application/x-tcl"},
      {"tk",                "application/x-tcl"},
      {"tex",              "application/x-tex"},
      {"tfm",              "application/x-tex-tfm"},
      {"texinfo",      "application/x-texinfo"},
      {"texi",            "application/x-texinfo"},
      {"obj",              "application/x-tgif"},
      {"ustar",          "application/x-ustar"},
      {"hdd",              "application/x-virtualbox-hdd"},
      {"ova",              "application/x-virtualbox-ova"},
      {"ovf",              "application/x-virtualbox-ovf"},
      {"vbox",            "application/x-virtualbox-vbox"},
      {"vbox-extpack","application/x-virtualbox-vbox-extpack"},
      {"vdi",              "application/x-virtualbox-vdi"},
      {"vhd",              "application/x-virtualbox-vhd"},
      {"vmdk",            "application/x-virtualbox-vmdk"},
      {"src",              "application/x-wais-source"},
      {"webapp",        "application/x-web-app-manifest+json"},
      {"der",              "application/x-x509-ca-cert"},
      {"crt",              "application/x-x509-ca-cert"},
      {"pem",              "application/x-x509-ca-cert"},
      {"fig",              "application/x-xfig"},
      {"xlf",              "application/x-xliff+xml"},
      {"xpi",              "application/x-xpinstall"},
      {"xz",                "application/x-xz"},
      {"z1",                "application/x-zmachine"},
      {"z2",                "application/x-zmachine"},
      {"z3",                "application/x-zmachine"},
      {"z4",                "application/x-zmachine"},
      {"z5",                "application/x-zmachine"},
      {"z6",                "application/x-zmachine"},
      {"z7",                "application/x-zmachine"},
      {"z8",                "application/x-zmachine"},
      {"xaml",            "application/xaml+xml"},
      {"xdf",              "application/xcap-diff+xml"},
      {"xenc",            "application/xenc+xml"},
      {"xhtml",          "application/xhtml+xml"},
      {"xht",              "application/xhtml+xml"},
      {"xml",              "application/xml"},
      {"xsl",              "application/xml"},
      {"xsd",              "application/xml"},
      {"rng",              "application/xml"},
      {"dtd",              "application/xml-dtd"},
      {"xop",              "application/xop+xml"},
      {"xpl",              "application/xproc+xml"},
      {"xslt",            "application/xslt+xml"},
      {"xspf",            "application/xspf+xml"},
      {"mxml",            "application/xv+xml"},
      {"xhvml",          "application/xv+xml"},
      {"xvml",            "application/xv+xml"},
      {"xvm",              "application/xv+xml"},
      {"yang",            "application/yang"},
      {"yin",              "application/yin+xml"},
      {"zip",              "application/zip"},
      {"3gpp",            "audio/3gpp"},
      {"adp",              "audio/adpcm"},
      {"au",                "audio/basic"},
      {"snd",              "audio/basic"},
      {"mid",              "audio/midi"},
      {"midi",            "audio/midi"},
      {"kar",              "audio/midi"},
      {"rmi",              "audio/midi"},
      {"mp3",              "audio/mp3"},
      {"m4a",              "audio/mp4"},
      {"mp4a",            "audio/mp4"},
      {"mpga",            "audio/mpeg"},
      {"mp2",              "audio/mpeg"},
      {"mp2a",            "audio/mpeg"},
      {"mp3",              "audio/mpeg"},
      {"m2a",              "audio/mpeg"},
      {"m3a",              "audio/mpeg"},
      {"oga",              "audio/ogg"},
      {"ogg",              "audio/ogg"},
      {"spx",              "audio/ogg"},
      {"s3m",              "audio/s3m"},
      {"sil",              "audio/silk"},
      {"uva",              "audio/vnd.dece.audio"},
      {"uvva",            "audio/vnd.dece.audio"},
      {"eol",              "audio/vnd.digital-winds"},
      {"dra",              "audio/vnd.dra"},
      {"dts",              "audio/vnd.dts"},
      {"dtshd",          "audio/vnd.dts.hd"},
      {"lvp",              "audio/vnd.lucent.voice"},
      {"pya",              "audio/vnd.ms-playready.media.pya"},
      {"ecelp4800",  "audio/vnd.nuera.ecelp4800"},
      {"ecelp7470",  "audio/vnd.nuera.ecelp7470"},
      {"ecelp9600",  "audio/vnd.nuera.ecelp9600"},
      {"rip",              "audio/vnd.rip"},
      {"wav",              "audio/wav"},
      {"wav",              "audio/wave"},
      {"weba",            "audio/webm"},
      {"aac",              "audio/x-aac"},
      {"aif",              "audio/x-aiff"},
      {"aiff",            "audio/x-aiff"},
      {"aifc",            "audio/x-aiff"},
      {"caf",              "audio/x-caf"},
      {"flac",            "audio/x-flac"},
      {"m4a",              "audio/x-m4a"},
      {"mka",              "audio/x-matroska"},
      {"m3u",              "audio/x-mpegurl"},
      {"wax",              "audio/x-ms-wax"},
      {"wma",              "audio/x-ms-wma"},
      {"ram",              "audio/x-pn-realaudio"},
      {"ra",                "audio/x-pn-realaudio"},
      {"rmp",              "audio/x-pn-realaudio-plugin"},
      {"ra",                "audio/x-realaudio"},
      {"wav",              "audio/x-wav"},
      {"xm",                "audio/xm"},
      {"cdx",              "chemical/x-cdx"},
      {"cif",              "chemical/x-cif"},
      {"cmdf",            "chemical/x-cmdf"},
      {"cml",              "chemical/x-cml"},
      {"csml",            "chemical/x-csml"},
      {"xyz",              "chemical/x-xyz"},
      {"otf",              "font/otf"},
      {"apng",            "image/apng"},
      {"bmp",              "image/bmp"},
      {"cgm",              "image/cgm"},
      {"g3",                "image/g3fax"},
      {"gif",              "image/gif"},
      {"ief",              "image/ief"},
      {"jpeg",            "image/jpeg"},
      {"jpg",              "image/jpeg"},
      {"jpe",              "image/jpeg"},
      {"ktx",              "image/ktx"},
      {"png",              "image/png"},
      {"btif",            "image/prs.btif"},
      {"sgi",              "image/sgi"},
      {"svg",              "image/svg+xml"},
      {"svgz",            "image/svg+xml"},
      {"tiff",            "image/tiff"},
      {"tif",              "image/tiff"},
      {"psd",              "image/vnd.adobe.photoshop"},
      {"uvi",              "image/vnd.dece.graphic"},
      {"uvvi",            "image/vnd.dece.graphic"},
      {"uvg",              "image/vnd.dece.graphic"},
      {"uvvg",            "image/vnd.dece.graphic"},
      {"djvu",            "image/vnd.djvu"},
      {"djv",              "image/vnd.djvu"},
      {"sub",              "image/vnd.dvb.subtitle"},
      {"dwg",              "image/vnd.dwg"},
      {"dxf",              "image/vnd.dxf"},
      {"fbs",              "image/vnd.fastbidsheet"},
      {"fpx",              "image/vnd.fpx"},
      {"fst",              "image/vnd.fst"},
      {"mmr",              "image/vnd.fujixerox.edmics-mmr"},
      {"rlc",              "image/vnd.fujixerox.edmics-rlc"},
      {"mdi",              "image/vnd.ms-modi"},
      {"wdp",              "image/vnd.ms-photo"},
      {"npx",              "image/vnd.net-fpx"},
      {"wbmp",            "image/vnd.wap.wbmp"},
      {"xif",              "image/vnd.xiff"},
      {"webp",            "image/webp"},
      {"3ds",              "image/x-3ds"},
      {"ras",              "image/x-cmu-raster"},
      {"cmx",              "image/x-cmx"},
      {"fh",                "image/x-freehand"},
      {"fhc",              "image/x-freehand"},
      {"fh4",              "image/x-freehand"},
      {"fh5",              "image/x-freehand"},
      {"fh7",              "image/x-freehand"},
      {"ico",              "image/x-icon"},
      {"jng",              "image/x-jng"},
      {"sid",              "image/x-mrsid-image"},
      {"bmp",              "image/x-ms-bmp"},
      {"pcx",              "image/x-pcx"},
      {"pic",              "image/x-pict"},
      {"pct",              "image/x-pict"},
      {"pnm",              "image/x-portable-anymap"},
      {"pbm",              "image/x-portable-bitmap"},
      {"pgm",              "image/x-portable-graymap"},
      {"ppm",              "image/x-portable-pixmap"},
      {"rgb",              "image/x-rgb"},
      {"tga",              "image/x-tga"},
      {"xbm",              "image/x-xbitmap"},
      {"xpm",              "image/x-xpixmap"},
      {"xwd",              "image/x-xwindowdump"},
      {"eml",              "message/rfc822"},
      {"mime",            "message/rfc822"},
      {"gltf",            "model/gltf+json"},
      {"glb",              "model/gltf-binary"},
      {"igs",              "model/iges"},
      {"iges",            "model/iges"},
      {"msh",              "model/mesh"},
      {"mesh",            "model/mesh"},
      {"silo",            "model/mesh"},
      {"dae",              "model/vnd.collada+xml"},
      {"dwf",              "model/vnd.dwf"},
      {"gdl",              "model/vnd.gdl"},
      {"gtw",              "model/vnd.gtw"},
      {"mts",              "model/vnd.mts"},
      {"vtu",              "model/vnd.vtu"},
      {"wrl",              "model/vrml"},
      {"vrml",            "model/vrml"},
      {"x3db",            "model/x3d+binary"},
      {"x3dbz",          "model/x3d+binary"},
      {"x3dv",            "model/x3d+vrml"},
      {"x3dvz",          "model/x3d+vrml"},
      {"x3d",              "model/x3d+xml"},
      {"x3dz",            "model/x3d+xml"},
      {"appcache",    "text/cache-manifest"},
      {"manifest",    "text/cache-manifest"},
      {"ics",              "text/calendar"},
      {"ifb",              "text/calendar"},
      {"coffee",        "text/coffeescript"},
      {"litcoffee",  "text/coffeescript"},
      {"css",              "text/css"},
      {"csv",              "text/csv"},
      {"hjson",          "text/hjson"},
      {"html",            "text/html"},
      {"htm",              "text/html"},
      {"shtml",          "text/html"},
      {"jade",            "text/jade"},
      {"jsx",              "text/jsx"},
      {"less",            "text/less"},
      {"markdown",    "text/markdown"},
      {"md",                "text/markdown"},
      {"mml",              "text/mathml"},
      {"n3",                "text/n3"},
      {"txt",              "text/plain"},
      {"text",            "text/plain"},
      {"conf",            "text/plain"},
      {"def",              "text/plain"},
      {"list",            "text/plain"},
      {"log",              "text/plain"},
      {"in",                "text/plain"},
      {"ini",              "text/plain"},
      {"dsc",              "text/prs.lines.tag"},
      {"rtx",              "text/richtext"},
      {"rtf",              "text/rtf"},
      {"sgml",            "text/sgml"},
      {"sgm",              "text/sgml"},
      {"slim",            "text/slim"},
      {"slm",              "text/slim"},
      {"stylus",        "text/stylus"},
      {"styl",            "text/stylus"},
      {"tsv",              "text/tab-separated-values"},
      {"t",                  "text/troff"},
      {"tr",                "text/troff"},
      {"roff",            "text/troff"},
      {"man",              "text/troff"},
      {"me",                "text/troff"},
      {"ms",                "text/troff"},
      {"ttl",              "text/turtle"},
      {"uri",              "text/uri-list"},
      {"uris",            "text/uri-list"},
      {"urls",            "text/uri-list"},
      {"vcard",          "text/vcard"},
      {"curl",            "text/vnd.curl"},
      {"dcurl",          "text/vnd.curl.dcurl"},
      {"mcurl",          "text/vnd.curl.mcurl"},
      {"scurl",          "text/vnd.curl.scurl"},
      {"sub",              "text/vnd.dvb.subtitle"},
      {"fly",              "text/vnd.fly"},
      {"flx",              "text/vnd.fmi.flexstor"},
      {"gv",                "text/vnd.graphviz"},
      {"3dml",            "text/vnd.in3d.3dml"},
      {"spot",            "text/vnd.in3d.spot"},
      {"jad",              "text/vnd.sun.j2me.app-descriptor"},
      {"wml",              "text/vnd.wap.wml"},
      {"wmls",            "text/vnd.wap.wmlscript"},
      {"vtt",              "text/vtt"},
      {"s",                  "text/x-asm"},
      {"asm",              "text/x-asm"},
      {"c",                  "text/x-c"},
      {"cc",                "text/x-c"},
      {"cxx",              "text/x-c"},
      {"cpp",              "text/x-c"},
      {"h",                  "text/x-c"},
      {"hh",                "text/x-c"},
      {"dic",              "text/x-c"},
      {"htc",              "text/x-component"},
      {"f",                  "text/x-fortran"},
      {"for",              "text/x-fortran"},
      {"f77",              "text/x-fortran"},
      {"f90",              "text/x-fortran"},
      {"hbs",              "text/x-handlebars-template"},
      {"java",            "text/x-java-source"},
      {"lua",              "text/x-lua"},
      {"mkd",              "text/x-markdown"},
      {"nfo",              "text/x-nfo"},
      {"opml",            "text/x-opml"},
      {"org",              "text/x-org"},
      {"p",                  "text/x-pascal"},
      {"pas",              "text/x-pascal"},
      {"pde",              "text/x-processing"},
      {"sass",            "text/x-sass"},
      {"scss",            "text/x-scss"},
      {"etx",              "text/x-setext"},
      {"sfv",              "text/x-sfv"},
      {"ymp",              "text/x-suse-ymp"},
      {"uu",                "text/x-uuencode"},
      {"vcs",              "text/x-vcalendar"},
      {"vcf",              "text/x-vcard"},
      {"xml",              "text/xml"},
      {"yaml",            "text/yaml"},
      {"yml",              "text/yaml"},
      {"3gp",              "video/3gpp"},
      {"3gpp",            "video/3gpp"},
      {"3g2",              "video/3gpp2"},
      {"h261",            "video/h261"},
      {"h263",            "video/h263"},
      {"h264",            "video/h264"},
      {"jpgv",            "video/jpeg"},
      {"jpm",              "video/jpm"},
      {"jpgm",            "video/jpm"},
      {"mj2",              "video/mj2"},
      {"mjp2",            "video/mj2"},
      {"ts",                "video/mp2t"},
      {"mp4",              "video/mp4"},
      {"mp4v",            "video/mp4"},
      {"mpg4",            "video/mp4"},
      {"mpeg",            "video/mpeg"},
      {"mpg",              "video/mpeg"},
      {"mpe",              "video/mpeg"},
      {"m1v",              "video/mpeg"},
      {"m2v",              "video/mpeg"},
      {"ogv",              "video/ogg"},
      {"qt",                "video/quicktime"},
      {"mov",              "video/quicktime"},
      {"uvh",              "video/vnd.dece.hd"},
      {"uvvh",            "video/vnd.dece.hd"},
      {"uvm",              "video/vnd.dece.mobile"},
      {"uvvm",            "video/vnd.dece.mobile"},
      {"uvp",              "video/vnd.dece.pd"},
      {"uvvp",            "video/vnd.dece.pd"},
      {"uvs",              "video/vnd.dece.sd"},
      {"uvvs",            "video/vnd.dece.sd"},
      {"uvv",              "video/vnd.dece.video"},
      {"uvvv",            "video/vnd.dece.video"},
      {"dvb",              "video/vnd.dvb.file"},
      {"fvt",              "video/vnd.fvt"},
      {"mxu",              "video/vnd.mpegurl"},
      {"m4u",              "video/vnd.mpegurl"},
      {"pyv",              "video/vnd.ms-playready.media.pyv"},
      {"uvu",              "video/vnd.uvvu.mp4"},
      {"uvvu",            "video/vnd.uvvu.mp4"},
      {"viv",              "video/vnd.vivo"},
      {"webm",            "video/webm"},
      {"f4v",              "video/x-f4v"},
      {"fli",              "video/x-fli"},
      {"flv",              "video/x-flv"},
      {"m4v",              "video/x-m4v"},
      {"mkv",              "video/x-matroska"},
      {"mk3d",            "video/x-matroska"},
      {"mks",              "video/x-matroska"},
      {"mng",              "video/x-mng"},
      {"asf",              "video/x-ms-asf"},
      {"asx",              "video/x-ms-asf"},
      {"vob",              "video/x-ms-vob"},
      {"wm",                "video/x-ms-wm"},
      {"wmv",              "video/x-ms-wmv"},
      {"wmx",              "video/x-ms-wmx"},
      {"wvx",              "video/x-ms-wvx"},
      {"avi",              "video/x-msvideo"},
      {"movie",          "video/x-sgi-movie"},
      {"smv",              "video/x-smv"},
      {"ice",              "x-conference/x-cooltalk"}
   };
   @end

结束 类

@强制输出
类 ColorSet

	变量 b : 整数[]

	变量 wid : 整数
	变量 hei : 整数

	变量 bitmap : 位图对象=空
	变量 pixmap : Pixmap=空
	变量 texture : Texture=空



	@静态
	方法 新建(w : 整数,h : 整数) : ColorSet
		变量 rt : ColorSet
		rt.设置(w,h)
		返回 rt
	结束 方法

	@静态
	方法 从BitMap新建(bt : 位图对象) : ColorSet
		变量 rt : ColorSet
		rt.设置(bt.宽度,bt.高度)
		Bitmap_getPixels(bt,rt.b,0,bt.宽度,0,0,bt.宽度,bt.高度)
		返回 rt
	结束 方法

	方法 从BitMap更改(bt : 位图对象) : ColorSet
		设置(bt.宽度,bt.高度)
		Bitmap_getPixels(bt,b,0,bt.宽度,0,0,bt.宽度,bt.高度)
		返回 本对象
	结束 方法

	方法 设置(w : 整数,h : 整数)
		wid=w
		hei=h
		b=数组创建(整数,w*h)
	结束 方法

	方法 get(x : 整数,y : 整数) : 整数
		返回 b[y*wid+x]
	结束 方法

	方法 set(x : 整数,y : 整数,v : 整数)
		b[y*wid+x]=v
		bitmap=空
	结束 方法

	方法 geti(x : 整数,y : 整数) : 整数
		如果 0<=x&&x<wid&&0<=y&&y<hei 则
			返回 b[y*wid+x]
		否则
			返回 0
		结束 如果
	结束 方法

	方法 seti(x : 整数,y : 整数,v : 整数)
		如果 0<=x&&x<wid&&0<=y&&y<hei 则
			/*
			变量 a : 整数
			code #a=#v>>24;
			变量 r1 : 整数
			变量 g1 : 整数
			变量 b1 : 整数
			code #r1=#v<<8;
			code #r1=#r1>>24;
			code #g1=#v<<16;
			code #g1=#g1>>24;
			code #b1=#v<<24;
			code #b1=#b1>>24;
			如果 a==0xff 则
				b[y*wid+x]=v
			否则 a!=0
				变量 v2=b[y*wid+x]
				变量 r2 : 整数
				变量 g2 : 整数
				变量 b2 : 整数
				code #r2=#v2<<8;
				code #r2=#r2>>24;
				code #g2=#v2<<16;
				code #g2=#g2>>24;
				code #b2=#v2<<24;
				code #b2=#b2>>24;
				*/
			b[y*wid+x]=v
			//0xff000000+((255-a)*r2+a*r1)*0x10000/255+((255-a)*g2+a*g1)*0x100/255+((255-a)*b2+a*b1)*0x1/255
			//结束 如果

		结束 如果
	结束 方法

	方法 取bitmap() : 位图对象
		如果 bitmap!=空 则
			返回 bitmap
		否则
			变量 wt : 位图配置=位图配置.ARGB_8888
			code #bitmap=android.graphics.Bitmap.createBitmap(#b,0,#wid,#wid,#hei,#wt);
			返回 bitmap
		结束 如果
	结束 方法

	//2025.8.7
	变量 切割图 : Pixmap[]

	方法 取Pixmap(横切数 : 整数=1,纵切数 : 整数=1,计数 : 整数=0) : Pixmap
		如果 横切数==1&&纵切数==1&&计数==0 则
			如果 pixmap!=空 则
				返回 pixmap
			否则
				//变量 wt : 位图配置=位图配置.ARGB_8888
				pixmap=Pixmap.从ColorSet创建(本对象)
				//android.graphics.Bitmap.createBitmap(#b,0,#wid,#wid,#hei,#wt);
				返回 pixmap
			结束 如果
		否则
			如果 取数组长度(切割图)>计数&&切割图[计数]!=空 则
				返回 切割图[计数]
			否则
				切割图=数组创建(Pixmap,横切数*纵切数)
				变量 bit=取Pixmap()
				变量 cutp=计数
				变量 acutp=cutp%横切数
				变量 bcutp=(cutp-(cutp%横切数))/纵切数
				//日志("诀"+横切数+"  "+纵切数+"   "+计数+"   "+acutp+"   "+bcutp)
				如果 横切数!=1 则
					变量 stx=acutp*bit.width()/横切数
					变量 wih=bit.width()/横切数
					变量 het=bit.height()
					开始俘获异常()
					bit=裁剪Pixmap(bit,stx,0,wih,het)
					//code #bit=android.graphics.Bitmap.createBitmap(#bit,#stx,0,#wih,#het);
					俘获所有异常()
					//日志(lz.cutn+"   "+lz.cutp)
					结束俘获异常()
					//日志(lz.scale+"   /\\  "+lz.cutp)
				结束 如果
				如果 纵切数!=1 则
					变量 sty=bcutp*bit.height()/纵切数
					变量 wih=bit.width()
					变量 het=bit.height()/纵切数
					开始俘获异常()
					bit=裁剪Pixmap(bit,0,sty,wih,het)
					//code #bit=android.graphics.Bitmap.createBitmap(#bit,#stx,0,#wih,#het);
					俘获所有异常()
					//日志(lz.cutn+"   "+lz.cutp)
					结束俘获异常()
					//日志(lz.scale+"   /\\  "+lz.cutp)
				结束 如果
				切割图[计数]=bit
				返回 bit
			结束 如果
		结束 如果
	结束 方法

	方法 取Texture() : Texture
		如果 texture!=空 则
			返回 texture
		否则
			texture=Texture.从PixMap新建(取Pixmap())
			返回 texture
		结束 如果
	结束 方法

	方法 绘制(cs : ColorSet,x : 整数,y : 整数)
		循环(i, 0, cs.wid)
			循环(u, 0, cs.hei)
				seti(x+i,y+u,cs.geti(i,u))
			结束 循环
		结束 循环
	结束 方法

	方法 绘制图形(cs : ColorSet,x : 单精度小数,y : 单精度小数,sx : 单精度小数,sy : 单精度小数,kx : 单精度小数,ky : 单精度小数,f : 整数) : 对象
		////标准解决
		ky=ky
		变量 reak : 单精度小数=360f-kx
		变量 col : 整数=0xffffffff
		如果 reak<-360f 则
			reak=reak+720f
			col=0xff0000ff
		结束 如果
		如果 reak<0f 则
			reak=reak+360f
			col=0xffff0000
		结束 如果
		如果 reak>360f
			reak=reak-360f
			col=0xff00ffff
		结束 如果
		变量 reaw : 整数=(cs.wid*sx).到整数()
		变量 reah : 整数=(cs.hei*sy).到整数()
		循环(i, 0, reaw*2)
			循环(u, 0, reah*2)
				变量 el : 单精度小数[]
				如果 f==-1 则
					返回 空
				否则
					el=transform(x,y,x+i/2f,y+u/2f,reak)
				结束 如果

				drawi(el[0].到整数(),el[1].到整数(),cs.geti((i/2f/sx).到整数(),(u/2f/sy).到整数()))
			结束 循环
		结束 循环
		返回 空
	结束 方法

	方法 drawi(x : 整数,y : 整数,v : 整数)
		变量 color=color_to_argb(v)
		如果 color[0]==0
		否则 color[0]==255
			seti(x,y,v)
		否则
			变量 Back : 整数[]=color_to_argb(geti(x,y))
			变量 alpha=color[0]/256f
			变量 rlt : 整数[]=数组创建(整数,4)
			rlt[0]=255
			rlt[1]=((1-alpha)*Back[1] + alpha*color[1]).到整数()
			rlt[2]=((1-alpha)*Back[2] + alpha*color[2]).到整数()
			rlt[3]=((1-alpha)*Back[3] + alpha*color[3]).到整数()
			seti(x,y,color_from_argb(rlt))
		结束 如果
	结束 方法

	@静态
	方法 transform(x0 : 单精度小数,y0 : 单精度小数,x1 : 单精度小数,y1 : 单精度小数,k : 单精度小数) : 单精度小数[]

		/*
		变量 px : 单精度小数=left+wid/2
		变量 py : 单精度小数=top+hei/2
		变量 rx : 单精度小数=(py-ay)/(hei/2)*kx+ax
		变量 ry : 单精度小数=(px-ax)/(wid/2)*ky+ay
		*/
		@code
		#k=new Float(Math.toRadians(#k));
		float x2=new Float((#x1-#x0)*Math.cos(#k) +(#y1-#y0)*Math.sin(#k)+#x0);
		float y2=new Float(-(#x1-#x0)*Math.sin(#k) + (#y1-#y0)*Math.cos(#k)+#y0);
		float[] result={x2,y2};
		return result;
		@end
	结束 方法

	方法 截取(x : 整数,y : 整数,w : 整数,h : 整数) : ColorSet
		变量 b2 : ColorSet=ColorSet.新建(w,h)
		循环(i, 0, w)
			循环(u, 0, h)
				b2.seti(i,u,geti(x+i,y+u))
			结束 循环
		结束 循环
		返回 b2
	结束 方法

	方法 截取bitmap(x : 整数,y : 整数,w : 整数,h : 整数) : 位图对象
		变量 b2 : ColorSet=ColorSet.新建(w,h)
		循环(i, 0, w)
			循环(u, 0, h)
				b2.seti(i,u,geti(x+i,y+u))
			结束 循环
		结束 循环
		返回 b2.取bitmap()
	结束 方法

	方法 绘制矩形(x : 整数,y : 整数,w : 整数,h : 整数,c : 整数)
		循环(i, x, x+w)
			循环(u, y, y+h)
				seti(i,u,c)
			结束 循环
		结束 循环
	结束 方法

	方法 绘制文本(x : 整数,y : 整数,t : 文本,p : Paint)
		变量 w : 整数=p.测量文字(t).到整数()
		变量 h : 整数=p.取文字大小().到整数()
		变量 bt : 位图对象=截取bitmap(x,y,w*2,h+20)
		//位图对象.创建位图2(p.测量文字(t).到整数(),p.取文字大小(),位图配置.ARGB_8888)
		变量 canvas=Canvas.从BitMap创建(bt)
		canvas.画文字(t,0,h,p)
		绘制(ColorSet.从BitMap新建(bt),x,y)
	结束 方法

	方法 设置颜色(颜色 : 整数)
		循环(i, 0, 取数组长度(b))
			b[i]=颜色
		结束 循环
	结束 方法

结束 类

类 Huffset : 对象
	变量 obj : 对象=空
	变量 count : 整数=0
	变量 dst : Bits
结束 类

类 Bits
	变量 bl : 逻辑型集合

	方法 添加字节(byte : 字节)
		添加字节组({byte})
	结束 方法

	方法 添加字节组(bytes : 字节[])
		添加布尔组(字节集转布尔集(bytes))
	结束 方法

	方法 添加布尔(bool : 逻辑型)
		bl.添加成员(bool)
	结束 方法

	方法 添加布尔组(bools : 逻辑型[])
		bl.添加(bools)
	结束 方法

	方法 长度() : 整数
		返回 bl.长度
	结束 方法

结束 类

@强制输出
类 BoolSet

	变量 b : 逻辑型[]

	变量 wid : 整数
	变量 hei : 整数



	@静态
	方法 新建(w : 整数,h : 整数) : BoolSet
		变量 rt : BoolSet
		rt.设置(w,h)
		返回 rt
	结束 方法

	方法 设置(w : 整数,h : 整数)
		wid=w
		hei=h
		b=数组创建(逻辑型,w*h)
	结束 方法

	方法 get(x : 整数,y : 整数) : 逻辑型
		返回 b[y*wid+x]
	结束 方法

	方法 set(x : 整数,y : 整数,v : 逻辑型)
		b[y*wid+x]=v
	结束 方法

	//方法 取bitmap() : 位图对象
	//	变量 wt : 位图配置=位图配置.ARGB_8888
	//	code return android.graphics.Bitmap.createBitmap(#b,0,#wid,#wid,#hei,#wt);
	//结束 方法

	方法 设置值(颜色 : 逻辑型)
		循环(i, 0, 取数组长度(b))
			b[i]=颜色
		结束 循环
	结束 方法

结束 类