package bk.pvz;
import bk.pvz.Nlimage;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_4133;
import bk.pvz.String_Nlimagesm;
import bk.pvz.ope;

public class String_Nlimage extends java.util.HashMap<String, Nlimage> {
	public final Nlimage rn_3133(String rn_3134) {
		Nlimage rn_3135 = String_Nlimagesm.rn_3128(String_Nlimage.this, rn_3134);
		if (rn_3135 == null) {
			ope.rn_1798("错误的图片id;" + rn_3134);
			return String_Nlimagesm.rn_3128(String_Nlimage.this, "IMAGE_REANIM_" + rn_3081.rn_6711("Credits_nozombies"));
		}
		return rn_3135;
	}
}