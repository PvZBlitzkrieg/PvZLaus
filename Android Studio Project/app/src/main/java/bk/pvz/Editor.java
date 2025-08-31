package bk.pvz;
import android.content.*;
import android.content.res.*;
import android.view.*;
import android.widget.*;
import rn_4413.rn_4414.rn_4415.rn_5469;
import bk.pvz.CodeEditorc;
import rn_6672.rn_6673.rn_6674.rn_3081;

public class Editor extends rn_5469 {
	public Editor(android.content.Context context) {
		super(context);
		rn_1=(CodeEditorc) this.view;
    }

    @Override
    public CodeEditorc onCreateView(android.content.Context context) {
        CodeEditorc view = new CodeEditorc(context);
		//android.graphics.Typeface tp=android.graphics.Typeface.createFromFile("/storage/emulated/0/bk/file/ttf/京華老宋体2.002.ttf");
		//view.setTypefaceText(tp);
		return view;
    }
	
	@Override
    public CodeEditorc getView() {
        return (CodeEditorc) view;
    }

	public CodeEditorc rn_1 = null;

	public final void rn_4(String rn_5) {
		String rn_6 = "";
		rn_6=this.getView().getText().toString();
		if (rn_3081.rn_6684(rn_5, rn_6)) {
			CharSequence cs=rn_5;
			this.getView().setText(cs);
		}
	}

	public final String rn_4() {
		return this.getView().getText().toString();
	}
}