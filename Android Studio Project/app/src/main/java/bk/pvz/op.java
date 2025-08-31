package bk.pvz;
import bk.pvz.Zombie;
import bk.pvz.POSLIST;
import bk.pvz.Anim;
import bk.pvz.Plant;
import rn_6672.rn_6673.rn_6674.rn_4133;
import bk.pvz.PlantList;
import bk.pvz.Const;
import bk.pvz.POS;
import bk.pvz.Rectx;
import bk.pvz.MowerList;
import rn_4126.rn_4127.rn_4128.rn_8082;
import rn_4126.rn_4127.rn_4128.rn_4198;
import rn_4126.rn_4127.rn_4128.rn_8150;
import bk.pvz.Boolarray;
import bk.pvz.CartSet;
import bk.pvz.ope;
import bk.pvz.Mower;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4126.rn_4127.rn_4128.rn_8084;
import bk.pvz.Nirvana;
import rn_4413.rn_4414.rn_4415.rn_4577;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import bk.pvz.Animed;
import bk.pvz.ZombieList;
import bk.pvz.ints;
import rn_6672.rn_6673.rn_6674.rn_6793;
import bk.pvz.ProxyAnim;
import rn_6672.rn_6673.rn_6674.rn_6773;

public class op {
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

	public static final int rn_1026(int rn_1027, int rn_1028) {
		rn_1027 &=~(rn_1028);
		return rn_1027;
	}

	public static final int rn_1032(int rn_1033, int rn_1034) {
		if (rn_1033 < rn_1034) {
			return rn_1033;
		} else {
			return rn_1034;
		}
	}

	public static final int rn_1035(int rn_1036, int rn_1037) {
		if (rn_1036 > rn_1037) {
			return rn_1036;
		} else {
			return rn_1037;
		}
	}

	public static final float rn_1038(double rn_1039) {
		return new Double(rn_1039).floatValue();
	}

	public static final String rn_1081(byte[] rn_1082) {
		return new String(rn_1082);
	}

	public static final int[] rn_1105(int[] rn_1106) {
		java.util.Arrays.sort(rn_1106);
		return rn_1106;
	}

	public static final byte rn_1137(boolean rn_1138) {
		if (rn_1138) {
			byte rn_1139 = 1;
			return rn_1139;
		} else {
			byte rn_1140 = 0;
			return rn_1140;
		}
	}

	public static final boolean rn_1141(byte rn_1142) {
		if (rn_1142 == 0) {
			return Const.rn_1641;
		} else {
			return Const.rn_1642;
		}
	}

	public static final byte[] rn_1147(int rn_1148) {
		return intToByte4(rn_1148);
	}

	public static final byte[] rn_1149(int rn_1150) {
		byte[] rn_1151 = new byte[0];
		rn_1151= intToByte4(rn_1150);
		byte[] rn_1152 = (byte[]) (new byte[rn_1151.length]);
		for (int rn_10341 = 0;rn_10341 < rn_1152.length;rn_10341 += 1) {
			rn_1152 [rn_10341] = rn_1151 [rn_1151.length - rn_10341 - 1];
		}
		return rn_1152;
	}

	public static final String[] rn_1177(String[][] rn_1178) {
		int rn_1179 = 0;
		for (int rn_10347 = 0;rn_10347 < rn_1178.length;rn_10347 += 1) {
			rn_1179 = rn_1179 + rn_1178 [rn_10347].length;
		}
		int rn_1180 = 0;
		int rn_1181 = 0;
		String[] rn_1182 = (String[]) (new String[rn_1179]);
		for (int rn_10348 = 0;rn_10348 < rn_1179;rn_10348 += 1) {
			if (rn_1181 >= rn_1178 [rn_1180].length) {
				rn_1181 = 0;
				rn_1180 = rn_1180 + 1;
			}
			rn_1182 [rn_10348] = rn_1178 [rn_1180] [rn_1181];
			rn_1181 = rn_1181 + 1;
		}
		return rn_1182;
	}

	public static final org.json.JSONObject rn_1191(int[] rn_1192) {
		org.json.JSONObject rn_1193 = new org.json.JSONObject();
		for (int rn_10351 = 0;rn_10351 < rn_1192.length;rn_10351 += 1) {
			rn_4577.rn_4607(rn_1193, "i" + rn_6760.rn_6765(rn_10351), rn_6760.rn_6765(rn_1192 [rn_10351]));
		}
		return rn_1193;
	}

	public static final void rn_1194(Object rn_1195, org.json.JSONObject rn_1196, Nirvana rn_1197) {
		java.lang.Class rn_1198 = rn_4133.rn_6676(rn_1195);
		for (int rn_10352 = 0;rn_10352 < rn_4577.rn_4619(rn_1196).length;rn_10352 += 1) {
			String rn_1199 = rn_8084.rn_8094(rn_8150.rn_8161(rn_8084.rn_8127(rn_1198, (rn_4577.rn_4619(rn_1196)) [rn_10352])));
			String rn_1200 = (rn_4577.rn_4619(rn_1196)) [rn_10352];
			java.lang.reflect.Field rn_1201 = rn_8084.rn_8127(rn_1198, (rn_4577.rn_4619(rn_1196)) [rn_10352]);
			if (rn_3081.rn_6682(rn_1199, "int")) {
				rn_8150.rn_8193(rn_1201, rn_1195, rn_3081.rn_6726(rn_4577.rn_4593(rn_1196, rn_1200), 10));
			} else if (rn_3081.rn_6682(rn_1199, "float")) {
				rn_8150.rn_8199(rn_1201, rn_1195, rn_3081.rn_6731(rn_4577.rn_4593(rn_1196, rn_1200)));
			} else if (rn_3081.rn_6682(rn_1199, "boolean")) {
				rn_8150.rn_8184(rn_1201, rn_1195, rn_3081.rn_6732(rn_4577.rn_4593(rn_1196, rn_1200)));
			} else if (rn_3081.rn_6682(rn_1199, "java.lang.String")) {
				rn_8150.rn_8181(rn_1201, rn_1195, rn_4577.rn_4593(rn_1196, rn_1200));
			} else if (rn_3081.rn_6682(rn_1199, "bk.pvz.Anim")) {
				org.json.JSONObject rn_1202 = rn_4577.rn_4587(rn_1196, rn_1200);
				Anim rn_1203 = Anim.rn_3389(rn_4577.rn_4614(rn_1202, 0), rn_1197);
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1203);
			} else if (rn_3081.rn_6682(rn_1199, "bk.pvz.ints")) {
				org.json.JSONObject rn_1204 = rn_4577.rn_4587(rn_1196, (rn_4577.rn_4619(rn_1196)) [rn_10352]);
				ints rn_1205 = ints.rn_1278(op.rn_1240(rn_1204));
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1205);
			} else if (rn_3081.rn_6682(rn_1199, "bk.pvz.Boolarray")) {
				org.json.JSONObject rn_1206 = rn_4577.rn_4587(rn_1196, (rn_4577.rn_4619(rn_1196)) [rn_10352]);
				Boolarray rn_1207 = Boolarray.rn_993();
				rn_1207.rn_992 = (op.rn_1243(rn_1206));
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1207);
			} else if (rn_3081.rn_6682(rn_1199, "bk.pvz.Rectx")) {
				org.json.JSONObject rn_1208 = rn_4577.rn_4587(rn_1196, rn_1200);
				Rectx rn_1209 = Rectx.FromJSON(rn_4577.rn_4614(rn_1208, 0), rn_1197);
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1209);
			} else if (rn_3081.rn_6682(rn_1199, "bk.pvz.Anim")) {
				org.json.JSONObject rn_1210 = rn_4577.rn_4587(rn_1196, rn_1200);
				Anim rn_1211 = Anim.rn_3389(rn_4577.rn_4614(rn_1210, 0), rn_1197);
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1211);
			} else if (rn_3081.rn_6682(rn_1199, "[Lbk.pvz.Anim;")) {
				org.json.JSONObject rn_1212 = rn_4577.rn_4587(rn_1196, rn_1200);
				Anim[] rn_1213 = (Anim[]) (new Anim[rn_4577.rn_4619(rn_1212).length]);
				for (int rn_10353 = 0;rn_10353 < rn_4577.rn_4619(rn_1212).length;rn_10353 += 1) {
					Anim rn_1214 = Anim.rn_3389(rn_4577.rn_4614(rn_4577.rn_4587(rn_1212, (rn_4577.rn_4619(rn_1212)) [rn_10353]), 0), rn_1197);
					rn_1213 [rn_10353] = (rn_1214);
				}
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1213);
			} else if (rn_3081.rn_6682((rn_4577.rn_4619(rn_1196)) [rn_10352], "zombieList")) {
				org.json.JSONObject rn_1215 = rn_4577.rn_4587(rn_1196, rn_1200);
				java.util.ArrayList<Zombie> rn_1216 = new java.util.ArrayList<Zombie>();
				for (int rn_10354 = 0;rn_10354 < rn_4577.rn_4619(rn_1215).length;rn_10354 += 1) {
					Zombie rn_1217 = Zombie.FromJSON(rn_4577.rn_4614(rn_4577.rn_4587(rn_1215, (rn_4577.rn_4619(rn_1215)) [rn_10354]), 0), rn_1197);
					ZombieList.rn_2157(rn_1216, rn_1217);
				}
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1216);
			} else if (rn_3081.rn_6682((rn_4577.rn_4619(rn_1196)) [rn_10352], "panim")) {
				org.json.JSONObject rn_1218 = rn_4577.rn_4587(rn_1196, rn_1200);
				java.util.ArrayList<Anim> rn_1219 = new java.util.ArrayList<Anim>();
				for (int rn_10355 = 0;rn_10355 < rn_4577.rn_4619(rn_1218).length;rn_10355 += 1) {
					Anim rn_1220 = Anim.rn_3389(rn_4577.rn_4614(rn_4577.rn_4587(rn_1218, (rn_4577.rn_4619(rn_1218)) [rn_10355]), 0), rn_1197);
					Animed.rn_3177(rn_1219, rn_1220);
				}
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1219);
			} else if (rn_3081.rn_6682((rn_4577.rn_4619(rn_1196)) [rn_10352], "plantList")) {
				org.json.JSONObject rn_1221 = rn_4577.rn_4587(rn_1196, rn_1200);
				java.util.ArrayList<Plant> rn_1222 = new java.util.ArrayList<Plant>();
				for (int rn_10356 = 0;rn_10356 < rn_4577.rn_4619(rn_1221).length;rn_10356 += 1) {
					Plant rn_1223 = Plant.FromJSON(rn_4577.rn_4614(rn_4577.rn_4587(rn_1221, (rn_4577.rn_4619(rn_1221)) [rn_10356]), 0), rn_1197);
					PlantList.rn_2189(rn_1222, rn_1223);
				}
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1222);
			} else if (rn_3081.rn_6682((rn_4577.rn_4619(rn_1196)) [rn_10352], "mowerList")) {
				org.json.JSONObject rn_1224 = rn_4577.rn_4587(rn_1196, rn_1200);
				CartSet rn_1225 = CartSet.FromJSON(rn_4577.rn_4614(rn_1224, 0), rn_1197);
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1225);
			} else if (rn_3081.rn_6682(rn_1199, "bk.pvz.Mower")) {
				org.json.JSONObject rn_1226 = rn_4577.rn_4587(rn_1196, rn_1200);
				Mower rn_1227 = Mower.FromJSON(rn_4577.rn_4614(rn_1226, 0), rn_1197);
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1227);
			} else if (rn_3081.rn_6682(rn_1199, "bk.pvz.ProxyAnim")) {
				org.json.JSONObject rn_1228 = rn_4577.rn_4587(rn_1196, rn_1200);
				ProxyAnim rn_1229 = ProxyAnim.FromJSON(rn_4577.rn_4614(rn_1228, 0), rn_1197);
				rn_8150.rn_8181(rn_1201, rn_1195, rn_1229);
			} else if (rn_3081.rn_6682(rn_1199, "[I")) {
				org.json.JSONObject rn_1230 = rn_4577.rn_4587(rn_1196, rn_1200);
				rn_8150.rn_8181(rn_1201, rn_1195, op.rn_1240(rn_1230));
			} else if (rn_3081.rn_6682(rn_1199, "java.util.ArrayList")) {
				String rn_1231 = rn_8082.rn_8083(rn_8150.rn_8162(rn_1201));
				org.json.JSONObject rn_1232 = rn_4577.rn_4587(rn_1196, rn_1200);
				if (rn_3081.rn_6682(rn_1231, "java.util.ArrayList<bk.pvz.Anim>")) {
				} else if (rn_3081.rn_6682(rn_1231, "java.util.ArrayList<bk.pvz.POS>")) {
					java.util.ArrayList<POS> rn_1233 = new java.util.ArrayList<POS>();
					for (int rn_10357 = 0;rn_10357 < rn_4577.rn_4619(rn_1232).length;rn_10357 += 1) {
						POSLIST.rn_2916(rn_1233, POS.FromJSON(rn_4577.rn_4614(rn_4577.rn_4587(rn_1232, (rn_4577.rn_4619(rn_1232)) [rn_10357]), 0), rn_1197));
					}
					rn_8150.rn_8181(rn_1201, rn_1195, rn_1233);
				} else if (rn_3081.rn_6682(rn_1231, "java.util.ArrayList<java.lang.String>")) {
					java.util.ArrayList<String> rn_1234 = new java.util.ArrayList<String>();
					for (int rn_10358 = 0;rn_10358 < rn_4577.rn_4619(rn_1232).length;rn_10358 += 1) {
						rn_4198.rn_4209(rn_1234, rn_4577.rn_4593(rn_1232, (rn_4577.rn_4619(rn_1232)) [rn_10358]));
					}
					rn_8150.rn_8181(rn_1201, rn_1195, rn_1234);
				} else if (rn_3081.rn_6682(rn_1231, "java.util.ArrayList<bk.pvz.Mower>")) {
					java.util.ArrayList<Mower> rn_1235 = new java.util.ArrayList<Mower>();
					for (int rn_10359 = 0;rn_10359 < rn_4577.rn_4619(rn_1232).length;rn_10359 += 1) {
						Mower rn_1236 = Mower.FromJSON(rn_4577.rn_4614(rn_4577.rn_4587(rn_1232, (rn_4577.rn_4619(rn_1232)) [rn_10359]), 0), rn_1197);
						MowerList.rn_2370(rn_1235, rn_1236);
					}
					rn_8150.rn_8181(rn_1201, rn_1195, rn_1235);
				}
			} else {
				ope.rn_1798(rn_1199);
			}
		}
	}

	public static final org.json.JSONObject rn_1237(boolean[] rn_1238) {
		org.json.JSONObject rn_1239 = new org.json.JSONObject();
		for (int rn_10360 = 0;rn_10360 < rn_1238.length;rn_10360 += 1) {
			rn_4577.rn_4607(rn_1239, "i" + rn_6760.rn_6765(rn_10360), rn_6757.rn_6758(rn_1238 [rn_10360]));
		}
		return rn_1239;
	}

	public static final int[] rn_1240(org.json.JSONObject rn_1241) {
		int[] rn_1242 = (int[]) (new int[rn_4577.rn_4619(rn_1241).length]);
		for (int rn_10361 = 0;rn_10361 < rn_1242.length;rn_10361 += 1) {
			rn_1242 [rn_10361] = rn_3081.rn_6726(rn_4577.rn_4593(rn_1241, (rn_4577.rn_4619(rn_1241)) [rn_10361]), 10);
		}
		return rn_1242;
	}

	public static final boolean[] rn_1243(org.json.JSONObject rn_1244) {
		boolean[] rn_1245 = (boolean[]) (new boolean[rn_4577.rn_4619(rn_1244).length]);
		for (int rn_10362 = 0;rn_10362 < rn_1245.length;rn_10362 += 1) {
			rn_1245 [rn_10362] = rn_3081.rn_6732(rn_4577.rn_4593(rn_1244, (rn_4577.rn_4619(rn_1244)) [rn_10362]));
		}
		return rn_1245;
	}

	public static final org.json.JSONObject rn_1246(float[] rn_1247) {
		org.json.JSONObject rn_1248 = new org.json.JSONObject();
		for (int rn_10363 = 0;rn_10363 < rn_1247.length;rn_10363 += 1) {
			rn_4577.rn_4607(rn_1248, "i" + rn_6760.rn_6765(rn_10363), rn_6777.rn_6779(rn_1247 [rn_10363]));
		}
		return rn_1248;
	}

	public static final int[] rn_1258(int rn_1259) {
		return new int[rn_1259];
	}

	public static final boolean rn_1268(String[] rn_1269, String rn_1270) {
		for (int rn_10368 = 0;rn_10368 < rn_1269.length;rn_10368 += 1) {
			if (rn_3081.rn_6682(rn_1269 [rn_10368], rn_1270)) {
				return true;
			}
		}
		return false;
	}

	public static final boolean rn_1271(int[] rn_1272, int rn_1273) {
		for (int rn_10369 = 0;rn_10369 < rn_1272.length;rn_10369 += 1) {
			if (rn_1272 [rn_10369] == rn_1273) {
				return true;
			}
		}
		return false;
	}
}