/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
        
{
 
    public enum Day
    {

        /**
         *
         */
    ONE("Monday"),TWO("Tuesday"),THREE("Wednesday"),FOUR("Thursday"),FIVE("Friday"),SIX("Saturday"),
    SEVEN("Sunday");

        
      private final String SK;

        Day(String SK) {
            this.SK = SK;
        }

        public String getName() {
            return SK;
        }

        boolean getSK() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private final Day day;

    public Weekdays (Day day)
    {
    this.day = day;}
    
    public Day getDay()
    {return this.day;}
    
    public Day setDay(Day day)
    {return this.day;}
    
    
    }
  



