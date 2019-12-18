
class Test {
	
	String comment = "This is Test Class Object!";
	
	
	//hotfix branch 에서의 코드 추가
	int num = 10;
	
	public Test(){
		System.out.println(comment);
	}
	
	//hotfix branch 에서의 코드 추가
	public Test(int num) {
		this.num = num;
	}
	
	
	public void ChangeComment(String comment) {
		this.comment = comment;
		System.out.println(this.comment);
	}
	
	//Push를 위한 코드 추가
	public void SetNum(int num) {
		this.num = num;
	}
}
