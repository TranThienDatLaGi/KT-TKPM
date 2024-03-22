package vn.edu.iuh.fit.week5.entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Serializable {
    private long id;
    private String fullName;
}
