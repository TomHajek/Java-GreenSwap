package greenswap.auction.exceptions;

public class CartNotFoundException extends IllegalArgumentException {
    public CartNotFoundException(String message) {
        super(message);
    }
}
