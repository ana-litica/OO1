package ar.edu.unlp.info.oo1.FilteredSet;
import java.util.HashSet;
import java.util.Set;

public class EvenNumberSet extends HashSet<Integer>{
//	private Set<Integer> numeros;
	
	public EvenNumberSet() {
//		numeros=new HashSet<>();
	}
	
	@Override
	public boolean add(Integer numero) {
		if(numero % 2 == 0)
			super.add(numero);
		return false;
	}

}