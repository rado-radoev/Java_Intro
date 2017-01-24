package TrueFalse;

public class TrueOrFalse {

	public static void main(String[] args) {
		TrueFalse isTrue = a -> a == true ? true : false;
		boolean x = false;
		System.out.println(examine(isTrue, x));
	}
	
	public static boolean examine(TrueFalse tof, boolean a) {
		return tof.perform(a);
	}
}
