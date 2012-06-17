package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {

	private CollectionUtils() {}
	
	public static <IN,OUT> Collection<OUT> map( Collection<IN> collection, 
			Mapper<IN,OUT> mapper ) {
		
		Collection<OUT> result = new ArrayList<OUT>();
		
		for ( IN element : collection ) {
			result.add( mapper.map(element) );
		}
		
		return result;
	}
	
	public static <ACC,IN> ACC foldLeft( 
			Collection<IN> collection, ACC initial, FoldLeft<ACC, IN> fold) {
		
		ACC result = null;
		
		
		
		return result;
	}
	
	public static <T> T find( Collection<T> collection, Predicate<T> p ) {		
		T found = null;
		
		
		return found;
	}
	
	public static <T> Collection<T> findAll( Collection<T> collection, Predicate<T> p ) {
		
		Collection<T> found = new ArrayList<T>();
		
		
		
		return found;
	}
	
}
