package com.github.haiyoucuv.cocosEffect;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.haiyoucuv.cocosEffect.psi.CocosEffectTypes.*;

%%

%{
  public _CocosEffectLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _CocosEffectLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

YAML_BEGIN=(CCEffect)[ \t\n\x0B\f\r]*%\{
GLSL_BEGIN=(CCProgram)[ \t\n\x0B\f\r]*([\w-]+)[ \t\n\x0B\f\r]*%\{
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "CCEffect"            { return CC_EFFECT; }
  "CCProgram"           { return CC_PROGRAM; }
  "}%"                  { return BLOCK_END; }

  {YAML_BEGIN}          { return YAML_BEGIN; }
  {GLSL_BEGIN}          { return GLSL_BEGIN; }
  {LINE_COMMENT}        { return LINE_COMMENT; }
  {BLOCK_COMMENT}       { return BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }
