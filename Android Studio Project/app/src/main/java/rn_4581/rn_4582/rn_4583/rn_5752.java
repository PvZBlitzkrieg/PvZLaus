package rn_4581.rn_4582.rn_4583;
import android.graphics.Typeface;
import android.text.Html;
import android.text.TextUtils;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4581.rn_4582.rn_4583.rn_5637;

public class rn_5752 extends rn_5637 {
	private android.text.TextWatcher watcher;
	//已解析的字体不会被回收，所以直接复用，而不是重新解析(重复占用内存)
	private static java.util.HashMap<String, Typeface> fonts = new java.util.HashMap<>(); 
    
	public rn_5752(android.content.Context context) {
        super(context);
    }

    @Override
    public android.widget.TextView onCreateView(android.content.Context context) {
        android.widget.TextView view = new android.widget.TextView(context);
        return view;
    }

    @Override
    public android.widget.TextView getView() {
        return (android.widget.TextView) view;
    }

	public final void rn_4(String rn_5756) {
		getView().setText(rn_5756);
	}

	public final String rn_4() {
		return getView().getText().toString();
	}
}