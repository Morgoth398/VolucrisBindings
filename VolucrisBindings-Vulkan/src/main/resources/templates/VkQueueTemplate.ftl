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

    <#list clazz.fields as field>
    <#if field.blankLineBefore>

    </#if>
    private final ${field.type} ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
    <#if field.blankLineAfter>

    </#if>
    </#list> 

    static {

    }

    /**
     * This constructor must not be used. It will always throw an UnsupportedOperationException.
     * The constructor only exists to fix some compiler errors caused by generating all sources.
     * If a struct contains an address to a queue (e.g. VkExternalComputeQueueCreateInfoNV) the getter
     * for this field must not be used as it will call this constructor.
     */
    public ${desc.name}(MemorySegment segment) {
        throw new UnsupportedOperationException(
            "Cannot create a VkQueue this way. Fetch the segment and create the queue manually."
        );
    }

    public ${desc.name}(MemorySegment segment, VkDevice vkDevice) {
        this.segment = segment;

        <#list clazz.fields?filter(f -> !f.name?contains("segment")) as field>
        ${field.name} = vkDevice.${field.name}();
        </#list>
    }
    
    <#list clazz.fields?filter(f -> !f.name?contains("segment")) as field>
    public final ${field.type} ${field.name}() {
        return ${field.name};
    }

    </#list>
    public MemorySegment memorySegment() {
        return segment;
    }

}