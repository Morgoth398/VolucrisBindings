<#if isArray!false>
/// @see #${fieldName}(int)
public ${className} ${fieldName}(Consumer<${typeName}> consumer, int index) {
	consumer.accept(${fieldName}[index]);
	return this;
}

/// @see #${fieldName}(int)
public ${className} ${fieldName}(${typeName} other, int index) {
	${fieldName}[index].set(other);
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public ${typeName} ${fieldName}(int index) {
	return ${fieldName}[index];
}
<#else>
/// @see #${fieldName}()
public ${className} ${fieldName}(Consumer<${typeName}> consumer) {
	consumer.accept(${fieldName});
	return this;
}

/// @see #${fieldName}()
public ${className} ${fieldName}(${typeName} other) {
	${fieldName}.set(other);
	return this;
}

<#if javadoc??>
${javadoc}
</#if>
public ${typeName} ${fieldName}() {
	return ${fieldName};
}
</#if>