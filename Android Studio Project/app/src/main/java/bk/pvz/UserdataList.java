package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Userdata;

public class UserdataList {
	public static Userdata rn_2990(java.util.ArrayList<Userdata> r_obj, int rn_2991) {
		return UserdataList.rn_3006(r_obj, rn_2991);
	}

	public static void rn_2998(java.util.ArrayList<Userdata> r_obj, Userdata rn_2999) {
		r_obj.add(rn_2999);
	}

	public static Userdata rn_3006(java.util.ArrayList<Userdata> r_obj, int rn_3007) {
		return r_obj.get(rn_3007);
	}

	public static void rn_3012(java.util.ArrayList<Userdata> r_obj) {
		r_obj.clear();
	}

	public static int rn_1225(java.util.ArrayList<Userdata> r_obj) {
		return r_obj.size();
	}
}