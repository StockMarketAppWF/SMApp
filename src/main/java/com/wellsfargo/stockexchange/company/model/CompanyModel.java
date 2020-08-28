package com.wellsfargo.stockexchange.company.model;

public class CompanyModel {

	int id;

	String name;

	String ceo;

	String sectorId;

	String brief;

	String code;

	int stockExchangeId;

	String board;

	long turnover;

	CompanyModel() {
	}

	public CompanyModel(int id, String name, String ceo, String sectorId, String brief, String code,
			int stockExchangeId, String board, long turnover) {
		super();
		this.id = id;
		this.name = name;
		this.ceo = ceo;
		this.sectorId = sectorId;
		this.brief = brief;
		this.code = code;
		this.stockExchangeId = stockExchangeId;
		this.board = board;
		this.turnover = turnover;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public long getTurnover() {
		return turnover;
	}

	public void setTurnover(long turnover) {
		this.turnover = turnover;
	}

	public int getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", ceo=" + ceo + ", sectorId=" + sectorId + ", brief=" + brief
				+ ", code=" + code + ", stockExchangeId=" + stockExchangeId + ", board=" + board + ", turnover="
				+ turnover + "]";
	}

}
