package volucris.bindings.fastNoise2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class FastNoise2Node {

	private final MemorySegment node;

	public FastNoise2Node(Arena arena, Metadata metadata) {
		this(arena, metadata, ~0);
	}

	public FastNoise2Node(Arena arena, Metadata metadata, int maxFeatureSet) {
		MemorySegment segment = FastNoise2.newFromMetadata(metadata.getId(), maxFeatureSet);

		this.node = segment.reinterpret(arena, FastNoise2::deleteNodeRef);
	}

	public int getMetadataId() {
		return FastNoise2.getMetadataID(node);
	}
	
	public void setInt(Variable.Int intVariable, int value) {
		FastNoise2.setVariableIntEnum(node, intVariable.getVariableIndex(), value);
	}
	
	public void setFloat(Variable.Float floatVariable, float value) {
		FastNoise2.setVariableFloat(node, floatVariable.getVariableIndex(), value);
	}
	
	public boolean setEnum(Variable.Enum enumVariable, int value) {
		return FastNoise2.setVariableIntEnum(node, enumVariable.getVariableIndex(), value);
	}

	public boolean setHybridFloat(Variable.Hybrid hybrid, float value) {
		return FastNoise2.setHybridFloat(node, hybrid.getVariableIndex(), value);
	}
	
	public boolean setHybridNodeLookup(Variable.Hybrid hybrid, FastNoise2Node node) {
		return FastNoise2.setHybridNodeLookup(this.node, hybrid.getVariableIndex(), node.node);
	}
	
	public boolean setNodeLookup(Variable.NodeLookup nodeLookup, FastNoise2Node node) {
		return FastNoise2.setNodeLookup(this.node, nodeLookup.getVariableIndex(), node.node);
	}
	
	public MemorySegment getNode() {
		return node;
	}
}
