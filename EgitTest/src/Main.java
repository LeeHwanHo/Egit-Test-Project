
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is egit");
		
		Test test = new Test();
		test.ChangeComment("변경된 코멘트");
		//세번째 커밋을 위한 주석

		System.out.println("Conflict Test 후 (hotFix branch)");
		
		//특정 branch 작업 내역 Push를 위한코드
		System.out.println("hotFix branch Push!");
	}

}
