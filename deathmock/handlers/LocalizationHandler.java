package com.tempestgamers.deathmock.handlers;

import com.tempestgamers.deathmock.helper.LocalizationHelper;
import com.tempestgamers.deathmock.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;
public class LocalizationHandler {

    /***
     * Loads in all the localization files from the Localizations library class
     */
    public static void loadLanguages() {

        // For every file specified in the Localization library class, load them into the Language Registry
        for (String localizationFile : Localizations.localeFiles) {
            LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationHelper.getLocaleFromFileName(localizationFile), LocalizationHelper.isXMLLanguageFile(localizationFile));
        }
    }
}
