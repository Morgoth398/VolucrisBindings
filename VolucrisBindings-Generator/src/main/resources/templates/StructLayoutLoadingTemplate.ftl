<#if !isUnion>
${fieldName} = MemoryLayout.structLayout(
    <#list fields as field>
    ${field}<#sep>,</#sep>
    </#list>
).withName("${structName}").withByteAlignment(${alignment});
<#else>
${fieldName} = MemoryLayout.unionLayout(
    <#list fields?filter(f -> !f?contains("padding")) as field>
    ${field}<#sep>,</#sep>
    </#list>
).withName("${structName}").withByteAlignment(${alignment});
</#if>