<#assign has_parameters = parameters?has_content>
<#if has_parameters>
public ${methodName}(
    <#list parameters as parameter>
    <#if parameter.isNullable()>@Nullable </#if><#if parameter.isStructArray()>NativeStructArray<${parameter.type}> <#else>${parameter.type} </#if>${parameter.name}<#sep>,</#sep>
    </#list>
) {
    this(
        Arena.ofAuto(),
        <#list parameters as parameter>
        ${parameter.name}<#sep>,</#sep>
        </#list>
    );
}

<#if javadoc??>${javadoc}</#if>
public ${methodName}(
	Arena arena,
	<#list parameters as parameter>
	<#if parameter.isNullable()>@Nullable </#if><#if parameter.isStructArray()>NativeStructArray<${parameter.type}> <#else>${parameter.type} </#if>${parameter.name}<#sep>,</#sep>
	</#list>
) {
	MemorySegment segment = ${rawMethodName}(
		<#list parameters as parameter>
		<#if parameter.isPrimitive() || parameter.isRawSegment()>
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

	if (segment.equals(MemorySegment.NULL))
		throw new NullPointerException("Created segment is NULL.");

	this.segment = segment.reinterpret(arena, s -> ${destructor}(s));
	<#if parentConstructorCall!false>
	super(segment);
	</#if>
}
<#else>
public ${methodName}() {
	this(Arena.ofAuto());
}

<#if javadoc??>${javadoc}</#if>
public ${methodName}(Arena arena) {
	MemorySegment segment = ${rawMethodName}();

	if (segment.equals(MemorySegment.NULL))
		throw new NullPointerException("Created segment is NULL.");

	this.segment = segment.reinterpret(arena, s -> ${destructor}(s));
	<#if parentConstructorCall!false>
	super(segment);
	</#if>
}
</#if>