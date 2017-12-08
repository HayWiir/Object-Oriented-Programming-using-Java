import java.util.Scanner;

class NumStrings{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Input Number String: ");
		String s = in.next();
		String n ="";

		for(int i=s.length(); i>0; i--){
			int j = s.length()-i;
			if(i%3==0 & i!=s.length()){
				n+=",";
			}

			n+=s.charAt(j);

			}

		s=n;	
		System.out.println(s);
			
		}





	}
