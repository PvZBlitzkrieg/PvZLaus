package bk.pvz;
import android.graphics.*;
import android.graphics.Bitmap.Config;
import bk.pvz.Pixmap_;
import bk.pvz.Grain;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Anim;
import rn_4581.rn_4582.rn_4583.rn_7317;
import bk.pvz.ints;
import bk.pvz.Reanimed;
import bk.pvz.ParticleList;
import bk.pvz.Point;
import bk.pvz.XMLRED;
import bk.pvz.MowerList;
import bk.pvz.Userdata;
import rn_4581.rn_4582.rn_4583.rn_10083;
import bk.pvz.TextureRegion_;
import bk.pvz.Nlimage;
import rn_4581.rn_4582.rn_4583.rn_9721;
import bk.pvz.ProjList;
import rn_6840.rn_6841.rn_6842.rn_6845;
import bk.pvz.DrawStyles;
import bk.pvz.POS_int;
import bk.pvz.Recta;
import bk.pvz.Detrect;
import bk.pvz.Colorset;
import bk.pvz.String2RectList;
import bk.pvz.RenderinfoList;
import bk.pvz.ShaderProgram_;
import bk.pvz.Paint_;
import rn_6840.rn_6841.rn_6842.rn_6925;
import bk.pvz.Particle;
import bk.pvz.CoinList;
import bk.pvz.Plant;
import bk.pvz.Images;
import bk.pvz.Stringk;
import bk.pvz.Matrix_;
import bk.pvz.Coin;
import bk.pvz.FrameBuffer_;
import bk.pvz.BitmapFont_;
import bk.pvz.Rectx;
import bk.pvz.Texture_;
import bk.pvz.DrawStyle;
import rn_6840.rn_6841.rn_6842.rn_6935;
import bk.pvz.PlantList;
import rn_4581.rn_4582.rn_4583.rn_8820;
import bk.pvz.UserdataList;
import bk.pvz.ProxyAnim;
import rn_6840.rn_6841.rn_6842.rn_6961;
import bk.pvz.Matrix4_;
import bk.pvz.GrainSet;
import rn_4581.rn_4582.rn_4583.rn_9105;
import bk.pvz.POS;
import rn_4294.rn_4295.rn_4296.rn_4366;
import bk.pvz.Tracle;
import bk.pvz.Color_;
import bk.pvz.STSL;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Reanim;
import bk.pvz.XMLR;
import bk.pvz.Zombie;
import bk.pvz.static_;
import bk.pvz.TracleList;
import bk.pvz.Boolarray;
import bk.pvz.reanims;
import rn_4581.rn_4582.rn_4583.rn_7395;
import bk.pvz.op;
import bk.pvz.RectaList;
import bk.pvz.Userdatas;
import rn_4294.rn_4295.rn_4296.rn_4434;
import bk.pvz.Renderinfo;
import bk.pvz.Proj;
import bk.pvz.ZombieList;
import bk.pvz.ope;
import bk.pvz.Matrix3_;
import bk.pvz.FileHandle_;
import rn_6840.rn_6841.rn_6842.rn_6945;
import bk.pvz.String_Nlimage;
import bk.pvz.SpriteBatch;
import bk.pvz.Typeface_;
import bk.pvz.Mower;
import rn_4581.rn_4582.rn_4583.rn_9923;
import bk.pvz.Animed;
import bk.pvz.CartSet;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_4581.rn_4582.rn_4583.rn_8813;
import bk.pvz.BitmapFontData_;
import bk.pvz.Const;

public class Nirvana {	public int rn_445 = 5;
	public java.util.HashMap<String, Nlimage> rn_446 = new java.util.HashMap<String, Nlimage>();
	public Stringk rn_447 = Stringk.rn_3085("");
	public reanims rn_448 = new reanims();
	public boolean rn_449 = false;
	public Images rn_450 = new Images();
	public STSL rn_451 = new STSL();
	public XMLR rn_452 = new XMLR();
	public com.badlogic.gdx.graphics.g2d.SpriteBatch rn_453 = null;
	public com.badlogic.gdx.graphics.glutils.FrameBuffer rn_454 = null;
	public int rn_455 = 0;
	public int rn_456 = 0;
	public android.app.Activity rn_457 = null;
	public float rn_458 = 0.0F;
	public float rn_459 = 0.0F;
	public int rn_460 = 0;
	public float rn_461 = 1.0F;
	public java.util.HashMap<String, String> rn_462 = new java.util.HashMap<String, String>();
	public int rn_463 = 15;
	public android.graphics.Typeface rn_464 = null;
	public float rn_465 = -1.0F;
	public float rn_466 = -1.0F;
	public float rn_467 = -1.0F;
	public float rn_468 = -1.0F;
	public long rn_469 = 0;
	public android.view.MotionEvent rn_470 = null;
	public float rn_471 = -1.0F;
	public Anim rn_472 = new Anim();
	public float rn_473 = -1.0F;
	public int rn_474 = 0;
	public float rn_475 = 1.0F;
	public String2RectList rn_476 = new String2RectList();
	public java.util.ArrayList<Zombie> rn_477 = new java.util.ArrayList<Zombie>();
	public java.util.ArrayList<Plant> rn_478 = new java.util.ArrayList<Plant>();
	public java.util.ArrayList<Proj> rn_479 = new java.util.ArrayList<Proj>();
	public java.util.ArrayList<Tracle> rn_480 = new java.util.ArrayList<Tracle>();
	public java.util.ArrayList<Particle> rn_481 = new java.util.ArrayList<Particle>();
	public int[] rn_482 = {0, 1, 2, 3, 4, 5};
	public int[] rn_483 = {0, 0, 0, 0, 0, 0};
	public int rn_484 = 0;
	public int rn_485 = 50;
	public int rn_486 = 70;
	public int rn_487 = 2;
	public int rn_488 = 8;
	public android.graphics.Bitmap rn_489 = null;
	public int rn_490 = 50;
	public int rn_491 = 1100;
	public java.util.ArrayList<Coin> rn_492 = new java.util.ArrayList<Coin>();
	public int rn_493 = 0;
	public int rn_494 = 0;
	public int rn_495 = 0;
	public int rn_496 = 0;
	public int rn_497 = 1;
	public int rn_498 = 0;
	public int rn_500 = 0;
	public Anim rn_501 = null;
	public int rn_502 = 0;
	public int rn_503 = 0;
	public float rn_504 = 0.0F;
	public float rn_505 = 0.0F;
	public int rn_506 = 0;
	public boolean rn_507 = false;
	public int rn_508 = 0;
	public int rn_509 = 0;
	public int rn_510 = 0;
	public XMLR rn_511 = new XMLR();
	public int rn_512 = 0;
	public float rn_513 = 0.0F;
	public String rn_514 = "";
	public String rn_515 = "";
	public DrawStyle rn_518 = new DrawStyle();
	public DrawStyle rn_519 = new DrawStyle();
	public long rn_521 = 0;
	public long rn_522 = 0;
	public int rn_523 = 1;
	public com.badlogic.gdx.graphics.glutils.ShaderProgram rn_524 = null;
	public com.badlogic.gdx.graphics.g2d.BitmapFont rn_525 = null;
	public boolean rn_526 = true;
	public boolean rn_527 = true;
	public java.util.ArrayList<Anim> rn_528 = new java.util.ArrayList<Anim>();
	public Userdatas rn_529 = new Userdatas();
	public String rn_530 = "none";
	public Recta rn_531 = new Recta();
	public int rn_532 = 0;
	public boolean rn_533 = false;
	public com.badlogic.gdx.graphics.Texture rn_534 = null;
	public float rn_535 = 0.0F;
	public com.badlogic.gdx.graphics.Texture rn_536 = null;
	public com.badlogic.gdx.graphics.Texture rn_537 = null;
	public com.badlogic.gdx.graphics.Texture rn_538 = null;
	public int rn_539 = 0;
	public boolean rn_540 = false;
	public float rn_541 = 0.0F;
	public int[] rn_542 = (int[]) (new int[6]);
	public CartSet rn_543 = new CartSet();
	public String rn_545 = "";
	public int rn_546 = 0;
	public boolean rn_547 = true;
	public java.util.ArrayList<DrawStyle> rn_548 = new java.util.ArrayList<DrawStyle>();
	public int rn_549 = -1;
	public int rn_550 = 0;
	public int rn_551 = 25;
	public boolean rn_552 = false;
	public int rn_553 = -1;
	public String rn_555 = "";

	public final void rn_560(int rn_561, int rn_562) {
		rn_796();
		rn_489 = rn_9105.rn_9108("/storage/emulated/0/.pvz/plant_cards.png");
		rn_464 = Typeface_.rn_1776("/storage/emulated/0/.pvz/main/fzse_gbk.ttf");
		rn_455 = rn_562 * 4 / 3;
		rn_456 = rn_562;
		rn_461 = rn_456 / 600.0F / rn_523;
		rn_473 = (rn_561 - rn_455) / 2 / rn_523;
		ope.rn_1925("width=" + rn_455);
		ope.rn_1925("height=" + rn_456);
		ope.rn_1925("scale=" + rn_461);
		rn_447 = new Stringk("加载场景");
		XMLR.rn_3056(rn_452, Stringk.rn_3085(rn_9923.rn_9963("/storage/emulated/0/.pvz/pvz/properties/config.xml", "UTF-8")), 0);
		XMLR.rn_3056(rn_511, Stringk.rn_3085(rn_9923.rn_9963("/storage/emulated/0/.pvz/pvz/properties/levels.xml", "UTF-8")), 0);
		rn_450.rn_3644(rn_447, rn_451);
		Nlimage rn_563 = new Nlimage();
		rn_563.rn_3632 = "/storage/emulated/0/.pvz/pvz/reanim/SodRollCap.png";
		String_Nlimage.rn_3331(rn_450.rn_3643, "SodRollCap", rn_563);
		rn_1052();
		rn_533 = true;
	}
	public com.badlogic.gdx.graphics.Texture[] rn_564 = (com.badlogic.gdx.graphics.Texture[]) (new com.badlogic.gdx.graphics.Texture[256]);

	public final com.badlogic.gdx.graphics.Texture rn_565(int rn_566) {
		if (rn_564 [rn_566] == null) {
			com.badlogic.gdx.graphics.Texture rn_567 = Texture_.rn_4059(Pixmap_.rn_4087(rn_569(rn_566)));
			rn_564 [rn_566] = rn_567;
			return rn_567;
		} else {
			return rn_564 [rn_566];
		}
	}
	public android.graphics.Bitmap[] rn_568 = (android.graphics.Bitmap[]) (new android.graphics.Bitmap[256]);

	public final android.graphics.Bitmap rn_569(int rn_570) {
		if (rn_568 [rn_570] == null) {
			int rn_571 = rn_570 % 8;
			int rn_572 = (rn_570 - rn_571) / 8;
			int rn_573 = rn_571 * (rn_485 + rn_487);
			int rn_574 = rn_572 * (rn_486 + rn_488);
			android.graphics.Bitmap rn_575 = ope.rn_1879(rn_489, rn_573, rn_574, 50, 70);
			rn_568 [rn_570] = rn_575;
			return rn_575;
		} else {
			return rn_568 [rn_570];
		}
	}

	public final Nlimage rn_576(String rn_577) {
		return String_Nlimage.rn_3324((rn_450.rn_3643), rn_451.rn_3664(rn_577));
	}

	public final com.badlogic.gdx.graphics.g2d.TextureRegion 法外狂徒(int rn_579, int rn_580) {
		if (rn_525 == null) {
			String rn_581 = "/storage/emulated/0/.pvz/fonts/ziti";
			int rn_582 = 28;
			com.badlogic.gdx.graphics.g2d.TextureRegion[] rn_583 = (com.badlogic.gdx.graphics.g2d.TextureRegion[]) (new com.badlogic.gdx.graphics.g2d.TextureRegion[rn_582]);
			for (int rn_10413 = 0;rn_10413 < rn_583.length;rn_10413 += 1) {
				com.badlogic.gdx.graphics.Texture rn_584 = Texture_.rn_4061(FileHandle_.rn_4172(rn_581 + rn_6928.rn_6933((rn_10413 + 1)) + ".png"));
				rn_583 [rn_10413] = TextureRegion_.rn_3989(rn_584);
			}
			rn_525 = BitmapFont_.rn_4154(FileHandle_.rn_4172(rn_581 + ".fnt"), ope.rn_1917(rn_583));
		}
		if (rn_534 == null) {
			com.badlogic.gdx.graphics.Pixmap rn_585 = Pixmap_.rn_4082(1, 1);
			rn_585.setColor(0x000000ff);
			rn_585.fill();
			rn_534 = Texture_.rn_4059(rn_585);
		}
		rn_515 = "";
		rn_521 = rn_996 / 1000000;
		rn_522 = rn_997;
		rn_996 = 0L;
		rn_997 = 0L;
		if (rn_453 != null) {
			rn_453.enableBlending();
			rn_453.setBlendFunction(0x302, 0x303);
			rn_453.setShader(rn_524);
			FrameBuffer_.rn_4098(rn_454);
			SpriteBatch.rn_4000(rn_453);
			SpriteBatch.rn_4054(rn_453, Matrix4_.rn_4122(Matrix3_.rn_4120(ope.rn_1903(Matrix_.rn_3579(Matrix_.rn_3576())))));
			ShaderProgram_.rn_4106(rn_524, "u_rgbFactors", 1, 1, 1);
			ShaderProgram_.rn_4111(rn_524, "u_clipRegion", 0, 0, rn_455, rn_456);
			float rn_586 = rn_579 * 1.0F / rn_580;
			if (rn_10083.rn_10089() - rn_469 > 20 && rn_470 != null) {
				Thread thread = new Thread(new Runnable() { public void run() {;
				rn_928(rn_470, true);
				rn_470 = null;
				}}); thread.start();
			}
			for (int rn_10414 = 0;rn_10414 < Animed.rn_1225(rn_528);rn_10414 += 1) {
				DrawStyle rn_587 = new DrawStyle();
				rn_587.rn_3773 = Animed.rn_3374(rn_528, rn_10414);
				rn_587.rn_3774 = 1.0F;
				rn_587.rn_3775 = 1.0F;
				rn_587.rn_3776 = 0.0F;
				rn_587.rn_3777 = 0.0F;
				rn_587.rn_3780 = -1;
				rn_587.rn_3781 = 0;
				rn_587.rn_3782 = 0;
				rn_985(rn_453, rn_587, rn_586);
			}
			if (rn_445 == 5) {
				com.badlogic.gdx.Gdx.gl.glClearColor(0,0,0,1);;
				com.badlogic.gdx.Gdx.gl.glClear(com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT | com.badlogic.gdx.graphics.GL20.GL_DEPTH_BUFFER_BIT);;
				XMLR rn_588 = (rn_452).rn_3032("image").rn_3032("logo");
				String rn_589 = rn_588.rn_3038("ImageRelativePath");
				float rn_590 = rn_3289.rn_6899(rn_588.rn_3038("scale"));
				android.graphics.Matrix rn_591 = Matrix_.rn_3576();
				com.badlogic.gdx.graphics.Texture rn_592 = String_Nlimage.rn_3336(rn_450.rn_3643, rn_589).rn_3634().rn_2068(1, 1, 0);
				float rn_593 = rn_455 * rn_590 / Texture_.rn_4065(rn_592);
				Matrix_.rn_3592(rn_591, rn_593, rn_593);
				Matrix_.rn_3603(rn_591, (rn_455 - Texture_.rn_4065(rn_592) * rn_593) / 2, (rn_456 - Texture_.rn_4066(rn_592) * rn_593) / 2);
				SpriteBatch.rn_4021(rn_453, rn_592, rn_591, rn_475, rn_456, null);
				rn_484 = rn_484 + rn_579;
				ope.rn_1923(rn_591);
				ope.rn_1923(rn_592);
			} else if (rn_445 == 0) {
				XMLR rn_594 = (rn_452).rn_3032("image").rn_3032("title");
				String rn_595 = rn_594.rn_3038("ImageRelativePath");
				com.badlogic.gdx.graphics.Texture rn_596 = String_Nlimage.rn_3336(rn_450.rn_3643, rn_594.rn_3038("dirt")).rn_3634().rn_2068(1, 1, 0);
				float rn_597 = rn_3289.rn_6899(rn_594.rn_3038("dirt_bottom")) * rn_461;
				com.badlogic.gdx.graphics.Pixmap rn_598 = String_Nlimage.rn_3336(rn_450.rn_3643, rn_594.rn_3038("grass")).rn_3634().rn_2054(1, 1, 0);
				float rn_599 = rn_3289.rn_6899(rn_594.rn_3038("grass_bottom")) * rn_461;
				com.badlogic.gdx.graphics.Texture rn_600 = String_Nlimage.rn_3336(rn_450.rn_3643, rn_595).rn_3634().rn_2068(1, 1, 0);
				float rn_601 = rn_3289.rn_6899(rn_594.rn_3038("logo_top")) * rn_461;
				android.graphics.Matrix rn_602 = Matrix_.rn_3592(Matrix_.rn_3576(), rn_461, rn_461);
				SpriteBatch.rn_4021(rn_453, rn_600, rn_602, 1.0F, rn_456, null);
				android.graphics.Matrix rn_603 = Matrix_.rn_3577(rn_602);
				Matrix_.rn_3603(rn_603, rn_980(Texture_.rn_4065(rn_596) * rn_461) + 7 * rn_461, rn_456 - rn_597);
				SpriteBatch.rn_4021(rn_453, rn_596, rn_603, 1.0F, rn_456, null);
				android.graphics.Matrix rn_604 = Matrix_.rn_3577(rn_602);
				float rn_605 = rn_980(Pixmap_.rn_4093(rn_598) * rn_461);
				float rn_606 = rn_456 - rn_599;
				Matrix_.rn_3603(rn_604, rn_605, rn_606);
				float rn_607 = rn_978();
				int rn_608 = (int) (rn_607 * Pixmap_.rn_4093(rn_598));
				if (rn_608 > 0 && rn_608 <= Pixmap_.rn_4093(rn_598)) {
					rn_598 = ope.rn_1885(rn_598, 0, 0, rn_608, Pixmap_.rn_4094(rn_598));
					SpriteBatch.rn_4005(rn_453, rn_598, rn_604, 1.0F, rn_456);
				}
				com.badlogic.gdx.graphics.Texture rn_609 = String_Nlimage.rn_3336(rn_450.rn_3643, "SodRollCap").rn_3634().rn_2068(1, 1, 0);
				android.graphics.Matrix rn_610 = Matrix_.rn_3577(rn_602);
				float rn_611 = 1.0F - rn_607 * 0.65F;
				float rn_612 = rn_608 * rn_461 + rn_605 - Texture_.rn_4065(rn_609) * rn_461 / 2;
				float rn_613 = rn_456 - rn_599 - Texture_.rn_4066(rn_609) * rn_461 + Pixmap_.rn_4094(rn_598) * rn_461;
				Matrix_.rn_3581(rn_610, rn_607 * 720.0F, Texture_.rn_4065(rn_609) * rn_461 / 2, Texture_.rn_4066(rn_609) * rn_461 / 2);
				Matrix_.rn_3587(rn_610, rn_611, rn_611, Texture_.rn_4065(rn_609) * rn_461 / 2, Texture_.rn_4066(rn_609) * rn_461);
				Matrix_.rn_3603(rn_610, rn_612, rn_613);
				if (rn_607 != 1.0F) {
					SpriteBatch.rn_4021(rn_453, rn_609, rn_610, 1.0F, rn_456, null);
				}
				String rn_614 = "";
				int rn_615 = -16777216;
				Rectx rn_616 = rn_476.rn_3703("start_botton", rn_605, rn_456 - rn_597, Texture_.rn_4065(rn_596) * rn_461, Texture_.rn_4066(rn_596) * rn_461, rn_445);
				rn_924(rn_453, rn_616, -16776961);
				com.badlogic.gdx.graphics.Pixmap rn_617 = String_Nlimage.rn_3336(rn_450.rn_3643, "PvZ_Logo").rn_3634().rn_2054(1, 1, 0);
				android.graphics.Matrix rn_618 = Matrix_.rn_3577(rn_602);
				Matrix_.rn_3603(rn_618, rn_980(Pixmap_.rn_4093(rn_617) * rn_461), rn_601 * rn_461);
				SpriteBatch.rn_4005(rn_453, rn_617, rn_618, 1.0F, rn_456);
				if (rn_616.rn_3671) {
					rn_615 = -38400;
				}
				android.graphics.Paint rn_619 = Paint_.rn_1670(Paint_.rn_1667(Paint_.rn_1665(Paint_.rn_1663(), rn_464), (int) (rn_463 * rn_461)), rn_615);
				if (rn_607 < 1.0F) {
					rn_614 = rn_4434.rn_4447(rn_462, "LOADING");
				} else {
					rn_614 = rn_4434.rn_4447(rn_462, "CLICK_TO_START");
				}
				float rn_620 = rn_980(Paint_.rn_1673(rn_619, rn_614));
				float rn_621 = rn_597 - Texture_.rn_4066(rn_596) * rn_461 / 2 + rn_463 * rn_461 * 0.5F;
				BitmapFontData_.rn_4174(BitmapFont_.rn_4157(rn_525), rn_463 * rn_461 / 30);
				BitmapFont_.rn_4158(rn_525, Color_.rn_4068(ope.rn_1919(rn_615)));
				BitmapFont_.rn_4167(rn_525, rn_453, rn_614, rn_620, rn_621);
			} else if (rn_449) {
				if (rn_445 == 2) {
					com.badlogic.gdx.graphics.Texture rn_622 = null;
					if (rn_500 == 0) {
						if (rn_498 == 0 && rn_497 <= 3) {
							rn_622 = String_Nlimage.rn_3336(rn_450.rn_3643, "background1unsodded").rn_3634().rn_2068(1, 1, 0);
						} else {
							rn_622 = String_Nlimage.rn_3336(rn_450.rn_3643, "background1").rn_3634().rn_2068(1, 1, 0);
						}
					} else if (rn_500 == 1) {
						rn_622 = String_Nlimage.rn_3336(rn_450.rn_3643, "background2").rn_3634().rn_2068(1, 1, 0);
					} else if (rn_500 == 2) {
						rn_622 = String_Nlimage.rn_3336(rn_450.rn_3643, "background3").rn_3634().rn_2068(1, 1, 0);
					} else if (rn_500 == 3) {
						rn_622 = String_Nlimage.rn_3336(rn_450.rn_3643, "background4").rn_3634().rn_2068(1, 1, 0);
					} else if (rn_500 == 4) {
						rn_622 = String_Nlimage.rn_3336(rn_450.rn_3643, "background5").rn_3634().rn_2068(1, 1, 0);
					} else if (rn_500 == 5) {
						rn_622 = String_Nlimage.rn_3336(rn_450.rn_3643, "background6boss").rn_3634().rn_2068(1, 1, 0);
					}
					android.graphics.Matrix rn_623 = Matrix_.rn_3592(Matrix_.rn_3576(), rn_461, rn_461);
					android.graphics.Matrix rn_624 = Matrix_.rn_3577(rn_623);
					Matrix_.rn_3603(rn_624, rn_459 * rn_461, rn_460 * rn_461);
					com.badlogic.gdx.graphics.Texture rn_625 = String_Nlimage.rn_3336(rn_450.rn_3643, "SeedBank").rn_3634().rn_2068(1, 1, 0);
					SpriteBatch.rn_4021(rn_453, rn_622, rn_624, 1.0F, rn_456, null);
					android.graphics.Matrix rn_626 = Matrix_.rn_3577(rn_623);
					Matrix_.rn_3603(rn_626, 10 * rn_461, rn_460 * rn_461);
					SpriteBatch.rn_4021(rn_453, rn_625, rn_626, 1.0F, rn_456 - (int) (rn_535 * rn_461), null);
					if (rn_1164()) {
						rn_689();
					}
					BitmapFontData_.rn_4174(BitmapFont_.rn_4157(rn_525), rn_463 * rn_461 / 25);
					BitmapFont_.rn_4158(rn_525, Color_.rn_4068(ope.rn_1919(-16777216)));
					rn_956(rn_453, rn_6928.rn_6933(rn_509), 50, (int) (60 + rn_535), -16777216, 16, -0.5F, 0.0F);
					if (rn_497 == 1) {
						int rn_627 = rn_484;
						if (rn_510 == 9) {
							com.badlogic.gdx.graphics.Pixmap rn_628 = String_Nlimage.rn_3336(rn_450.rn_3643, "sod1row").rn_3634().rn_2054(1, 1, 0);
							String_Nlimage.rn_3336(rn_450.rn_3643, "sod1row").rn_3634().rn_2023 = null;
							SpriteBatch.rn_4028(rn_453, Texture_.rn_4059(ope.rn_1885(rn_628, 0, 0, rn_627, Pixmap_.rn_4094(rn_628))), (rn_459 + 240) * rn_461, rn_456 - (270 + Pixmap_.rn_4094(rn_628)) * rn_461, (int) (rn_627 * rn_461), Pixmap_.rn_4094(rn_628) * rn_461);
						} else if (rn_1164() || rn_510 == 7 || rn_510 == 8 || rn_510 == 11 || rn_510 == 12) {
							float rn_629 = 1.0F;
							if (rn_3289.rn_6850(rn_530, "op") || rn_3289.rn_6850(rn_530, "sp")) {
								rn_629 = rn_781(rn_484, 80, 1) * 1.0F / 255.0F;
							}
							com.badlogic.gdx.graphics.Texture rn_630 = String_Nlimage.rn_3336(rn_450.rn_3643, "sod1row").rn_3634().rn_2068(1, 1, 0);
							android.graphics.Matrix rn_631 = Matrix_.rn_3603(Matrix_.rn_3577(rn_623), (rn_459 + 240) * rn_461, (270) * rn_461);
							SpriteBatch.rn_4034(rn_453, rn_630, rn_631, new float[]{rn_629, rn_629, rn_629, 1.0F}, rn_456, Nirvana.this, false);
						}
					}
					for (int rn_10415 = 0;rn_10415 < DrawStyles.rn_1225(rn_548);rn_10415 += 1) {
						rn_985(rn_453, DrawStyles.rn_3744(rn_548, rn_10415), rn_586);
					}
					for (int rn_10416 = -2;rn_10416 < 7;rn_10416 += 1) {
						for (int rn_10417 = 0;rn_10417 < PlantList.rn_1225(rn_478);rn_10417 += 1) {
							if (PlantList.rn_2398(rn_478, rn_10417).rn_2622 == rn_10416) {
								rn_807(PlantList.rn_2398(rn_478, rn_10417), rn_586, rn_623);
							}
						}
						for (int rn_10418 = 0;rn_10418 < ZombieList.rn_1225(rn_477);rn_10418 += 1) {
							if (ZombieList.rn_2366(rn_477, rn_10418).rn_2174 == rn_10416) {
								rn_812(ZombieList.rn_2366(rn_477, rn_10418), rn_586, rn_623);
							}
						}
						for (int rn_10419 = 0;rn_10419 < ProjList.rn_1225(rn_479);rn_10419 += 1) {
							if (ProjList.rn_2429(rn_479, rn_10419).rn_2749 == rn_10416) {
								Proj rn_632 = ProjList.rn_2429(rn_479, rn_10419);
								com.badlogic.gdx.graphics.Texture rn_633 = null;
								android.graphics.Matrix rn_634 = Matrix_.rn_3603(Matrix_.rn_3577(rn_623), (rn_459 + rn_632.rn_2740) * rn_461, (rn_460 + rn_632.rn_2741) * rn_461);
								if (rn_3289.rn_6850(rn_632.rn_2748, "image")) {
									rn_633 = String_Nlimage.rn_3336(rn_450.rn_3643, rn_632.rn_2746).rn_3634().rn_2068(1, 1, 0);
								}
								Matrix_.rn_3612(rn_634, rn_632.rn_2755, rn_632.rn_2755, Texture_.rn_4065(rn_633) / 2, Texture_.rn_4066(rn_633) / 2);
								SpriteBatch.rn_4021(rn_453, rn_633, rn_634, 1.0F, rn_456, null);
							}
						}
						for (int rn_10420 = 0;rn_10420 < ParticleList.rn_1225(rn_481);rn_10420 += 1) {
							Particle rn_635 = ParticleList.rn_2522(rn_481, rn_10420);
							if (rn_635.rn_2849 == rn_10416) {
								for (int rn_10421 = 0;rn_10421 < GrainSet.rn_1225(rn_635.rn_2842);rn_10421 += 1) {
									Grain rn_636 = GrainSet.rn_2895((rn_635.rn_2842), rn_10421);
									if (rn_636.rn_2952 <= 0) {
										com.badlogic.gdx.graphics.Texture rn_637 = null;
										if (rn_635.rn_2851 == false) {
											rn_637 = String_Nlimage.rn_3336(rn_450.rn_3643, rn_636.rn_2942).rn_3634().rn_2068(rn_636.rn_2943, rn_636.rn_2945, rn_636.rn_2944);
										} else {
											rn_637 = Texture_.rn_4059(String_Nlimage.rn_3336(rn_450.rn_3643, rn_636.rn_2942).rn_3634().rn_2054(rn_636.rn_2943, rn_636.rn_2945, rn_636.rn_2944));
										}
										android.graphics.Matrix rn_638 = Matrix_.rn_3603(Matrix_.rn_3587(Matrix_.rn_3581(Matrix_.rn_3577(rn_623), rn_636.rn_2937, Texture_.rn_4066(rn_637) / 2, Texture_.rn_4066(rn_637) / 2), rn_636.rn_2969(rn_636.rn_2933), rn_636.rn_2969(rn_636.rn_2933), Texture_.rn_4065(rn_637) / 2, Texture_.rn_4066(rn_637) / 2), (ope.rn_1821(0, rn_636.rn_2939 * 2) - rn_636.rn_2939 + rn_459 + rn_635.rn_2843 + GrainSet.rn_2895((rn_635.rn_2842), rn_10421).rn_2924) * rn_461, (ope.rn_1821(0, rn_636.rn_2939 * 2) - rn_636.rn_2939 + rn_460 + rn_635.rn_2844 + GrainSet.rn_2895((rn_635.rn_2842), rn_10421).rn_2925) * rn_461);
										float[] rn_639 = {rn_636.rn_2969(rn_636.rn_2934), rn_636.rn_2969(rn_636.rn_2935), rn_636.rn_2969(rn_636.rn_2936), rn_636.rn_2969(rn_636.rn_2932)};
										SpriteBatch.rn_4034(rn_453, rn_637, rn_638, rn_639, rn_456, Nirvana.this, false);
									}
								}
							}
						}
					}
					rn_515 = rn_515 + "\n" + "zombie:" + "0" + "ms " + ZombieList.rn_1225(rn_477) + "n";
					rn_515 = rn_515 + "\n" + "plant:" + "0" + "ms " + PlantList.rn_1225(rn_478) + "n";
					rn_515 = rn_515 + "\n" + "proj:" + "0" + "ms " + ProjList.rn_1225(rn_479) + "n";
					rn_515 = rn_515 + "\n" + "particle:" + "0" + "ms " + ParticleList.rn_1225(rn_481) + "n";
					rn_515 = rn_515 + "\n" + "coin:" + "0" + "ms " + CoinList.rn_1225(rn_492) + "n";
					rn_515 = rn_515 + "\n" + "tracle:" + "0" + "ms " + TracleList.rn_1225(rn_480) + "n";
					for (int rn_10422 = 0;rn_10422 < MowerList.rn_1225(rn_543.rn_2551);rn_10422 += 1) {
						rn_820(MowerList.rn_2582(rn_543.rn_2551, rn_10422), rn_586);
					}
					for (int rn_10423 = -2;rn_10423 < 7;rn_10423 += 1) {
					}
					for (int rn_10424 = 0;rn_10424 < CoinList.rn_1225(rn_492);rn_10424 += 1) {
						Coin rn_640 = CoinList.rn_2460(rn_492, rn_10424);
						if (rn_640.rn_2776 == static_.rn_2808) {
							com.badlogic.gdx.graphics.Texture rn_641 = rn_565(rn_763());
							android.graphics.Matrix rn_642 = Matrix_.rn_3603(Matrix_.rn_3577(rn_623), rn_640.rn_2767, rn_640.rn_2769);
							SpriteBatch.rn_4021(rn_453, rn_641, rn_642, 1, rn_456, Nirvana.this);
						} else {
							rn_518.rn_3773 = rn_640.rn_2777;
							rn_518.rn_3774 = rn_640.rn_2785;
							rn_518.rn_3775 = rn_640.rn_2786;
							rn_518.rn_3776 = rn_640.rn_2781;
							rn_518.rn_3777 = rn_640.rn_2781;
							rn_518.rn_3780 = -1;
							rn_518.rn_3781 = rn_640.rn_2799();
							rn_518.rn_3782 = rn_640.rn_2800();
							rn_518.rn_3783 = null;
							rn_985(rn_453, rn_518, rn_586);
						}
					}
					for (int rn_10425 = 0;rn_10425 < TracleList.rn_1225(rn_480);rn_10425 += 1) {
						Tracle rn_643 = TracleList.rn_2491(rn_480, rn_10425);
						if (rn_643.rn_2827 != null) {
							rn_518.rn_3773 = rn_643.rn_2827;
							rn_518.rn_3774 = 1.0F;
							rn_518.rn_3775 = 1.0F;
							rn_518.rn_3776 = rn_643.rn_2820;
							rn_518.rn_3777 = rn_643.rn_2820;
							rn_518.rn_3778 = 0.0F;
							rn_518.rn_3779 = 0.0F;
							rn_518.rn_3780 = -1;
							rn_518.rn_3781 = rn_643.rn_2814;
							rn_518.rn_3782 = rn_643.rn_2815;
							rn_518.rn_3783 = null;
							rn_985(rn_453, rn_518, rn_586);
						}
					}
					rn_518.rn_3773 = rn_472;
					rn_518.rn_3774 = 1.0F;
					rn_518.rn_3775 = 1.0F;
					rn_518.rn_3776 = 0.0F;
					rn_518.rn_3777 = 0.0F;
					rn_518.rn_3780 = -1;
					rn_518.rn_3781 = 300;
					rn_518.rn_3782 = 0;
					rn_985(rn_453, rn_518, rn_586);
					if (rn_1164() && rn_510 != 7) {
						com.badlogic.gdx.graphics.Pixmap rn_644 = String_Nlimage.rn_3336(rn_450.rn_3643, "FlagMeter").rn_3634().rn_2054(1, 1, 0);
						int rn_645 = Pixmap_.rn_4093(rn_644) - (int) (Pixmap_.rn_4093(rn_644) * rn_493 * 1.0F / (rn_494));
						int rn_646 = Pixmap_.rn_4093(rn_644) - (int) (Pixmap_.rn_4093(rn_644) * (rn_493 - 1) * 1.0F / rn_494) - rn_645;
						if (rn_645 <= 0) {
							rn_645 = 1;
						} else if (rn_645 >= Pixmap_.rn_4093(rn_644) - 1) {
							rn_645 = Pixmap_.rn_4093(rn_644) - 2;
						}
						com.badlogic.gdx.graphics.Pixmap rn_647 = null;
						rn_647 = ope.rn_1885(rn_644, 0, 0, rn_645, Pixmap_.rn_4094(rn_644) / 2);
						com.badlogic.gdx.graphics.Pixmap rn_648 = null;
						rn_648 = ope.rn_1891(rn_644, rn_645, Pixmap_.rn_4094(rn_644) / 2, Pixmap_.rn_4093(rn_644), Pixmap_.rn_4094(rn_644) - 1);
						android.graphics.Matrix rn_649 = new android.graphics.Matrix();
						Matrix_.rn_3603(rn_649, 600, 600 - Pixmap_.rn_4094(rn_644) / 2);
						SpriteBatch.rn_4005(rn_453, rn_647, Matrix_.rn_3592(Matrix_.rn_3577(rn_649), rn_461, rn_461), 1.0F, rn_456);
						android.graphics.Matrix rn_650 = Matrix_.rn_3577(rn_649);
						Matrix_.rn_3603(rn_649, rn_645, 0);
						SpriteBatch.rn_4005(rn_453, rn_648, Matrix_.rn_3592(Matrix_.rn_3577(rn_649), rn_461, rn_461), 1.0F, rn_456);
						com.badlogic.gdx.graphics.Pixmap rn_651 = String_Nlimage.rn_3336(rn_450.rn_3643, "FlagMeterParts").rn_3634().rn_2054(3, 1, 0);
						com.badlogic.gdx.graphics.Pixmap rn_652 = String_Nlimage.rn_3336(rn_450.rn_3643, "FlagMeterParts").rn_3634().rn_2054(3, 1, 1);
						com.badlogic.gdx.graphics.Pixmap rn_653 = String_Nlimage.rn_3336(rn_450.rn_3643, "FlagMeterParts").rn_3634().rn_2054(3, 1, 2);
						java.util.ArrayList<XMLR> rn_654 = rn_874().rn_3025;
						for (int rn_10426 = 0;rn_10426 < rn_494;rn_10426 += 1) {
							if (rn_3289.rn_6850(XMLRED.rn_3211(rn_654, rn_10426).rn_3038("flag"), "1")) {
								android.graphics.Matrix rn_655 = Matrix_.rn_3603(Matrix_.rn_3577(rn_650), Pixmap_.rn_4093(rn_644) * (rn_494 - rn_10426 - 1) * 1.0F / rn_494 * 0.95F, -2);
								if (rn_10426 <= rn_493) {
									SpriteBatch.rn_4005(rn_453, rn_652, Matrix_.rn_3592(Matrix_.rn_3577(rn_655), rn_461, rn_461), 1.0F, rn_456);
									Matrix_.rn_3603(rn_655, 0.0F, -0.5F * Pixmap_.rn_4094(rn_653));
									SpriteBatch.rn_4005(rn_453, rn_653, Matrix_.rn_3592(Matrix_.rn_3577(rn_655), rn_461, rn_461), 1.0F, rn_456);
								} else {
									SpriteBatch.rn_4005(rn_453, rn_653, Matrix_.rn_3592(Matrix_.rn_3577(rn_655), rn_461, rn_461), 1.0F, rn_456);
								}
							}
						}
						Matrix_.rn_3603(rn_649, rn_646 * rn_513 - 1 * Pixmap_.rn_4093(rn_651) / 2 + 5, Pixmap_.rn_4094(rn_644) / 4 - Pixmap_.rn_4094(rn_651) / 2 - 5);
						SpriteBatch.rn_4005(rn_453, rn_651, Matrix_.rn_3577(Matrix_.rn_3592(rn_649, rn_461, rn_461)), 1.0F, rn_456);
					}
					if (rn_1164() || rn_510 == 7) {
						int rn_656 = 600;
						if ((rn_1164() && rn_510 != 7) == false) {
							rn_656 = 800;
						}
						rn_966(rn_453, rn_953(), rn_656, 600 - 24, -5336500, -16777216, 20, -1, 0.0F, 2, 2);
					}
					if (rn_1164() == false) {
						com.badlogic.gdx.graphics.Texture rn_657 = String_Nlimage.rn_3336(rn_450.rn_3643, "SeedChooser_Background").rn_3634().rn_2068(1, 1, 0);
						rn_726(rn_453, rn_657, 0, rn_541 - Texture_.rn_4066(rn_657), 0, 0);
						com.badlogic.gdx.graphics.Texture rn_658 = String_Nlimage.rn_3336(rn_450.rn_3643, "SeedChooser_Button").rn_3634().rn_2068(1, 1, 0);
						float rn_659 = rn_541 - Texture_.rn_4066(rn_657) + 34;
						rn_726(rn_453, rn_658, Texture_.rn_4065(rn_657) / 2, rn_659, -0.5F, -0.5F);
						Rectx rn_660 = rn_476.rn_3703("start", -1, -1, Texture_.rn_4065(rn_658) * rn_461, Texture_.rn_4066(rn_658) * rn_461, rn_445);
						rn_660.rn_3666 = ((Texture_.rn_4065(rn_657) - Texture_.rn_4065(rn_658)) / 2) * rn_461;
						rn_660.rn_3667 = ope.rn_1913(rn_659 - Texture_.rn_4066(rn_658) / 2, 600, Texture_.rn_4066(rn_658)) * rn_461;
						if (rn_660.rn_3672 && rn_767()) {
							rn_660.rn_3672 = false;
							rn_530 = "start";
							rn_540 = true;
						}
						int rn_661 = -12582912;
						if (rn_767()) {
							rn_661 = -2777301;
						}
						rn_966(rn_453, rn_4434.rn_4447(rn_462, "LETS_ROCK_BUTTON"), Texture_.rn_4065(rn_657) / 2, (int) (600 - rn_659), rn_661, -16777216, 20, -0.5F, -0.5F, -1, -1);
						float rn_662 = 25;
						float rn_663 = rn_541 - 36;
						int rn_664 = 0;
						int rn_665 = 0;
						com.badlogic.gdx.graphics.Texture rn_666 = String_Nlimage.rn_3336(rn_450.rn_3643, "SeedPacketSilhouette").rn_3634().rn_2068(1, 1, 0);
						for (int rn_10427 = 0;rn_10427 < 48;rn_10427 += 1) {
							float rn_667 = rn_662 + rn_664 * (50 + 3);
							float rn_668 = rn_663 - (rn_665 + 1) * 70;
							rn_726(rn_453, rn_666, rn_667, rn_668, 0, 0);
							if (rn_803(rn_10427)) {
								com.badlogic.gdx.graphics.Texture rn_669 = rn_565(rn_10427);
								rn_726(rn_453, rn_669, rn_667, rn_668, 0, 0);
								if (rn_724(rn_10427)) {
									rn_905(rn_453, rn_667, ope.rn_1913(rn_668, 600, 70), 50, 70, true, -2147483648);
								} else {
									Rectx rn_670 = rn_476.rn_3703("precard_" + rn_10427, -1, -1, 50 * rn_461, 70 * rn_461, rn_445);
									rn_670.rn_3666 = rn_667 * rn_461;
									rn_670.rn_3667 = ope.rn_1913(rn_668, 600, 70) * rn_461;
									if (rn_670.rn_3672) {
										rn_670.rn_3672 = false;
										rn_754(rn_10427, true);
									}
								}
							}
							if (rn_664 == 7) {
								rn_665 = rn_665 + 1;
								rn_664 = 0;
							} else {
								rn_664 = rn_664 + 1;
							}
						}
						rn_689();
					}
				} else if (rn_445 == 7) {
				} else if (rn_445 == 1) {
					if (rn_3289.rn_6850(rn_530, "advent")) {
						if (rn_532 > 3500) {
							rn_1066(2);
						} else {
							if (rn_484 > rn_532 + 125) {
								rn_532 = rn_532 + 125;
								if (rn_532 % 2 == 1) {
									if (UserdataList.rn_3006(rn_529.rn_2977, rn_529.rn_2976).rn_2981 < 0) {
										Animed.rn_3374(rn_528, 0).rn_3521("SelectorScreen_StartAdventure_button", new float[]{1.0F, 1.0F, 1.0F, 1.0F});
									} else {
										Animed.rn_3374(rn_528, 0).rn_3521("SelectorScreen_Adventure_button", new float[]{1.0F, 1.0F, 1.0F, 1.0F});
									}
								} else {
									if (UserdataList.rn_3006(rn_529.rn_2977, rn_529.rn_2976).rn_2981 < 0) {
										Animed.rn_3374(rn_528, 0).rn_3521("SelectorScreen_StartAdventure_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
									} else {
										Animed.rn_3374(rn_528, 0).rn_3521("SelectorScreen_Adventure_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
									}
								}
							}
							rn_484 = rn_484 + rn_579;
						}
					} else if (Animed.rn_1225(rn_528) >= 1 && Animed.rn_3374(rn_528, 0).rn_3498) {
						if (rn_3289.rn_6850(Animed.rn_3374(rn_528, 0).rn_3495, "anim_open")) {
							if (rn_3289.rn_6850(rn_530, "none")) {
								rn_530 = "pre";
								if (rn_529.rn_2975 == 0) {
									rn_751(true);
								} else {
									rn_758(true);
								}
							}
						}
					}
					if (Animed.rn_1225(rn_528) > 0 && rn_529.rn_2975 != 0) {
						if (rn_3289.rn_6852(rn_530, "none")) {
							String rn_671 = UserdataList.rn_3006(rn_529.rn_2977, rn_529.rn_2976).rn_2979 + "!";
							rn_956(rn_453, rn_671, 173, (int) (95 + Animed.rn_3374(rn_528, 0).rn_3532("woodsign1").rn_3272), -1, 23, -0.5F, 0.0F);
						}
						if (rn_529.rn_2978().rn_2981 > 0) {
							rn_733(rn_453);
						}
					}
				}
			}
			long rn_672 = rn_10083.rn_10089();
			long rn_673 = rn_672;
			for (int rn_10428 = 0;rn_10428 < rn_476.rn_1225();rn_10428 += 1) {
			}
			if (rn_458 >= 360.0F) {
				rn_458 = 0.0F;
			} else {
				rn_458 = rn_458 + 1.0F;
			}
			for (int rn_10429 = 0;rn_10429 < ZombieList.rn_1225(rn_477);rn_10429 += 1) {
				Zombie rn_675 = ZombieList.rn_2366(rn_477, rn_10429);
				Rectx rn_676 = ZombieList.rn_2366(rn_477, rn_10429).rn_2219;
				Rectx rn_677 = new Rectx();
				rn_677.rn_3666 = (rn_676.rn_3666 + rn_459 + ZombieList.rn_2366(rn_477, rn_10429).rn_2329()) * rn_461;
				rn_677.rn_3667 = (rn_676.rn_3667 + rn_460 + ZombieList.rn_2366(rn_477, rn_10429).rn_2171) * rn_461;
				rn_677.rn_3668 = rn_676.rn_3668 * rn_461;
				rn_677.rn_3669 = rn_676.rn_3669 * rn_461;
				rn_924(rn_453, rn_677, -16776961);
				String rn_678 = rn_6928.rn_6933(rn_675.rn_2166);
				if (rn_675.rn_2175 == true) {
					rn_678 = rn_678 + "+" + rn_6928.rn_6933(rn_675.rn_2176);
				}
				if (rn_675.rn_2179 == true) {
					rn_678 = rn_678 + "+" + rn_6928.rn_6933(rn_675.rn_2180);
				}
				if (rn_676.rn_3671) {
					STSL rn_679 = rn_675.rn_2360();
					rn_769(rn_453, (int) rn_677.rn_3666, (int) rn_677.rn_3667, rn_679);
				}
			}
			for (int rn_10430 = 0;rn_10430 < PlantList.rn_1225(rn_478);rn_10430 += 1) {
				Plant rn_680 = PlantList.rn_2398(rn_478, rn_10430);
				Rectx rn_681 = PlantList.rn_2398(rn_478, rn_10430).rn_2627;
				Rectx rn_682 = new Rectx();
				rn_682.rn_3666 = (rn_681.rn_3666 + rn_459 + PlantList.rn_2398(rn_478, rn_10430).rn_2736()) * rn_461;
				rn_682.rn_3667 = (rn_681.rn_3667 + rn_460 + PlantList.rn_2398(rn_478, rn_10430).rn_2620) * rn_461;
				rn_682.rn_3668 = rn_681.rn_3668 * rn_461;
				rn_682.rn_3669 = rn_681.rn_3669 * rn_461;
				rn_924(rn_453, rn_682, -16776961);
				if (rn_681.rn_3671) {
					STSL rn_683 = rn_680.rn_2738();
					rn_769(rn_453, (int) rn_682.rn_3666, (int) rn_682.rn_3667, rn_683);
				}
			}
			for (int rn_10431 = 0;rn_10431 < CoinList.rn_1225(rn_492);rn_10431 += 1) {
				Coin rn_684 = CoinList.rn_2460(rn_492, rn_10431);
				rn_786(rn_684.rn_2774, rn_684.rn_2799(), rn_684.rn_2800(), -65536);
			}
			rn_672 = rn_10083.rn_10089();
			rn_515 = rn_515 + "\n" + "collisoin:" + rn_6935.rn_6939((rn_672 - rn_673)) + "ms";
			rn_673 = rn_672;
			if (rn_507) {
				DrawStyle rn_685 = new DrawStyle();
				rn_685.rn_3773 = rn_501;
				rn_685.rn_3774 = 1.0F;
				rn_685.rn_3775 = 1.0F;
				rn_685.rn_3776 = 0.0F;
				rn_685.rn_3777 = 0.0F;
				rn_685.rn_3780 = -1;
				rn_685.rn_3781 = rn_504 - rn_459 - 50;
				rn_685.rn_3782 = rn_505 - 50;
				rn_985(rn_453, rn_685, rn_586);
			}
		}
		if (rn_546 != 0) {
			rn_905(rn_453, 0, 400, rn_455 / rn_461, 110, true, -1442840576);
			rn_966(rn_453, rn_545, (int) (rn_455 / 2.0F / rn_461), 440, -527701, -16777216, 30, -0.5F, 0.0F, 2, 2);
		}
		SpriteBatch.rn_4056(rn_453);
		FrameBuffer_.rn_4099(rn_454);
		ShaderProgram_.rn_4117(rn_524, "u_opacity", 1.0F);
		ShaderProgram_.rn_4106(rn_524, "u_rgbFactors", 1.0F, 1.0F, 1.0F);
		com.badlogic.gdx.graphics.g2d.TextureRegion rn_686 = TextureRegion_.rn_3995(TextureRegion_.rn_3991(FrameBuffer_.rn_4100(rn_454), rn_455, rn_456), Const.rn_1778, Const.rn_1779);
		return rn_686;
	}

	public final void rn_689() {
		android.graphics.Matrix rn_690 = new android.graphics.Matrix();
		Matrix_.rn_3592(rn_690, rn_461, rn_461);
		if (rn_536 == null) {
			com.badlogic.gdx.graphics.Pixmap rn_691 = Pixmap_.rn_4082(1, 1);
			rn_691.setColor(0x00000055);
			rn_691.fill();
			rn_536 = Texture_.rn_4059(rn_691);
		}
		if (rn_537 == null) {
			com.badlogic.gdx.graphics.Pixmap rn_692 = Pixmap_.rn_4082(1, 1);
			rn_692.setColor(0x00000088);
			rn_692.fill();
			rn_537 = Texture_.rn_4059(rn_692);
		}
		if (rn_538 == null) {
			com.badlogic.gdx.graphics.Pixmap rn_693 = Pixmap_.rn_4082(1, 1);
			rn_693.setColor(0x00000040);
			rn_693.fill();
			rn_538 = Texture_.rn_4059(rn_693);
		}
		for (int rn_10432 = 0;rn_10432 < rn_811();rn_10432 += 1) {
			int rn_694 = 95 + rn_10432 * (rn_485 + 10);
			com.badlogic.gdx.graphics.Texture rn_695 = String_Nlimage.rn_3336(rn_450.rn_3643, "SeedPacketSilhouette").rn_3634().rn_2068(1, 1, 0);
			rn_726(rn_453, rn_695, rn_694, 600 - 8 - 70 - rn_535, 0, 0);
			if (rn_10432 >= rn_482.length || rn_482 [rn_10432] == -1) {
			} else {
				Rectx rn_696 = rn_476.rn_3703("card_" + rn_10432, rn_694 * rn_461, 8 * rn_461, 50 * rn_461, 70 * rn_461, rn_445);
				float rn_697 = 0;
				float rn_698 = 0;
				if ((rn_549 != -1) && rn_549 == rn_482 [rn_10432]) {
					float rn_699 = rn_550 * 1.0F / rn_551;
					if (rn_552 == false) {
						rn_699 = 1 - rn_699;
					}
					Rectx rn_700 = rn_476.rn_3698("precard_" + rn_482 [rn_10432]);
					rn_697 = (rn_700.rn_3666 / rn_461 - rn_694) * rn_699;
					rn_698 = (rn_700.rn_3667 / rn_461 - 8) * rn_699;
				}
				if ((rn_549 != -1) && rn_552 == false && rn_10432 >= rn_553) {
					float rn_701 = rn_550 * 1.0F / rn_551;
					rn_697 = (50 + 10) * rn_701;
				}
				com.badlogic.gdx.graphics.Texture rn_703 = rn_565(rn_482 [rn_10432]);
				rn_726(rn_453, rn_703, rn_694 + rn_697, ope.rn_1913(8 + rn_698 + rn_535, 600, Texture_.rn_4066(rn_703)), 0, 0);
				if (rn_510 == 3 || rn_510 == 12) {
					float rn_706 = 1.0F;
					if (rn_510 == 3) {
						rn_706 = rn_484 * 1.0F / 150;
					}
					int rn_707 = (int) (rn_706 * 64);
					rn_905(rn_453, rn_694, 8 + rn_535, 50, 70, true, ope.rn_1865(new int[]{rn_707, 0, 0, 0}));
				}
				if (rn_1164()) {
					if (rn_696.rn_3671 && rn_483 [rn_10432] <= 0 && (rn_794(rn_482 [rn_10432]) <= rn_509 || rn_527)) {
						rn_865(rn_482 [rn_10432]);
						rn_508 = rn_10432;
						if (rn_3289.rn_6850(rn_530, "cp")) {
							rn_530 = "op";
							rn_1140("ADVICE_CLICK_ON_GRASS", -1);
						} else if (rn_3289.rn_6850(rn_530, "bp")) {
							rn_546 = 0;
							rn_530 = "sp";
						}
					}
					if (rn_483 [rn_10432] <= 0 && rn_794(rn_482 [rn_10432]) <= rn_509) {
						if ((rn_3289.rn_6850(rn_530, "cp")) && rn_10432 == 0) {
							int rn_708 = 80;
							int rn_709 = rn_781(rn_484, rn_708, 0);
							rn_905(rn_453, rn_694, 8, 50, 70, true, ope.rn_1865(new int[]{rn_709, 0, 0, 0}));
							com.badlogic.gdx.graphics.Texture rn_710 = String_Nlimage.rn_3336(rn_450.rn_3643, "DownArrow").rn_3634().rn_2068(1, 1, 0);
							android.graphics.Matrix rn_711 = Matrix_.rn_3577(rn_1026);
							Matrix_.rn_3603(Matrix_.rn_3592(rn_711, 1, -1), (rn_694 + (50 - Texture_.rn_4065(rn_710)) / 2) * rn_461, (Texture_.rn_4066(rn_710) + 8 + 70 + rn_781(rn_484, rn_708 - 20, 0) / 18.0F) * rn_461);
							SpriteBatch.rn_4034(rn_453, rn_710, rn_711, new float[]{1.0F, 0.9F, 0.4F, 1.0F}, rn_456, Nirvana.this, false);
						}
					}
					if (rn_483 [rn_10432] > 0) {
						int rn_712 = rn_792(rn_482 [rn_10432]);
						float rn_713 = (0 + 50) * rn_461;
						float rn_714 = (0 + 70) * rn_461;
						SpriteBatch.rn_4028(rn_453, rn_536, rn_694 * rn_461, ope.rn_1913(8 * rn_461, rn_456, rn_714), rn_713, rn_714);
						rn_714 = (0 + 70 * (rn_483 [rn_10432] * 1.0F / rn_712)) * rn_461;
						SpriteBatch.rn_4028(rn_453, rn_538, rn_694 * rn_461, ope.rn_1913(8 * rn_461, rn_456, rn_714), rn_713, rn_714);
					}
					if (rn_509 < rn_794(rn_482 [rn_10432])) {
						float rn_715 = (0 + 50) * rn_461;
						float rn_716 = (0 + 70) * rn_461;
						SpriteBatch.rn_4028(rn_453, rn_537, rn_694 * rn_461, ope.rn_1913(8 * rn_461, rn_456, rn_716), rn_715, rn_716);
					}
				}
				if (rn_696.rn_3672) {
					rn_696.rn_3672 = false;
					if (rn_1164()) {
						if (rn_483 [rn_10432] <= 0 && rn_794(rn_482 [rn_10432]) <= rn_509) {
							rn_865(rn_482 [rn_10432]);
							rn_508 = rn_482 [rn_10432];
						}
					} else {
						rn_754(rn_482 [rn_10432], false);
					}
				}
			}
		}
		if ((rn_549 != -1) && rn_552 == false) {
			int rn_717 = 95 + rn_553 * (rn_485 + 10);
			float rn_718 = 0;
			float rn_719 = 0;
			float rn_720 = 1 - rn_550 * 1.0F / rn_551;
			Rectx rn_721 = rn_476.rn_3698("precard_" + rn_549);
			rn_718 = (rn_721.rn_3666 / rn_461 - rn_717) * rn_720;
			rn_719 = (rn_721.rn_3667 / rn_461 - 8) * rn_720;
			android.graphics.Matrix rn_722 = Matrix_.rn_3577(rn_690);
			Matrix_.rn_3628(rn_722, rn_717 + rn_718, 8 + rn_719);
			com.badlogic.gdx.graphics.Pixmap rn_723 = Pixmap_.rn_4087(rn_569(rn_549));
			SpriteBatch.rn_4005(rn_453, rn_723, rn_722, 1.0F, rn_456 - (int) (rn_535 * rn_461));
			rn_723.dispose();
		}
	}

	public final boolean rn_724(int rn_725) {
		for (int rn_10433 = 0;rn_10433 < rn_482.length;rn_10433 += 1) {
			if (rn_482 [rn_10433] == rn_725) {
				return true;
			}
		}
		return false;
	}

	public final void rn_726(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_727, com.badlogic.gdx.graphics.Texture rn_728, float rn_729, float rn_730, float rn_731, float rn_732) {
		SpriteBatch.rn_4028(rn_727, rn_728, (rn_729 + Texture_.rn_4065(rn_728) * rn_731) * rn_461, (rn_730 + Texture_.rn_4066(rn_728) * rn_732) * rn_461, Texture_.rn_4065(rn_728) * rn_461, Texture_.rn_4066(rn_728) * rn_461);
	}

	public final void rn_733(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_734) {
		String rn_735 = rn_6928.rn_6933(rn_946(rn_529.rn_2978().rn_2981));
		String rn_736 = rn_6928.rn_6933(rn_950(rn_529.rn_2978().rn_2981));
		int rn_737 = 557;
		for (int rn_10434 = 0;rn_10434 < rn_6845.rn_1225(rn_735);rn_10434 += 1) {
			int rn_738 = rn_3289.rn_6894(rn_3289.rn_6887(rn_735, rn_6845.rn_1225(rn_735) - rn_10434 - 1, rn_6845.rn_1225(rn_735) - rn_10434 - 1), 10);
			com.badlogic.gdx.graphics.Pixmap rn_739 = String_Nlimage.rn_3336(rn_450.rn_3643, "SelectorScreen_LevelNumbers").rn_3634().rn_2054(10, 1, rn_738);
			SpriteBatch.rn_4028(rn_734, Texture_.rn_4059(rn_739), rn_737 * rn_461, ope.rn_1913(rn_742(rn_737) * rn_461, rn_456, Pixmap_.rn_4094(rn_739) * rn_461), Pixmap_.rn_4093(rn_739) * rn_461, Pixmap_.rn_4094(rn_739) * rn_461);
			rn_737 = rn_737 - (int) (Pixmap_.rn_4093(rn_739) * 0.8F);
		}
		rn_737 = 575;
		for (int rn_10435 = 0;rn_10435 < rn_6845.rn_1225(rn_736);rn_10435 += 1) {
			int rn_740 = rn_3289.rn_6894(rn_3289.rn_6887(rn_736, rn_10435, rn_10435), 10);
			com.badlogic.gdx.graphics.Pixmap rn_741 = String_Nlimage.rn_3336(rn_450.rn_3643, "SelectorScreen_LevelNumbers").rn_2054(10, 1, rn_740);
			SpriteBatch.rn_4028(rn_734, Texture_.rn_4059(rn_741), rn_737 * rn_461, ope.rn_1913(rn_742(rn_737) * rn_461, rn_456, Pixmap_.rn_4094(rn_741) * rn_461), Pixmap_.rn_4093(rn_741) * rn_461, Pixmap_.rn_4094(rn_741) * rn_461);
			rn_737 = rn_737 + (int) (Pixmap_.rn_4093(rn_741) * 0.8F);
		}
	}

	public final int rn_742(int rn_743) {
		return (int) (11.25F / 80 * rn_743 + 50 + Animed.rn_3374(rn_528, 0).rn_3532("SelectorScreen_BG_Right").rn_3272);
	}

	public final void rn_744(float rn_745, float rn_746, String rn_747, android.graphics.Matrix rn_748) {
		android.graphics.Matrix rn_749 = Matrix_.rn_3603(Matrix_.rn_3577(rn_748), (rn_459 + rn_745) * rn_461, (rn_460 + rn_746) * rn_461);
		com.badlogic.gdx.graphics.Texture rn_750 = String_Nlimage.rn_3336(rn_450.rn_3643, rn_747).rn_3634().rn_2068(1, 1, 0);
		SpriteBatch.rn_4021(rn_453, rn_750, rn_749, 1.0F, rn_456, null);
	}

	public final void rn_751(boolean rn_752) {
		rn_529.rn_2975 = rn_529.rn_2975 + 1;
		Userdata rn_753 = new Userdata();
		rn_753.rn_2979 = "Developer";
		rn_753.rn_2981 = -1;
		UserdataList.rn_2998(rn_529.rn_2977, rn_753);
		rn_529.rn_2976 = UserdataList.rn_1225(rn_529.rn_2977) - 1;
		rn_823();
		if (rn_752) {
			rn_758(true);
		}
	}

	public final void rn_754(int rn_755, boolean rn_756) {
		if (rn_756 == false) {
			String rn_757 = "search";
			for (int rn_10436 = 0;rn_10436 < rn_482.length;rn_10436 += 1) {
				if (rn_3289.rn_6850(rn_757, "search")) {
					if (rn_482 [rn_10436] == rn_755) {
						rn_553 = rn_10436;
						rn_757 = "move";
					}
				}
				if (rn_3289.rn_6850(rn_757, "move")) {
					if (rn_10436 == rn_482.length - 1) {
						rn_482 [rn_10436] = -1;
					} else {
						rn_482 [rn_10436] = rn_482 [rn_10436 + 1];
					}
				}
			}
			rn_549 = rn_755;
			rn_550 = rn_551;
			rn_552 = rn_756;
		} else {
			for (int rn_10437 = 0;rn_10437 < rn_482.length;rn_10437 += 1) {
				if (rn_482 [rn_10437] == -1) {
					rn_549 = rn_755;
					rn_550 = rn_551;
					rn_552 = rn_756;
					rn_482 [rn_10437] = rn_755;
					break;
				}
			}
		}
	}

	public final void rn_758(boolean rn_759) {
		if (UserdataList.rn_2990((rn_529.rn_2977), rn_529.rn_2976).rn_2981 >= 0) {
			Animed.rn_3374(rn_528, 0).rn_3556(new String[]{"SelectorScreen_Adventure_button", "SelectorScreen_Adventure_shadow"}, 0, false);
			Animed.rn_3374(rn_528, 0).rn_3556(new String[]{"SelectorScreen_StartAdventure_button", "SelectorScreen_StartAdventure_shadow"}, -1, false);
		}
		if (UserdataList.rn_2990((rn_529.rn_2977), rn_529.rn_2976).rn_2983 == false) {
			Animed.rn_3374(rn_528, 0).rn_3521("SelectorScreen_Survival_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
		}
		if (UserdataList.rn_2990((rn_529.rn_2977), rn_529.rn_2976).rn_2984 == false) {
			Animed.rn_3374(rn_528, 0).rn_3521("SelectorScreen_Challenges_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
		}
		if (UserdataList.rn_2990((rn_529.rn_2977), rn_529.rn_2976).rn_2985 == false) {
			Animed.rn_3374(rn_528, 0).rn_3521("SelectorScreen_ZenGarden_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
		}
		if (rn_759) {
			rn_530 = "sign";
			Animed.rn_3374(rn_528, 0).rn_3562("anim_sign", false);
			Animed.rn_3374(rn_528, 0).rn_3499 = true;
		}
		String[] rn_760 = {"leaf1", "leaf2", "leaf3", "leaf4", "leaf5", "leaf_SelectorScreen_Leaves"};
		Animed.rn_3374(rn_528, 0).rn_3556(rn_760, -1, false);
		Animed.rn_3382(rn_528, Anim.rn_3508("SelectorScreen", Nirvana.this).rn_3562("anim_grass", false));
	}

	public final int rn_763() {
		int rn_764 = rn_497 % 10;
		int rn_765 = (rn_497 - rn_764) / 10;
		int rn_766 = rn_764;
		if (rn_766 > 4) {
			rn_766 = rn_766 - 1;
		} else {
			rn_766 = rn_766;
		}
		return rn_765 * 8 + rn_766;
	}

	public final boolean rn_767() {
		if (rn_482.length != 0 && rn_482 [rn_482.length - 1] != -1) {
			return true;
		}
		return false;
	}

	public final void rn_769(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_770, int rn_771, int rn_772, STSL rn_773) {
		int rn_774 = 1;
		if (rn_772 + rn_774 * 16 * rn_4366.rn_1225(rn_773.rn_3659) > rn_456) {
			rn_772 = rn_456 - rn_774 * 16 * rn_4366.rn_1225(rn_773.rn_3659);
		}
		int rn_775 = ope.rn_1867(ope.rn_1945(new float[]{rn_458, 1.0F, 1.0F}), 255);
		int rn_776 = ope.rn_1986(rn_775, 255);
		android.graphics.Paint rn_777 = Paint_.rn_1665(Paint_.rn_1667(Paint_.rn_1663(), rn_774 * 32), rn_464);
		int rn_778 = rn_772;
		for (int rn_10439 = 0;rn_10439 < rn_4366.rn_1225(rn_773.rn_3659);rn_10439 += 1) {
			Paint_.rn_1670(rn_777, rn_775);
			int rn_779 = (int) Paint_.rn_1673(rn_777, rn_4366.rn_4369((rn_773.rn_3659), rn_10439));
			BitmapFontData_.rn_4174(BitmapFont_.rn_4157(rn_525), 1);
			BitmapFont_.rn_4158(rn_525, Color_.rn_4068(ope.rn_1919(rn_775)));
			BitmapFont_.rn_4167(rn_525, rn_770, rn_4366.rn_4369((rn_773.rn_3659), rn_10439), rn_771, ope.rn_1913(rn_778, rn_456, 80));
			Paint_.rn_1670(rn_777, rn_776);
			BitmapFont_.rn_4158(rn_525, Color_.rn_4068(ope.rn_1919(rn_776)));
			BitmapFont_.rn_4167(rn_525, rn_770, rn_4366.rn_4369((rn_773.rn_3660), rn_10439), rn_771 + rn_779 + 15, ope.rn_1913(rn_778, rn_456, 80));
			rn_778 = rn_778 + rn_774 * 16;
		}
	}

	public final int rn_781(int rn_782, int rn_783, int rn_784) {
		int rn_785 = rn_782 % rn_783;
		if (rn_785 < rn_783 / 2) {
			return (int) (rn_785 * 1.0F / (rn_783 / 2) * 200 + 55 * rn_784);
		} else {
			return (int) ((rn_783 - rn_785) * 1.0F / (rn_783 / 2) * 200 + 55 * rn_784);
		}
	}

	public final void rn_786(Rectx rn_787, float rn_788, float rn_789, int rn_790) {
		Rectx rn_791 = new Rectx();
		rn_791.rn_3666 = (rn_787.rn_3666 + rn_459 + rn_788) * rn_461;
		rn_791.rn_3667 = (rn_787.rn_3667 + rn_460 + rn_789) * rn_461;
		rn_791.rn_3668 = rn_787.rn_3668 * rn_461;
		rn_791.rn_3669 = rn_787.rn_3669 * rn_461;
		rn_924(rn_453, rn_791, rn_790);
	}

	public final int rn_792(int rn_793) {
		return rn_3289.rn_6894(rn_452.rn_3032("card").rn_3032(rn_6928.rn_6933(rn_793)).rn_3038("ct"), 10);
	}

	public final int rn_794(int rn_795) {
		return rn_3289.rn_6894(rn_452.rn_3032("card").rn_3032(rn_6928.rn_6933(rn_795)).rn_3038("v"), 10);
	}

	public final boolean rn_796() {
		try {;
		UserdataList.rn_3012(rn_529.rn_2977);
		String rn_797 = "/storage/emulated/0/.pvz/user.dat";
		if (rn_9923.rn_9959(rn_797)) {
			byte[] rn_798 = rn_9923.rn_9969(rn_797);
			int rn_799 = 24;
			rn_529.rn_2975 = rn_7395.rn_7410(rn_848(rn_798, rn_799, 4));
			rn_529.rn_2976 = rn_7395.rn_7410(rn_848(rn_798, rn_799 + 4, 4));
			rn_799 = rn_7395.rn_7410(rn_848(rn_798, rn_799 + 8, 4));
			for (int rn_10440 = 0;rn_10440 < rn_529.rn_2975;rn_10440 += 1) {
				int rn_800 = rn_7395.rn_7410(rn_848(rn_798, rn_799 + rn_10440 * 4, 4));
				Userdata rn_801 = new Userdata();
				byte[] rn_802 = rn_860(rn_798, rn_800);
				rn_801.rn_2979 = op.rn_1285(rn_802);
				rn_800 = rn_800 + rn_802.length + 1;
				rn_801.rn_2980 = rn_7395.rn_7410(rn_848(rn_798, rn_800, 4));
				rn_801.rn_2981 = rn_7395.rn_7410(rn_848(rn_798, rn_800 + 4, 4));
				rn_801.rn_2983 = op.rn_1345(rn_848(rn_798, rn_800 + 8, 1) [0]);
				rn_801.rn_2984 = op.rn_1345(rn_848(rn_798, rn_800 + 9, 1) [0]);
				rn_801.rn_2985 = op.rn_1345(rn_848(rn_798, rn_800 + 10, 1) [0]);
				UserdataList.rn_2998(rn_529.rn_2977, rn_801);
			}
			return true;
		} else {
			return false;
		}
		} catch (Exception e) {;
		rn_805("注意，已有存档读取失败，说不定是损坏了，简而言之，你存档没了。");
		};
		return false;
	}

	public final boolean rn_803(int rn_804) {
		if (rn_804 >= 40) {
		} else {
			if (rn_529.rn_2978().rn_2980 == 0) {
				if (rn_804 < rn_529.rn_2978().rn_2981) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}
		return false;
	}

	public final void rn_805(String rn_806) {
		rn_806 = rn_806;
	}

	public final void rn_807(Plant rn_808, float rn_809, android.graphics.Matrix rn_810) {
		rn_744(rn_808.rn_2619 + rn_808.rn_2627.rn_3666 - 50, rn_808.rn_2620 + rn_808.rn_2627.rn_3667 + 12, "plantshadow", rn_810);
		rn_518.rn_3773 = null;
		rn_518.rn_3774 = rn_808.rn_2621;
		rn_518.rn_3775 = rn_808.rn_2621;
		rn_518.rn_3776 = rn_808.rn_2630;
		rn_518.rn_3777 = rn_808.rn_2630;
		rn_518.rn_3778 = 0.0F;
		rn_518.rn_3779 = 0.0F;
		rn_518.rn_3780 = -1;
		rn_518.rn_3781 = rn_808.rn_2736();
		rn_518.rn_3782 = rn_808.rn_2620;
		rn_518.rn_3783 = null;
		for (int rn_10441 = 0;rn_10441 < rn_808.rn_2618.length;rn_10441 += 1) {
			rn_518.rn_3773 = (rn_808.rn_2618) [rn_10441];
			ShaderProgram_.rn_4111(rn_524, "u_clipRegion", 0, 0, rn_455, rn_456);
			rn_985(rn_453, rn_518, rn_809);
		}
	}

	public final int rn_811() {
		if (rn_497 < 6) {
			return rn_497;
		}
		return rn_529.rn_2978().rn_2986;
	}

	public final void rn_812(Zombie rn_813, float rn_814, android.graphics.Matrix rn_815) {
		rn_744(rn_813.rn_2329() + rn_813.rn_2219.rn_3666 - 27, rn_813.rn_2171 + rn_813.rn_2219.rn_3667 + rn_813.rn_2219.rn_3669 - 20, "plantshadow", rn_815);
		rn_518.rn_3773 = rn_813.rn_2169;
		rn_518.rn_3774 = 1.0F;
		rn_518.rn_3775 = 1.0F;
		rn_518.rn_3776 = rn_813.rn_2190;
		rn_518.rn_3777 = rn_813.rn_2190;
		rn_518.rn_3780 = -1;
		rn_518.rn_3781 = rn_813.rn_2329();
		rn_518.rn_3782 = rn_813.rn_2171;
		if (rn_813.rn_2227) {
			rn_518.rn_3783 = rn_813.rn_2226;
		} else {
			rn_518.rn_3783 = null;
		}
		if (rn_813.rn_2200) {
			float rn_816 = (rn_459 + rn_813.rn_2329() * rn_813.rn_2201.rn_4284 + rn_813.rn_2201.rn_4280) * rn_461;
			float rn_817 = (rn_460 + rn_813.rn_2171 * rn_813.rn_2201.rn_4285 + rn_813.rn_2201.rn_4281) * rn_461;
			float rn_818 = rn_813.rn_2201.rn_4282 * rn_461;
			float rn_819 = rn_813.rn_2201.rn_4283 * rn_461;
			ShaderProgram_.rn_4111(rn_524, "u_clipRegion", rn_816, ope.rn_1913(rn_817, rn_456, rn_819), rn_818, rn_819);
		} else {
			ShaderProgram_.rn_4111(rn_524, "u_clipRegion", 0, 0, rn_455, rn_456);
		}
		rn_985(rn_453, rn_518, rn_814);
		rn_813.rn_2324();
	}

	public final void rn_820(Mower rn_821, float rn_822) {
		rn_518.rn_3773 = rn_821.rn_2600;
		rn_518.rn_3774 = rn_821.rn_2603;
		rn_518.rn_3775 = rn_821.rn_2603;
		rn_518.rn_3776 = 0;
		rn_518.rn_3777 = 0;
		rn_518.rn_3780 = -1;
		rn_518.rn_3781 = rn_821.rn_2595;
		rn_518.rn_3782 = rn_821.rn_2610();
		rn_518.rn_3783 = null;
		rn_985(rn_453, rn_518, rn_822);
	}

	public final void rn_823() {
		byte[] rn_824 = (byte[]) (new byte[1024]);
		rn_833(rn_824, 0, Nirvana.rn_829("FF FF FF FF FF FF FF FF    FF FF FF FF FF FF FF FF    50 56 5A 31 00 00 00 01"));
		int rn_825 = 24;
		rn_833(rn_824, rn_825, op.rn_1353(UserdataList.rn_1225(rn_529.rn_2977)));
		rn_833(rn_824, rn_825 + 4, op.rn_1353(rn_529.rn_2976));
		rn_833(rn_824, rn_825 + 8, op.rn_1353(rn_825 + 16));
		rn_825 = rn_825 + 16;
		int rn_826 = rn_825 + UserdataList.rn_1225(rn_529.rn_2977) * 4;
		for (int rn_10442 = 0;rn_10442 < UserdataList.rn_1225(rn_529.rn_2977);rn_10442 += 1) {
			rn_833(rn_824, rn_825 + rn_10442 * 4, op.rn_1353(rn_826));
			byte[] rn_827 = rn_3289.rn_6901(UserdataList.rn_3006(rn_529.rn_2977, rn_10442).rn_2979, "UTF-8");
			rn_833(rn_824, rn_826, rn_827);
			rn_826 = rn_826 + rn_827.length + 1;
			rn_833(rn_824, rn_826, op.rn_1353(UserdataList.rn_3006(rn_529.rn_2977, rn_10442).rn_2980));
			rn_833(rn_824, rn_826 + 4, op.rn_1353(UserdataList.rn_3006(rn_529.rn_2977, rn_10442).rn_2981));
			rn_826 = rn_826 + 8;
			rn_833(rn_824, rn_826, new byte[]{op.rn_1341(UserdataList.rn_3006(rn_529.rn_2977, rn_10442).rn_2983)});
			rn_833(rn_824, rn_826 + 1, new byte[]{op.rn_1341(UserdataList.rn_3006(rn_529.rn_2977, rn_10442).rn_2984)});
			rn_833(rn_824, rn_826 + 2, new byte[]{op.rn_1341(UserdataList.rn_3006(rn_529.rn_2977, rn_10442).rn_2985)});
			rn_826 = rn_826 + 3;
		}
		String rn_828 = "/storage/emulated/0/.pvz/user.dat";
		rn_9923.rn_9971(rn_828, rn_824);
	}

	public static final byte[] rn_829(String rn_830) {
		rn_830 = rn_3289.rn_6866(rn_3289.rn_6866(rn_830, " ", ""), "\n", "");
		byte[] rn_831 = null;
		rn_831=new byte[rn_830.length()/2];
		for (int rn_10443 = 0;rn_10443 < rn_831.length;rn_10443 += 1) {
			int rn_832 = rn_3289.rn_6894(rn_3289.rn_6887(rn_830, rn_10443 * 2, rn_10443 * 2 + 1), 16);
			if (rn_832 > 127) {
				rn_832 = rn_832 - 256;
			}
			rn_831 [rn_10443] = (byte)rn_832;
		}
		return rn_831;
	}

	public final void rn_833(byte[] rn_834, int rn_835, byte[] rn_836) {
		for (int rn_10444 = rn_835;rn_10444 < rn_835 + rn_836.length;rn_10444 += 1) {
			rn_834 [rn_10444] = rn_836 [rn_10444 - rn_835];
		}
	}

	public final byte[] rn_848(byte[] rn_849, int rn_850, int rn_851) {
		byte[] rn_852 = null;
		rn_852=new byte[rn_851];
		for (int rn_10447 = rn_850;rn_10447 < rn_850 + rn_851;rn_10447 += 1) {
			rn_852 [rn_10447 - rn_850] = rn_849 [rn_10447];
		}
		return rn_852;
	}

	public final byte[] rn_860(byte[] rn_861, int rn_862) {
		int rn_863 = rn_862;
		int rn_864 = 0;
		for (int rn_10450 = 0;rn_10450 < 10;rn_10450 += 1) {
			rn_10450 = 1;
			if (rn_861 [rn_862] == 0) {
				break;
			} else {
				rn_862 = rn_862 + 1;
				rn_864 = rn_864 + 1;
			}
		}
		byte[] bytes = new byte[rn_864];
		for (int rn_10451 = 0;rn_10451 < rn_864;rn_10451 += 1) {
			bytes[rn_10451]=rn_861[rn_10451+rn_863];
		}
		return bytes;
	}

	public final void rn_865(int rn_866) {
		Plant rn_867 = Plant.rn_2637(Nirvana.this, -1, -1, rn_866);
		rn_507 = true;
		rn_501 = (rn_867.rn_2618) [0];
		rn_506 = rn_866;
	}

	public final void rn_869(int rn_870, int rn_871) {
		rn_497 = rn_870;
		rn_498 = rn_871;
		rn_500 = rn_889(rn_870, rn_871);
		rn_540 = false;
		rn_484 = 0;
		rn_482 = (int[]) (new int[0]);
		rn_530 = "none";
		int[] rn_872 = rn_878(rn_874().rn_3038("allowedZombies"));
		rn_493 = 0;
		rn_494 = XMLRED.rn_1225(rn_874().rn_3025);
		rn_490 = 0;
		rn_509 = 50;
		if (rn_497 == 1) {
			rn_509 = 150;
		}
		if (rn_497 != 50) {
			if (rn_497 == 1) {
				for (int rn_10452 = 0;rn_10452 < 5;rn_10452 += 1) {
					ZombieList.rn_2374(rn_477, rn_875(0));
				}
			} else if (rn_497 == 2) {
				for (int rn_10453 = 0;rn_10453 < 10;rn_10453 += 1) {
					ZombieList.rn_2374(rn_477, rn_875(0));
				}
			} else {
				for (int rn_10454 = 0;rn_10454 < rn_872.length;rn_10454 += 1) {
					ZombieList.rn_2374(rn_477, rn_875(rn_872 [rn_10454]));
				}
				int rn_873 = rn_7317.rn_7328(2, 5);
				if (rn_872.length < 5) {
					rn_873 = rn_872.length;
				}
				for (int rn_10455 = 0;rn_10455 < rn_873;rn_10455 += 1) {
					ZombieList.rn_2374(rn_477, rn_875(rn_872 [rn_7317.rn_7328(0, rn_872.length - 1)]));
				}
			}
		}
		for (int rn_10456 = 0;rn_10456 < 5;rn_10456 += 1) {
		}
	}

	public final XMLR rn_874() {
		return rn_511.rn_3032("PVZ").rn_3040("id", rn_885(rn_497, rn_498));
	}

	public final Zombie rn_875(int rn_876) {
		Zombie rn_877 = Zombie.万恶之源(Nirvana.this, rn_876, -1);
		rn_877.rn_2169.rn_3562("anim_idle", false);
		rn_877.rn_2170 = rn_7317.rn_7328(1050, 1200);
		rn_877.rn_2171 = rn_7317.rn_7328(0, 500);
		rn_877.rn_2169.rn_3487 = 0.5F * Zombie.rn_2255();
		return rn_877;
	}

	public final int[] rn_878(String rn_879) {
		String[] rn_880 = rn_3289.rn_6892(rn_879, " ");
		int[] rn_881 = (int[]) (new int[rn_880.length]);
		for (int rn_10457 = 0;rn_10457 < rn_880.length;rn_10457 += 1) {
			try {;
			rn_881 [rn_10457] = rn_3289.rn_6894(rn_880 [rn_10457], 10);
			} catch (Exception e) { e.printStackTrace(); };
		}
		rn_881 = op.rn_1309(rn_881);
		int rn_882 = 0;
		for (int rn_10458 = 1;rn_10458 < rn_881.length;rn_10458 += 1) {
			if (rn_881 [rn_10458] == rn_881 [rn_10458 - 1]) {
				rn_882 = rn_882 + 1;
			}
		}
		int[] rn_883 = (int[]) (new int[rn_881.length - rn_882]);
		rn_883 [0] = rn_881 [0];
		int rn_884 = 1;
		for (int rn_10459 = 1;rn_10459 < rn_881.length;rn_10459 += 1) {
			if (rn_881 [rn_10459] != rn_881 [rn_10459 - 1]) {
				rn_883 [rn_884] = rn_881 [rn_10459];
				rn_884 = rn_884 + 1;
			}
		}
		return rn_883;
	}

	public final String rn_885(int rn_886, int rn_887) {
		String rn_888 = "";
		if (rn_887 == 0) {
			rn_888 = "";
		} else if (rn_887 == 1) {
			rn_888 = "B";
		} else if (rn_887 == 2) {
			rn_888 = "C";
		} else if (rn_887 == 3) {
			rn_888 = "D";
		}
		return rn_888 + rn_6928.rn_6933(rn_886);
	}

	public final int rn_889(int rn_890, int rn_891) {
		if (rn_891 == 0 || rn_891 == 1) {
			if (rn_890 <= 10) {
				return 0;
			} else if (rn_890 <= 20) {
				return 1;
			} else if (rn_890 <= 30) {
				return 2;
			} else if (rn_890 <= 40) {
				return 3;
			} else if (rn_890 < 50) {
				return 4;
			} else if (rn_890 == 50) {
				return 5;
			}
		}
		return 0;
	}

	public final int[] rn_892(float rn_893, float rn_894) {
		float rn_895 = rn_893 - 260;
		rn_895 = (rn_895 - rn_895 % 80) / 80;
		float rn_896 = rn_894 - 80;
		rn_896 = (rn_896 - rn_896 % 100) / 100;
		int[] rn_897 = {(int) rn_895, (int) rn_896};
		return rn_897;
	}

	public final void rn_905(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_906, float rn_907, float rn_908, float rn_909, float rn_910, boolean rn_911, int rn_912) {
		if (rn_911) {
			com.badlogic.gdx.graphics.Pixmap rn_913 = Pixmap_.rn_4082(1, 1);
			int rn_914 = ope.rn_1919(rn_912);
			rn_913.setColor(rn_914);
			rn_913.fill();
			com.badlogic.gdx.graphics.Texture rn_915 = Texture_.rn_4059(rn_913);
			SpriteBatch.rn_4028(rn_906, rn_915, rn_907 * rn_461, ope.rn_1913(rn_908 * rn_461, rn_456, rn_910 * rn_461), rn_909 * rn_461, rn_910 * rn_461);
			ShaderProgram_.rn_4117(rn_524, "u_opacity", 1);
			ShaderProgram_.rn_4106(rn_524, "u_rgbFactors", 1, 1, 1);
		} else {
			com.badlogic.gdx.graphics.Pixmap rn_916 = Pixmap_.rn_4082(1, 1);
			int rn_917 = ope.rn_1919(rn_912);
			rn_916.setColor(rn_917);
			rn_916.fill();
			com.badlogic.gdx.graphics.Texture rn_918 = Texture_.rn_4059(rn_916);
			float rn_919 = rn_907 * rn_461;
			float rn_920 = ope.rn_1913(rn_908 * rn_461, rn_456, rn_910 * rn_461);
			float rn_921 = rn_909 * rn_461;
			float rn_922 = rn_910 * rn_461;
			int rn_923 = 2;
			SpriteBatch.rn_4028(rn_906, rn_918, rn_919, rn_920, rn_921 + rn_923, rn_923);
			ShaderProgram_.rn_4117(rn_524, "u_opacity", 1);
			ShaderProgram_.rn_4106(rn_524, "u_rgbFactors", 1, 1, 1);
			SpriteBatch.rn_4028(rn_906, rn_918, rn_919, rn_920, rn_923, rn_922);
			SpriteBatch.rn_4028(rn_906, rn_918, rn_919 + rn_921, rn_920, rn_923, rn_922);
			SpriteBatch.rn_4028(rn_906, rn_918, rn_919, rn_920 + rn_922, rn_921, rn_923);
		}
	}

	public final void rn_924(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_925, Rectx rn_926, int rn_927) {
		rn_925 = rn_925;
		rn_926 = rn_926;
		rn_927 = rn_927;
	}

	public final void rn_928(android.view.MotionEvent rn_929, boolean rn_930) {
		try {;
		rn_470 = rn_929;
		boolean rn_931 = false;
		boolean rn_932 = false;
		rn_467 = (float) ((float) ((rn_8820.rn_8826(rn_929, 0) - rn_473)));
		rn_468 = (float) ((float) (rn_8820.rn_8828(rn_929, 0)));
		long rn_933 = rn_10083.rn_10089();
		if (rn_507) {
			int[] rn_934 = rn_892(rn_467 / rn_461 - rn_459, rn_468 / rn_461);
			rn_502 = rn_934 [0];
			rn_503 = rn_934 [1];
			rn_504 = rn_467 / rn_461;
			rn_505 = rn_468 / rn_461;
		}
		if (rn_8820.rn_8822(rn_929) == rn_8813.rn_8814 && rn_930 == false) {
			rn_465 = rn_467;
			rn_466 = rn_468;
			rn_469 = rn_10083.rn_10089();
		} else if (rn_8820.rn_8822(rn_929) == rn_8813.rn_8816 && rn_930 == false) {
			if (rn_507) {
				boolean rn_935 = true;
				for (int rn_10460 = 0;rn_10460 < PlantList.rn_1225(rn_478);rn_10460 += 1) {
					if (rn_503 == PlantList.rn_2398(rn_478, rn_10460).rn_2622 && rn_502 == PlantList.rn_2398(rn_478, rn_10460).rn_2623 && rn_982(rn_502, rn_503)) {
						rn_935 = false;
						break;
					}
				}
				if (rn_935 && rn_982(rn_502, rn_503)) {
					if (rn_3289.rn_6850(rn_530, "op")) {
						rn_530 = "ep";
						rn_1140("ADVICE_PLANTED_PEASHOOTER", -1);
						rn_484 = 0;
						rn_490 = 200;
						rn_547 = true;
					} else if (rn_3289.rn_6850(rn_530, "sp")) {
						rn_1140("ADVICE_ZOMBIE_ONSLAUGHT", 400);
						rn_510 = 4;
						rn_484 = 0;
						rn_530 = "";
					}
					PlantList.rn_2406(rn_478, Plant.rn_2637(Nirvana.this, rn_503, rn_502, rn_506));
					XMLR rn_936 = (rn_452).rn_3032("card").rn_3032(rn_6928.rn_6933(rn_506));
					if (rn_526 == false) {
						rn_483 [rn_508] = rn_3289.rn_6894(rn_936.rn_3038("ct"), 10);
					}
					if (rn_527 == false) {
						rn_509 = rn_509 - rn_794(rn_506);
					}
				}
				rn_507 = false;
				rn_501 = null;
			}
			if (ope.rn_1855(rn_467 - rn_465) + ope.rn_1855(rn_467 - rn_465) < 50 && rn_933 - rn_469 < 100) {
				rn_931 = true;
				rn_447.rn_3081 = "click:x=" + rn_467 + "  y=" + rn_468;
			}
			rn_470 = null;
		} else if (rn_8820.rn_8822(rn_929) == rn_8813.rn_8815 || rn_930) {
			if (rn_933 - rn_469 >= 20) {
				rn_932 = true;
				rn_447.rn_3081 = "move:x=" + rn_467 + "  y=" + rn_468;
			}
		}
		boolean rn_937 = false;
		Point rn_938 = Point.rn_4178(rn_467 / rn_461, rn_468 / rn_461);
		if (rn_932 || rn_931) {
			for (int rn_10461 = 0;rn_10461 < rn_476.rn_1225() + CoinList.rn_1225(rn_492) + PlantList.rn_1225(rn_478) + ZombieList.rn_1225(rn_477) + RectaList.rn_1225(rn_531);rn_10461 += 1) {
				Rectx rn_939 = new Rectx();
				Rectx rn_940 = null;
				if (rn_10461 < rn_476.rn_1225()) {
					rn_939 = rn_476.rn_3696(rn_10461);
					rn_940 = rn_939;
				} else if (rn_10461 < rn_476.rn_1225() + CoinList.rn_1225(rn_492)) {
					Coin rn_941 = CoinList.rn_2460(rn_492, rn_10461 - rn_476.rn_1225());
					rn_939.rn_3666 = (rn_941.rn_2799() + rn_941.rn_2774.rn_3666 + rn_459) * rn_461;
					rn_939.rn_3667 = (rn_941.rn_2800() + rn_941.rn_2774.rn_3667) * rn_461;
					rn_939.rn_3668 = rn_941.rn_2774.rn_3668 * rn_461;
					rn_939.rn_3669 = rn_941.rn_2774.rn_3669 * rn_461;
					rn_940 = rn_941.rn_2774;
				} else if (rn_10461 < rn_476.rn_1225() + CoinList.rn_1225(rn_492) + PlantList.rn_1225(rn_478)) {
					Plant rn_942 = PlantList.rn_2398(rn_478, rn_10461 - rn_476.rn_1225() - CoinList.rn_1225(rn_492));
					rn_939.rn_3666 = (rn_942.rn_2736() + rn_942.rn_2627.rn_3666 + rn_459) * rn_461;
					rn_939.rn_3667 = (rn_942.rn_2737() + rn_942.rn_2627.rn_3667) * rn_461;
					rn_939.rn_3668 = rn_942.rn_2627.rn_3668 * rn_461;
					rn_939.rn_3669 = rn_942.rn_2627.rn_3669 * rn_461;
					rn_940 = rn_942.rn_2627;
				} else if (rn_10461 < rn_476.rn_1225() + CoinList.rn_1225(rn_492) + PlantList.rn_1225(rn_478) + ZombieList.rn_1225(rn_477)) {
					Zombie rn_943 = ZombieList.rn_2366(rn_477, rn_10461 - rn_476.rn_1225() - CoinList.rn_1225(rn_492) - PlantList.rn_1225(rn_478));
					rn_939.rn_3666 = (rn_943.rn_2329() + rn_943.rn_2219.rn_3666 + rn_459) * rn_461;
					rn_939.rn_3667 = (rn_943.rn_2171 + rn_943.rn_2219.rn_3667) * rn_461;
					rn_939.rn_3668 = rn_943.rn_2219.rn_3668 * rn_461;
					rn_939.rn_3669 = rn_943.rn_2219.rn_3669 * rn_461;
					rn_940 = rn_943.rn_2219;
				} else {
					rn_940 = null;
				}
				if (rn_940 != null) {
					if (rn_939.rn_3679(rn_467, rn_468)) {
						rn_940.rn_3671 = rn_932;
						rn_940.rn_3672 = rn_931;
					} else {
						rn_940.rn_3671 = false;
						rn_940.rn_3672 = false;
					}
				}
			}
		}
		for (int rn_10462 = 0;rn_10462 < RectaList.rn_1225(rn_531);rn_10462 += 1) {
			Detrect rn_944 = RectaList.rn_4248(rn_531, rn_10462);
			if (rn_937 == false) {
				if (rn_944.rn_4207(rn_938)) {
					rn_937 = true;
					if (rn_8820.rn_8822(rn_929) == rn_8813.rn_8816) {
						if (rn_944.rn_4202(rn_938)) {
							rn_944.rn_4213(rn_938);
						} else {
							rn_944.rn_4210(rn_938, "up");
						}
						rn_531.rn_4277 = "";
					} else {
						if (rn_3289.rn_6850(rn_531.rn_4277, rn_944.rn_4183)) {
							rn_944.rn_4210(rn_938, "move");
						} else {
							if (rn_3289.rn_6852(rn_531.rn_4277, "")) {
								rn_531.rn_4278(rn_531.rn_4277).rn_4210(rn_938, "up");
							}
							rn_944.rn_4184 = rn_10083.rn_10089();
							rn_944.rn_4185 = rn_938;
							rn_944.rn_4210(rn_938, "down");
							rn_531.rn_4277 = rn_944.rn_4183;
						}
					}
				}
			}
		}
		if (rn_937 == false && rn_3289.rn_6852(rn_531.rn_4277, "")) {
			rn_531.rn_4278(rn_531.rn_4277).rn_4210(rn_938, "up");
			rn_531.rn_4277 = "";
		}
		} catch (Exception e) {;
		};
	}

	public final int rn_946(int rn_947) {
		int rn_948 = rn_950(rn_947);
		int rn_949 = (rn_947 - rn_948) / 10 + 1;
		return rn_949;
	}

	public final int rn_950(int rn_951) {
		int rn_952 = rn_951 % 10;
		if (rn_952 == 0) {
			rn_952 = 10;
		}
		return rn_952;
	}

	public final String rn_953() {
		int rn_954 = rn_950(rn_497);
		int rn_955 = rn_946(rn_497);
		return rn_4434.rn_4447(rn_462, "LEVEL") + rn_955 + "-" + rn_954;
	}

	public final void rn_956(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_957, String rn_958, int rn_959, int rn_960, int rn_961, float rn_962, float rn_963, float rn_964) {
		android.graphics.Paint rn_965 = Paint_.rn_1670(Paint_.rn_1667(Paint_.rn_1665(Paint_.rn_1663(), rn_464), (int) (rn_962 * rn_461)), -16777216);
		BitmapFontData_.rn_4174(BitmapFont_.rn_4157(rn_525), rn_962 * rn_461 / 32);
		BitmapFont_.rn_4158(rn_525, Color_.rn_4068(ope.rn_1919(rn_961)));
		BitmapFont_.rn_4167(rn_525, rn_957, rn_958, (int) (rn_959 * rn_461 + Paint_.rn_1673(rn_965, rn_958) * rn_963), (int) (rn_456 - (rn_960 * rn_461 + rn_964 * rn_962)));
		ShaderProgram_.rn_4117(rn_524, "u_opacity", 1);
		ShaderProgram_.rn_4106(rn_524, "u_rgbFactors", 1, 1, 1);
	}

	public final void rn_966(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_967, String rn_968, int rn_969, int rn_970, int rn_971, int rn_972, float rn_973, float rn_974, float rn_975, int rn_976, int rn_977) {
		rn_956(rn_967, rn_968, rn_969 + rn_976, rn_970 + rn_977, rn_972, rn_973, rn_974, rn_975);
		rn_956(rn_967, rn_968, rn_969, rn_970, rn_971, rn_973, rn_974, rn_975);
	}

	public final float rn_978() {
		float rn_979 = 0.0F;
		if (rn_3289.rn_6850(rn_447.rn_3084, "reanim")) {
		} else if (rn_3289.rn_6850(rn_447.rn_3084, "image")) {
			return 0.0F;
		} else if (rn_3289.rn_6850(rn_447.rn_3084, "anim")) {
			rn_979 = rn_979 + 0.5F;
		}
		if (rn_447.rn_3083 != 0) {
			rn_979 = rn_979 + rn_447.rn_3082 * 0.5F / rn_447.rn_3083;
		}
		return rn_979;
	}

	public final float rn_980(float rn_981) {
		return (rn_455 - rn_981) / 2;
	}

	public final boolean rn_982(int rn_983, int rn_984) {
		if (rn_497 == 1 && rn_984 != 2) {
			return false;
		} else if (rn_497 == 2 && (rn_984 != 1 || rn_984 != 2 || rn_984 != 3)) {
			return false;
		} else if (rn_983 < 0 || rn_983 >= 9 || rn_984 < 0 || rn_984 >= rn_1148()) {
			return false;
		}
		return true;
	}

	public final void rn_985(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_986, DrawStyle rn_987, float rn_988) {
		Anim rn_989 = rn_987.rn_3773;
		for (int rn_10463 = 0;rn_10463 < Reanimed.rn_1225(rn_989.rn_3483);rn_10463 += 1) {
			rn_998(rn_986, rn_987.rn_3773, rn_989.rn_3485, Reanimed.rn_3343((rn_989.rn_3483), rn_10463), rn_987.rn_3781, rn_987.rn_3782, rn_987.rn_3776, rn_987.rn_3777, 0, rn_987.rn_3774, rn_987.rn_3775, rn_10463, rn_988, rn_987.rn_3778, rn_987.rn_3779, rn_987.rn_3783);
			Anim rn_990 = (rn_989.rn_3492).rn_3416(rn_10463);
			if (rn_990 != null) {
				DrawStyle rn_991 = new DrawStyle();
				POS_int rn_992 = rn_989.rn_3536(rn_989.rn_3485, rn_10463);
				POS rn_993 = rn_992.rn_3788;
				rn_991.rn_3773 = rn_990;
				rn_991.rn_3774 = rn_993.rn_3273;
				rn_991.rn_3775 = rn_993.rn_3274;
				rn_991.rn_3776 = rn_993.rn_3275;
				rn_991.rn_3777 = rn_993.rn_3276;
				rn_991.rn_3781 = rn_993.rn_3271;
				rn_991.rn_3782 = rn_993.rn_3272;
				if ((rn_989.rn_3492.rn_3407).rn_1200(rn_989.rn_3492.rn_3418(rn_10463))) {
					rn_991.rn_3784(rn_987);
					POS rn_994 = rn_989.rn_3492.rn_3420(rn_10463);
					rn_519.rn_3781 = rn_994.rn_3271;
					rn_519.rn_3782 = rn_994.rn_3272;
					rn_519.rn_3774 = rn_994.rn_3273;
					rn_519.rn_3775 = rn_994.rn_3274;
					rn_519.rn_3776 = rn_994.rn_3275;
					rn_519.rn_3777 = rn_994.rn_3276;
					rn_991.rn_3784(rn_519);
					rn_991.rn_3778 = rn_994.rn_3280;
					rn_991.rn_3779 = rn_994.rn_3281;
					ope.rn_1923(rn_994);
				}
				rn_985(rn_986, rn_991, rn_988);
				ope.rn_1923(rn_991);
				ope.rn_1923(rn_992);
				ope.rn_1923(rn_993);
				ope.rn_1923(rn_519);
			}
		}
		if (rn_989.rn_3489 != -1) {
			rn_989.rn_3491 = rn_989.rn_3491 + rn_989.rn_3487 * rn_989.rn_3505() * rn_988 * rn_471;
			if (rn_989.rn_3491 >= rn_989.rn_3490) {
				rn_989.rn_3485 = rn_989.rn_3489;
				rn_989.rn_3489 = -1;
				rn_989.rn_3490 = -1.0F;
				rn_989.rn_3491 = -1.0F;
				rn_989.rn_3493 = true;
			}
		} else {
			if (rn_989.rn_3498 == false) {
				rn_989.rn_3485 = rn_989.rn_3485 + rn_989.rn_3487 * rn_989.rn_3505() * rn_988 * rn_471;
				if (rn_989.rn_3485 + 1 + rn_989.rn_3487 * rn_988 * rn_471 >= rn_989.rn_3486) {
					if (rn_989.rn_3499) {
						rn_989.rn_3498 = true;
						rn_989.rn_3485 = rn_989.rn_3486 - 1;
					}
				}
				if (rn_989.rn_3485 + 1 + rn_989.rn_3487 * rn_989.rn_3505() * rn_988 * rn_471 >= rn_989.rn_3486) {
					if (rn_3289.rn_6852(rn_989.rn_3494, "")) {
						rn_989.rn_3562(rn_989.rn_3494, false);
						rn_989.rn_3494 = "";
						rn_989.rn_3496 = true;
					} else if (rn_989.rn_3499 == false) {
						rn_989.rn_3485 = rn_989.rn_3484;
						rn_989.rn_3493 = true;
					}
				}
			}
		}
		ope.rn_1923(rn_987);
	}
	public int rn_995 = 0;
	public long rn_996 = 0L;
	public long rn_997 = 0L;

	public final POS rn_998(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_999, Anim rn_1000, float rn_1001, Reanim rn_1002, float rn_1003, float rn_1004, float rn_1005, float rn_1006, int rn_1007, float rn_1008, float rn_1009, int rn_1010, float rn_1011, float rn_1012, float rn_1013, android.graphics.Matrix rn_1014) {
		rn_997 = rn_997 + 1;
		rn_1007 = rn_1007;
		POS_int rn_1015 = rn_1000.rn_3536(rn_1001, rn_1010);
		POS rn_1016 = rn_1015.rn_3786;
		POS rn_1017 = rn_1015.rn_3788;
		int rn_1018 = rn_1015.rn_3789;
		if (rn_1000.rn_3547(rn_1010, rn_1018) == -1) {
			return null;
		}
		if (rn_3289.rn_6850(rn_1016.rn_3279, "")) {
			return null;
		}
		rn_1002.rn_3123 = String_Nlimage.rn_3336(rn_446, rn_1016.rn_3279).rn_3634();
		com.badlogic.gdx.graphics.Texture rn_1019 = rn_1002.rn_3123.rn_2068(1, 1, 0);
		com.badlogic.gdx.graphics.Color rn_1020 = Color_.rn_4070(1, 1, 1, 1);
		Renderinfo rn_1021 = RenderinfoList.rn_3453((rn_1000.rn_3497), rn_1010);
		if (rn_1021.rn_3433) {
			float[] rn_1022 = rn_1021.rn_3443();
			float[] rn_1023 = rn_1022;
			if (rn_1020 == null) {
				rn_1020 = Color_.rn_4070(1, 1, 1, 1);
				rn_995 = rn_995 + 1;
			}
			Color_.rn_4077(rn_1020, rn_1023 [0], rn_1023 [1], rn_1023 [2], rn_1023 [3]);
			rn_1021.rn_3428 = rn_1021.rn_3428 - rn_1000.rn_3487 * rn_1011;
		}
		if (rn_3289.rn_6852(rn_1021.rn_3429, "")) {
			rn_1019 = String_Nlimage.rn_3336(rn_446, rn_1021.rn_3429).rn_3634().rn_2068(1, 1, 0);
		}
		float[] rn_1024 = rn_1021.rn_3443();
		浮光掠影(rn_999, rn_1019, rn_459 * rn_461 + rn_1003 * rn_461, rn_460 * rn_461 + rn_1004 * rn_461, (rn_1017.rn_3273 * rn_1008) * rn_461, (rn_1017.rn_3274 * rn_1009) * rn_461, rn_1017.rn_3275, rn_1017.rn_3276, -1, rn_1024, rn_1005, rn_1006, rn_459 * rn_461 + rn_1003 * rn_461 + rn_1012, rn_460 * rn_461 + rn_1004 * rn_461 + rn_1013, rn_1002.rn_3123.rn_2019, rn_1002.rn_3123.rn_2020, rn_1014, rn_1017.rn_3271 * rn_461 * rn_1008, rn_1017.rn_3272 * rn_461 * rn_1009);
		ope.rn_1923(rn_1015);
		ope.rn_1923(rn_1016);
		ope.rn_1923(rn_1017);
		ope.rn_1923(rn_1019);
		ope.rn_1923(rn_1020);
		return null;
	}

	public final int rn_1025() {
		return 80;
	}
	public android.graphics.Matrix rn_1026 = Matrix_.rn_3576();
	public android.graphics.Paint rn_1027 = null;

	public final Object 浮光掠影(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_1028, com.badlogic.gdx.graphics.Texture rn_1029, float rn_1030, float rn_1031, float rn_1032, float rn_1033, float rn_1034, float rn_1035, int rn_1036, float[] rn_1037, float rn_1038, float rn_1039, float rn_1040, float rn_1041, int rn_1042, int rn_1043, android.graphics.Matrix rn_1044, float rn_1045, float rn_1046) {
		rn_1028 = rn_1028;
		rn_1036 = rn_1036;
		rn_1042 = rn_1042;
		rn_1043 = rn_1043;
		if (rn_1026 == null) {
			rn_1026 = Matrix_.rn_3576();
		} else {
			rn_1026.reset();
		}
		float[] rn_1047 = new float[0];
		if (rn_1044 != null) {
			rn_1047 = Matrix_.rn_3579(rn_1044);
			rn_1047 [2] = rn_1047 [2] * rn_461;
			rn_1047 [5] = rn_1047 [5] * rn_461;
			rn_1044 = Matrix_.rn_3576();
			rn_1044.setValues(rn_1047);
		}
		if (rn_1027 == null) {
			rn_1027 = Paint_.rn_1663();
			rn_1027.setFilterBitmap(true);
		}
		float rn_1048 = rn_1035 - rn_1034;
		float rn_1049 = op.rn_1242(rn_7317.rn_7356(360 - rn_1048));
		Matrix_.rn_3587(rn_1026, rn_1032, rn_1033, 0, 0);
		float rn_1050 = op.rn_1242(rn_7317.rn_7322(rn_1049));
		float rn_1051 = op.rn_1242(rn_7317.rn_7334(rn_1049));
		Matrix_.rn_3587(rn_1026, 1.0F, rn_1050, 0, 0);
		Matrix_.rn_3595(rn_1026, rn_1051, 0, 0, 0);
		Matrix_.rn_3581(rn_1026, rn_1034, 0, 0);
		Matrix_.rn_3603(rn_1026, rn_1045, rn_1046);
		if (rn_1044 != null) {
			rn_1026.postConcat(rn_1044);
		}
		Matrix_.rn_3603(rn_1026, rn_1030, rn_1031);
		Matrix_.rn_3581(rn_1026, (rn_1038 + rn_1039) / 2, rn_1040, rn_1041);
		
		if (rn_1037 == null) {
		} else {
			SpriteBatch.rn_4034(rn_453, rn_1029, rn_1026, rn_1037, rn_456, Nirvana.this, false);
		}
		ope.rn_1923(rn_1029);
		ope.rn_1923(rn_1026);
		return null;
	}

	public final void rn_1052() {
		String rn_1053 = rn_9923.rn_9963("/storage/emulated/0/.pvz/main/properties/LawnStrings.txt", "GB2312");
		String rn_1054 = "";
		String rn_1055 = "";
		String rn_1056 = "wait";
		boolean rn_1057 = false;
		String rn_1058 = "";
		for (int rn_10464 = 0;rn_10464 < rn_6845.rn_1225(rn_1053);rn_10464 += 1) {
			rn_1054 = rn_3289.rn_6887(rn_1053, rn_10464, rn_10464);
			if (rn_3289.rn_6850(rn_1056, "wait")) {
				if (rn_3289.rn_6850(rn_1054, "[")) {
					rn_1056 = "name";
					rn_1055 = "";
				}
			} else if (rn_3289.rn_6850(rn_1056, "name") && rn_3289.rn_6850(rn_1054, "]")) {
				rn_1058 = rn_1055;
				rn_1055 = "";
				rn_1056 = "text";
			} else {
				if (rn_3289.rn_6850(rn_1054, "\n")) {
					if (rn_3289.rn_6852(rn_1055, "")) {
						if (rn_3289.rn_6850(rn_1056, "text")) {
							if (rn_1057) {
								rn_4434.rn_4442(rn_462, rn_1058, rn_1055);
								rn_1055 = "";
								rn_1056 = "wait";
							} else {
								rn_1057 = true;
							}
						}
					}
				} else {
					if (rn_1057) {
						if (rn_3289.rn_6850(rn_1056, "text")) {
							rn_1054 = "\n" + rn_1054;
						}
						rn_1057 = false;
					}
					rn_1055 = rn_1055 + rn_1054;
				}
			}
		}
	}

	public final void rn_1059() {
		String[] rn_1060 = op.rn_1381(new String[][]{rn_9923.rn_10013("/storage/emulated/0/.pvz/pvz/reanim/"), rn_9923.rn_10013("/storage/emulated/0/.pvz/main/reanim/")});
		rn_447.rn_3084 = "reanim";
		for (int rn_10465 = 0;rn_10465 < rn_1060.length;rn_10465 += 1) {
			if (rn_3289.rn_6864(rn_1060 [rn_10465], ".jpg") || rn_3289.rn_6864(rn_1060 [rn_10465], ".png")) {
				String_Nlimage.rn_3331(rn_446, "IMAGE_REANIM_" + rn_9923.rn_9935(rn_9923.rn_9937(rn_3289.rn_6879(rn_1060 [rn_10465]))), Nirvana.rn_1061("", rn_1060 [rn_10465]));
				rn_447 = new Stringk(rn_4301.rn_6843(("索引资源:" + rn_6928.rn_6933((rn_10465 + 1)) + "/" + rn_1060.length)) + "  " + rn_9923.rn_9935(rn_9923.rn_9937(rn_1060 [rn_10465])));
				rn_447.rn_3082 = (rn_10465 + 1);
				rn_447.rn_3083 = rn_1060.length;
			}
		}
		rn_447 = new Stringk("加载动画");
		rn_448 = reanims.rn_3101(rn_447, Nirvana.this);
		rn_449 = true;
	}

	public static final Nlimage rn_1061(String rn_1062, String rn_1063) {
		String rn_1064 = rn_1063 + rn_1062;
		if (rn_9923.rn_9959(rn_1064 + ".jpg")) {
			rn_1064 = rn_1064 + ".jpg";
		} else if (rn_9923.rn_9959(rn_1064 + ".png")) {
			rn_1064 = rn_1064 + ".png";
		}
		Nlimage rn_1065 = new Nlimage();
		rn_1065.rn_3632 = rn_1064;
		if (rn_3289.rn_6864(rn_1064, "jpg")) {
			for (int rn_10466 = 0;rn_10466 < rn_1065.rn_2018.length;rn_10466 += 1) {
				if ((rn_1065.rn_2018) [rn_10466] == -16777216) {
					(rn_1065.rn_2018) [rn_10466] = 0;
				}
			}
		}
		return rn_1065;
	}

	public final void rn_1066(int rn_1067) {
		ope.rn_1923(rn_528);
		rn_528 = new java.util.ArrayList<Anim>();
		rn_445 = rn_1067;
		rn_484 = 0;
		if (rn_1067 == 0) {
			rn_1059();
		} else if (rn_1067 == 1) {
			Anim rn_1068 = Anim.rn_3508("SelectorScreen", Nirvana.this).rn_3562("anim_open", false);
			rn_1068.rn_3499 = true;
			rn_1068.rn_3556(new String[]{"SelectorScreen_Adventure_button", "SelectorScreen_Adventure_shadow"}, -1, false);
			Animed.rn_3382(rn_528, rn_1068);
			for (int rn_10467 = 0;rn_10467 < 7;rn_10467 += 1) {
				if (rn_10467 != 3) {
					Anim rn_1069 = Anim.rn_3508("SelectorScreen", Nirvana.this).rn_3562("anim_cloud" + rn_10467, false);
					rn_1069.rn_3487 = rn_1069.rn_3487 / ope.rn_1821(48, 64);
					rn_1069.rn_3485 = ope.rn_1821(rn_1069.rn_3484, rn_1069.rn_3486 - 1);
					Animed.rn_3374(rn_528, 0).rn_3524("Cloud" + rn_10467, rn_1069, new POS(), false);
				}
			}
			Detrect rn_1070 = Detrect.rn_4186(410, 81, 410, 160, 730, 200, 735, 100);
			rn_1070.rn_4183 = "冒险模式";
			RectaList.rn_4256(rn_531, rn_1070);
			rn_1070.rn_4210_s(new bk.pvz.Detrect.rn_4210_r() {
				@Override
				public void dispatch(Point rn_1072, String rn_1073) {
					if (rn_3289.rn_6852(rn_530, "advent")) {
						if (rn_3289.rn_6850(rn_1073, "down")) {
							rn_531.rn_4277 = rn_1070.rn_4183;
							if (UserdataList.rn_3006(rn_529.rn_2977, rn_529.rn_2976).rn_2981 < 0) {
								Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_StartAdventure_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_StartAdventure_Highlight"));
							} else {
								Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_Adventure_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_Adventure_highlight"));
							}
						} else if (rn_3289.rn_6850(rn_1073, "move")) {
						} else if (rn_3289.rn_6850(rn_1073, "up")) {
							rn_531.rn_4277 = "";
							if (UserdataList.rn_3006(rn_529.rn_2977, rn_529.rn_2976).rn_2981 < 0) {
								Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_StartAdventure_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_StartAdventure_Button1"));
							} else {
								Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_Adventure_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_Adventure_button"));
							}
						}
					}
				}
			});
			rn_1070.rn_4213_s(new bk.pvz.Detrect.rn_4213_r() {
				@Override
				public void dispatch(Point rn_1075) {
					if (rn_3289.rn_6852(rn_530, "advent") && rn_3289.rn_6852(rn_530, "none")) {
						rn_1070.rn_4210(rn_1075, "up");
						Anim rn_1076 = Anim.rn_3508("Zombie_hand", Nirvana.this);
						rn_1076.rn_3499 = true;
						Animed.rn_3382(rn_528, rn_1076);
						rn_530 = "advent";
					}
				}
			});
			Detrect rn_1077 = Detrect.rn_4186(410, 170, 410, 250, 710, 305, 725, 220);
			rn_1077.rn_4183 = "迷你游戏";
			RectaList.rn_4256(rn_531, rn_1077);
			rn_1077.rn_4210_s(new bk.pvz.Detrect.rn_4210_r() {
				@Override
				public void dispatch(Point rn_1079, String rn_1080) {
					if (rn_3289.rn_6850(rn_1080, "down")) {
						rn_531.rn_4277 = rn_1077.rn_4183;
						Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_Survival_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_Survival_highlight"));
					} else if (rn_3289.rn_6850(rn_1080, "move")) {
					} else if (rn_3289.rn_6850(rn_1080, "up")) {
						rn_531.rn_4277 = "";
						Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_Survival_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_Survival_button"));
					}
				}
			});
			rn_1077.rn_4213_s(new bk.pvz.Detrect.rn_4213_r() {
				@Override
				public void dispatch(Point rn_1082) {
					rn_1077.rn_4210(rn_1082, "up");
				}
			});
			Detrect rn_1083 = Detrect.rn_4186(415, 260, 415, 320, 680, 380, 700, 310);
			rn_1083.rn_4183 = "益智模式";
			RectaList.rn_4256(rn_531, rn_1083);
			rn_1083.rn_4210_s(new bk.pvz.Detrect.rn_4210_r() {
				@Override
				public void dispatch(Point rn_1085, String rn_1086) {
					if (rn_3289.rn_6850(rn_1086, "down")) {
						rn_531.rn_4277 = rn_1083.rn_4183;
						Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_Challenges_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_Challenges_highlight"));
					} else if (rn_3289.rn_6850(rn_1086, "move")) {
					} else if (rn_3289.rn_6850(rn_1086, "up")) {
						rn_531.rn_4277 = "";
						Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_Challenges_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_Challenges_button"));
					}
				}
			});
			rn_1083.rn_4213_s(new bk.pvz.Detrect.rn_4213_r() {
				@Override
				public void dispatch(Point rn_1088) {
					rn_1083.rn_4210(rn_1088, "up");
				}
			});
			Detrect rn_1089 = Detrect.rn_4186(420, 330, 420, 385, 665, 450, 680, 385);
			rn_1089.rn_4183 = "生存模式";
			RectaList.rn_4256(rn_531, rn_1089);
			rn_1089.rn_4210_s(new bk.pvz.Detrect.rn_4210_r() {
				@Override
				public void dispatch(Point rn_1091, String rn_1092) {
					if (rn_3289.rn_6850(rn_1092, "down")) {
						rn_531.rn_4277 = rn_1089.rn_4183;
						Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_ZenGarden_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_Vasebreaker_highlight"));
					} else if (rn_3289.rn_6850(rn_1092, "move")) {
					} else if (rn_3289.rn_6850(rn_1092, "up")) {
						rn_531.rn_4277 = "";
						Animed.rn_3374(rn_528, 0).rn_3529("SelectorScreen_ZenGarden_button", "IMAGE_REANIM_" + rn_3289.rn_6879("SelectorScreen_Vasebreaker_button"));
					}
				}
			});
			rn_1089.rn_4213_s(new bk.pvz.Detrect.rn_4213_r() {
				@Override
				public void dispatch(Point rn_1094) {
					rn_1089.rn_4210(rn_1094, "up");
				}
			});
			if (rn_529.rn_2975 == 0) {
			} else {
				rn_758(false);
			}
		} else if (rn_1067 == 2) {
			rn_535 = -87;
			int rn_1095 = UserdataList.rn_2990((rn_529.rn_2977), rn_529.rn_2976).rn_2981;
			if (rn_1095 == -1) {
				rn_869(1, 0);
			} else {
				rn_869(rn_1095, 0);
			}
		} else if (rn_1067 == 7) {
			int rn_1096 = UserdataList.rn_2990((rn_529.rn_2977), rn_529.rn_2976).rn_2981;
			if (rn_1096 == -1) {
				rn_869(0, 0);
			} else {
				rn_869(rn_1096, 0);
			}
		}
	}

	public final void rn_1097() {
		rn_512 = 0;
		rn_513 = 1.0F;
		XMLR rn_1098 = XMLRED.rn_3211((rn_511.rn_3032("PVZ").rn_3040("id", rn_885(rn_497, rn_498)).rn_3025), rn_493);
		int rn_1099 = rn_3289.rn_6894(rn_1098.rn_3038("points"), 10);
		int[] rn_1100 = rn_878(rn_1098.rn_3038("mustHaveZombies"));
		for (int rn_10468 = 0;rn_10468 < rn_1100.length;rn_10468 += 1) {
			ZombieList.rn_2374(rn_477, Zombie.万恶之源(Nirvana.this, rn_1100 [rn_10468], rn_1160()));
			rn_512 = rn_512 + 1;
		}
		for (int rn_10469 = 0;rn_10469 < 10;rn_10469 += 1) {
			rn_10469 = 1;
			if (rn_1099 <= 1) {
				break;
			}
			ints rn_1101 = new ints();
			ints rn_1102 = new ints();
			int[] rn_1103 = rn_878(rn_874().rn_3038("allowedZombies"));
			for (int rn_10470 = 0;rn_10470 < rn_1103.length;rn_10470 += 1) {
				if (rn_3289.rn_6894(rn_1108(rn_1103 [rn_10470], "p"), 10) <= rn_1099) {
					rn_1101.rn_1423(rn_1103 [rn_10470]);
					float rn_1104 = rn_3289.rn_6899(rn_1108(rn_1103 [rn_10470], "s"));
					float rn_1105 = rn_3289.rn_6899(rn_1108(rn_1103 [rn_10470], "e"));
					rn_1102.rn_1423((int) (rn_1104 + (rn_1105 - rn_1104) * (rn_493 * 1.0F / rn_494)));
				}
			}
			int rn_1106 = 0;
			for (int rn_10471 = 0;rn_10471 < rn_1102.rn_1225();rn_10471 += 1) {
				rn_1106 = rn_1106 + rn_1102.rn_1418(rn_10471);
			}
			int rn_1107 = rn_7317.rn_7328(0, rn_1106);
			for (int rn_10472 = 0;rn_10472 < rn_1101.rn_1225();rn_10472 += 1) {
				if (rn_1107 < rn_1102.rn_1418(rn_10472)) {
					ZombieList.rn_2374(rn_477, Zombie.万恶之源(Nirvana.this, rn_1101.rn_1418(rn_10472), rn_1160()));
					rn_512 = rn_512 + 1;
					rn_1099 = rn_1099 - rn_3289.rn_6894(rn_1108(rn_1101.rn_1418(rn_10472), "p"), 10);
					break;
				}
			}
		}
		if (rn_3289.rn_6850(rn_1098.rn_3038("flag"), "1")) {
			ZombieList.rn_2374(rn_477, Zombie.万恶之源(Nirvana.this, 1, rn_1160()));
		}
		rn_493 = rn_493 + 1;
	}

	public final String rn_1108(int rn_1109, String rn_1110) {
		return ((rn_452).rn_3032("Zombie")).rn_3032(rn_6928.rn_6933(rn_1109)).rn_3038(rn_1110);
	}

	public final void rn_1113() {
		String rn_1114 = "";
		if (rn_546 > 0) {
			rn_546 = rn_546 - 1;
		}
		if (rn_445 == 5) {
			XMLR rn_1115 = (rn_452).rn_3032("image").rn_3032("logo");
			float rn_1116 = rn_3289.rn_6899(rn_1115.rn_3038("1time"));
			float rn_1117 = rn_3289.rn_6899(rn_1115.rn_3038("2time"));
			float rn_1118 = rn_3289.rn_6899(rn_1115.rn_3038("3time"));
			float rn_1119 = rn_3289.rn_6899(rn_1115.rn_3038("exchangeTime"));
			if (rn_484 < rn_1116) {
				rn_475 = rn_484 / rn_1116;
			} else if (rn_484 > rn_1119) {
				rn_1066(0);
			} else if (rn_484 >= rn_1118) {
				rn_475 = 0;
			} else if (rn_484 > rn_1117) {
				rn_475 = (rn_1118 - rn_484) / (rn_1118 - rn_1117);
			}
		} else if (rn_445 == 0) {
			Rectx rn_1120 = rn_476.rn_3698("start_botton");
			if (rn_1120 != null) {
				if (rn_1120.rn_3671) {
				} else if (rn_1120.rn_3672) {
					if (rn_978() == 1.0F) {
						rn_1066(1);
					} else {
						rn_1120.rn_3672 = false;
					}
				}
			}
		} else if (rn_445 == 7 || rn_445 == 2) {
			if (rn_513 > 0.0F) {
				rn_513 = rn_513 - 0.01F;
			} else {
				rn_513 = 0.0F;
			}
			rn_484 = rn_484 + 1;
			if (rn_510 == 0 && rn_484 >= 100) {
				rn_510 = 1;
				rn_484 = 0;
			} else if (rn_510 == 1) {
				rn_459 = rn_459 + ope.rn_1824(0, -601, 200, rn_484);
				if (rn_459 <= -600) {
					rn_1136();
					rn_510 = 2;
					rn_484 = 0;
				}
			} else if (rn_510 == 2) {
				if (rn_540 && rn_484 >= 100) {
					rn_541 = rn_541 - 17.5F;
					if (rn_541 <= -513.0F) {
						rn_484 = 0;
						rn_510 = 3;
					}
				} else if (rn_3289.rn_6850(rn_530, "none")) {
					if (rn_540) {
						if (rn_484 >= 100) {
							rn_530 = "skipc";
							rn_510 = 8;
						}
					} else {
						rn_541 = rn_541 + 17.5F;
						if (rn_535 < 0) {
							rn_535 = rn_535 + 3.0F;
						}
						if (rn_535 >= 0) {
							rn_535 = 0;
						}
						if (rn_541 >= 513.0F) {
							rn_541 = 513.0F;
							rn_530 = "choose";
						}
					}
				} else if (rn_3289.rn_6850(rn_530, "choose")) {
				} else if (rn_3289.rn_6850(rn_530, "start")) {
				}
			} else if (rn_510 == 3) {
				rn_459 = rn_459 + ope.rn_1824(0, (600 - 217) + 1, 150, rn_484);
				if (rn_459 >= -217.0F) {
					if (rn_497 == 1) {
						Anim rn_1121 = Anim.rn_3508("SodRoll", Nirvana.this);
						rn_1121.rn_3499 = true;
						DrawStyle rn_1122 = new DrawStyle();
						rn_1122.rn_3773 = rn_1121;
						rn_1122.rn_3774 = 1;
						rn_1122.rn_3775 = 1;
						rn_1122.rn_3776 = 0;
						rn_1122.rn_3777 = 0;
						rn_1122.rn_3780 = -1;
						rn_1122.rn_3781 = 220;
						rn_1122.rn_3782 = 5;
						rn_1122.rn_3783 = null;
						DrawStyles.rn_3752(rn_548, rn_1122);
						ParticleList.rn_2530(rn_481, Particle.rn_2852("SodRoll", 220, 280, -1, Nirvana.this));
						rn_510 = 9;
					} else if (rn_497 == 2 || rn_497 == 3) {
						rn_510 = 10;
					} else if (rn_3289.rn_6850(rn_530, "start")) {
						rn_1137();
						rn_510 = 12;
					} else {
						rn_510 = 8;
					}
					rn_484 = 0;
				}
			} else if (rn_510 == 4) {
				if (rn_484 >= 200) {
					rn_1097();
					rn_510 = 5;
					rn_484 = 0;
				}
			} else if (rn_510 == 5) {
				if (rn_484 >= 3000 || ZombieList.rn_1225(rn_477) * 3 <= rn_512) {
					rn_1097();
					if (rn_493 == rn_494) {
						rn_510 = 6;
					}
					rn_484 = 0;
				}
			} else if (rn_510 == 6) {
				if (ZombieList.rn_1225(rn_477) == 0) {
					rn_1151();
					rn_510 = 11;
				}
			} else if (rn_510 == 7) {
				if (rn_484 >= rn_539) {
					if (rn_497 == 1) {
					} else {
						rn_510 = 4;
					}
				}
			} else if (rn_510 == 8) {
				rn_535 = rn_535 + 3.0F;
				if (rn_535 >= 0) {
					rn_535 = 0;
					rn_484 = 0;
					rn_1137();
					rn_510 = 12;
				}
			} else if (rn_510 == 9) {
				rn_484 = rn_484 + 3;
				if (rn_484 >= 771) {
					DrawStyles.rn_3766(rn_548);
					ParticleList.rn_2544(rn_481);
					rn_510 = 8;
					rn_484 = 0;
				}
			} else if (rn_510 == 10) {
				rn_484 = rn_484 + 2;
				if (rn_484 >= 771) {
					rn_510 = 8;
					rn_484 = 0;
				}
			} else if (rn_510 == 11) {
			} else if (rn_510 == 12) {
				for (int rn_10473 = 0;rn_10473 < MowerList.rn_1225(rn_543.rn_2551);rn_10473 += 1) {
					Mower rn_1123 = MowerList.rn_2582(rn_543.rn_2551, rn_10473);
					rn_1123.rn_2595 = rn_1123.rn_2595 + ope.rn_1824(130, 190, 50, rn_484 + rn_1123.rn_2599 * 10 - 80);
				}
				if (rn_484 >= 150) {
					ZombieList.rn_2388(rn_477);
					for (int rn_10474 = 0;rn_10474 < 5;rn_10474 += 1) {
						ZombieList.rn_2374(rn_477, Zombie.万恶之源(Nirvana.this, rn_7317.rn_7328(7, 7), rn_1160()));
					}
					for (int rn_10475 = 0;rn_10475 < 5;rn_10475 += 1) {
					}
					for (int rn_10476 = 0;rn_10476 < 3;rn_10476 += 1) {
						for (int rn_10477 = 0;rn_10477 < 5;rn_10477 += 1) {
						}
					}
					if (rn_497 == 1) {
						rn_547 = false;
						rn_1140("ADVICE_CLICK_SEED_PACKET", -1);
						rn_530 = "cp";
					}
					rn_510 = 7;
				}
			}
			if (rn_1147()) {
				rn_490 = rn_490 - 1;
				if (rn_490 <= 0) {
					rn_490 = rn_491;
					Coin rn_1124 = Coin.rn_2788(Nirvana.this, static_.rn_2805, rn_7317.rn_7328(400, 800), 50);
					rn_1124.rn_2772 = 0.5F;
					rn_1124.rn_2780 = rn_7317.rn_7328(200, 500);
					CoinList.rn_2468(rn_492, rn_1124);
					if (rn_3289.rn_6850(rn_530, "ep")) {
						rn_490 = 500;
						rn_1140("ADVICE_CLICK_ON_SUN", -1);
					}
				}
			}
		}
		for (int rn_10478 = 0;rn_10478 < rn_483.length;rn_10478 += 1) {
			if (rn_483 [rn_10478] > 0) {
				rn_483 [rn_10478] = rn_483 [rn_10478] - 1;
			}
		}
		long rn_1125 = rn_10083.rn_10089();
		long rn_1126 = 0L;
		for (int rn_10479 = 0;rn_10479 < ZombieList.rn_1225(rn_477);rn_10479 += 1) {
			int rn_1127 = ZombieList.rn_1225(rn_477) - rn_10479 - 1;
			Zombie rn_1128 = ZombieList.rn_2366(rn_477, rn_1127);
			if (rn_1128.rn_2193 > 0) {
				rn_1128.rn_2193 = rn_1128.rn_2193 - 1;
			} else if (rn_1128.rn_2192 > 0) {
				rn_1128.rn_2169.rn_3502 = 0.5F;
				rn_1128.rn_2192 = rn_1128.rn_2192 - 1;
				if (rn_1128.rn_2224) {
					if (ZombieList.rn_2366(rn_477, rn_1127).rn_2294()) {
						ope.rn_1923(ZombieList.rn_2366(rn_477, rn_1127));
						ZombieList.rn_2389(rn_477, rn_1127);
					}
					rn_1128.rn_2224 = false;
				} else {
					rn_1128.rn_2224 = true;
				}
			} else {
				if (ZombieList.rn_2366(rn_477, rn_1127).rn_2294()) {
					ope.rn_1923(ZombieList.rn_2366(rn_477, rn_1127));
					ZombieList.rn_2389(rn_477, rn_1127);
				}
			}
		}
		rn_1126 = rn_10083.rn_10089();
		rn_1114 = rn_1114 + "uZombie:" + rn_6935.rn_6939((rn_1126 - rn_1125)) + "\n";
		rn_1125 = rn_10083.rn_10089();
		for (int rn_10480 = 0;rn_10480 < PlantList.rn_1225(rn_478);rn_10480 += 1) {
			int rn_1129 = PlantList.rn_1225(rn_478) - rn_10480 - 1;
			if (PlantList.rn_2398(rn_478, rn_1129).rn_2702()) {
				ope.rn_1923(PlantList.rn_2398(rn_478, rn_1129));
				PlantList.rn_2421(rn_478, rn_1129);
			}
		}
		rn_1126 = rn_10083.rn_10089();
		rn_1114 = rn_1114 + "uPlant:" + rn_6935.rn_6939((rn_1126 - rn_1125)) + "\n";
		rn_1125 = rn_10083.rn_10089();
		for (int rn_10481 = 0;rn_10481 < ProjList.rn_1225(rn_479);rn_10481 += 1) {
			int rn_1130 = ProjList.rn_1225(rn_479) - rn_10481 - 1;
			if (ProjList.rn_2429(rn_479, rn_1130).rn_2765()) {
				ope.rn_1923(ProjList.rn_2429(rn_479, rn_1130));
				ProjList.rn_2452(rn_479, rn_1130);
			}
		}
		rn_1126 = rn_10083.rn_10089();
		rn_1114 = rn_1114 + "uProj:" + rn_6935.rn_6939((rn_1126 - rn_1125)) + "\n";
		rn_1125 = rn_10083.rn_10089();
		for (int rn_10482 = 0;rn_10482 < CoinList.rn_1225(rn_492);rn_10482 += 1) {
			int rn_1131 = CoinList.rn_1225(rn_492) - rn_10482 - 1;
			if (CoinList.rn_2460(rn_492, rn_1131).rn_2801() == true) {
				ope.rn_1923(CoinList.rn_2460(rn_492, rn_1131));
				CoinList.rn_2483(rn_492, rn_1131);
			}
		}
		rn_1126 = rn_10083.rn_10089();
		rn_1114 = rn_1114 + "uCoin:" + rn_6935.rn_6939((rn_1126 - rn_1125)) + "\n";
		rn_1125 = rn_10083.rn_10089();
		for (int rn_10483 = 0;rn_10483 < TracleList.rn_1225(rn_480);rn_10483 += 1) {
			int rn_1132 = TracleList.rn_1225(rn_480) - rn_10483 - 1;
			if (TracleList.rn_2491(rn_480, rn_1132).rn_2838() == true) {
				ope.rn_1923(TracleList.rn_2491(rn_480, rn_1132));
				TracleList.rn_2514(rn_480, rn_1132);
			}
		}
		rn_1126 = rn_10083.rn_10089();
		rn_1125 = rn_10083.rn_10089();
		for (int rn_10484 = 0;rn_10484 < ParticleList.rn_1225(rn_481);rn_10484 += 1) {
			int rn_1133 = ParticleList.rn_1225(rn_481) - rn_10484 - 1;
			if (ParticleList.rn_2522(rn_481, rn_1133).rn_2891() == true) {
				ope.rn_1923(ParticleList.rn_2522(rn_481, rn_1133));
				ParticleList.rn_2545(rn_481, rn_1133);
			}
		}
		rn_1126 = rn_10083.rn_10089();
		rn_1125 = rn_10083.rn_10089();
		rn_543.rn_2562();
		if (rn_549 != -1) {
			rn_550 = rn_550 - 1;
			if (rn_550 <= 0) {
				rn_549 = -1;
			}
		}
		rn_555 = rn_1114;
	}

	public final void rn_1134(Coin rn_1135) {
		rn_1135 = rn_1135;
		if (rn_3289.rn_6850(rn_530, "ep")) {
			rn_1140("ADVICE_CLICKED_ON_SUN", -1);
			rn_530 = "2p";
		} else if (rn_3289.rn_6850(rn_530, "2p")) {
			rn_1140("ADVICE_ENOUGH_SUN", -1);
			rn_530 = "bp";
		}
	}

	public final void rn_1136() {
		if (rn_497 <= 6) {
			rn_482 = (int[]) (new int[rn_497]);
			for (int rn_10485 = 0;rn_10485 < rn_482.length;rn_10485 += 1) {
				rn_482 [rn_10485] = rn_10485;
			}
			rn_540 = true;
		} else {
			rn_482 = (int[]) (new int[rn_529.rn_2978().rn_2986]);
			for (int rn_10486 = 0;rn_10486 < rn_482.length;rn_10486 += 1) {
				rn_482 [rn_10486] = -1;
			}
		}
	}

	public final void rn_1137() {
		int[] rn_1138 = rn_1139();
		rn_543.rn_2556(rn_1138.length, rn_1138, 130, Nirvana.this);
	}

	public final int[] rn_1139() {
		if (rn_500 == 0 || rn_500 == 1) {
			if (rn_497 == 1) {
				return new int[]{-1, -1, 0, -1, -1};
			} else if (rn_497 == 2 || rn_497 == 3) {
				return new int[]{-1, 0, 0, 0, -1};
			} else {
				return new int[]{0, 0, 0, 0, 0};
			}
		} else if (rn_500 == 2 || rn_500 == 3) {
			return new int[]{0, 0, 1, 1, 0, 0};
		} else if (rn_500 == 4 || rn_500 == 5) {
			return new int[]{2, 2, 2, 2, 2};
		}
		return new int[]{0, 0, 0, 0, 0};
	}

	public final void rn_1140(String rn_1141, int rn_1142) {
		rn_545 = rn_4434.rn_4447(rn_462, rn_1141);
		rn_546 = rn_1142;
	}

	public final float rn_1143(int rn_1144, float rn_1145) {
		int rn_1146 = rn_1149();
		if (rn_500 == 2 || rn_500 == 3) {
			return 80 + rn_1146 + rn_1144 * rn_1146;
		} else if (rn_500 == 4 || rn_500 == 5) {
			if (rn_1145 > 670) {
				return 80 + rn_1146 + rn_1144 * rn_1146;
			} else {
				return 80 + rn_1146 + (670 - rn_1145) / 4.0F + rn_1144 * rn_1146;
			}
		} else {
			return 80 + rn_1146 + rn_1144 * rn_1146;
		}
	}

	public final boolean rn_1147() {
		if (rn_547 && (rn_500 == 0 || rn_500 == 2 || rn_500 == 4) && (4 <= rn_510 && rn_510 <= 7)) {
			return true;
		}
		return false;
	}

	public final int rn_1148() {
		if (rn_500 == 2 || rn_500 == 3) {
			return 6;
		}
		return 5;
	}

	public final int rn_1149() {
		if (2 <= rn_500 && rn_500 <= 5) {
			return 85;
		} else {
			return 100;
		}
	}

	public final int rn_1150() {
		return 80;
	}

	public final void rn_1151() {
		UserdataList.rn_2990((rn_529.rn_2977), rn_529.rn_2976).rn_2981 = rn_497 + 1;
		rn_823();
		CoinList.rn_2468(rn_492, Coin.rn_2788(Nirvana.this, static_.rn_2808, 900, 340));
	}

	public final void rn_1152(Coin rn_1153) {
		rn_1153 = rn_1153;
	}

	public final int[] rn_1154() {
		if (rn_497 == 1) {
			return new int[]{2};
		} else if (rn_497 == 2 || rn_497 == 3) {
			return new int[]{1, 2, 3};
		} else {
			int rn_1155 = rn_1148();
			int[] rn_1156 = (int[]) (new int[rn_1155]);
			for (int rn_10487 = 0;rn_10487 < rn_1156.length;rn_10487 += 1) {
				rn_1156 [rn_10487] = rn_10487;
			}
			return rn_1156;
		}
	}

	public final int[] rn_1157() {
		int[] rn_1158 = rn_1154();
		ints rn_1159 = new ints();
		for (int rn_10488 = 0;rn_10488 < rn_1158.length;rn_10488 += 1) {
			if (rn_542 [rn_1158 [rn_10488]] == 0) {
				rn_1159.rn_1423(rn_1158 [rn_10488]);
			}
		}
		return rn_1159.rn_1442();
	}

	public final int rn_1160() {
		int[] rn_1161 = rn_1157();
		return rn_1161 [rn_7317.rn_7328(0, rn_1161.length - 1)];
	}

	public final boolean rn_1164() {
		if (rn_510 == 4 || rn_510 == 5 || rn_510 == 6 || rn_510 == 7) {
			return true;
		}
		return false;
	}
}