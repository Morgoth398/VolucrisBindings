package ${packageName};

public final class ${className} {

    <#list constants as constant>
    public static final ${constant.type} ${constant.name} = ${constant.value};
    </#list>
    
}