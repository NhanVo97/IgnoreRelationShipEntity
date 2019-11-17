package com.nhandev.DemoIgnoreEntitty.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
    @Table(name = "Users")
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class User implements Serializable {
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int    userId;
        private String email;

        private String password;
        private String phoneNumber;

        private String firstName;

        private String lastName;

        @CreatedDate
        private Date    createdDate;
        @LastModifiedDate
        private Date    updatedDate;

        private int status;

        @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="companyId")
        @JsonIdentityReference(alwaysAsId=true)
        @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        @JoinColumn (name = "companyId", referencedColumnName = "companyId")
        private Company company;
    @JsonIgnore
    @ManyToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable (name = "UserTeams", joinColumns = @JoinColumn (name = "userId", referencedColumnName = "userId"), inverseJoinColumns = @JoinColumn (name = "teamId", referencedColumnName = "teamId"))
    private List<Team> userTeamList;
}
