package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialtySet() {
        return specialties;
    }

    public void setSpecialtySet(Set<Specialty> specialtySet) {
        this.specialties = specialtySet;
    }
}
