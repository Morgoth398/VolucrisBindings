<#assign hasReturnType = returnType??>
/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package ${packageName};

<#list imports as import>
import ${import};
</#list>

<#list staticImports as import>
import static ${import};
</#list>

<#if javadoc??>
${javadoc}
</#if>
public abstract class ${className} {

    private static final Map${"<"}Long, WeakReference${"<"}${className}${">"}${">"} CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        <#if hasReturnType>
        DESCRIPTION = FunctionDescriptor.of(
            ${returnTypeLayout}, 
        <#else>
        DESCRIPTION = FunctionDescriptor.ofVoid(
        </#if>
            <#list valueLayouts as layout>
            ${layout}<#sep>, </#sep>
            </#list>
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(${className}.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ${className}() {
        this(Arena.ofAuto());
    }

    public ${className}(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    <#if addTypedMethod>
    public<#if !hasReturnType> void<#else><#if returnType.isPrimitive()> ${returnType.type}<#else> MemorySegment</#if></#if> invoke(
        <#list parameters as parameter>
        <#if parameter.isPrimitive()>${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>,</#sep>
        </#list>
    ) {
        <#if hasReturnType>
        return invoke(
        <#else>
        invoke(
        </#if>
            <#list parameters as parameter>
            <#if parameter.isPrimitive() || parameter.isRawSegment()>
            ${parameter.name}<#sep>,</#sep>
            <#elseif parameter.isFunctionPointer()>
            ${parameter.type}.get(${parameter.name})<#sep>,</#sep>
            <#elseif parameter.isString()>
            ${parameter.name}.getString(0)<#sep>,</#sep>
            <#elseif parameter.isStructArray()>
            ${parameter.type}.array(${parameter.name})<#sep>,</#sep>
            <#else>
            new ${parameter.type}(${parameter.name})<#sep>,</#sep>
            </#if>
            </#list>
        )<#if hasReturnType && !(returnType.isPrimitive() || returnType.isRawSegment())>.memorySegment()</#if>;
    }

    public<#if !hasReturnType> void<#else> <#if returnType.isStructArray()>NativeStructArray<${returnType.type}><#else>${returnType.type}</#if></#if> invoke(
        <#list parameters as parameter>
        <#if parameter.isStructArray()>NativeStructArray<${parameter.type}> <#else>${parameter.type} </#if>${parameter.name}<#sep>,</#sep>
        </#list>
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ${className}."
        );
    };
    <#else>
    public<#if !hasReturnType> void<#else><#if returnType.isPrimitive()> ${returnType.type}<#else> MemorySegment</#if></#if> invoke(
        <#list parameters as parameter>
        <#if parameter.isPrimitive()>${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>,</#sep>
        </#list>
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ${className}."
        );
    }
    </#if>

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ${className} get(MemorySegment segment) {
        WeakReference${"<"}${className}${">"} reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}