package main;

import org.apache.struts.action.ActionForm;

public class NumberForm extends ActionForm {
	private static final long serialVersionUID = 229629800785515048L;
	int x;
	int y;
	int ans;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAns() {
		return ans;
	}
	public void setAns(int ans) {
		this.ans = ans;
	}
}
