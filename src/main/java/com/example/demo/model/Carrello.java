package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "carrello")
@Data
public class Carrello {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrello")
    private Integer idCarrello;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_di_vendita")
    private Date dataVendita;

    @JoinColumn(name = "id_anagrafica_clienti")
    @ManyToOne
    @JsonIgnoreProperties("anagrafica_clienti")
    private Clienti clienti;

}
