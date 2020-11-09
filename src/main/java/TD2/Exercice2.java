public class Exercice2{
   
    public static void Question1() 
    {

     Paire<Integer, Integer> x = new Paire<>(90,10);
     Paire<Integer, Integer> y = new Paire<>(300,160);
     Paire<Integer, Integer> z = new Paire<>(150,50);

     Predicate<Integer> TailleTropPetite = x -> x < 100;
     TailleTropPetite.test(x.fst);//Tester Taille
     
     Predicate<Integer> TailleTropGrande = y -> y > 200;
     TailleTropPetite.test(y.fst);//Tester Taille

     Predicate<Integer> TailleIncorrect = z ->{
         if(negate (Predicate<Integer> TailleTropPetite  && Predicate<Integer> TailleTropGrande))
           return false;
         else 
           return true;   
       };
     TailleIncorrect.test(x.fst);//Tester Taille

     Predicate<Integer> TailleCorrect = z ->{
       if(negate  (Predicate<Integer> TailleTropPetite  && Predicate<Integer> TailleTropGrande))
          return true;
       else 
         return false;   
     };
     TailleCorrect.test(z.fst);//Tester Taille

     Predicate<Integer> PoidsLourd = y -> y > 150;
     TailleTropPetite.test(x.snd);//Tester Poids

     Predicate<Integer> PoidsIncorrect = z ->{
        if(negate (Predicate<Integer> PoidsLourd))
           return false;
        else 
          return true;   
      };
      PoidsIncorrect.test(x.snd);//Tester Poids

      Predicate<Integer> PoidsCorrect = z ->{
        if(negate (Predicate<Integer> PoidsLourd))
           return true;
        else 
          return false;   
      };
      PoidsCorrect.test(z.snd);//Tester Poids

 }

 public static void Question2_filtragePredicatif(Predicate<T> clients, List<T> elements) 
 {
    for(T e : elements)
     {
        for(T p : clients)
        {
        if ((Predicate<p>) && (Predicate<p1>))
          System.out.println(e);
        }

     }
 }
 
 }