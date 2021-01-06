package co.hw.spex.border.vo;

import java.sql.Date;

public class BorderVo {
	private int borderId;
	private String borderWriter;
	private String borderTitle;
	private String borderContent;
	private Date date;
	private int borderHit;
	
	
	public int getBorderId() {
		return borderId;
	}
	public void setBorderId(int borderId) {
		this.borderId = borderId;
	}
	public String getBorderWriter() {
		return borderWriter;
	}
	public void setBorderWriter(String borderWriter) {
		this.borderWriter = borderWriter;
	}
	public String getBorderTitle() {
		return borderTitle;
	}
	public void setBorderTitle(String borderTitle) {
		this.borderTitle = borderTitle;
	}
	public String getBorderContent() {
		return borderContent;
	}
	public void setBorderContent(String borderContent) {
		this.borderContent = borderContent;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getBorderHit() {
		return borderHit;
	}
	public void setBorderHit(int borderHit) {
		this.borderHit = borderHit;
	}
	
}
