package bk.pvz;
import bk.pvz.Nirvana;
import bk.pvz.op;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_6773;
import bk.pvz.GrainSet;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import bk.pvz.Grain;
import bk.pvz.ope;
import rn_4413.rn_4414.rn_4415.rn_7149;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class Particle {
	public java.util.ArrayList<Grain> rn_2655 = new java.util.ArrayList<Grain>();
	public float rn_2656 = 0F;
	public float rn_2657 = 0F;
	public int rn_2658 = 0;
	public int rn_2659 = 0;
	public String rn_2660 = "";
	public int rn_2662 = 0;
	public Nirvana rn_2663 = null;
	public boolean rn_2664 = false;

	public static final Particle rn_2665(String rn_2666, float rn_2667, float rn_2668, int rn_2669, Nirvana rn_2670) {
		Particle rn_2671 = new Particle();
		rn_2671.rn_2662 = rn_2669;
		rn_2671.rn_2656 = rn_2667;
		rn_2671.rn_2657 = rn_2668;
		rn_2671.rn_2660 = rn_2666;
		rn_2671.rn_2663 = rn_2670;
		if (rn_3081.rn_6682(rn_2666, "PeaSplat")) {
			int rn_2672 = 20;
			rn_2671.rn_2658 = 0;
			rn_2671.rn_2659 = rn_2672;
			Grain rn_2673 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			rn_2673.pic = "pea_splats";
			rn_2673.setdtime(rn_2672);
			rn_2673.cutn = 4;
			rn_2673.isCarousel = true;
			GrainSet.rn_2729(rn_2671.rn_2655, rn_2673);
			for (int rn_10422 = 0;rn_10422 < rn_7149.rn_7160(6, 10);rn_10422 += 1) {
				Grain rn_2674 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2674.pic = "Pea_particles";
				rn_2674.setdtime(rn_2672);
				rn_2674.cutn = 3;
				rn_2674.cutp = rn_7149.rn_7160(0, 2);
				float rn_2675 = ope.rn_1684(0.8F, 1.2F);
				rn_2674.scale = "0-" + rn_2675 + " 80-" + rn_2675 + " 100-0";
				rn_2674.alpha = "0-1 80-1 100-0";
				float rn_2676 = op.rn_1038(rn_7149.rn_7163(1.5F, 1.8F));
				double rn_2677 = rn_7149.rn_7188(rn_7149.rn_7160(0, 359));
				rn_2674.xv = rn_2676 * op.rn_1038(rn_7149.rn_7154(rn_2677));
				rn_2674.yv = rn_2676 * op.rn_1038(rn_7149.rn_7166(rn_2677));
				rn_2674.ya = 0.15F;
				rn_2674.xf = Grain.fullvalue(0.1F);
				rn_2674.yf = Grain.fullvalue(0.1F);
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2674);
			}
		} else if (rn_3081.rn_6682(rn_2666, "Powie")) {
			int rn_2678 = 100;
			rn_2671.rn_2664 = true;
			rn_2671.rn_2658 = 0;
			rn_2671.rn_2659 = rn_2678;
			int rn_2679 = 10;
			for (int rn_10423 = 0;rn_10423 < rn_2679;rn_10423 += 1) {
				Grain rn_2680 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2680.pic = "ExplosionCloud";
				rn_2680.setdtime(rn_2678);
				String rn_2681 = rn_6777.rn_6779((rn_10423 * 10.0F / rn_2679 + 60.0F));
				float rn_2682 = ope.rn_1684(1.2F, 1.6F);
				rn_2680.scale = "0-" + rn_2682 + " 60-" + rn_2682 + " 100-0";
				rn_2680.red = Grain.fullvalue(1);
				rn_2680.green = "0-0.9 100-0.4";
				rn_2680.blue = Grain.fullvalue(0);
				rn_2680.alpha = "0-1 " + rn_2681 + "-1 100-0";
				rn_2680.rotate = ope.rn_1684(0, 359);
				rn_2680.spinspeed = ope.rn_1684(-2, 2);
				int rn_2683 = 2;
				double rn_2684 = rn_7149.rn_7188(rn_7149.rn_7160(0, 359));
				rn_2680.xv = rn_2683 * op.rn_1038(rn_7149.rn_7154(rn_2684));
				rn_2680.yv = rn_2683 * op.rn_1038(rn_7149.rn_7166(rn_2684));
				rn_2680.xf = "0-0.1 40-0.1 100-1";
				rn_2680.yf = "0-0.28 40-0.28 100-1";
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2680);
			}
			rn_2679 = 14;
			for (int rn_10424 = 0;rn_10424 < rn_2679;rn_10424 += 1) {
				Grain rn_2685 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2685.pic = "ExplosionCloud";
				rn_2685.setdtime(rn_2678);
				rn_2685.red = Grain.fullvalue(1);
				rn_2685.green = "0-0.7 100-0";
				rn_2685.blue = Grain.fullvalue(0);
				float rn_2686 = (rn_10424 * 50.0F / rn_2679 + 25.0F);
				rn_2685.alpha = "0-1 " + rn_6777.rn_6779(rn_2686) + "-1 " + rn_6777.rn_6779((rn_2686 + 24.0F)) + "-0";
				rn_2685.scale = "0-0.5 60-0.5 100-0";
				rn_2685.rotate = ope.rn_1684(0, 359);
				rn_2685.spinspeed = ope.rn_1684(-2, 2);
				int rn_2687 = 5;
				double rn_2688 = rn_7149.rn_7188(rn_7149.rn_7160(0, 359));
				rn_2685.xv = rn_2687 * op.rn_1038(rn_7149.rn_7154(rn_2688));
				rn_2685.yv = rn_2687 * op.rn_1038(rn_7149.rn_7166(rn_2688));
				rn_2685.xf = "0-0.15 40-0.15 100-1";
				rn_2685.yf = "0-0.25 40-0.25 100-1";
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2685);
			}
			Grain rn_2689 = Grain.create(-70, -70, 0.0F, 0.0F, 0.0F, 0.0F);
			rn_2689.pic = "ExplosionPowie";
			rn_2689.setdtime(70);
			GrainSet.rn_2729(rn_2671.rn_2655, rn_2689);
		} else if (rn_3081.rn_6682(rn_2666, "DancerRise")) {
			int rn_2690 = 200;
			rn_2671.rn_2658 = 0;
			rn_2671.rn_2659 = rn_2690;
			for (int rn_10425 = 0;rn_10425 < 14;rn_10425 += 1) {
				Grain rn_2691 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2691.pic = "dirtbig";
				rn_2691.setdtime(rn_2690);
				rn_2691.alpha = "0-1 100-1";
				float rn_2692 = ope.rn_1684(0.7F, 0.9F);
				rn_2691.scale = "0-0 10-" + rn_2692 + " 100-" + rn_2692;
				rn_2691.x = ope.rn_1684(-30.0F, 30.0F);
				rn_2691.y = ope.rn_1684(-5.0F, 5.0F);
				rn_2691.shake = 2.5F;
				rn_2691.cutn = 4;
				rn_2691.row = 2;
				rn_2691.cutp = rn_7149.rn_7160(0, 7);
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2691);
			}
			int rn_2693 = 40;
			for (int rn_10426 = 0;rn_10426 < rn_2693;rn_10426 += 1) {
				Grain rn_2694 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2694.pic = "dirtsmall";
				rn_2694.setdtime(rn_2690);
				float rn_2695 = (rn_10426 * 1.0F / rn_2693) * 0.6F * 100 + 2;
				float rn_2696 = rn_2695 + 40;
				rn_2694.alpha = "0-0 " + rn_6777.rn_6779((rn_2695 - 1)) + "-0 " + rn_2695 + "-1 " + rn_2696 + "-1 " + rn_6777.rn_6779((rn_2696 + 1)) + "-0" + " 100-0";
				rn_2694.starte = rn_2695 * rn_2690 / 100;
				rn_2694.ende = rn_2696 * rn_2690 / 100;
				rn_2694.x = ope.rn_1684(-5.0F, 5.0F);
				rn_2694.xv = ope.rn_1684(-0.5F, 0.5F);
				rn_2694.yv = -1.5F;
				rn_2694.ya = 0.03F;
				rn_2694.shake = 0.1F;
				rn_2694.scale = Grain.fullvalue(0.65F);
				rn_2694.cutn = 8;
				rn_2694.row = 2;
				rn_2694.cutp = rn_7149.rn_7160(0, 15);
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2694);
			}
		} else if (rn_3081.rn_6682(rn_2666, "SodRoll")) {
			rn_2671.rn_2658 = 0;
			rn_2671.rn_2659 = 200;
			int rn_2697 = 50;
			for (int rn_10427 = 0;rn_10427 < 100;rn_10427 += 1) {
				Grain rn_2698 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2698.pic = "dirtsmall";
				rn_2698.setdtime(rn_2697);
				rn_2698.alivecd = rn_2697;
				rn_2698.activecd = (int) (rn_10427 * 1.5F);
				rn_2698.alpha = "0-1 80-1 100-0";
				rn_2698.x = 0;
				rn_2698.y = ope.rn_1684(0, 50.0F);
				rn_2698.xv = ope.rn_1684(-1.0F, 0);
				rn_2698.yv = -1.5F;
				rn_2698.ya = 0.03F;
				rn_2698.shake = 0.1F;
				rn_2698.scale = Grain.fullvalue(1.0F);
				rn_2698.cutn = 8;
				rn_2698.row = 2;
				rn_2698.cutp = rn_7149.rn_7160(0, 15);
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2698);
			}
		} else if (rn_3081.rn_6682(rn_2666, "PuffShroomMuzzle")) {
			rn_2671.rn_2658 = 0;
			rn_2671.rn_2659 = 20;
			int dt = 20;
			for (int rn_10428 = 0;rn_10428 < rn_7149.rn_7160(6, 8);rn_10428 += 1) {
				Grain rn_2699 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2699.pic = "PuffShroom_puff2";
				rn_2699.setdtime(dt);
				float rn_2700 = ope.rn_1684(0.3F, 0.8F);
				rn_2699.alpha = "0-" + rn_2700 + " 80-" + rn_2700 + " 100-0";
				rn_2699.x = ope.rn_1684(2, 4);
				rn_2699.y = ope.rn_1684(-3, 2);
				rn_2699.xv = ope.rn_1684(1.0F, 0);
				rn_2699.yv = ope.rn_1684(-1.0F, 1.0F);
				rn_2699.ya = 0.03F;
				float rn_2701 = ope.rn_1684(0.2F, 0.3F);
				float rn_2702 = ope.rn_1684(0.6F, 0.8F);
				rn_2699.scale = "0-" + rn_2701 + " 70-" + rn_2702 + " 100-0";
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2699);
			}
		} else if (rn_3081.rn_6682(rn_2666, "PuffShroomTrail")) {
		} else if (rn_3081.rn_6682(rn_2666, "SnowPeaTrail")) {
			rn_2671.rn_2658 = 0;
			rn_2671.rn_2659 = 20;
			int dt = 15;
			Grain rn_2703 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			rn_2703.pic = "SnowFlakes";
			rn_2703.cutn = 3;
			rn_2703.cutp = rn_7149.rn_7160(0, 2);
			rn_2703.setdtime(dt);
			rn_2703.alpha = "0-1 100-0";
			rn_2703.x = ope.rn_1684(2, 4);
			rn_2703.y = ope.rn_1684(-3, 2);
			rn_2703.xv = 0;
			rn_2703.yv = ope.rn_1684(-1.0F, 1.0F);
			rn_2703.ya = 0.03F;
			rn_2703.spinspeed = rn_7149.rn_7160(-2, 2);
			rn_2703.scale = "0-" + ope.rn_1684(1, 1.5F) + " 100-0";
			GrainSet.rn_2729(rn_2671.rn_2655, rn_2703);
		} else if (rn_3081.rn_6682(rn_2666, "ZamboniExplosion")) {
			int rn_2704 = 100;
			rn_2671.rn_2664 = true;
			rn_2671.rn_2658 = 0;
			rn_2671.rn_2659 = rn_2704;
			int rn_2705 = 10;
			for (int rn_10429 = 0;rn_10429 < rn_2705;rn_10429 += 1) {
				Grain rn_2706 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2706.pic = "ExplosionCloud";
				rn_2706.setdtime(rn_2704);
				float rn_2707 = ope.rn_1684(1.2F, 1.6F);
				rn_2706.scale = "0-" + rn_2707 + " 60-" + rn_2707 + " 100-0";
				rn_2706.red = "0-0.5 100-0";
				rn_2706.green = "0-0.8 100-0";
				rn_2706.blue = "0-1 50-0.75 100-0";
				rn_2706.alpha = "0-1 70-0 100-0";
				rn_2706.rotate = ope.rn_1684(0, 359);
				rn_2706.spinspeed = ope.rn_1684(-2, 2);
				int rn_2708 = 2;
				double rn_2709 = rn_7149.rn_7188(rn_7149.rn_7160(0, 359));
				rn_2706.xv = rn_2708 * op.rn_1038(rn_7149.rn_7154(rn_2709));
				rn_2706.yv = rn_2708 * op.rn_1038(rn_7149.rn_7166(rn_2709));
				rn_2706.xf = "0-0.1 40-0.1 100-1";
				rn_2706.yf = "0-0.28 40-0.28 100-1";
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2706);
			}
			float rn_2710 = 0.08F;
			Grain rn_2711 = Grain.create(-70, -70, 0.0F, 0.0F, 0.0F, 0.0F);
			rn_2711.pic = "IMAGE_REANIM_" + rn_3081.rn_6711("Zombie_zamboni_brush");
			rn_2711.scale = Grain.fullvalue(0.8F);
			rn_2711.xv = ope.rn_1684(-2.0F, 2.0F);
			rn_2711.yv = -1 * ope.rn_1684(2, 4);
			rn_2711.ya = rn_2710;
			rn_2711.alpha = "0-1 90-0 100-0";
			rn_2711.rotate = ope.rn_1684(-720, 720);
			rn_2711.spinspeed = ope.rn_1684(-2.0F, 2.0F);
			rn_2711.setdtime(80);
			GrainSet.rn_2729(rn_2671.rn_2655, rn_2711);
			rn_2711 = Grain.create(-70, -70, 0.0F, 0.0F, 0.0F, 0.0F);
			rn_2711.pic = "IMAGE_REANIM_" + rn_3081.rn_6711("Zombie_zamboni_wheel");
			rn_2711.scale = Grain.fullvalue(0.8F);
			rn_2711.xv = ope.rn_1684(-2.0F, 2.0F);
			rn_2711.yv = -1 * ope.rn_1684(2, 4);
			rn_2711.ya = rn_2710;
			rn_2711.alpha = "0-1 90-0 100-0";
			rn_2711.rotate = ope.rn_1684(-720, 720);
			rn_2711.spinspeed = ope.rn_1684(-2.0F, 2.0F);
			rn_2711.x = rn_7149.rn_7160(-35, 35);
			rn_2711.y = 30;
			rn_2711.setdtime(80);
			GrainSet.rn_2729(rn_2671.rn_2655, rn_2711);
			rn_2711 = Grain.create(-70, -70, 0.0F, 0.0F, 0.0F, 0.0F);
			rn_2711.pic = "IMAGE_REANIM_" + rn_3081.rn_6711("Zombie_zamboni_1_damage1");
			rn_2711.scale = Grain.fullvalue(0.8F);
			rn_2711.xv = ope.rn_1684(-2.0F, 2.0F);
			rn_2711.yv = -1 * ope.rn_1684(2, 4);
			rn_2711.ya = rn_2710;
			rn_2711.alpha = "0-1 90-0 100-0";
			rn_2711.rotate = ope.rn_1684(-720, 720);
			rn_2711.spinspeed = ope.rn_1684(-2.0F, 2.0F);
			rn_2711.setdtime(80);
			GrainSet.rn_2729(rn_2671.rn_2655, rn_2711);
			rn_2705 = 10;
			for (int rn_10430 = 0;rn_10430 < rn_2705;rn_10430 += 1) {
				Grain rn_2712 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2712.setdtime(rn_2704);
				rn_2712.pic = "Zomboss_particles";
				rn_2712.scale = Grain.fullvalue(ope.rn_1684(0.4F, 0.6F));
				rn_2712.cutn = 5;
				rn_2712.cutp = rn_7149.rn_7160(0, 4);
				rn_2712.alpha = "0-1 70-1 100-0";
				rn_2712.x = ope.rn_1684(-10, 10);
				rn_2712.y = ope.rn_1684(-10, 10);
				rn_2712.rotate = ope.rn_1684(0, 359);
				rn_2712.spinspeed = ope.rn_1684(-2, 2);
				int rn_2713 = 5;
				double rn_2714 = rn_7149.rn_7188(rn_7149.rn_7160(0, 359));
				rn_2712.xv = rn_2713 * op.rn_1038(rn_7149.rn_7154(rn_2714));
				rn_2712.yv = rn_2713 * op.rn_1038(rn_7149.rn_7166(rn_2714));
				rn_2712.xf = "0-0.1 40-0.1 100-1";
				rn_2712.yf = "0-0.28 40-0.28 100-1";
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2712);
			}
			rn_2705 = 14;
			for (int rn_10431 = 0;rn_10431 < rn_2705;rn_10431 += 1) {
				Grain rn_2715 = Grain.create(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				rn_2715.pic = "ExplosionCloud";
				rn_2715.setdtime(rn_2704);
				rn_2715.red = "0-0.5 100-0";
				rn_2715.green = "0-0.8 100-0";
				rn_2715.blue = "0-1 50-0.75 100-0";
				rn_2715.alpha = "0-1 70-0 100-0";
				rn_2715.scale = "0-0.5 60-0.5 100-0";
				rn_2715.rotate = ope.rn_1684(0, 359);
				rn_2715.spinspeed = ope.rn_1684(-2, 2);
				int rn_2716 = 5;
				double rn_2717 = rn_7149.rn_7188(rn_7149.rn_7160(0, 359));
				rn_2715.xv = rn_2716 * op.rn_1038(rn_7149.rn_7154(rn_2717));
				rn_2715.yv = rn_2716 * op.rn_1038(rn_7149.rn_7166(rn_2717));
				rn_2715.xf = "0-0.15 40-0.15 100-1";
				rn_2715.yf = "0-0.25 40-0.25 100-1";
				GrainSet.rn_2729(rn_2671.rn_2655, rn_2715);
			}
		}
		return rn_2671;
	}

	public final boolean Update() {
		if (rn_3081.rn_6682(rn_2660, "SodRoll")) {
			rn_2656 = 220 + rn_2663.animproc;
		}
		if (rn_2658 >= rn_2659) {
			return true;
		}
		for (int rn_10432 = 0;rn_10432 < GrainSet.rn_1021(rn_2655);rn_10432 += 1) {
			int rn_2718 = GrainSet.rn_1021(rn_2655) - rn_10432 - 1;
			if (GrainSet.rn_2721(rn_2655, rn_2718).Update() == true) {
				ope.rn_1796(GrainSet.rn_2721(rn_2655, rn_2718));
				GrainSet.rn_2744(rn_2655, rn_2718);
			}
		}
		rn_2658 = rn_2658 + 1;
		return false;
	}
}