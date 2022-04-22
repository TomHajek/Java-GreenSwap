package greenswap.auction.dtos.cart;

import greenswap.auction.entities.CartItem;
import greenswap.auction.entities.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;


/**
 * Each item in the shopping cart
 */
@Getter @Setter @NoArgsConstructor @ToString
public class CartItemDto {

    private Integer id;

    @NotNull
    private Product product;

    @NotNull
    private Integer quantity;


    // constructor for cartItem entity to dto mapping
    public CartItemDto(CartItem cartItem) {
        this.setId(cartItem.getId());
        this.setProduct(cartItem.getProduct());
        this.setQuantity(cartItem.getQuantity());
    }

}
