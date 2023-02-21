package app.view;

public enum Year {
    CutOffYear(2015);

    private int year;

    Year(int year) {
        this.year = year;
    }

    public int getDate() {
        return year;
    }
}
