
public class Card {

	private int type;
	private int number;
	public int points = 0;
	public char jack = 'J';
	public char queen = 'Q';
	public char king = 'K';

	public Card(int type, int number) {
		this.number = number;
		this.type = type;

		/*if (this.number == 11) {
			this.number = this.jack;
			this.points++;
		}else if(this.number == 12){
			this.number = this.queen;
		}else if(this.number == 13){
			this.number = this.king;
		} */
	}
	

	public Card(int number){
		this.number = number;
	}


	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
		if (this.type > 13) {
			this.type = 13;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void Changenr() {
		if (number == 11) {
			number = 4;
		}

	}
	
	public int valueOfNumber(){
		return this.number;
	}

	public String toString() {
		return "Type: " + this.type + " Nr: " + this.number;
	}

}
