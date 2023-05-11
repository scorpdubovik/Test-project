package models;

public class Mail {
    private String mailAddress;
    private String mailBody;

    public Mail(String mailAddress, String mailBody) {
        this.mailAddress = mailAddress;
        this.mailBody = mailBody;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getMailBody() {
        return mailBody;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }
}
