package com.github.haiyoucuv.cocosEffect.parser;

import com.github.haiyoucuv.cocosEffect._CocosEffectLexer;
import com.intellij.lexer.FlexAdapter;

/**
 * 第十步:定义词法分析器适配器
 */
public class CocosEffectAdapter extends FlexAdapter {

    public CocosEffectAdapter() {
        super(new _CocosEffectLexer(null));
    }

}
