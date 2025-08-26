package rn_4581.rn_4582.rn_4583;
import android.view.ViewGroup;
import rn_4581.rn_4582.rn_4583.rn_5637;

abstract public class rn_8619 extends rn_5637 {
	public rn_8619(android.content.Context context) {
        super(context);
    }

    public abstract ViewGroup onCreateView(android.content.Context context);
    public abstract ViewGroup getView();
	
	public void addComponent(rn_5637 component) {
        getView().addView(component.getView());
	}
	
	public void addComponent(rn_5637 component, int width, int height) {
        getView().addView(component.getView(), width, height);
	}

	public void rn_8620(rn_5637 rn_8621) {
		addComponent(rn_8621);
	}
}