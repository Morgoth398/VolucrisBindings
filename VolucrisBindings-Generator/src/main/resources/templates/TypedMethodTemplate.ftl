<#assign nonInstanceParameters = parameters?filter(p -> !p.isInstance())>
<#assign has_parameters = parameters?has_content>
<#assign has_instanceParameter = (parameters?size - nonInstanceParameters?size) == 1>
<#assign has_nonInstanceParameters = nonInstanceParameters?has_content>
<#assign has_returnType = returnType??>
<#assign has_stringParameter = parameters?filter(p -> p.isString())?size != 0>
<#if has_parameters>
<#if javadoc??>
${javadoc}
</#if>
<#if has_nonInstanceParameters>
${modifiers?join(" ")}<#if !has_returnType> void<#else> <#if !returnType.isPrimitive()>@Nullable </#if><#if returnType.isStructArray()>NativeStructArray<${returnType.type}><#else>${returnType.type}</#if></#if> ${methodName}(
	<#list nonInstanceParameters as parameter>
	<#if parameter.isNullable()>@Nullable </#if><#if parameter.isStructArray()>NativeStructArray<${parameter.type}> <#else>${parameter.type} </#if>${parameter.name}<#sep>,</#sep>
	</#list>
) {
<#else>
${modifiers?join(" ")}<#if !has_returnType> void<#else> <#if !returnType.isPrimitive()>@Nullable </#if><#if returnType.isStructArray()>NativeStructArray<${returnType.type}><#else>${returnType.type}</#if></#if> ${methodName}() {
</#if>
	<#-- MASSIVE CODE DUPLICATION BELOW. MUST BE KEPT IN SYNC AT ALL TIMES -->
	<#if has_stringParameter>
	try (Arena arena = MemoryStack.stackPush()) {
		<#if has_returnType && returnType.isPrimitive()>
		return ${rawMethodName}(
		<#elseif has_returnType && !returnType.isPrimitive()>
		MemorySegment segment = ${rawMethodName}(
		<#else>
		${rawMethodName}(
		</#if>
			<#list parameters as parameter>
			<#if parameter.isInstance()>
			this.segment<#sep>,</#sep>
			<#elseif parameter.isPrimitive() || parameter.isRawSegment()>
			${parameter.name}<#sep>,</#sep>
			<#elseif parameter.isString()>
			<#if parameter.isNullable()>${parameter.name} == null ? MemorySegment.NULL : </#if>arena.allocateFrom(${parameter.name})<#sep>,</#sep>
			<#elseif parameter.type == "SegmentAllocator">
			${parameter.name}<#sep>,</#sep>
			<#else>
			<#if parameter.isNullable()>${parameter.name} == null ? MemorySegment.NULL : </#if>${parameter.name}.memorySegment()<#sep>,</#sep>
			</#if>
			</#list>
		);
		<#if has_returnType && !returnType.isPrimitive()>

		if (segment.equals(MemorySegment.NULL))
			return null;
		
		<#if returnType.isStructArray()>
		return ${returnType.type}.array(segment);
		<#elseif returnType.isRawSegment()>
		return segment;
		<#elseif returnType.isString()>
		return segment.getString(0);
		<#elseif returnType.isFunctionPointer()>
		return ${returnType.type}.get(segment);
		<#else>
		return new ${returnType.type}(segment);
		</#if>
		</#if>
	}
	<#else>
	<#if has_returnType && returnType.isPrimitive()>
	return ${rawMethodName}(
	<#elseif has_returnType && !returnType.isPrimitive()>
	MemorySegment segment = ${rawMethodName}(
	<#else>
	${rawMethodName}(
	</#if>
		<#list parameters as parameter>
		<#if parameter.isInstance()>
		this.segment<#sep>,</#sep>
		<#elseif parameter.isPrimitive() || parameter.isRawSegment()>
		${parameter.name}<#sep>,</#sep>
		<#elseif parameter.isString()>
		<#if parameter.isNullable()>${parameter.name} == null ? MemorySegment.NULL : </#if>arena.allocateFrom(${parameter.name})<#sep>,</#sep>
		<#elseif parameter.type == "SegmentAllocator">
		${parameter.name}<#sep>,</#sep>
		<#else>
		<#if parameter.isNullable()>${parameter.name} == null ? MemorySegment.NULL : </#if>${parameter.name}.memorySegment()<#sep>,</#sep>
		</#if>
		</#list>
	);
	<#if has_returnType && !returnType.isPrimitive()>

	if (segment.equals(MemorySegment.NULL))
		return null;
	
	<#if returnType.isStructArray()>
	return ${returnType.type}.array(segment);
	<#elseif returnType.isRawSegment()>
	return segment;
	<#elseif returnType.isString()>
	return segment.getString(0);
	<#elseif returnType.isFunctionPointer()>
	return ${returnType.type}.get(segment);
	<#else>
	return new ${returnType.type}(segment);
	</#if>
	</#if>
	</#if>
}
<#else>
<#if javadoc??>
${javadoc}
</#if>
${modifiers?join(" ")}<#if !has_returnType> void<#else> <#if !returnType.isPrimitive()>@Nullable </#if><#if returnType.isStructArray()>NativeStructArray<${returnType.type}><#else>${returnType.type}</#if></#if> ${methodName}() {
	<#if has_returnType && returnType.isPrimitive()>
	return ${rawMethodName}();
	<#elseif has_returnType && !returnType.isPrimitive()>
	MemorySegment segment = ${rawMethodName}();
	<#else>
	${rawMethodName}();
	</#if>
	<#if has_returnType && !returnType.isPrimitive()>

    if (segment.equals(MemorySegment.NULL))
        return null;
	
	<#if returnType.isStructArray()>
	return ${returnType.type}.array(segment);
	<#elseif returnType.isRawSegment()>
	return segment;
	<#elseif returnType.isString()>
	return segment.getString(0);
	<#elseif returnType.isFunctionPointer()>
	return ${returnType.type}.get(segment);
	<#else>
	return new ${returnType.type}(segment);
	</#if>
	</#if>
}
</#if>