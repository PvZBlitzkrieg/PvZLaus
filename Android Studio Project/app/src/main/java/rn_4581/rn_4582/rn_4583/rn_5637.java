package rn_4581.rn_4582.rn_4583;
import android.content.*;
import android.content.res.*;
import android.view.*;
import android.widget.*;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_4581.rn_4582.rn_4583.rn_5612;

public class rn_5637 extends rn_5612 {
	protected View view;
	private GestureDetector detector;

    public rn_5637(Context context) {
        super(context);
    }
	
	public rn_5637(View view) {
        super(view.getContext(), false);
        this.view = view;
		rn_5613();
    }
	
	@Override
	protected void onInit() {
	    this.view = onCreateView(context);
		this.view.setTag(this);
	}

    public View onCreateView(Context context) {
        View view = new View(context);
        return view;
    }

    public View getView() {
        return view;
    }
	
	protected int computeDimension(Object value) {
        if (value instanceof Number) {
            return ((Number) value).intValue();
        } else if (value instanceof String) {
            String text = (String) value;
			if(text.trim().isEmpty()){
				return 0;
			}
            int index = text.lastIndexOf("dp");
            if (index != -1) {
                int dp = Integer.parseInt(text.substring(0, index).trim());
                return (int) (dp * context.getResources().getDisplayMetrics().density + 0.5f);
            } else {
                index = text.lastIndexOf("sp");
                if (index != -1) {
                    int sp = Integer.parseInt(text.substring(0, index).trim());
                    return (int) (sp * context.getResources().getDisplayMetrics().scaledDensity + 0.5f);
                } else {
                    index = text.lastIndexOf("px");
                    if (index != -1) {
                        return Integer.parseInt(text.substring(0, index).trim());
                    } else {
                        return Integer.parseInt(text);
                    }
                }
            }
        }
        return 0;
    }
	
	protected float computePercentage(Object value) {
        if (value instanceof Number) {
            return ((Number) value).floatValue();
        } else if (value instanceof String) {
            String text = (String) value;
            if (text.charAt(0) == '%') {
                return (float) (Double.parseDouble(text.substring(1)) / 100);
            } else if (text.charAt(text.length() - 1) == '%') {
                return (float) (Double.parseDouble(text.substring(0, text.length() - 1)) / 100);
            } else {
                int index = text.indexOf('/');
                if (index == -1) {
                    return Integer.parseInt(text) * 1f / 100;
                } else {
                    int denominator = Integer.parseInt(text.substring(0, index));
                    int numerator = Integer.parseInt(text.substring(index + 1));
                    return denominator * 1f / numerator;
                }
            }
        }
        return 0;
    }

	public final void rn_5642(Object rn_5643) {
		ViewGroup.LayoutParams params = view.getLayoutParams();
		if (params == null) {
			params = new ViewGroup.LayoutParams(-2, -2);
		}
		params.width = computeDimension(rn_5643);
		view.setLayoutParams(params);
	}

	public final void rn_5646(Object rn_5647) {
		ViewGroup.LayoutParams params = view.getLayoutParams();
		if (params == null) {
			params = new ViewGroup.LayoutParams(-2, -2);
		}
		params.height = computeDimension(rn_5647);
		view.setLayoutParams(params);
	}

	public final void rn_5724(boolean rn_5725) {
		view.setClickable(rn_5725);
        if (rn_5725) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rn_5736();
                }
            });
        } else {
            view.setOnClickListener(null);
        }
	}

	public interface rn_5736_r {
		void dispatch();
	}
	private rn_5736_r rn_5736_v;
	public final void rn_5736_s(rn_5736_r receiver) {
		this.rn_5736_v = receiver;
	}
	public final void rn_5736() {
		if (this.rn_5736_v != null) {
			this.rn_5736_v.dispatch();
		}
	}
}