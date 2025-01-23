package com.github.haiyoucuv.cocosEffect.psi.impl;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet;
import org.jetbrains.annotations.NotNull;

public class CocosEffectPsiImplUtil {

    public static PsiReference[] getLanguageSpecificReferences(@NotNull PsiElement element) {
        // 假设你想为某个字符串提供文件引用
        String text = element.getText();
        if (text.startsWith("\"") && text.endsWith("\"")) {
            // 去掉引号
            String path = text.substring(1, text.length() - 1);
            // 创建文件引用集
            FileReferenceSet fileReferenceSet = new FileReferenceSet(path, element, 1, null, true);
            return fileReferenceSet.getAllReferences();
        }
        return PsiReference.EMPTY_ARRAY;
    }
} 