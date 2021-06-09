public class Test {
	public static void main(String[] args) {
		String s = "racebcar";
		String reverse = "";
		for (int i = s.length() -1; i >= 0; i--) {
			 reverse = reverse+s.charAt(i);
			 System.out.println(s.charAt(i));
			}
		System.out.println("Reverse string "+reverse);
		if (s.equals(reverse)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
		}
	 
		
		
	}
