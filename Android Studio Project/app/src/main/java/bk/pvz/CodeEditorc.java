package bk.pvz;
import io.github.rosemoe.sora.widget.CodeEditor;
import android.view.KeyEvent;
import io.github.rosemoe.sora.text.Content;
import rn_4413.rn_4414.rn_4415.rn_8701;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class CodeEditorc extends CodeEditor {
	public CodeEditorc(android.content.Context context) {
        super(context);
    }
	
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean b= rn_301(keyCode,event);
		if (b==false) {
			return keyEventHandler.onKeyDown(keyCode, event);
		}
		return b;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        boolean b= rn_298(keyCode, event);
		if (b==false) {
			return keyEventHandler.onKeyUp(keyCode, event);
		}
		return b;
    }
	
	    @Override
    public void afterInsert(Content content, int startLine, int startColumn, int endLine,int endColumn, CharSequence insertedContent) {
		super.afterInsert(content,startLine,startColumn,endLine,endColumn,insertedContent);
		rn_304(startLine,startColumn,endLine,endColumn,insertedContent.toString());
	}

	public interface rn_298_r {
		boolean dispatch(int rn_299, android.view.KeyEvent rn_300);
	}
	private rn_298_r rn_298_v;
	public final void rn_298_s(rn_298_r receiver) {
		this.rn_298_v = receiver;
	}
	public final boolean rn_298(int rn_299, android.view.KeyEvent rn_300) {
		if (this.rn_298_v != null) {
			return this.rn_298_v.dispatch(rn_299, rn_300);
		}
		return false;
	}

	public interface rn_301_r {
		boolean dispatch(int rn_302, android.view.KeyEvent rn_303);
	}
	private rn_301_r rn_301_v;
	public final void rn_301_s(rn_301_r receiver) {
		this.rn_301_v = receiver;
	}
	public final boolean rn_301(int rn_302, android.view.KeyEvent rn_303) {
		if (this.rn_301_v != null) {
			return this.rn_301_v.dispatch(rn_302, rn_303);
		}
		return false;
	}

	public interface rn_304_r {
		void dispatch(int rn_305, int rn_306, int rn_307, int rn_308, String rn_309);
	}
	private rn_304_r rn_304_v;
	public final void rn_304_s(rn_304_r receiver) {
		this.rn_304_v = receiver;
	}
	public final void rn_304(int rn_305, int rn_306, int rn_307, int rn_308, String rn_309) {
		if (this.rn_304_v != null) {
			this.rn_304_v.dispatch(rn_305, rn_306, rn_307, rn_308, rn_309);
		}
	}
}