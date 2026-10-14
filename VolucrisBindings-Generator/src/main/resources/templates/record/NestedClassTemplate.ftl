public static class ${clazz.clazzName} implements Struct<${clazz.clazzName}> {

	<#list clazz.fields as fieldGroup>
	<#list fieldGroup as field>
	${field.modifiers?join(" ")} ${field.type} ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
	</#list>
	<#sep>

	</#sep>
	</#list>

	static {
		//@formatter:off
		<#list clazz.staticBlock.elements as element>
		${element}
		</#list>
		//@formatter:on
	}

	<#list clazz.constructors as constructor>
	<#list constructor.source as line>
	${line}
	</#list>
	<#sep>

	</#sep>
	</#list>

	<#list clazz.methods as method>
    <#list method.source as line>
    ${line}
    </#list>
    <#sep>
    
    </#sep>
    </#list>

	<#list clazz.nestedClasses as nestedClass>
	<#list nestedClass?lines as line>
	${line}
	</#list>
    <#sep>
    
    </#sep>
	</#list>
}