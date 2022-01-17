package com.namse.test02.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "worklog")
public class WorkLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int id;

    //
//
    @ManyToOne(targetEntity = User.class,fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    @JoinColumn(name="user_id")
    User user_id;

    @Column
    double start_latitude;
    @Column
    double start_Longitude;
    @Column
    double desti_latitude;
    @Column
    double desti_Longitude;
}
