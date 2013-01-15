package com.tempestgamers.deathmock.lib;

public class Sprites {
	//sprite locations
	public static final String SPRITE_SHEET_LOCATION = "/com/tempestgamers/deathmock/art/sprites/";
	public static final String ARMOR_SHEET_LOCATION = "/com/tempestgamers/deathmock/art/armor/";
    public static final String GUI_SHEET_LOCATION = "/com/tempestgamers/deathmock/art/gui/";

    public static final String ITEM_SPRITE_SHEET = "DMCC_items.png";
    public static final String BLOCK_SPRITE_SHEET = "DMCC_blocks.png";
    public static final String Item_Staff_Sprites = "DMCC_staff.png";
    
    public static final String PANALATOR_GUI_IMAGE = "Panalator.png";
    //public static final String CALCINATOR_MODEL_TEXTURE = "calcinator.png";
    //public static final String WORLD_TRANSMUTATION_TEXTURE = "noise.png";
	public static final String SINK_MODEL_TEXTURE = "sink.png";
	
	//the id in the spritesheed for the block
	public static final int BLUEALLOYBLOCKSPRITEID = 0;
	public static final int REDALLOYBLOCKSPRITEID = 1;
	public static final int BRASSBLOCK = 2;
	public static final int SILVERBLOCK = 3;
	
	//the id in the spritesheed for the item
	//maid outfit
	public static final int MAIDOUTFITHAT = 80;
	public static final int MAIDOUTFITTOP = 81;
	public static final int MAIDOUTFITPANTS = 82;
	public static final int MAIDOUTFITBOOTS = 83;
	//scythes
	public static final int ITEMWEAPONSCYTHESTONE = 0;
	public static final int ITEMWEAPONSCYTHEMARBLE = 1;
	public static final int ITEMWEAPONSCYTHEBASALT = 2;
	public static final int ITEMWEAPONSCYTHECOPPER= 3;
	public static final int ITEMWEAPONSCYTHEIRON = 4;
	public static final int ITEMWEAPONSCYTHEGOLD = 5;
	public static final int ITEMWEAPONSCYTHEDIAMOND = 6;
	public static final int ITEMWEAPONSCYTHEENDER = 7;
	public static final int ITEMWEAPONSCYTHESAPHIRE = 8;
	public static final int ITEMWEAPONSCYTHERUBY = 9;
	public static final int ITEMWEAPONSCYTHEEMERALD = 10;
	public static final int ITEMWEAPONSCYTHEDARKMATTER = 11;
	public static final int ITEMWEAPONSCYTHEREDMATTER = 12;
	//unused.9-15
	//hero outfit
	public static final int HEROOUTFITHAT = 96;
	public static final int HEROOUTFITTOP = 97;
	public static final int HEROOUTFITPANTS = 98;
	public static final int HEROOUTFITBOOTS = 99;
	//daggers
	public static final int ITEMWEAPONDAGGERSTONE = 16;
	public static final int ITEMWEAPONDAGGERMARBLE = 17;
	public static final int ITEMWEAPONDAGGERBASALT = 18;
	public static final int ITEMWEAPONDAGGERCOPPER = 19;
	public static final int ITEMWEAPONDAGGERIRON = 20;
	public static final int ITEMWEAPONDAGGERGOLD = 21;
	public static final int ITEMWEAPONDAGGERDIAMOND = 22;
	public static final int ITEMWEAPONDAGGERENDER = 23;
	public static final int ITEMWEAPONDAGGERSAPHIRE = 24;
	public static final int ITEMWEAPONDAGGERRUBY = 25;
	public static final int ITEMWEAPONDAGGEREMERALD = 26;
	public static final int ITEMWEAPONDAGGERDARKMATTER = 27;
	public static final int ITEMWEAPONDAGGERREDMATTER = 28;
	//unused 25-31
	//mario outfit
	public static final int MARIOOUTFITHAT = 112;
	public static final int MARIOOUTFITTOP = 113;
	public static final int MARIOOUTFITPANTS = 114;
	public static final int MARIOOUTFITBOOTS = 115;
	
	//STAFFS
	public static final int ITEMSTAFFWOOD = 16;
	public static final int ITEMSTAFFWATER = 17;
	public static final int ITEMSTAFFFIRE =  18	;
	public static final int ITEMSTAFFNATURE = 19;
	public static final int ITEMSTAFFBLOOD = 20	;
	public static final int ITEMSTAFFENDER = 21	;
	public static final int ITEMSTAFFEARTH = 22 ;
	public static final int ITEMSTAFFWIND = 23  ;
	
	
	public static final int[][] ITEMSTAFFWATER_EXP = 	setupSprites4x4(0);
	public static final int[][] ITEMSTAFFFIRE_EXP = 	setupSprites4x4(4);
	public static final int[][] ITEMSTAFFNATURE_EXP = 	setupSprites4x4(8);
	public static final int[][] ITEMSTAFFBLOOD_EXP = 	setupSprites4x4(12);
	public static final int[][] ITEMSTAFFENDER_EXP =    setupSprites4x4(64);
	public static final int[][] ITEMSTAFFEARTH_EXP =    setupSprites4x4(68);
	public static final int[][] ITEMSTAFFWIND_EXP =     setupSprites4x4(72);
	
	//location of the sprite for outfits.
	public static final String Maid_Outfit_1 = "maid_1.png";
	public static final String Maid_Outfit_2 = "maid_2.png";
	public static final String Hero_Outfit_1 = "hero_1.png";
	public static final String Hero_Outfit_2 = "hero_2.png";
	public static final String Mario_Outfit_1 = "mario_1.png";
	public static final String Mario_Outfit_2 = "mario_2.png";
	public static final String Gwolf_Outfit_1 = "gwolf_1.png";
	public static final String Gwolf__Outfit_2 = "gwolf_2.png";
	private static int[][] setupSprites4x4(int initialdex)
	{
		int[][] returnvar = new int[4][4];
		for(int row = 0;row < 4;row++)
		{
			for(int col = 0;col < 4;col++)
			{
				returnvar[row][col] = (((16 * row) + col)+ initialdex);
			}
		}
		return returnvar;
	}
}
