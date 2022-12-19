package cn.sichu.mybatis.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.eid
     *
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    private Integer eid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_name
     *
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    private String empName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.age
     *
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    private Integer age;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.gender
     *
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    private String gender;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.email
     *
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    private String email;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.did
     *
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    private Integer did;
    public Emp(Integer eid, String empName, Integer age, String gender, String email, Integer did) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.did = did;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" + "eid=" + eid + ", empName='" + empName + '\'' + ", age=" + age + ", gender='" + gender + '\''
            + ", email='" + email + '\'' + ", did=" + did + '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.eid
     *
     * @return the value of t_emp.eid
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.eid
     *
     * @param eid the value for t_emp.eid
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_name
     *
     * @return the value of t_emp.emp_name
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_name
     *
     * @param empName the value for t_emp.emp_name
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.age
     *
     * @return the value of t_emp.age
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.age
     *
     * @param age the value for t_emp.age
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.gender
     *
     * @return the value of t_emp.gender
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.gender
     *
     * @param gender the value for t_emp.gender
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.email
     *
     * @return the value of t_emp.email
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.email
     *
     * @param email the value for t_emp.email
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.did
     *
     * @return the value of t_emp.did
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.did
     *
     * @param did the value for t_emp.did
     * @mbggenerated Mon Dec 05 00:32:26 GMT 2022
     */
    public void setDid(Integer did) {
        this.did = did;
    }
}