// This is a generated file. Not intended for manual editing.
package com.github.haiyoucuv.cocosEffect.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.haiyoucuv.cocosEffect.psi.impl.*;

public interface CocosEffectTypes {

  IElementType CC_EFFECT_BLOCK = new CocosEffectElementType("CC_EFFECT_BLOCK");
  IElementType GLSL_TEXT = new CocosEffectElementType("GLSL_TEXT");
  IElementType YAML_TEXT = new CocosEffectElementType("YAML_TEXT");

  IElementType BLOCK_COMMENT = new CocosEffectTokenType("block_comment");
  IElementType BLOCK_END = new CocosEffectTokenType("}%");
  IElementType BLOCK_START = new CocosEffectTokenType("%{");
  IElementType CC_EFFECT = new CocosEffectTokenType("CCEffect");
  IElementType CC_PROGRAM = new CocosEffectTokenType("CCProgram");
  IElementType LINE_COMMENT = new CocosEffectTokenType("line_comment");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CC_EFFECT_BLOCK) {
        return new CocosEffectCcEffectBlockImpl(node);
      }
      else if (type == GLSL_TEXT) {
        return new CocosEffectGlslTextImpl(node);
      }
      else if (type == YAML_TEXT) {
        return new CocosEffectYamlTextImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
