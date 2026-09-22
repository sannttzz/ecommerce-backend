package br.edu.unifio.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.repositorios.ItemPedidoRepositorio;

@SpringBootTest 
public class ItemPedidoRepositorioTests {

    @Autowired 
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Test 
    public void deveBuscarUmItemPedidoPorId (){
        var itemPedido = itemPedidoRepositorio.findById(Integer.parseInt("1")).orElseThrow();

        assertNotNull(itemPedido);
        assertEquals( 2, itemPedido.getQuantidade());
    }

}