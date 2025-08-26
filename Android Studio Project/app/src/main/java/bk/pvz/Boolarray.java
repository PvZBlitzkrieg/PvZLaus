package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class Boolarray {
	public boolean[] rn_1194 = new boolean[0];

	public final boolean rn_1200(int rn_1201) {
		return rn_1194 [rn_1201];
	}

	public final void rn_1205(boolean rn_1206) {
		boolean[] b=new boolean[rn_1223()+1];
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
		boolean[] rn_1207 = new boolean[0];
		rn_1207=b;
		for (int rn_10489 = 0;rn_10489 < rn_1223();rn_10489 += 1) {
			rn_1207 [rn_10489] = rn_1194 [rn_10489];
		}
		rn_1207 [rn_1223()] = rn_1206;
		rn_1194 = rn_1207;
	}

	public final int rn_1223() {
		return rn_1194.length;
	}
}