package bk.pvz;
import android.os.*;
import android.content.*;
import android.view.KeyEvent;
import android.os.Bundle;
import rn_4581.rn_4582.rn_4583.rn_5581;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_4581.rn_4582.rn_4583.rn_5594;
import bk.pvz.AAC;
import rn_4581.rn_4582.rn_4583.rn_5408;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4581.rn_4582.rn_4583.rn_5637;
import bk.pvz.AndroidApplication_;
import bk.pvz.AA;

public class Setup extends com.badlogic.gdx.backends.android.AndroidApplication {
	private rn_5637 root;
	
    @Override
    protected void onCreate(Bundle savedBundleInstance) {
		rn_3866();
		super.onCreate(savedBundleInstance);
        onInit();
        rn_3867();
    }

    
	
	protected void setLayout(rn_5637 root) {
		this.root = root;
		setContentView(root.getView());
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		rn_3868();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		rn_3869();
	}

	@Override
	protected void onStop() {
		super.onStop();
		rn_3871();
	}

	@Override
	protected void onPause() {
		super.onPause();
		rn_3870();
	}

	@Override
	protected void onResume() {
		super.onResume();
		rn_3872();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		rn_3873();
	}
	
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		rn_3874(menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(android.view.MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			rn_3878();
		} else {
			rn_3876(item);
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		rn_3879(requestCode, resultCode, data);
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		rn_3883(requestCode, permissions, grantResults);
	}
	
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	return rn_3887(keyCode) ? true : super.onKeyDown(keyCode, event);
    }

	public void onInit() {
	}

	public void rn_3866() {
	}

	public void rn_3867() {
	}

	public void rn_3868() {
	}

	public void rn_3869() {
	}

	public void rn_3870() {
	}

	public void rn_3871() {
	}

	public void rn_3872() {
	}

	public void rn_3873() {
	}

	public void rn_3874(android.view.Menu rn_3875) {
	}

	public void rn_3876(android.view.MenuItem rn_3877) {
	}

	public void rn_3878() {
	}

	public void rn_3879(int rn_3880, int rn_3881, android.content.Intent rn_3882) {
	}

	public void rn_3883(int rn_3884, String[] rn_3885, int[] rn_3886) {
	}

	public void onBackPressed() {
		super.onBackPressed();
	}

	public boolean rn_3887(int rn_3888) {
		return false;
	}

	public final void rn_3894(AA rn_3895, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration rn_3896) {
		initialize(rn_3895,rn_3896);
	}
}