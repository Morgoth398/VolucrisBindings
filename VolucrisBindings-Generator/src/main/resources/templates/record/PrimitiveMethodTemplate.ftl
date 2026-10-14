/// @see #${memberName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int<#sep>, <#sep></#list></#if>)
public ${className} ${memberName}(${primitiveType} ${memberName}<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, int index${i}</#list></#if>) {
	${varHandleFieldName}.set(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>, ${memberName});
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public ${primitiveType} ${memberName}(<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>int index${i}<#sep>, </#sep></#list></#if>) {
	return (${primitiveType}) ${varHandleFieldName}.get(segment, 0L<#if (arrayDepth!0) gte 1><#list 0..(arrayDepth - 1) as i>, index${i}</#list></#if>);
}