package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
        bukuNovel bukuDune = new bukuNovel("Dune", "Frank Herbert", "2022", "Sci-fi", 200, 100000);
        bukuDune.view();
        bukuAkademik cararadiant = new bukuAkademik("Radiant", "Tenz", "2013", "Game", 559, 50000);
        cararadiant.view();
    }
}