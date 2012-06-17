package collections;

public interface FoldLeft <ACC,IN> {

	public ACC foldLeft( ACC o, IN e );
	
}