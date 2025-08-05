import java.util.Scanner;

public class BelanjaBarangAulia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Barang 1:");
        String namaBarang1 = input.nextLine();

        System.out.println("Masukkan Harga Barang:");
        int jumlahBarang1 = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Nama Barang 2:");
        String namaBarang2 = input.nextLine();

        System.out.println("Masukkan Harga Barang 2:");

        double jumlahBarang2 = input.nextDouble();

        System.out.println("==========================");
        System.out.println("Barang yag dibeli " + namaBarang1 + " dan " + namaBarang2);
        System.out.println("Harga: " + jumlahBarang1 + " dan " + jumlahBarang2);

        input.close();
        System.out.println("==========================");
    }
}
