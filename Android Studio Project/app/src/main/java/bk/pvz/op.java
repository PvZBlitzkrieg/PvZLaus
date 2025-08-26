package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6961;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_6840.rn_6841.rn_6842.rn_6941;
import bk.pvz.Const;

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

	public static final int rn_1230(int rn_1231, int rn_1232) {
		rn_1231 &=~(rn_1232);
		return rn_1231;
	}

	public static final int rn_1236(int rn_1237, int rn_1238) {
		if (rn_1237 < rn_1238) {
			return rn_1237;
		} else {
			return rn_1238;
		}
	}

	public static final int rn_1239(int rn_1240, int rn_1241) {
		if (rn_1240 > rn_1241) {
			return rn_1240;
		} else {
			return rn_1241;
		}
	}

	public static final float rn_1242(double rn_1243) {
		return new Double(rn_1243).floatValue();
	}

	public static final String rn_1285(byte[] rn_1286) {
		return new String(rn_1286);
	}

	public static final int[] rn_1309(int[] rn_1310) {
		java.util.Arrays.sort(rn_1310);
		return rn_1310;
	}

	public static final byte rn_1341(boolean rn_1342) {
		if (rn_1342) {
			byte rn_1343 = 1;
			return rn_1343;
		} else {
			byte rn_1344 = 0;
			return rn_1344;
		}
	}

	public static final boolean rn_1345(byte rn_1346) {
		if (rn_1346 == 0) {
			return Const.rn_1778;
		} else {
			return Const.rn_1779;
		}
	}

	public static final byte[] rn_1351(int rn_1352) {
		return intToByte4(rn_1352);
	}

	public static final byte[] rn_1353(int rn_1354) {
		byte[] rn_1355 = new byte[0];
		rn_1355= intToByte4(rn_1354);
		byte[] rn_1356 = (byte[]) (new byte[rn_1355.length]);
		for (int rn_10508 = 0;rn_10508 < rn_1356.length;rn_10508 += 1) {
			rn_1356 [rn_10508] = rn_1355 [rn_1355.length - rn_10508 - 1];
		}
		return rn_1356;
	}

	public static final String[] rn_1381(String[][] rn_1382) {
		int rn_1383 = 0;
		for (int rn_10514 = 0;rn_10514 < rn_1382.length;rn_10514 += 1) {
			rn_1383 = rn_1383 + rn_1382 [rn_10514].length;
		}
		int rn_1384 = 0;
		int rn_1385 = 0;
		String[] rn_1386 = (String[]) (new String[rn_1383]);
		for (int rn_10515 = 0;rn_10515 < rn_1383;rn_10515 += 1) {
			if (rn_1385 >= rn_1382 [rn_1384].length) {
				rn_1385 = 0;
				rn_1384 = rn_1384 + 1;
			}
			rn_1386 [rn_10515] = rn_1382 [rn_1384] [rn_1385];
			rn_1385 = rn_1385 + 1;
		}
		return rn_1386;
	}

	public static final int[] rn_1396(int rn_1397) {
		return new int[rn_1397];
	}

	public static final boolean rn_1406(String[] rn_1407, String rn_1408) {
		for (int rn_10520 = 0;rn_10520 < rn_1407.length;rn_10520 += 1) {
			if (rn_3289.rn_6850(rn_1407 [rn_10520], rn_1408)) {
				return true;
			}
		}
		return false;
	}

	public static final boolean rn_1409(int[] rn_1410, int rn_1411) {
		for (int rn_10521 = 0;rn_10521 < rn_1410.length;rn_10521 += 1) {
			if (rn_1410 [rn_10521] == rn_1411) {
				return true;
			}
		}
		return false;
	}
}