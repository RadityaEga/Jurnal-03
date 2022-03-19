    public class Pegawai {
        private String nama;
        private String nip;
        private String divisi;

        public Pegawai(String nama, String nip, String divisi) {
            this.nama = nama;
            this.nip = nip;
            this.divisi = divisi;
        }

        public String getnama() {
            return nama;
        }

        public String getnip() {
            return nip;
        }

        public String getdivisi() {
            return divisi;
        }

        @Override
        public String toString() {
            return "(NAMA='" + nama + '\'' +", NIP='" + nip + '\'' +", Divisi='" + divisi + ")";
        }
    }
