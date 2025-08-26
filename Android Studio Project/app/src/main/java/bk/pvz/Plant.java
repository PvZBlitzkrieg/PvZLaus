package bk.pvz;
import bk.pvz.ProjList;
import bk.pvz.Proj;
import bk.pvz.ZombieList;
import rn_6840.rn_6841.rn_6842.rn_6945;
import bk.pvz.POS;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Anim;
import rn_4581.rn_4582.rn_4583.rn_7317;
import bk.pvz.STSL;
import rn_6840.rn_6841.rn_6842.rn_6925;
import bk.pvz.Particle;
import bk.pvz.CoinList;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.ParticleList;
import bk.pvz.Zombie;
import bk.pvz.static_;
import bk.pvz.Coin;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Rectx;
import bk.pvz.Nirvana;
import bk.pvz.op;
import bk.pvz.ProxyAnim;

public class Plant {
	public int rn_2615 = 0;
	public int rn_2616 = 0;
	public int rn_2617 = 0;
	public Anim[] rn_2618 = new Anim[0];
	public float rn_2619 = 0.0F;
	public float rn_2620 = 0.0F;
	public float rn_2621 = 1.0F;
	public int rn_2622 = -1;
	public int rn_2623 = -1;
	public int rn_2624 = 0;
	public int rn_2625 = 0;
	public int rn_2626 = 0;
	public Rectx rn_2627 = new Rectx();
	public boolean rn_2628 = false;
	public float rn_2630 = 0.0F;
	public boolean rn_2632 = false;
	public boolean rn_2633 = false;
	public String rn_2634 = "";
	public Nirvana rn_2636 = new Nirvana();

	public static final Plant rn_2637(Nirvana rn_2638, int rn_2639, int rn_2640, int rn_2641) {
		Plant rn_2642 = new Plant();
		rn_2642.rn_2617 = rn_2641;
		rn_2642.rn_2615 = 300;
		rn_2642.rn_2622 = rn_2639;
		rn_2642.rn_2623 = rn_2640;
		rn_2642.rn_2619 = 260 + 80 * rn_2640;
		rn_2642.rn_2620 = rn_2638.rn_1143(rn_2639, rn_2642.rn_2619) - rn_2638.rn_1149();
		rn_2642.rn_2636 = rn_2638;
		rn_2642.rn_2731(45, 40, 25, 50);
		if (rn_2641 == 0) {
			POS rn_2643 = new POS();
			rn_2643.rn_3283(-1719.0F);
			rn_2643.rn_3271 = -38;
			rn_2643.rn_3272 = -48;
			Anim rn_2644 = Anim.rn_3508("PeaShooterSingle", rn_2638).rn_3562("anim_head_idle", false);
			rn_2644.rn_3487 = 0.5F;
			Anim rn_2645 = Anim.rn_3508("PeaShooterSingle", rn_2638).rn_3562("anim_idle", false).rn_3524("anim_stem", rn_2644, rn_2643, true);
			rn_2645.rn_3487 = Zombie.rn_2255() * 0.5F;
			rn_2642.rn_2618 = new Anim[]{rn_2645};
			rn_2642.rn_2625 = 150;
			rn_2642.rn_2624 = rn_7317.rn_7328(80, 120);
			rn_2642.rn_2626 = 30;
		} else if (rn_2641 == 1) {
			Anim rn_2646 = Anim.rn_3508("SunFlower", rn_2638).rn_3562("anim_idle", false);
			rn_2646.rn_3487 = Zombie.rn_2255() * 0.5F;
			rn_2642.rn_2618 = new Anim[]{rn_2646};
			rn_2642.rn_2625 = rn_7317.rn_7328(2350, 2500);
			rn_2642.rn_2624 = rn_7317.rn_7328(300, 1250);
		} else if (rn_2641 == 2) {
			Anim rn_2647 = Anim.rn_3508("CherryBomb", rn_2638).rn_3562("anim_explode", false);
			rn_2647.rn_3499 = true;
			rn_2642.rn_2618 = new Anim[]{rn_2647};
			rn_2642.rn_2615 = 1800;
			rn_2642.rn_2632 = true;
		} else if (rn_2641 == 3) {
			Anim rn_2648 = Anim.rn_3508("Wallnut", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2648};
			rn_2642.rn_2615 = 4000;
			rn_2648.rn_3487 = 0.5F;
		} else if (rn_2641 == 4) {
			Anim rn_2649 = Anim.rn_3508("PotatoMine", rn_2638).rn_3562("anim_idle", false);
			rn_2649.rn_3487 = Zombie.rn_2255() * 0.5F;
			rn_2642.rn_2618 = new Anim[]{rn_2649};
			rn_2642.rn_2621 = 0.8F;
			rn_2642.rn_2728(0, 20);
			rn_2642.rn_2624 = 1500;
		} else if (rn_2641 == 5) {
			POS rn_2650 = new POS();
			rn_2650.rn_3283(-1719.0F);
			rn_2650.rn_3271 = -38;
			rn_2650.rn_3272 = -48;
			Anim rn_2651 = Anim.rn_3508("SnowPea", rn_2638).rn_3562("anim_head_idle", false);
			rn_2651.rn_3487 = 0.5F;
			Anim rn_2652 = Anim.rn_3508("SnowPea", rn_2638).rn_3562("anim_idle", false).rn_3524("anim_stem", rn_2651, rn_2650, true);
			rn_2652.rn_3487 = Zombie.rn_2255() * 0.5F;
			rn_2642.rn_2618 = new Anim[]{rn_2652};
			rn_2642.rn_2625 = 150;
			rn_2642.rn_2624 = rn_7317.rn_7328(80, 120);
			rn_2642.rn_2626 = 30;
		} else if (rn_2641 == 6) {
			Anim rn_2653 = Anim.rn_3508("Chomper", rn_2638).rn_3562("anim_idle", false);
			rn_2653.rn_3487 = Zombie.rn_2255() * 0.5F;
			rn_2642.rn_2618 = new Anim[]{rn_2653};
		} else if (rn_2641 == 7) {
			POS rn_2654 = new POS();
			rn_2654.rn_3283(-1719.0F);
			rn_2654.rn_3271 = -38;
			rn_2654.rn_3272 = -48;
			Anim rn_2655 = Anim.rn_3508("PeaShooter", rn_2638).rn_3562("anim_head_idle", false);
			Anim rn_2656 = Anim.rn_3508("PeaShooter", rn_2638).rn_3562("anim_idle", false).rn_3524("anim_stem", rn_2655, rn_2654, true);
			rn_2656.rn_3487 = Zombie.rn_2255() * 0.5F;
			rn_2642.rn_2618 = new Anim[]{rn_2656};
			rn_2642.rn_2625 = 150;
			rn_2642.rn_2624 = rn_7317.rn_7328(80, 120);
		} else if (rn_2641 == 8) {
			Anim rn_2657 = Anim.rn_3508("Puffshroom", rn_2638).rn_3562("anim_idle", false);
			rn_2657.rn_3487 = Zombie.rn_2255() * 0.5F;
			rn_2642.rn_2618 = new Anim[]{rn_2657};
			rn_2642.rn_2625 = 150;
			rn_2642.rn_2624 = rn_7317.rn_7328(0, rn_2642.rn_2625);
		} else if (rn_2641 == 9) {
			Anim rn_2658 = Anim.rn_3508("SunShroom", rn_2638).rn_3562("anim_idle", false);
			rn_2658.rn_3487 = Zombie.rn_2255() * 0.5F;
			rn_2642.rn_2618 = new Anim[]{rn_2658};
		} else if (rn_2641 == 10) {
			Anim rn_2659 = Anim.rn_3508("Fumeshroom", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2659};
		} else if (rn_2641 == 11) {
			Anim rn_2660 = Anim.rn_3508("Gravebuster", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2660};
		} else if (rn_2641 == 12) {
			Anim rn_2661 = Anim.rn_3508("Hypnoshroom", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2661};
		} else if (rn_2641 == 13) {
			Anim rn_2662 = Anim.rn_3508("ScaredyShroom", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2662};
		} else if (rn_2641 == 14) {
			Anim rn_2663 = Anim.rn_3508("Iceshroom", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2663};
		} else if (rn_2641 == 15) {
			Anim rn_2664 = Anim.rn_3508("DoomShroom", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2664};
		} else if (rn_2641 == 16) {
			Anim rn_2665 = Anim.rn_3508("Lilypad", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2665};
		} else if (rn_2641 == 17) {
			Anim rn_2666 = Anim.rn_3508("Squash", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2666};
		} else if (rn_2641 == 18) {
			Anim rn_2667 = Anim.rn_3508("ThreePeater", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2667};
		} else if (rn_2641 == 19) {
			Anim rn_2668 = Anim.rn_3508("Tanglekelp", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2668};
		} else if (rn_2641 == 20) {
			Anim rn_2669 = Anim.rn_3508("Jalapeno", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2669};
		} else if (rn_2641 == 21) {
			Anim rn_2670 = Anim.rn_3508("Caltrop", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2670};
		} else if (rn_2641 == 22) {
			Anim rn_2671 = Anim.rn_3508("Torchwood", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2671};
		} else if (rn_2641 == 23) {
			Anim rn_2672 = Anim.rn_3508("Tallnut", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2672};
		} else if (rn_2641 == 24) {
			Anim rn_2673 = Anim.rn_3508("SeaShroom", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2673};
		} else if (rn_2641 == 25) {
			Anim rn_2674 = Anim.rn_3508("Plantern", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2674};
		} else if (rn_2641 == 26) {
			Anim rn_2675 = Anim.rn_3508("Cactus", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2675};
		} else if (rn_2641 == 27) {
			Anim rn_2676 = Anim.rn_3508("Blover", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2676};
		} else if (rn_2641 == 28) {
			Anim rn_2677 = Anim.rn_3508("SplitPea", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2677};
		} else if (rn_2641 == 29) {
			Anim rn_2678 = Anim.rn_3508("Starfruit", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2678};
		} else if (rn_2641 == 30) {
			Anim rn_2679 = Anim.rn_3508("Pumpkin", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2615 = 4000;
			rn_2679.rn_3487 = 0.5F;
			rn_2642.rn_2618 = new Anim[]{rn_2679};
		} else if (rn_2641 == 31) {
			Anim rn_2680 = Anim.rn_3508("Magnetshroom", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2680};
		} else if (rn_2641 == 32) {
			Anim rn_2681 = Anim.rn_3508("Cabbagepult", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2681};
		} else if (rn_2641 == 33) {
			Anim rn_2682 = Anim.rn_3508("Pot", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2682};
		} else if (rn_2641 == 34) {
			Anim rn_2683 = Anim.rn_3508("Cornpult", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2683};
		} else if (rn_2641 == 35) {
			Anim rn_2684 = Anim.rn_3508("Coffeebean", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2684};
		} else if (rn_2641 == 36) {
			Anim rn_2685 = Anim.rn_3508("Garlic", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2685};
		} else if (rn_2641 == 37) {
			Anim rn_2686 = Anim.rn_3508("Umbrellaleaf", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2686};
		} else if (rn_2641 == 38) {
			Anim rn_2687 = Anim.rn_3508("Marigold", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2687};
		} else if (rn_2641 == 39) {
			Anim rn_2688 = Anim.rn_3508("Melonpult", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2688};
		} else if (rn_2641 == 40) {
			Anim rn_2689 = Anim.rn_3508("GatlingPea", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2689};
		} else if (rn_2641 == 41) {
			Anim rn_2690 = Anim.rn_3508("TwinSunflower", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2690};
		} else if (rn_2641 == 42) {
			Anim rn_2691 = Anim.rn_3508("GloomShroom", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2691};
		} else if (rn_2641 == 43) {
			Anim rn_2692 = Anim.rn_3508("Cattail", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2692};
		} else if (rn_2641 == 44) {
			Anim rn_2693 = Anim.rn_3508("WinterMelon", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2693};
		} else if (rn_2641 == 45) {
			Anim rn_2694 = Anim.rn_3508("GoldMagnet", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2694};
		} else if (rn_2641 == 46) {
			Anim rn_2695 = Anim.rn_3508("SpikeRock", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2695};
		} else if (rn_2641 == 47) {
			Anim rn_2696 = Anim.rn_3508("TangleKelp", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2696};
		} else if (rn_2641 == 48) {
			Anim rn_2697 = Anim.rn_3508("Imitater", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2697};
		} else if (rn_2641 == 49) {
			Anim rn_2698 = Anim.rn_3508("TangleKelp", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2698};
		} else if (rn_2641 == 50) {
			Anim rn_2699 = Anim.rn_3508("TangleKelp", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2699};
		} else if (rn_2641 == 51) {
			Anim rn_2700 = Anim.rn_3508("TangleKelp", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2700};
		} else if (rn_2641 == 52) {
			Anim rn_2701 = Anim.rn_3508("TangleKelp", rn_2638).rn_3562("anim_idle", false);
			rn_2642.rn_2618 = new Anim[]{rn_2701};
		}
		rn_2642.rn_2616 = rn_2642.rn_2615;
		return rn_2642;
	}

	public final boolean rn_2702() {
		if (rn_2615 <= 0) {
			return true;
		}
		if (rn_2617 == 0 || rn_2617 == 5 || rn_2617 == 7 || rn_2617 == 8) {
			Zombie rn_2703 = rn_2725();
			if (rn_2617 == 0 || rn_2617 == 5 || rn_2617 == 7 || rn_2617 == 8) {
				Anim rn_2704 = null;
				if (rn_2617 == 0 || rn_2617 == 5 || rn_2617 == 7) {
					rn_2704 = rn_2618 [0].rn_3492.rn_3424("anim_stem");
				} else if (rn_2617 == 8) {
					rn_2704 = rn_2618 [0];
				}
				if ((rn_2624 == 30 || (rn_2624 == 0 && rn_2617 == 7)) && rn_2703 != null) {
					rn_2704.rn_3487 = 1.0F;
					if (rn_2617 == 7) {
						rn_2704.rn_3487 = 1.8F;
					}
					String rn_2705 = rn_2704.rn_3495;
					if (rn_3289.rn_6852(rn_2704.rn_3494, "")) {
						rn_2705 = rn_2704.rn_3494;
					}
					rn_2704.rn_3562("anim_shooting", true);
					rn_2704.rn_3494 = rn_2705;
					rn_2628 = true;
				} else if ((rn_2624 == 1 || (rn_2624 == 130 && rn_2617 == 7)) && rn_2628) {
					rn_2721();
					if ((rn_2617 == 7 && rn_2624 == 15) == false) {
						rn_2628 = false;
					}
				}
				if (rn_3289.rn_6852(rn_2704.rn_3495, "anim_shooting")) {
					rn_2704.rn_3487 = 0.5F;
				}
			}
			if (rn_2628 || rn_2703 != null) {
				rn_2624 = rn_2624 - 1;
				if (rn_2624 < 0) {
					rn_2624 = rn_2625;
				}
			}
		} else if (rn_2617 == 1) {
			if (rn_2624 <= 0) {
				Coin rn_2706 = Coin.rn_2788(rn_2636, static_.rn_2805, rn_2736() + 50, rn_2620);
				rn_2706.rn_2772 = -2.0F;
				rn_2706.rn_2773 = 0.04F;
				rn_2706.rn_2771 = op.rn_1242(rn_7317.rn_7331(-0.5F, 0.5F));
				rn_2706.rn_2778 = rn_2736() - 50;
				rn_2706.rn_2779 = rn_2736() + 50;
				rn_2706.rn_2780 = rn_2620 + 50;
				CoinList.rn_2468(rn_2636.rn_492, rn_2706);
				rn_2624 = rn_2625;
			} else {
				rn_2624 = rn_2624 - 1;
			}
		} else if (rn_2617 == 2) {
			if (rn_2618 [0].rn_3498) {
				ParticleList.rn_2530(rn_2636.rn_481, Particle.rn_2852("Powie", rn_2736(), rn_2737(), rn_2622, rn_2636));
				float rn_2707 = rn_2619 + rn_2627.rn_3666;
				float rn_2708 = rn_2620 + rn_2627.rn_3667;
				for (int rn_10561 = 0;rn_10561 < ZombieList.rn_1225(rn_2636.rn_477);rn_10561 += 1) {
					Zombie rn_2709 = ZombieList.rn_2366((rn_2636.rn_477), rn_10561);
					float rn_2710 = rn_2709.rn_2170 + rn_2627.rn_3666 + rn_2627.rn_3668 / 2;
					float rn_2711 = rn_2709.rn_2171 + rn_2627.rn_3667 + rn_2627.rn_3667 / 2;
					int rn_2712 = 140;
					if (rn_2707 - rn_2712 < rn_2710 && rn_2710 < rn_2707 + rn_2712 && (rn_2708 - rn_2712 < rn_2711 && rn_2711 < rn_2708 + rn_2712)) {
						rn_2709.rn_2330(1800, 1);
					}
				}
				return true;
			}
		} else if (rn_2617 == 3) {
			if (rn_2615 < rn_2616 * 1 / 3) {
				rn_2618 [0].rn_3529("anim_face", "IMAGE_REANIM_" + rn_3289.rn_6879("Wallnut_cracked2"));
			} else if (rn_2615 < rn_2616 * 2 / 3) {
				rn_2618 [0].rn_3529("anim_face", "IMAGE_REANIM_" + rn_3289.rn_6879("Wallnut_cracked1"));
			} else {
				rn_2618 [0].rn_3529("anim_face", "IMAGE_REANIM_WALLNUT_BODY");
			}
		} else if (rn_2617 == 4) {
			if (rn_3289.rn_6850(rn_2634, "boom")) {
				rn_2621 = 1.2F;
				float rn_2713 = rn_2619 + rn_2627.rn_3666;
				float rn_2714 = rn_2620 + rn_2627.rn_3667;
				for (int rn_10562 = 0;rn_10562 < ZombieList.rn_1225(rn_2636.rn_477);rn_10562 += 1) {
					Zombie rn_2715 = ZombieList.rn_2366((rn_2636.rn_477), rn_10562);
					float rn_2716 = rn_2715.rn_2170 + rn_2627.rn_3666 + rn_2627.rn_3668 / 2;
					float rn_2717 = rn_2715.rn_2171 + rn_2627.rn_3667 + rn_2627.rn_3667 / 2;
					int rn_2718 = 100;
					if (rn_2713 - rn_2718 < rn_2716 && rn_2716 < rn_2713 + rn_2718 && (rn_2714 - rn_2718 < rn_2717 && rn_2717 < rn_2714 + rn_2718)) {
						rn_2715.rn_2330(1800, 3);
					}
				}
				rn_2633 = true;
				rn_2618 [0].rn_3562("anim_mashed", false).rn_3498 = true;
				rn_2618 [0].rn_3500 = true;
				rn_2634 = "dying";
				rn_2624 = 300;
			}
			if (rn_2624 == 0) {
				if (rn_3289.rn_6850(rn_2634, "dying")) {
					return true;
				} else {
					rn_2618 [0].rn_3562("anim_rise", false);
					rn_2618 [0].rn_3494 = "anim_armed";
					rn_2632 = true;
				}
			} else if (rn_2624 < 0) {
				if (rn_3289.rn_6850(rn_2618 [0].rn_3494, "")) {
					rn_2634 = "idle";
				}
			}
			rn_2624 = rn_2624 - 1;
		} else if (rn_2617 == 6) {
			Zombie rn_2719 = rn_2725();
			if (rn_2719 != null && (rn_2624 <= 0) && rn_3289.rn_6850(rn_2618 [0].rn_3495, "anim_idle")) {
				rn_2618 [0].rn_3487 = rn_2618 [0].rn_3487 * 2;
				rn_2634 = "bite";
				rn_2618 [0].rn_3562("anim_bite", false);
				rn_2618 [0].rn_3499 = true;
			} else if (rn_3289.rn_6850(rn_2618 [0].rn_3495, "anim_bite") && rn_2618 [0].rn_3485 >= 42 && rn_3289.rn_6850(rn_2634, "bite")) {
				rn_2634 = "chew";
				if (rn_2719 == null) {
				} else {
					rn_2624 = 4340;
					rn_2719.rn_2196 = true;
				}
			} else if (rn_3289.rn_6850(rn_2618 [0].rn_3495, "anim_bite") && rn_2618 [0].rn_3498) {
				rn_2618 [0].rn_3487 = 0.5F;
				rn_2618 [0].rn_3499 = false;
				if (rn_2624 == 0) {
					float rn_2720 = rn_2618 [0].rn_3485;
					rn_2618 [0].rn_3562("anim_idle", false);
					rn_2618 [0].rn_3550((int) rn_2720, 4);
				} else {
					rn_2618 [0].rn_3562("anim_chew", false);
				}
			} else if (rn_2624 <= 0 && rn_3289.rn_6850(rn_2618 [0].rn_3495, "anim_chew")) {
				rn_2634 = "swall";
				rn_2618 [0].rn_3562("anim_swallow", false);
				rn_2618 [0].rn_3494 = "anim_idle";
			}
			if (rn_2624 > 0) {
				rn_2624 = rn_2624 - 1;
			} else {
				rn_2624 = 0;
			}
		} else if (rn_2617 == 30) {
			if (rn_2615 < rn_2616 * 1 / 4) {
				rn_2618 [0].rn_3529("Pumpkin_front", "IMAGE_REANIM_" + rn_3289.rn_6879("Pumpkin_damage3"));
			} else if (rn_2615 < rn_2616 * 2 / 4) {
				rn_2618 [0].rn_3529("Pumpkin_front", "IMAGE_REANIM_" + rn_3289.rn_6879("Pumpkin_damage2"));
			} else if (rn_2615 < rn_2616 * 3 / 4) {
				rn_2618 [0].rn_3529("Pumpkin_front", "IMAGE_REANIM_" + rn_3289.rn_6879("Pumpkin_damage1"));
			} else {
				rn_2618 [0].rn_3529("Pumpkin_front", "IMAGE_REANIM_" + rn_3289.rn_6879("Pumpkin_front"));
			}
		}
		return false;
	}

	public final void rn_2721() {
		int rn_2722 = 50;
		int rn_2723 = 16 + rn_7317.rn_7328(0, 5) - 5;
		String rn_2724 = "ProjectilePea";
		if (rn_2617 == 5) {
			rn_2724 = "ProjectileSnowPea";
		} else if (rn_2617 == 8) {
			rn_2724 = "PuffShroom_puff1";
			rn_2723 = 45;
			ParticleList.rn_2530(rn_2636.rn_481, Particle.rn_2852("PuffShroomMuzzle", rn_2736() + 50, rn_2737() + 45, rn_2622, rn_2636));
		}
		ProjList.rn_2437(rn_2636.rn_479, Proj.rn_2756(rn_2636, rn_2724, rn_2622, rn_2736() + rn_2722, rn_2620 + rn_2723));
	}

	public final Zombie rn_2725() {
		Zombie rn_2726 = null;
		for (int rn_10563 = 0;rn_10563 < ZombieList.rn_1225(rn_2636.rn_477);rn_10563 += 1) {
			Zombie rn_2727 = ZombieList.rn_2366((rn_2636.rn_477), rn_10563);
			if (rn_2727.rn_2186 == false && rn_2727.rn_2174 == rn_2622 && rn_2727.rn_2329() > rn_2736() - 50 && (rn_2726 == null || rn_2727.rn_2329() < rn_2726.rn_2329())) {
				rn_2726 = rn_2727;
			}
		}
		if (rn_2617 == 6 && rn_2726 != null && rn_2726.rn_2329() > rn_2736() + 120) {
			return null;
		}
		if (rn_2617 == 8 && rn_2726 != null && rn_2726.rn_2329() > rn_2736() + 300) {
			return null;
		}
		return rn_2726;
	}

	public final void rn_2728(float rn_2729, float rn_2730) {
		rn_2619 = rn_2619 + rn_2729;
		rn_2620 = rn_2620 + rn_2730;
		rn_2627.rn_3666 = rn_2627.rn_3666 - rn_2729;
		rn_2627.rn_3667 = rn_2627.rn_3667 - rn_2730;
	}

	public final void rn_2731(float rn_2732, float rn_2733, float rn_2734, float rn_2735) {
		rn_2627.rn_3666 = rn_2732;
		rn_2627.rn_3667 = rn_2733;
		rn_2627.rn_3668 = rn_2734;
		rn_2627.rn_3669 = rn_2735;
	}

	public final float rn_2736() {
		return rn_2619;
	}

	public final float rn_2737() {
		return rn_2620;
	}

	public final STSL rn_2738() {
		STSL rn_2739 = new STSL();
		rn_2739.rn_3661("HP", rn_6928.rn_6933(rn_2615));
		rn_2739.rn_3661("type", rn_6928.rn_6933(rn_2617));
		rn_2739.rn_3661("anim.name", rn_2618 [0].rn_3482);
		rn_2739.rn_3661("anim.frame", rn_6945.rn_6947(rn_2618 [0].rn_3485));
		rn_2739.rn_3661("anim.speed", rn_6945.rn_6947(rn_2618 [0].rn_3487));
		rn_2739.rn_3661("anim.return", rn_2618 [0].rn_3494);
		rn_2739.rn_3661("x", rn_6945.rn_6947(rn_2736()));
		rn_2739.rn_3661("y", rn_6945.rn_6947(rn_2620));
		rn_2739.rn_3661("row", rn_6928.rn_6933(rn_2622));
		rn_2739.rn_3661("line", rn_6928.rn_6933(rn_2623));
		rn_2739.rn_3661("dtime", rn_6928.rn_6933(rn_2624));
		rn_2739.rn_3661("dtimemax", rn_6928.rn_6933(rn_2625));
		rn_2739.rn_3661("delayt", rn_6928.rn_6933(rn_2626));
		rn_2739.rn_3661("shable", rn_6925.rn_6926(rn_2628));
		rn_2739.rn_3661("state", rn_2634);
		return rn_2739;
	}
}