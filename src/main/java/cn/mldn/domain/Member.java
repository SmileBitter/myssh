package cn.mldn.domain;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/3
 * Time: 16:49
 * Description:
 */
public class Member {
    private int mid;
    private String name;
    private Integer age;
    private String sex;
    private Date birthday;
    private Double salary;
    private String note;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        if (mid != member.mid) return false;
        if (name != null ? !name.equals(member.name) : member.name != null) return false;
        if (age != null ? !age.equals(member.age) : member.age != null) return false;
        if (sex != null ? !sex.equals(member.sex) : member.sex != null) return false;
        if (birthday != null ? !birthday.equals(member.birthday) : member.birthday != null) return false;
        if (salary != null ? !salary.equals(member.salary) : member.salary != null) return false;
        if (note != null ? !note.equals(member.note) : member.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mid=" + mid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", note='" + note + '\'' +
                '}';
    }
}
