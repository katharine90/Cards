
public class AllCards {

	public static Card[] deck = new Card[52];
  	
    
	public AllCards() {
		
		int add = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				deck[j + add - 1] = new Card(i, j);
			}
			add = add + 13;
		}

	}

	public void printCards() {

		for (int i = 1; i < deck.length; i++) {
			System.out.println(deck[i]);
		}

	}

	public static void Find(Card findCard) {
    for(Card o : deck){
    	System.out.println(o);
    if(o.getNumber() == findCard.getNumber() && o.getType() == findCard.getType()){
    	System.out.println("Hittade kortet!");
    }
    }

	}

}