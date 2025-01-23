package com.github.haiyoucuv.cocosEffect.psi;

import com.github.haiyoucuv.cocosEffect.CocosEffectLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * 定义标识类型
 */
public class CocosEffectTokenType extends IElementType {

    public CocosEffectTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CocosEffectLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CocosEffectTokenType." + super.toString();
    }

}