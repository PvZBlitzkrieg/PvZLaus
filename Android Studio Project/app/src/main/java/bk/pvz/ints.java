package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class ints {
	public int[] rn_1274 = new int[0];

	public static final ints rn_1278(int[] rn_1279) {
		ints rn_1280 = new ints();
		rn_1280.rn_1274 = rn_1279;
		return rn_1280;
	}

	public final int rn_1281(int rn_1282) {
		return rn_1274 [rn_1282];
	}

	public final void rn_1283(int rn_1284, int rn_1285) {
		rn_1274 [rn_1284] = rn_1285;
	}

	public final void rn_1286(int rn_1287) {
		int[] b=new int[rn_1304()+1];
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
		int[] rn_1288 = new int[0];
		rn_1288=b;
		for (int rn_10370 = 0;rn_10370 < rn_1304();rn_10370 += 1) {
			rn_1288 [rn_10370] = rn_1274 [rn_10370];
		}
		rn_1288 [rn_1304()] = rn_1287;
		rn_1274 = rn_1288;
	}

	public final int rn_1304() {
		return rn_1274.length;
	}

	public final int[] rn_1305() {
		return rn_1274;
	}

	public final int rn_1021() {
		return rn_1274.length;
	}
}