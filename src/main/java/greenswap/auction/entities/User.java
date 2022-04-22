package greenswap.auction.entities;

import greenswap.auction.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


/**
 *  @Data annotation contains other lombok annotations
 *        -> @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
 *  @Builder annotations allows us to use builder pattern during the unit testing
 *  @AllArgsConstructor is needed for @Builder pattern
 */

@Entity @Table(name = "user_accounts")
@Data @NoArgsConstructor @AllArgsConstructor      // lombok boiler code
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(length = 60)
    private String password;

    @Column(name = "profile_picture")
    private String profile_picture;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private Role role;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "date_updated")
    private LocalDateTime dateUpdated;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orders;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Product> products;



}
