package greenswap.auction.mappings;

import greenswap.auction.dtos.product.ProductDto;
import greenswap.auction.entities.Category;
import greenswap.auction.entities.Product;
import org.springframework.stereotype.Component;


@Component
public class ProductMapping {

    // converting product to dto
    public ProductDto getDtoFromProduct(Product product) {
        ProductDto productDto = new ProductDto(product);
        return productDto;
    }

    // converting dto to product
    public Product getProductFromDto(ProductDto productDto, Category category) {
        Product product = new Product(productDto, category);
        return product;
    }

}
