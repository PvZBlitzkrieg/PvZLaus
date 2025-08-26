package rn_4294.rn_4295.rn_4296;
import java.io.*;
import rn_4294.rn_4295.rn_4296.rn_7540;
import rn_6840.rn_6841.rn_6842.rn_6845;
import rn_4294.rn_4295.rn_4296.rn_6193;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6961;
import rn_4294.rn_4295.rn_4296.rn_6264;
import rn_4294.rn_4295.rn_4296.rn_7555;
import rn_4294.rn_4295.rn_4296.rn_6288;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4294.rn_4295.rn_4296.rn_6235;

public class rn_7697 {
	public static final void rn_7718(String rn_7719, String rn_7720) {
		java.util.zip.ZipFile rn_7721 = rn_7540.rn_7541(rn_7719);
		java.io.File rn_7722 = new java.io.File(rn_7720);
		rn_6193.rn_6212(rn_7722);
		java.util.zip.ZipEntry[] rn_7723 = rn_7540.rn_7551(rn_7721);
		int rn_7724 = 0;
		for (rn_7724 = 0;rn_7724 < rn_7723.length;rn_7724 += 1) {
			java.util.zip.ZipEntry rn_7725 = rn_7723 [rn_7724];
			String rn_7726 = rn_7555.rn_7560(rn_7725);
			if (rn_7555.rn_7576(rn_7725)) {
				rn_7726 = rn_3289.rn_6887(rn_7726, 0, rn_6845.rn_1225(rn_7726) - 2);
				java.io.File rn_7727 = new java.io.File(rn_7720, rn_7726);
				rn_6193.rn_6212(rn_7727);
			} else {
				int rn_7728 = rn_3289.rn_6869(rn_7726, "/", 0);
				if (rn_7728 != -1) {
					java.io.File rn_7729 = new java.io.File(rn_7720, rn_3289.rn_6887(rn_7726, 0, rn_7728 - 1));
					rn_6193.rn_6212(rn_7729);
				}
				java.io.InputStream rn_7730 = rn_7540.rn_7552(rn_7721, rn_7725);
				java.io.File rn_7731 = new java.io.File(rn_7720, rn_7726);
				java.io.FileOutputStream rn_7732 = rn_7697.rn_7746(rn_7731);
				byte[] rn_7733 = new byte[1024];
				int rn_7734 = 0;
				rn_7734 = rn_6235.rn_6237(rn_7730, rn_7733);
				while (rn_7734 != -1) {
					rn_6264.rn_6269(rn_7732, rn_7733, 0, rn_7734);
					rn_7734 = rn_6235.rn_6237(rn_7730, rn_7733);
				}
				rn_6264.rn_6273(rn_7732);
			}
		}
		rn_7540.rn_7554(rn_7721);
	}

	private static final java.io.FileOutputStream rn_7746(java.io.File rn_7747) {
		try {
			return new java.io.FileOutputStream(rn_7747);
		} catch (Exception e) {
			throw new RuntimeException("创建文件输出流失败：" + e.getMessage());
		}
	}
}