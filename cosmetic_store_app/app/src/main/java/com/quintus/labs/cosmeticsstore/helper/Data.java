package com.quintus.labs.cosmeticsstore.helper;

import com.quintus.labs.cosmeticsstore.model.Category;
import com.quintus.labs.cosmeticsstore.model.Offer;
import com.quintus.labs.cosmeticsstore.model.Product;

import java.util.ArrayList;
import java.util.List;


public class Data {
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    public List<Category> getCategoryList() {
        Category category = new Category("1", "Makeup", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/makeup.png");
        categoryList.add(category);
        category = new Category("2", "Skin Care", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/skin-care.jpg");
        categoryList.add(category);
        category = new Category("3", "Hair Care", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/haircare.png");
        categoryList.add(category);
        category = new Category("4", "Fragrances", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/fragrance.jpg");
        categoryList.add(category);
        category = new Category("5", "Nail Care", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/nailcare.png");
        categoryList.add(category);
        category = new Category("6", "Tools & Brushes", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/toolsbrushes.jpg");
        categoryList.add(category);
        return categoryList;
    }

    public List<Product> getProductList() {
        Product product = new Product("1", "1", "Lipstick", "Red Velvet", "1 Unit", "$ ", "15", "10% OFF", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/lipstick_red_velvet.png");
        productList.add(product);
        product = new Product("2", "1", "Foundation", "Natural Beige", "30 ml", "$ ", "22", "20% OFF", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/foundationbelgium.png");
        productList.add(product);
        product = new Product("3", "2", "Moisturizer", "For Dry Skin", "50 ml", "$ ", "30", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/moisturizer.png");
        productList.add(product);
        product = new Product("4", "2", "Sunscreen", "SPF 50", "88 ml", "$ ", "25", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/sunscreen-image.png");
        productList.add(product);
        product = new Product("5", "3", "Shampoo", "Damage Repair", "250 ml", "$ ", "10", "10% OFF", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/shampoo-image.png");
        productList.add(product);
        product = new Product("6", "3", "Conditioner", "Color Protect", "250 ml", "$ ", "12", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/conditioner-image.png");
        productList.add(product);
        product = new Product("7", "4", "Perfume", "Floral Essence", "50 ml", "$ ", "45", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/perfume-image.png");
        productList.add(product);
        product = new Product("8", "4", "Deodorant", "Fresh Mint", "150 ml", "$ ", "5", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/deodorant-image.png");
        productList.add(product);
        product = new Product("9", "5", "Nail Polish", "Cherry Red", "10 ml", "$ ", "8", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/nailpolish-image.png");
        productList.add(product);
        product = new Product("10", "5", "Nail Polish Remover", "Quick Clean", "100 ml", "$ ", "4", "15% OFF", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04//nailpolishremover-image.png");
        productList.add(product);
        product = new Product("11", "6", "Makeup Brushes", "Full Set", "1 Set", "$ ", "50", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/makeupbrushes-image.png");
        productList.add(product);
        product = new Product("12", "6", "Beauty Blender", "Pink", "1 Unit", "$ ", "7", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/beautyblender-image.png");
        productList.add(product);
        return productList;
    }

    public List<Product> getNewList() {
        Product product = new Product("1", "1", "Mascara", "Volume Boost", "10 ml", "$ ", "25", "10% OFF", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/mascara.png");
        newList.add(product);
        product = new Product("2", "1", "Eyeliner", "Waterproof Black", "5 ml", "$ ", "15", "20% OFF", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/eyeliner-image.png");
        newList.add(product);
        product = new Product("3", "2", "Facial Cleanser", "Gentle Hydrating", "150 ml", "$ ", "18", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/facial-cleanser-image.png");
        newList.add(product);
        product = new Product("4", "2", "Face Mask", "Clay Detox", "50 ml", "$ ", "22", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/face-mask-image.png");
        newList.add(product);
        product = new Product("5", "3", "Hair Serum", "Frizz Control", "100 ml", "$ ", "20", "15% OFF", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/hair-serum-image.png");
        newList.add(product);
        return newList;
    }

    public List<Product> getPopularList() {
        Product product = new Product("6", "1", "Highlighter", "Golden Glow", "10 g", "$ ", "30", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/highlighter-image.png");
        popularList.add(product);
        product = new Product("7", "1", "Compact Powder", "Ivory", "15 g", "$ ", "22", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/compact-powder-image.png");
        popularList.add(product);
        product = new Product("8", "2", "Anti-Aging Cream", "Night Repair", "50 ml", "$ ", "45", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/anti-aging-cream-image.png");
        popularList.add(product);
        product = new Product("9", "2", "Toner", "Rose Water", "100 ml", "$ ", "18", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/toner-image.png");
        popularList.add(product);
        product = new Product("10", "3", "Hair Mask", "Keratin Therapy", "200 ml", "$ ", "25", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/hair-mask-image.png");
        popularList.add(product);
        product = new Product("11", "3", "Hair Spray", "Strong Hold", "250 ml", "$ ", "20", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/hair-spray-image.png");
        popularList.add(product);
        product = new Product("12", "4", "Body Mist", "Aqua Kiss", "150 ml", "$ ", "15", "", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/body-mist-image.png");
        popularList.add(product);
        product = new Product("13", "5", "Nail Art Kit", "Professional Set", "1 Set", "$ ", "50", "10% OFF", "https://projectmc73.wordpress.com/wp-content/uploads/2024/04/nail-art-kit-image.png");
        popularList.add(product);
        return popularList;
    }

    public List<Offer> getOfferList() {
        Offer offer = new Offer("https://projectmc73.wordpress.com/wp-content/uploads/2024/04/cosmetics-sale-event.jpg");
        offerList.add(offer);
        offer = new Offer("https://projectmc73.wordpress.com/wp-content/uploads/2024/04/makeup-summer-sale.WEBP");
        offerList.add(offer);
        offer = new Offer("https://projectmc73.wordpress.com/wp-content/uploads/2024/04/skincare-discount-week.jpg");
        offerList.add(offer);
        offer = new Offer("https://projectmc73.wordpress.com/wp-content/uploads/2024/04/perfume-launch-offer.jpg");
        offerList.add(offer);
        offer = new Offer("https://projectmc73.wordpress.com/wp-content/uploads/2024/04/nail-product-promotion.jpg");
        offerList.add(offer);
        offer = new Offer("https://projectmc73.wordpress.com/wp-content/uploads/2024/04/haircare-special.jpg");
        offerList.add(offer);

        return offerList;
    }
}
