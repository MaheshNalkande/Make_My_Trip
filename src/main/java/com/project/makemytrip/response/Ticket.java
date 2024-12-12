package com.project.makemytrip.response;

public class Ticket {
	private int tid;
	private String tPnr;
	private String ticketStatus;
	private Double tprice;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String gettPnr() {
		return tPnr;
	}

	public void settPnr(String tPnr) {
		this.tPnr = tPnr;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Double getTprice() {
		return tprice;
	}

	public void setTprice(Double tprice) {
		this.tprice = tprice;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", tPnr=" + tPnr + ", ticketStatus=" + ticketStatus + ", tprice=" + tprice + "]";
	}

}
