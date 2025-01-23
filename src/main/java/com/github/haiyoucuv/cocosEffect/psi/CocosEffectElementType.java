package com.github.haiyoucuv.cocosEffect.psi;

import com.github.haiyoucuv.cocosEffect.CocosEffectLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * 定义元素类型
 */
public class CocosEffectElementType  extends IElementType{
    public CocosEffectElementType(@NotNull @NonNls String debugName) {
        super(debugName, CocosEffectLanguage.INSTANCE);
    }
}
