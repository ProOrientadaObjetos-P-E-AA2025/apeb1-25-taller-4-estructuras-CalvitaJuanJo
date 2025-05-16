public class VentaProducto {
    private double precio;
    private int cantidad;
    public VentaProducto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double calcularDescuento() {
        if (precio >= 1000 && cantidad >= 10) {
            return 0.10;
        } else if (precio < 1000) {
            return 0.05; 
        } else
        return 0;
    }
    public double calcularPrecioFinal() {
        double descuento = calcularDescuento();
        double totalSinDescuento = precio * cantidad;
        double montoDescuento = totalSinDescuento * descuento;
        return totalSinDescuento - montoDescuento;
    }
}