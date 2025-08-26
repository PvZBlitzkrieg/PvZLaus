package rn_4294.rn_4295.rn_4296;
import rn_6840.rn_6841.rn_6842.rn_6961;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class rn_6264 {
	public static void rn_6269(java.io.OutputStream r_obj, byte[] rn_6270, int rn_6271, int rn_6272) {
		try {
			r_obj.write(rn_6270,rn_6271,rn_6272);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void rn_6273(java.io.OutputStream r_obj) {
		try {
			r_obj.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}