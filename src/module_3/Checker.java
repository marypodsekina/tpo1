package module_3;

public class Checker {
    static String checkIfNear(Human h, Thing t){

        if((h.place==null) || (t.place==null)) return "Не возможно определить";
        else if (h.place.compareTo(t.place)==0) return "Человек и объект находятся рядом";
        else return "Человек и объект не рядом";

    }

}
