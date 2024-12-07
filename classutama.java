public class classutama {
    public static void main(String[] args) {
        Operasi operasi = new Operasi();

        operasi.sisip(10);
        operasi.sisip(20);
        operasi.sisip(30);
        System.out.println("setelah menambahkan elemen 10,20,30:");
        operasi.tampil();

        operasi.sisip_posisi(5, 1);
        System.out.println("setelah menyisipkan 5 di posisi 1:");
        operasi.tampil();

        operasi.sisip_posisi(5, 0);
        System.out.println("setelah menyisipkan 5 di posisi 0:");
        operasi.tampil();

        operasi.hapus(2);
        System.out.println("setelah menghapus elemen di posisi 2:");
        operasi.tampil();

        operasi.hapus(0);
        System.out.println("setelah menghapus elemen di posisi 0:");
        operasi.tampil();

        operasi.hapus(10);
    }
}