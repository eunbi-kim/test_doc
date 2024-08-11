class Tv34 { 
	Tv34()  {System.out.println("Tv34() 실행됨.");} 
	@Override
	public String toString() { return "Tv34"; }    }

class Product34<T,M>{
	private T kind;
	private M model;
	void setData(T kind, M model){this.kind = kind; this.model = model;}
	T getKind() { return this.kind; }
	M getModel() { return this.model; }				}

class Car34{ 
	Car34() { System.out.println("Car34() 실행됨."); }
	@Override
	public String toString() { return "Car34"; }      
}
public class Cla34 {
	public static void main(String[] args) {
		Product34<Tv34,String> p01 = new Product34<Tv34,String>();
		p01.setData(new Tv34(), "Smart TV");
		System.out.println(p01.getKind()+","+p01.getModel());
		
		// Kind: Car34, Model: 디젤 => Car34,디젤
		Product34<Car34,String> p02 = new Product34<>();
		p02.setData(new Car34(), "디젤");
		System.out.println(p02.getKind()+","+p02.getModel());				
	}
}
