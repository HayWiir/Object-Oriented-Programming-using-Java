import java.util.*;

public class ByTwos{
	int x;
	int y;

	ByTwos(){
		y=-2;
		x=y;
	}

	int getNext(){
		x+=2;
		return x; 
	}

	void reset(){
		x=y;
		System.out.println("Reset");
	}

	void setStart(int x){
		y=x-2;
		reset();
	}




}