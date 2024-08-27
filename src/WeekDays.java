// week days enum
public enum WeekDays {

    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);


    // instance variable
    private int value;

    // constructor
    WeekDays(int value) {
        this.value = value;
    }

    // convert int to enum
    public static WeekDays valueOf(int value) {
        WeekDays[] wds = values();
        for (WeekDays wd : wds) {
            if (wd.value == value) {
                return wd;
            }
        }
        throw new IllegalArgumentException("invalid integer value for week day " + value);
    }

    // check if this is weekend
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }


    // convert string to enum
    // custom value of method
    // name has to be different than valueOf
    public static WeekDays ignoreCaseValueOf(String value) {
        if ("monday".equalsIgnoreCase(value)) {
            return MONDAY;
        } else if ("tuesday".equalsIgnoreCase(value)) {
            return TUESDAY;
        } else if ("wednesday".equalsIgnoreCase(value)) {
            return WEDNESDAY;
        } else if ("thursday".equalsIgnoreCase(value)) {
            return THURSDAY;
        } else if ("friday".equalsIgnoreCase(value)) {
            return FRIDAY;
        } else if ("saturday".equalsIgnoreCase(value)) {
            return SATURDAY;
        } else if ("sunday".equalsIgnoreCase(value)) {
            return SUNDAY;
        }

        throw new IllegalArgumentException("invalid week day " + value);
    }
}
