class Box35<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}
public class Cla35 {
	
	static String sum(String s1) { return "Test: " + s1; }
	
	static <T> Box35<T> boxing(T t) {
		Box35<T> box = new Box35<T>();
		box.set(t);
		return box;								}	
	
	public static void main(String[] args) {
	
		Box35<Integer> b1= boxing(100);
		System.out.println(b1.get());
		
		Box35<String> b2= boxing("Tom");
		System.out.println(b2.get());
		
		String z1 = sum("서울");
		System.out.println(z1);
	}
}
