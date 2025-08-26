package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class ints {
	public int[] rn_1412 = new int[0];

	public final int rn_1418(int rn_1419) {
		return rn_1412 [rn_1419];
	}

	public final void rn_1420(int rn_1421, int rn_1422) {
		rn_1412 [rn_1421] = rn_1422;
	}

	public final void rn_1423(int rn_1424) {
		int[] b=new int[rn_1441()+1];
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
		int[] rn_1425 = new int[0];
		rn_1425=b;
		for (int rn_10522 = 0;rn_10522 < rn_1441();rn_10522 += 1) {
			rn_1425 [rn_10522] = rn_1412 [rn_10522];
		}
		rn_1425 [rn_1441()] = rn_1424;
		rn_1412 = rn_1425;
	}

	public final int rn_1441() {
		return rn_1412.length;
	}

	public final int[] rn_1442() {
		return rn_1412;
	}

	public final int rn_1225() {
		return rn_1412.length;
	}
}