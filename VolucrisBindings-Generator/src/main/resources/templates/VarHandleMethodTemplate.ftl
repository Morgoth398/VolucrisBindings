<#if isPrimitive!false>
/// @see #${structFieldName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int<#sep>, <#sep></#list></#if>)
public ${className} ${structFieldName}(${primitiveType} ${structFieldName}<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, int index${i}</#list></#if>) {
	${varHandleFieldName}.set(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>, ${structFieldName});
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public ${primitiveType} ${structFieldName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int index${i}<#sep>, </#sep></#list></#if>) {
	return (${primitiveType}) ${varHandleFieldName}.get(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>);
}
<#else>
<#if isStructArray!false>
/// @see #${structFieldName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int<#sep>, <#sep></#list></#if>)
public ${className} ${structFieldName}(NativeStructArray<${pointerType}> ${structFieldName}<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, int index${i}</#list></#if>) {
	${varHandleFieldName}.set(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>, ${structFieldName}.memorySegment());
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public @Nullable NativeStructArray<${pointerType}> ${structFieldName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int index${i}<#sep>, </#sep></#list></#if>) {
	MemorySegment segment = (MemorySegment) ${varHandleFieldName}.get(this.segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>);

	if (segment.equals(MemorySegment.NULL))
		return null;

	return ${pointerType}.array(segment);
}
<#else>
/// @see #${structFieldName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int<#sep>, <#sep></#list></#if>)
public ${className} ${structFieldName}(<#if isString!false>Arena arena, </#if>${pointerType} ${structFieldName}<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, int index${i}</#list></#if>) {
	<#if isString!false>
	${varHandleFieldName}.set(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>, arena.allocateFrom(${structFieldName}));
	<#else>
	${varHandleFieldName}.set(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>, <#if isRawSegment!false>${structFieldName}<#else>${structFieldName}.memorySegment()</#if>);
	</#if>
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public @Nullable ${pointerType} ${structFieldName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int index${i}<#sep>, </#sep></#list></#if>) {
	MemorySegment segment = (MemorySegment) ${varHandleFieldName}.get(this.segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>);

	if (segment.equals(MemorySegment.NULL))
		return null;
	
	<#if isString!false>
	return segment.getString(0);
	<#elseif isRawSegment!false>
	return segment;
	<#elseif isFunctionPointer!false>
	return ${pointerType}.get(segment);
	<#else>
	return new ${pointerType}(segment);
	</#if>
}
</#if>
</#if>