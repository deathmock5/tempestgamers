package com.tempestgamers.deathmock.helper;
	import java.util.logging.Level;
	import java.util.logging.Logger;
import com.tempestgamers.deathmock.lib.Strings;
	
import cpw.mods.fml.common.FMLLog;
public class LogHelper {
	private static Logger dLogger = Logger.getLogger(Strings.MOD_NAME);

    public static void init() {

        dLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        dLogger.log(logLevel, message);
    }

}
