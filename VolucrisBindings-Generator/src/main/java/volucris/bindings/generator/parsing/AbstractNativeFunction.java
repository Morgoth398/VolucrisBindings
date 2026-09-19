package volucris.bindings.generator.parsing;

import java.util.List;
import java.util.Optional;

public interface AbstractNativeFunction {
	
	public String getName();
	
	public String getComment();
	
	public Optional<NativeType> getReturnType();
	
	public List<NativeParameter> getParameters();
	
}
