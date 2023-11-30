package Chap5;

public class Child extends ParentTwo implements Parent3 {

	@Override
	protected void alchemy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultMeathod() {
		// TODO Auto-generated method stub
		Parent3.super.defaultMeathod();
	}

}
