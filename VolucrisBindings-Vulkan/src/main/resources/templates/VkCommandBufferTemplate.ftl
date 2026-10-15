/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package ${clazz.packageName};

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

<#if javadoc??>
${javadoc}
</#if>
<#assign desc = clazz.description>
<#assign modifiers = clazz.modifiers?join(" ")>
${modifiers} class ${desc.name}${clazz.classHeader} {

	<#list clazz.fields as fieldGroup>
	<#list fieldGroup as field>
	private final ${field.type} ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
	</#list>
	<#sep>

	</#sep>
	</#list>

    static {

    }

    /**
     * This constructor must not be used. It will always throw an UnsupportedOperationException.
     * This constructor only exists to fix some compiler errors caused by generating all sources.
     * If a struct contains an address to a command buffer (e.g. VkCommandBufferSubmitInfo) the getter
     * for this field must not be used as it will call this constructor.
     */
    public ${desc.name}(MemorySegment segment) {
        throw new UnsupportedOperationException(
            "Cannot create a VkCommandBuffer this way. Fetch the segment and create the command buffer manually."
        );
    }

    public ${desc.name}(MemorySegment segment, VkDevice vkDevice) {
        this.segment = segment;

		<#list clazz.fields as fieldGroup>
		<#list fieldGroup?filter(f -> !f.name?contains("segment")) as field>
		${field.name} = vkDevice.${field.name}();
		</#list>
		</#list>
    }
    
	<#list clazz.fields as fieldGroup>
	<#list fieldGroup?filter(f -> !f.name?contains("segment")) as field>
	public final ${field.type} ${field.name}() {
		return ${field.name};
	}
	<#sep>

	</#sep>
	</#list>
	</#list>
    
    public MemorySegment memorySegment() {
        return segment;
    }

}