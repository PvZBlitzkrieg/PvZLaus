package rn_4581.rn_4582.rn_4583;
import android.os.*;
import android.content.*;
import android.view.KeyEvent;
import rn_4581.rn_4582.rn_4583.rn_9721;
import rn_4581.rn_4582.rn_4583.rn_5581;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_4581.rn_4582.rn_4583.rn_5594;
import rn_4581.rn_4582.rn_4583.rn_5408;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4581.rn_4582.rn_4583.rn_5637;

public class rn_9813 extends android.app.Activity {
	private rn_5637 root;
	
    @Override
    protected void onCreate(Bundle savedBundleInstance) {
		rn_9814();
		super.onCreate(savedBundleInstance);
        onInit();
        rn_9815();
    }

    public void onInit() { }
	
	protected void setLayout(rn_5637 root) {
		this.root = root;
		setContentView(root.getView());
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		rn_9816();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		rn_9817();
	}

	@Override
	protected void onStop() {
		super.onStop();
		rn_9819();
	}

	@Override
	protected void onPause() {
		super.onPause();
		rn_9818();
	}

	@Override
	protected void onResume() {
		super.onResume();
		rn_9820();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		rn_9821();
	}
	
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		rn_9822(menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(android.view.MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			rn_9826();
		} else {
			rn_9824(item);
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		rn_9827(requestCode, resultCode, data);
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		rn_9831(requestCode, permissions, grantResults);
	}
	
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	return rn_3887(keyCode) ? true : super.onKeyDown(keyCode, event);
    }

	public void rn_9814() {
	}

	public void rn_9815() {
	}

	public void rn_9816() {
	}

	public void rn_9817() {
	}

	public void rn_9818() {
	}

	public void rn_9819() {
	}

	public void rn_9820() {
	}

	public void rn_9821() {
	}

	public void rn_9822(android.view.Menu rn_9823) {
	}

	public void rn_9824(android.view.MenuItem rn_9825) {
	}

	public void rn_9826() {
	}

	public void rn_9827(int rn_9828, int rn_9829, android.content.Intent rn_9830) {
	}

	public void rn_9831(int rn_9832, String[] rn_9833, int[] rn_9834) {
	}

	public void onBackPressed() {
		super.onBackPressed();
	}

	public boolean rn_3887(int rn_9835) {
		return false;
	}
}