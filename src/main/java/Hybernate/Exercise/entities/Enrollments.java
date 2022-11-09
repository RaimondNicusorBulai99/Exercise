package Hybernate.Exercise.entities;

import javax.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long enrollmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "student_id")
    private Students students;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "class_id")
    private Class classes;
}