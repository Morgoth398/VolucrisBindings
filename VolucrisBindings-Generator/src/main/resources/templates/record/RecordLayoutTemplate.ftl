<#if fieldName??>
<#if !isUnion>
${fieldName} = MemoryLayout.structLayout(
    <#list layouts as layout>
    <#list layout?lines as line>
    ${line}<#if line?is_last && layout?has_next>,</#if>
    </#list>
    </#list>
).withName("${recordName}").withByteAlignment(${alignment});
<#else>
${fieldName} = MemoryLayout.unionLayout(
    <#list layouts as layout>
    <#list layout?lines as line>
    ${line}<#if line?is_last && layout?has_next>,</#if>
    </#list>
    </#list>
).withName("${recordName}").withByteAlignment(${alignment});
</#if>
<#else>
<#if !isUnion>
MemoryLayout.structLayout(
    <#list layouts as layout>
    <#list layout?lines as line>
    ${line}<#if line?is_last && layout?has_next>,</#if>
    </#list>
    </#list>
).withName("${recordName}").withByteAlignment(${alignment})
<#else>
MemoryLayout.unionLayout(
    <#list layouts as layout>
    <#list layout?lines as line>
    ${line}<#if line?is_last && layout?has_next>,</#if>
    </#list>
    </#list>
).withName("${recordName}").withByteAlignment(${alignment})
</#if>
</#if>