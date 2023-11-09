package Task_4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String someData;

    private String anotherData;

    public MyEntity() {
    }

    public MyEntity(String someData, String anotherData) {
        this.someData = someData;
        this.anotherData = anotherData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSomeData() {
        return someData;
    }

    public void setSomeData(String someData) {
        this.someData = someData;
    }

    public String getAnotherData() {
        return anotherData;
    }

    public void setAnotherData(String anotherData) {
        this.anotherData = anotherData;
    }
}
