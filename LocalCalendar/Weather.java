package LocalCalendar;

public enum Weather {
    SUNNY, RAINY;

    private static Weather currentWeather;

    public static void setWeather(Weather weather) {
        currentWeather = weather;
    }

    public static Weather getWeather() {
        return currentWeather;
    }
}