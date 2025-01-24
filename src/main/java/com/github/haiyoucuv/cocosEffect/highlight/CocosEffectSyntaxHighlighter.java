package com.github.haiyoucuv.cocosEffect.highlight;

import com.github.haiyoucuv.cocosEffect.parser.CocosEffectAdapter;
import com.github.haiyoucuv.cocosEffect.psi.CocosEffectTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * 定义语法高亮器
 */
public class CocosEffectSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey("LINE_COMMIT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    public static final TextAttributesKey COCOS_KEYWORD =
            createTextAttributesKey("COCOS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey YAML_CODE =
            createTextAttributesKey("YAML_CODE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey GLSL_CODE =
            createTextAttributesKey("GLSL_CODE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    private static final TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{BLOCK_COMMENT};

    private static final TextAttributesKey[] COCOS_KEYWORD_KEYS = new TextAttributesKey[]{COCOS_KEYWORD};
    private static final TextAttributesKey[] YAML_CODE_KEYS = new TextAttributesKey[]{YAML_CODE};
    private static final TextAttributesKey[] GLSL_CODE_KEYS = new TextAttributesKey[]{GLSL_CODE};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CocosEffectAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
//        if (tokenType.equals(CocosEffectTypes.LINE_COMMENT)) {
//            return LINE_COMMENT_KEYS;
//        }
//        if (tokenType.equals(CocosEffectTypes.BLOCK_COMMENT)) {
//            return BLOCK_COMMENT_KEYS;
//        }

//        if (tokenType.equals(CocosEffectTypes.GLSL_TEXT)) {
//            return YAML_CODE_KEYS;
//        }
//
//        if (tokenType.equals(CocosEffectTypes.YAML_TEXT)) {
//            return GLSL_CODE_KEYS;
//        }

        if (tokenType.equals(CocosEffectTypes.CC_EFFECT)
                || tokenType.equals(CocosEffectTypes.CC_PROGRAM)
        ) {
            return COCOS_KEYWORD_KEYS;
        }

        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }

        return EMPTY_KEYS;
    }

}