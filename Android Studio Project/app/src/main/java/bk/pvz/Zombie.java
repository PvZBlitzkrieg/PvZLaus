package bk.pvz;
import bk.pvz.ParticleList;
import bk.pvz.POSLIST;
import bk.pvz.Anim;
import bk.pvz.Plant;
import rn_6672.rn_6673.rn_6674.rn_6677;
import bk.pvz.Renderinfo;
import rn_6672.rn_6673.rn_6674.rn_4133;
import bk.pvz.PlantList;
import bk.pvz.Const;
import bk.pvz.POS;
import bk.pvz.Quad;
import bk.pvz.RenderinfoList;
import bk.pvz.Rectx;
import bk.pvz.STSL;
import rn_4126.rn_4127.rn_4128.rn_8150;
import bk.pvz.ope;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4126.rn_4127.rn_4128.rn_8084;
import bk.pvz.Reanimed;
import bk.pvz.Nirvana;
import rn_4413.rn_4414.rn_4415.rn_4577;
import bk.pvz.op;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.TracleList;
import bk.pvz.Tracle;
import rn_4413.rn_4414.rn_4415.rn_7149;
import bk.pvz.ZombieList;
import bk.pvz.Matrix_;
import bk.pvz.static_;
import bk.pvz.Particle;

public class Zombie {
	// It will not be harmed
	@Override
	public String toString(){
	    return ToJSON();
	}

	public int HP = 0;
	public int HPM = 0;
	public int type = 0;
	public Anim anim = new Anim();
	public float x = 0.0F;
	public float y = 0.0F;
	public float rn_2039 = 0.0F;
	public int row = -1;
	public boolean hasH = false;
	public int HHP = 0;
	public int HHPM = 0;
	public String Htype = "";
	public boolean hasS = false;
	public int SHP = 0;
	public int SHPM = 0;
	public String Stype = "";
	public boolean isInvincible = false;
	public boolean isIgnorant = false;
	public boolean IsIntangible = false;
	public boolean hasLostArm = false;
	public boolean hasDying = false;
	public boolean Cling = false;
	public float Rotation = 0.0F;
	public int Coldness = 0;
	public int Frost = 0;
	public String spcsta = "none";
	public boolean die = false;
	public boolean frex = false;
	public boolean isCold = false;
	public int dtime = 0;
	public boolean enableBroken = false;
	public Quad limitRect = new Quad();
	public boolean lifestate = true;
	public float dancerp = 0F;
	public boolean Inactive = false;
	public float Proxy = 0F;
	public static String[] zombie_handin = {"anim_innerarm1", "anim_innerarm2", "anim_innerarm3"};
	public static String[] zombie_handout = {"Zombie_outerarm_upper", "Zombie_outerarm_lower", "Zombie_outerarm_hand"};
	public static String[] zombie_screen_hand = {"Zombie_outerarm_screendoor", "Zombie_innerarm_screendoor", "Zombie_innerarm_screendoor_hand"};
	public static String[] zombie_screen = {"anim_screendoor"};
	public static String[] zombie_cone = {"anim_cone"};
	public static String[] zombie_bucket = {"anim_bucket"};
	public static String[] zombie_flag_hand = {"Zombie_flaghand", "Zombie_innerarm_screendoor"};
	public static String[] zombie_duckytube = {"Zombie_duckytube"};
	public static String[] zombie_mustache = {"Zombie_mustache"};
	public static String[] zombie_tongue = {"anim_tongue"};
	public static String[] zombie_head = {"Zombie_mustache", "anim_tongue", "anim_head1", "anim_head2", "anim_hair"};
	public Nirvana manager = new Nirvana();
	public String state = "uninit";
	public Rectx cv = new Rectx();
	public float prex = 0.0F;
	public String walkanim = "";
	public String walkstate = "";
	public float speed = 0.0F;
	public boolean disc = false;
	public android.graphics.Matrix matrix = Matrix_.rn_3395();
	public boolean enableMatrix = false;
	public float bornx = 0.0F;
	public Zombie[] zombie = new Zombie[0];
	public boolean isPushed = false;
	public float shake = 0.0F;
	public boolean idle = false;

	public final void setCoolness(int rn_2040) {
		Coldness = rn_2040;
		isCold = true;
		anim.rn_3323("", new float[]{0.6F, 0.6F, 1.8F, 1.0F});
	}

	public final void setStay(boolean rn_2041) {
		if (rn_2041) {
			Proxy = x();
			prex = 0;
		} else if (Inactive == true) {
			x = x - prex;
			prex = 0;
		}
		Inactive = rn_2041;
	}

	public final Zombie setHPM(int rn_2044) {
		HPM = rn_2044;
		HP = HPM;
		return Zombie.this;
	}

	public final Zombie setSHPM(int rn_2045) {
		SHPM = rn_2045;
		SHP = SHPM;
		return Zombie.this;
	}

	public final Zombie setHHPM(int rn_2046) {
		HHPM = rn_2046;
		HHP = HHPM;
		return Zombie.this;
	}

	public static final Zombie create(Nirvana rn_2047, int rn_2048, int rn_2049) {
		Zombie rn_2050 = new Zombie();
		rn_2050.manager = rn_2047;
		if (rn_2048 == 12) {
			rn_2050.x = rn_7149.rn_7160(1100, 1150);
		} else {
			rn_2050.x = rn_7149.rn_7160(1000, 1050);
		}
		rn_2050.row = rn_2049;
		rn_2050.state = "walk";
		rn_2050.type = rn_2048;
		rn_2050.cv();
		rn_2050.bornx = rn_2050.x;
		if (rn_2048 == 0) {
			rn_2050.anim_Zombie(0.2F);
		} else if (rn_2048 == 1) {
			rn_2050.anim_Zombie(0.4F);
			rn_2050.setHPM(500);
			rn_2050.anim.rn_3360(Zombie.sss2ss(new String[][]{zombie_flag_hand}), 0, false);
			rn_2050.anim.rn_3360(Zombie.sss2ss(new String[][]{zombie_handin}), -1, false);
			POS rn_2051 = new POS();
			rn_2051.rn_3062(-1719.0F);
			rn_2051.rn_3054 = 20;
			rn_2051.rn_3055 = 20;
			rn_2051.rn_3050 = 10;
			rn_2051.rn_3051 = -40;
			rn_2051.rn_3059 = 0;
			rn_2051.rn_3060 = 70;
			rn_2050.anim.rn_3326("Zombie_flaghand", Anim.rn_3310("Zombie_FlagPole", rn_2047), rn_2051, true);
		} else if (rn_2048 == 2) {
			rn_2050.anim_Zombie(0.2F).anim_helmet("anim_cone", 370);
		} else if (rn_2048 == 3) {
			rn_2050.sstate("run");
			rn_2050.setHPM(500);
			rn_2050.hasH = true;
			rn_2050.y = Zombie.setY(rn_2049) - 10;
			rn_2050.anim = Anim.rn_3310("Zombie_polevaulter", rn_2047);
			rn_2050.playWalkAnim("anim_run");
			rn_2050.speed = Zombie.tool_getrandom() * 0.8F;
			rn_2050.anim.speed = rn_2050.speed * 2.0F;
			rn_2050.rn_2039 = rn_2050.speed;
			rn_2050.anim.rn_3360(Zombie.sss2ss(new String[][]{zombie_screen_hand, zombie_flag_hand, zombie_duckytube, zombie_screen, zombie_bucket, zombie_mustache}), -1, true);
			if (rn_7149.rn_7160(0, 100) < 50) {
				rn_2050.anim.rn_3360(zombie_tongue, -1, false);
			}
		} else if (rn_2048 == 4) {
			rn_2050.anim_Zombie(0.4F).anim_helmet("anim_bucket", 1100);
		} else if (rn_2048 == 5) {
			rn_2050.sstate("walk");
			rn_2050.setSHPM(150);
			rn_2050.setHPM(270);
			rn_2050.y = 50 + 100 * rn_2049;
			rn_2050.anim = Anim.rn_3310("Zombie_paper", rn_2047);
			rn_2050.Stype = "Zombie_paper_paper";
			rn_2050.playWalkAnim("anim_walk");
			rn_2050.speed = Zombie.tool_getrandom() * 0.4F;
			rn_2050.anim.speed = rn_2050.speed * 2.0F;
			rn_2050.rn_2039 = rn_2050.speed;
			rn_2050.anim_shield("Zombie_paper_paper", 150);
		} else if (rn_2048 == 6) {
			rn_2050.anim_Zombie(0.4F).anim_zombie_shield("anim_screendoor", 1100);
		} else if (rn_2048 == 7) {
			rn_2050.state = "walk";
			rn_2050.setHPM(270);
			rn_2050.anim = Anim.rn_3310("Zombie_football", rn_2047);
			rn_2050.y = rn_2050.gety();
			rn_2050.playWalkAnim("anim_walk");
			rn_2050.speed = Zombie.tool_getrandom() * 1.5F;
			rn_2050.anim.speed = rn_2050.speed * 2.0F;
			rn_2050.rn_2039 = rn_2050.speed;
			rn_2050.anim_helmet("zombie_football_helmet", 1400);
		} else if (rn_2048 == 8) {
			rn_2050.setHPM(500);
			rn_2050.anim = Anim.rn_3310("Zombie_Jackson", rn_2047);
			rn_2050.y = rn_2050.gety();
			rn_2050.playWalkAnim("anim_moonwalk");
			rn_2050.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2050.anim.speed = rn_2050.speed * 2.0F;
			rn_2050.rn_2039 = rn_2050.speed;
			rn_2050.enableMatrix = true;
			Matrix_.rn_3422(Matrix_.rn_3411(rn_2050.matrix, -1, 1), 100, 0);
			rn_2050.sstate("moonwalk");
			rn_2050.zombie = (Zombie[]) (new Zombie[4]);
		} else if (rn_2048 == 9) {
			rn_2050.setHPM(500);
			rn_2050.anim = Anim.rn_3310("Zombie_dancer", rn_2047);
			rn_2050.y = rn_2050.gety();
			rn_2050.playWalkAnim("anim_armraise");
			rn_2050.sstate("dance");
			rn_2050.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2050.anim.speed = rn_2050.speed * 2.0F;
			rn_2050.rn_2039 = rn_2050.speed;
			Matrix_.rn_3422(Matrix_.rn_3411(rn_2050.matrix, -1, 1), 100, 0);
			rn_2050.setsp(rn_2050.anim.speed / 2);
		} else if (rn_2048 == 12) {
			rn_2050.setHPM(1350);
			rn_2050.anim = Anim.rn_3310("Zombie_zamboni", rn_2047);
			rn_2050.y = rn_2050.gety();
			rn_2050.playWalkAnim("anim_drive");
			rn_2050.sstate("walk");
			rn_2050.speed = Zombie.tool_getrandom() * 0.5F;
			rn_2050.anim.speed = rn_2050.speed * 2.0F;
			rn_2050.setsp(rn_2050.anim.speed / 2);
			rn_2050.cv.rn_3485 = rn_2050.cv.rn_3485 - 100;
			rn_2050.cv.rn_3487 = rn_2050.cv.rn_3487 + 100;
		}
		rn_2050.rn_2039 = 1.0F;
		return rn_2050;
	}

	public final void sstate(String rn_2054) {
		state = rn_2054;
		walkstate = rn_2054;
	}

	public final void playWalkAnim(String rn_2055) {
		walkanim = rn_2055;
		anim.rn_3366(rn_2055, false);
	}

	public static final float tool_getrandom() {
		return rn_7149.rn_7160(850, 1150) / 1000.0F;
	}

	public final Zombie setsp(float rn_2056) {
		speed = rn_2056 * 0.5F;
		anim.speed = rn_2056;
		return Zombie.this;
	}

	public final Zombie anim_Zombie(float rn_2057) {
		sstate("walk");
		setHPM(270);
		cv();
		anim = Anim.rn_3310("Zombie", manager);
		y = gety();
		if (rn_7149.rn_7160(0, 100) < 50) {
			playWalkAnim("anim_walk");
		} else {
			playWalkAnim("anim_walk2");
		}
		speed = rn_7149.rn_7160(700, 1300) / 1000.0F * rn_2057;
		anim.speed = speed * 2.0F;
		rn_2039 = speed;
		anim.rn_3360(Zombie.sss2ss(new String[][]{zombie_screen_hand, zombie_flag_hand, zombie_duckytube, zombie_screen, zombie_cone, zombie_bucket, zombie_mustache}), -1, true);
		anim_zombie_randomtongue();
		return Zombie.this;
	}

	public final void cv() {
		cv.rn_3485 = 40;
		cv.rn_3486 = 40;
		cv.rn_3487 = 40;
		cv.rn_3488 = 80;
	}

	public final Zombie anim_helmet(String rn_2062, int rn_2063) {
		anim.rn_3360(new String[]{rn_2062}, 0, false);
		Htype = rn_2062;
		setHHPM(rn_2063);
		hasH = true;
		return Zombie.this;
	}

	public final Zombie anim_zombie_shield(String rn_2064, int rn_2065) {
		//anim_zombie_shield(name : 文本,sHP : 整数) : Zombie
		anim.rn_3360(Zombie.sss2ss(new String[][]{new String[]{rn_2064}, zombie_screen_hand}), 0, false);
		anim.rn_3360(Zombie.sss2ss(new String[][]{zombie_handin, zombie_handout}), -1, false);
		Stype = rn_2064;
		setSHPM(rn_2065);
		hasS = true;
		return Zombie.this;
	}

	public final Zombie anim_shield(String rn_2066, int rn_2067) {
		//anim_shield(name : 文本,hHP : 整数) : Zombie
		Stype = rn_2066;
		setSHPM(rn_2067);
		hasS = true;
		return Zombie.this;
	}

	public final Zombie anim_zombie_randomtongue() {
		if (rn_7149.rn_7160(0, 100) < 50) {
			anim.rn_3360(zombie_tongue, -1, false);
		}
		return Zombie.this;
	}

	public final void Mower() {
		isPushed = true;
	}

	public static final int setY(int rn_2068) {
		//setY(row : 整数) : 整数
		return 50 + 100 * rn_2068;
	}

	public static final String[] sss2ss(String[][] rn_2069) {
		int rn_2070 = 0;
		for (int rn_10396 = 0;rn_10396 < rn_2069.length;rn_10396 += 1) {
			rn_2070 = rn_2070 + rn_2069 [rn_10396].length;
		}
		int rn_2071 = 0;
		int rn_2072 = 0;
		String[] rn_2073 = (String[]) (new String[rn_2070]);
		for (int rn_10397 = 0;rn_10397 < rn_2070;rn_10397 += 1) {
			if (rn_2072 >= rn_2069 [rn_2071].length) {
				rn_2072 = 0;
				rn_2071 = rn_2071 + 1;
			}
			rn_2073 [rn_10397] = rn_2069 [rn_2071] [rn_2072];
			rn_2072 = rn_2072 + 1;
		}
		return rn_2073;
	}

	public final float gety() {
		float rn_2079 = manager.gety(row, x() + 50) - 5;
		int rn_2080 = -130;
		if (rn_3081.rn_6682(anim.name, "Zombie")) {
			rn_2080 = -130;
		} else if (rn_3081.rn_6682(anim.name, "Zombie_polevaulter") || rn_3081.rn_6682(anim.name, "Zombie_football")) {
			rn_2080 = -140;
		} else if (rn_3081.rn_6682(anim.name, "Zombie_zamboni")) {
			rn_2080 = -155;
		}
		return rn_2079 + rn_2080;
	}

	public final boolean canOverwhelming() {
		if (type == 12) {
			return true;
		}
		return false;
	}

	public final boolean Update() {
		if (idle) {
		} else {
			if (die) {
				return true;
			}
			if (isPushed) {
				Tracle rn_2081 = Tracle.rn_2645(manager, static_.rn_2622, x(), y);
				anim.pause = true;
				POS rn_2082 = new POS();
				rn_2082.rn_3062(-1719.0F);
				Anim rn_2083 = Anim.rn_3310("LawnMoweredZombie", manager).rn_3326("locator", anim, rn_2082, true);
				rn_2083.pauseAfterBroadcasting = true;
				rn_2081.rn_2640 = rn_2083;
				TracleList.rn_2282(manager.tracleList, rn_2081);
				return true;
			}
			if (rn_3081.rn_6682(anim.animname, "anim_idle")) {
			} else {
				float rn_2084 = gety();
				float rn_2085 = y - rn_2084;
				if (rn_2085 >= 1.0F) {
					y = y - 1.0F;
				} else if (rn_2085 <= -1.0F) {
					y = y + 1.0F;
				} else {
					y = rn_2084;
				}
			}
			if (frex) {
				frex = false;
			} else {
				frex = true;
			}
			if (Coldness == 0 && Frost == 0) {
				anim.speedslows = 1.0F;
			}
			if (rn_3081.rn_6682(state, "charry")) {
				Tracle rn_2086 = Tracle.rn_2645(manager, static_.rn_2623, x(), y);
				TracleList.rn_2282(manager.tracleList, rn_2086);
				return true;
			}
			if (x < 0) {
				return true;
			}
			if (Cling && (anim.frame >= anim.maxframe - 1.0F - anim.speed || anim.update)) {
				if (type == 12) {
					ParticleList.rn_2313(manager.particleList, Particle.rn_2665("ZamboniExplosion", x(), y, row, manager));
				}
				return true;
			}
			if (Cling == false) {
				if (HP <= 0) {
					Cling = true;
					isInvincible = true;
					isIgnorant = true;
					IsIntangible = true;
					String[] rn_2087 = {"anim_death"};
					if (rn_3081.rn_6682(anim.name, "Zombie")) {
						rn_2087 = new String[]{"anim_superlongdeath", "anim_death", "anim_death2"};
					}
					pos();
					anim.rn_3366(rn_2087 [rn_7149.rn_7160(0, rn_2087.length - 1)], false);
					anim.rn_3360(new String[]{"Zombie_whitewater", "Zombie_whitewater2"}, -1, false);
					anim.update = false;
					return false;
				}
				x();
			}
			if (hasDying && frex) {
				HP = HP - 1;
			}
			if (rn_3081.rn_6684(state, "eat") && type != 12) {
				java.util.ArrayList<POS> rn_2088 = anim.rn_3378("_ground").rn_2905;
				float rn_2089 = anim.frame;
				float rn_2090 = rn_2089 % 1;
				int rn_2091 = (int) (rn_2089 - rn_2090);
				if (anim.ForcedEvolutionFrame == -1) {
					if (rn_2091 >= anim.maxframe) {
						rn_2091 = anim.startframe;
						anim.frame = anim.startframe;
						pos();
					}
				}
				float rn_2092 = POSLIST.rn_2908(rn_2088, anim.startframe).rn_3050;
				float rn_2093 = POSLIST.rn_2908(rn_2088, rn_2091).rn_3050;
				int rn_2094 = rn_2091 + 1;
				if (rn_2094 >= anim.maxframe) {
					rn_2094 = anim.startframe;
					pos();
				} else {
					float rn_2095 = POSLIST.rn_2908(rn_2088, rn_2094).rn_3050;
					if (anim.update) {
						pos();
					} else if (anim.ForcedEvolutionFrame == -1) {
						prex = -1 * ((rn_2095 - rn_2093) * rn_2090 * rn_2039 + (rn_2093 - rn_2092) * rn_2039);
						if (enableMatrix) {
							float[] rn_2096 = Matrix_.rn_3398(matrix);
							prex = prex * rn_2096 [0];
						}
					}
				}
			} else if (type == 12) {
				x = x - 0.15F;
			}
			if (hasDying == false) {
				if (isIgnorant == false) {
					boolean rn_2097 = false;
					for (int rn_10400 = 0;rn_10400 < PlantList.rn_1021(manager.plantList);rn_10400 += 1) {
						Plant rn_2098 = PlantList.rn_2181((manager.plantList), rn_10400);
						if (rn_2098.rn_2421 == row && rn_2098.rn_2432 == false) {
							int rn_2099 = (int) ((int) (x()));
							int rn_2100 = (int) ((int) (rn_2098.x));
							if (cv.rn_3505(rn_2098.rn_2426, rn_2099, rn_2100)) {
								if (canOverwhelming()) {
									rn_2098.rn_2530();
								} else {
									if (type == 3 && rn_3081.rn_6682(state, "run")) {
										pos();
										anim.rn_3366("anim_jump", false);
										anim.animReturn = "anim_walk";
										state = "waitwalk";
										isInvincible = true;
										isIgnorant = true;
									} else {
										if (rn_3081.rn_6682(state, "eat")) {
										} else {
											pos();
											eh2e(false);
											if (hasS) {
												hd2eh(false);
											}
											int rn_2101 = (int) ((int) (anim.frame));
											anim.pause = false;
											anim.pauseAfterBroadcasting = false;
											if (rn_3081.rn_6682(spcsta, "gasp")) {
												anim.rn_3366("anim_eat_nopaper", false);
											} else {
												anim.rn_3366("anim_eat", false);
											}
											anim.rn_3354(rn_2101, 4);
											cstate("eat");
										}
										if (rn_2098.type == 4 && rn_3081.rn_6682(rn_2098.state, "idle")) {
											rn_2098.state = "boom";
										}
										if (rn_2098.rn_2431 == false && frex) {
											PlantList.rn_2181((manager.plantList), rn_10400).HP = PlantList.rn_2181((manager.plantList), rn_10400).HP - 1;
										}
										rn_2097 = true;
									}
								}
								break;
							}
						}
					}
					if (rn_2097 == false && rn_3081.rn_6682(state, "eat")) {
						if (hasS) {
							hd2eh(true);
						}
						eh2e(true);
						int rn_2102 = (int) ((int) (anim.frame));
						anim.rn_3366(walkanim, false);
						if (rn_2102 != anim.startframe) {
							anim.rn_3354(rn_2102, 4);
						}
						cstate(walkstate);
					}
				}
			}
			if (Cling == false) {
				if (type == 8 || (type == 9 && rn_3081.rn_6684(state, "pre"))) {
					if (rn_3081.rn_6682(state, "moonwalk")) {
						enableMatrix = Const.rn_1642;
						if (bornx - x() >= 3 * manager.gridWidth()) {
							pos();
							enableMatrix = false;
							state = "point";
							anim.rn_3366("anim_point", false);
							anim.pauseAfterBroadcasting = true;
						}
					} else if (rn_3081.rn_6682(state, "point")) {
						if (dtime == 50) {
							for (int rn_10401 = 0;rn_10401 < 4;rn_10401 += 1) {
								if ((zombie [rn_10401] == null || zombie [rn_10401].lifestate == false) && ((row == 0 && rn_10401 == 0) == false) && ((row == manager.getRowNumber() - 1 && rn_10401 == 2) == false)) {
									int rn_2103 = row;
									Zombie rn_2104 = Zombie.create(manager, 9, rn_2103);
									rn_2104.state = "pre";
									rn_2104.anim.pause = Const.rn_1642;
									if (rn_10401 == 0) {
										rn_2104.row = row - 1;
										rn_2104.x = x;
										rn_2104.y = y - manager.getRowHeight();
									} else if (rn_10401 == 1) {
										rn_2104.x = x - manager.getRowWidth();
										rn_2104.y = y;
									} else if (rn_10401 == 2) {
										rn_2104.row = row + 1;
										rn_2104.x = x;
										rn_2104.y = y + manager.getRowHeight();
									} else if (rn_10401 == 3) {
										rn_2104.x = x + manager.getRowWidth();
										rn_2104.y = y;
									}
									rn_2104.y = rn_2104.y + 100;
									rn_2104.isIgnorant = true;
									rn_2104.limitRect = Quad.rn_4118(-200, rn_2104.y - 120, 400, 145, 1, 0);
									rn_2104.enableBroken = Const.rn_1642;
									ZombieList.rn_2157(manager.zombieList, rn_2104);
									Particle rn_2105 = Particle.rn_2665("DancerRise", rn_2104.x() + 10, rn_2104.y - 15, row, manager);
									ParticleList.rn_2313(manager.particleList, rn_2105);
									zombie [rn_10401] = rn_2104;
								}
							}
						}
						if (dtime >= 200) {
							setsp(anim.speed / 2);
							dtime = 0;
							anim.rn_3366("anim_armraise", false);
							anim.update = false;
							sstate("dance");
							enableMatrix = true;
						} else {
							dtime = dtime + 1;
						}
					} else if (rn_3081.rn_6682(state, "dance")) {
						int rn_2106 = 67;
						if (type == 9) {
							rn_2106 = 21;
						}
						int rn_2107 = 46;
						if (type == 9) {
							rn_2107 = 0;
						}
						if (rn_3081.rn_6684(state, "pre") && rn_3081.rn_6684(state, "moonwalk") && rn_3081.rn_6684(state, "point") && rn_3081.rn_6684(state, "eat")) {
							anim.pause = true;
							if (dancerp < 40) {
								anim.startframe = rn_2106;
								anim.maxframe = rn_2106 + 12;
								if (anim.frame > rn_2106 + dancerp % 10) {
									pos();
								}
								anim.frame = rn_2106 + dancerp % 10;
								enableMatrix = ope.rn_1734((((int) dancerp - (int) dancerp % 10) / 10 + 1) % 2);
							} else if (dancerp < 80) {
								anim.startframe = rn_2107;
								anim.maxframe = rn_2107 + 22;
								if (anim.frame > rn_2107 + (dancerp - 40) % 20) {
									pos();
								}
								anim.frame = rn_2107 + (dancerp - 40) % 20;
								enableMatrix = false;
							} else {
								dancerp = 0;
								if (dancerNeedUpdate()) {
									state = "point";
									anim.rn_3366("anim_point", false);
									dtime = 0;
									anim.pause = false;
									anim.pauseAfterBroadcasting = Const.rn_1642;
									anim.speed = 1.0F;
								}
							}
							if (type == 8) {
								boolean rn_2108 = false;
								for (int rn_10402 = 0;rn_10402 < zombie.length;rn_10402 += 1) {
									if (zombie [rn_10402] != null && (rn_3081.rn_6682(zombie [rn_10402].state, "eat") && zombie [rn_10402].lifestate == Const.rn_1642)) {
										zombie [rn_10402].enableMatrix = false;
										rn_2108 = true;
										break;
									}
								}
								setStay(rn_2108);
								for (int rn_10403 = 0;rn_10403 < zombie.length;rn_10403 += 1) {
									if (zombie [rn_10403] != null) {
										zombie [rn_10403].setStay(rn_2108);
									}
								}
							}
						}
						float rn_2109 = dancerp;
						dancerp = dancerp + 0.2F;
						if (dancerp >= 60.0F && rn_2109 < 60.0F) {
							pos();
						}
						for (int rn_10404 = 0;rn_10404 < zombie.length;rn_10404 += 1) {
							if (zombie [rn_10404] != null) {
								zombie [rn_10404].dancerp = dancerp;
							}
						}
					} else if (type == 8 && rn_3081.rn_6682(state, "eat")) {
						enableMatrix = false;
						for (int rn_10405 = 0;rn_10405 < zombie.length;rn_10405 += 1) {
							if (zombie [rn_10405] != null) {
								zombie [rn_10405].setStay(true);
							}
						}
					}
				} else if (type == 9) {
					if (rn_3081.rn_6682(state, "pre")) {
						dtime = dtime + 1;
						if (dtime == 100) {
							enableBroken = false;
							anim.pause = true;
							sstate("dance");
							dtime = 0;
							isIgnorant = false;
							enableMatrix = true;
							anim.pause = false;
							anim.pauseAfterBroadcasting = Const.rn_1642;
						}
					}
				} else if (type == 12) {
				}
			}
			anim.update = false;
			immUpdate();
		}
		return false;
	}

	public final void immUpdate() {
		if (rn_3081.rn_6696(anim.animname, "nopaper") && rn_3081.rn_6682(spcsta, "doubt")) {
			anim.speed = anim.speed * 4;
			speed = speed * 4;
			spcsta = "gasp";
		}
		if (rn_3081.rn_6682(state, "waitwalk") && anim.hasReplay) {
			sstate("walk");
			walkanim = "anim_walk";
			anim.hasReplay = false;
			anim.speed = speed * 2.0F;
			x = x - 147;
			isInvincible = false;
			isIgnorant = false;
			anim.rn_3360(new String[]{"Zombie_polevaulter_pole", "Zombie_polevaulter_pole2"}, -1, false);
		}
		if (isCold && Coldness <= 0) {
			anim.rn_3323("", new float[]{1.0F, 1.0F, 1.0F, 1.0F});
		}
	}

	public final boolean dancerNeedUpdate() {
		if (type == 8) {
			for (int rn_10406 = 0;rn_10406 < 4;rn_10406 += 1) {
				if ((zombie [rn_10406] == null && (row == 0 && rn_10406 == 0) == false && (row == manager.getRowNumber() - 1 && rn_10406 == 2) == false) || (zombie [rn_10406] != null && zombie [rn_10406].lifestate == false)) {
					return true;
				}
			}
		}
		return false;
	}

	public final void pos() {
		if (Inactive == false) {
			x = x + prex;
			prex = 0;
		}
	}

	public final void cstate(String rn_2110) {
		if (rn_3081.rn_6682(state, "walk")) {
			pos();
		}
		if (rn_3081.rn_6682(rn_2110, "eat")) {
			anim.speed = 1.0F;
		} else {
			anim.speed = speed * 2.0F;
		}
		state = rn_2110;
	}

	public final float x() {
		if (Inactive) {
			return Proxy;
		} else {
			return x + prex;
		}
	}

	public final void damage(int rn_2111, int rn_2112) {
		if (rn_2112 == 2) {
			if ((hasS || type == 12) == false) {
				setCoolness(1000);
			}
		}
		if (hasS) {
			if (SHP < rn_2111) {
				rn_2111 = rn_2111 - SHP;
				SHP = 0;
				delShield();
			} else {
				SHP = SHP - rn_2111;
				glow(Stype, 1.5F, 10);
				try {;
				if (SHP < SHPM * 1.0F / 3.0F) {
					String rn_2113 = POSLIST.rn_2908((anim.rn_3378(Stype).rn_2905), 0).rn_3058;
					anim.rn_3333(Stype, rn_3081.rn_6719(rn_2113, 0, rn_6677.rn_1021(rn_2113) - 2) + "3");
				} else if (SHP < SHPM * 2.0F / 3.0F) {
					String rn_2114 = POSLIST.rn_2908((anim.rn_3378(Stype).rn_2905), 0).rn_3058;
					anim.rn_3333(Stype, rn_3081.rn_6719(rn_2114, 0, rn_6677.rn_1021(rn_2114) - 2) + "2");
				}
				} catch (Exception e) {;
				ope.rn_1798(Stype);
				};
				return ;
			}
		}
		if (hasH) {
			if (HHP < rn_2111) {
				rn_2111 = rn_2111 - HHP;
				HHP = 0;
				delHelmet();
			} else {
				HHP = HHP - rn_2111;
				glow(Htype, 1.5F, 10);
				if (HHP < HHPM * 1.0F / 3.0F) {
					String rn_2115 = POSLIST.rn_2908((anim.rn_3378(Htype).rn_2905), 0).rn_3058;
					int rn_2116 = 1;
					if (rn_3081.rn_6696(rn_2115, "1")) {
						rn_2116 = 2;
					}
					anim.rn_3333(Htype, rn_3081.rn_6719(rn_2115, 0, rn_6677.rn_1021(rn_2115) - rn_2116) + "3");
				} else if (HHP < HHPM * 2.0F / 3.0F) {
					String rn_2117 = POSLIST.rn_2908((anim.rn_3378(Htype).rn_2905), 0).rn_3058;
					int rn_2118 = 1;
					if (rn_3081.rn_6696(rn_2117, "1")) {
						rn_2118 = 2;
					}
					anim.rn_3333(Htype, rn_3081.rn_6719(rn_2117, 0, rn_6677.rn_1021(rn_2117) - rn_2118) + "2");
				}
				return ;
			}
		}
		if (HP < rn_2111) {
			HP = 0;
			if (rn_2112 == 1) {
				state = "charry";
			}
		} else {
			HP = HP - rn_2111;
		}
		glow("", 1.5F, 10);
		if (hasLostArm == false && HP < HPM * 2.0F / 3.0F) {
			hasLostArm = true;
			int[] rn_2119 = {0, 1, 2, 4, 5, 6, 7, 8, 9, 10};
			if (op.rn_1271(rn_2119, type)) {
				beBreak(new String[]{"Zombie_outerarm_lower", "Zombie_outerarm_hand"}, 50);
				anim.rn_3333("Zombie_outerarm_upper", "IMAGE_REANIM_" + rn_3081.rn_6711("Zombie_outerarm_upper2"));
			} else if (type == 3) {
				beBreak(new String[]{"Zombie_polevaulter_outerarm_lower", "Zombie_outerarm_hand"}, 50);
				anim.rn_3333("Zombie_polevaulter_outerarm_upper", "IMAGE_REANIM_" + rn_3081.rn_6711("Zombie_polevaulter_outerarm_upper2"));
			}
		}
		if (type == 12) {
			if (HP < HPM * 0.1F) {
				lifestate = false;
				hasDying = true;
				shake = 3.0F;
			} else if (HP < HPM * 0.4F) {
				anim.rn_3333("Zombie_zamboni_1", "IMAGE_REANIM_" + rn_3081.rn_6711("Zombie_zamboni_1_damage2"));
			} else if (HP < HPM * 0.7F) {
				anim.rn_3333("Zombie_zamboni_1", "IMAGE_REANIM_" + rn_3081.rn_6711("Zombie_zamboni_1_damage1"));
			} else {
				anim.rn_3333("Zombie_zamboni_1", "IMAGE_REANIM_" + rn_3081.rn_6711("Zombie_zamboni_1"));
			}
		} else {
			if (hasDying == false && HP < HPM * 1.0F / 3.0F) {
				lifestate = false;
				hasDying = true;
				beBreak(zombie_head, 100);
			}
		}
		return ;
	}

	public final void beBreak(String[] rn_2120, int rn_2121) {
		String[] rn_2122 = anim.rn_3357(rn_2120);
		anim.rn_3360(rn_2120, -1, false);
		Tracle rn_2123 = Tracle.rn_2645(manager, -1, x(), y);
		rn_2123.rn_2640 = anim.rn_3308().rn_3360(rn_2122, 0, true);
		rn_2123.rn_2634 = ope.rn_1684(0.1F, 0.7F);
		rn_2123.rn_2629 = rn_2123.rn_2634;
		rn_2123.rn_2630 = 1.8F;
		rn_2123.rn_2637 = y + rn_2121;
		rn_2123.rn_2652(30 + (int) (rn_2121 / rn_2123.rn_2630));
		TracleList.rn_2282(manager.tracleList, rn_2123);
	}

	public final void glow(String rn_2124, float rn_2125, float rn_2126) {
		float[] rn_2127 = {rn_2125, rn_2125, rn_2125, 1.0F};
		if (rn_3081.rn_6682(rn_2124, "")) {
			for (int rn_10407 = 0;rn_10407 < Reanimed.rn_1021(anim.rean);rn_10407 += 1) {
				RenderinfoList.rn_3278((anim.RenderValue), rn_10407).rn_3245(rn_2127, rn_2126);
			}
		} else {
			anim.rn_3319(rn_2124, rn_2127, rn_2126);
		}
	}

	public final void delHelmet() {
		hasH = false;
		beBreak(new String[]{Htype}, 100);
	}

	public final void delShield() {
		hasS = false;
		beBreak(new String[]{Stype}, 10);
		hd2eh(false);
		if (type == 5) {
			pos();
			if (rn_3081.rn_6682(anim.animname, "anim_eat")) {
				anim.rn_3366("anim_gasp", false);
				anim.animReturn = "anim_eat_nopaper";
			} else {
				anim.rn_3366("anim_gasp", false);
				anim.animReturn = "anim_walk_nopaper";
			}
			spcsta = "doubt";
		}
	}

	public final void hd2eh(boolean rn_2128) {
		int rn_2129 = -1;
		int rn_2130 = 0;
		if (rn_2128) {
			rn_2129 = 0;
			rn_2130 = -1;
		}
		anim.rn_3360(zombie_screen_hand, rn_2129, false);
		anim.rn_3360(Zombie.sss2ss(new String[][]{zombie_handout, zombie_handin}), rn_2130, false);
	}

	public final void eh2e(boolean rn_2131) {
		int rn_2132 = -1;
		int rn_2133 = 0;
		if (rn_2131) {
			rn_2132 = 0;
			rn_2133 = -1;
		}
	}

	public final STSL info() {
		STSL rn_2134 = new STSL();
		rn_2134.rn_3480("BHP", rn_6760.rn_6765(HP) + "/" + rn_6760.rn_6765(HPM));
		String rn_2135 = "0";
		if (hasH) {
			rn_2135 = HHP + "/" + HHPM + "<" + Htype + ">";
		}
		rn_2134.rn_3480("HHP", rn_2135);
		String rn_2136 = "0";
		if (hasS) {
			rn_2136 = SHP + "/" + SHPM + "<" + Stype + ">";
		}
		rn_2134.rn_3480("SHP", rn_2136);
		rn_2134.rn_3480("type", rn_6760.rn_6765(type));
		rn_2134.rn_3480("state", rn_4133.rn_6675(state));
		rn_2134.rn_3480("dtime", rn_6760.rn_6765(dtime));
		rn_2134.rn_3480("prex", rn_6777.rn_6779(prex));
		rn_2134.rn_3480("ddt", rn_6777.rn_6779(dancerp));
		rn_2134.rn_3480("anim.name", anim.name + "<" + anim.animname + ">");
		rn_2134.rn_3480("anim.frame", rn_6777.rn_6779(anim.frame));
		rn_2134.rn_3480("anim.startframe", rn_6760.rn_6765(anim.startframe));
		rn_2134.rn_3480("anim.maxframe", rn_6760.rn_6765(anim.maxframe));
		rn_2134.rn_3480("anim.speed", rn_6777.rn_6779(anim.speed));
		rn_2134.rn_3480("anim.mustframe", rn_6760.rn_6765(anim.ForcedEvolutionFrame));
		rn_2134.rn_3480("anim.musttime", rn_6777.rn_6779(anim.ForcedEvolutionTime));
		rn_2134.rn_3480("anim.mustprocess", rn_6777.rn_6779(anim.ForcedEvolutionProc));
		rn_2134.rn_3480("anim.return", anim.animReturn);
		rn_2134.rn_3480("anim.stop", rn_6757.rn_6758(anim.pause));
		rn_2134.rn_3480("anim.update", rn_6757.rn_6758(anim.update));
		rn_2134.rn_3480("x", rn_6777.rn_6779(x()));
		rn_2134.rn_3480("y", rn_6777.rn_6779(y));
		rn_2134.rn_3480("xv", rn_6777.rn_6779(rn_2039));
		rn_2134.rn_3480("row", rn_6760.rn_6765(row));
		rn_2134.rn_3480("isInvincible", rn_6757.rn_6758(isInvincible));
		rn_2134.rn_3480("isUndetectable", rn_6757.rn_6758(isIgnorant));
		rn_2134.rn_3480("isIntangible", rn_6757.rn_6758(IsIntangible));
		rn_2134.rn_3480("cold", rn_6760.rn_6765(Coldness));
		rn_2134.rn_3480("freeze", rn_6760.rn_6765(Frost));
		rn_2134.rn_3480("enableMatrix", rn_6757.rn_6758(enableMatrix));
		return rn_2134;
	}

	public final String ToJSON() {
		org.json.JSONObject rn_2137 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_2138 = rn_8084.rn_8126(rn_4133.rn_6676(Zombie.this));
		for (int rn_10408 = 0;rn_10408 < rn_2138.length;rn_10408 += 1) {
			java.lang.reflect.Field rn_2139 = rn_2138 [rn_10408];
			String classname = rn_8084.rn_8094(rn_8150.rn_8161(rn_2139));
			if (rn_3081.rn_6682(classname, "bk.pvz.Nirvana") || rn_3081.rn_6693(rn_8150.rn_7729(rn_2139), "zombie", 0)) {
			} else {
				rn_2139.setAccessible(true);
				Object rn_2140 = rn_8150.rn_8165(rn_2139, Zombie.this);
				if (rn_3081.rn_6693(rn_4133.rn_6675(rn_2140), "{", 0)) {
					org.json.JSONObject rn_2141 = rn_4577.rn_4578(rn_4133.rn_6675(rn_2140));
					rn_4577.rn_4607(rn_2137, rn_8150.rn_7729(rn_2139), rn_2141);
				} else {
					rn_4577.rn_4607(rn_2137, rn_8150.rn_7729(rn_2139), rn_4133.rn_6675(rn_2140));
				}
			}
		}
		return rn_4577.rn_4614(rn_2137, 0);
	}

	public static final Zombie FromJSON(String rn_2142, Nirvana rn_2143) {
		org.json.JSONObject rn_2144 = rn_4577.rn_4578(rn_2142);
		Zombie rn_2145 = new Zombie();
		op.rn_1194(rn_2145, rn_2144, rn_2143);
		rn_2145.manager = rn_2143;
		return rn_2145;
	}
}