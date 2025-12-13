package question.second;

public class ExceptionLineTooLong extends Exception {
	
	public ExceptionLineTooLong() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The strings is too long";
	}

}
