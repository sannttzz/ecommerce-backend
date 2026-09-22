package br.edu.unifio.ecommerce.entidades;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Integer Id;

   private String nome;

   private String descricao;

   private BigDecimal preco;

   private Short estoque;



   @ManyToOne     // Muitas cidades presas em um state
   private Categoria categoria; // categoria_id
   
}
