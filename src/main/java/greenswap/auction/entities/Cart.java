package greenswap.auction.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


@Entity @Table(name = "shopping_carts")
@Data @NoArgsConstructor @AllArgsConstructor
public class Cart {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    // uni-directional relation with user (user don't need to see all history of his shopping carts)
    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    @OneToMany(mappedBy = "cart", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CartItem> cartItems;


    // constructor with date created setting (when adding item to cart we are creating a cart)
    public Cart(User user, Set<CartItem> cartItems) {
        this.dateCreated = LocalDateTime.now();
        this.user = user;
        this.cartItems = cartItems;
    }

}
