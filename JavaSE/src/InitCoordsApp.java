package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.io.*;

public class InitCoordsApp {
    public static void main(String[] args) throws IOException {
        File outFile = new File("coords.d");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
        int nMol;
        double dispHi;
        boolean nebrNow = true;
        double density = 0.8, rCut;
        double rNebrShell = 0.4;
        int N_OFFSET = 14;
        int nebrTabLen;
        int[][] OFFSET_VALLS = {{0, 0, 0}, {1, 0, 0}, {1, 1, 0}, {0, 1, 0}, {-1, 1, 0},
                {0, 0, 1}, {1, 0, 1}, {1, 1, 1}, {0, 1, 1}, {-1, 1, 1},
                {-1, 0, 1}, {-1, -1, 1}, {0, -1, 1}, {1, -1, 1}};
         
        ArrayList<Mol> mol = new ArrayList<>();

        InitUcell initUcell = new InitUcell();
        initUcell.x = 5;
        initUcell.y = 5;
        initUcell.z = 5;

        Region region = new Region(density, initUcell);
        System.out.printf("region = %f %f %f\n", region.x, region.y, region.z);
        Gap gap = new Gap(region, initUcell);
//        nMol = 8 * initUcell.volume();
        nMol = initUcell.volume();
        int nebrTabMax = 8 * nMol;
        int sizeNebrTab = 2 * nebrTabMax;
        int[] nebrTab = new int[sizeNebrTab];
        
        Coords coords = new Coords();

//        int nn = nMol / 8;
//        out.printf("%s\nC\n", Integer.toString(nMol));
        System.out.println("nMol = " + nMol);
        rCut = Math.pow(2., 1./6.);
        System.out.println("rCut = " + rCut);
        Cells cells = new Cells(rCut, rNebrShell, region); // 3 3 3
        System.out.printf("cells = %d %d %d\n", cells.x, cells.y, cells.z);
        int n = 0;

        for (int nz = 0; nz < initUcell.z; nz ++) {
            for (int ny = 0; ny < initUcell.y; ny ++) {
                for (int nx = 0; nx < initUcell.x; nx ++) {
                    coords.setInitCoords(nx + 0.5, ny + 0.5, nz + 0.5);
                    coords.setCoordsGap(gap);
                    coords.setCoordsRegion(-0.5, region);
                    mol.add(new Mol());
                    mol.get(n).r.x = coords.x;
                    mol.get(n).r.z = coords.z;
                    mol.get(n).r.y = coords.y;
                    System.out.printf("%s %f %f %f\n", 'C', mol.get(n).r.x, mol.get(n).r.y, mol.get(n).r.z);
//                    out.printf("%s %f %f %f\n", 'C', mol.get(n).r.x, mol.get(n).r.y, mol.get(n).r.z);
                    n ++;
                }
            }
        }
        SetParams setParams = new SetParams();
        int sizeCellList = setParams.VProdI(cells) + nMol;
//        System.out.println("sizeCellList = " + sizeCellList);
//        int sizeNebrTab = 2 * nebrTabMax;
//        ArrayList<Integer> cellList = new ArrayList<Integer>();
        int[] cellList = new int[sizeCellList];
        if (nebrNow) {
            nebrNow = false;
            dispHi = 0.;
            VecR dr, invWid, rs, shift;
            VecI cc, m1v, m2v;
            setParams.VSet(0, 0, 0);
            m2v = setParams.d;
            double rrNebr;
            int c, m1, m2, offset;
            rrNebr = (rCut + rNebrShell) * (rCut + rNebrShell);
            System.out.println("rrNebr = " + rrNebr);
            setParams.VDiv(cells, region);
            invWid = setParams.r; // 0.56 0.56 0.56
            System.out.printf("invWid = %f %f %f\n", invWid.x, invWid.y, invWid.z);
            for (int m = nMol; m < nMol + setParams.VProdI(cells); m++) {
                cellList[m] = -1; // cellList[n] [0-124] = 0, [125-153] = -1
//                out.printf("%d\n", cellList[n]/*, cellList[c]*/); // cellList.d
            }

//            for (int k = 0; k < nMol + setParams.VProdI(cells); k ++)
//                out.printf("%d\n", cellList[k]/*, cellList[c]*/); // cellList.d
            for (int m = 0; m < nMol; m++) {
                setParams.addRegion(mol.get(m).r, 0.5, region);
                rs = setParams.r; // rs = 0.56 0.56 0.56
//                out.printf("rs = %f %f %f\n", rs.x, rs.y, rs.z); // cellList.d
                setParams.VMulI(rs, invWid);
                cc = setParams.d; // cc = 0 0 0
                c = setParams.setLinear(cc, cells) + nMol; // c = 125
//                out.printf("c = %d\n", c); // cellList.d
                cellList[m] = cellList[c];
                cellList[c] = m;
//                out.printf("cellList M = %d\t cellList C = %d\n", cellList[m], cellList[c]); // cellList.d
//                out.printf("cellList C = %d\n", cellList[c]); // cellList.d
            }
            nebrTabLen = 0;
            for (int m1z = 0; m1z < cells.z; m1z++) {
                for (int m1y = 0; m1y < cells.y; m1y++) {
                    for (int m1x = 0; m1x < cells.x; m1x++) {
                        setParams.VSet(m1x, m1y, m1z);
                        m1v = setParams.d;//27* x y z - builds 3 dimentional cube of 3x3
//                        System.out.printf("m1v = %d %d %d\n", m1v.x, m1v.y, m1v.z);
//                        out.printf("m1v = %d %d %d\n", m1v.x, m1v.y, m1v.z); // cellList.d
//                            break;
                        m1 = setParams.setLinear(m1v, cells) + nMol; //m1 = (125, 151)
//                        out.printf("m1 = %d\n", m1); // cellList.d
                        for (offset = 0; offset < N_OFFSET; offset++) {
                            for (int w = 0; w < 3; w++) {
                                if (w == 0) {
                                    m2v.x = m1v.x + OFFSET_VALLS[offset][w];
                                    out.printf("m2v.x = %d\n", m2v.x); // cellList.d
//                                }
//                                else if (w == 1)
//                                    m2v.y = m1v.y + OFFSET_VALLS[offset][w];
//                                else if (w == 2)
//                                    m2v.z = m1v.z + OFFSET_VALLS[offset][w];
//                            }
//                                System.out.printf("m2v = %d %d %d\n", m2v.x, m2v.y, m2v.z);
//                                out7.printf("m2v = %d %d %d\n", m1v.x, m1v.y, m1v.z); // cellList.d
//                            setParams.setZeroR();
//                            shift = setParams.r;
//                            cellWrapAll.cellWrapAllI(m2v, cells);
//                            m2v = cellWrapAll.m2;
//                            cellWrapAll.cellWrapAllIR(m2v, region);
//                            shift = cellWrapAll.shif;
//                                out7.printf("m2v = %d %d %d\tshift = %f %f %f\n", m2v.x, m2v.y, m2v.z,
//                                        shift.x, shift.y, shift.z); // cellList.d
//                            m2 = setParams.setLinear(m2v, cells) + nMol;
//                                out7.printf("m2 = %d\n", m2); // cellList.d
//                            for (int j1 = cellList[m1]; j1 >= 0; j1 = cellList[j1]) {
//                                for (int j2 = cellList[m2]; j2 >= 0; j2 = cellList[j2]) {
//                                    if (m1 != m2 || j2 < j1) {
//                                        setParams.VSub(mol.get(j1).r, mol.get(j2).r);
//                                        dr = setParams.r;
//                                        setParams.VVSub(shift);
//                                        dr = setParams.r;
//                                            System.out.printf("dr = %f %f %f\n", dr.x, dr.y, dr.z);
//                                        double dx = setParams.vLenSq(dr);
//                                        System.out.println("dx = " + dx);
//                                        if (dx < rrNebr) {
//                                            if (nebrTabLen >= nebrTabMax)
//                                                System.out.println("ERROR TOO MANY MEMBERS!!!");
//                                            nebrTab[2 * nebrTabLen] = j1;
//                                            nebrTab[2 * nebrTabLen + 1] = j2;
//                                            System.out.printf("%d nebrTab[j1] = %d\tnebrTab[j2] = %d\n",
//                                                    nebrTabLen, nebrTab[2 * nebrTabLen], nebrTab[2 * nebrTabLen + 1]);
                                            ++nebrTabLen;
//                                        }
//                                    }
//                                }
//                            }
//                        }
                    }
                }
            }
        }
//        int dd = (int) (0.56 * 0.56);
//        System.out.println("mul 2 doubles = " + dd);
        out.close();
    }
}
