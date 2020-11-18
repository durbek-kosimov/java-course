package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) throws IOException {
        String inFileName = "/home/dmint/IdeaProjects/MD/randSeedP.d";
        String outFileName = "/home/dmint/IdeaProjects/MD/reRandSeedP.dat";

        File inFile = new File(inFileName);
        File outFile1 = new File(outFileName);
        BufferedReader in = new BufferedReader(new FileReader(inFile));
        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter(outFile1)));

        String line;
        String[] words = null;

        while ((line = in.readLine()) != null) {
            line = line.trim();
            words = line.split(" ");
            out1.printf("%s %s %s\n", words[1], words[2], words[3]);
        }
        in.close();
        out1.close();
    }
}
