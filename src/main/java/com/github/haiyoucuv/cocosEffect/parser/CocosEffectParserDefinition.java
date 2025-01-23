package com.github.haiyoucuv.cocosEffect.parser;

import com.github.haiyoucuv.cocosEffect.CocosEffectLanguage;
import com.github.haiyoucuv.cocosEffect.psi.CocosEffectTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import generated.GeneratedParser;
import org.jetbrains.annotations.NotNull;

/**
 * 第十二步:定义解析器,并在plugin.xml里注册
 */
public class CocosEffectParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(CocosEffectLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new CocosEffectAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new GeneratedParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return CocosEffectTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new CocosEffectFile(viewProvider);
    }
}
