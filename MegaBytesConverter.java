package com;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            int MB = kiloBytes / 1024;
            int KB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MB + " MB and " + KB + " KB");
        }
    }
}
