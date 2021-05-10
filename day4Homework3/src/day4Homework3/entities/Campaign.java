package day4Homework3.entities;

import day4Homework3.abstracts.Entity;

public class Campaign implements Entity{
	int id;
	String campaignName;
	double discount;
	double afterDiscountPrice;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String campaignName, double discount, double afterDiscountPrice) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.afterDiscountPrice = afterDiscountPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
