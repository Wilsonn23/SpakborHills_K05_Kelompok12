package LocalCalendar;

public enum Season {
    SPRING, SUMMER, FALL, WINTER;

    private static Season currentSeason;

    public static void setSeason(Season season) {
        currentSeason = season;
    }

    public static Season getSeason() {
        return currentSeason;
    }
}