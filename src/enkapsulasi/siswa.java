/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author MOKLET-1
 */
public class siswa {
    public static void main (String args[]) {
//membuat objek dari class
  Enkapsulasi data = new Enkapsulasi ();
  data.setNama ("Anto");
  data.setUmur (17);
  data.setID (1234);
 
  System.out.println ("Nama : "+ data.getNama ());
  System.out.println("Umur  : "+data.getUmur());
  System.out.println("ID    : "+data.getID());
    }
 }
    

