package aug22;

class Product /*extends Object*/{
	private String name; //멤버 변수 선언
	private int price;

	public Product(String name, int price){ // 생성자
		this.name = name;
		this.price = price;

	}
	public boolean equals(Object obj){ //equals메서드 재정의
		boolean result = false;
		// 오브젝트가 널이 아니고 오브젝트가 product 객체에서 온 것일 경우
		if( (obj != null) && (obj instanceof Product)){
			Product p = (Product) obj;
			if((name.equals(p.name)) && (price == p.price)){
				result = true;
			}
		}
		return result;
	}
	public int hashCode(){
		return ( (name.hashCode())
				^ (new Integer(price).hashCode()));
	}
	public String toString(){
		return name;
	}
}





