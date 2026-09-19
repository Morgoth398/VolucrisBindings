/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package ${clazz.packageName};

<#list clazz.imports as import>
import ${import};
</#list>
import volucris.bindings.vulkan.unions.VkClearColorValue;

/**
 * <#if clazz.javadoc??>${clazz.javadoc}</#if>
 */
<#assign desc = clazz.description>
<#assign modifiers = clazz.modifiers?join(" ")>
${modifiers} class ${desc.name}${clazz.classHeader} {

    <#list clazz.fields?filter(f -> !f.type?contains("MethodHandle")) as field>
    <#if field.blankLineBefore>

    </#if>
    private final ${field.type} ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
    <#if field.blankLineAfter>

    </#if>
    </#list> 

    static {

    }
    
    private ${desc.name}() {
        
    }

    <#list clazz.methods as method>
    <#list method.source as line>
    ${line}
    </#list>
    <#sep>
    
    </#sep>
    </#list>

}