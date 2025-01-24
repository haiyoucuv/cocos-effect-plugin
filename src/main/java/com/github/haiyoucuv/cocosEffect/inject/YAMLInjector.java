package com.github.haiyoucuv.cocosEffect.inject;

import com.intellij.lang.injection.MultiHostInjector;
import com.intellij.lang.injection.MultiHostRegistrar;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YAMLInjector implements MultiHostInjector {

    @Override
    public void getLanguagesToInject(@NotNull MultiHostRegistrar registrar, @NotNull PsiElement context) {
        if (context instanceof PsiLanguageInjectionHost) {
            PsiLanguageInjectionHost host = (PsiLanguageInjectionHost) context;
            String text = host.getText();
            int startIndex = text.indexOf("CCEffect %{") + "CCEffect %{".length();
            int endIndex = text.indexOf("}%");
            if (startIndex < endIndex) {
                TextRange range = TextRange.create(startIndex, endIndex);
//                registrar.startInjecting(YAMLLanguage.INSTANCE)
//                        .addPlace(null, null, host, range)
//                        .doneInjecting();
            }
        }
    }

    @NotNull
    @Override
    public List<? extends Class<? extends PsiElement>> elementsToInjectIn() {
        return ContainerUtil.immutableList(PsiLanguageInjectionHost.class);
    }
}