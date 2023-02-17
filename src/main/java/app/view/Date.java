package app.view;

public enum Date {
    CutOffDate("2015-01-01");

    private String date;

    Date(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}
