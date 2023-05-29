# Metrika, pregled i statistička analiza
simple calculator written in Java; supports addition, subtraction, multiplication and division.   
Kompletan projekat poseduje 148 LOC.  
Koristeći ekstenziju Codalyze u okviru VS Studio code razvojnog okruženja, došli smo do zaključka da kongitivna složenost metoda evaluateExpression i Calculate iznosi 12.  
Sudeći da su kongitivna i ciklomatska složenost metrički približne, a neki stručnjaci preporučuju da se ciklomatska složenost drži ispod 10 ili 15, možemo reći da je ovaj projekat razumljiv i lak za održavanje i testiranje.  
# Neformalni pregled fajla Calculator.java
Ovaj fajl je implementacija jednostavnog kalkulatora koji može izvršavati osnovne matematičke operacije (sabiranja, oduzimanja, množenja i deljenja). Napisan je Java programskim jezikom.  
Koristeći ekstenziju SonarLint u okviru VS Studio code razvojnog okruženja, dobili smo predloge o poboljšavanju koda, odnosno popravljanju nedoslednosti i propusta:  

      Ln 1, Col 1 - Move this file to a named package   
      Ln 4, Col 14 - Add a private constructor to hide the implicit public one.class   
      Ln 8, Col 30 - Rename method "ToString" to prevent any misunderstanding/clash with method "toString" defined in superclass "java.lang.Object"    
      Ln 18, Col 30 - Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'*    
      Ln 24, Col 26 - Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'*    
      Ln 70, Col 29 - Immediately return this expression instead of assigning it to the temporary variable "textResult"  
      Ln 74, Col 25 -  Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'.*  
      Ln 183, Col 13 - Remove this redundant jump
     
  
 # Neformalni pregled fajla Start.java
  Ovaj fajl sadrži glavnu metodu 'main' u programskom jeziku Java. Ovaj kod omogućava korisniku da unese matematički izraz koji se prosleđuje metodi 'Run' klase Calculator. Izračunati rezultat se ispisuje na ekran.  
  Koristeći ekstenziju SonarLint u okviru VS Studio code razvojnog okruženja, dobili smo predloge o poboljšavanju koda, odnosno popravljanju nedoslednosti i propusta:   
      
      Ln 1, Col 1 - Move this file to a named package   
      Ln 6, Col 10 - Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'*
      Ln 8, Col 3 - Replace this use of System.out or System.err by a logger   
      Ln 19, Col 5 - Replace this use of System.out or System.err by a logger.  
 

  
  
 

  
