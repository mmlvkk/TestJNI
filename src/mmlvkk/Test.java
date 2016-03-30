package mmlvkk;

public class Test {
	
	static {
		System.loadLibrary("libCTestJNI");
	}
	
	public native void nativeHello();

	public static void main(String[] args) {
		Test t = new Test();
		t.nativeHello();
//		System.out.println(System.getProperty("java.library.path"));
		
		
	}
	
}
