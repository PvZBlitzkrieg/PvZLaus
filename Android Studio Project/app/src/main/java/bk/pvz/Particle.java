package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Grain;
import bk.pvz.ope;
import rn_6840.rn_6841.rn_6842.rn_6945;
import bk.pvz.GrainSet;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_6840.rn_6841.rn_6842.rn_6941;
import bk.pvz.Nirvana;
import rn_4581.rn_4582.rn_4583.rn_7317;
import bk.pvz.op;

public class Particle {
	public java.util.ArrayList<Grain> rn_2842 = new java.util.ArrayList<Grain>();
	public float rn_2843 = 0F;
	public float rn_2844 = 0F;
	public int rn_2845 = 0;
	public int rn_2846 = 0;
	public String rn_2847 = "";
	public int rn_2849 = 0;
	public Nirvana rn_2850 = null;
	public boolean rn_2851 = false;

	public static final Particle rn_2852(String rn_2853, float rn_2854, float rn_2855, int rn_2856, Nirvana rn_2857) {
		Particle rn_2858 = new Particle();
		rn_2858.rn_2849 = rn_2856;
		rn_2858.rn_2843 = rn_2854;
		rn_2858.rn_2844 = rn_2855;
		rn_2858.rn_2847 = rn_2853;
		rn_2858.rn_2850 = rn_2857;
		if (rn_3289.rn_6850(rn_2853, "PeaSplat")) {
			int rn_2859 = 20;
			rn_2858.rn_2845 = 0;
			rn_2858.rn_2846 = rn_2859;
			Grain rn_2860 = Grain.rn_2953(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			rn_2860.rn_2942 = "pea_splats";
			rn_2860.rn_2961(rn_2859);
			rn_2860.rn_2943 = 4;
			rn_2860.rn_2947 = true;
			GrainSet.rn_2903(rn_2858.rn_2842, rn_2860);
			for (int rn_10565 = 0;rn_10565 < rn_7317.rn_7328(6, 10);rn_10565 += 1) {
				Grain rn_2861 = Grain.rn_2953(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2861.rn_2942 = "Pea_particles";
				rn_2861.rn_2961(rn_2859);
				rn_2861.rn_2943 = 3;
				rn_2861.rn_2944 = rn_7317.rn_7328(0, 2);
				float rn_2862 = ope.rn_1821(0.8F, 1.2F);
				rn_2861.rn_2933 = "0-" + rn_2862 + " 80-" + rn_2862 + " 100-0";
				rn_2861.rn_2932 = "0-1 80-1 100-0";
				float rn_2863 = op.rn_1242(rn_7317.rn_7331(1.5F, 1.8F));
				double rn_2864 = rn_7317.rn_7356(rn_7317.rn_7328(0, 359));
				rn_2861.rn_2926 = rn_2863 * op.rn_1242(rn_7317.rn_7322(rn_2864));
				rn_2861.rn_2927 = rn_2863 * op.rn_1242(rn_7317.rn_7334(rn_2864));
				rn_2861.rn_2929 = 0.15F;
				rn_2861.rn_2930 = Grain.rn_2967(0.1F);
				rn_2861.rn_2931 = Grain.rn_2967(0.1F);
				GrainSet.rn_2903(rn_2858.rn_2842, rn_2861);
			}
		} else if (rn_3289.rn_6850(rn_2853, "Powie")) {
			int rn_2865 = 100;
			rn_2858.rn_2851 = true;
			rn_2858.rn_2845 = 0;
			rn_2858.rn_2846 = rn_2865;
			int rn_2866 = 10;
			for (int rn_10566 = 0;rn_10566 < rn_2866;rn_10566 += 1) {
				Grain rn_2867 = Grain.rn_2953(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2867.rn_2942 = "ExplosionCloud";
				rn_2867.rn_2961(rn_2865);
				String rn_2868 = rn_6945.rn_6947((rn_10566 * 10.0F / rn_2866 + 60.0F));
				float rn_2869 = ope.rn_1821(1.2F, 1.6F);
				rn_2867.rn_2933 = "0-" + rn_2869 + " 60-" + rn_2869 + " 100-0";
				rn_2867.rn_2934 = Grain.rn_2967(1);
				rn_2867.rn_2935 = "0-0.9 100-0.4";
				rn_2867.rn_2936 = Grain.rn_2967(0);
				rn_2867.rn_2932 = "0-1 " + rn_2868 + "-1 100-0";
				rn_2867.rn_2937 = ope.rn_1821(0, 359);
				rn_2867.rn_2938 = ope.rn_1821(-2, 2);
				int rn_2870 = 2;
				double rn_2871 = rn_7317.rn_7356(rn_7317.rn_7328(0, 359));
				rn_2867.rn_2926 = rn_2870 * op.rn_1242(rn_7317.rn_7322(rn_2871));
				rn_2867.rn_2927 = rn_2870 * op.rn_1242(rn_7317.rn_7334(rn_2871));
				rn_2867.rn_2930 = "0-0.1 40-0.1 100-1";
				rn_2867.rn_2931 = "0-0.28 40-0.28 100-1";
				GrainSet.rn_2903(rn_2858.rn_2842, rn_2867);
			}
			rn_2866 = 14;
			for (int rn_10567 = 0;rn_10567 < rn_2866;rn_10567 += 1) {
				Grain rn_2872 = Grain.rn_2953(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2872.rn_2942 = "ExplosionCloud";
				rn_2872.rn_2961(rn_2865);
				rn_2872.rn_2934 = Grain.rn_2967(1);
				rn_2872.rn_2935 = "0-0.7 100-0";
				rn_2872.rn_2936 = Grain.rn_2967(0);
				float rn_2873 = (rn_10567 * 50.0F / rn_2866 + 25.0F);
				rn_2872.rn_2932 = "0-1 " + rn_6945.rn_6947(rn_2873) + "-1 " + rn_6945.rn_6947((rn_2873 + 24.0F)) + "-0";
				rn_2872.rn_2933 = "0-0.5 60-0.5 100-0";
				rn_2872.rn_2937 = ope.rn_1821(0, 359);
				rn_2872.rn_2938 = ope.rn_1821(-2, 2);
				int rn_2874 = 5;
				double rn_2875 = rn_7317.rn_7356(rn_7317.rn_7328(0, 359));
				rn_2872.rn_2926 = rn_2874 * op.rn_1242(rn_7317.rn_7322(rn_2875));
				rn_2872.rn_2927 = rn_2874 * op.rn_1242(rn_7317.rn_7334(rn_2875));
				rn_2872.rn_2930 = "0-0.15 40-0.15 100-1";
				rn_2872.rn_2931 = "0-0.25 40-0.25 100-1";
				GrainSet.rn_2903(rn_2858.rn_2842, rn_2872);
			}
			Grain rn_2876 = Grain.rn_2953(-70, -70, 0.0F, 0.0F, 0.0F, 0.0F);
			rn_2876.rn_2942 = "ExplosionPowie";
			rn_2876.rn_2961(70);
			GrainSet.rn_2903(rn_2858.rn_2842, rn_2876);
		} else if (rn_3289.rn_6850(rn_2853, "DancerRise")) {
			int rn_2877 = 200;
			rn_2858.rn_2845 = 0;
			rn_2858.rn_2846 = rn_2877;
			for (int rn_10568 = 0;rn_10568 < 14;rn_10568 += 1) {
				Grain rn_2878 = Grain.rn_2953(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2878.rn_2942 = "dirtbig";
				rn_2878.rn_2961(rn_2877);
				rn_2878.rn_2932 = "0-1 100-1";
				float rn_2879 = ope.rn_1821(0.7F, 0.9F);
				rn_2878.rn_2933 = "0-0 10-" + rn_2879 + " 100-" + rn_2879;
				rn_2878.rn_2924 = ope.rn_1821(-30.0F, 30.0F);
				rn_2878.rn_2925 = ope.rn_1821(-5.0F, 5.0F);
				rn_2878.rn_2939 = 2.5F;
				rn_2878.rn_2943 = 4;
				rn_2878.rn_2945 = 2;
				rn_2878.rn_2944 = rn_7317.rn_7328(0, 7);
				GrainSet.rn_2903(rn_2858.rn_2842, rn_2878);
			}
			int rn_2880 = 40;
			for (int rn_10569 = 0;rn_10569 < rn_2880;rn_10569 += 1) {
				Grain rn_2881 = Grain.rn_2953(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2881.rn_2942 = "dirtsmall";
				rn_2881.rn_2961(rn_2877);
				float rn_2882 = (rn_10569 * 1.0F / rn_2880) * 0.6F * 100 + 2;
				float rn_2883 = rn_2882 + 40;
				rn_2881.rn_2932 = "0-0 " + rn_6945.rn_6947((rn_2882 - 1)) + "-0 " + rn_2882 + "-1 " + rn_2883 + "-1 " + rn_6945.rn_6947((rn_2883 + 1)) + "-0" + " 100-0";
				rn_2881.rn_2949 = rn_2882 * rn_2877 / 100;
				rn_2881.rn_2950 = rn_2883 * rn_2877 / 100;
				rn_2881.rn_2924 = ope.rn_1821(-5.0F, 5.0F);
				rn_2881.rn_2926 = ope.rn_1821(-0.5F, 0.5F);
				rn_2881.rn_2927 = -1.5F;
				rn_2881.rn_2929 = 0.03F;
				rn_2881.rn_2939 = 0.1F;
				rn_2881.rn_2933 = Grain.rn_2967(0.65F);
				rn_2881.rn_2943 = 8;
				rn_2881.rn_2945 = 2;
				rn_2881.rn_2944 = rn_7317.rn_7328(0, 15);
				GrainSet.rn_2903(rn_2858.rn_2842, rn_2881);
			}
		} else if (rn_3289.rn_6850(rn_2853, "SodRoll")) {
			rn_2858.rn_2845 = 0;
			rn_2858.rn_2846 = 200;
			int rn_2884 = 50;
			for (int rn_10570 = 0;rn_10570 < 100;rn_10570 += 1) {
				Grain rn_2885 = Grain.rn_2953(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2885.rn_2942 = "dirtsmall";
				rn_2885.rn_2961(rn_2884);
				rn_2885.rn_2951 = rn_2884;
				rn_2885.rn_2952 = (int) (rn_10570 * 1.5F);
				rn_2885.rn_2932 = "0-1 80-1 100-0";
				rn_2885.rn_2924 = 0;
				rn_2885.rn_2925 = ope.rn_1821(0, 50.0F);
				rn_2885.rn_2926 = ope.rn_1821(-1.0F, 0);
				rn_2885.rn_2927 = -1.5F;
				rn_2885.rn_2929 = 0.03F;
				rn_2885.rn_2939 = 0.1F;
				rn_2885.rn_2933 = Grain.rn_2967(1.0F);
				rn_2885.rn_2943 = 8;
				rn_2885.rn_2945 = 2;
				rn_2885.rn_2944 = rn_7317.rn_7328(0, 15);
				GrainSet.rn_2903(rn_2858.rn_2842, rn_2885);
			}
		} else if (rn_3289.rn_6850(rn_2853, "PuffShroomMuzzle")) {
			rn_2858.rn_2845 = 0;
			rn_2858.rn_2846 = 20;
			int rn_2886 = 20;
			for (int rn_10571 = 0;rn_10571 < rn_7317.rn_7328(6, 8);rn_10571 += 1) {
				Grain rn_2887 = Grain.rn_2953(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2887.rn_2942 = "PuffShroom_puff2";
				rn_2887.rn_2961(rn_2886);
				float rn_2888 = ope.rn_1821(0.3F, 0.8F);
				rn_2887.rn_2932 = "0-" + rn_2888 + " 80-" + rn_2888 + " 100-0";
				rn_2887.rn_2924 = ope.rn_1821(2, 4);
				rn_2887.rn_2925 = ope.rn_1821(-3, 2);
				rn_2887.rn_2926 = ope.rn_1821(1.0F, 0);
				rn_2887.rn_2927 = ope.rn_1821(-1.0F, 1.0F);
				rn_2887.rn_2929 = 0.03F;
				float rn_2889 = ope.rn_1821(0.2F, 0.3F);
				float rn_2890 = ope.rn_1821(0.6F, 0.8F);
				rn_2887.rn_2933 = "0-" + rn_2889 + " 70-" + rn_2890 + " 100-0";
				GrainSet.rn_2903(rn_2858.rn_2842, rn_2887);
			}
		} else if (rn_3289.rn_6850(rn_2853, "PuffShroomTrail")) {
		}
		return rn_2858;
	}

	public final boolean rn_2891() {
		if (rn_3289.rn_6850(rn_2847, "SodRoll")) {
			rn_2843 = 220 + rn_2850.rn_484;
		}
		if (rn_2845 >= rn_2846) {
			return true;
		}
		for (int rn_10572 = 0;rn_10572 < GrainSet.rn_1225(rn_2842);rn_10572 += 1) {
			int rn_2892 = GrainSet.rn_1225(rn_2842) - rn_10572 - 1;
			if (GrainSet.rn_2895(rn_2842, rn_2892).rn_2963() == true) {
				ope.rn_1923(GrainSet.rn_2895(rn_2842, rn_2892));
				GrainSet.rn_2918(rn_2842, rn_2892);
			}
		}
		rn_2845 = rn_2845 + 1;
		return false;
	}
}