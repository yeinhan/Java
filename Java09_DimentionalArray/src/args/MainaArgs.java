package args;

public class MainaArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("전달값 갯수: "+args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println(i+"번째 값: "+args[i]);
		}
	}

}
