package me.kktrkkt.springbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("book")
public class BookProperties {
    private String title;

    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
