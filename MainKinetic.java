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

    public double massa; double kecepatan; double ek;
    
    public void setMassa(double massa) {
        this.massa = massa;
    }
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double getMassa() {
        return this.massa;
    }
    
    public double getKecepatan() {
        return this.kecepatan;
    }
    
    public double Ek(double massa, double kecepatan) {        
        return (massa * (kecepatan * kecepatan)) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainKinetic mainVar = new MainKinetic();
        
        System.out.print("Masukkan massa benda : ");
        mainVar.setMassa(scanner.nextDouble());

        System.out.print("Masukkan kecepatan benda : ");
        mainVar.setKecepatan(scanner.nextDouble());
        
        double result = mainVar.Ek(mainVar.getMassa(), mainVar.getKecepatan());

        System.out.println("Massa benda adalah " + mainVar.getMassa());
        System.out.println("Kecepatan benda adalah " + mainVar.getKecepatan());
        System.out.println("Hasil perhitungan = " + result);
        
        scanner.close();
        
    }
}
