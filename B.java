import java.util.Set;
import java.util.HashSet;

public class B<E> extends HashSet<E> {
	private final int b;

	private B(int b) {
		this.b = b;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.b == ((B)obj).b)
			return true;
		else
			return false;
	};
	
	public static void main(String[] argv) {
		Set<B> set = new HashSet<B>();
		set.add(new B(1));
		set.add(new B(2));
		set.add(new B(3));
		set.add(new B(4));
		set.add(new B(5));
		set.add(new B(5));
		set.add(new B(6));
		System.out.println(set.size());
	}
}