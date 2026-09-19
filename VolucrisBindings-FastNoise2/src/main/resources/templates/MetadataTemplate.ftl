/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.fastNoise2.metadata;

import volucris.bindings.fastNoise2.Metadata;
import volucris.bindings.fastNoise2.Variable;

public final class ${name} extends Metadata {

    <#list variables as variable>
    <#if variable.type == 0>
    public static final Variable.Float ${variable.name} = new Variable.Float("${variable.name}", ${variable.index});
    <#elseif variable.type == 1>
    public static final Variable.Int ${variable.name} = new Variable.Int("${variable.name}", ${variable.index});
    <#elseif variable.type == 2>
    public static final Variable.Enum ${variable.name} = new Variable.Enum("${variable.name}", ${variable.index});
    <#elseif variable.type == 3>
    public static final Variable.Hybrid ${variable.name} = new Variable.Hybrid("${variable.name}", ${variable.index});
    <#elseif variable.type == 4>
    public static final Variable.NodeLookup ${variable.name} = new Variable.NodeLookup("${variable.name}", ${variable.index});
    </#if> 
    </#list>

    <#list variables as variable>
    <#if variable.enums?has_content>
    public static final class ${variable.name}_ENUMS {
        <#list variable.enums as enum>
        public static final int ${enum.name} = ${enum.value};
        </#list>
    }
    </#if>
    </#list>

    public ${name}() {
        super("${name}", ${index});
    }
}