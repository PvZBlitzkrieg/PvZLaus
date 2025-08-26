package rn_6840.rn_6841.rn_6842;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6845;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6961;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_6949;

public class rn_3289 {
	public static boolean rn_6850(String r_obj, String rn_6851) {
		if (r_obj == null) {
            return rn_6851 == null;
        }
        return r_obj.equals(rn_6851);
	}

	public static boolean rn_6852(String r_obj, String rn_6853) {
		if (r_obj == null) {
            return rn_6853 != null;
        }
        return !r_obj.equals(rn_6853);
	}

	public static char rn_6858(String r_obj, int rn_6859) {
		return rn_6845.rn_6846(r_obj, rn_6859);
	}

	public static boolean rn_6864(String r_obj, String rn_6865) {
		return r_obj.endsWith(rn_6865);
	}

	public static String rn_6866(String r_obj, String rn_6867, String rn_6868) {
		return r_obj.replace(rn_6867,rn_6868);
	}

	public static int rn_6869(String r_obj, String rn_6870, int rn_6871) {
		if (rn_6871 < 0 || rn_6871 > r_obj.length() || "".equals(r_obj) || "".equals(rn_6870)) {
			return -1;
		}
		return r_obj.indexOf(rn_6870, rn_6871);
	}

	public static String rn_6879(String r_obj) {
		return r_obj.toUpperCase();
	}

	public static String rn_6887(String r_obj, int rn_6888, int rn_6889) {
		return r_obj.substring(rn_6888, rn_6889 + 1);
	}

	public static String[] rn_6892(String r_obj, String rn_6893) {
		return r_obj.split(rn_6893);
	}

	public static int rn_6894(String r_obj, int rn_6895) {
		return Integer.parseInt(r_obj, rn_6895);
	}

	public static float rn_6899(String r_obj) {
		return Float.parseFloat(r_obj);
	}

	public static byte[] rn_6901(String r_obj, String rn_6902) {
		try {
			return r_obj.getBytes(rn_6902);
		} catch (Exception e) {
			throw new RuntimeException("文本到字节集编码错误：" + rn_6902);
		}
	}

	public static char[] rn_6903(String r_obj) {
		return r_obj.toCharArray();
	}
}