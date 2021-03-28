package vo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StockVO {
	private String ranking;
	private String name;
	private String searchRate;
	private String presentPrice;
	private String fullTime;
	private String fluctuationRate;
	private String price;
	private String up;
	private String down;
	private String per;
	private String roe;
	
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSearchRate() {
		return searchRate;
	}
	public void setSearchRate(String searchRate) {
		this.searchRate = searchRate;
	}
	public String getPresentPrice() {
		return presentPrice;
	}
	public void setPresentPrice(String presentPrice) {
		this.presentPrice = presentPrice;
	}
	public String getFullTime() {
		return fullTime;
	}
	public void setFullTime(String fullTime) {
		this.fullTime = fullTime;
	}
	public String getFluctuationRate() {
		return fluctuationRate;
	}
	public void setFluctuationRate(String fluctuationRate) {
		this.fluctuationRate = fluctuationRate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUp() {
		return up;
	}
	public void setUp(String up) {
		this.up = up;
	}
	public String getDown() {
		return down;
	}
	public void setDown(String down) {
		this.down = down;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	public String getRoe() {
		return roe;
	}
	public void setRoe(String roe) {
		this.roe = roe;
	}
	@Override
	public String toString() {
		return "stockVO [ranking=" + ranking + ", name=" + name + ", searchRate=" + searchRate + ", presentPrice="
				+ presentPrice + ", fullTime=" + fullTime + ", fluctuationRate=" + fluctuationRate + ", price=" + price
				+ ", up=" + up + ", down=" + down + ", per=" + per + ", roe=" + roe + "]";
	}
	
	
}

