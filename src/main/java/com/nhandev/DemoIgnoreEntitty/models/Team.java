package com.nhandev.DemoIgnoreEntitty.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Teams")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team implements Serializable {
    @Id
    @Column(name = "teamId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int    teamId;
    @Column (name = "name")
    private String name;
    @Column (name = "description")
    private String description;
    @JsonIgnore
    @ManyToMany (mappedBy = "userTeamList", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> userList;
}
