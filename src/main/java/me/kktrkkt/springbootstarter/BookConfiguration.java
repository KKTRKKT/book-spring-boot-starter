package me.kktrkkt.springbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Book book(){
        Book book = new Book();
        book.setTitle("스프링부트");
        book.setPrice(15000);
        return book;
    }
}
