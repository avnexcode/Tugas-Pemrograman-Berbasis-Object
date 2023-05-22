/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W4Encapsulation;
import java.util.*;
/**
 *
 * @Author Muhammad Fauzi Nur Aziz
 * @NIM 22104410046
 * @Prodi Teknik Informatika - Universitas Islam Balitar
 */
public class MainKinetic {

    public double m; double v;
    
    public void setM(double m) {
        this.m = m;
    }
    
    public void setV(double v) {
        this.v = v;
    }
    
    public double getM() {
        return this.m;
    }
    
    public double getV() {
        return this.v;
    }
    
    public double Ek(double m, double v) {        
        return 0.5 * m * Math.pow(v, 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainKinetic mainVar = new MainKinetic();
        
        System.out.print("Masukkan massa benda : ");
        mainVar.setM(scanner.nextDouble());

        System.out.print("Masukkan kecepatan benda : ");
        mainVar.setV(scanner.nextDouble());

        double result = mainVar.Ek(mainVar.getM(), mainVar.getV());

        System.out.println("Massa benda adalah " + mainVar.getM());
        System.out.println("Kecepatan benda adalah " + mainVar.getV());
        System.out.println("Hasil perhitungan = " + result);
        
        scanner.close();
    }
}
