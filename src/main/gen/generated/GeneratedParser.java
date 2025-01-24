// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.haiyoucuv.cocosEffect.psi.CocosEffectTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GeneratedParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return ccEffectLanguage(b, l + 1);
  }

  /* ********************************************************** */
  // (YAML_BEGIN | GLSL_BEGIN) BLOCK_END
  public static boolean ccEffectBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ccEffectBlock")) return false;
    if (!nextTokenIs(b, "<cc effect block>", GLSL_BEGIN, YAML_BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CC_EFFECT_BLOCK, "<cc effect block>");
    r = ccEffectBlock_0(b, l + 1);
    r = r && consumeToken(b, BLOCK_END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // YAML_BEGIN | GLSL_BEGIN
  private static boolean ccEffectBlock_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ccEffectBlock_0")) return false;
    boolean r;
    r = consumeToken(b, YAML_BEGIN);
    if (!r) r = consumeToken(b, GLSL_BEGIN);
    return r;
  }

  /* ********************************************************** */
  // LINE_COMMENT | BLOCK_COMMENT | ccEffectBlock*
  static boolean ccEffectLanguage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ccEffectLanguage")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_COMMENT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = ccEffectLanguage_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ccEffectBlock*
  private static boolean ccEffectLanguage_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ccEffectLanguage_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ccEffectBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ccEffectLanguage_2", c)) break;
    }
    return true;
  }

}
