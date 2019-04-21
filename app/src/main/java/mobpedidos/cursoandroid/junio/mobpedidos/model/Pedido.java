package mobpedidos.cursoandroid.junio.mobpedidos.model;

import java.util.Date;

public class Pedido {

    private int id;
    private Date data;
    private String tipo; //pedido/orcamento
    private int idCliente;
    private int idVendedor;
    private String usuario;
    private Double valor;
    private Double desconto;
    private Double total;
    private int idFormaPagto;

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getUsuario() {
        return usuario;
    }

    public Double getValor() {
        return valor;
    }

    public Double getDesconto() {
        return desconto;
    }

    public Double getTotal() {
        return total;
    }

    public int getIdFormaPagto() {
        return idFormaPagto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataEmissao(Date data) {
        this.data = data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setIdFormaPagto(int idFormaPagto) {
        this.idFormaPagto = idFormaPagto;
    }
}
