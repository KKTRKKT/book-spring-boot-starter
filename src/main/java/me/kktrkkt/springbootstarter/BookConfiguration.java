package me.kktrkkt.springbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BookProperties.class)
public class BookConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Book book(BookProperties properties){
        Book book = new Book();
        book.setTitle(properties.getTitle());
        book.setPrice(properties.getPrice());
        return book;
    }
}
