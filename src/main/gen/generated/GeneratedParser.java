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
  // CC_EFFECT
  //                 | CC_PROGRAM
  public static boolean ccEffectBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ccEffectBlock")) return false;
    if (!nextTokenIs(b, "<cc effect block>", CC_EFFECT, CC_PROGRAM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CC_EFFECT_BLOCK, "<cc effect block>");
    r = consumeToken(b, CC_EFFECT);
    if (!r) r = consumeToken(b, CC_PROGRAM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ccEffectBlock*
  static boolean ccEffectLanguage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ccEffectLanguage")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ccEffectBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ccEffectLanguage", c)) break;
    }
    return true;
  }

}
