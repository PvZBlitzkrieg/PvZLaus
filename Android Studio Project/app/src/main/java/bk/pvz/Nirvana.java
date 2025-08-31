package bk.pvz;
import android.graphics.*;
import android.graphics.Bitmap.Config;
import rn_4413.rn_4414.rn_4415.rn_9553;
import bk.pvz.Zombie;
import bk.pvz.Plant;
import rn_6672.rn_6673.rn_6674.rn_6677;
import rn_4413.rn_4414.rn_4415.rn_8645;
import rn_6672.rn_6673.rn_6674.rn_4133;
import bk.pvz.Const;
import bk.pvz.POS;
import bk.pvz.RenderinfoList;
import bk.pvz.Rectx;
import bk.pvz.Texture_;
import rn_4126.rn_4127.rn_4128.rn_4266;
import rn_4413.rn_4414.rn_4415.rn_8652;
import rn_4413.rn_4414.rn_4415.rn_9915;
import bk.pvz.ProjList;
import rn_4413.rn_4414.rn_4415.rn_8937;
import bk.pvz.Mower;
import bk.pvz.Matrix3_;
import bk.pvz.Reanimed;
import bk.pvz.Stringk;
import bk.pvz.Images;
import rn_4413.rn_4414.rn_4415.rn_4577;
import bk.pvz.Paint_;
import bk.pvz.Userdata;
import bk.pvz.TracleList;
import bk.pvz.Animed;
import bk.pvz.reanims;
import rn_4413.rn_4414.rn_4415.rn_7149;
import bk.pvz.ZombieList;
import bk.pvz.ints;
import bk.pvz.CoinList;
import bk.pvz.Recta;
import bk.pvz.Coin;
import bk.pvz.XMLR;
import bk.pvz.FileHandle_;
import bk.pvz.Pixmap_;
import bk.pvz.ShaderProgram_;
import bk.pvz.GrainSet;
import rn_4126.rn_4127.rn_4128.rn_4132;
import bk.pvz.ParticleList;
import bk.pvz.Proj;
import bk.pvz.String_Nlimage;
import bk.pvz.Anim;
import bk.pvz.RectaList;
import bk.pvz.Renderinfo;
import bk.pvz.XMLRED;
import bk.pvz.PlantList;
import bk.pvz.String_Nlimagesm;
import bk.pvz.POS_int;
import rn_6672.rn_6673.rn_6674.rn_6767;
import bk.pvz.STSL;
import bk.pvz.BitmapFontData_;
import bk.pvz.Nlimage;
import bk.pvz.MowerList;
import bk.pvz.TextureRegion_;
import rn_4126.rn_4127.rn_4128.rn_4198;
import rn_4126.rn_4127.rn_4128.rn_8150;
import bk.pvz.BitmapFont_;
import bk.pvz.Boolarray;
import bk.pvz.ope;
import bk.pvz.CartSet;
import rn_4413.rn_4414.rn_4415.rn_7227;
import bk.pvz.DrawStyles;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4126.rn_4127.rn_4128.rn_8084;
import bk.pvz.DrawStyle;
import bk.pvz.UserdataList;
import bk.pvz.op;
import bk.pvz.String2RectList;
import bk.pvz.Detrect;
import rn_6672.rn_6673.rn_6674.rn_6777;
import bk.pvz.Point;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Userdatas;
import bk.pvz.Typeface_;
import rn_4413.rn_4414.rn_4415.rn_9755;
import bk.pvz.Tracle;
import rn_6672.rn_6673.rn_6674.rn_6793;
import bk.pvz.Color_;
import bk.pvz.ProxyAnim;
import bk.pvz.Reanim;
import bk.pvz.Grain;
import bk.pvz.static_;
import bk.pvz.Matrix4_;
import bk.pvz.Matrix_;
import bk.pvz.Particle;
import bk.pvz.SpriteBatch;
import bk.pvz.FrameBuffer_;
import bk.pvz.Colorset;

public class Nirvana {
	@Override
	public String toString(){
	    return ToJSON();
	}
	public int scrtype = 5;
	public String_Nlimage resall = new String_Nlimage();
	public Stringk loadproc = Stringk.rn_2864("");
	public reanims REANIM = new reanims();
	public boolean loadfinish = false;
	public Images image = new Images();
	public STSL imagename = new STSL();
	public XMLR config = new XMLR();
	public com.badlogic.gdx.graphics.g2d.SpriteBatch screen = null;
	public com.badlogic.gdx.graphics.glutils.FrameBuffer fbo = null;
	public int width = 0;
	public int height = 0;
	public android.app.Activity mainThread = null;
	public float gcv = 0.0F;
	public float x = 0.0F;
	public int y = 0;
	public float scale = 1.0F;
	public java.util.HashMap<String, String> gametext = new java.util.HashMap<String, String>();
	public int textsize = 15;
	public android.graphics.Typeface textfont = null;
	public float dx = -1.0F;
	public float dy = -1.0F;
	public float tx = -1.0F;
	public float ty = -1.0F;
	public long tt = 0;
	public android.view.MotionEvent touch = null;
	public float speed = -1.0F;
	public Anim animh = new Anim();
	public float realx = -1.0F;
	public int drawuprate = 0;
	public float transp = 1.0F;
	public String2RectList trirect = new String2RectList();
	public java.util.ArrayList<Zombie> zombieList = new java.util.ArrayList<Zombie>();
	public java.util.ArrayList<Plant> plantList = new java.util.ArrayList<Plant>();
	public java.util.ArrayList<Proj> projList = new java.util.ArrayList<Proj>();
	public java.util.ArrayList<Tracle> tracleList = new java.util.ArrayList<Tracle>();
	public java.util.ArrayList<Particle> particleList = new java.util.ArrayList<Particle>();
	public int[] cards = {0, 1, 2, 3, 4, 5};
	public int[] card_cool = {0, 0, 0, 0, 0, 0};
	public int animproc = 0;
	public int mmx = 50;
	public int mmy = 70;
	public int mux = 2;
	public int muy = 8;
	public android.graphics.Bitmap plant_cards = null;
	public int sunapp = 50;
	public int sunappmax = 1100;
	public java.util.ArrayList<Coin> coinlist = new java.util.ArrayList<Coin>();
	public int wave = 0;
	public int wavemax = 0;
	public int drawtime = 0;
	public int frametime = 0;
	public int level = 1;
	public int leveltype = 0;
	public int scene = 0;
	public Anim predanim = null;
	public int predx = 0;
	public int predy = 0;
	public float predxp = 0.0F;
	public float predyp = 0.0F;
	public int predtype = 0;
	public boolean pred = false;
	public int predidx = 0;
	public int suncount = 0;
	public int proc = 0;
	public XMLR levels = new XMLR();
	public int zombiecount = 0;
	public float procf = 0.0F;
	public String loadinfo = "";
	public String frameinfo = "";
	public DrawStyle ds = new DrawStyle();
	public DrawStyle dst = new DrawStyle();
	public long ultna = 0;
	public long ultnb = 0;
	public int dscale = 1;
	public com.badlogic.gdx.graphics.glutils.ShaderProgram rgbShader = null;
	public com.badlogic.gdx.graphics.g2d.BitmapFont font1 = null;
	public boolean nntw = false;
	public boolean free = false;
	public java.util.ArrayList<Anim> animess = new java.util.ArrayList<Anim>();
	public Userdatas USER = new Userdatas();
	public String state = "none";
	public Recta judarea = new Recta();
	public int bool = 0;
	public boolean inited = false;
	public com.badlogic.gdx.graphics.Texture rectw = null;
	public float sdoffy = 0.0F;
	public com.badlogic.gdx.graphics.Texture t1 = null;
	public com.badlogic.gdx.graphics.Texture t2 = null;
	public com.badlogic.gdx.graphics.Texture t3 = null;
	public int inapptime = 0;
	public boolean ccend = false;
	public float csint = 0.0F;
	public int[] proline = (int[]) (new int[6]);
	public CartSet mowerList = new CartSet();
	public String captions = "";
	public int captionscd = 0;
	public boolean canshedsun = true;
	public java.util.ArrayList<DrawStyle> foreds = new java.util.ArrayList<DrawStyle>();
	public int sobj = -1;
	public int cardev = 0;
	public int cardevtime = 25;
	public boolean evdir = false;
	public int recallid = -1;
	public String uinfo = "";
	public int savecount = 0;

	public final void initi(int rn_446, int rn_447) {
		int widthw = rn_446;
		int heightw = rn_447;
		readSceneArchive();
		plant_cards = rn_8937.rn_8940("/storage/emulated/0/.pvz/plant_cards.png");
		textfont = Typeface_.rn_1639("/storage/emulated/0/.pvz/main/fzse_gbk.ttf");
		width = heightw * 4 / 3;
		height = heightw;
		scale = height / 600.0F / dscale;
		realx = (widthw - width) / 2 / dscale;
		ope.rn_1798("width=" + width);
		ope.rn_1798("height=" + height);
		ope.rn_1798("scale=" + scale);
		loadproc = new Stringk("加载场景");
		XMLR.rn_2835(config, Stringk.rn_2864(rn_9755.rn_9795("/storage/emulated/0/.pvz/pvz/properties/config.xml", "UTF-8")), 0);
		XMLR.rn_2835(levels, Stringk.rn_2864(rn_9755.rn_9795("/storage/emulated/0/.pvz/pvz/properties/levels.xml", "UTF-8")), 0);
		image.rn_3463(loadproc, imagename);
		Nlimage rn_448 = new Nlimage();
		rn_448.rn_3451 = "/storage/emulated/0/.pvz/pvz/reanim/SodRollCap.png";
		String_Nlimagesm.rn_3123(image.rn_3462, "SodRollCap", rn_448);
		initLawnString();
		inited = true;
	}
	public com.badlogic.gdx.graphics.Texture[] card_tx = (com.badlogic.gdx.graphics.Texture[]) (new com.badlogic.gdx.graphics.Texture[256]);

	public final com.badlogic.gdx.graphics.Texture getcardtx(int rn_449) {
		if (card_tx [rn_449] == null) {
			com.badlogic.gdx.graphics.Texture rn_450 = Texture_.rn_3891(Pixmap_.rn_3919(getcardcs(rn_449)));
			card_tx [rn_449] = rn_450;
			return rn_450;
		} else {
			return card_tx [rn_449];
		}
	}
	public android.graphics.Bitmap[] card_cs = (android.graphics.Bitmap[]) (new android.graphics.Bitmap[256]);

	public final android.graphics.Bitmap getcardcs(int rn_451) {
		if (card_cs [rn_451] == null) {
			int rn_452 = rn_451 % 8;
			int rn_453 = (rn_451 - rn_452) / 8;
			int rn_454 = rn_452 * (mmx + mux);
			int rn_455 = rn_453 * (mmy + muy);
			android.graphics.Bitmap rn_456 = ope.rn_1752(plant_cards, rn_454, rn_455, 50, 70);
			card_cs [rn_451] = rn_456;
			return rn_456;
		} else {
			return card_cs [rn_451];
		}
	}

	public final Nlimage getres(String rn_457) {
		return String_Nlimagesm.rn_3116((image.rn_3462), imagename.rn_3483(rn_457));
	}

	public final com.badlogic.gdx.graphics.g2d.TextureRegion 法外狂徒(int rn_458, int rn_459) {
		if (font1 == null) {
			String fontName = "/storage/emulated/0/.pvz/fonts/ziti";
			int pagecount = 28;
			com.badlogic.gdx.graphics.g2d.TextureRegion[] trs = (com.badlogic.gdx.graphics.g2d.TextureRegion[]) (new com.badlogic.gdx.graphics.g2d.TextureRegion[pagecount]);
			for (int rn_10245 = 0;rn_10245 < trs.length;rn_10245 += 1) {
				com.badlogic.gdx.graphics.Texture rn_460 = Texture_.rn_3893(FileHandle_.rn_4004(fontName + rn_6760.rn_6765((rn_10245 + 1)) + ".png"));
				trs [rn_10245] = TextureRegion_.rn_3821(rn_460);
			}
			font1 = BitmapFont_.rn_3986(FileHandle_.rn_4004(fontName + ".fnt"), ope.rn_1790(trs));
		}
		if (rectw == null) {
			com.badlogic.gdx.graphics.Pixmap rn_461 = Pixmap_.rn_3914(1, 1);
			rn_461.setColor(0x000000ff);
			rn_461.fill();
			rectw = Texture_.rn_3891(rn_461);
		}
		frameinfo = "";
		ultna = nullait / 1000000;
		ultnb = nullnbt;
		nullait = 0L;
		nullnbt = 0L;
		if (screen != null) {
			screen.enableBlending();
			screen.setBlendFunction(0x302, 0x303);
			screen.setShader(rgbShader);
			FrameBuffer_.rn_3930(fbo);
			SpriteBatch.rn_3832(screen);
			SpriteBatch.rn_3886(screen, Matrix4_.rn_3954(Matrix3_.rn_3952(ope.rn_1776(Matrix_.rn_3398(Matrix_.rn_3395())))));
			ShaderProgram_.rn_3938(rgbShader, "u_rgbFactors", 1, 1, 1);
			ShaderProgram_.rn_3943(rgbShader, "u_clipRegion", 0, 0, width, height);
			float rn_462 = rn_458 * 1.0F / rn_459;
			if (rn_9915.rn_9921() - tt > 20 && touch != null) {
				Thread thread = new Thread(new Runnable() { public void run() {;
				handleTouch(touch, true);
				touch = null;
				}}); thread.start();
			}
			for (int rn_10246 = 0;rn_10246 < Animed.rn_1021(animess);rn_10246 += 1) {
				DrawStyle rn_463 = new DrawStyle();
				rn_463.rn_3605 = Animed.rn_3169(animess, rn_10246);
				rn_463.rn_3606 = 1.0F;
				rn_463.rn_3607 = 1.0F;
				rn_463.rn_3608 = 0.0F;
				rn_463.rn_3609 = 0.0F;
				rn_463.rn_3612 = -1;
				rn_463.rn_3613 = 0;
				rn_463.rn_3614 = 0;
				draw(screen, rn_463, rn_462);
			}
			if (scrtype == 5) {
				com.badlogic.gdx.Gdx.gl.glClearColor(0,0,0,1);;
				com.badlogic.gdx.Gdx.gl.glClear(com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT | com.badlogic.gdx.graphics.GL20.GL_DEPTH_BUFFER_BIT);;
				XMLR rn_464 = (config).rn_2811("image").rn_2811("logo");
				String rn_465 = rn_464.rn_2817("ImageRelativePath");
				float rn_466 = rn_3081.rn_6731(rn_464.rn_2817("scale"));
				android.graphics.Matrix rn_467 = Matrix_.rn_3395();
				com.badlogic.gdx.graphics.Texture rn_468 = String_Nlimagesm.rn_3128(image.rn_3462, rn_465).rn_3453().rn_1941(1, 1, 0);
				float rn_469 = width * rn_466 / Texture_.rn_3897(rn_468);
				Matrix_.rn_3411(rn_467, rn_469, rn_469);
				Matrix_.rn_3422(rn_467, (width - Texture_.rn_3897(rn_468) * rn_469) / 2, (height - Texture_.rn_3898(rn_468) * rn_469) / 2);
				SpriteBatch.rn_3853(screen, rn_468, rn_467, transp, height, null);
				animproc = animproc + rn_458;
				ope.rn_1796(rn_467);
				ope.rn_1796(rn_468);
			} else if (scrtype == 0) {
				XMLR rn_470 = (config).rn_2811("image").rn_2811("title");
				String rn_471 = rn_470.rn_2817("ImageRelativePath");
				com.badlogic.gdx.graphics.Texture rn_472 = String_Nlimagesm.rn_3128(image.rn_3462, rn_470.rn_2817("dirt")).rn_3453().rn_1941(1, 1, 0);
				float rn_473 = rn_3081.rn_6731(rn_470.rn_2817("dirt_bottom")) * scale;
				com.badlogic.gdx.graphics.Pixmap rn_474 = String_Nlimagesm.rn_3128(image.rn_3462, rn_470.rn_2817("grass")).rn_3453().rn_1927(1, 1, 0);
				float rn_475 = rn_3081.rn_6731(rn_470.rn_2817("grass_bottom")) * scale;
				com.badlogic.gdx.graphics.Texture rn_476 = String_Nlimagesm.rn_3128(image.rn_3462, rn_471).rn_3453().rn_1941(1, 1, 0);
				float rn_477 = rn_3081.rn_6731(rn_470.rn_2817("logo_top")) * scale;
				android.graphics.Matrix rn_478 = Matrix_.rn_3411(Matrix_.rn_3395(), scale, scale);
				SpriteBatch.rn_3853(screen, rn_476, rn_478, 1.0F, height, null);
				android.graphics.Matrix rn_479 = Matrix_.rn_3396(rn_478);
				Matrix_.rn_3422(rn_479, center(Texture_.rn_3897(rn_472) * scale) + 7 * scale, height - rn_473);
				SpriteBatch.rn_3853(screen, rn_472, rn_479, 1.0F, height, null);
				android.graphics.Matrix rn_480 = Matrix_.rn_3396(rn_478);
				float rn_481 = center(Pixmap_.rn_3925(rn_474) * scale);
				float rn_482 = height - rn_475;
				Matrix_.rn_3422(rn_480, rn_481, rn_482);
				float rn_483 = getLoadingProc();
				int rn_484 = (int) (rn_483 * Pixmap_.rn_3925(rn_474));
				if (rn_484 > 0 && rn_484 <= Pixmap_.rn_3925(rn_474)) {
					rn_474 = ope.rn_1758(rn_474, 0, 0, rn_484, Pixmap_.rn_3926(rn_474));
					SpriteBatch.rn_3837(screen, rn_474, rn_480, 1.0F, height);
				}
				com.badlogic.gdx.graphics.Texture rn_485 = String_Nlimagesm.rn_3128(image.rn_3462, "SodRollCap").rn_3453().rn_1941(1, 1, 0);
				android.graphics.Matrix rn_486 = Matrix_.rn_3396(rn_478);
				float rn_487 = 1.0F - rn_483 * 0.65F;
				float rn_488 = rn_484 * scale + rn_481 - Texture_.rn_3897(rn_485) * scale / 2;
				float rn_489 = height - rn_475 - Texture_.rn_3898(rn_485) * scale + Pixmap_.rn_3926(rn_474) * scale;
				Matrix_.rn_3400(rn_486, rn_483 * 720.0F, Texture_.rn_3897(rn_485) * scale / 2, Texture_.rn_3898(rn_485) * scale / 2);
				Matrix_.rn_3406(rn_486, rn_487, rn_487, Texture_.rn_3897(rn_485) * scale / 2, Texture_.rn_3898(rn_485) * scale);
				Matrix_.rn_3422(rn_486, rn_488, rn_489);
				if (rn_483 != 1.0F) {
					SpriteBatch.rn_3853(screen, rn_485, rn_486, 1.0F, height, null);
				}
				String rn_490 = "";
				int rn_491 = -16777216;
				Rectx rn_492 = trirect.rn_3535("start_botton", rn_481, height - rn_473, Texture_.rn_3897(rn_472) * scale, Texture_.rn_3898(rn_472) * scale, scrtype);
				drawRect(screen, rn_492, -16776961);
				com.badlogic.gdx.graphics.Pixmap rn_493 = String_Nlimagesm.rn_3128(image.rn_3462, "PvZ_Logo").rn_3453().rn_1927(1, 1, 0);
				android.graphics.Matrix rn_494 = Matrix_.rn_3396(rn_478);
				Matrix_.rn_3422(rn_494, center(Pixmap_.rn_3925(rn_493) * scale), rn_477 * scale);
				SpriteBatch.rn_3837(screen, rn_493, rn_494, 1.0F, height);
				if (rn_492.rn_3490) {
					rn_491 = -38400;
				}
				android.graphics.Paint rn_495 = Paint_.rn_1533(Paint_.rn_1530(Paint_.rn_1528(Paint_.rn_1526(), textfont), (int) (textsize * scale)), rn_491);
				if (rn_483 < 1.0F) {
					rn_490 = rn_4266.rn_4279(gametext, "LOADING");
				} else {
					rn_490 = rn_4266.rn_4279(gametext, "CLICK_TO_START");
				}
				float rn_496 = center(Paint_.rn_1536(rn_495, rn_490));
				float rn_497 = rn_473 - Texture_.rn_3898(rn_472) * scale / 2 + textsize * scale * 0.5F;
				BitmapFontData_.rn_4006(BitmapFont_.rn_3989(font1), textsize * scale / 30);
				BitmapFont_.rn_3990(font1, Color_.rn_3900(ope.rn_1792(rn_491)));
				BitmapFont_.rn_3999(font1, screen, rn_490, rn_496, rn_497);
			} else if (loadfinish) {
				if (scrtype == 2) {
					com.badlogic.gdx.graphics.Texture rn_498 = null;
					if (scene == 0) {
						if (leveltype == 0 && level <= 3) {
							rn_498 = String_Nlimagesm.rn_3128(image.rn_3462, "background1unsodded").rn_3453().rn_1941(1, 1, 0);
						} else {
							rn_498 = String_Nlimagesm.rn_3128(image.rn_3462, "background1").rn_3453().rn_1941(1, 1, 0);
						}
					} else if (scene == 1) {
						rn_498 = String_Nlimagesm.rn_3128(image.rn_3462, "background2").rn_3453().rn_1941(1, 1, 0);
					} else if (scene == 2) {
						rn_498 = String_Nlimagesm.rn_3128(image.rn_3462, "background3").rn_3453().rn_1941(1, 1, 0);
					} else if (scene == 3) {
						rn_498 = String_Nlimagesm.rn_3128(image.rn_3462, "background4").rn_3453().rn_1941(1, 1, 0);
					} else if (scene == 4) {
						rn_498 = String_Nlimagesm.rn_3128(image.rn_3462, "background5").rn_3453().rn_1941(1, 1, 0);
					} else if (scene == 5) {
						rn_498 = String_Nlimagesm.rn_3128(image.rn_3462, "background6boss").rn_3453().rn_1941(1, 1, 0);
					}
					android.graphics.Matrix rn_499 = Matrix_.rn_3411(Matrix_.rn_3395(), scale, scale);
					android.graphics.Matrix rn_500 = Matrix_.rn_3396(rn_499);
					Matrix_.rn_3422(rn_500, x * scale, y * scale);
					com.badlogic.gdx.graphics.Texture rn_501 = String_Nlimagesm.rn_3128(image.rn_3462, "SeedBank").rn_3453().rn_1941(1, 1, 0);
					SpriteBatch.rn_3853(screen, rn_498, rn_500, 1.0F, height, null);
					android.graphics.Matrix rn_502 = Matrix_.rn_3396(rn_499);
					Matrix_.rn_3422(rn_502, 10 * scale, y * scale);
					SpriteBatch.rn_3853(screen, rn_501, rn_502, 1.0F, height - (int) (sdoffy * scale), null);
					if (gamestart()) {
						drawcardslot();
					}
					BitmapFontData_.rn_4006(BitmapFont_.rn_3989(font1), textsize * scale / 25);
					BitmapFont_.rn_3990(font1, Color_.rn_3900(ope.rn_1792(-16777216)));
					write(screen, rn_6760.rn_6765(suncount), 50, (int) (60 + sdoffy), -16777216, 16, -0.5F, 0.0F);
					if (level == 1) {
						int rn_503 = animproc;
						if (proc == 9) {
							com.badlogic.gdx.graphics.Pixmap rn_504 = String_Nlimagesm.rn_3128(image.rn_3462, "sod1row").rn_3453().rn_1927(1, 1, 0);
							String_Nlimagesm.rn_3128(image.rn_3462, "sod1row").rn_3453().rn_1896 = null;
							SpriteBatch.rn_3860(screen, Texture_.rn_3891(ope.rn_1758(rn_504, 0, 0, rn_503, Pixmap_.rn_3926(rn_504))), (x + 240) * scale, height - (270 + Pixmap_.rn_3926(rn_504)) * scale, (int) (rn_503 * scale), Pixmap_.rn_3926(rn_504) * scale);
						} else if (gamestart() || proc == 7 || proc == 8 || proc == 11 || proc == 12) {
							float rn_505 = 1.0F;
							if (rn_3081.rn_6682(state, "op") || rn_3081.rn_6682(state, "sp")) {
								rn_505 = gettransp(animproc, 80, 1) * 1.0F / 255.0F;
							}
							com.badlogic.gdx.graphics.Texture rn_506 = String_Nlimagesm.rn_3128(image.rn_3462, "sod1row").rn_3453().rn_1941(1, 1, 0);
							android.graphics.Matrix rn_507 = Matrix_.rn_3422(Matrix_.rn_3396(rn_499), (x + 240) * scale, (270) * scale);
							SpriteBatch.rn_3866(screen, rn_506, rn_507, new float[]{rn_505, rn_505, rn_505, 1.0F}, height, Nirvana.this, false);
						}
					}
					try {;
					for (int rn_10247 = 0;rn_10247 < DrawStyles.rn_1021(foreds);rn_10247 += 1) {
						draw(screen, DrawStyles.rn_3576(foreds, rn_10247), rn_462);
					}
					for (int rn_10248 = -2;rn_10248 < 7;rn_10248 += 1) {
						for (int rn_10249 = 0;rn_10249 < PlantList.rn_1021(plantList);rn_10249 += 1) {
							if (PlantList.rn_2181(plantList, rn_10249).rn_2421 == rn_10248) {
								drawPlant(PlantList.rn_2181(plantList, rn_10249), rn_462, rn_499);
							}
						}
						for (int rn_10250 = 0;rn_10250 < ZombieList.rn_1021(zombieList);rn_10250 += 1) {
							if (ZombieList.rn_2149(zombieList, rn_10250).row == rn_10248) {
								drawZombie(ZombieList.rn_2149(zombieList, rn_10250), rn_462, rn_499);
							}
						}
						for (int rn_10251 = 0;rn_10251 < ProjList.rn_1021(projList);rn_10251 += 1) {
							if (ProjList.rn_2212(projList, rn_10251).rn_2565 == rn_10248) {
								Proj rn_508 = ProjList.rn_2212(projList, rn_10251);
								com.badlogic.gdx.graphics.Texture rn_509 = null;
								android.graphics.Matrix rn_510 = Matrix_.rn_3422(Matrix_.rn_3396(rn_499), (x + rn_508.rn_2556) * scale, (y + rn_508.rn_2557) * scale);
								if (rn_3081.rn_6682(rn_508.rn_2564, "image")) {
									rn_509 = String_Nlimagesm.rn_3128(image.rn_3462, rn_508.rn_2562).rn_3453().rn_1941(1, 1, 0);
								}
								Matrix_.rn_3431(rn_510, rn_508.scale, rn_508.scale, Texture_.rn_3897(rn_509) / 2, Texture_.rn_3898(rn_509) / 2);
								SpriteBatch.rn_3853(screen, rn_509, rn_510, 1.0F, height, null);
							}
						}
						for (int rn_10252 = 0;rn_10252 < ParticleList.rn_1021(particleList);rn_10252 += 1) {
							if (rn_10252 >= ParticleList.rn_1021(particleList)) {
								break;
							}
							Particle rn_511 = ParticleList.rn_2305(particleList, rn_10252);
							if (rn_511.rn_2662 == rn_10248) {
								for (int rn_10253 = 0;rn_10253 < GrainSet.rn_1021(rn_511.rn_2655);rn_10253 += 1) {
									try {;
									if (rn_10253 >= GrainSet.rn_1021(rn_511.rn_2655)) {
										break;
									}
									Grain rn_512 = GrainSet.rn_2721((rn_511.rn_2655), rn_10253);
									if (rn_512.activecd <= 0) {
										com.badlogic.gdx.graphics.Texture rn_513 = null;
										if (rn_511.rn_2664 == false) {
											if (rn_3081.rn_6693(rn_512.pic, "IMAGE_REANIM_", 0)) {
												rn_513 = resall.rn_3133(rn_512.pic).rn_3453().rn_1941(rn_512.cutn, rn_512.row, rn_512.cutp);
											} else {
												rn_513 = image.rn_3462.rn_3133(rn_512.pic).rn_3453().rn_1941(rn_512.cutn, rn_512.row, rn_512.cutp);
											}
										} else {
											if (rn_3081.rn_6693(rn_512.pic, "IMAGE_REANIM_", 0)) {
												rn_513 = Texture_.rn_3891(resall.rn_3133(rn_512.pic).rn_3453().rn_1927(rn_512.cutn, rn_512.row, rn_512.cutp));
											} else {
												rn_513 = Texture_.rn_3891(image.rn_3462.rn_3133(rn_512.pic).rn_3453().rn_1927(rn_512.cutn, rn_512.row, rn_512.cutp));
											}
										}
										android.graphics.Matrix rn_514 = Matrix_.rn_3422(Matrix_.rn_3406(Matrix_.rn_3400(Matrix_.rn_3396(rn_499), rn_512.rotate, Texture_.rn_3898(rn_513) / 2, Texture_.rn_3898(rn_513) / 2), rn_512.getValue(rn_512.scale), rn_512.getValue(rn_512.scale), Texture_.rn_3897(rn_513) / 2, Texture_.rn_3898(rn_513) / 2), (ope.rn_1684(0, rn_512.shake * 2) - rn_512.shake + x + rn_511.rn_2656 + GrainSet.rn_2721((rn_511.rn_2655), rn_10253).x) * scale, (ope.rn_1684(0, rn_512.shake * 2) - rn_512.shake + y + rn_511.rn_2657 + GrainSet.rn_2721((rn_511.rn_2655), rn_10253).y) * scale);
										float[] rn_515 = {rn_512.getValue(rn_512.red), rn_512.getValue(rn_512.green), rn_512.getValue(rn_512.blue), rn_512.getValue(rn_512.alpha)};
										SpriteBatch.rn_3866(screen, rn_513, rn_514, rn_515, height, Nirvana.this, false);
									}
									} catch (Exception e) {;
									String rn_516 = "#OutofIndex";
									if (ParticleList.rn_1021(particleList) > rn_10252 && GrainSet.rn_1021(rn_511.rn_2655) > rn_10253) {
										rn_516 = ParticleList.rn_2305(particleList, rn_10252).rn_2660 + " ---" + GrainSet.rn_2721((rn_511.rn_2655), rn_10253).pic;
									}
									ope.rn_1798("particledraw error:index:" + rn_10252 + ",length:" + ParticleList.rn_1021(particleList) + ",NamE:" + rn_516);
									};
								}
							}
						}
					}
					frameinfo = frameinfo + "\n" + "zombie:" + "0" + "ms " + ZombieList.rn_1021(zombieList) + "n";
					frameinfo = frameinfo + "\n" + "plant:" + "0" + "ms " + PlantList.rn_1021(plantList) + "n";
					frameinfo = frameinfo + "\n" + "proj:" + "0" + "ms " + ProjList.rn_1021(projList) + "n";
					frameinfo = frameinfo + "\n" + "particle:" + "0" + "ms " + ParticleList.rn_1021(particleList) + "n";
					frameinfo = frameinfo + "\n" + "coin:" + "0" + "ms " + CoinList.rn_1021(coinlist) + "n";
					frameinfo = frameinfo + "\n" + "tracle:" + "0" + "ms " + TracleList.rn_1021(tracleList) + "n";
					for (int rn_10254 = 0;rn_10254 < MowerList.rn_1021(mowerList.rn_2334);rn_10254 += 1) {
						drawMower(MowerList.rn_2378(mowerList.rn_2334, rn_10254), rn_462);
					}
					for (int rn_10255 = -2;rn_10255 < 7;rn_10255 += 1) {
					}
					for (int rn_10256 = 0;rn_10256 < CoinList.rn_1021(coinlist);rn_10256 += 1) {
						Coin rn_517 = CoinList.rn_2243(coinlist, rn_10256);
						if (rn_517.rn_2589 == static_.rn_2621) {
							com.badlogic.gdx.graphics.Texture rn_518 = getcardtx(getwonplant());
							android.graphics.Matrix rn_519 = Matrix_.rn_3422(Matrix_.rn_3396(rn_499), rn_517.rn_2580, rn_517.rn_2582);
							SpriteBatch.rn_3853(screen, rn_518, rn_519, 1, height, Nirvana.this);
						} else {
							ds.rn_3605 = rn_517.rn_2590;
							ds.rn_3606 = rn_517.rn_2598;
							ds.rn_3607 = rn_517.rn_2599;
							ds.rn_3608 = rn_517.rn_2594;
							ds.rn_3609 = rn_517.rn_2594;
							ds.rn_3612 = -1;
							ds.rn_3613 = rn_517.rn_2612();
							ds.rn_3614 = rn_517.rn_2613();
							ds.rn_3615 = null;
							draw(screen, ds, rn_462);
						}
					}
					for (int rn_10257 = 0;rn_10257 < TracleList.rn_1021(tracleList);rn_10257 += 1) {
						Tracle rn_520 = TracleList.rn_2274(tracleList, rn_10257);
						if (rn_520.rn_2640 != null) {
							ds.rn_3605 = rn_520.rn_2640;
							ds.rn_3606 = 1.0F;
							ds.rn_3607 = 1.0F;
							ds.rn_3608 = rn_520.rn_2633;
							ds.rn_3609 = rn_520.rn_2633;
							ds.rn_3610 = 0.0F;
							ds.rn_3611 = 0.0F;
							ds.rn_3612 = -1;
							ds.rn_3613 = rn_520.rn_2627;
							ds.rn_3614 = rn_520.rn_2628;
							ds.rn_3615 = null;
							draw(screen, ds, rn_462);
						}
					}
					} catch (Exception e) {;
					};
					ds.rn_3605 = animh;
					ds.rn_3606 = 1.0F;
					ds.rn_3607 = 1.0F;
					ds.rn_3608 = 0.0F;
					ds.rn_3609 = 0.0F;
					ds.rn_3612 = -1;
					ds.rn_3613 = 300;
					ds.rn_3614 = 0;
					draw(screen, ds, rn_462);
					if (gamestart() && proc != 7) {
						com.badlogic.gdx.graphics.Pixmap rn_521 = String_Nlimagesm.rn_3128(image.rn_3462, "FlagMeter").rn_3453().rn_1927(1, 1, 0);
						int rn_522 = Pixmap_.rn_3925(rn_521) - (int) (Pixmap_.rn_3925(rn_521) * wave * 1.0F / (wavemax));
						int rn_523 = Pixmap_.rn_3925(rn_521) - (int) (Pixmap_.rn_3925(rn_521) * (wave - 1) * 1.0F / wavemax) - rn_522;
						if (rn_522 <= 0) {
							rn_522 = 1;
						} else if (rn_522 >= Pixmap_.rn_3925(rn_521) - 1) {
							rn_522 = Pixmap_.rn_3925(rn_521) - 2;
						}
						com.badlogic.gdx.graphics.Pixmap rn_524 = null;
						rn_524 = ope.rn_1758(rn_521, 0, 0, rn_522, Pixmap_.rn_3926(rn_521) / 2);
						com.badlogic.gdx.graphics.Pixmap rn_525 = null;
						rn_525 = ope.rn_1764(rn_521, rn_522, Pixmap_.rn_3926(rn_521) / 2, Pixmap_.rn_3925(rn_521), Pixmap_.rn_3926(rn_521) - 1);
						android.graphics.Matrix rn_526 = new android.graphics.Matrix();
						Matrix_.rn_3422(rn_526, 600, 600 - Pixmap_.rn_3926(rn_521) / 2);
						SpriteBatch.rn_3837(screen, rn_524, Matrix_.rn_3411(Matrix_.rn_3396(rn_526), scale, scale), 1.0F, height);
						android.graphics.Matrix rn_527 = Matrix_.rn_3396(rn_526);
						Matrix_.rn_3422(rn_526, rn_522, 0);
						SpriteBatch.rn_3837(screen, rn_525, Matrix_.rn_3411(Matrix_.rn_3396(rn_526), scale, scale), 1.0F, height);
						com.badlogic.gdx.graphics.Pixmap rn_528 = String_Nlimagesm.rn_3128(image.rn_3462, "FlagMeterParts").rn_3453().rn_1927(3, 1, 0);
						com.badlogic.gdx.graphics.Pixmap rn_529 = String_Nlimagesm.rn_3128(image.rn_3462, "FlagMeterParts").rn_3453().rn_1927(3, 1, 1);
						com.badlogic.gdx.graphics.Pixmap rn_530 = String_Nlimagesm.rn_3128(image.rn_3462, "FlagMeterParts").rn_3453().rn_1927(3, 1, 2);
						java.util.ArrayList<XMLR> rn_531 = getwaveinfo().rn_2804;
						for (int rn_10258 = 0;rn_10258 < wavemax;rn_10258 += 1) {
							if (rn_3081.rn_6682(XMLRED.rn_2990(rn_531, rn_10258).rn_2817("flag"), "1")) {
								android.graphics.Matrix rn_532 = Matrix_.rn_3422(Matrix_.rn_3396(rn_527), Pixmap_.rn_3925(rn_521) * (wavemax - rn_10258 - 1) * 1.0F / wavemax * 0.95F, -2);
								if (rn_10258 <= wave) {
									SpriteBatch.rn_3837(screen, rn_529, Matrix_.rn_3411(Matrix_.rn_3396(rn_532), scale, scale), 1.0F, height);
									Matrix_.rn_3422(rn_532, 0.0F, -0.5F * Pixmap_.rn_3926(rn_530));
									SpriteBatch.rn_3837(screen, rn_530, Matrix_.rn_3411(Matrix_.rn_3396(rn_532), scale, scale), 1.0F, height);
								} else {
									SpriteBatch.rn_3837(screen, rn_530, Matrix_.rn_3411(Matrix_.rn_3396(rn_532), scale, scale), 1.0F, height);
								}
							}
						}
						Matrix_.rn_3422(rn_526, rn_523 * procf - 1 * Pixmap_.rn_3925(rn_528) / 2 + 5, Pixmap_.rn_3926(rn_521) / 4 - Pixmap_.rn_3926(rn_528) / 2 - 5);
						SpriteBatch.rn_3837(screen, rn_528, Matrix_.rn_3396(Matrix_.rn_3411(rn_526, scale, scale)), 1.0F, height);
					}
					if (gamestart() || proc == 7) {
						int rn_533 = 600;
						if ((gamestart() && proc != 7) == false) {
							rn_533 = 800;
						}
						write3stroke(screen, levelname(), rn_533, 600 - 24, -5336500, -16777216, 20, -1, 0.0F, 2, 2);
					}
					if (gamestart() == false) {
						com.badlogic.gdx.graphics.Texture rn_534 = String_Nlimagesm.rn_3128(image.rn_3462, "SeedChooser_Background").rn_3453().rn_1941(1, 1, 0);
						zoomdraw_lbns(screen, rn_534, 0, csint - Texture_.rn_3898(rn_534), 0, 0);
						com.badlogic.gdx.graphics.Texture rn_535 = String_Nlimagesm.rn_3128(image.rn_3462, "SeedChooser_Button").rn_3453().rn_1941(1, 1, 0);
						float rn_536 = csint - Texture_.rn_3898(rn_534) + 34;
						zoomdraw_lbns(screen, rn_535, Texture_.rn_3897(rn_534) / 2, rn_536, -0.5F, -0.5F);
						Rectx rn_537 = trirect.rn_3535("start", -1, -1, Texture_.rn_3897(rn_535) * scale, Texture_.rn_3898(rn_535) * scale, scrtype);
						rn_537.rn_3485 = ((Texture_.rn_3897(rn_534) - Texture_.rn_3897(rn_535)) / 2) * scale;
						rn_537.rn_3486 = ope.rn_1786(rn_536 - Texture_.rn_3898(rn_535) / 2, 600, Texture_.rn_3898(rn_535)) * scale;
						if (rn_537.rn_3491 && selectedplant()) {
							rn_537.rn_3491 = false;
							state = "start";
							ccend = true;
						}
						int rn_538 = -12582912;
						if (selectedplant()) {
							rn_538 = -2777301;
						}
						write3stroke(screen, rn_4266.rn_4279(gametext, "LETS_ROCK_BUTTON"), Texture_.rn_3897(rn_534) / 2, (int) (600 - rn_536), rn_538, -16777216, 20, -0.5F, -0.5F, -1, -1);
						float rn_539 = 25;
						float rn_540 = csint - 36;
						int rn_541 = 0;
						int rn_542 = 0;
						com.badlogic.gdx.graphics.Texture rn_543 = String_Nlimagesm.rn_3128(image.rn_3462, "SeedPacketSilhouette").rn_3453().rn_1941(1, 1, 0);
						for (int rn_10259 = 0;rn_10259 < 48;rn_10259 += 1) {
							float rn_544 = rn_539 + rn_541 * (50 + 3);
							float rn_545 = rn_540 - (rn_542 + 1) * 70;
							zoomdraw_lbns(screen, rn_543, rn_544, rn_545, 0, 0);
							if (drawZombie(rn_10259)) {
								com.badlogic.gdx.graphics.Texture rn_546 = getcardtx(rn_10259);
								zoomdraw_lbns(screen, rn_546, rn_544, rn_545, 0, 0);
								if (plantHasChoose(rn_10259)) {
									drawRect3(screen, rn_544, ope.rn_1786(rn_545, 600, 70), 50, 70, true, -2147483648);
								} else {
									Rectx rn_547 = trirect.rn_3535("precard_" + rn_10259, -1, -1, 50 * scale, 70 * scale, scrtype);
									rn_547.rn_3485 = rn_544 * scale;
									rn_547.rn_3486 = ope.rn_1786(rn_545, 600, 70) * scale;
									if (rn_547.rn_3491) {
										rn_547.rn_3491 = false;
										select(rn_10259, true);
									}
								}
							}
							if (rn_541 == 7) {
								rn_542 = rn_542 + 1;
								rn_541 = 0;
							} else {
								rn_541 = rn_541 + 1;
							}
						}
						drawcardslot();
					}
				} else if (scrtype == 7) {
				} else if (scrtype == 1) {
					if (rn_3081.rn_6682(state, "advent")) {
						if (bool > 3500) {
							updateScene(2);
						} else {
							if (animproc > bool + 125) {
								bool = bool + 125;
								if (bool % 2 == 1) {
									if (UserdataList.rn_2785(USER.account, USER.currentAccount).alevel < 0) {
										Animed.rn_3169(animess, 0).rn_3323("SelectorScreen_StartAdventure_button", new float[]{1.0F, 1.0F, 1.0F, 1.0F});
									} else {
										Animed.rn_3169(animess, 0).rn_3323("SelectorScreen_Adventure_button", new float[]{1.0F, 1.0F, 1.0F, 1.0F});
									}
								} else {
									if (UserdataList.rn_2785(USER.account, USER.currentAccount).alevel < 0) {
										Animed.rn_3169(animess, 0).rn_3323("SelectorScreen_StartAdventure_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
									} else {
										Animed.rn_3169(animess, 0).rn_3323("SelectorScreen_Adventure_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
									}
								}
							}
							animproc = animproc + rn_458;
						}
					} else if (Animed.rn_1021(animess) >= 1 && Animed.rn_3169(animess, 0).pause) {
						if (rn_3081.rn_6682(Animed.rn_3169(animess, 0).animname, "anim_open")) {
							if (rn_3081.rn_6682(state, "none")) {
								state = "pre";
								if (USER.accountNumber == 0) {
									createAccount(true);
								} else {
									login(true);
								}
							}
						}
					}
					if (Animed.rn_1021(animess) > 0 && USER.accountNumber != 0) {
						if (rn_3081.rn_6684(state, "none")) {
							String rn_548 = UserdataList.rn_2785(USER.account, USER.currentAccount).yourname + "!";
							write(screen, rn_548, 173, (int) (95 + Animed.rn_3169(animess, 0).rn_3336("woodsign1").rn_3051), -1, 23, -0.5F, 0.0F);
						}
						if (USER.getCurrentAccount().alevel > 0) {
							drawLevel(screen);
						}
					}
				}
			}
			long rn_549 = rn_9915.rn_9921();
			long rn_550 = rn_549;
			for (int rn_10260 = 0;rn_10260 < trirect.rn_1021();rn_10260 += 1) {
			}
			if (gcv >= 360.0F) {
				gcv = 0.0F;
			} else {
				gcv = gcv + 1.0F;
			}
			for (int rn_10261 = 0;rn_10261 < ZombieList.rn_1021(zombieList);rn_10261 += 1) {
				Zombie rn_552 = ZombieList.rn_2149(zombieList, rn_10261);
				Rectx rn_553 = ZombieList.rn_2149(zombieList, rn_10261).cv;
				Rectx rn_554 = new Rectx();
				rn_554.rn_3485 = (rn_553.rn_3485 + x + ZombieList.rn_2149(zombieList, rn_10261).x()) * scale;
				rn_554.rn_3486 = (rn_553.rn_3486 + y + ZombieList.rn_2149(zombieList, rn_10261).y) * scale;
				rn_554.rn_3487 = rn_553.rn_3487 * scale;
				rn_554.rn_3488 = rn_553.rn_3488 * scale;
				drawRect(screen, rn_554, -16776961);
				String rn_555 = rn_6760.rn_6765(rn_552.HP);
				if (rn_552.hasH == true) {
					rn_555 = rn_555 + "+" + rn_6760.rn_6765(rn_552.HHP);
				}
				if (rn_552.hasS == true) {
					rn_555 = rn_555 + "+" + rn_6760.rn_6765(rn_552.SHP);
				}
				if (rn_553.rn_3490) {
					STSL rn_556 = rn_552.info();
					drawSTSL(screen, (int) rn_554.rn_3485, (int) rn_554.rn_3486, rn_556);
				}
			}
			for (int rn_10262 = 0;rn_10262 < PlantList.rn_1021(plantList);rn_10262 += 1) {
				Plant rn_557 = PlantList.rn_2181(plantList, rn_10262);
				Rectx rn_558 = PlantList.rn_2181(plantList, rn_10262).rn_2426;
				Rectx rn_559 = new Rectx();
				rn_559.rn_3485 = (rn_558.rn_3485 + x + PlantList.rn_2181(plantList, rn_10262).rn_2539()) * scale;
				rn_559.rn_3486 = (rn_558.rn_3486 + y + PlantList.rn_2181(plantList, rn_10262).y) * scale;
				rn_559.rn_3487 = rn_558.rn_3487 * scale;
				rn_559.rn_3488 = rn_558.rn_3488 * scale;
				drawRect(screen, rn_559, -16776961);
				if (rn_558.rn_3490) {
					STSL rn_560 = rn_557.rn_2541();
					drawSTSL(screen, (int) rn_559.rn_3485, (int) rn_559.rn_3486, rn_560);
				}
			}
			for (int rn_10263 = 0;rn_10263 < CoinList.rn_1021(coinlist);rn_10263 += 1) {
				Coin rn_561 = CoinList.rn_2243(coinlist, rn_10263);
				drawcollv(rn_561.rn_2587, rn_561.rn_2612(), rn_561.rn_2613(), -65536);
			}
			rn_549 = rn_9915.rn_9921();
			frameinfo = frameinfo + "\n" + "collisoin:" + rn_6767.rn_6771((rn_549 - rn_550)) + "ms";
			rn_550 = rn_549;
			if (pred) {
				DrawStyle rn_562 = new DrawStyle();
				rn_562.rn_3605 = predanim;
				rn_562.rn_3606 = 1.0F;
				rn_562.rn_3607 = 1.0F;
				rn_562.rn_3608 = 0.0F;
				rn_562.rn_3609 = 0.0F;
				rn_562.rn_3612 = -1;
				rn_562.rn_3613 = predxp - x - 50;
				rn_562.rn_3614 = predyp - 50;
				draw(screen, rn_562, rn_462);
			}
		}
		if (captionscd != 0) {
			drawRect3(screen, 0, 400, width / scale, 110, true, -1442840576);
			write3stroke(screen, captions, (int) (width / 2.0F / scale), 440, -527701, -16777216, 30, -0.5F, 0.0F, 2, 2);
		}
		SpriteBatch.rn_3888(screen);
		FrameBuffer_.rn_3931(fbo);
		ShaderProgram_.rn_3949(rgbShader, "u_opacity", 1.0F);
		ShaderProgram_.rn_3938(rgbShader, "u_rgbFactors", 1.0F, 1.0F, 1.0F);
		com.badlogic.gdx.graphics.g2d.TextureRegion rn_563 = TextureRegion_.rn_3827(TextureRegion_.rn_3823(FrameBuffer_.rn_3932(fbo), width, height), Const.rn_1641, Const.rn_1642);
		return rn_563;
	}

	public final void drawcardslot() {
		android.graphics.Matrix rn_565 = new android.graphics.Matrix();
		Matrix_.rn_3411(rn_565, scale, scale);
		if (t1 == null) {
			com.badlogic.gdx.graphics.Pixmap rn_566 = Pixmap_.rn_3914(1, 1);
			rn_566.setColor(0x00000055);
			rn_566.fill();
			t1 = Texture_.rn_3891(rn_566);
		}
		if (t2 == null) {
			com.badlogic.gdx.graphics.Pixmap rn_567 = Pixmap_.rn_3914(1, 1);
			rn_567.setColor(0x00000088);
			rn_567.fill();
			t2 = Texture_.rn_3891(rn_567);
		}
		if (t3 == null) {
			com.badlogic.gdx.graphics.Pixmap rn_568 = Pixmap_.rn_3914(1, 1);
			rn_568.setColor(0x00000040);
			rn_568.fill();
			t3 = Texture_.rn_3891(rn_568);
		}
		for (int rn_10264 = 0;rn_10264 < cardnum();rn_10264 += 1) {
			int rn_569 = 95 + rn_10264 * (mmx + 10);
			com.badlogic.gdx.graphics.Texture rn_570 = String_Nlimagesm.rn_3128(image.rn_3462, "SeedPacketSilhouette").rn_3453().rn_1941(1, 1, 0);
			zoomdraw_lbns(screen, rn_570, rn_569, 600 - 8 - 70 - sdoffy, 0, 0);
			if (rn_10264 >= cards.length || cards [rn_10264] == -1) {
			} else {
				Rectx rn_571 = trirect.rn_3535("card_" + rn_10264, rn_569 * scale, 8 * scale, 50 * scale, 70 * scale, scrtype);
				float rn_572 = 0;
				float rn_573 = 0;
				if ((sobj != -1) && sobj == cards [rn_10264]) {
					float rn_574 = cardev * 1.0F / cardevtime;
					if (evdir == false) {
						rn_574 = 1 - rn_574;
					}
					Rectx rn_575 = trirect.rn_3530("precard_" + cards [rn_10264]);
					rn_572 = (rn_575.rn_3485 / scale - rn_569) * rn_574;
					rn_573 = (rn_575.rn_3486 / scale - 8) * rn_574;
				}
				if ((sobj != -1) && evdir == false && rn_10264 >= recallid) {
					float rn_576 = cardev * 1.0F / cardevtime;
					rn_572 = (50 + 10) * rn_576;
				}
				com.badlogic.gdx.graphics.Texture rn_578 = getcardtx(cards [rn_10264]);
				zoomdraw_lbns(screen, rn_578, rn_569 + rn_572, ope.rn_1786(8 + rn_573 + sdoffy, 600, Texture_.rn_3898(rn_578)), 0, 0);
				if (proc == 3 || proc == 12) {
					float rn_581 = 1.0F;
					if (proc == 3) {
						rn_581 = animproc * 1.0F / 150;
					}
					int rn_582 = (int) (rn_581 * 64);
					drawRect3(screen, rn_569, 8 + sdoffy, 50, 70, true, ope.rn_1738(new int[]{rn_582, 0, 0, 0}));
				}
				if (gamestart()) {
					if (rn_571.rn_3490 && card_cool [rn_10264] <= 0 && (getvalue(cards [rn_10264]) <= suncount || free)) {
						choose(cards [rn_10264]);
						predidx = rn_10264;
						if (rn_3081.rn_6682(state, "cp")) {
							state = "op";
							captions("ADVICE_CLICK_ON_GRASS", -1);
						} else if (rn_3081.rn_6682(state, "bp")) {
							captionscd = 0;
							state = "sp";
						}
					}
					if (card_cool [rn_10264] <= 0 && getvalue(cards [rn_10264]) <= suncount) {
						if ((rn_3081.rn_6682(state, "cp")) && rn_10264 == 0) {
							int rn_583 = 80;
							int rn_584 = gettransp(animproc, rn_583, 0);
							drawRect3(screen, rn_569, 8, 50, 70, true, ope.rn_1738(new int[]{rn_584, 0, 0, 0}));
							com.badlogic.gdx.graphics.Texture rn_585 = String_Nlimagesm.rn_3128(image.rn_3462, "DownArrow").rn_3453().rn_1941(1, 1, 0);
							android.graphics.Matrix rn_586 = Matrix_.rn_3396(matrix);
							Matrix_.rn_3422(Matrix_.rn_3411(rn_586, 1, -1), (rn_569 + (50 - Texture_.rn_3897(rn_585)) / 2) * scale, (Texture_.rn_3898(rn_585) + 8 + 70 + gettransp(animproc, rn_583 - 20, 0) / 18.0F) * scale);
							SpriteBatch.rn_3866(screen, rn_585, rn_586, new float[]{1.0F, 0.9F, 0.4F, 1.0F}, height, Nirvana.this, false);
						}
					}
					if (card_cool [rn_10264] > 0) {
						int rn_587 = getct(cards [rn_10264]);
						float rn_588 = (0 + 50) * scale;
						float rn_589 = (0 + 70) * scale;
						SpriteBatch.rn_3860(screen, t1, rn_569 * scale, ope.rn_1786(8 * scale, height, rn_589), rn_588, rn_589);
						rn_589 = (0 + 70 * (card_cool [rn_10264] * 1.0F / rn_587)) * scale;
						SpriteBatch.rn_3860(screen, t3, rn_569 * scale, ope.rn_1786(8 * scale, height, rn_589), rn_588, rn_589);
					}
					if (suncount < getvalue(cards [rn_10264])) {
						float rn_590 = (0 + 50) * scale;
						float rn_591 = (0 + 70) * scale;
						SpriteBatch.rn_3860(screen, t2, rn_569 * scale, ope.rn_1786(8 * scale, height, rn_591), rn_590, rn_591);
					}
				}
				if (rn_571.rn_3491) {
					rn_571.rn_3491 = false;
					if (gamestart()) {
						if (card_cool [rn_10264] <= 0 && getvalue(cards [rn_10264]) <= suncount) {
							choose(cards [rn_10264]);
							predidx = cards [rn_10264];
						}
					} else {
						select(cards [rn_10264], false);
					}
				}
			}
		}
		if ((sobj != -1) && evdir == false) {
			int rn_592 = 95 + recallid * (mmx + 10);
			float rn_593 = 0;
			float rn_594 = 0;
			float rn_595 = 1 - cardev * 1.0F / cardevtime;
			Rectx rn_596 = trirect.rn_3530("precard_" + sobj);
			rn_593 = (rn_596.rn_3485 / scale - rn_592) * rn_595;
			rn_594 = (rn_596.rn_3486 / scale - 8) * rn_595;
			android.graphics.Matrix rn_597 = Matrix_.rn_3396(rn_565);
			Matrix_.rn_3447(rn_597, rn_592 + rn_593, 8 + rn_594);
			com.badlogic.gdx.graphics.Pixmap rn_598 = Pixmap_.rn_3919(getcardcs(sobj));
			SpriteBatch.rn_3837(screen, rn_598, rn_597, 1.0F, height - (int) (sdoffy * scale));
			rn_598.dispose();
		}
	}

	public final boolean plantHasChoose(int rn_599) {
		for (int rn_10265 = 0;rn_10265 < cards.length;rn_10265 += 1) {
			if (cards [rn_10265] == rn_599) {
				return true;
			}
		}
		return false;
	}

	public final void zoomdraw_lbns(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_600, com.badlogic.gdx.graphics.Texture rn_601, float rn_602, float rn_603, float rn_604, float rn_605) {
		SpriteBatch.rn_3860(rn_600, rn_601, (rn_602 + Texture_.rn_3897(rn_601) * rn_604) * scale, (rn_603 + Texture_.rn_3898(rn_601) * rn_605) * scale, Texture_.rn_3897(rn_601) * scale, Texture_.rn_3898(rn_601) * scale);
	}

	public final void drawLevel(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_606) {
		String rn_607 = rn_6760.rn_6765(getOzeki(USER.getCurrentAccount().alevel));
		String rn_608 = rn_6760.rn_6765(getsLevel(USER.getCurrentAccount().alevel));
		int rn_609 = 557;
		for (int rn_10266 = 0;rn_10266 < rn_6677.rn_1021(rn_607);rn_10266 += 1) {
			int rn_610 = rn_3081.rn_6726(rn_3081.rn_6719(rn_607, rn_6677.rn_1021(rn_607) - rn_10266 - 1, rn_6677.rn_1021(rn_607) - rn_10266 - 1), 10);
			com.badlogic.gdx.graphics.Pixmap rn_611 = String_Nlimagesm.rn_3128(image.rn_3462, "SelectorScreen_LevelNumbers").rn_3453().rn_1927(10, 1, rn_610);
			SpriteBatch.rn_3860(rn_606, Texture_.rn_3891(rn_611), rn_609 * scale, ope.rn_1786(cbc(rn_609) * scale, height, Pixmap_.rn_3926(rn_611) * scale), Pixmap_.rn_3925(rn_611) * scale, Pixmap_.rn_3926(rn_611) * scale);
			rn_609 = rn_609 - (int) (Pixmap_.rn_3925(rn_611) * 0.8F);
		}
		rn_609 = 575;
		for (int rn_10267 = 0;rn_10267 < rn_6677.rn_1021(rn_608);rn_10267 += 1) {
			int rn_612 = rn_3081.rn_6726(rn_3081.rn_6719(rn_608, rn_10267, rn_10267), 10);
			com.badlogic.gdx.graphics.Pixmap rn_613 = String_Nlimagesm.rn_3128(image.rn_3462, "SelectorScreen_LevelNumbers").rn_1927(10, 1, rn_612);
			SpriteBatch.rn_3860(rn_606, Texture_.rn_3891(rn_613), rn_609 * scale, ope.rn_1786(cbc(rn_609) * scale, height, Pixmap_.rn_3926(rn_613) * scale), Pixmap_.rn_3925(rn_613) * scale, Pixmap_.rn_3926(rn_613) * scale);
			rn_609 = rn_609 + (int) (Pixmap_.rn_3925(rn_613) * 0.8F);
		}
	}

	public final int cbc(int rn_614) {
		return (int) (11.25F / 80 * rn_614 + 50 + Animed.rn_3169(animess, 0).rn_3336("SelectorScreen_BG_Right").rn_3051);
	}

	public final void shadow(float rn_615, float rn_616, String rn_617, android.graphics.Matrix rn_618) {
		android.graphics.Matrix rn_619 = Matrix_.rn_3422(Matrix_.rn_3396(rn_618), (x + rn_615) * scale, (y + rn_616) * scale);
		com.badlogic.gdx.graphics.Texture rn_620 = String_Nlimagesm.rn_3128(image.rn_3462, rn_617).rn_3453().rn_1941(1, 1, 0);
		SpriteBatch.rn_3853(screen, rn_620, rn_619, 1.0F, height, null);
	}

	public final void createAccount(boolean rn_621) {
		USER.accountNumber = USER.accountNumber + 1;
		Userdata rn_622 = new Userdata();
		rn_622.yourname = "Developer";
		rn_622.alevel = -1;
		UserdataList.rn_2777(USER.account, rn_622);
		USER.currentAccount = UserdataList.rn_1021(USER.account) - 1;
		saveArchive();
		if (rn_621) {
			login(true);
		}
	}

	public final void select(int rn_623, boolean rn_624) {
		if (rn_624 == false) {
			String rn_625 = "search";
			for (int rn_10268 = 0;rn_10268 < cards.length;rn_10268 += 1) {
				if (rn_3081.rn_6682(rn_625, "search")) {
					if (cards [rn_10268] == rn_623) {
						recallid = rn_10268;
						rn_625 = "move";
					}
				}
				if (rn_3081.rn_6682(rn_625, "move")) {
					if (rn_10268 == cards.length - 1) {
						cards [rn_10268] = -1;
					} else {
						cards [rn_10268] = cards [rn_10268 + 1];
					}
				}
			}
			sobj = rn_623;
			cardev = cardevtime;
			evdir = rn_624;
		} else {
			for (int rn_10269 = 0;rn_10269 < cards.length;rn_10269 += 1) {
				if (cards [rn_10269] == -1) {
					sobj = rn_623;
					cardev = cardevtime;
					evdir = rn_624;
					cards [rn_10269] = rn_623;
					break;
				}
			}
		}
	}

	public final void login(boolean rn_626) {
		if (UserdataList.rn_2769((USER.account), USER.currentAccount).alevel >= 0) {
			Animed.rn_3169(animess, 0).rn_3360(new String[]{"SelectorScreen_Adventure_button", "SelectorScreen_Adventure_shadow"}, 0, false);
			Animed.rn_3169(animess, 0).rn_3360(new String[]{"SelectorScreen_StartAdventure_button", "SelectorScreen_StartAdventure_shadow"}, -1, false);
		}
		if (UserdataList.rn_2769((USER.account), USER.currentAccount).unlockmini == false) {
			Animed.rn_3169(animess, 0).rn_3323("SelectorScreen_Survival_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
		}
		if (UserdataList.rn_2769((USER.account), USER.currentAccount).unlockpuzzle == false) {
			Animed.rn_3169(animess, 0).rn_3323("SelectorScreen_Challenges_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
		}
		if (UserdataList.rn_2769((USER.account), USER.currentAccount).unlockendless == false) {
			Animed.rn_3169(animess, 0).rn_3323("SelectorScreen_ZenGarden_button", new float[]{0.5F, 0.5F, 0.5F, 1.0F});
		}
		if (rn_626) {
			state = "sign";
			Animed.rn_3169(animess, 0).rn_3366("anim_sign", false);
			Animed.rn_3169(animess, 0).pauseAfterBroadcasting = true;
		}
		String[] rn_627 = {"leaf1", "leaf2", "leaf3", "leaf4", "leaf5", "leaf_SelectorScreen_Leaves"};
		Animed.rn_3169(animess, 0).rn_3360(rn_627, -1, false);
		Animed.rn_3177(animess, Anim.rn_3310("SelectorScreen", Nirvana.this).rn_3366("anim_grass", false));
	}

	public final int getwonplant() {
		int rn_630 = level % 10;
		int rn_631 = (level - rn_630) / 10;
		int rn_632 = rn_630;
		if (rn_632 > 4) {
			rn_632 = rn_632 - 1;
		} else {
			rn_632 = rn_632;
		}
		return rn_631 * 8 + rn_632;
	}

	public final boolean selectedplant() {
		if (cards.length != 0 && cards [cards.length - 1] != -1) {
			return true;
		}
		return false;
	}

	public final void drawSTSL(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_633, int rn_634, int rn_635, STSL rn_636) {
		int rn_637 = 1;
		if (rn_635 + rn_637 * 16 * rn_4198.rn_1021(rn_636.rn_3478) > height) {
			rn_635 = height - rn_637 * 16 * rn_4198.rn_1021(rn_636.rn_3478);
		}
		int rn_638 = ope.rn_1740(ope.rn_1818(new float[]{gcv, 1.0F, 1.0F}), 255);
		int rn_639 = ope.rn_1859(rn_638, 255);
		android.graphics.Paint rn_640 = Paint_.rn_1528(Paint_.rn_1530(Paint_.rn_1526(), rn_637 * 32), textfont);
		int rn_641 = rn_635;
		for (int rn_10271 = 0;rn_10271 < rn_4198.rn_1021(rn_636.rn_3478);rn_10271 += 1) {
			Paint_.rn_1533(rn_640, rn_638);
			int rn_642 = (int) Paint_.rn_1536(rn_640, rn_4198.rn_4201((rn_636.rn_3478), rn_10271));
			BitmapFontData_.rn_4006(BitmapFont_.rn_3989(font1), 1);
			BitmapFont_.rn_3990(font1, Color_.rn_3900(ope.rn_1792(rn_638)));
			BitmapFont_.rn_3999(font1, rn_633, rn_4198.rn_4201((rn_636.rn_3478), rn_10271), rn_634, ope.rn_1786(rn_641, height, 80));
			Paint_.rn_1533(rn_640, rn_639);
			BitmapFont_.rn_3990(font1, Color_.rn_3900(ope.rn_1792(rn_639)));
			BitmapFont_.rn_3999(font1, rn_633, rn_4198.rn_4201((rn_636.rn_3479), rn_10271), rn_634 + rn_642 + 15, ope.rn_1786(rn_641, height, 80));
			rn_641 = rn_641 + rn_637 * 16;
		}
	}

	public final int gettransp(int rn_643, int rn_644, int rn_645) {
		int rn_646 = rn_643 % rn_644;
		if (rn_646 < rn_644 / 2) {
			return (int) (rn_646 * 1.0F / (rn_644 / 2) * 200 + 55 * rn_645);
		} else {
			return (int) ((rn_644 - rn_646) * 1.0F / (rn_644 / 2) * 200 + 55 * rn_645);
		}
	}

	public final void drawcollv(Rectx rn_647, float rn_648, float rn_649, int rn_650) {
		Rectx rn_651 = new Rectx();
		rn_651.rn_3485 = (rn_647.rn_3485 + x + rn_648) * scale;
		rn_651.rn_3486 = (rn_647.rn_3486 + y + rn_649) * scale;
		rn_651.rn_3487 = rn_647.rn_3487 * scale;
		rn_651.rn_3488 = rn_647.rn_3488 * scale;
		drawRect(screen, rn_651, rn_650);
	}

	public final int getct(int rn_652) {
		return rn_3081.rn_6726(config.rn_2811("card").rn_2811(rn_6760.rn_6765(rn_652)).rn_2817("ct"), 10);
	}

	public final int getvalue(int rn_653) {
		return rn_3081.rn_6726(config.rn_2811("card").rn_2811(rn_6760.rn_6765(rn_653)).rn_2817("v"), 10);
	}

	public final boolean readSceneArchive() {
		try {;
		UserdataList.rn_2791(USER.account);
		String rn_654 = "/storage/emulated/0/.pvz/user.dat";
		if (rn_9755.rn_9791(rn_654)) {
			byte[] rn_655 = rn_9755.rn_9801(rn_654);
			int rn_656 = 24;
			USER.accountNumber = rn_7227.rn_7242(readHex(rn_655, rn_656, 4));
			USER.currentAccount = rn_7227.rn_7242(readHex(rn_655, rn_656 + 4, 4));
			rn_656 = rn_7227.rn_7242(readHex(rn_655, rn_656 + 8, 4));
			for (int rn_10272 = 0;rn_10272 < USER.accountNumber;rn_10272 += 1) {
				int rn_657 = rn_7227.rn_7242(readHex(rn_655, rn_656 + rn_10272 * 4, 4));
				Userdata rn_658 = new Userdata();
				byte[] rn_659 = loadText2(rn_655, rn_657);
				rn_658.yourname = op.rn_1081(rn_659);
				rn_657 = rn_657 + rn_659.length + 1;
				rn_658.aweekly = rn_7227.rn_7242(readHex(rn_655, rn_657, 4));
				rn_658.alevel = rn_7227.rn_7242(readHex(rn_655, rn_657 + 4, 4));
				rn_658.unlockmini = op.rn_1141(readHex(rn_655, rn_657 + 8, 1) [0]);
				rn_658.unlockpuzzle = op.rn_1141(readHex(rn_655, rn_657 + 9, 1) [0]);
				rn_658.unlockendless = op.rn_1141(readHex(rn_655, rn_657 + 10, 1) [0]);
				UserdataList.rn_2777(USER.account, rn_658);
			}
			return true;
		} else {
			return false;
		}
		} catch (Exception e) {;
		popup("注意，已有存档读取失败，说不定是损坏了，简而言之，你存档没了。");
		};
		return false;
	}

	public final boolean drawZombie(int rn_660) {
		if (rn_660 >= 40) {
		} else {
			if (USER.getCurrentAccount().aweekly == 0) {
				if (rn_660 < getwonplant()) {
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

	public final void popup(String rn_661) {
		rn_661 = rn_661;
	}

	public final void drawPlant(Plant rn_662, float rn_663, android.graphics.Matrix rn_664) {
		shadow(rn_662.x + rn_662.rn_2426.rn_3485 - 50, rn_662.y + rn_662.rn_2426.rn_3486 + 12, "plantshadow", rn_664);
		ds.rn_3605 = null;
		if (rn_662.rn_2436) {
			ds.rn_3615 = rn_662.rn_2437;
		} else {
			ds.rn_3615 = null;
		}
		ds.rn_3606 = rn_662.scale;
		ds.rn_3607 = rn_662.scale;
		ds.rn_3608 = rn_662.rn_2429;
		ds.rn_3609 = rn_662.rn_2429;
		ds.rn_3610 = 0.0F;
		ds.rn_3611 = 0.0F;
		ds.rn_3612 = -1;
		ds.rn_3613 = rn_662.rn_2539();
		ds.rn_3614 = rn_662.y;
		for (int rn_10273 = 0;rn_10273 < rn_662.anim.length;rn_10273 += 1) {
			ds.rn_3605 = (rn_662.anim) [rn_10273];
			ShaderProgram_.rn_3943(rgbShader, "u_clipRegion", 0, 0, width, height);
			draw(screen, ds, rn_663);
		}
	}

	public final int cardnum() {
		if (level < 6) {
			return level;
		}
		return USER.getCurrentAccount().slotnumber;
	}

	public final void drawZombie(Zombie rn_665, float rn_666, android.graphics.Matrix rn_667) {
		shadow(rn_665.x() + rn_665.cv.rn_3485 - 27, rn_665.y + rn_665.cv.rn_3486 + rn_665.cv.rn_3488 - 20, "plantshadow", rn_667);
		ds.rn_3605 = rn_665.anim;
		ds.rn_3606 = 1.0F;
		ds.rn_3607 = 1.0F;
		ds.rn_3608 = rn_665.Rotation;
		ds.rn_3609 = rn_665.Rotation;
		ds.rn_3612 = -1;
		ds.rn_3613 = rn_665.x();
		ds.rn_3614 = rn_665.y;
		if (rn_665.shake != 0) {
			ds.rn_3613 = ds.rn_3613 + ope.rn_1684(0, rn_665.shake) - rn_665.shake * 0.5F;
			ds.rn_3614 = ds.rn_3614 + ope.rn_1684(0, rn_665.shake) - rn_665.shake * 0.5F;
		}
		if (rn_665.enableMatrix) {
			ds.rn_3615 = rn_665.matrix;
		} else {
			ds.rn_3615 = null;
		}
		if (rn_665.enableBroken) {
			float rn_668 = (x + rn_665.x() * rn_665.limitRect.rn_4116 + rn_665.limitRect.rn_4112) * scale;
			float rn_669 = (y + rn_665.y * rn_665.limitRect.rn_4117 + rn_665.limitRect.rn_4113) * scale;
			float rn_670 = rn_665.limitRect.rn_4114 * scale;
			float rn_671 = rn_665.limitRect.rn_4115 * scale;
			ShaderProgram_.rn_3943(rgbShader, "u_clipRegion", rn_668, ope.rn_1786(rn_669, height, rn_671), rn_670, rn_671);
		} else {
			ShaderProgram_.rn_3943(rgbShader, "u_clipRegion", 0, 0, width, height);
		}
		draw(screen, ds, rn_666);
		rn_665.immUpdate();
	}

	public final void drawMower(Mower rn_672, float rn_673) {
		ds.rn_3605 = rn_672.rn_2396;
		ds.rn_3606 = rn_672.rn_2399;
		ds.rn_3607 = rn_672.rn_2399;
		ds.rn_3608 = 0;
		ds.rn_3609 = 0;
		ds.rn_3612 = -1;
		ds.rn_3613 = rn_672.rn_2391;
		ds.rn_3614 = rn_672.rn_2406();
		ds.rn_3615 = null;
		draw(screen, ds, rn_673);
	}

	public final void saveArchive() {
		byte[] rn_674 = (byte[]) (new byte[1024]);
		writeHex(rn_674, 0, Nirvana.text2byte("FF FF FF FF FF FF FF FF    FF FF FF FF FF FF FF FF    50 56 5A 31 00 00 00 01"));
		int rn_675 = 24;
		writeHex(rn_674, rn_675, op.rn_1149(UserdataList.rn_1021(USER.account)));
		writeHex(rn_674, rn_675 + 4, op.rn_1149(USER.currentAccount));
		writeHex(rn_674, rn_675 + 8, op.rn_1149(rn_675 + 16));
		rn_675 = rn_675 + 16;
		int rn_676 = rn_675 + UserdataList.rn_1021(USER.account) * 4;
		for (int rn_10274 = 0;rn_10274 < UserdataList.rn_1021(USER.account);rn_10274 += 1) {
			writeHex(rn_674, rn_675 + rn_10274 * 4, op.rn_1149(rn_676));
			byte[] rn_677 = rn_3081.rn_6733(UserdataList.rn_2785(USER.account, rn_10274).yourname, "UTF-8");
			writeHex(rn_674, rn_676, rn_677);
			rn_676 = rn_676 + rn_677.length + 1;
			writeHex(rn_674, rn_676, op.rn_1149(UserdataList.rn_2785(USER.account, rn_10274).aweekly));
			writeHex(rn_674, rn_676 + 4, op.rn_1149(UserdataList.rn_2785(USER.account, rn_10274).alevel));
			rn_676 = rn_676 + 8;
			writeHex(rn_674, rn_676, new byte[]{op.rn_1137(UserdataList.rn_2785(USER.account, rn_10274).unlockmini)});
			writeHex(rn_674, rn_676 + 1, new byte[]{op.rn_1137(UserdataList.rn_2785(USER.account, rn_10274).unlockpuzzle)});
			writeHex(rn_674, rn_676 + 2, new byte[]{op.rn_1137(UserdataList.rn_2785(USER.account, rn_10274).unlockendless)});
			rn_676 = rn_676 + 3;
		}
		String rn_678 = "/storage/emulated/0/.pvz/user.dat";
		rn_9755.rn_9803(rn_678, rn_674);
	}

	public static final byte[] text2byte(String rn_679) {
		rn_679 = rn_3081.rn_6698(rn_3081.rn_6698(rn_679, " ", ""), "\n", "");
		byte[] rn_680 = null;
		rn_680=new byte[rn_679.length()/2];
		for (int rn_10275 = 0;rn_10275 < rn_680.length;rn_10275 += 1) {
			int rn_681 = rn_3081.rn_6726(rn_3081.rn_6719(rn_679, rn_10275 * 2, rn_10275 * 2 + 1), 16);
			if (rn_681 > 127) {
				rn_681 = rn_681 - 256;
			}
			rn_680 [rn_10275] = (byte)rn_681;
		}
		return rn_680;
	}

	public final void writeHex(byte[] rn_682, int rn_683, byte[] rn_684) {
		for (int rn_10276 = rn_683;rn_10276 < rn_683 + rn_684.length;rn_10276 += 1) {
			rn_682 [rn_10276] = rn_684 [rn_10276 - rn_683];
		}
	}

	public final byte[] readHex(byte[] rn_693, int rn_694, int rn_695) {
		byte[] rn_696 = null;
		rn_696=new byte[rn_695];
		for (int rn_10279 = rn_694;rn_10279 < rn_694 + rn_695;rn_10279 += 1) {
			rn_696 [rn_10279 - rn_694] = rn_693 [rn_10279];
		}
		return rn_696;
	}

	public final byte[] loadText2(byte[] rn_702, int rn_703) {
		int rn_704 = rn_703;
		int rn_705 = 0;
		for (int rn_10282 = 0;rn_10282 < 10;rn_10282 += 1) {
			rn_10282 = 1;
			if (rn_702 [rn_703] == 0) {
				break;
			} else {
				rn_703 = rn_703 + 1;
				rn_705 = rn_705 + 1;
			}
		}
		byte[] bytes = new byte[rn_705];
		for (int rn_10283 = 0;rn_10283 < rn_705;rn_10283 += 1) {
			bytes[rn_10283]=rn_702[rn_10283+rn_704];
		}
		return bytes;
	}

	public final void choose(int rn_706) {
		Plant rn_707 = Plant.rn_2439(Nirvana.this, -1, -1, rn_706);
		pred = true;
		predanim = (rn_707.anim) [0];
		predtype = rn_706;
	}

	public final void initLevel(int rn_708, int rn_709) {
		level = rn_708;
		leveltype = rn_709;
		String rn_710 = rn_9755.rn_9795("/sdcard/.pvz/" + levelname() + ".json", "UTF-8");
		if (rn_3081.rn_6684(rn_710, "")) {
			rn_959(rn_710);
		} else {
			scene = initLevel_scene(rn_708, rn_709);
			ccend = false;
			animproc = 0;
			cards = (int[]) (new int[0]);
			state = "none";
			int[] rn_711 = getzombie(getwaveinfo().rn_2817("allowedZombies"));
			wave = 0;
			wavemax = XMLRED.rn_1021(getwaveinfo().rn_2804);
			sunapp = 0;
			suncount = 50;
			if (level == 1) {
				suncount = 150;
			}
			if (level != 50) {
				if (level == 1) {
					for (int rn_10284 = 0;rn_10284 < 5;rn_10284 += 1) {
						ZombieList.rn_2157(zombieList, zombieidle(0));
					}
				} else if (level == 2) {
					for (int rn_10285 = 0;rn_10285 < 10;rn_10285 += 1) {
						ZombieList.rn_2157(zombieList, zombieidle(0));
					}
				} else {
					for (int rn_10286 = 0;rn_10286 < rn_711.length;rn_10286 += 1) {
						ZombieList.rn_2157(zombieList, zombieidle(rn_711 [rn_10286]));
					}
					int rn_712 = rn_7149.rn_7160(2, 5);
					if (rn_711.length < 5) {
						rn_712 = rn_711.length;
					}
					for (int rn_10287 = 0;rn_10287 < rn_712;rn_10287 += 1) {
						ZombieList.rn_2157(zombieList, zombieidle(rn_711 [rn_7149.rn_7160(0, rn_711.length - 1)]));
					}
				}
			}
			for (int rn_10288 = 0;rn_10288 < 5;rn_10288 += 1) {
			}
		}
	}

	public final XMLR getwaveinfo() {
		return levels.rn_2811("PVZ").rn_2819("id", getlevelname(level, leveltype));
	}

	public final Zombie zombieidle(int rn_713) {
		Zombie rn_714 = Zombie.create(Nirvana.this, rn_713, -1);
		rn_714.anim.rn_3366("anim_idle", false);
		rn_714.x = rn_7149.rn_7160(1050, 1200);
		rn_714.y = rn_7149.rn_7160(0, 500);
		rn_714.idle = true;
		rn_714.anim.speed = 0.5F * Zombie.tool_getrandom();
		return rn_714;
	}

	public final int[] getzombie(String rn_715) {
		String[] rn_716 = rn_3081.rn_6724(rn_715, " ");
		int[] rn_717 = (int[]) (new int[rn_716.length]);
		for (int rn_10289 = 0;rn_10289 < rn_716.length;rn_10289 += 1) {
			try {;
			rn_717 [rn_10289] = rn_3081.rn_6726(rn_716 [rn_10289], 10);
			} catch (Exception e) { e.printStackTrace(); };
		}
		rn_717 = op.rn_1105(rn_717);
		int rn_718 = 0;
		for (int rn_10290 = 1;rn_10290 < rn_717.length;rn_10290 += 1) {
			if (rn_717 [rn_10290] == rn_717 [rn_10290 - 1]) {
				rn_718 = rn_718 + 1;
			}
		}
		int[] rn_719 = (int[]) (new int[rn_717.length - rn_718]);
		rn_719 [0] = rn_717 [0];
		int rn_720 = 1;
		for (int rn_10291 = 1;rn_10291 < rn_717.length;rn_10291 += 1) {
			if (rn_717 [rn_10291] != rn_717 [rn_10291 - 1]) {
				rn_719 [rn_720] = rn_717 [rn_10291];
				rn_720 = rn_720 + 1;
			}
		}
		return rn_719;
	}

	public final String getlevelname(int rn_721, int rn_722) {
		String rn_723 = "";
		if (rn_722 == 0) {
			rn_723 = "";
		} else if (rn_722 == 1) {
			rn_723 = "B";
		} else if (rn_722 == 2) {
			rn_723 = "C";
		} else if (rn_722 == 3) {
			rn_723 = "D";
		}
		return rn_723 + rn_6760.rn_6765(rn_721);
	}

	public final int initLevel_scene(int rn_724, int rn_725) {
		if (rn_725 == 0 || rn_725 == 1) {
			if (rn_724 <= 10) {
				return 0;
			} else if (rn_724 <= 20) {
				return 1;
			} else if (rn_724 <= 30) {
				return 2;
			} else if (rn_724 <= 40) {
				return 3;
			} else if (rn_724 < 50) {
				return 4;
			} else if (rn_724 == 50) {
				return 5;
			}
		}
		return 0;
	}

	public final int[] pixel2grid(float rn_726, float rn_727) {
		float rn_728 = rn_726 - 260;
		rn_728 = (rn_728 - rn_728 % 80) / 80;
		float rn_729 = rn_727 - 80;
		rn_729 = (rn_729 - rn_729 % 100) / 100;
		int[] rn_730 = {(int) rn_728, (int) rn_729};
		return rn_730;
	}

	public final void drawRect3(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_737, float rn_738, float rn_739, float rn_740, float rn_741, boolean rn_742, int rn_743) {
		if (rn_742) {
			com.badlogic.gdx.graphics.Pixmap rn_744 = Pixmap_.rn_3914(1, 1);
			int rn_745 = ope.rn_1792(rn_743);
			rn_744.setColor(rn_745);
			rn_744.fill();
			com.badlogic.gdx.graphics.Texture rn_746 = Texture_.rn_3891(rn_744);
			SpriteBatch.rn_3860(rn_737, rn_746, rn_738 * scale, ope.rn_1786(rn_739 * scale, height, rn_741 * scale), rn_740 * scale, rn_741 * scale);
			ShaderProgram_.rn_3949(rgbShader, "u_opacity", 1);
			ShaderProgram_.rn_3938(rgbShader, "u_rgbFactors", 1, 1, 1);
		} else {
			com.badlogic.gdx.graphics.Pixmap rn_747 = Pixmap_.rn_3914(1, 1);
			int rn_748 = ope.rn_1792(rn_743);
			rn_747.setColor(rn_748);
			rn_747.fill();
			com.badlogic.gdx.graphics.Texture rn_749 = Texture_.rn_3891(rn_747);
			float rn_750 = rn_738 * scale;
			float rn_751 = ope.rn_1786(rn_739 * scale, height, rn_741 * scale);
			float rn_752 = rn_740 * scale;
			float rn_753 = rn_741 * scale;
			int rn_754 = 2;
			SpriteBatch.rn_3860(rn_737, rn_749, rn_750, rn_751, rn_752 + rn_754, rn_754);
			ShaderProgram_.rn_3949(rgbShader, "u_opacity", 1);
			ShaderProgram_.rn_3938(rgbShader, "u_rgbFactors", 1, 1, 1);
			SpriteBatch.rn_3860(rn_737, rn_749, rn_750, rn_751, rn_754, rn_753);
			SpriteBatch.rn_3860(rn_737, rn_749, rn_750 + rn_752, rn_751, rn_754, rn_753);
			SpriteBatch.rn_3860(rn_737, rn_749, rn_750, rn_751 + rn_753, rn_752, rn_754);
		}
	}

	public final void drawRect(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_755, Rectx rn_756, int rn_757) {
		rn_755 = rn_755;
		rn_756 = rn_756;
		rn_757 = rn_757;
	}

	public final void handleTouch(android.view.MotionEvent rn_758, boolean rn_759) {
		try {;
		touch = rn_758;
		boolean rn_760 = false;
		boolean rn_761 = false;
		tx = (float) ((float) ((rn_8652.rn_8658(rn_758, 0) - realx)));
		ty = (float) ((float) (rn_8652.rn_8660(rn_758, 0)));
		long rn_762 = rn_9915.rn_9921();
		if (pred) {
			int[] rn_763 = pixel2grid(tx / scale - x, ty / scale);
			predx = rn_763 [0];
			predy = rn_763 [1];
			predxp = tx / scale;
			predyp = ty / scale;
		}
		if (rn_8652.rn_8654(rn_758) == rn_8645.rn_8646 && rn_759 == false) {
			dx = tx;
			dy = ty;
			tt = rn_9915.rn_9921();
		} else if (rn_8652.rn_8654(rn_758) == rn_8645.rn_8648 && rn_759 == false) {
			if (pred) {
				boolean rn_764 = true;
				for (int rn_10292 = 0;rn_10292 < PlantList.rn_1021(plantList);rn_10292 += 1) {
					if (predy == PlantList.rn_2181(plantList, rn_10292).rn_2421 && predx == PlantList.rn_2181(plantList, rn_10292).rn_2422 && couldPlant(predx, predy)) {
						rn_764 = false;
						break;
					}
				}
				if (rn_764 && couldPlant(predx, predy)) {
					if (rn_3081.rn_6682(state, "op")) {
						state = "ep";
						captions("ADVICE_PLANTED_PEASHOOTER", -1);
						animproc = 0;
						sunapp = 200;
						canshedsun = true;
					} else if (rn_3081.rn_6682(state, "sp")) {
						captions("ADVICE_ZOMBIE_ONSLAUGHT", 400);
						proc = 4;
						animproc = 0;
						state = "";
					}
					PlantList.rn_2189(plantList, Plant.rn_2439(Nirvana.this, predy, predx, predtype));
					XMLR rn_765 = (config).rn_2811("card").rn_2811(rn_6760.rn_6765(predtype));
					if (nntw == false) {
						card_cool [predidx] = rn_3081.rn_6726(rn_765.rn_2817("ct"), 10);
					}
					if (free == false) {
						suncount = suncount - getvalue(predtype);
					}
				}
				pred = false;
				predanim = null;
			}
			if (ope.rn_1728(tx - dx) + ope.rn_1728(tx - dx) < 50 && rn_762 - tt < 100) {
				rn_760 = true;
				loadproc.rn_2860 = "click:x=" + tx + "  y=" + ty;
			}
			touch = null;
		} else if (rn_8652.rn_8654(rn_758) == rn_8645.rn_8647 || rn_759) {
			if (rn_762 - tt >= 20) {
				rn_761 = true;
				loadproc.rn_2860 = "move:x=" + tx + "  y=" + ty;
			}
		}
		boolean rn_766 = false;
		Point rn_767 = Point.rn_4010(tx / scale, ty / scale);
		if (rn_761 || rn_760) {
			for (int rn_10293 = 0;rn_10293 < trirect.rn_1021() + CoinList.rn_1021(coinlist) + PlantList.rn_1021(plantList) + ZombieList.rn_1021(zombieList) + RectaList.rn_1021(judarea);rn_10293 += 1) {
				Rectx rn_768 = new Rectx();
				Rectx rn_769 = null;
				if (rn_10293 < trirect.rn_1021()) {
					rn_768 = trirect.rn_3528(rn_10293);
					rn_769 = rn_768;
				} else if (rn_10293 < trirect.rn_1021() + CoinList.rn_1021(coinlist)) {
					Coin rn_770 = CoinList.rn_2243(coinlist, rn_10293 - trirect.rn_1021());
					rn_768.rn_3485 = (rn_770.rn_2612() + rn_770.rn_2587.rn_3485 + x) * scale;
					rn_768.rn_3486 = (rn_770.rn_2613() + rn_770.rn_2587.rn_3486) * scale;
					rn_768.rn_3487 = rn_770.rn_2587.rn_3487 * scale;
					rn_768.rn_3488 = rn_770.rn_2587.rn_3488 * scale;
					rn_769 = rn_770.rn_2587;
				} else if (rn_10293 < trirect.rn_1021() + CoinList.rn_1021(coinlist) + PlantList.rn_1021(plantList)) {
					Plant rn_771 = PlantList.rn_2181(plantList, rn_10293 - trirect.rn_1021() - CoinList.rn_1021(coinlist));
					rn_768.rn_3485 = (rn_771.rn_2539() + rn_771.rn_2426.rn_3485 + x) * scale;
					rn_768.rn_3486 = (rn_771.rn_2540() + rn_771.rn_2426.rn_3486) * scale;
					rn_768.rn_3487 = rn_771.rn_2426.rn_3487 * scale;
					rn_768.rn_3488 = rn_771.rn_2426.rn_3488 * scale;
					rn_769 = rn_771.rn_2426;
				} else if (rn_10293 < trirect.rn_1021() + CoinList.rn_1021(coinlist) + PlantList.rn_1021(plantList) + ZombieList.rn_1021(zombieList)) {
					Zombie rn_772 = ZombieList.rn_2149(zombieList, rn_10293 - trirect.rn_1021() - CoinList.rn_1021(coinlist) - PlantList.rn_1021(plantList));
					rn_768.rn_3485 = (rn_772.x() + rn_772.cv.rn_3485 + x) * scale;
					rn_768.rn_3486 = (rn_772.y + rn_772.cv.rn_3486) * scale;
					rn_768.rn_3487 = rn_772.cv.rn_3487 * scale;
					rn_768.rn_3488 = rn_772.cv.rn_3488 * scale;
					rn_769 = rn_772.cv;
				} else {
					rn_769 = null;
				}
				if (rn_769 != null) {
					if (rn_768.rn_3498(tx, ty)) {
						rn_769.rn_3490 = rn_761;
						rn_769.rn_3491 = rn_760;
					} else {
						rn_769.rn_3490 = false;
						rn_769.rn_3491 = false;
					}
				}
			}
		}
		for (int rn_10294 = 0;rn_10294 < RectaList.rn_1021(judarea);rn_10294 += 1) {
			Detrect rn_773 = RectaList.rn_4080(judarea, rn_10294);
			if (rn_766 == false) {
				if (rn_773.rn_4039(rn_767)) {
					rn_766 = true;
					if (rn_8652.rn_8654(rn_758) == rn_8645.rn_8648) {
						if (rn_773.rn_4034(rn_767)) {
							rn_773.rn_4045(rn_767);
						} else {
							rn_773.rn_4042(rn_767, "up");
						}
						judarea.rn_4109 = "";
					} else {
						if (rn_3081.rn_6682(judarea.rn_4109, rn_773.rn_4015)) {
							rn_773.rn_4042(rn_767, "move");
						} else {
							if (rn_3081.rn_6684(judarea.rn_4109, "")) {
								judarea.rn_4110(judarea.rn_4109).rn_4042(rn_767, "up");
							}
							rn_773.rn_4016 = rn_9915.rn_9921();
							rn_773.rn_4017 = rn_767;
							rn_773.rn_4042(rn_767, "down");
							judarea.rn_4109 = rn_773.rn_4015;
						}
					}
				}
			}
		}
		if (rn_766 == false && rn_3081.rn_6684(judarea.rn_4109, "")) {
			judarea.rn_4110(judarea.rn_4109).rn_4042(rn_767, "up");
			judarea.rn_4109 = "";
		}
		} catch (Exception e) {;
		};
	}

	public final int getOzeki(int rn_774) {
		int rn_775 = getsLevel(rn_774);
		int rn_776 = (rn_774 - rn_775) / 10 + 1;
		return rn_776;
	}

	public final int getsLevel(int rn_777) {
		int rn_778 = rn_777 % 10;
		if (rn_778 == 0) {
			rn_778 = 10;
		}
		return rn_778;
	}

	public final String levelname() {
		int rn_779 = getsLevel(level);
		int rn_780 = getOzeki(level);
		return rn_4266.rn_4279(gametext, "LEVEL") + rn_780 + "-" + rn_779;
	}

	public final void write(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_781, String rn_782, int rn_783, int rn_784, int rn_785, float rn_786, float rn_787, float rn_788) {
		android.graphics.Paint rn_789 = Paint_.rn_1533(Paint_.rn_1530(Paint_.rn_1528(Paint_.rn_1526(), textfont), (int) (rn_786 * scale)), -16777216);
		BitmapFontData_.rn_4006(BitmapFont_.rn_3989(font1), rn_786 * scale / 32);
		BitmapFont_.rn_3990(font1, Color_.rn_3900(ope.rn_1792(rn_785)));
		BitmapFont_.rn_3999(font1, rn_781, rn_782, (int) (rn_783 * scale + Paint_.rn_1536(rn_789, rn_782) * rn_787), (int) (height - (rn_784 * scale + rn_788 * rn_786)));
		ShaderProgram_.rn_3949(rgbShader, "u_opacity", 1);
		ShaderProgram_.rn_3938(rgbShader, "u_rgbFactors", 1, 1, 1);
	}

	public final void write3stroke(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_790, String rn_791, int rn_792, int rn_793, int rn_794, int rn_795, float rn_796, float rn_797, float rn_798, int rn_799, int rn_800) {
		write(rn_790, rn_791, rn_792 + rn_799, rn_793 + rn_800, rn_795, rn_796, rn_797, rn_798);
		write(rn_790, rn_791, rn_792, rn_793, rn_794, rn_796, rn_797, rn_798);
	}

	public final float getLoadingProc() {
		float rn_801 = 0.0F;
		if (rn_3081.rn_6682(loadproc.rn_2863, "reanim")) {
		} else if (rn_3081.rn_6682(loadproc.rn_2863, "image")) {
			return 0.0F;
		} else if (rn_3081.rn_6682(loadproc.rn_2863, "anim")) {
			rn_801 = rn_801 + 0.5F;
		}
		if (loadproc.rn_2862 != 0) {
			rn_801 = rn_801 + loadproc.rn_2861 * 0.5F / loadproc.rn_2862;
		}
		return rn_801;
	}

	public final float center(float rn_802) {
		return (width - rn_802) / 2;
	}

	public final boolean couldPlant(int rn_803, int rn_804) {
		if (level == 1 && rn_804 != 2) {
			return false;
		} else if (level == 2 && (rn_804 != 1 || rn_804 != 2 || rn_804 != 3)) {
			return false;
		} else if (rn_803 < 0 || rn_803 >= 9 || rn_804 < 0 || rn_804 >= getRowNumber()) {
			return false;
		}
		return true;
	}

	public final void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_805, DrawStyle rn_806, float rn_807) {
		Anim rn_808 = rn_806.rn_3605;
		for (int rn_10295 = 0;rn_10295 < Reanimed.rn_1021(rn_808.rean);rn_10295 += 1) {
			drawanim(rn_805, rn_806.rn_3605, rn_808.frame, Reanimed.rn_3138((rn_808.rean), rn_10295), rn_806.rn_3613, rn_806.rn_3614, rn_806.rn_3608, rn_806.rn_3609, 0, rn_806.rn_3606, rn_806.rn_3607, rn_10295, rn_807, rn_806.rn_3610, rn_806.rn_3611, rn_806.rn_3615);
			Anim rn_809 = (rn_808.panims).rn_3206(rn_10295);
			if (rn_809 != null) {
				DrawStyle rn_810 = new DrawStyle();
				POS_int rn_811 = rn_808.rn_3340(rn_808.frame, rn_10295);
				POS rn_812 = rn_811.rn_3620;
				rn_810.rn_3605 = rn_809;
				rn_810.rn_3606 = rn_812.rn_3052;
				rn_810.rn_3607 = rn_812.rn_3053;
				rn_810.rn_3608 = rn_812.rn_3054;
				rn_810.rn_3609 = rn_812.rn_3055;
				rn_810.rn_3613 = rn_812.rn_3050;
				rn_810.rn_3614 = rn_812.rn_3051;
				if ((rn_808.panims.isDbanim).rn_996(rn_808.panims.rn_3208(rn_10295))) {
					rn_810.rn_3616(rn_806);
					POS rn_813 = rn_808.panims.rn_3210(rn_10295);
					dst.rn_3613 = rn_813.rn_3050;
					dst.rn_3614 = rn_813.rn_3051;
					dst.rn_3606 = rn_813.rn_3052;
					dst.rn_3607 = rn_813.rn_3053;
					dst.rn_3608 = rn_813.rn_3054;
					dst.rn_3609 = rn_813.rn_3055;
					rn_810.rn_3616(dst);
					rn_810.rn_3610 = rn_813.rn_3059;
					rn_810.rn_3611 = rn_813.rn_3060;
					ope.rn_1796(rn_813);
					rn_810.rn_3615 = rn_806.rn_3615;
				}
				draw(rn_805, rn_810, rn_807);
				ope.rn_1796(rn_810);
				ope.rn_1796(rn_811);
				ope.rn_1796(rn_812);
				ope.rn_1796(dst);
			}
		}
		if (rn_808.ForcedEvolutionFrame != -1) {
			rn_808.ForcedEvolutionProc = rn_808.ForcedEvolutionProc + rn_808.speed * rn_808.rn_3307() * rn_807 * speed;
			if (rn_808.ForcedEvolutionProc >= rn_808.ForcedEvolutionTime) {
				rn_808.frame = rn_808.ForcedEvolutionFrame;
				rn_808.ForcedEvolutionFrame = -1;
				rn_808.ForcedEvolutionTime = -1.0F;
				rn_808.ForcedEvolutionProc = -1.0F;
				rn_808.update = true;
			}
		} else {
			if (rn_808.pause == false) {
				rn_808.frame = rn_808.frame + rn_808.speed * rn_808.rn_3307() * rn_807 * speed;
				if (rn_808.frame + 1 + rn_808.speed * rn_807 * speed >= rn_808.maxframe) {
					if (rn_808.pauseAfterBroadcasting) {
						rn_808.pause = true;
						rn_808.frame = rn_808.maxframe - 1;
					}
				}
				if (rn_808.frame + 1 + rn_808.speed * rn_808.rn_3307() * rn_807 * speed >= rn_808.maxframe) {
					if (rn_3081.rn_6684(rn_808.animReturn, "")) {
						rn_808.rn_3366(rn_808.animReturn, false);
						rn_808.animReturn = "";
						rn_808.hasReplay = true;
					} else if (rn_808.pauseAfterBroadcasting == false) {
						rn_808.frame = rn_808.startframe;
						rn_808.update = true;
					}
				}
			}
		}
		ope.rn_1796(rn_806);
	}
	public int buildtime = 0;
	public long nullait = 0L;
	public long nullnbt = 0L;

	public final POS drawanim(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_814, Anim rn_815, float rn_816, Reanim rn_817, float rn_818, float rn_819, float rn_820, float rn_821, int rn_822, float rn_823, float rn_824, int rn_825, float rn_826, float rn_827, float rn_828, android.graphics.Matrix rn_829) {
		nullnbt = nullnbt + 1;
		rn_822 = rn_822;
		POS_int rn_830 = rn_815.rn_3340(rn_816, rn_825);
		POS rn_831 = rn_830.rn_3618;
		POS rn_832 = rn_830.rn_3620;
		int rn_833 = rn_830.rn_3621;
		if (rn_815.rn_3351(rn_825, rn_833) == -1) {
			return null;
		}
		if (rn_3081.rn_6682(rn_831.rn_3058, "")) {
			return null;
		}
		rn_817.rn_2902 = resall.rn_3133(rn_831.rn_3058).rn_3453();
		com.badlogic.gdx.graphics.Texture rn_834 = rn_817.rn_2902.rn_1941(1, 1, 0);
		com.badlogic.gdx.graphics.Color rn_835 = Color_.rn_3902(1, 1, 1, 1);
		Renderinfo rn_836 = RenderinfoList.rn_3278((rn_815.RenderValue), rn_825);
		if (rn_836.rn_3243) {
			float[] rn_837 = rn_836.rn_3253();
			float[] rn_838 = rn_837;
			if (rn_835 == null) {
				rn_835 = Color_.rn_3902(1, 1, 1, 1);
				buildtime = buildtime + 1;
			}
			Color_.rn_3909(rn_835, rn_838 [0], rn_838 [1], rn_838 [2], rn_838 [3]);
			rn_836.rn_3238 = rn_836.rn_3238 - rn_815.speed * rn_826;
		}
		if (rn_3081.rn_6684(rn_836.rn_3239, "")) {
			rn_834 = resall.rn_3133(rn_836.rn_3239).rn_3453().rn_1941(1, 1, 0);
		}
		float[] rn_839 = rn_836.rn_3253();
		浮光掠影(rn_814, rn_834, x * scale + rn_818 * scale, y * scale + rn_819 * scale, (rn_832.rn_3052 * rn_823) * scale, (rn_832.rn_3053 * rn_824) * scale, rn_832.rn_3054, rn_832.rn_3055, -1, rn_839, rn_820, rn_821, x * scale + rn_818 * scale + rn_827, y * scale + rn_819 * scale + rn_828, rn_817.rn_2902.rn_1892, rn_817.rn_2902.rn_1893, rn_829, rn_832.rn_3050 * scale * rn_823, rn_832.rn_3051 * scale * rn_824);
		ope.rn_1796(rn_830);
		ope.rn_1796(rn_831);
		ope.rn_1796(rn_832);
		ope.rn_1796(rn_834);
		ope.rn_1796(rn_835);
		return null;
	}

	public final int gridWidth() {
		return 80;
	}
	public android.graphics.Matrix matrix = Matrix_.rn_3395();
	public android.graphics.Paint paint_ = null;

	public final Object 浮光掠影(com.badlogic.gdx.graphics.g2d.SpriteBatch rn_840, com.badlogic.gdx.graphics.Texture rn_841, float rn_842, float rn_843, float rn_844, float rn_845, float rn_846, float rn_847, int rn_848, float[] rn_849, float rn_850, float rn_851, float rn_852, float rn_853, int rn_854, int rn_855, android.graphics.Matrix rn_856, float rn_857, float rn_858) {
		rn_840 = rn_840;
		rn_848 = rn_848;
		rn_854 = rn_854;
		rn_855 = rn_855;
		if (matrix == null) {
			matrix = Matrix_.rn_3395();
		} else {
			matrix.reset();
		}
		float[] rn_859 = new float[0];
		if (rn_856 != null) {
			rn_859 = Matrix_.rn_3398(rn_856);
			rn_859 [2] = rn_859 [2] * scale;
			rn_859 [5] = rn_859 [5] * scale;
			rn_856 = Matrix_.rn_3395();
			rn_856.setValues(rn_859);
		}
		if (paint_ == null) {
			paint_ = Paint_.rn_1526();
			paint_.setFilterBitmap(true);
		}
		float rn_860 = rn_847 - rn_846;
		float rn_861 = op.rn_1038(rn_7149.rn_7188(360 - rn_860));
		Matrix_.rn_3406(matrix, rn_844, rn_845, 0, 0);
		float rn_862 = op.rn_1038(rn_7149.rn_7154(rn_861));
		float rn_863 = op.rn_1038(rn_7149.rn_7166(rn_861));
		Matrix_.rn_3406(matrix, 1.0F, rn_862, 0, 0);
		Matrix_.rn_3414(matrix, rn_863, 0, 0, 0);
		Matrix_.rn_3400(matrix, rn_846, 0, 0);
		Matrix_.rn_3422(matrix, rn_857, rn_858);
		if (rn_856 != null) {
			matrix.postConcat(rn_856);
		}
		Matrix_.rn_3422(matrix, rn_842, rn_843);
		Matrix_.rn_3400(matrix, (rn_850 + rn_851) / 2, rn_852, rn_853);
		
		if (rn_849 == null) {
		} else {
			SpriteBatch.rn_3866(screen, rn_841, matrix, rn_849, height, Nirvana.this, false);
		}
		ope.rn_1796(rn_841);
		ope.rn_1796(matrix);
		return null;
	}

	public final void initLawnString() {
		String rn_864 = rn_9755.rn_9795("/storage/emulated/0/.pvz/main/properties/LawnStrings.txt", "GB2312");
		String rn_865 = "";
		String rn_866 = "";
		String rn_867 = "wait";
		boolean rn_868 = false;
		String rn_869 = "";
		for (int rn_10296 = 0;rn_10296 < rn_6677.rn_1021(rn_864);rn_10296 += 1) {
			rn_865 = rn_3081.rn_6719(rn_864, rn_10296, rn_10296);
			if (rn_3081.rn_6682(rn_867, "wait")) {
				if (rn_3081.rn_6682(rn_865, "[")) {
					rn_867 = "name";
					rn_866 = "";
				}
			} else if (rn_3081.rn_6682(rn_867, "name") && rn_3081.rn_6682(rn_865, "]")) {
				rn_869 = rn_866;
				rn_866 = "";
				rn_867 = "text";
			} else {
				if (rn_3081.rn_6682(rn_865, "\n")) {
					if (rn_3081.rn_6684(rn_866, "")) {
						if (rn_3081.rn_6682(rn_867, "text")) {
							if (rn_868) {
								rn_4266.rn_4274(gametext, rn_869, rn_866);
								rn_866 = "";
								rn_867 = "wait";
							} else {
								rn_868 = true;
							}
						}
					}
				} else {
					if (rn_868) {
						if (rn_3081.rn_6682(rn_867, "text")) {
							rn_865 = "\n" + rn_865;
						}
						rn_868 = false;
					}
					rn_866 = rn_866 + rn_865;
				}
			}
		}
	}

	public final void initilize() {
		String[] rn_870 = op.rn_1177(new String[][]{rn_9755.rn_9845("/storage/emulated/0/.pvz/pvz/reanim/"), rn_9755.rn_9845("/storage/emulated/0/.pvz/main/reanim/")});
		loadproc.rn_2863 = "reanim";
		for (int rn_10297 = 0;rn_10297 < rn_870.length;rn_10297 += 1) {
			if (rn_3081.rn_6696(rn_870 [rn_10297], ".jpg") || rn_3081.rn_6696(rn_870 [rn_10297], ".png")) {
				String_Nlimagesm.rn_3123(resall, "IMAGE_REANIM_" + rn_9755.rn_9767(rn_9755.rn_9769(rn_3081.rn_6711(rn_870 [rn_10297]))), Nirvana.loadPic("", rn_870 [rn_10297]));
				loadproc = new Stringk(rn_4133.rn_6675(("索引资源:" + rn_6760.rn_6765((rn_10297 + 1)) + "/" + rn_870.length)) + "  " + rn_9755.rn_9767(rn_9755.rn_9769(rn_870 [rn_10297])));
				loadproc.rn_2861 = (rn_10297 + 1);
				loadproc.rn_2862 = rn_870.length;
			}
		}
		loadproc = new Stringk("加载动画");
		REANIM = reanims.rn_2880(loadproc, Nirvana.this);
		loadfinish = true;
	}

	public static final Nlimage loadPic(String rn_871, String rn_872) {
		String rn_873 = rn_872 + rn_871;
		if (rn_9755.rn_9791(rn_873 + ".jpg")) {
			rn_873 = rn_873 + ".jpg";
		} else if (rn_9755.rn_9791(rn_873 + ".png")) {
			rn_873 = rn_873 + ".png";
		}
		Nlimage rn_874 = new Nlimage();
		rn_874.rn_3451 = rn_873;
		if (rn_3081.rn_6696(rn_873, "jpg")) {
			for (int rn_10298 = 0;rn_10298 < rn_874.rn_1891.length;rn_10298 += 1) {
				if ((rn_874.rn_1891) [rn_10298] == -16777216) {
					(rn_874.rn_1891) [rn_10298] = 0;
				}
			}
		}
		return rn_874;
	}

	public final void updateScene(int rn_875) {
		ope.rn_1796(animess);
		animess = new java.util.ArrayList<Anim>();
		scrtype = rn_875;
		animproc = 0;
		if (rn_875 == 0) {
			initilize();
		} else if (rn_875 == 1) {
			Anim rn_876 = Anim.rn_3310("SelectorScreen", Nirvana.this).rn_3366("anim_open", false);
			rn_876.pauseAfterBroadcasting = true;
			rn_876.rn_3360(new String[]{"SelectorScreen_Adventure_button", "SelectorScreen_Adventure_shadow"}, -1, false);
			Animed.rn_3177(animess, rn_876);
			for (int rn_10299 = 0;rn_10299 < 7;rn_10299 += 1) {
				if (rn_10299 != 3) {
					Anim rn_877 = Anim.rn_3310("SelectorScreen", Nirvana.this).rn_3366("anim_cloud" + rn_10299, false);
					rn_877.speed = rn_877.speed / ope.rn_1684(48, 64);
					rn_877.frame = ope.rn_1684(rn_877.startframe, rn_877.maxframe - 1);
					Animed.rn_3169(animess, 0).rn_3326("Cloud" + rn_10299, rn_877, new POS(), false);
				}
			}
			Detrect rn_878 = Detrect.rn_4018(410, 81, 410, 160, 730, 200, 735, 100);
			rn_878.rn_4015 = "冒险模式";
			RectaList.rn_4088(judarea, rn_878);
			rn_878.rn_4042_s(new bk.pvz.Detrect.rn_4042_r() {
				@Override
				public void dispatch(Point rn_880, String rn_881) {
					if (rn_3081.rn_6684(state, "advent")) {
						if (rn_3081.rn_6682(rn_881, "down")) {
							judarea.rn_4109 = rn_878.rn_4015;
							if (UserdataList.rn_2785(USER.account, USER.currentAccount).alevel < 0) {
								Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_StartAdventure_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_StartAdventure_Highlight"));
							} else {
								Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_Adventure_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_Adventure_highlight"));
							}
						} else if (rn_3081.rn_6682(rn_881, "move")) {
						} else if (rn_3081.rn_6682(rn_881, "up")) {
							judarea.rn_4109 = "";
							if (UserdataList.rn_2785(USER.account, USER.currentAccount).alevel < 0) {
								Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_StartAdventure_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_StartAdventure_Button1"));
							} else {
								Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_Adventure_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_Adventure_button"));
							}
						}
					}
				}
			});
			rn_878.rn_4045_s(new bk.pvz.Detrect.rn_4045_r() {
				@Override
				public void dispatch(Point rn_883) {
					if (rn_3081.rn_6684(state, "advent") && rn_3081.rn_6684(state, "none")) {
						rn_878.rn_4042(rn_883, "up");
						Anim rn_884 = Anim.rn_3310("Zombie_hand", Nirvana.this);
						rn_884.pauseAfterBroadcasting = true;
						Animed.rn_3177(animess, rn_884);
						state = "advent";
					}
				}
			});
			Detrect rn_885 = Detrect.rn_4018(410, 170, 410, 250, 710, 305, 725, 220);
			rn_885.rn_4015 = "迷你游戏";
			RectaList.rn_4088(judarea, rn_885);
			rn_885.rn_4042_s(new bk.pvz.Detrect.rn_4042_r() {
				@Override
				public void dispatch(Point rn_887, String rn_888) {
					if (rn_3081.rn_6682(rn_888, "down")) {
						judarea.rn_4109 = rn_885.rn_4015;
						Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_Survival_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_Survival_highlight"));
					} else if (rn_3081.rn_6682(rn_888, "move")) {
					} else if (rn_3081.rn_6682(rn_888, "up")) {
						judarea.rn_4109 = "";
						Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_Survival_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_Survival_button"));
					}
				}
			});
			rn_885.rn_4045_s(new bk.pvz.Detrect.rn_4045_r() {
				@Override
				public void dispatch(Point rn_890) {
					rn_885.rn_4042(rn_890, "up");
				}
			});
			Detrect rn_891 = Detrect.rn_4018(415, 260, 415, 320, 680, 380, 700, 310);
			rn_891.rn_4015 = "益智模式";
			RectaList.rn_4088(judarea, rn_891);
			rn_891.rn_4042_s(new bk.pvz.Detrect.rn_4042_r() {
				@Override
				public void dispatch(Point rn_893, String rn_894) {
					if (rn_3081.rn_6682(rn_894, "down")) {
						judarea.rn_4109 = rn_891.rn_4015;
						Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_Challenges_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_Challenges_highlight"));
					} else if (rn_3081.rn_6682(rn_894, "move")) {
					} else if (rn_3081.rn_6682(rn_894, "up")) {
						judarea.rn_4109 = "";
						Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_Challenges_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_Challenges_button"));
					}
				}
			});
			rn_891.rn_4045_s(new bk.pvz.Detrect.rn_4045_r() {
				@Override
				public void dispatch(Point rn_896) {
					rn_891.rn_4042(rn_896, "up");
				}
			});
			Detrect rn_897 = Detrect.rn_4018(420, 330, 420, 385, 665, 450, 680, 385);
			rn_897.rn_4015 = "生存模式";
			RectaList.rn_4088(judarea, rn_897);
			rn_897.rn_4042_s(new bk.pvz.Detrect.rn_4042_r() {
				@Override
				public void dispatch(Point rn_899, String rn_900) {
					if (rn_3081.rn_6682(rn_900, "down")) {
						judarea.rn_4109 = rn_897.rn_4015;
						Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_ZenGarden_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_Vasebreaker_highlight"));
					} else if (rn_3081.rn_6682(rn_900, "move")) {
					} else if (rn_3081.rn_6682(rn_900, "up")) {
						judarea.rn_4109 = "";
						Animed.rn_3169(animess, 0).rn_3333("SelectorScreen_ZenGarden_button", "IMAGE_REANIM_" + rn_3081.rn_6711("SelectorScreen_Vasebreaker_button"));
					}
				}
			});
			rn_897.rn_4045_s(new bk.pvz.Detrect.rn_4045_r() {
				@Override
				public void dispatch(Point rn_902) {
					rn_897.rn_4042(rn_902, "up");
				}
			});
			if (USER.accountNumber == 0) {
			} else {
				login(false);
			}
		} else if (rn_875 == 2) {
			sdoffy = -87;
			int rn_903 = UserdataList.rn_2769((USER.account), USER.currentAccount).alevel;
			if (rn_903 == -1) {
				initLevel(1, 0);
			} else {
				initLevel(rn_903, 0);
			}
		} else if (rn_875 == 7) {
			int rn_904 = UserdataList.rn_2769((USER.account), USER.currentAccount).alevel;
			if (rn_904 == -1) {
				initLevel(0, 0);
			} else {
				initLevel(rn_904, 0);
			}
		}
	}

	public final void addwave() {
		zombiecount = 0;
		procf = 1.0F;
		XMLR rn_905 = XMLRED.rn_2990((levels.rn_2811("PVZ").rn_2819("id", getlevelname(level, leveltype)).rn_2804), wave);
		int rn_906 = rn_3081.rn_6726(rn_905.rn_2817("points"), 10);
		int[] rn_907 = getzombie(rn_905.rn_2817("mustHaveZombies"));
		for (int rn_10300 = 0;rn_10300 < rn_907.length;rn_10300 += 1) {
			ZombieList.rn_2157(zombieList, Zombie.create(Nirvana.this, rn_907 [rn_10300], getRightWay()));
			zombiecount = zombiecount + 1;
		}
		for (int rn_10301 = 0;rn_10301 < 10;rn_10301 += 1) {
			rn_10301 = 1;
			if (rn_906 <= 1) {
				break;
			}
			ints rn_908 = new ints();
			ints rn_909 = new ints();
			int[] rn_910 = getzombie(getwaveinfo().rn_2817("allowedZombies"));
			for (int rn_10302 = 0;rn_10302 < rn_910.length;rn_10302 += 1) {
				if (rn_3081.rn_6726(getzv(rn_910 [rn_10302], "p"), 10) <= rn_906) {
					rn_908.rn_1286(rn_910 [rn_10302]);
					float rn_911 = rn_3081.rn_6731(getzv(rn_910 [rn_10302], "s"));
					float rn_912 = rn_3081.rn_6731(getzv(rn_910 [rn_10302], "e"));
					rn_909.rn_1286((int) (rn_911 + (rn_912 - rn_911) * (wave * 1.0F / wavemax)));
				}
			}
			int rn_913 = 0;
			for (int rn_10303 = 0;rn_10303 < rn_909.rn_1021();rn_10303 += 1) {
				rn_913 = rn_913 + rn_909.rn_1281(rn_10303);
			}
			int rn_914 = rn_7149.rn_7160(0, rn_913);
			for (int rn_10304 = 0;rn_10304 < rn_908.rn_1021();rn_10304 += 1) {
				if (rn_914 < rn_909.rn_1281(rn_10304)) {
					ZombieList.rn_2157(zombieList, Zombie.create(Nirvana.this, rn_908.rn_1281(rn_10304), getRightWay()));
					zombiecount = zombiecount + 1;
					rn_906 = rn_906 - rn_3081.rn_6726(getzv(rn_908.rn_1281(rn_10304), "p"), 10);
					break;
				}
			}
		}
		if (rn_3081.rn_6682(rn_905.rn_2817("flag"), "1")) {
			ZombieList.rn_2157(zombieList, Zombie.create(Nirvana.this, 1, getRightWay()));
		}
		wave = wave + 1;
	}

	public final String getzv(int rn_915, String rn_916) {
		return ((config).rn_2811("Zombie")).rn_2811(rn_6760.rn_6765(rn_915)).rn_2817(rn_916);
	}

	public final void Update() {
		String rn_918 = "";
		if (captionscd > 0) {
			captionscd = captionscd - 1;
		}
		if (scrtype == 5) {
			XMLR rn_919 = (config).rn_2811("image").rn_2811("logo");
			float rn_920 = rn_3081.rn_6731(rn_919.rn_2817("1time"));
			float rn_921 = rn_3081.rn_6731(rn_919.rn_2817("2time"));
			float rn_922 = rn_3081.rn_6731(rn_919.rn_2817("3time"));
			float rn_923 = rn_3081.rn_6731(rn_919.rn_2817("exchangeTime"));
			if (animproc < rn_920) {
				transp = animproc / rn_920;
			} else if (animproc > rn_923) {
				updateScene(0);
			} else if (animproc >= rn_922) {
				transp = 0;
			} else if (animproc > rn_921) {
				transp = (rn_922 - animproc) / (rn_922 - rn_921);
			}
		} else if (scrtype == 0) {
			Rectx rn_924 = trirect.rn_3530("start_botton");
			if (rn_924 != null) {
				if (rn_924.rn_3490) {
				} else if (rn_924.rn_3491) {
					if (getLoadingProc() == 1.0F) {
						updateScene(1);
					} else {
						rn_924.rn_3491 = false;
					}
				}
			}
		} else if (scrtype == 7 || scrtype == 2) {
			if (procf > 0.0F) {
				procf = procf - 0.01F;
			} else {
				procf = 0.0F;
			}
			animproc = animproc + 1;
			if (proc == 0 && animproc >= 100) {
				proc = 1;
				animproc = 0;
			} else if (proc == 1) {
				x = x + ope.rn_1687(0, -601, 200, animproc);
				if (x <= -600) {
					chooseCard();
					proc = 2;
					animproc = 0;
				}
			} else if (proc == 2) {
				if (ccend && animproc >= 100) {
					csint = csint - 17.5F;
					if (csint <= -513.0F) {
						animproc = 0;
						proc = 3;
					}
				} else if (rn_3081.rn_6682(state, "none")) {
					if (ccend) {
						if (animproc >= 100) {
							state = "skipc";
							proc = 8;
						}
					} else {
						csint = csint + 17.5F;
						if (sdoffy < 0) {
							sdoffy = sdoffy + 3.0F;
						}
						if (sdoffy >= 0) {
							sdoffy = 0;
						}
						if (csint >= 513.0F) {
							csint = 513.0F;
							state = "choose";
						}
					}
				} else if (rn_3081.rn_6682(state, "choose")) {
				} else if (rn_3081.rn_6682(state, "start")) {
				}
			} else if (proc == 3) {
				x = x + ope.rn_1687(0, (600 - 217) + 1, 150, animproc);
				if (x >= -217.0F) {
					if (level == 1) {
						Anim rn_925 = Anim.rn_3310("SodRoll", Nirvana.this);
						rn_925.pauseAfterBroadcasting = true;
						DrawStyle rn_926 = new DrawStyle();
						rn_926.rn_3605 = rn_925;
						rn_926.rn_3606 = 1;
						rn_926.rn_3607 = 1;
						rn_926.rn_3608 = 0;
						rn_926.rn_3609 = 0;
						rn_926.rn_3612 = -1;
						rn_926.rn_3613 = 220;
						rn_926.rn_3614 = 5;
						rn_926.rn_3615 = null;
						DrawStyles.rn_3584(foreds, rn_926);
						ParticleList.rn_2313(particleList, Particle.rn_2665("SodRoll", 220, 280, -1, Nirvana.this));
						proc = 9;
					} else if (level == 2 || level == 3) {
						proc = 10;
					} else if (rn_3081.rn_6682(state, "start")) {
						PreMower();
						proc = 12;
					} else {
						proc = 8;
					}
					animproc = 0;
				}
			} else if (proc == 4) {
				if (animproc >= 200) {
					addwave();
					proc = 5;
					animproc = 0;
				}
			} else if (proc == 5) {
				if (animproc >= 3000 || ZombieList.rn_1021(zombieList) * 3 <= zombiecount) {
					addwave();
					if (wave == wavemax) {
						proc = 6;
					}
					animproc = 0;
				}
			} else if (proc == 6) {
				if (ZombieList.rn_1021(zombieList) == 0) {
					plantwin();
					proc = 11;
				}
			} else if (proc == 7) {
				if (animproc >= inapptime) {
					if (level == 1) {
					} else {
						proc = 4;
					}
				}
			} else if (proc == 8) {
				sdoffy = sdoffy + 3.0F;
				if (sdoffy >= 0) {
					sdoffy = 0;
					animproc = 0;
					PreMower();
					proc = 12;
				}
			} else if (proc == 9) {
				animproc = animproc + 3;
				if (animproc >= 771) {
					DrawStyles.rn_3598(foreds);
					ParticleList.rn_2327(particleList);
					proc = 8;
					animproc = 0;
				}
			} else if (proc == 10) {
				animproc = animproc + 2;
				if (animproc >= 771) {
					proc = 8;
					animproc = 0;
				}
			} else if (proc == 11) {
			} else if (proc == 12) {
				for (int rn_10305 = 0;rn_10305 < MowerList.rn_1021(mowerList.rn_2334);rn_10305 += 1) {
					Mower rn_927 = MowerList.rn_2378(mowerList.rn_2334, rn_10305);
					rn_927.rn_2391 = rn_927.rn_2391 + ope.rn_1687(130, 190, 50, animproc + rn_927.rn_2395 * 10 - 80);
				}
				if (animproc >= 150) {
					ZombieList.rn_2171(zombieList);
					for (int rn_10306 = 0;rn_10306 < 5;rn_10306 += 1) {
					}
					for (int rn_10307 = 0;rn_10307 < 5;rn_10307 += 1) {
					}
					for (int rn_10308 = 0;rn_10308 < 3;rn_10308 += 1) {
						for (int rn_10309 = 0;rn_10309 < 5;rn_10309 += 1) {
						}
					}
					if (level == 1) {
						canshedsun = false;
						captions("ADVICE_CLICK_SEED_PACKET", -1);
						state = "cp";
					}
					proc = 7;
				}
			}
			if (canDropSun()) {
				sunapp = sunapp - 1;
				if (sunapp <= 0) {
					sunapp = sunappmax;
					Coin rn_928 = Coin.rn_2601(Nirvana.this, static_.rn_2618, rn_7149.rn_7160(400, 800), 50);
					rn_928.rn_2585 = 0.5F;
					rn_928.rn_2593 = rn_7149.rn_7160(200, 500);
					CoinList.rn_2251(coinlist, rn_928);
					if (rn_3081.rn_6682(state, "ep")) {
						sunapp = 500;
						captions("ADVICE_CLICK_ON_SUN", -1);
					}
				}
			}
		}
		for (int rn_10310 = 0;rn_10310 < card_cool.length;rn_10310 += 1) {
			if (card_cool [rn_10310] > 0) {
				card_cool [rn_10310] = card_cool [rn_10310] - 1;
			}
		}
		long rn_929 = rn_9915.rn_9921();
		long rn_930 = 0L;
		for (int rn_10311 = 0;rn_10311 < ZombieList.rn_1021(zombieList);rn_10311 += 1) {
			int rn_931 = ZombieList.rn_1021(zombieList) - rn_10311 - 1;
			Zombie rn_932 = ZombieList.rn_2149(zombieList, rn_931);
			if (rn_932.Frost > 0) {
				rn_932.Frost = rn_932.Frost - 1;
			} else if (rn_932.Coldness > 0) {
				rn_932.anim.speedslows = 0.5F;
				rn_932.Coldness = rn_932.Coldness - 1;
				if (rn_932.disc) {
					if (ZombieList.rn_2149(zombieList, rn_931).Update()) {
						ope.rn_1796(ZombieList.rn_2149(zombieList, rn_931));
						ZombieList.rn_2172(zombieList, rn_931);
					}
					rn_932.disc = false;
				} else {
					rn_932.disc = true;
				}
			} else {
				if (ZombieList.rn_2149(zombieList, rn_931).Update()) {
					ope.rn_1796(ZombieList.rn_2149(zombieList, rn_931));
					ZombieList.rn_2172(zombieList, rn_931);
				}
			}
		}
		rn_930 = rn_9915.rn_9921();
		rn_918 = rn_918 + "uZombie:" + rn_6767.rn_6771((rn_930 - rn_929)) + "\n";
		rn_929 = rn_9915.rn_9921();
		for (int rn_10312 = 0;rn_10312 < PlantList.rn_1021(plantList);rn_10312 += 1) {
			int rn_933 = PlantList.rn_1021(plantList) - rn_10312 - 1;
			if (PlantList.rn_2181(plantList, rn_933).rn_2504()) {
				ope.rn_1796(PlantList.rn_2181(plantList, rn_933));
				PlantList.rn_2204(plantList, rn_933);
			}
		}
		rn_930 = rn_9915.rn_9921();
		rn_918 = rn_918 + "uPlant:" + rn_6767.rn_6771((rn_930 - rn_929)) + "\n";
		rn_929 = rn_9915.rn_9921();
		for (int rn_10313 = 0;rn_10313 < ProjList.rn_1021(projList);rn_10313 += 1) {
			int rn_934 = ProjList.rn_1021(projList) - rn_10313 - 1;
			if (ProjList.rn_2212(projList, rn_934).rn_2578()) {
				ope.rn_1796(ProjList.rn_2212(projList, rn_934));
				ProjList.rn_2235(projList, rn_934);
			}
		}
		rn_930 = rn_9915.rn_9921();
		rn_918 = rn_918 + "uProj:" + rn_6767.rn_6771((rn_930 - rn_929)) + "\n";
		rn_929 = rn_9915.rn_9921();
		for (int rn_10314 = 0;rn_10314 < CoinList.rn_1021(coinlist);rn_10314 += 1) {
			int rn_935 = CoinList.rn_1021(coinlist) - rn_10314 - 1;
			if (CoinList.rn_2243(coinlist, rn_935).rn_2614() == true) {
				ope.rn_1796(CoinList.rn_2243(coinlist, rn_935));
				CoinList.rn_2266(coinlist, rn_935);
			}
		}
		rn_930 = rn_9915.rn_9921();
		rn_918 = rn_918 + "uCoin:" + rn_6767.rn_6771((rn_930 - rn_929));
		rn_929 = rn_9915.rn_9921();
		for (int rn_10315 = 0;rn_10315 < TracleList.rn_1021(tracleList);rn_10315 += 1) {
			int rn_936 = TracleList.rn_1021(tracleList) - rn_10315 - 1;
			if (TracleList.rn_2274(tracleList, rn_936).rn_2651() == true) {
				ope.rn_1796(TracleList.rn_2274(tracleList, rn_936));
				TracleList.rn_2297(tracleList, rn_936);
			}
		}
		rn_930 = rn_9915.rn_9921();
		rn_929 = rn_9915.rn_9921();
		for (int rn_10316 = 0;rn_10316 < ParticleList.rn_1021(particleList);rn_10316 += 1) {
			int rn_937 = ParticleList.rn_1021(particleList) - rn_10316 - 1;
			if (ParticleList.rn_2305(particleList, rn_937).Update() == true) {
				ope.rn_1796(ParticleList.rn_2305(particleList, rn_937));
				ParticleList.rn_2328(particleList, rn_937);
			}
		}
		rn_930 = rn_9915.rn_9921();
		rn_929 = rn_9915.rn_9921();
		mowerList.rn_2344();
		if (sobj != -1) {
			cardev = cardev - 1;
			if (cardev <= 0) {
				sobj = -1;
			}
		}
		uinfo = rn_918;
		if (4 <= proc && proc <= 6) {
			if (savecount <= 0) {
				savecount = 100;
				Thread thread = new Thread(new Runnable() { public void run() {;
				rn_9755.rn_9798("/sdcard/.pvz/" + levelname() + ".json", ToJSON());
				}}); thread.start();
			} else {
				savecount = savecount - 1;
			}
		}
	}

	public final void collectSun(Coin rn_938) {
		rn_938 = rn_938;
		if (rn_3081.rn_6682(state, "ep")) {
			captions("ADVICE_CLICKED_ON_SUN", -1);
			state = "2p";
		} else if (rn_3081.rn_6682(state, "2p")) {
			captions("ADVICE_ENOUGH_SUN", -1);
			state = "bp";
		}
	}

	public final void chooseCard() {
		if (level <= 6) {
			cards = (int[]) (new int[level]);
			for (int rn_10317 = 0;rn_10317 < cards.length;rn_10317 += 1) {
				cards [rn_10317] = rn_10317;
			}
			ccend = true;
		} else {
			cards = (int[]) (new int[USER.getCurrentAccount().slotnumber]);
			for (int rn_10318 = 0;rn_10318 < cards.length;rn_10318 += 1) {
				cards [rn_10318] = -1;
			}
		}
	}

	public final void PreMower() {
		int[] rn_939 = getRowinfo();
		mowerList.initi(rn_939.length, rn_939, 130, Nirvana.this);
	}

	public final int[] getRowinfo() {
		if (scene == 0 || scene == 1) {
			if (level == 1) {
				return new int[]{-1, -1, 0, -1, -1};
			} else if (level == 2 || level == 3) {
				return new int[]{-1, 0, 0, 0, -1};
			} else {
				return new int[]{0, 0, 0, 0, 0};
			}
		} else if (scene == 2 || scene == 3) {
			return new int[]{0, 0, 1, 1, 0, 0};
		} else if (scene == 4 || scene == 5) {
			return new int[]{2, 2, 2, 2, 2};
		}
		return new int[]{0, 0, 0, 0, 0};
	}

	public final void captions(String rn_940, int rn_941) {
		captions = rn_4266.rn_4279(gametext, rn_940);
		captionscd = rn_941;
	}

	public final float gety(int rn_942, float rn_943) {
		int rn_944 = getRowHeight();
		if (scene == 2 || scene == 3) {
			return 80 + rn_944 + rn_942 * rn_944;
		} else if (scene == 4 || scene == 5) {
			if (rn_943 > 670) {
				return 80 + rn_944 + rn_942 * rn_944;
			} else {
				return 80 + rn_944 + (670 - rn_943) / 4.0F + rn_942 * rn_944;
			}
		} else {
			return 80 + rn_944 + rn_942 * rn_944;
		}
	}

	public final boolean canDropSun() {
		if (canshedsun && (scene == 0 || scene == 2 || scene == 4) && (4 <= proc && proc <= 7)) {
			return true;
		}
		return false;
	}

	public final int getRowNumber() {
		if (scene == 2 || scene == 3) {
			return 6;
		}
		return 5;
	}

	public final int getRowHeight() {
		if (2 <= scene && scene <= 5) {
			return 85;
		} else {
			return 100;
		}
	}

	public final int getRowWidth() {
		return 80;
	}

	public final void plantwin() {
		UserdataList.rn_2769((USER.account), USER.currentAccount).alevel = level + 1;
		saveArchive();
		CoinList.rn_2251(coinlist, Coin.rn_2601(Nirvana.this, static_.rn_2621, 900, 340));
	}

	public final void clearance(Coin rn_945) {
		rn_945 = rn_945;
	}

	public final int[] getAvailableRow() {
		if (level == 1) {
			return new int[]{2};
		} else if (level == 2 || level == 3) {
			return new int[]{1, 2, 3};
		} else {
			int rn_946 = getRowNumber();
			int[] rn_947 = (int[]) (new int[rn_946]);
			for (int rn_10319 = 0;rn_10319 < rn_947.length;rn_10319 += 1) {
				rn_947 [rn_10319] = rn_10319;
			}
			return rn_947;
		}
	}

	public final int[] availableRow() {
		int[] rn_948 = getAvailableRow();
		ints rn_949 = new ints();
		for (int rn_10320 = 0;rn_10320 < rn_948.length;rn_10320 += 1) {
			if (proline [rn_948 [rn_10320]] == 0) {
				rn_949.rn_1286(rn_948 [rn_10320]);
			}
		}
		return rn_949.rn_1305();
	}

	public final int getRightWay() {
		int[] rn_950 = availableRow();
		if (rn_950.length == 0) {
			rn_950 = getAvailableRow();
		}
		return rn_950 [rn_7149.rn_7160(0, rn_950.length - 1)];
	}

	public final boolean gamestart() {
		if (proc == 4 || proc == 5 || proc == 6 || proc == 7) {
			return true;
		}
		return false;
	}

	public final String ToJSON() {
		org.json.JSONObject rn_952 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_953 = rn_8084.rn_8126(rn_4133.rn_6676(Nirvana.this));
		for (int rn_10321 = 0;rn_10321 < rn_953.length;rn_10321 += 1) {
			java.lang.reflect.Field rn_954 = rn_953 [rn_10321];
			rn_954.setAccessible(true);
			Object rn_955 = rn_8150.rn_8165(rn_954, Nirvana.this);
			String classname = rn_8084.rn_8094(rn_8150.rn_8161(rn_954));
			if (rn_3081.rn_6682(classname, "int") || rn_3081.rn_6682(classname, "boolean") || rn_3081.rn_6682(classname, "float") || rn_3081.rn_6682(classname, "java.lang.String")) {
				rn_4577.rn_4607(rn_952, rn_8150.rn_7729(rn_954), rn_4133.rn_6675(rn_955));
			} else if (rn_3081.rn_6682(classname, "[I")) {
				int[] rn_956 = (int[]) ((int[]) (rn_955));
				rn_4577.rn_4607(rn_952, rn_8150.rn_7729(rn_954), op.rn_1191(rn_956));
			} else if (rn_3081.rn_6682(classname, "java.util.ArrayList")) {
				java.util.ArrayList<Object> rn_957 = (java.util.ArrayList<Object>) (rn_955);
				rn_4577.rn_4607(rn_952, rn_8150.rn_7729(rn_954), ope.rn_1698(rn_957));
			} else if (rn_3081.rn_6682(classname, "bk.pvz.CartSet")) {
				org.json.JSONObject rn_958 = rn_4577.rn_4578(rn_4133.rn_6675(rn_955));
				rn_4577.rn_4607(rn_952, rn_8150.rn_7729(rn_954), rn_958);
			}
		}
		return rn_4577.rn_4614(rn_952, 0);
	}

	public final void rn_959(String rn_960) {
		org.json.JSONObject rn_961 = rn_4577.rn_4578(rn_960);
		op.rn_1194(Nirvana.this, rn_961, Nirvana.this);
	}
}