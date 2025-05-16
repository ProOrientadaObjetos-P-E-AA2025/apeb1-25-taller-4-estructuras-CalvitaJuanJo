import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        double precio, porcentajeDescuento, precioFinal;
        int cantidad;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.print("Ingrese el número de productos: ");
        cantidad = scanner.nextInt();
        VentaProducto venta = new VentaProducto(precio, cantidad);
        porcentajeDescuento = venta.calcularDescuento() * 100;
        precioFinal = venta.calcularPrecioFinal();
        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.println("Precio final de la compra: $" + precioFinal);
    }
}

