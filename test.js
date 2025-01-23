const text = `// 匹配方法上带有特定注解
@annotation(org.javamaster.annos.AopLock)
// 匹配目标对象上带有特定注解
@target(org.springframework.transaction.annotation.Transactional) 
// 匹配符合特定模式的方法
execution(* org.javamaster.*.controller..*(..))
// 匹配 bean 的名字
bean(*Impl)
// 条件组合
bean(*Controller) || bean(*Control)

CCEffect %{
  techniques:
  - name: transparent
    passes:
    - vert: standard-vs
      frag: standard-fs
      embeddedMacros: { CC_FORCE_FORWARD_SHADING: true }
      depthStencilState:
        depthTest: true
        depthWrite: false
      blendState:
        targets:
        - blend: true
          blendSrc: src_alpha
          blendDst: one_minus_src_alpha
          blendDstAlpha: one_minus_src_alpha
      properties: *props
    - *forward-add
    - *shadow-caster
}%

CCProgram shared-ubos %{
  uniform Constants {
    vec4 tilingOffset;
    vec4 albedo;
    vec4 albedoScaleAndCutoff;
    vec4 pbrParams;
    vec4 emissive;
    vec4 emissiveScaleParam;
    vec4 anisotropyParam;
  };
}%
`

const effectReg = /(?<=CCEffect\s*%\{)[\s\S]*?(?=}%)/
const ProgramReg = /(?<=CCProgram.*%\{)[\s\S]*?(?=}%)/
console.log(effectReg.exec(text)[0]);
