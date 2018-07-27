/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LabingXEON
 */
public class BD {
private ArrayList<persona> personas;
    public BD() {
   this.personas=new ArrayList<>();
    this.personas.add(new persona("jordan","G"));
    this.personas.add(new persona("jor","A"));
    this.personas.add(new persona("j","x"));
    
    }
  
   public void addp(persona persona){
       this.personas.add(persona);
   }
   
   
   public ArrayList<persona> getP(){
       return personas;
   }
   
}
