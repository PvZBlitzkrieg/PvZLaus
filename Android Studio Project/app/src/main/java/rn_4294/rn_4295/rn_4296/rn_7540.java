package rn_4294.rn_4295.rn_4296;
import java.util.zip.*;
import java.io.File;
import rn_4294.rn_4295.rn_4296.rn_7555;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4294.rn_4295.rn_4296.rn_6235;

public class rn_7540 {
	public static java.util.zip.ZipFile rn_7541(String rn_7542) {
		try {
			return new ZipFile(new File(rn_7542));
		} catch (java.io.IOException e) {
			throw new RuntimeException("文件读取错误：" + e.getMessage());
		}
	}

	public static java.util.zip.ZipEntry[] rn_7551(java.util.zip.ZipFile r_obj) {
		try {
			java.util.stream.Stream<? extends java.util.zip.ZipEntry> stream = r_obj.stream();
			if(stream == null) {
				return new ZipEntry[0];
			}
			return stream.toArray(new java.util.function.IntFunction<ZipEntry[]>() {
				public ZipEntry[] apply(int size) {
					return new ZipEntry[size];
				}
			});
		} catch(IllegalStateException e) {
			throw new RuntimeException("ZIP文件已关闭");
		}
	}

	public static java.io.InputStream rn_7552(java.util.zip.ZipFile r_obj, java.util.zip.ZipEntry rn_7553) {
		try {
			return r_obj.getInputStream(rn_7553);
		} catch (java.io.IOException e) {
			throw new RuntimeException("文件读取错误：" + e.getMessage());
		} catch(IllegalStateException e) {
			throw new RuntimeException("ZIP文件已关闭");
		}
	}

	public static void rn_7554(java.util.zip.ZipFile r_obj) {
		try {
			r_obj.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}