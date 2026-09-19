<#assign has_returnType = returnType??>
<#assign firstParam = parameters[0]> 
${modifiers?join(" ")}<#if !has_returnType> void<#else><#if returnType.isPrimitive()> ${returnType.type}<#else> MemorySegment</#if></#if> ${methodName}(
    ${firstParam.type} ${firstParam.name}<#if parameters?size gt 1>,</#if>
    <#list parameters[1..] as parameter>
	<#if parameter.isPrimitive()>${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>,</#sep>
	</#list>
) {
    MethodHandle method = ${firstParam.name}.${fieldName}().get();
    try {
        <#if has_returnType>return (<#if returnType.isPrimitive()>${returnType.type}<#else>MemorySegment</#if>)</#if> method.invokeExact(
            ${firstParam.name}.memorySegment()<#if parameters?size gt 1>,</#if>
        <#list parameters[1..] as parameter>
            ${parameter.name}<#sep>,</#sep>
        </#list>
        );
    } catch (Throwable e) {
        throw new RuntimeException(e);
    }
}