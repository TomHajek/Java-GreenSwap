package greenswap.auction.mappings;

import greenswap.auction.dtos.cart.CartItemDto;
import greenswap.auction.entities.CartItem;
import org.springframework.stereotype.Component;


@Component
public class CartMapping {

    // getting cartItem dto from cartItem entity
    public CartItemDto getDtoFromCart(CartItem cartItem) {
        return new CartItemDto(cartItem);
    }

}
