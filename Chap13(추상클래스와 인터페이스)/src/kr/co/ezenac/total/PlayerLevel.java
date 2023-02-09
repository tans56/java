package kr.co.ezenac.total;

/*
 * 		*****초급자 레벨이에요*****
 * 		천천히 달립니다.
 * 		jump 못해요.
 * 		turn 못해요. 
 * 		*****중급자 레벨이에요*****
 *  	빨리 달립니다.
 * 		높이 jump 합니다.
 * 		높이 jump 합니다.
 * 		turn 못해요.
 * 		*****상급자 레벨이에요*****
 * 		엄청 빨리 달립니다.
 * 		아주 높이 jump 합니다.
 * 		아주 높이 jump 합니다.
 * 		아주 높이 jump 합니다.
 * 		turn 합니다.
 */		


public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	public final void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	} 
	
}














