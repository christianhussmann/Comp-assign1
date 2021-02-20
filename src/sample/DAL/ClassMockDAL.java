package sample.DAL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.BE.CurrentClass;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class ClassMockDAL {


    public static ObservableList<CurrentClass> loadClasses() {
        return getCurrentClasses();
    }

    static ObservableList<String> getSubjects() {

        ObservableList<String> subjects = FXCollections.observableArrayList();
        subjects.add("SCO");
        subjects.add("DBOS");
        subjects.add("SDE");
        subjects.add("ITO");
        return subjects;

    }


    static ObservableList<CurrentClass> getCurrentClasses() {
        ObservableList<CurrentClass> allCurrentClasses = FXCollections.observableArrayList();

        CurrentClass cc1 = new CurrentClass(2,"CSe_20A", "Datamatiker", getSubjects());
        allCurrentClasses.add(cc1);
        CurrentClass cc2 = new CurrentClass(2,"CSe_20A", "Datamatiker", getSubjects());
        allCurrentClasses.add(cc2);
        CurrentClass cc3 = new CurrentClass(2,"CSe_20A", "Datamatiker", getSubjects());
        allCurrentClasses.add(cc3);
        CurrentClass cc4 = new CurrentClass(2,"CSe_20A", "Datamatiker", getSubjects());
        allCurrentClasses.add(cc4);
        return allCurrentClasses;
    }

}
