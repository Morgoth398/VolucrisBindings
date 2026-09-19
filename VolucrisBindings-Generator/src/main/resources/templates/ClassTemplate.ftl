/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package ${clazz.packageName};

<#list clazz.imports as import>
import ${import};
</#list>

<#list clazz.staticImports as import>
import static ${import};
</#list>

<#if clazz.javadoc??>
${clazz.javadoc}
</#if>
<#assign desc = clazz.description>
<#assign modifiers = clazz.modifiers?join(" ")>
${modifiers} class ${desc.name}${clazz.classHeader} {

    <#list clazz.fields as field>
    <#if field.blankLineBefore>

    </#if>
    ${field.modifiers?join(" ")} ${field.type} ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
    <#if field.blankLineAfter>

    </#if>
    </#list> 
    <#list clazz.nestedStructureFields as field>
    <#if field.blankLineBefore>

    </#if>
    ${field.modifiers?join(" ")} ${field.type} ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
    <#if field.blankLineAfter>

    </#if>
    </#list>

    static {
        //@formatter:off
        <#list clazz.staticBlock.elements as element>
        ${element}
        </#list>
        //@formatter:on
    }

    <#list clazz.constructors as constructor>
    <#list constructor.source as line>
    ${line}
    </#list>
    <#sep>
    
    </#sep>
    </#list>

    <#list clazz.methods as method>
    <#list method.source as line>
    ${line}
    </#list>
    <#sep>
    
    </#sep>
    </#list>
    
}