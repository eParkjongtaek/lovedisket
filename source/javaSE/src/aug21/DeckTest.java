package aug21;

class DeckTest 
{
   public static void main(String args[]) 
   {
		Deck d = new Deck();	// 카드 한 벌(Deck)을 만든다.
		Card c = d.pick(0);		// 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c);
		d.shuffle();			// 카드를 섞는다.
		c = d.pick(0);			// 섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);
	}
}

// Deck클래스
class Deck {
	final int CARD_NUM = 52;	// 카드의 개수
	Card c[] = new Card[CARD_NUM];	// 카드배열객체를 초기화한다. CARD_NUM 상수에 의해 52장이다.

	Deck () {	// Deck의 카드를 초기화한다.
		int i=0;
		
		// 매개변수있는 생성자로 카드객체를 초기화한다.
		for(int k=Card.KIND_MAX; k > 0; k--) {
			for(int n=1; n < Card.NUM_MAX + 1 ; n++) {
				c[i++] = new Card(k, n);
			}
		}
	}

	// 카드리턴값으로 인덱스번호에 해당되는 카드를 꺼낸다.
	Card pick(int index) {	// 지정된 위치(index)에 있는 카드 하나를 선택한다.
		if(0 <= index && index < CARD_NUM)
			return c[index];
		else
			return pick();
	}

	// 카드리턴값으로 카드를 꺼낸다.
	Card pick() {			// Deck에서 카드 하나를 선택한다.
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}

	// 카드객체를 섞어준다.
	void shuffle() {			// 카드의 순서를 섞는다.
		for(int n=0; n < 1000; n++) {
			int i = (int)(Math.random() * CARD_NUM);
			Card temp = c[0];	
			c[0] = c[i];
			c[i] = temp;
		}
	}
} // Deck클래스의 끝

// Card클래스
class Card {
	static final int KIND_MAX = 4;	// 카드 무늬의 수
	static final int NUM_MAX  = 13;	// 무늬별 카드 수

	static final int SPADE   = 4;	// 스페이드 무늬 인덱스
	static final int DIAMOND = 3;	// 다이아몬드 무늬 인덱스
	static final int HEART   = 2;	// 하트무늬 인덱스
	static final int CLOVER  = 1;	// 클로버 무늬 인덱스

	int kind;	// 무늬 입력 변수
	int number;	// 카드번호 입력 변수

	// 기본 생성자 정의(실제로 사용되지는 않음)
	Card() {
		this(SPADE, 1);	
	}

	// 매개변수가 있는 생성자 (실제로 카드 초기화에 쓰임)
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// 객체참조로 print할 경우 toString 메서드를 먼저 찾는다.
	// toString OBJECT 객체로서 특별히 상속받지 않아도 오버라이딩이 가능하다.
	public String toString() {
		String kind="";
		String number="";

		switch(this.kind) {
			case 4 :
				kind = "SPADE";
				break;
			case 3 :
				kind = "DIAMOND";
				break;
			case 2 :
				kind = "HEART";
				break;
			case 1 :
				kind = "CLOVER";
				break;
			default :
		}

		switch(this.number) {
			case 13 :
				number = "K";
				break;
			case 12 :
				number = "Q";
				break;
			case 11 :
				number = "J";
				break;
			default :
				number = this.number + "";
		}
		return "kind : " + kind + ", number : " + number;
	} // toString()의 끝
} // Card클래스의 끝