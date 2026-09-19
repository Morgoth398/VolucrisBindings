class-description:
  name: ${name}
  package-name: volucris.bindings.vulkan
  directory: src/main/java/volucris/bindings/vulkan
  is-static: ${static?then("true", "false")}
  parent: ${(parent)!}
  interfaces: []
  is-sealed: false
  permits: []
  is-abstract: false
  is-final: true
  instance-parameter:
  raw-method-template: ${(rawMethodTemplate)!}
  typed-method-template: ${(typeMethodTemplate)!}

imports:
  - volucris.bindings.vulkan.structs.*
  - volucris.bindings.vulkan.handles.*
static-imports:

macro-name-prefixes:
excluded-macro-name-prefixes:
macro-names:
excluded-macro-names:

symbol-prefixes:

symbols:

function-name-prefixes:
excluded-function-name-prefixes:
function-name-postfixes:
excluded-function-name-postfixes:

constructors:
struct:
native-functions:
    <#if allInformation>
    <#list functions as function>
    - name: ${function.name}
      return-type-is-struct-array: ${function.returnTypeIsStructArray?then("true", "false")}
      string-return-type: ${function.returnTypeIsString?then("true", "false")}
    <#if function.nullableParameters?has_content>
      nullable-parameters:
      <#list function.nullableParameters as nullableParameter>
        - ${nullableParameter}
      </#list>
    </#if>
    <#if function.stringParameters?has_content>
      string-parameters:
      <#list function.stringParameters as stringParameter>
        - ${stringParameter}
      </#list>
    </#if>
    <#if function.structArrays?has_content>
      struct-arrays:
      <#list function.structArrays as structArray>
        - ${structArray}
      </#list>
    </#if>
    </#list>    
    <#else>
    <#list functions as function>
    - name: ${function.name}
    </#list>
    </#if>
native-function-pointers: