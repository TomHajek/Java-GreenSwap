package greenswap.auction.dtos.cart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


/**
 * Shopping cart
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CartDto {

    private List<CartItemDto> cartItems;
    private Double totalCost;

}
