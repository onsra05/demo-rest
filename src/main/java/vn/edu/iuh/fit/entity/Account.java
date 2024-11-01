package vn.edu.iuh.fit.entity;

import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long username;
    private String pass;
    private String email;


}
