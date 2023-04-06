package homework._0406.clazz;

public class HistoricPerson {
    private String name;  //이름
    private String achievement; //업적
    private String country; //지


    public HistoricPerson(String name, String achievement, String country){
        this.name = name;
        this.achievement = achievement;
        this.country = country;
    }

    public void getSameCountryPerson (String country){
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPersonInfo(String achievement) {

        return achievement;
    }

    @Override
    public String toString() {
        return "HistoricPerson{" +
                "name='" + name + '\'' +
                ", achievement='" + achievement + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
