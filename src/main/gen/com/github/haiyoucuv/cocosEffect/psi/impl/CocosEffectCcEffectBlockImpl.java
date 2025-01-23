// This is a generated file. Not intended for manual editing.
package com.github.haiyoucuv.cocosEffect.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.haiyoucuv.cocosEffect.psi.CocosEffectTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.haiyoucuv.psi.*;

public class CocosEffectCcEffectBlockImpl extends ASTWrapperPsiElement implements CocosEffectCcEffectBlock {

  public CocosEffectCcEffectBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CocosEffectVisitor visitor) {
    visitor.visitCcEffectBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CocosEffectVisitor) accept((CocosEffectVisitor)visitor);
    else super.accept(visitor);
  }

}
