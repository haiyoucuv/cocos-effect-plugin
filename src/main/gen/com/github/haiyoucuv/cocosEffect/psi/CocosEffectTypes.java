// This is a generated file. Not intended for manual editing.
package com.github.haiyoucuv.cocosEffect.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.haiyoucuv.cocosEffect.psi.impl.*;

public interface CocosEffectTypes {

  IElementType CC_EFFECT_BLOCK = new CocosEffectElementType("CC_EFFECT_BLOCK");

  IElementType BLOCK_COMMENT = new CocosEffectTokenType("BLOCK_COMMENT");
  IElementType BLOCK_END = new CocosEffectTokenType("}%");
  IElementType CC_EFFECT = new CocosEffectTokenType("CCEffect");
  IElementType CC_PROGRAM = new CocosEffectTokenType("CCProgram");
  IElementType GLSL_BEGIN = new CocosEffectTokenType("GLSL_BEGIN");
  IElementType LINE_COMMENT = new CocosEffectTokenType("LINE_COMMENT");
  IElementType YAML_BEGIN = new CocosEffectTokenType("YAML_BEGIN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CC_EFFECT_BLOCK) {
        return new CocosEffectCcEffectBlockImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
