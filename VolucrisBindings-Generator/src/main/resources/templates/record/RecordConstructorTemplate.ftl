public ${className}() {
    this(Arena.ofAuto());
}

public ${className}(Arena arena) {
    this(arena.allocate(${layoutFieldName}));
}

public ${className}(MemorySegment segment) {
    this.segment = segment;

    <#list elements as element>
    <#list element?lines as line>
    ${line}
    </#list>
    </#list>
}