<#if isStructArray!false>
/// @see #${memberName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int<#sep>, <#sep></#list></#if>)
public ${className} ${memberName}(NativeStructArray<${pointerType}> ${memberName}<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, int index${i}</#list></#if>) {
	${varHandleFieldName}.set(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>, ${memberName}.memorySegment());
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public @Nullable NativeStructArray<${pointerType}> ${memberName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int index${i}<#sep>, </#sep></#list></#if>) {
	MemorySegment segment = (MemorySegment) ${varHandleFieldName}.get(this.segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>);

	if (segment.equals(MemorySegment.NULL))
		return null;

	return ${pointerType}.array(segment);
}
<#else>
/// @see #${memberName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int<#sep>, <#sep></#list></#if>)
public ${className} ${memberName}(<#if isString!false>SegmentAllocator allocator, </#if>${pointerType} ${memberName}<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, int index${i}</#list></#if>) {
	<#if isString!false>
	${varHandleFieldName}.set(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>, allocator.allocateFrom(${memberName}));
	<#else>
	${varHandleFieldName}.set(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>, <#if isRawSegment!false>${memberName}<#else>${memberName}.memorySegment()</#if>);
	</#if>
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public @Nullable ${pointerType} ${memberName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int index${i}<#sep>, </#sep></#list></#if>) {
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