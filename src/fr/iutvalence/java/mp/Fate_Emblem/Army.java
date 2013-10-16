package fr.iutvalence.java.mp.Fate_Emblem;
/**
 * the army class composed by some units and one hero
 * @author rivallu
 *
 */

public class Army
{
 // it's the board for the army
 public Unit[] army;
 //it's the variable for the hero 
  public Unit hero;
  public Army(Unit hero)
  {
     Army army[]= new Army[19];
     this.hero= hero;
     for (int i=0;i<20;i++)
     {
         army[i]=Villager();
     }
  }

}
