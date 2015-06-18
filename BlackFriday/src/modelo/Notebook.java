/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jean
 */
public class Notebook {
    private Integer Id;
    private String  Nome;
    private String  Descricao;
    private Double  PrecoNormal;
    private Double  PrecoBF;
    private Boolean destaque;
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Double getPrecoNormal() {
        return PrecoNormal;
    }

    public void setPrecoNormal(Double PrecoNormal) {
        this.PrecoNormal = PrecoNormal;
    }

    public Double getPrecoBF() {
        return PrecoBF;
    }

    public void setPrecoBF(Double PrecoBF) {
        this.PrecoBF = PrecoBF;
    }

    public Boolean getDestaque() {
        return destaque;
    }

    public void setDestaque(Boolean destaque) {
        this.destaque = destaque;
    }
    
    
}
