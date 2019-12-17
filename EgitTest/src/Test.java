
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
	
	// Pull
	
	/*
	IU - 좋은날
	어쩜 이렇게 하늘은 더 파란건지 
	오늘따라 왜 바람은 또 완벽한지 
	그냥 모르는척 하나 못들은척 
	지워버린척 딴 얘길 시작할까 
	아무 말 못하게 입 맞출까 
	눈물이 차올라서 고갤 들어 
	흐르지 못하게 또 살짝 웃어 
	내게 왜 이러는지 무슨 말을 하는지 
	오늘 했던 모든 말 저 하늘 위로 
	한번도 못했던 말 
	울면서 할 줄은 나 몰랐던 말 
	나는요 오빠가 좋은걸 어떡해
	 */
}
