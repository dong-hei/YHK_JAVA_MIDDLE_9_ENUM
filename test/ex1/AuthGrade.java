package enumration.test.ex1;

public enum AuthGrade {
    GUEST(1,"손님"),
    LOGIN(2,"회원"),
    ADMIN(3,"관리자");


    private final int lvl;
    private final String description;

    AuthGrade(int lvl, String description) {
        this.lvl = lvl;
        this.description = description;
    }

    public int getLvl() {
        return lvl;
    }

    public String getDescription() {
        return description;
    }
}
