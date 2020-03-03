package cn.tjuscs.st.lab01;

public class PayMoney {
	public boolean isAffordable(int money) {
		if(money >= 50) {
			money -= 50;
		}
		if(money >= 20) {
			money -= 20;
		}
		if(money >= 10) {
			money -= 10;
		}
		if(money >= 5) {
			money -= 5;
		}
		if(money >= 5) {
			money -= 5;
		}
		if(money >= 1) {
			money -= 1;
		}
		if(money >= 1) {
			money -= 1;
		}
		if(money >= 1) {
			money -= 1;
		}
		
		if(money == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
