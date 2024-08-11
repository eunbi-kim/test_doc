class Gen36{
	 static <T> T getArr(T[]  Arr) { return Arr[Arr.length-1]; }
	 static <T> T[] getArr2(T[]  Arr) { return Arr; }
}
public class Cla36 {
	public static void main(String[] args) {
		Integer[] a00 = {10,20,30,40,50};
		Integer[] a01 = Gen36.getArr2(a00);
		
		for(int a : a01) { System.out.println(a);}
		
		Integer[] a1 = {111,222,333,444};
		System.out.println(Gen36.<Integer>getArr(a1));
		System.out.println(Gen36.getArr(a1));
		
		String[] s1 = {"자바","C#","SQL"};
		System.out.println(Gen36.<String>getArr(s1));
		System.out.println(Gen36.getArr(s1));
		
		Boolean[] b1 = {true,false,false,true};
		System.out.println(Gen36.<Boolean>getArr(b1));
		System.out.println(Gen36.getArr(b1));
	}
}
