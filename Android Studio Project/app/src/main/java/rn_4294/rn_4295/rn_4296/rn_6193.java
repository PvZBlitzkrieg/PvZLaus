package rn_4294.rn_4295.rn_4296;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;

public class rn_6193 {
	public static String rn_6204(java.io.File r_obj) {
		return r_obj.getName();
	}

	public static java.io.File rn_6206(java.io.File r_obj) {
		return r_obj.getParentFile();
	}

	public static boolean rn_6211(java.io.File r_obj) {
		try {
			return r_obj.createNewFile();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean rn_6212(java.io.File r_obj) {
		return r_obj.mkdirs();
	}

	public static boolean rn_6226(java.io.File r_obj) {
		return r_obj.exists();
	}
}