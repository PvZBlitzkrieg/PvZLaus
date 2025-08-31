package bk.pvz;
import android.os.*;
import android.content.*;
import android.view.KeyEvent;
import android.os.Bundle;
import bk.pvz.AA;
import bk.pvz.AndroidApplication_;
import rn_4413.rn_4414.rn_4415.rn_5469;
import bk.pvz.AAC;
import rn_4413.rn_4414.rn_4415.rn_5413;
import rn_4413.rn_4414.rn_4415.rn_5426;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_4413.rn_4414.rn_4415.rn_5240;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class Setup extends com.badlogic.gdx.backends.android.AndroidApplication {
	private rn_5469 root;
	
    @Override
    protected void onCreate(Bundle savedBundleInstance) {
		rn_3698();
		super.onCreate(savedBundleInstance);
        onInit();
        rn_3699();
    }

    
	
	protected void setLayout(rn_5469 root) {
		this.root = root;
		setContentView(root.getView());
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		rn_3700();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		rn_3701();
	}

	@Override
	protected void onStop() {
		super.onStop();
		rn_3703();
	}

	@Override
	protected void onPause() {
		super.onPause();
		rn_3702();
	}

	@Override
	protected void onResume() {
		super.onResume();
		rn_3704();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		rn_3705();
	}
	
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		rn_3706(menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(android.view.MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			rn_3710();
		} else {
			rn_3708(item);
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		rn_3711(requestCode, resultCode, data);
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		rn_3715(requestCode, permissions, grantResults);
	}
	
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	return rn_3719(keyCode) ? true : super.onKeyDown(keyCode, event);
    }

	public void onInit() {
	}

	public void rn_3698() {
	}

	public void rn_3699() {
	}

	public void rn_3700() {
	}

	public void rn_3701() {
	}

	public void rn_3702() {
	}

	public void rn_3703() {
	}

	public void rn_3704() {
	}

	public void rn_3705() {
	}

	public void rn_3706(android.view.Menu rn_3707) {
	}

	public void rn_3708(android.view.MenuItem rn_3709) {
	}

	public void rn_3710() {
	}

	public void rn_3711(int rn_3712, int rn_3713, android.content.Intent rn_3714) {
	}

	public void rn_3715(int rn_3716, String[] rn_3717, int[] rn_3718) {
	}

	public void onBackPressed() {
		super.onBackPressed();
	}

	public boolean rn_3719(int rn_3720) {
		return false;
	}

	public final void rn_3726(AA rn_3727, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration rn_3728) {
		initialize(rn_3727,rn_3728);
	}
}