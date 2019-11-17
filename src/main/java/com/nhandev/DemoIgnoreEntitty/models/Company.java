package com.nhandev.DemoIgnoreEntitty.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Companies")
public class Company implements Serializable {
    @Id
    @Column(name = "companyId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyId;
    private String name;
    @JsonIgnore
    @OneToMany (mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> userList;

}
