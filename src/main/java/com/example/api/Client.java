package com.example.api;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collation = "clientes")
public class Client implements Serializable {

    @Id
    private String Documento;
    private String Tipo_Doc;
    private String Categoria;
    private String mnt_trx_mm;
    private String num_trx;
    private String pct_mnt_tot;
    private String pct_num_trx_tot;

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public String getTipo_Doc() {
        return Tipo_Doc;
    }

    public void setTipo_Doc(String tipo_Doc) {
        Tipo_Doc = tipo_Doc;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getMnt_trx_mm() {
        return mnt_trx_mm;
    }

    public void setMnt_trx_mm(String mnt_trx_mm) {
        this.mnt_trx_mm = mnt_trx_mm;
    }

    public String getNum_trx() {
        return num_trx;
    }

    public void setNum_trx(String num_trx) {
        this.num_trx = num_trx;
    }

    public String getPct_mnt_tot() {
        return pct_mnt_tot;
    }

    public void setPct_mnt_tot(String pct_mnt_tot) {
        this.pct_mnt_tot = pct_mnt_tot;
    }

    public String getPct_num_trx_tot() {
        return pct_num_trx_tot;
    }

    public void setPct_num_trx_tot(String pct_num_trx_tot) {
        this.pct_num_trx_tot = pct_num_trx_tot;
    }
}
