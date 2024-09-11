package com.curso.springboot.di.factura.springboot_difactura;

import java.util.List;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
///import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean("default")
    List<Item> itemsInvoice() {
        return Arrays.asList(
            new Item(new Product("Pesa Rusa", 100), 2), 
            new Item(new Product("Barra Olimpica", 1000), 1), 
            new Item(new Product("TRX", 50), 3)
        );
    }

    //@Primary
    @Bean
    List<Item> itemsInvoiceOficina() {
        return Arrays.asList(
            new Item(new Product("Monitor Asus", 650), 1), 
            new Item(new Product("Teclado Thermaltake", 300), 1), 
            new Item(new Product("Mouse Gamer Logitech", 400), 1),
            new Item(new Product("Impresora HP", 500), 1)
        );
    }
}
