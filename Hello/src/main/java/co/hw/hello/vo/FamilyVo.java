package co.hw.hello.vo;

public class FamilyVo {
	private String papaName;
	private String mamaName;
	private String myName;
	private String brotherName;
	
	
	public String getPapaName() {
		return papaName;
	}
	
	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}
	
	public String getMamaName() {
		return mamaName;
	}
	
	public void setMamaName(String mamaName) {
		this.mamaName = mamaName;
	}
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public String getBrotherName() {
		return brotherName;
	}
	
	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}
	
	public String toString( ) {
		System.out.println("====가족이름====");
		System.out.println("= 아빠이름 : " + papaName);
		System.out.println("= 엄마이름 : " +  mamaName);
		System.out.println("= 내 이름 : " + myName);
		System.out.println("= 동생이름 : " + brotherName);
		return null;
	}
	
}
