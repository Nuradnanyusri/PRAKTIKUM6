class Rantai {
    int isi;
    Rantai next;
}

public class Operasi {
    Rantai head;

    public void sisip(int data) {
        Rantai nodeBaru = new Rantai();
        nodeBaru.isi = data;
        nodeBaru.next = null;

        if (head == null) {
            head = nodeBaru;
        } else {
            Rantai nodeBantuan = head;
            while (nodeBantuan.next != null) {
                nodeBantuan = nodeBantuan.next;
            }
            nodeBantuan.next = nodeBaru;
        }
    }

    public void sisip_posisi(int data, int posisi) {
        Rantai nodeBaru = new Rantai();
        nodeBaru.isi = data;
        if (posisi == 0) {
            nodeBaru.next = head;
            head = nodeBaru;
        } else {
            Rantai nodeBantuan = head;
            for (int i = 1; i < posisi && nodeBantuan != null; i++) {
                nodeBantuan = nodeBantuan.next;
            }
            if (nodeBantuan != null) {
                nodeBaru.next = nodeBantuan.next;
                nodeBantuan.next = nodeBaru;
            } else {
                System.out.println("posisi tidak valid");
            }
        }
    }

    public void sisip_depan(int data) {
        Rantai nodeBaru = new Rantai();
        nodeBaru.isi = data;
        nodeBaru.next = head;
        head = nodeBaru;
    }

    public void hapus(int posisi) {
        if (head == null) {
            System.out.println("linked list kosong");
            return;
        }
        if (posisi == 0) {
            head = head.next;
        } else {
            Rantai nodeBantuan = head;
            for (int i = 1; i < posisi && nodeBantuan.next != null; i++) {
                nodeBantuan = nodeBantuan.next;
            }
            if (nodeBantuan.next != null) {
                Rantai nodeHapus = nodeBantuan.next;
                nodeBantuan.next = nodeHapus.next;
            } else {
                System.out.println("psoisi tidak valid");
            }
        }
    }

    public void tampil() {
        if (head == null) {
            System.out.println("linked list kodong!");
            return;
        }
        Rantai nodebantuan = head;
        while (nodebantuan != null) {
            System.out.println(nodebantuan.isi + " ");
            nodebantuan = nodebantuan.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Operasi list = new Operasi();
        list.sisip(10);
        list.sisip(20);
        list.sisip(30);
        list.tampil();
        list.sisip_depan(5);
        list.tampil();
        list.sisip_posisi(15, 2);
        list.tampil();
        list.hapus(2);
        list.tampil();
    }
}