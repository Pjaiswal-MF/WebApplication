package pojo;
public class InsertToDB {

    private String clientUserIdStr;
    private String inviteCode;
    private String status;
    private String inviteUrl;
    private Integer userId;

	public String getClientUserIdStr() {
		return clientUserIdStr;
	}
	public void setClientUserIdStr(String clientUserIdStr) {
		this.clientUserIdStr = clientUserIdStr;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInviteUrl() {
		return inviteUrl;
	}
	public void setInviteUrl(String inviteUrl) {
		this.inviteUrl = inviteUrl;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
    }

    @Override
    public String toString() {
        return "pojo.InsertToDB [clientUserIdStr=" + clientUserIdStr + ", inviteCode=" + inviteCode + ", inviteUrl="
                + inviteUrl + ", status=" + status + ", userId=" + userId + "]";
    }
}
    
