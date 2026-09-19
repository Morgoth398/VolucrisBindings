/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package ${packageName};

public final class ${name} {

    <#list infos as info>
    <#if info.javadoc??>
    ${info.javadoc}
    public static final int ${info.name} = ${info.value?c};
    <#else>
    public static final int ${info.name} = ${info.value?c};
    </#if>
    </#list>

}