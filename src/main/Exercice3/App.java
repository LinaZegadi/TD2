package Exercice3;

public class App {

    Predicate<Etudiant> tousLesEtudiants = new Predicate<Etudiant>() {
        public boolean test(Etudiant t) {
            return true;
        }
    };

    void afficheSi(String s, Predicate<Etudiant> p, Annee a) {

        System.out.println(tring.format("** %s", s));
        for (Etudiant e : annee.etudiants()) {
            if (condition.test(e)) {
                System.out.println(e);

            }
        }

        System.out.println(tring.format("** %s", s));
        annee.etudiant().forEach(e -> {
            if (condition.test(e)) {
                System.out.println(e);

            }

        });

    }

    Predicate<Etudiant> aDEF = (Etudiant etudiant) -> {

        for (Etudiant e : notes.etudiants()) {
            if (etudiant.notes == null)
                return true;
            else
                return false;
        }
    };

    Predicate<Etudiant> aNoteEliminatoire = (Etudiant etudiant) -> {
        if (etudiant.notes <= 6)
            return true;
        else
            return false;
    };

    Moyenne<Etudiant, Moyenne> MoyenneEtudiant = x -> {
        if (aDEF == true) {
            System.out.println("Cet Etudiant est défaillant");
        } else {
            for (int i; i < notes.length; i++) {
                int cmpt = 0;
                double result = 0;
                result = result + notes();
                cmpt++;
            }

            return result / cmpt;
        }
    };

    Predicate<Etudiant> naPasLaMoyennev1 = (Etudiant etudiant) -> {
        if (MoyenneEtudiant < 10) {
            System.out.println("Cet Etudiant n'a pas la moyenne");
            return true;
        } else {
            System.out.println("Cet Etudiant a la moyenne");
            return false;
        }
    };

    Predicate<Etudiant> naPasLaMoyennev2 = (Etudiant etudiant) -> {
        if (aDEF == true) {
            System.out.println("Cet Etudiant est défaillant");
            return true;
        }

        if (MoyenneEtudiant < 10) {
            System.out.println("Cet Etudiant n'a pas la moyenne");
            return true;
        } else {
            System.out.println("Cet Etudiant a la moyenne");
            return false;
        }
    };

    Predicate<Etudiant> session2v1 = (Etudiant etudiant) -> {
        if (((naPasLaMoyennev2 == false) && (naPasLaMoyennev1 == false)) || (aDEF == true)
                || (aNoteEliminatoire == true)) {

            System.out.println("Cet Etudiant passe en session 2");
            return true;

        } else {
            System.out.println("Cet Etudiant ne passe pas en session 2");
            return false;

        }
    };

    void afficheSiv2(Etudiant e) {

        System.out.println("**Tous les etudiants");

        for (Etudiant e : annee.etudiants()) {
            System.out.println(e);
            System.out.println(e.Moyenne);

        }
    }

    Moyenne<Etudiant, Moyenne> moyenneIndicative = x -> {

        for (int i; i < e.notes.length; i++) {
            if (e.notes == null)
                e.notes = 0;
        }
        afficheSiv2(e);
    };

    Moyenne<Etudiant, Moyenne> naPasLaMoyenneGeneralise = x -> {
        Predicate<Etudiant> condition;
        Etudiant e;

        if (condition.test(e))
            afficheSiv2(e);

    };

    public static void afficheToujours(String entete, Annee annee) {
        afficheSi(entete, e -> true, annee);
    }

    public static final Predicate<Etudiant> toujours = x -> true;

    public static final Set<Matiere> toutesLesMatieresDeLAnnee(Annee a) {
        Set<Matiere> rtr = new HashSet<>();
        for (UE ue : a.uses()) {
            for (Matiere m : ue.ects().keySet()) {
                rtr.add(m);
            }
        }
        return rtr;
    }

    public static void Questions() {

        Matiere m1 = new Matiere("MAT1");
        Matiere m2 = new Matiere("MAT2");
        UE ue1 = new UE("UE1", Map.of(m1, 2, m2, 2));
        Matiere m3 = new Matiere("MAT3");
        UE ue2 = new UE("UE2", Map.of(m3, 1));
        Annee a1 = new Annee(Set.of(ue1, ue2));
        Etudiant e1 = new Etudiant("39001", "Alice", "Merveille", a1);
        e1.noter(m1, 12.0);
        e1.noter(m2, 14.0);
        e1.noter(m3, 10.0);
        System.out.println(e1);
        Etudiant e2 = new Etudiant("39002", "Bob", "Eponge", a1);
        e2.noter(m1, 14.0);
        e2.noter(m3, 14.0);
        Etudiant e3 = new Etudiant("39003", "Charles", "Chaplin", a1);
        e3.noter(m1, 18.0);
        e3.noter(m2, 5.0);
        e3.noter(m3, 14.0);

        // Test
        Predicate<Etudiant> tousLesEtudiants = etudiant -> true;
        afficheSi("Tous les etudiant", tousLesEtudiants, a1);
        afficheSi(e1.nom, tousLesEtudiants, a1);
        afficheSi(e2.nom, tousLesEtudiants, a1);
        afficheSi(e3.nom, tousLesEtudiants, a1);

        Predicate<Etudiant> aDEF = estDef -> true;
        afficheSi("Etudiant Deffaillant", aDEF, a1);

        Predicate<Etudiant> aNoteEliminatoire = noteElim -> true;
        afficheSi("Il y'a une note eleminatoire", aNoteEliminatoire, a1);

        Predicate<Etudiant> naPasLaMoyennev1 = PasMoy1 -> true;
        afficheSi("Pas de moyenne", naPasLaMoyennev1, a1);

        Predicate<Etudiant> naPasLaMoyennev2 = PasMoy2 -> true;
        afficheSi("Pas de moyenne", naPasLaMoyennev2, a1);

        Predicate<Etudiant> session2v1 = sess2 -> true;
        afficheSi("Pas de moyenne", session2v1, a1);

    }

    // Main
    public static void main(String[] args) {
        Questions();
    }

}
