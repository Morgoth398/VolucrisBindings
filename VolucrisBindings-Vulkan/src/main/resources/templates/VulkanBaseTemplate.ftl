/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package ${clazz.packageName};

<#list clazz.imports as import>
import ${import};
</#list>

<#list clazz.staticImports as import>
import static ${import};
</#list>

<#if javadoc??>
${javadoc}
</#if>
<#assign desc = clazz.description>
<#assign modifiers = clazz.modifiers?join(" ")>
${modifiers} class ${desc.name}${clazz.classHeader} {

    <#list clazz.fields as field>
    <#if field.blankLineBefore>

    </#if>
    ${field.modifiers?join(" ")} ${field.type} ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
    <#if field.blankLineAfter>

    </#if>
    </#list> 
    <#list clazz.nestedStructureFields as field>
    <#if field.blankLineBefore>

    </#if>
    ${field.modifiers?join(" ")} ${field.type}<#if field.count != 0>[]</#if> ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
    <#if field.blankLineAfter>

    </#if>
    </#list>

    static {
        //@formatter:off
        <#list clazz.staticBlock.elements as element>
        ${element}
        </#list>
        //@formatter:on
    }

    protected ${desc.name}() {

    }

    <#list clazz.methods as method>
    <#list method.source as line>
    ${line}
    </#list>
    <#sep>
    
    </#sep>
    </#list>
    
    private static LazyConstant<MethodHandle> downcallHandle(
		String name,
		MemoryLayout resLayout,
		MemoryLayout... argLayouts
	) {
	    return LazyConstant.of(() -> {
			try (Arena arena = Arena.ofConfined()) {
				MemorySegment address = GLFWVulkan.glfwGetInstanceProcAddress(
						MemorySegment.NULL,
						arena.allocateFrom(name)
				);

				Linker linker = Linker.nativeLinker();
				return linker.downcallHandle(address, FunctionDescriptor.of(resLayout, argLayouts));
			}
		});
	}
}