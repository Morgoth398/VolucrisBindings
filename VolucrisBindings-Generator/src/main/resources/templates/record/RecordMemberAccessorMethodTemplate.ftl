<#if isArray!false>
/// @see #${memberName}(int)
public ${className} ${memberName}(Consumer<${typeName}> consumer, int index) {
	consumer.accept(${memberName}[index]);
	return this;
}

/// @see #${memberName}(int)
public ${className} ${memberName}(${typeName} other, int index) {
	${memberName}[index].set(other);
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public ${typeName} ${memberName}(int index) {
	return ${memberName}[index];
}
<#else>
/// @see #${memberName}()
public ${className} ${memberName}(Consumer<${typeName}> consumer) {
	consumer.accept(${memberName});
	return this;
}

/// @see #${memberName}()
public ${className} ${memberName}(${typeName} other) {
	${memberName}.set(other);
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public ${typeName} ${memberName}() {
	return ${memberName};
}
</#if>