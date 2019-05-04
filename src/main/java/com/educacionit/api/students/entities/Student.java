
package com.educacionit.api.students.entities;


import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.springframework.data.annotation.Id;

public class Student implements Serializable {

    @Id
    private String id;

    private String name;

    private String lastName;

    private String email;

    private String mobile;

    private LocalDate birthDate;


    public Student () {
    }

    public Student (String name, String lastName, String email,
                    String mobile, LocalDate birthDate) {

        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.birthDate = birthDate;
    }


    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getMobile() {

        return mobile;
    }

    public void setMobile(String mobile) {

        this.mobile = mobile;
    }

    public LocalDate getBirthDate() {

        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {

        this.birthDate = birthDate;
    }
}