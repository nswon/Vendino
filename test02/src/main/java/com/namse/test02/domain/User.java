package com.namse.test02.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    long uid;
    @Column(name = "id", nullable = false)
    String id;
    @Column(name = "pw", nullable = false)
    String pw;
    @Column(name = "name", nullable = false)
    String name;
    @Column
    int point;
    @Column
    int ticket;

    @OneToMany(mappedBy="user_id")
    @JsonIgnore
    private List<WorkLog> workLogList = new ArrayList<WorkLog>();

    @OneToMany(mappedBy="user_id")
    @JsonIgnore
    private List<Report> reportList = new ArrayList<Report>();

}
