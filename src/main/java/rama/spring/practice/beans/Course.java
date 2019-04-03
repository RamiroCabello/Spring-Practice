package rama.spring.practice.beans;

import java.util.Map;

public class Course {

    private String name;
    private int amountHours;
    private Map<String, String> content;


    public Course() {
        super();
    }

    public String getName() {
        return name;
    }

    public int getAmountHours() {
        return amountHours;
    }

    public Map<String, String> getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmountHours(int amountHours) {
        this.amountHours = amountHours;
    }

    public void setContent(Map<String, String> content) {
        this.content = content;
    }
}
