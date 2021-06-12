package com.jaw.amex;

public class PendingEnroll {
	
	private String aggId;
	private String InsetDate;
	private String featureName;
	private String status;
	
	PendingEnroll(String aggId,String InsetDate,String featureName,String status){
		this.aggId=aggId;
		this.InsetDate=InsetDate;
		this.featureName=featureName;
		this.status=status;
	}
	
	public String getAggId() {
		return aggId;
	}
	public void setAggId(String aggId) {
		this.aggId = aggId;
	}
	public String getInsetDate() {
		return InsetDate;
	}
	public void setInsetDate(String insetDate) {
		InsetDate = insetDate;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PendingEnroll [aggId=" + aggId + ", InsetDate=" + InsetDate + ", featureName=" + featureName
				+ ", status=" + status + "]";
	}

	
	
}
