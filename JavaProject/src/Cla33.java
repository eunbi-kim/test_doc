class Gen01<kr>{
	private kr name;
	void setName(kr n) { this.name=n; }
	kr getName() { return this.name; }
}
class Gen02<T>{
	void sum(T i, T j) {System.out.println(i+","+j);}
}
class Gen03<A,B>{
	void sum(A i, B j) {System.out.println(i+","+j);}
}
class Gen04<K,T>{
	private K x; 
	private T y;	
	public void SetList(K i,T j) {this.x = i; this.y = j; }
	public String GetList() {return this.x+" : "+this.y; }
}

class Gen05<K,T>{
	private String x; // 이름
	private K y; // ???
	private T z; // ???
	public void SetList(String i,K j,T k) {x = i; y = j; z=k;}
	public String GetList() {return x+" : "+y+","+z; }
}
public class Cla33 {
	public static void main(String[] args) {
		Gen05<Integer,String> g51 = new Gen05<>();
		g51.SetList("홍길동", 20,"남성"); 
		System.out.println(g51.GetList());	
		
		Gen05<String,Integer> g52 = new Gen05<>();
		g52.SetList("제인", "여성",30); 
		System.out.println(g52.GetList());	
		
		
		Gen04<String,Integer> g41 = new Gen04<>();
		g41.SetList("홍길동", 20); 
		System.out.println(g41.GetList());
		
		Gen04<Integer,String> g42 = new Gen04<>();
		g42.SetList(30, "Tom"); 
		System.out.println(g42.GetList());
		
// ------------------------
		Gen03<String,Integer> g31 = new Gen03();
		g31.sum("서울",2024); // 서울, 2024
		Gen03<Integer,String> g32 = new Gen03();
		g32.sum(2024,"한국"); // 2024, 한국
		
		Gen02<Integer> g21 = new Gen02<>();
		g21.sum(20, 10);
		Gen02<String> g22 = new Gen02<>();
		g22.sum("대한", "민국");

		Gen01<String> g11 = new Gen01<String>();
		g11.setName("Tom"); 
		System.out.println(g11.getName()); 
		
		Gen01<Integer> g12 = new Gen01<Integer>();
		g12.setName(777); 
		System.out.println(g12.getName()); 
		
		Gen01<Boolean> g13 = new Gen01<Boolean>();
		g13.setName(3<4); 
		System.out.println(g13.getName()); 

		Gen01<String> g14 = new Gen01<>();
		g14.setName("Jane"); 
		System.out.println(g14.getName()); 
	}
}
