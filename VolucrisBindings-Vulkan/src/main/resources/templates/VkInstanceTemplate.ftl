/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package ${clazz.packageName};

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.vulkan.glfw.GLFWVulkan;

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
    private final ${field.type} ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
    <#if field.blankLineAfter>

    </#if>
    </#list> 

    static {
        //@formatter:off
        <#--  <#list clazz.staticBlock.elements as element>
        ${element}
        </#list>  -->
        //@formatter:on
    }

    public ${desc.name}(MemorySegment segment) {
        this.segment = segment;

        <#list clazz.staticBlock.functionLoading as element>
        ${element}
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

    public LazyConstant<MethodHandle> downcallHandle(
		String name,
		MemoryLayout resLayout,
		MemoryLayout... argLayouts
	) {
	    return LazyConstant.of(() -> {
			try (Arena arena = Arena.ofConfined()) {
				MemorySegment address = GLFWVulkan.glfwGetInstanceProcAddress(
						segment,
						arena.allocateFrom(name)
				);

				Linker linker = Linker.nativeLinker();
				return linker.downcallHandle(address, FunctionDescriptor.of(resLayout, argLayouts));
			}
		});
	}

    public LazyConstant<MethodHandle> downcallHandleVoid(
		String name,
		MemoryLayout... argLayouts
	) {
	    return LazyConstant.of(() -> {
			try (Arena arena = Arena.ofConfined()) {
				MemorySegment address = GLFWVulkan.glfwGetInstanceProcAddress(
						segment,
						arena.allocateFrom(name)
				);

				Linker linker = Linker.nativeLinker();
				return linker.downcallHandle(address, FunctionDescriptor.ofVoid(argLayouts));
			}
		});
	}

}