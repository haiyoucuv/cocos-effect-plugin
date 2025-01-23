package com.github.haiyoucuv.cocosEffect;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CocosEffectFileType extends LanguageFileType {

    public static final CocosEffectFileType INSTANCE = new CocosEffectFileType();

    private CocosEffectFileType() {
        super(CocosEffectLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Cocos Effect File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Cocos Effect language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "effect";
    }

    @Override
    public Icon getIcon() {
        return null; // You can set an icon here
    }
}
