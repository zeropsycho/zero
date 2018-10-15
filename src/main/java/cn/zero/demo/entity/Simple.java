package cn.zero.demo.entity;

/**
 * @author ZERO
 * @version V1.4
 * @description
 * @package cn.zero.demo.entity
 * @date 2018 10-15 下午 2:13
 */
public class Simple {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Simple() {
    }

    @Override
    public String toString() {
        return "Simple{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
