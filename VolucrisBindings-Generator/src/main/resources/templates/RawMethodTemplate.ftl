<#assign has_parameters = parameters?has_content>
<#assign has_returnType = returnType??>
<#if has_parameters>
<#if javadoc??>
${javadoc}
</#if>
public static<#if !has_returnType> void<#else><#if returnType.isPrimitive()> ${returnType.type}<#else> MemorySegment</#if></#if> ${rawMethodName}(
	<#list parameters as parameter>
	<#if parameter.isPrimitive() || parameter.type == "SegmentAllocator">${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>,</#sep>
	</#list>
) {
	MethodHandle method = ${fieldName}.get();
	try {
		<#if has_returnType>return (<#if returnType.isPrimitive()>${returnType.type}<#else>MemorySegment</#if>)</#if> method.invokeExact(
			<#list parameters as parameter>
			${parameter.name}<#sep>,</#sep>
			</#list>
		);
	} catch (Throwable e) {
		throw new RuntimeException(e);
	}
}
<#else>
<#if javadoc??>
${javadoc}
</#if>
public static<#if !has_returnType> void<#else><#if returnType.isPrimitive()> ${returnType.type}<#else> MemorySegment</#if></#if> ${rawMethodName}() {
	MethodHandle method = ${fieldName}.get();
	try {
		<#if has_returnType>return (<#if returnType.isPrimitive()>${returnType.type}<#else>MemorySegment</#if>)</#if> method.invokeExact();
	} catch (Throwable e) {
		throw new RuntimeException(e);
	}
}
</#if>