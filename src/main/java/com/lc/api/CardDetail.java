package com.lc.api;

public class CardDetail {

	private String firstNumbers;
	private String secondNumbers;
	private String thirdNumbers;
	private String fourthNumbers;

	public String getFirstNumbers() {
		return firstNumbers;
	}

	public void setFirstNumbers(String firstNumbers) {
		this.firstNumbers = firstNumbers;
	}

	public String getSecondNumbers() {
		return secondNumbers;
	}

	public void setSecondNumbers(String secondNumbers) {
		this.secondNumbers = secondNumbers;
	}

	public String getThirdNumbers() {
		return thirdNumbers;
	}

	public void setThirdNumbers(String thirdNumbers) {
		this.thirdNumbers = thirdNumbers;
	}

	public String getFourthNumbers() {
		return fourthNumbers;
	}

	public void setFourthNumbers(String fourthNumbers) {
		this.fourthNumbers = fourthNumbers;
	}

	@Override
	public String toString() {
		return getFirstNumbers() + "-" + getSecondNumbers() + "-" + getThirdNumbers() + "-" + getFourthNumbers();
	}

}
