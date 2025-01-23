package com.github.haiyoucuv.cocosEffect.parser;

import com.github.haiyoucuv.cocosEffect.CocosEffectFileType;
import com.github.haiyoucuv.cocosEffect.CocosEffectLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * 第十一步:定义根文件
 */
public class CocosEffectFile extends PsiFileBase {

    public CocosEffectFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CocosEffectLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CocosEffectFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "CocosEffect File";
    }

}
