package rn_4581.rn_4582.rn_4583;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import rn_4581.rn_4582.rn_4583.rn_7111;
import rn_4581.rn_4582.rn_4583.rn_8619;
import rn_4581.rn_4582.rn_4583.rn_5637;
import rn_6840.rn_6841.rn_6842.rn_6941;

public class rn_8666 extends rn_8619 {
	public rn_8666(android.content.Context context) {
        super(context);
    }

    @Override
    public AbsoluteLayout onCreateView(android.content.Context context) {
        AbsoluteLayout view = new AbsoluteLayout(context);
        return view;
    }

    @Override
    public AbsoluteLayout getView() {
        return (AbsoluteLayout) view;
    }

	public final void rn_8673(rn_5637 rn_8674, double rn_8675) {
		android.view.View v = rn_8674.getView();
		android.widget.AbsoluteLayout.LayoutParams params 
			= (android.widget.AbsoluteLayout.LayoutParams) v.getLayoutParams();
		params.x = (int) (rn_7111.rn_7112(context) * rn_8675);
		v.setLayoutParams(params);
	}

	public final void rn_8676(rn_5637 rn_8677, double rn_8678) {
		android.view.View v = rn_8677.getView();
		android.widget.AbsoluteLayout.LayoutParams params 
			= (android.widget.AbsoluteLayout.LayoutParams) v.getLayoutParams();
		params.y = (int) (rn_7111.rn_7118(context) * rn_8678);
		v.setLayoutParams(params);
	}
}