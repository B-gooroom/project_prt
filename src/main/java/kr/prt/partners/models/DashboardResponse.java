package kr.prt.partners.models;

public class DashboardResponse {
    private int notice;
    private int notification;
    private int restoration;
    private int ongoing;

    public DashboardResponse(int notice, int notification, int restoration, int ongoing) {
        this.notice = notice;
        this.notification = notification;
        this.restoration = restoration;
        this.ongoing = ongoing;
    }

    public int getNotice() {
        return notice;
    }

    public int getNotification() {
        return notification;
    }

    public int getRestoration() {
        return restoration;
    }

    public int getOngoing() {
        return ongoing;
    }
}
