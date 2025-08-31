package bk.pvz;
import bk.pvz.UserdataList;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Userdata;

public class Userdatas {
	public int accountNumber = 0;
	public int currentAccount = -1;
	public java.util.ArrayList<Userdata> account = new java.util.ArrayList<Userdata>();

	public final Userdata getCurrentAccount() {
		return UserdataList.rn_2769(account, currentAccount);
	}
}