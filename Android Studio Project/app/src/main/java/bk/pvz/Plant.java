package bk.pvz;
import bk.pvz.ParticleList;
import bk.pvz.Zombie;
import bk.pvz.Proj;
import bk.pvz.Anim;
import rn_6672.rn_6673.rn_6674.rn_4133;
import bk.pvz.POS;
import bk.pvz.Rectx;
import bk.pvz.STSL;
import rn_4126.rn_4127.rn_4128.rn_8150;
import bk.pvz.ProjList;
import bk.pvz.ope;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4126.rn_4127.rn_4128.rn_8084;
import bk.pvz.Nirvana;
import rn_4413.rn_4414.rn_4415.rn_4577;
import bk.pvz.op;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_4413.rn_4414.rn_4415.rn_7149;
import bk.pvz.ZombieList;
import bk.pvz.CoinList;
import bk.pvz.Coin;
import bk.pvz.ProxyAnim;
import bk.pvz.Matrix_;
import bk.pvz.static_;
import bk.pvz.Particle;

public class Plant {
	@Override
	public String toString(){
	    return ToJSON();
	}

	public int HP = 0;
	public int HPM = 0;
	public int type = 0;
	public Anim[] anim = new Anim[0];
	public float x = 0.0F;
	public float y = 0.0F;
	public float scale = 1.0F;
	public int rn_2421 = -1;
	public int rn_2422 = -1;
	public int rn_2423 = 0;
	public int rn_2424 = 0;
	public int rn_2425 = 0;
	public Rectx rn_2426 = new Rectx();
	public boolean rn_2427 = false;
	public float rn_2429 = 0.0F;
	public boolean rn_2431 = false;
	public boolean rn_2432 = false;
	public boolean dying = false;
	public String state = "";
	public Nirvana rn_2434 = new Nirvana();
	public boolean rn_2435 = false;
	public boolean rn_2436 = false;
	public android.graphics.Matrix rn_2437 = Matrix_.rn_3395();
	public int rn_2438 = -1;

	public static final Plant rn_2439(Nirvana rn_2440, int rn_2441, int rn_2442, int rn_2443) {
		Plant rn_2444 = new Plant();
		rn_2444.type = rn_2443;
		rn_2444.HP = 300;
		rn_2444.rn_2421 = rn_2441;
		rn_2444.rn_2422 = rn_2442;
		rn_2444.x = 260 + 80 * rn_2442;
		rn_2444.y = rn_2440.gety(rn_2441, rn_2444.x) - rn_2440.getRowHeight();
		rn_2444.rn_2434 = rn_2440;
		rn_2444.rn_2534(45, 40, 25, 50);
		if (rn_2443 == 0) {
			POS rn_2445 = new POS();
			rn_2445.rn_3062(-1719.0F);
			rn_2445.rn_3050 = -38;
			rn_2445.rn_3051 = -48;
			Anim rn_2446 = Anim.rn_3310("PeaShooterSingle", rn_2440).rn_3366("anim_head_idle", false);
			rn_2446.speed = 0.5F;
			Anim rn_2447 = Anim.rn_3310("PeaShooterSingle", rn_2440).rn_3366("anim_idle", false).rn_3326("anim_stem", rn_2446, rn_2445, true);
			rn_2447.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2444.anim = new Anim[]{rn_2447};
			rn_2444.rn_2424 = 150;
			rn_2444.rn_2423 = rn_7149.rn_7160(80, 120);
			rn_2444.rn_2425 = 30;
		} else if (rn_2443 == 1) {
			Anim rn_2448 = Anim.rn_3310("SunFlower", rn_2440).rn_3366("anim_idle", false);
			rn_2448.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2444.anim = new Anim[]{rn_2448};
			rn_2444.rn_2424 = rn_7149.rn_7160(2350, 2500);
			rn_2444.rn_2423 = rn_7149.rn_7160(300, 1250);
		} else if (rn_2443 == 2) {
			Anim rn_2449 = Anim.rn_3310("CherryBomb", rn_2440).rn_3366("anim_explode", false);
			rn_2449.pauseAfterBroadcasting = true;
			rn_2444.anim = new Anim[]{rn_2449};
			rn_2444.HP = 1800;
			rn_2444.rn_2431 = true;
		} else if (rn_2443 == 3) {
			Anim rn_2450 = Anim.rn_3310("Wallnut", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2450};
			rn_2444.HP = 4000;
			rn_2450.speed = 0.5F;
		} else if (rn_2443 == 4) {
			Anim rn_2451 = Anim.rn_3310("PotatoMine", rn_2440).rn_3366("anim_idle", false);
			rn_2451.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2444.anim = new Anim[]{rn_2451};
			rn_2444.scale = 0.8F;
			rn_2444.rn_2531(0, 20);
			rn_2444.rn_2423 = 1500;
		} else if (rn_2443 == 5) {
			POS rn_2452 = new POS();
			rn_2452.rn_3062(-1719.0F);
			rn_2452.rn_3050 = -38;
			rn_2452.rn_3051 = -48;
			Anim rn_2453 = Anim.rn_3310("SnowPea", rn_2440).rn_3366("anim_head_idle", false);
			rn_2453.speed = 0.5F;
			Anim rn_2454 = Anim.rn_3310("SnowPea", rn_2440).rn_3366("anim_idle", false).rn_3326("anim_stem", rn_2453, rn_2452, true);
			rn_2454.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2444.anim = new Anim[]{rn_2454};
			rn_2444.rn_2424 = 150;
			rn_2444.rn_2423 = rn_7149.rn_7160(80, 120);
			rn_2444.rn_2425 = 30;
		} else if (rn_2443 == 6) {
			Anim rn_2455 = Anim.rn_3310("Chomper", rn_2440).rn_3366("anim_idle", false);
			rn_2455.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2444.anim = new Anim[]{rn_2455};
		} else if (rn_2443 == 7) {
			POS rn_2456 = new POS();
			rn_2456.rn_3062(-1719.0F);
			rn_2456.rn_3050 = -38;
			rn_2456.rn_3051 = -48;
			Anim rn_2457 = Anim.rn_3310("PeaShooter", rn_2440).rn_3366("anim_head_idle", false);
			Anim rn_2458 = Anim.rn_3310("PeaShooter", rn_2440).rn_3366("anim_idle", false).rn_3326("anim_stem", rn_2457, rn_2456, true);
			rn_2458.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2444.anim = new Anim[]{rn_2458};
			rn_2444.rn_2424 = 150;
			rn_2444.rn_2423 = rn_7149.rn_7160(80, 120);
		} else if (rn_2443 == 8) {
			Anim rn_2459 = Anim.rn_3310("Puffshroom", rn_2440).rn_3366("anim_idle", false);
			rn_2459.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2444.anim = new Anim[]{rn_2459};
			rn_2444.rn_2424 = 150;
			rn_2444.rn_2423 = rn_7149.rn_7160(0, rn_2444.rn_2424);
		} else if (rn_2443 == 9) {
			Anim rn_2460 = Anim.rn_3310("SunShroom", rn_2440).rn_3366("anim_idle", false);
			rn_2460.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2444.anim = new Anim[]{rn_2460};
		} else if (rn_2443 == 10) {
			Anim rn_2461 = Anim.rn_3310("Fumeshroom", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2461};
		} else if (rn_2443 == 11) {
			Anim rn_2462 = Anim.rn_3310("Gravebuster", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2462};
		} else if (rn_2443 == 12) {
			Anim rn_2463 = Anim.rn_3310("Hypnoshroom", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2463};
		} else if (rn_2443 == 13) {
			Anim rn_2464 = Anim.rn_3310("ScaredyShroom", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2464};
		} else if (rn_2443 == 14) {
			Anim rn_2465 = Anim.rn_3310("Iceshroom", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2465};
		} else if (rn_2443 == 15) {
			Anim rn_2466 = Anim.rn_3310("DoomShroom", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2466};
		} else if (rn_2443 == 16) {
			Anim rn_2467 = Anim.rn_3310("Lilypad", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2467};
		} else if (rn_2443 == 17) {
			Anim rn_2468 = Anim.rn_3310("Squash", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2468};
		} else if (rn_2443 == 18) {
			Anim rn_2469 = Anim.rn_3310("ThreePeater", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2469};
		} else if (rn_2443 == 19) {
			Anim rn_2470 = Anim.rn_3310("Tanglekelp", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2470};
		} else if (rn_2443 == 20) {
			Anim rn_2471 = Anim.rn_3310("Jalapeno", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2471};
		} else if (rn_2443 == 21) {
			Anim rn_2472 = Anim.rn_3310("Caltrop", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2472};
		} else if (rn_2443 == 22) {
			Anim rn_2473 = Anim.rn_3310("Torchwood", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2473};
		} else if (rn_2443 == 23) {
			Anim rn_2474 = Anim.rn_3310("Tallnut", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2474};
		} else if (rn_2443 == 24) {
			Anim rn_2475 = Anim.rn_3310("SeaShroom", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2475};
		} else if (rn_2443 == 25) {
			Anim rn_2476 = Anim.rn_3310("Plantern", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2476};
		} else if (rn_2443 == 26) {
			Anim rn_2477 = Anim.rn_3310("Cactus", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2477};
		} else if (rn_2443 == 27) {
			Anim rn_2478 = Anim.rn_3310("Blover", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2478};
		} else if (rn_2443 == 28) {
			Anim rn_2479 = Anim.rn_3310("SplitPea", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2479};
		} else if (rn_2443 == 29) {
			Anim rn_2480 = Anim.rn_3310("Starfruit", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2480};
		} else if (rn_2443 == 30) {
			Anim rn_2481 = Anim.rn_3310("Pumpkin", rn_2440).rn_3366("anim_idle", false);
			rn_2444.HP = 4000;
			rn_2481.speed = 0.5F;
			rn_2444.anim = new Anim[]{rn_2481};
		} else if (rn_2443 == 31) {
			Anim rn_2482 = Anim.rn_3310("Magnetshroom", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2482};
		} else if (rn_2443 == 32) {
			Anim rn_2483 = Anim.rn_3310("Cabbagepult", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2483};
		} else if (rn_2443 == 33) {
			Anim rn_2484 = Anim.rn_3310("Pot", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2484};
		} else if (rn_2443 == 34) {
			Anim rn_2485 = Anim.rn_3310("Cornpult", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2485};
		} else if (rn_2443 == 35) {
			Anim rn_2486 = Anim.rn_3310("Coffeebean", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2486};
		} else if (rn_2443 == 36) {
			Anim rn_2487 = Anim.rn_3310("Garlic", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2487};
		} else if (rn_2443 == 37) {
			Anim rn_2488 = Anim.rn_3310("Umbrellaleaf", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2488};
		} else if (rn_2443 == 38) {
			Anim rn_2489 = Anim.rn_3310("Marigold", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2489};
		} else if (rn_2443 == 39) {
			Anim rn_2490 = Anim.rn_3310("Melonpult", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2490};
		} else if (rn_2443 == 40) {
			Anim rn_2491 = Anim.rn_3310("GatlingPea", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2491};
		} else if (rn_2443 == 41) {
			Anim rn_2492 = Anim.rn_3310("TwinSunflower", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2492};
		} else if (rn_2443 == 42) {
			Anim rn_2493 = Anim.rn_3310("GloomShroom", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2493};
		} else if (rn_2443 == 43) {
			Anim rn_2494 = Anim.rn_3310("Cattail", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2494};
		} else if (rn_2443 == 44) {
			Anim rn_2495 = Anim.rn_3310("WinterMelon", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2495};
		} else if (rn_2443 == 45) {
			Anim rn_2496 = Anim.rn_3310("GoldMagnet", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2496};
		} else if (rn_2443 == 46) {
			Anim rn_2497 = Anim.rn_3310("SpikeRock", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2497};
		} else if (rn_2443 == 47) {
			Anim rn_2498 = Anim.rn_3310("TangleKelp", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2498};
		} else if (rn_2443 == 48) {
			Anim rn_2499 = Anim.rn_3310("Imitater", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2499};
		} else if (rn_2443 == 49) {
			Anim rn_2500 = Anim.rn_3310("TangleKelp", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2500};
		} else if (rn_2443 == 50) {
			Anim rn_2501 = Anim.rn_3310("TangleKelp", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2501};
		} else if (rn_2443 == 51) {
			Anim rn_2502 = Anim.rn_3310("TangleKelp", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2502};
		} else if (rn_2443 == 52) {
			Anim rn_2503 = Anim.rn_3310("TangleKelp", rn_2440).rn_3366("anim_idle", false);
			rn_2444.anim = new Anim[]{rn_2503};
		}
		rn_2444.HPM = rn_2444.HP;
		return rn_2444;
	}

	public final boolean rn_2504() {
		if (HP <= 0) {
			return true;
		}
		if (rn_2438 != -1) {
			rn_2438 = rn_2438 - 1;
			if (rn_2438 < 1) {
				return true;
			}
		}
		if (dying == false && rn_2438 == -1) {
			if (type == 0 || type == 5 || type == 7 || type == 8) {
				Zombie rn_2505 = rn_2527();
				if (type == 0 || type == 5 || type == 7 || type == 8) {
					Anim rn_2506 = null;
					if (type == 0 || type == 5 || type == 7) {
						rn_2506 = anim [0].panims.rn_3214("anim_stem");
					} else if (type == 8) {
						rn_2506 = anim [0];
					}
					if ((rn_2423 == 30 || (rn_2423 == 0 && type == 7)) && rn_2505 != null) {
						rn_2506.speed = 1.0F;
						if (type == 7) {
							rn_2506.speed = 1.8F;
						}
						String rn_2507 = rn_2506.animname;
						if (rn_3081.rn_6684(rn_2506.animReturn, "")) {
							rn_2507 = rn_2506.animReturn;
						}
						rn_2506.rn_3366("anim_shooting", true);
						rn_2506.animReturn = rn_2507;
						rn_2427 = true;
					} else if ((rn_2423 == 1 || (rn_2423 == 130 && type == 7)) && rn_2427) {
						rn_2523();
						if ((type == 7 && rn_2423 == 15) == false) {
							rn_2427 = false;
						}
					}
					if (rn_3081.rn_6684(rn_2506.animname, "anim_shooting")) {
						rn_2506.speed = 0.5F;
					}
				}
				if (rn_2427 || rn_2505 != null) {
					rn_2423 = rn_2423 - 1;
					if (rn_2423 < 0) {
						rn_2423 = rn_2424;
					}
				}
			} else if (type == 1) {
				if (rn_2423 <= 0) {
					Coin rn_2508 = Coin.rn_2601(rn_2434, static_.rn_2618, rn_2539() + 50, y);
					rn_2508.rn_2585 = -2.0F;
					rn_2508.rn_2586 = 0.04F;
					rn_2508.rn_2584 = op.rn_1038(rn_7149.rn_7163(-0.5F, 0.5F));
					rn_2508.rn_2591 = rn_2539() - 50;
					rn_2508.rn_2592 = rn_2539() + 50;
					rn_2508.rn_2593 = y + 50;
					CoinList.rn_2251(rn_2434.coinlist, rn_2508);
					rn_2423 = rn_2424;
				} else {
					rn_2423 = rn_2423 - 1;
				}
			} else if (type == 2) {
				if (anim [0].pause) {
					ParticleList.rn_2313(rn_2434.particleList, Particle.rn_2665("Powie", rn_2539(), rn_2540(), rn_2421, rn_2434));
					float rn_2509 = x + rn_2426.rn_3485;
					float rn_2510 = y + rn_2426.rn_3486;
					for (int rn_10415 = 0;rn_10415 < ZombieList.rn_1021(rn_2434.zombieList);rn_10415 += 1) {
						Zombie rn_2511 = ZombieList.rn_2149((rn_2434.zombieList), rn_10415);
						float rn_2512 = rn_2511.x + rn_2426.rn_3485 + rn_2426.rn_3487 / 2;
						float rn_2513 = rn_2511.y + rn_2426.rn_3486 + rn_2426.rn_3486 / 2;
						int rn_2514 = 140;
						if (rn_2509 - rn_2514 < rn_2512 && rn_2512 < rn_2509 + rn_2514 && (rn_2510 - rn_2514 < rn_2513 && rn_2513 < rn_2510 + rn_2514)) {
							rn_2511.damage(1800, 1);
						}
					}
					return true;
				}
			} else if (type == 3) {
				if (HP < HPM * 1 / 3) {
					anim [0].rn_3333("anim_face", "IMAGE_REANIM_" + rn_3081.rn_6711("Wallnut_cracked2"));
				} else if (HP < HPM * 2 / 3) {
					anim [0].rn_3333("anim_face", "IMAGE_REANIM_" + rn_3081.rn_6711("Wallnut_cracked1"));
				} else {
					anim [0].rn_3333("anim_face", "IMAGE_REANIM_WALLNUT_BODY");
				}
			} else if (type == 4) {
				if (rn_3081.rn_6682(state, "boom")) {
					scale = 1.2F;
					float rn_2515 = x + rn_2426.rn_3485;
					float rn_2516 = y + rn_2426.rn_3486;
					for (int rn_10416 = 0;rn_10416 < ZombieList.rn_1021(rn_2434.zombieList);rn_10416 += 1) {
						Zombie rn_2517 = ZombieList.rn_2149((rn_2434.zombieList), rn_10416);
						float rn_2518 = rn_2517.x + rn_2426.rn_3485 + rn_2426.rn_3487 / 2;
						float rn_2519 = rn_2517.y + rn_2426.rn_3486 + rn_2426.rn_3486 / 2;
						int rn_2520 = 100;
						if (rn_2515 - rn_2520 < rn_2518 && rn_2518 < rn_2515 + rn_2520 && (rn_2516 - rn_2520 < rn_2519 && rn_2519 < rn_2516 + rn_2520)) {
							rn_2517.damage(1800, 3);
						}
					}
					rn_2432 = true;
					anim [0].rn_3366("anim_mashed", false).pause = true;
					anim [0].prohibitEvolution = true;
					state = "dying";
					rn_2423 = 300;
				}
				if (rn_2423 == 0) {
					if (rn_3081.rn_6682(state, "dying")) {
						return true;
					} else {
						anim [0].rn_3366("anim_rise", false);
						anim [0].animReturn = "anim_armed";
						rn_2431 = true;
					}
				} else if (rn_2423 < 0) {
					if (rn_3081.rn_6682(anim [0].animReturn, "")) {
						state = "idle";
					}
				}
				rn_2423 = rn_2423 - 1;
			} else if (type == 6) {
				Zombie rn_2521 = rn_2527();
				if (rn_2521 != null && (rn_2423 <= 0) && rn_3081.rn_6682(anim [0].animname, "anim_idle")) {
					anim [0].speed = anim [0].speed * 2;
					state = "bite";
					anim [0].rn_3366("anim_bite", false);
					anim [0].pauseAfterBroadcasting = true;
				} else if (rn_3081.rn_6682(anim [0].animname, "anim_bite") && anim [0].frame >= 42 && rn_3081.rn_6682(state, "bite")) {
					state = "chew";
					if (rn_2521 == null) {
					} else {
						rn_2423 = 4340;
						rn_2521.die = true;
					}
				} else if (rn_3081.rn_6682(anim [0].animname, "anim_bite") && anim [0].pause) {
					anim [0].speed = 0.5F;
					anim [0].pauseAfterBroadcasting = false;
					if (rn_2423 == 0) {
						float rn_2522 = anim [0].frame;
						anim [0].rn_3366("anim_idle", false);
						anim [0].rn_3354((int) rn_2522, 4);
					} else {
						anim [0].rn_3366("anim_chew", false);
					}
				} else if (rn_2423 <= 0 && rn_3081.rn_6682(anim [0].animname, "anim_chew")) {
					state = "swall";
					anim [0].rn_3366("anim_swallow", false);
					anim [0].animReturn = "anim_idle";
				}
				if (rn_2423 > 0) {
					rn_2423 = rn_2423 - 1;
				} else {
					rn_2423 = 0;
				}
			} else if (type == 30) {
				if (HP < HPM * 1 / 4) {
					anim [0].rn_3333("Pumpkin_front", "IMAGE_REANIM_" + rn_3081.rn_6711("Pumpkin_damage3"));
				} else if (HP < HPM * 2 / 4) {
					anim [0].rn_3333("Pumpkin_front", "IMAGE_REANIM_" + rn_3081.rn_6711("Pumpkin_damage2"));
				} else if (HP < HPM * 3 / 4) {
					anim [0].rn_3333("Pumpkin_front", "IMAGE_REANIM_" + rn_3081.rn_6711("Pumpkin_damage1"));
				} else {
					anim [0].rn_3333("Pumpkin_front", "IMAGE_REANIM_" + rn_3081.rn_6711("Pumpkin_front"));
				}
			}
		}
		return false;
	}

	public final void rn_2523() {
		int rn_2524 = 50;
		int rn_2525 = 16 + rn_7149.rn_7160(0, 5) - 5;
		String rn_2526 = "ProjectilePea";
		if (type == 5) {
			rn_2526 = "ProjectileSnowPea";
		} else if (type == 8) {
			rn_2526 = "PuffShroom_puff1";
			rn_2525 = 45;
			ParticleList.rn_2313(rn_2434.particleList, Particle.rn_2665("PuffShroomMuzzle", rn_2539() + 50, rn_2540() + 45, rn_2421, rn_2434));
		}
		ProjList.rn_2220(rn_2434.projList, Proj.rn_2569(rn_2434, rn_2526, rn_2421, rn_2539() + rn_2524, y + rn_2525));
	}

	public final Zombie rn_2527() {
		Zombie rn_2528 = null;
		for (int rn_10417 = 0;rn_10417 < ZombieList.rn_1021(rn_2434.zombieList);rn_10417 += 1) {
			Zombie rn_2529 = ZombieList.rn_2149((rn_2434.zombieList), rn_10417);
			if (rn_2529.IsIntangible == false && rn_2529.row == rn_2421 && rn_2529.x() + rn_2529.cv.rn_3485 > rn_2539() - 30 && (rn_2528 == null || rn_2529.x() + rn_2528.cv.rn_3485 < rn_2528.x() + rn_2528.cv.rn_3485)) {
				rn_2528 = rn_2529;
			}
		}
		if (type == 6 && rn_2528 != null && rn_2528.x() + rn_2528.cv.rn_3485 > rn_2539() + 160) {
			return null;
		}
		if (type == 8 && rn_2528 != null && rn_2528.x() + rn_2528.cv.rn_3485 > rn_2539() + 340) {
			return null;
		}
		return rn_2528;
	}

	public final void rn_2530() {
		for (int rn_10418 = 0;rn_10418 < anim.length;rn_10418 += 1) {
			anim [rn_10418].rn_3331(true);
		}
		rn_2435 = true;
		rn_2431 = true;
		rn_2432 = true;
		dying = true;
		rn_2438 = 500;
		rn_2437 = Matrix_.rn_3422(Matrix_.rn_3406(Matrix_.rn_3395(), 1, 0.2F, 0, 60), 0, 10);
		rn_2436 = true;
	}

	public final void rn_2531(float rn_2532, float rn_2533) {
		x = x + rn_2532;
		y = y + rn_2533;
		rn_2426.rn_3485 = rn_2426.rn_3485 - rn_2532;
		rn_2426.rn_3486 = rn_2426.rn_3486 - rn_2533;
	}

	public final void rn_2534(float rn_2535, float rn_2536, float rn_2537, float rn_2538) {
		rn_2426.rn_3485 = rn_2535;
		rn_2426.rn_3486 = rn_2536;
		rn_2426.rn_3487 = rn_2537;
		rn_2426.rn_3488 = rn_2538;
	}

	public final float rn_2539() {
		return x;
	}

	public final float rn_2540() {
		return y;
	}

	public final STSL rn_2541() {
		STSL rn_2542 = new STSL();
		rn_2542.rn_3480("HP", rn_6760.rn_6765(HP));
		rn_2542.rn_3480("type", rn_6760.rn_6765(type));
		rn_2542.rn_3480("anim.name", anim [0].name);
		rn_2542.rn_3480("anim.frame", rn_6777.rn_6779(anim [0].frame));
		rn_2542.rn_3480("anim.speed", rn_6777.rn_6779(anim [0].speed));
		rn_2542.rn_3480("anim.return", anim [0].animReturn);
		rn_2542.rn_3480("x", rn_6777.rn_6779(rn_2539()));
		rn_2542.rn_3480("y", rn_6777.rn_6779(y));
		rn_2542.rn_3480("row", rn_6760.rn_6765(rn_2421));
		rn_2542.rn_3480("line", rn_6760.rn_6765(rn_2422));
		rn_2542.rn_3480("dtime", rn_6760.rn_6765(rn_2423));
		rn_2542.rn_3480("dtimemax", rn_6760.rn_6765(rn_2424));
		rn_2542.rn_3480("delayt", rn_6760.rn_6765(rn_2425));
		rn_2542.rn_3480("shable", rn_6757.rn_6758(rn_2427));
		rn_2542.rn_3480("state", state);
		return rn_2542;
	}

	public final String ToJSON() {
		org.json.JSONObject rn_2543 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_2544 = rn_8084.rn_8126(rn_4133.rn_6676(Plant.this));
		for (int rn_10419 = 0;rn_10419 < rn_2544.length;rn_10419 += 1) {
			java.lang.reflect.Field rn_2545 = rn_2544 [rn_10419];
			String classname = rn_8084.rn_8094(rn_8150.rn_8161(rn_2545));
			if (rn_3081.rn_6682(classname, "bk.pvz.Nirvana")) {
			} else if (rn_3081.rn_6682(rn_8150.rn_7729(rn_2545), "anim")) {
				try {;
				Anim[] rn_2546 = (Anim[]) (rn_8150.rn_8165(rn_2545, Plant.this));
				org.json.JSONObject rn_2547 = new org.json.JSONObject();
				for (int rn_10420 = 0;rn_10420 < rn_2546.length;rn_10420 += 1) {
					org.json.JSONObject rn_2548 = rn_4577.rn_4578(rn_4133.rn_6675(rn_2546 [rn_10420]));
					rn_4577.rn_4607(rn_2547, "i" + rn_6760.rn_6765(rn_10420), rn_2548);
				}
				rn_4577.rn_4607(rn_2543, rn_8150.rn_7729(rn_2545), rn_2547);
				} catch (Exception e) {;
				ope.rn_1798(android.util.Log.getStackTraceString(e));;
				};
			} else {
				rn_2545.setAccessible(true);
				Object rn_2549 = rn_8150.rn_8165(rn_2545, Plant.this);
				if (rn_3081.rn_6693(rn_4133.rn_6675(rn_2549), "{", 0)) {
					org.json.JSONObject rn_2550 = rn_4577.rn_4578(rn_4133.rn_6675(rn_2549));
					rn_4577.rn_4607(rn_2543, rn_8150.rn_7729(rn_2545), rn_2550);
				} else {
					rn_4577.rn_4607(rn_2543, rn_8150.rn_7729(rn_2545), rn_4133.rn_6675(rn_2549));
				}
			}
		}
		return rn_4577.rn_4614(rn_2543, 0);
	}

	public static final Plant FromJSON(String rn_2551, Nirvana rn_2552) {
		org.json.JSONObject rn_2553 = rn_4577.rn_4578(rn_2551);
		Plant rn_2554 = new Plant();
		op.rn_1194(rn_2554, rn_2553, rn_2552);
		rn_2554.rn_2434 = rn_2552;
		return rn_2554;
	}
}