package jp.tuyano;
 
import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String name;
     
    @Persistent
    private String menu;
     
    @Persistent
    private String count;
     
    @Persistent
    private Date datetime;
 
    public LinkData(String name, String menu, String count, Date datetime) {
        super();
        this.name = name;
        this.menu = menu;
        this.count = count;
        this.datetime = datetime;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getMenu() {
        return menu;
    }
 
    public void setMenu(String menu) {
        this.menu = menu;
    }
 
    public String getCount() {
        return count;
    }
 
    public void setCount(String count) {
        this.count = count;
    }
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}