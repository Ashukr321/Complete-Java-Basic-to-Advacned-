
// create user defined exception using extending Exception class
//public class ArithmeticException extends  Exception{
//	ArithmeticException(String msg){
//		super(msg);
//	}
//}


public  class ArithmeticException extends RuntimeException {
	ArithmeticException(String msg){
		super(msg);
	}
}