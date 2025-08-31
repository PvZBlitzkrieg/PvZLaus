package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class Boolarray {
	public boolean[] rn_992 = new boolean[0];

	public static final Boolarray rn_993() {
		boolean[] rn_994 = new boolean[0];
		rn_994=new boolean[0];
		Boolarray rn_995 = new Boolarray();
		rn_995.rn_992 = rn_994;
		return rn_995;
	}

	public final boolean rn_996(int rn_997) {
		return rn_992 [rn_997];
	}

	public final void rn_1001(boolean rn_1002) {
		boolean[] b=new boolean[rn_1019()+1];
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
		boolean[] rn_1003 = new boolean[0];
		rn_1003=b;
		for (int rn_10322 = 0;rn_10322 < rn_1019();rn_10322 += 1) {
			rn_1003 [rn_10322] = rn_992 [rn_10322];
		}
		rn_1003 [rn_1019()] = rn_1002;
		rn_992 = rn_1003;
	}

	public final int rn_1019() {
		return rn_992.length;
	}

	public final boolean[] rn_1020() {
		return rn_992;
	}
}