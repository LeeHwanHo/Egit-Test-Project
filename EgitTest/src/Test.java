
class Test {
	
	String comment = "This is Test Class Object!";
	
	public Test(){
		System.out.println(comment);
	}
	
	
	public void ChangeComment(String comment) {
		this.comment = comment;
		System.out.println(this.comment);
	}
}
