package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNpm("19630172");
        mahasiswa.setNama("Mutora");
        mahasiswa.setTanggallahir(simpleDateFormat.parse("23-09-2001"));

        System.out.println("Nama \t\t\t : " + mahasiswa.getNama());
        System.out.println("NPM \t\t\t : " + mahasiswa.getNpm());
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.getTanggallahir()));
        System.out.println("Usia : \t\t\t : " + mahasiswa.hitungUsia() + " Tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNpm("19630182");
        mahasiswa2.setNama("Paijo");
        mahasiswa2.setTanggallahir(simpleDateFormat.parse( "23-10-2000"));

        System.out.println("Nama \t\t\t : " + mahasiswa2.getNama());
        System.out.println("NPM \t\t\t : " + mahasiswa2.getNpm());
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.getTanggallahir()));
        System.out.println("Usia : \t\t\t : " + mahasiswa.hitungUsia() + " Tahun");
    }

}
