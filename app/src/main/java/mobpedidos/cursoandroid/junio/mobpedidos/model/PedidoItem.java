package mobpedidos.cursoandroid.junio.mobpedidos.model;

public class PedidoItem {
    private int id;
    private int idPedido;
    private int idProduto;
    private Double quantidade;
    private Double valor;
    private Double desconto;
    private Double total;

    public int getId() {
        return id;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public Double getQuantidade() {
        return quantidade;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
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
}
