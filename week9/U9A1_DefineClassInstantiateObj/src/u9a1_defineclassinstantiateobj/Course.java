package u9a1_defineclassinstantiateobj;

/**
 *
 * @author christian
 */
public class Course {
    // constructors (not instantiated yet)
    private String code;
    private int creditHours;

    public Course(String code, int creditHours) {
        this.code = code;
        this.creditHours = creditHours;
    }

    // setters & getters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void getCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
}
