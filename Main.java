import java.util.*;

    public class Main {
        public static void main(String [] args) {
            SinglyLinkedList<Pegawai> pegawai = new SinglyLinkedList<>("Data Pegawai");
            Scanner input = new Scanner(System.in);
            boolean out = false;

            while (!out) {
                System.out.println("Pilih Menu");
                System.out.println("1. Input Data");
                System.out.println("2. Hapus Data");
                System.out.println("3. Cetak List Pegawai");
                System.out.println("4. Keluar");
                int masukkan = input.nextInt();

                switch (masukkan) {
                    case 1:
                        System.out.println("Masukkan data pegawai berikut: ");
                        System.out.println("NAMA: ");
                        String nama = input.next();
                        System.out.println("NIP: ");
                        String nip = input.next();
                        System.out.println("Divisi: ");
                        String divisi = input.next();
                        System.out.println("Tambahkan Data pada: ");
                        System.out.println("1. Awal Data");
                        System.out.println("2. Akhir Data");
                        int insertFrontOrBack = input.nextInt();
                        if (insertFrontOrBack == 1) {
                            pegawai.insertAtFront(new Pegawai(nama, nip, divisi));
                        }

                        else if (insertFrontOrBack == 2) {
                            pegawai.insertAtBack(new Pegawai(nama, nip, divisi));
                        }

                        else {
                            System.out.println("Menu Tidak ada");
                            System.out.println();
                        }
                    break;

                    case 2:
                        System.out.println("Menghapus Data");
                        System.out.println("1. Awal Data");
                        System.out.println("2. Akhir Data");
                        int RemoveFrontOrBack = input.nextInt();
                        if (RemoveFrontOrBack == 1) {
                            pegawai.removeFromFront();
                        }

                        else {
                            System.out.println("Tidak Tersedia");
                            System.out.println();
                        }

                    break;

                    case 3:
                        pegawai.print();
                        System.out.println();
                    break;

                    case 4:
                        out = true;
                    break;

                    default:
                        System.out.println("Menu Tidak Ada");
                        System.out.println();
                }
            }

        }
    }
