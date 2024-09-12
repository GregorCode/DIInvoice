package com.curso.springboot.di.factura.springboot_difactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.di.factura.springboot_difactura.models.Client;
import com.curso.springboot.di.factura.springboot_difactura.models.Invoice;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show() {
        
        Client client = new Client();
        client.setName(invoice.getClient().getName());
        client.setLastName(invoice.getClient().getLastName());

        Invoice inv = new Invoice();
        inv.setClient(client);
        inv.setDescription(invoice.getDescription());
        inv.setItems(invoice.getItems());

        return inv;
    }

    @GetMapping("/example")
    public String example () {
        return "hola como estas";
    }
    
}
