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
public class Enkapsulasi {
    //deklarasi atribut
private String nama;
private int id;
private int umur;
 //getter
public int getUmur ()
{
return umur;
}
 
public String getNama ()
{
return nama;
}
 
public int getID()
{
return id;
}
//setter
public void setUmur (int umurBaru)
{
umur = umurBaru;
}
public void setNama (String namaBaru)
{
nama = namaBaru;
}
 
public void setID (int idBaru)
{
id = idBaru;
 }

}
