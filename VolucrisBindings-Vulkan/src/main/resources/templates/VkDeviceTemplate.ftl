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

<#list clazz.staticImports as import>
import static ${import};
</#list>

<#if javadoc??>
${javadoc}
</#if>
<#assign desc = clazz.description>
<#assign modifiers = clazz.modifiers?join(" ")>
${modifiers} class ${desc.name}${clazz.classHeader} {

    private final LazyConstant<MethodHandle> VK_GET_DEVICE_PROC_ADDR;
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

    /**
     * This constructor must not be used. It will always throw an UnsupportedOperationException.
     * The constructor only exists to fix some compiler errors caused by generating all sources.
     * If a struct contains an address to a device (e.g. VmaAllocatorCreateInfo) the getter
     * for this field must not be used as it will call this constructor.
     */
    public ${desc.name}(MemorySegment segment) {
        throw new UnsupportedOperationException(
            "Cannot create a VkDevice this way. Fetch the segment and create the device manually."
        );
    }

    public ${desc.name}(MemorySegment segment, VkInstance vkInstance) {
        this.segment = segment;

        VK_GET_DEVICE_PROC_ADDR = vkInstance.downcallHandle("vkGetDeviceProcAddr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        <#list clazz.staticBlock.functionLoading?filter(x -> !x?contains("ProcAddr")) as element>
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
                MethodHandle method = VK_GET_DEVICE_PROC_ADDR.get();

				MemorySegment address = (MemorySegment) method.invokeExact(
						segment,
						arena.allocateFrom(name)
				);

				Linker linker = Linker.nativeLinker();
				return linker.downcallHandle(address, FunctionDescriptor.of(resLayout, argLayouts));
			} catch (Throwable e) {
                throw new RuntimeException(e);
            }
		});
	}

    public LazyConstant<MethodHandle> downcallHandleVoid(
		String name,
		MemoryLayout... argLayouts
	) {
	    return LazyConstant.of(() -> {
			try (Arena arena = Arena.ofConfined()) {
                MethodHandle method = VK_GET_DEVICE_PROC_ADDR.get();

				MemorySegment address = (MemorySegment) method.invokeExact(
						segment,
						arena.allocateFrom(name)
				);

				Linker linker = Linker.nativeLinker();
				return linker.downcallHandle(address, FunctionDescriptor.ofVoid(argLayouts));
			} catch (Throwable e) {
                throw new RuntimeException(e);
            }
		});
	}

}